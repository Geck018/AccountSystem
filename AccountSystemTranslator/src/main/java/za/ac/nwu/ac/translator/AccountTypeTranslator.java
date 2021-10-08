//This class defines the methods to be used in the translator

package za.ac.nwu.ac.translator;

import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.util.List;

public interface AccountTypeTranslator {
    List<AccountTypeDto>getAllAccountTypes();
    AccountTypeDto createAccountType(AccountTypeDto accountType);
    AccountTypeDto getAccountTypeByMnemonicNativeQuery(String mnemonic);
    AccountTypeDto getAccountTypeByMnemonic(String mnemonic);
    AccountType getAccountTypeDtoByMnemonic(String mnemonic);
}

