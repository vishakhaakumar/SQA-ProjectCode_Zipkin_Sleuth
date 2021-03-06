package pl.piomin.microservices.advanced.transfer.contract;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("account-service")
public interface AccountClient {

	@GetMapping("/accounts/{accountId}")
	Account getAccount(@PathVariable("accountId") String accountId);

}
