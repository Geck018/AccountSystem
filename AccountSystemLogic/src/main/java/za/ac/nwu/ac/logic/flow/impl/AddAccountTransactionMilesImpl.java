package za.ac.nwu.ac.logic.flow.impl;

import za.ac.nwu.ac.domain.dto.AccountTransactionDto;
import za.ac.nwu.ac.logic.flow.AddAccountTransactionMilesFlow;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

public class AddAccountTransactionMilesImpl implements AddAccountTransactionMilesFlow
{
    private String amount;

    public void addAccountTransactionMilesFlow(String amount)
    {
        this.amount = amount;
    }

    @Override
    public AccountTransactionDto addMilesAccountTransaction(String amount) {
        return null;
    }
}
