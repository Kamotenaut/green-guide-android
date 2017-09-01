package com.greenguide.dlsu.greenguide.data.model;

/**
 * Created by Yep on 9/1/2017.
 */

public class Policy
{
	String name;
	int resId;
	String infographicPath;

	public Policy(String name, int resId)
	{
		this(name, resId, "");
	}

	public Policy(String name, int resId, String infographicPath)
	{
		this.name = name;
		this.resId = resId;
		this.infographicPath = infographicPath;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getResId()
	{
		return resId;
	}

	public void setResId(int resId)
	{
		this.resId = resId;
	}

	public String getInfographicPath()
	{
		return infographicPath;
	}

	public void setInfographicPath(String infographicPath)
	{
		this.infographicPath = infographicPath;
	}

}
