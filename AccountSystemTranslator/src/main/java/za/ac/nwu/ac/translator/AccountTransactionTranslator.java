//This class defines the methods to be used in the translator

package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.AccountTransactionDto;

import java.util.List;

public interface AccountTransactionTranslator
{
    List<AccountTransactionDto>getAllAccountTransactions();
    AccountTransactionDto createAccountTransaction(AccountTransactionDto accountTransaction);
    AccountTransactionDto getAccountTransactionByAccId(String accountType);
    AccountTransactionDto getAccountTransactionByMiles(String miles);

    AccountTransactionDto addAccountTransactionMiles(String miles, String amount);
    int getMiles(String accountType);
}
