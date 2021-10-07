package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTransactionDto;
import za.ac.nwu.ac.logic.flow.AddAccountTransactionMilesFlow;
import za.ac.nwu.ac.translator.AccountTransactionTranslator;

import javax.transaction.Transactional;

@Transactional
@Component("addAccountMilesFlow")
public class AddAccountTransactionMilesImpl implements AddAccountTransactionMilesFlow
{
    private AccountTransactionTranslator accountTransactionTranslator;

    public void AddAccountTransactionMilesFlowImpl()
    {
    }

    @Override
    public AccountTransactionDto addAccountTransactionMiles(String miles, String amount)
    {

            return accountTransactionTranslator.addAccountTransactionMiles(miles, amount);
    }

}
