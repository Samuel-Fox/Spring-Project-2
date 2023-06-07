package org.genspark;

import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
	@Bean
	public Student getStudent()
	{
		Student obj = new Student(1111, "Student");
		return obj;
	}

	@Bean
	public Address getAddress()
	{
		Address obj =  new Address("testCity", "testState", "testCountry", "testZip");
		return obj;
	}

	@Bean
	public List<Phone> ph()
	{
		List<Phone> phones = new ArrayList<>();
		phones.add(new Phone("555-555-5555"));
		phones.add(new Phone("555-555-5551"));
		return phones;
	}
}
