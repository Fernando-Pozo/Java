package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService OnlinePaymentService;
	
	public ContractService(services.OnlinePaymentService onlinePaymentService) {
		OnlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {
		double basicQuota = contract.getTotalValue() / months;
        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);
            double interest = OnlinePaymentService.interest(basicQuota, i);
            double fee = OnlinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;
            contract.getInstallments().add(new Installment(dueDate, quota));
        }
	}
}
