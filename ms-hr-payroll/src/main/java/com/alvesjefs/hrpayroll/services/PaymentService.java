package com.alvesjefs.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvesjefs.hrpayroll.domain.Payment;
import com.alvesjefs.hrpayroll.domain.Workers;
import com.alvesjefs.hrpayroll.feignclients.WorkersFeignClient;

@Service
public class PaymentService {

	@Autowired
	private WorkersFeignClient workersFeignClient;

	public Payment getPayment(Long id, Integer days) {
		Workers find = workersFeignClient.findById(id).getBody();
		return new Payment(find.getName(), find.getEmail(), find.getOffice(), find.getCpf(), find.getRg(),
				find.getDailyIncome(), days);
	}

//	public Payment getPayment(String cpf, Integer days) {
//		Workers find = workersFeignClient.findByCpf(cpf).getBody();
//		return new Payment(find.getName(), find.getEmail(), find.getOffice(), find.getCpf(), find.getRg(), find.getDailyIncome(), days);
//	}
}
