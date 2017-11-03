package com.ironbank.moneyraven;

import com.ironbank.moneyraven.model.ProphetProperties;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoneyRavenApplicationTests {

	@Autowired
	ProphetProperties prophetProperties;

	@Test
	public void contextLoads() {
		assert prophetProperties.getТеКтоВозвращаютДолги().contains("Ланистеры");
	}

}
