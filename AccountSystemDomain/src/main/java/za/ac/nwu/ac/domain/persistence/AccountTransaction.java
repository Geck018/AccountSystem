package za.ac.nwu.ac.domain.persistence;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="ACCOUNT_TRANSACTION",schema="hr")
public class AccountTransaction implements Serializable {

    public AccountTransaction(long accountType, String miles, LocalDate txDate, String memberID) {
    }

    public AccountTransaction(long accountType, String miles, LocalDate txDate, long memberID) {
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

    @ManyToOne(fetch = FetchType.LAZY,targetEntity = AccountType.class)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    public long getAccountType() {
        return accountType;
    }
    @Column(name = "ACCOUNT_TYPE_ID")
    private long accountType;
    public void setAccountType(long accountType) {
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


    public void setMiles(long amount) {
        this.miles = miles;
    }

    @Column(name = "TX_DATE")
    private LocalDate transactionDate;
    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public AccountTransaction(long transactionId, long accountTypeId, String memberID, long amount, LocalDate transactionDate) {
        this.transactionId = transactionId;
        this.accountType= accountTypeId;
        this.memberID = memberID;
        this.miles = miles;
        this.transactionDate = transactionDate;
    }

    public AccountTransaction() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return transactionId == that.transactionId && accountType == that.accountType && memberID == that.memberID && miles == that.miles && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, accountType, memberID, miles, transactionDate);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionId=" + transactionId +
                ", accountTypeId=" + accountType +
                ", memberID=" + memberID +
                ", amount=" + miles +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
