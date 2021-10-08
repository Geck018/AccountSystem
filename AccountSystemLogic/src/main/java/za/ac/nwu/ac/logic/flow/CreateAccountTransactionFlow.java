//This interface defines the methods abstractly that will be implemented in the implementation classes

package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.ac.domain.dto.AccountTransactionDto;

public interface CreateAccountTransactionFlow {
    AccountTransactionDto createAccountTransaction(AccountTransactionDto accountTransaction);
}
