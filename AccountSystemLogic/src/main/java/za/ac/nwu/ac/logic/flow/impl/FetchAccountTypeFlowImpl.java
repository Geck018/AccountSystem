package za.ac.nwu.ac.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountType;
import za.ac.nwu.ac.logic.flow.FetchAccountTypeFlow;
import za.ac.nwu.ac.translator.AccountTypeTranslator;

import javax.transaction.Transactional;
import java.util.List;

//All flow diagram Logic steps in here, one class per flow
@Transactional
@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {
    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public FetchAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator)
    {
        this.accountTypeTranslator = accountTypeTranslator;
    }
    @Override
    public List<AccountTypeDto> getAllAccountTypes()
    {
        return accountTypeTranslator.getAllAccountTypes();
    }
    @Override
    public AccountTypeDto getAccountTypeByMnemonic(String mnemonic)
    {
        return accountTypeTranslator.getAccountTypeByMnemonic(mnemonic);
    }
    @Override
    public AccountType getAccountTypeDtoByMnemonic(String mnemonic)
    {
        return accountTypeTranslator.getAccountTypeDtoByMnemonic(mnemonic);
    }

    public boolean methodToTest()
    {
        return true;
    }
}
