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
	private final SparkObjects sparkObjects;
	private final String filePath;
	private final String delimiter;
	private final int numberOfColumns;
	private final int[] columnsToIgnore;

	/**
	 * Public constructor for the data provider options.
	 *
	 * @param delimiter
	 * @param columnsToIgnore
	 */
	public DataProviderOptions(SparkObjects sparkObjects, String filePath, String delimiter,
		int numberOfColumns, int[] columnsToIgnore)
	{
		this.sparkObjects = sparkObjects;
		this.filePath = filePath;
		this.delimiter = delimiter;
		this.numberOfColumns = numberOfColumns;
		this.columnsToIgnore = columnsToIgnore;
	}

	public SparkObjects getSparkObjects()
	{
		return sparkObjects;
	}

	public String getFilePath()
	{
		return filePath;
	}

	public String getDelimiter()
	{
		return delimiter;
	}

	public int getNumberOfColumns()
	{
		return numberOfColumns;
	}

	public int[] getColumnsToIgnore()
	{
		return columnsToIgnore;
	}
}
