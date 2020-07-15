package net.berryh.mapstructbugtest;

import java.util.Collections;
import java.util.List;

public class Main
{
	public static void main(final String[] args)
	{
		final List<SourceType> sourceTypes = Collections.singletonList(new SourceType("TestName", 25));
		final List<TargetType> targetTypes = SourceTargetMapper.INSTANCE.toTO(sourceTypes);
		targetTypes.forEach(System.out::println);
	}
}