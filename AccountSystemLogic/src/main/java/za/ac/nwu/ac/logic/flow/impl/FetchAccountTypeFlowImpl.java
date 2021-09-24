package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//All flow diagram Logic steps in here, one class per flow
@Transactional
@Component
public class FetchAccountTypeFlowImpl {
    //@Override
    public List<AccountTypeDto> getAllAccountTypes()
    {
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        accountTypeDtos.add(new AccountTypeDto("MILES","Miles", LocalDate.now()));
        return accountTypeDtos;
    }
}
