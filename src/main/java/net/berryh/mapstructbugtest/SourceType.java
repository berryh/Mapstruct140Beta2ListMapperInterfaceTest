package net.berryh.mapstructbugtest;

import java.io.Serializable;

public class SourceType implements Serializable
{
	private static final long serialVersionUID = 1L;
	private String name;
	private Integer age;

	public SourceType()
	{
	}

	public SourceType(String name, Integer age)
	{
		this.name = name;
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	@Override
	public String toString()
	{
		return "SourceType{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}

