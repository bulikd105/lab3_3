package edu.iis.mto.time;

import org.joda.time.DateTime;

public class TimeSourceImpl implements TimeSource
{
	@Override
	public DateTime dateTimeNow() 
	{
		return new DateTime();
	}
}
