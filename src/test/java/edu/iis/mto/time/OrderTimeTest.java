package edu.iis.mto.time;

import edu.iis.mto.time.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.powermock.api.mockito.PowerMockito.mockStatic;

@RunWith(PowerMockRunner.class)
@PrepareForTest(TimeSourceFactory .class)
public class OrderTimeTest 
{
	@Test
    public void test() 
	{
        mockStatic(TimeSourceFactory .class);
        TimeSourceImpl timeSource = new TimeSourceImpl();
        timeSource.dateTimeNow().plusHours(20);
        when(TimeSourceFactory.timeSource()).thenReturn(timeSource);
        Order order = new Order();
        order.submit();
        order.confirm();
    }
}
