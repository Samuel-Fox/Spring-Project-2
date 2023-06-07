package org.genspark;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student
{
	private int id;
	private String name;
	@Autowired
	private List<Phone> ph;
	@Autowired
	private Address add;

	public Student()
	{
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public List<Phone> getPh()
	{
		return ph;
	}

	public void setPh(List<Phone> ph)
	{
		this.ph = ph;
	}

	public Address getAdd()
	{
		return add;
	}

	public void setAdd(Address add)
	{
		this.add = add;
	}

	public Student(int id, String name, List<Phone> ph, Address add)
	{
		this.id = id;
		this.name = name;
		this.ph = ph;
		this.add = add;
	}

	public Student(int id, String name)
	{
		this.id = id;
		this.name = name;
		this.ph = ph;
	}

	public void studentInfo()
	{
		String phones = "[";
		for(Phone s : ph)
		{
			phones = phones + s.getMob() + ", ";
		}
		phones = phones.substring(0, phones.length()-2);
		phones = phones + "]";
		System.out.println("Id : " + this.id);
		System.out.println("Name : " + this.name);
		System.out.println("Phones : " + phones);
		System.out.println("Address : " + this.add.addressInfo());
	}
}
