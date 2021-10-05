package za.ac.nwu.ac.domain.persistence;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="ACCOUNT_TRANSACTION",schema="hr")
public class AccountTransaction implements Serializable {


    public AccountTransaction(String accountType, String miles, LocalDate txDate, String memberID)
    {
        this.accountType= accountType;
        this.memberID = memberID;
        this.miles = miles;
        this.txDate = txDate;
    }

    public long getTransactionId() {
        return transactionId;
    }
    @Id
    @SequenceGenerator(name="ACC_TX_SEQ",sequenceName = "hr.ACC_TX_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACC_TX_SEQ")
    @Column(name = "ACCOUNT_TX_ID")
    private long transactionId;
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    public String getAccountType() {
        return accountType;
    }
    @Column(name = "ACCOUNT_TYPE_ID")
    private String accountType;
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    @Column(name = "MEMBER_ID")
    private String memberID;
    public String getMemberID() {
        return memberID;
    }

    @Column(name = "MILES")
    private String miles;
    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMiles() {
        return miles;
    }


    public void setMiles(String miles) {
        this.miles = miles;
    }

    @Column(name = "TX_DATE")
    private LocalDate txDate;
    public LocalDate getTransactionDate() {
        return txDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.txDate = txDate;
    }

    public AccountTransaction(long transactionId, String accountTypeId, String memberID, String miles, LocalDate txDate) {
        this.transactionId = transactionId;
        this.accountType= accountTypeId;
        this.memberID = memberID;
        this.miles = miles;
        this.txDate = txDate;
    }

    public AccountTransaction() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return transactionId == that.transactionId && accountType == that.accountType && memberID == that.memberID && miles == that.miles && Objects.equals(txDate, that.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, accountType, memberID, miles, txDate);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionId=" + transactionId +
                ", accountTypeId=" + accountType +
                ", memberID=" + memberID +
                ", amount=" + miles +
                ", transactionDate=" + txDate +
                '}';
    }
}
