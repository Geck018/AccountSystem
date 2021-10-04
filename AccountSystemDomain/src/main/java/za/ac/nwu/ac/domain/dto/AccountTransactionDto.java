package za.ac.nwu.ac.domain.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.ac.domain.persistence.AccountTransaction;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@ApiModel(value = "Account Transaction", description = "A DTO representing the Account Transaction")
public class AccountTransactionDto implements Serializable
{
    private long accountType;
    private String memberID;
    private String miles;
    private LocalDate txDate;

    public AccountTransactionDto(long accountTypeID, String memberID, String miles, LocalDate txDate)
    {
        this.accountType = accountType;
        this.memberID = memberID;
        this.miles = miles;
        this.txDate = txDate;
    }

    public AccountTransactionDto()
    {
    }
    public AccountTransactionDto(AccountTransaction accountTransaction)
    {
        this.setAccountType(accountTransaction.getTransactionId());
        this.setMiles(accountTransaction.getMiles());
        this.setTxDate(accountTransaction.getTransactionDate());
        this.setMemberID(accountTransaction.getMemberID());
    }
    @ApiModelProperty(
                  position = 1,
                  value = "AccountType ID",
                  name = "AccountType",
                  notes = "Identifies the AccountType column",
                  dataType = "java.lang.String",
                  example = "5565",
                  required = true)
    public long getAccountType() {
        return accountType;
    }

    public void setAccountType(long accountTypeID) {
        this.accountType = accountTypeID;
    }
    @ApiModelProperty(
            position = 2,
            value = "Member ID",
            name = "MemberID",
            notes = "Identifies the Member",
            dataType = "java.lang.String",
            example = "9898",
            required = true)
    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }
    @ApiModelProperty(
            position = 3,
            value = "Miles",
            name = "Miles",
            notes = "Amount of Miles",
            dataType = "java.lang.String",
            example = "1200",
            required = true)
    public String getMiles() {
        return miles;
    }

    public void setMiles(String miles) {
        this.miles = miles;
    }
    @ApiModelProperty(
            position = 4,
            value = "Transaction Date",
            name = "Tx_Date",
            notes = "Specifies the date on which the transaction occurred",
            dataType = "java.lang.String",
            example = "2020-10-30",
            required = true)
    public LocalDate getTxDate() {
        return txDate;
    }

    public void setTxDate(LocalDate txDate) {
        this.txDate = txDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountTransactionDto that = (AccountTransactionDto) o;
        return Objects.equals(accountType, that.accountType) && Objects.equals(memberID, that.memberID) && Objects.equals(miles, that.miles) && Objects.equals(txDate, that.txDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountType, memberID, miles, txDate);
    }

    @JsonIgnore
    public AccountTransaction getAccountTransaction()
    {
        return new AccountTransaction(getAccountType(),getMiles(), getTxDate(),getMemberID());
    }

    @Override
    public String toString() {
        return "AccountTransactionDto{" +
                "accountTypeID='" + accountType + '\'' +
                ", memberID='" + memberID + '\'' +
                ", miles='" + miles + '\'' +
                ", txDate=" + txDate +
                '}';
    }
}

