//This interface defines the methods abstractly that will be implemented in the implementation classes

package za.ac.nwu.ac.logic.flow;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.util.List;

public interface FetchAccountTypeFlow {
    List<AccountTypeDto> getAllAccountTypes();
    AccountTypeDto getAccountTypeByMnemonic(String mnemonic);
    AccountType getAccountTypeDtoByMnemonic(String mnemonic);

}
