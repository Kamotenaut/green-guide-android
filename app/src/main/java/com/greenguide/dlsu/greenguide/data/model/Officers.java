package com.greenguide.dlsu.greenguide.data.model;

public class Officers
{

	private String name,
			position,
			email;

	private OfficeType office;

	public Officers(String name, String position, OfficeType office)
	{
		this(name, position, office, "");
	}

	public Officers(String name, String position, OfficeType office, String email)
	{
		this.name = name;
		this.position = position;
		this.office = office;
		this.email = email;
	}

	public Officers(String name, String position, String email)
	{
		this.name = name;
		this.position = position;
		this.email = email;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getPosition()
	{
		return position;
	}

	public void setPosition(String position)
	{
		this.position = position;
	}

	public OfficeType getOffice()
	{
		return office;
	}

	public void setOffice(OfficeType office)
	{
		this.office = office;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}
}
