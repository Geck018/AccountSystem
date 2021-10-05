package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.AccountTransactionDto;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;

import java.util.List;

public interface AccountTransactionTranslator
{
    List<AccountTransactionDto>getAllAccountTransactions();
    AccountTransactionDto createAccountTransaction(AccountTransactionDto accountTransaction);
    AccountTransactionDto getAccountTransactionByAccId(long accountType);
    AccountTransactionDto getAccountTransactionByMiles(String miles);
}
