//This class defines the queries and methods associated with them that will be used by hibernate as configured in the repositoryconfig class

package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.dto.AccountTypeDto;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;
import za.ac.nwu.ac.domain.persistence.AccountType;

import java.time.LocalDate;


@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long>
{

    //not recommended
    @Query(value = "SELECT "+"ACCOUNT_TYPE_ID, "+"ACCOUNT_TYPE_NAME, "+"CREATION_DATE, "+"MNEMONIC "+"FROM "+"HR.ACCOUNT_TYPE "+
             "WHERE MNEMONIC = :mnemonic", nativeQuery = true)
    AccountType getAccountTypeByMnemonicNativeQuery(String mnemonic);

    //more optimal for single tables
    @Query(value = "SELECT "+"at "+"FROM "+"AccountType at "+"WHERE at.mnemonic = :mnemonic")
    AccountType getAccountTypeByMnemonic(String mnemonic);

    //multiple tables, joins
    @Query(value = "SELECT new za.ac.nwu.ac.domain.dto.AccountTypeDto( "+"at.mnemonic, "+"at.accountTypeName, "+
            "at.creationDate) "+"FROM "+"AccountType at "+"WHERE at.mnemonic = :mnemonic")//+"JOIN AccountTransaction "+"USING ("+"accountTypeID)"//)
    AccountType getAccountTypeDtoByMnemonic(String mnemonic);
}
