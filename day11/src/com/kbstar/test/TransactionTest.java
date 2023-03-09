package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.TransactionDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.service.TransactionService;

public class TransactionTest {

	public static void main(String[] args) {
		CRUDService<String, TransactionDTO> service = new TransactionService();

		TransactionDTO obj1 = new TransactionDTO(MakeAccountNumber.makeTrNum(), "202339100", "10000", "입금", "창구입금");
		TransactionDTO obj2 = new TransactionDTO(MakeAccountNumber.makeTrNum(), "202339101", "5000", "출금", "창구출금");
		TransactionDTO obj3 = new TransactionDTO(MakeAccountNumber.makeTrNum(), "202339102", "1000", "송금", "모바일송금");

		try {
			service.register(obj1);
			service.register(obj2);
			service.register(obj3);
			System.out.println("거래가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("--------------------------------------------------------------------------");

		/*
		 * try { obj1 = new TransactionDTO("0101", "816901-02-123456", "10000", "입금",
		 * "ATM입금"); service.modify(obj1); System.out.println("수정이 완료되었습니다."); } catch
		 * (Exception e) { e.printStackTrace(); }
		 * 
		 * System.out.println(
		 * "--------------------------------------------------------------------------")
		 * ;
		 * 
		 * try { service.remove("0202"); System.out.println("삭제가 완료되었습니다."); } catch
		 * (Exception e) { e.printStackTrace(); }
		 * 
		 * System.out.println(
		 * "--------------------------------------------------------------------------")
		 * ;
		 */

		TransactionDTO inquiry = null;
		try {
			inquiry = service.get("123");
			// System.out.println(inquiry);
		} catch (Exception e) {
			System.out.println("조회가 불가능합니다.");
		}

		System.out.println("--------------------------------------------------------------------------");

		List<TransactionDTO> list = null;
		try {
			list = service.get();
			for (TransactionDTO data : list) {
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
