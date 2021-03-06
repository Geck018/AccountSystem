//This class defines the processes and logic for the create new account type method

package za.ac.nwu.ac.logic.flow.impl;


import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.logic.flow.CreateAccountTypeFlow;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import javax.transaction.Transactional;
import java.time.LocalDate;

@Transactional
@Component("createAccountTypeFlowName")
public class CreateAccountTypeFlowImpl implements CreateAccountTypeFlow
{
   private final AccountTypeTranslator accountTypeTranslator;

   public CreateAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator)
   {
       this.accountTypeTranslator = accountTypeTranslator;
   }

    @Override
    public AccountTypeDto createAccountType(AccountTypeDto accountType)
    {
        if (null == accountType.getCreationDate())
        {
            accountType.setCreationDate(LocalDate.now());
        }
        return accountTypeTranslator.createAccountType(accountType);
    }
    public boolean methodToTest()
    {
        return true;
    }
}
