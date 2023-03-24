package com.greedy.thunderbolts.model.dao;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.greedy.thunderbolts.Application;
import com.greedy.thunderbolts.model.dto.mypageDTO.BuyListDTO;
import com.greedy.thunderbolts.model.dto.mypageDTO.MembersIdDTO;
import com.greedy.thunderbolts.model.dto.mypageDTO.SellListDTO;

@SpringBootTest
@ContextConfiguration(classes = {Application.class} )
public class MypageMapperTests {

	@Autowired
	private MypageMapper mypageMapper;
	
	@Test
	public void 매퍼_테스트() {
		assertNotNull(mypageMapper);
	}
	
	@Test
	public void 메인_구매내역_디비_조회_테스트() {
		
		String memberId = "TEST1"; // memberId 값을 설정
		
		BuyListDTO buyList = mypageMapper.selectBuyList(memberId);
		
		assertNotNull(buyList);
		System.out.println(buyList);
	}
	
	@Test
	public void 메인_판매내역_디비_조회_테스트() {
		
		String memberId = "TEST1"; // memberId 값을 설정
		
		SellListDTO sellList = mypageMapper.selectSellList(memberId);
		
		assertNotNull(sellList);
		System.out.println(sellList);
	}
	
	@Test
	public void 메인_아이디_조회_테스트() {
		
		String memberId = "TEST1"; // memberId 값을 설정
		
		MembersIdDTO selectId = mypageMapper.selectId(memberId);
		
		assertNotNull(selectId);
		System.out.println(selectId);
	}
}