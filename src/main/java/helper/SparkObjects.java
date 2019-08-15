/*
 * Copyright (c) 2019. Hochschule Offenburg. All rights reserved.
 */

package helper;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.apache.spark.sql.SparkSession;

/**
 * Class to exchange spark context objects.
 *
 * @author Philip Wolschon, Hochschule Offenburg
 * @author Alexander Bierenstiel - Hochschule Offenburg
 */
public class SparkObjects
{
	private final SparkConf sparkConf;
	private final JavaSparkContext sparkContext;
	private final SparkSession sparkSession;

	/**
	 * Constructor to initialize the spark context objects.
	 *
	 * @param applicationName Name of the spark application. Appears in the spark history server
	 *                        protocols.
	 */
	public SparkObjects(String applicationName)
	{
		sparkConf = new SparkConf();
		sparkConf.setAppName(applicationName);
		sparkContext = new JavaSparkContext(sparkConf);
		sparkSession = SparkSession
			.builder()
			.getOrCreate();
	}

	public SparkConf getSparkConf()
	{
		return sparkConf;
	}

	public JavaSparkContext getSparkContext()
	{
		return sparkContext;
	}

	public SparkSession getSparkSession()
	{
		return sparkSession;
	}
}
