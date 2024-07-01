package library;

import java.util.Date;

public class MemberRecord {
    private String memberID;
    private String type;
    private Date dateOfMembership;
    private int noBooksIssued;
    private int maxBookLimit = 5;
    private String name;
    private String address;
    private String phoneNo;

    public MemberRecord(String memberID, String type, Date dateOfMembership, int noBooksIssued, int maxBookLimit, String name, String address, String phoneNo) {
        this.memberID = memberID;
        this.type = type;
        this.dateOfMembership = dateOfMembership;
        this.noBooksIssued = noBooksIssued;
        this.maxBookLimit = maxBookLimit;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getMemberID() {
        return memberID;
    }

    public void incBookIssued() {
        if (noBooksIssued < maxBookLimit) {
            this.noBooksIssued++;
            System.out.println("Book issued. Total books issued: " + noBooksIssued);
        } else {
            System.out.println("Cannot issue more books. Maximum limit reached: " + maxBookLimit);
        }
    }

    public void decBookIssued() {
        if (noBooksIssued > 0) {
            this.noBooksIssued--;
            System.out.println("Book returned. Total books issued: " + noBooksIssued);
        } else {
            System.out.println("No books issued to return.");
        }
    }


    public void payBill() {
        // Burada fatura ödeme işlemleri yapılabilir
        System.out.println("Bill paid for member: " + this.name);
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateOfMembership() {
        return dateOfMembership;
    }

    public void setDateOfMembership(Date dateOfMembership) {
        this.dateOfMembership = dateOfMembership;
    }

    public int getNoBooksIssued() {
        return noBooksIssued;
    }

    public void setNoBooksIssued(int noBooksIssued) {
        this.noBooksIssued = noBooksIssued;
    }

    public int getMaxBookLimit() {
        return maxBookLimit;
    }

    public void setMaxBookLimit(int maxBookLimit) {
        this.maxBookLimit = maxBookLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
