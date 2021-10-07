package za.ac.nwu.ac.domain.dto;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountTransactionDtoTest
{
    @Test
    public void getAccountType()
    {
        AccountTransactionDto accountTransactionDto =  new AccountTransactionDto();
        assertNull(accountTransactionDto.getAccountType());
    }

}