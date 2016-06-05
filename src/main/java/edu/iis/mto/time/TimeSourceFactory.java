package edu.iis.mto.time;

public class TimeSourceFactory 
{
	public static TimeSourceImpl timeSource()
	{
		return new TimeSourceImpl();
	}
}
