package com.gos;


import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MemberTest {

	@Test
	public void getterSetter() {
		Member member = new Member();
		member.setName("gos");
		Assert.assertEquals(member.getName(), "gos"); 
	}

}
