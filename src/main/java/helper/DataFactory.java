/*
 * Copyright (c) 2019. Hochschule Offenburg. All rights reserved.
 */

package helper;

/**
 * Class representing a factory for generating a data provider for reading a predefined file
 *
 * @author Philip Wolschon - Hochschule Offenburg
 * @author Alexander Bierenstiel - Hochschule Offenburg
 */
public class DataFactory
{
	private static final String COMMON_SAMPLE_PATH = "/public/infm_2019/";

	/**
	 * Method for generating a data provider used for reading the sample1 file
	 *
	 * @return {IDataProvider} The data provider
	 */
	public static IDataProvider sample1(SparkObjects sparkObjects)
	{
		DataProviderOptions options = new DataProviderOptions(
			sparkObjects,
			COMMON_SAMPLE_PATH + "sample1.csv",
			" ",
			2,
			new int[]{-1});
		return new DataProvider(options);
	}

	/**
	 * Method for generating a data provider used for reading the sample2 file
	 *
	 * @return {IDataProvider} The data provider
	 */
	public static IDataProvider sample2(SparkObjects sparkObjects)
	{
		DataProviderOptions options = new DataProviderOptions(
			sparkObjects,
			COMMON_SAMPLE_PATH + "sample2.csv",
			"\t",
			3,
			new int[]{2});
		return new DataProvider(options);
	}

	/**
	 * Method for generating a data provider used for reading the sample3 file
	 *
	 * @return {IDataProvider} The data provider
	 */
	public static IDataProvider sample3(SparkObjects sparkObjects)
	{
		DataProviderOptions options = new DataProviderOptions(
			sparkObjects,
			COMMON_SAMPLE_PATH + "sample3.csv",
			"\t",
			2,
			new int[]{-1});
		return new DataProvider(options);
	}

	/**
	 * Method for generating a data provider used for reading the sample4Norm file
	 *
	 * @return {IDataProvider} The data provider
	 */
	public static IDataProvider sample4(SparkObjects sparkObjects)
	{
		DataProviderOptions options = new DataProviderOptions(
			sparkObjects,
			COMMON_SAMPLE_PATH + "sample4.csv",
			"\t",
			40,
			new int[]{-1});
		return new DataProvider(options);
	}

	/**
	 * Method for generating a data provider used for reading the sample5 file being a shorter
	 * version of sample 4
	 *
	 * @return {IDataProvider} The data provider
	 */
	/*public static IDataProvider sample5(SparkObjects sparkObjects)
	{
		DataProviderOptions options = new DataProviderOptions(",", new int[]{-1});
		return new DataProvider(sparkObjects, options, COMMON_SAMPLE_PATH + "sample5.csv");
	}*/

	/**
	 * Method for generating a data provider used for reading the sample6 file being a much shorter
	 * version of sample 4
	 *
	 * @return {IDataProvider} The data provider
	 */
	/*public static IDataProvider sample6(SparkObjects sparkObjects)
	{
		DataProviderOptions options = new DataProviderOptions(",", new int[]{-1});
		return new DataProvider(sparkObjects, options, COMMON_SAMPLE_PATH + "sample6.csv");
	}*/
}
