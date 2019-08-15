/*
 * Copyright (c) 2019. Hochschule Offenburg. All rights reserved.
 */

package helper;

/**
 * Class to specify options for the DataProvider.
 *
 * @author Philip Wolschon, Hochschule Offenburg
 * @author Alexander Bierenstiel - Hochschule Offenburg
 */
public class DataProviderOptions
{
	private final String delimiter;
	private final int[] columnsToIgnore;
	private final SparkObjects sparkObjects;
	private final String filePath;
	private final int numberOfColumns;

	/**
	 * Public constructor for the data provider options.
	 *
	 * @param delimiter
	 * @param columnsToIgnore
	 */
	public DataProviderOptions(SparkObjects sparkObjects, String filePath, String delimiter,
		int numberOfColumns, int[] columnsToIgnore)
	{
		this.delimiter = delimiter;
		this.columnsToIgnore = columnsToIgnore;
		this.sparkObjects = sparkObjects;
		this.numberOfColumns = numberOfColumns;
		this.filePath = filePath;
	}

	public String getDelimiter()
	{
		return delimiter;
	}

	public int[] getColumnsToIgnore()
	{
		return columnsToIgnore;
	}

	public SparkObjects getSparkObjects()
	{
		return sparkObjects;
	}

	public String getFilePath()
	{
		return filePath;
	}

	public int getNumberOfColumns()
	{
		return numberOfColumns;
	}
}
