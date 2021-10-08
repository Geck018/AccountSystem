//This class defines the queries and methods associated with them that will be used by hibernate as configured in the repositoryconfig class

package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long>
{
    @Query(value = "SELECT "+"ax "+"FROM "+"AccountTransaction ax "+"WHERE ax.accountType = : accountType")
    AccountTransaction getAccountTransactionByAccId(String accountType);

    @Query(value = "SELECT "+"ax "+"FROM "+"AccountTransaction ax "+"WHERE ax.miles = : miles")
    AccountTransaction getAccountTransactionByMiles(String miles);

    @Query(value = "UPDATE "+"AccountTransaction ax "+"SET "+"ax.miles= "+"(SELECT ax.accountType "+"FROM AccountTransaction ax "+"WHERE ax.accountType = : accountType)")
    AccountTransaction addAccountTransactionMiles(String miles,String amount);

    @Query(value = "SELECT "+"ax.miles "+"FROM "+"AccountTransaction ax "+"WHERE "+ "ax.accountType = accountType")
    int getMiles(String AccountType);
}
