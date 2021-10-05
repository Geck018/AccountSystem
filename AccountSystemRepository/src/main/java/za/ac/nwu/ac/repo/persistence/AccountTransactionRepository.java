package za.ac.nwu.ac.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;

@Repository
public interface AccountTransactionRepository extends JpaRepository<AccountTransaction, Long>
{
    @Query(value = "SELECT "+"ax "+"FROM "+"AccountTransaction ax "+"WHERE ax.accountType =:accountType")
    AccountTransaction getAccountTransactionByAccId(String accountType);

    @Query(value = "SELECT "+"ax "+"FROM "+"AccountTransaction ax "+"WHERE ax.miles =:miles")
    AccountTransaction getAccountTransactionByMiles(String miles);

    @Query()
    AccountTransaction addAccountTransactionMiles(String amount);
}
