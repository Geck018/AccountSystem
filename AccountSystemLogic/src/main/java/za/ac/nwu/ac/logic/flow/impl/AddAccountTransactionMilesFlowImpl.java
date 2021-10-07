package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTransactionDto;
import za.ac.nwu.ac.logic.flow.AddAccountTransactionMilesFlow;
import za.ac.nwu.ac.translator.AccountTransactionTranslator;

import javax.transaction.Transactional;

@Transactional
@Component("addAccountMilesFlow")
public class AddAccountTransactionMilesFlowImpl implements AddAccountTransactionMilesFlow
{
    private final AccountTransactionTranslator accountTransactionTranslator;

    public AddAccountTransactionMilesFlowImpl(AccountTransactionTranslator accountTransactionTranslator)
    {
        this.accountTransactionTranslator = accountTransactionTranslator;
    }

    @Override
    public AccountTransactionDto addAccountTransactionMiles(String accountType,String miles, String amount)
    {
        miles=amount+accountTransactionTranslator.getMiles(accountType);
        return accountTransactionTranslator.addAccountTransactionMiles(miles, amount);
    }
    @Override
    public int getMiles(String accountType)
    {
        int miles = accountTransactionTranslator.getMiles(accountType);
        return miles;
    }

}
