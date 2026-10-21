package org.nhindirect.gateway.testutils;

import java.io.IOException;
import java.io.InputStream;

public class TestUtils 
{
	public static String readMessageResource(String _rec) throws Exception
	{
		final String msgResource = "/messages/" + _rec;
		
		try (InputStream stream = TestUtils.class.getResourceAsStream(msgResource))
		{
			if (stream == null)
				throw new IOException("Failed to open resource " + _rec);
			
			return new String(stream.readAllBytes());
		}
	}
}
