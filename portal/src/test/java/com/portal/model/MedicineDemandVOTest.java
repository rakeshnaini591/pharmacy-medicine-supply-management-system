package com.portal.model;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.portal.vo.MedicineDemandVO;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MedicineDemandVOTest {

	@Mock
	MedicineDemandVO demand;
	
	@Before
	public void setup() throws Exception{
		
		demand = new MedicineDemandVO();
		demand.setId(1);
		demand.setMedicineName("Crocin");
		demand.setDemandCount(10);
	}
	
	@Test
	public void testSetter() {
		assertEquals(1, demand.getId());
	}
	
	@Test
	public void testGetter() {
		demand.setMedicineName("Orthoherb");
		assertEquals("Orthoherb", demand.getMedicineName());
	}
	
	@Test
	public void testNoArgsConstructor() {
		MedicineDemandVO demand = new MedicineDemandVO();
		assertEquals(null, demand.getMedicineName());
	}
	
	@Test
	public void testAllArgsConstructor() {
		MedicineDemandVO medicineDemand = new MedicineDemandVO(1, "Crocin", 10);
		assertEquals(demand.getDemandCount(),medicineDemand.getDemandCount());
	}
	
	
}