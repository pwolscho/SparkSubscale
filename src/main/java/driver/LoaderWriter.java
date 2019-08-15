/*
 * Copyright (c) 2019. Hochschule Offenburg. All rights reserved.
 */

package driver;

import helper.DataFactory;
import helper.SparkObjects;
import org.apache.spark.sql.Dataset;
import org.apache.spark.sql.Row;

/**
 * Class to start and coordinate all Spark Subscale calculations.
 *
 * @author Philip Wolschon, Hochschule Offenburg
 * @author Alexander Bierenstiel - Hochschule Offenburg
 */
public class LoaderWriter
{
	private static final String APPLICATION_NAME = "SparkSubscale";

	/**
	 * Main entry point for the driver.
	 *
	 * @param args The command line arguments, 0 being the sample file number, 1 being the option to
	 *             output in german file formatting, 2 being the epsilon distance, 3 being
	 *             minPoints, 4 being the splitting factor and 5 being the usage of evenly sized
	 *             slices.
	 */
	public static void main(String[] args)
	{
		if (!checkInputParameters(args)) {
			System.out.println("There have to be 5 command line input parameters");
			// indicate unsuccessful termination
			System.exit(1);
		}

		// Setup spark context objects
		SparkObjects sparkObjects = new SparkObjects(APPLICATION_NAME);

		// Load data
		Dataset<Row> dataset = DataFactory.sample1(sparkObjects).provideData();
	}


	/**
	 * Check for the right amount of input parameters
	 *
	 * @param args Command line arguments.
	 * @return True if the length of input parameters is correct, otherwise false.
	 */
	private static boolean checkInputParameters(String[] args)
	{
		if (args.length != 6)
		{
			return false;
		}
		return true;
	}
}
