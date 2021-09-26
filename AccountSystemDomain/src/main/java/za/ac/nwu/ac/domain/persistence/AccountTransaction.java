package za.ac.nwu.ac.domain.persistence;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="ACCOUNT_TRANSACTION",schema="hr")
public class AccountTransaction implements Serializable {
    @Id
    @SequenceGenerator(name="ACC_TX_SEQ",sequenceName = "hr.ACC_TX_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACC_TX_SEQ")
    @Column(name = "ACCOUNT_TX_ID")
    private long transactionId;

    @Column(name = "ACCOUNT_TYPE_ID")
    private long accountType;

    @Column(name = "MEMBER_ID")
    private long memberID;

    @Column(name = "AMOUNT")
    private long amount;

    @Column(name = "TX_DATE")
    private LocalDate transactionDate;

    public long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACCOUNT_TYPE_ID")
    public long getAccountType() {
        return accountType;
    }

    public void setAccountType(long accountType) {
        this.accountType = accountType;
    }

    public long getMemberID() {
        return memberID;
    }

    public void setMemberID(long memberID) {
        this.memberID = memberID;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public AccountTransaction(long transactionId, long accountTypeId, long memberID, long amount, LocalDate transactionDate) {
        this.transactionId = transactionId;
        this.accountType= accountTypeId;
        this.memberID = memberID;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    public AccountTransaction() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransaction that = (AccountTransaction) o;
        return transactionId == that.transactionId && accountType == that.accountType && memberID == that.memberID && amount == that.amount && Objects.equals(transactionDate, that.transactionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionId, accountType, memberID, amount, transactionDate);
    }

    @Override
    public String toString() {
        return "AccountTransaction{" +
                "transactionId=" + transactionId +
                ", accountTypeId=" + accountType +
                ", memberID=" + memberID +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }
}
