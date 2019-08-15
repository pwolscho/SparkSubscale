/*
 * Copyright (c) 2019. Hochschule Offenburg. All rights reserved.
 */

package helper;

import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

/**
 * Interface representing a generic data provider used for providing data by reading from a file
 *
 * @author Philip Wolschon - Hochschule Offenburg
 * @author Alexander Bierenstiel - Hochschule Offenburg
 */
public interface IDataProvider
{
	/**
	 * Provides data by reading it from HDFS.
	 *
	 * @return Loaded data from HDFS.
	 */
    Dataset<Row> provideData();
}
