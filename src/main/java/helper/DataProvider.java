/*
 * Copyright (c) 2019. Hochschule Offenburg. All rights reserved.
 */

package helper;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

/**
 * Class implementing a generic data provider interface used for providing data by reading from a
 * file
 *
 * @author Philip Wolschon - Hochschule Offenburg
 * @author Alexander Bierenstiel - Hochschule Offenburg
 */
class DataProvider implements IDataProvider
{
	private final DataProviderOptions options;

	/**
	 * Public constructor for a data provider.
	 *
	 * @param options Contains all necessary objects to get data from HDFS.
	 */
	public DataProvider(DataProviderOptions options)
	{
		this.options = options;
	}

	/**
	 * Provides data by reading it from HDFS.
	 *
	 * @return Loaded data from HDFS.
	 */
	public Dataset<Row> provideData()
	{
		Dataset<Row> dataset = options.getSparkObjects().getSparkSession().read()
			.option("delimiter", options.getDelimiter())
			.schema(buildSchema(options.getNumberOfColumns()))
			.csv(options.getFilePath());

		return dataset;
	}

    /**
     * Builds a schema according to the sample file to load.
     *
     * @return Schema with double type for all columns.
     */
	private String buildSchema(int numberOfColumns)
	{
		String schema = "";

		for (int i = 0; i < numberOfColumns; i++)
		{
			schema += i + " DOUBLE, ";
		}

		return schema.substring(0, schema.length() - 2);
	}
}
