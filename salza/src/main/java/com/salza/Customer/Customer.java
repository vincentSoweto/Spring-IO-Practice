package com.salza.Customer;

import javax.persistence.*;
import java.util.Date;

import static javax.persistence.GenerationType.SEQUENCE;


@Entity(name="Customer")
@Table(name="Customer",
        uniqueConstraints = {
        @UniqueConstraint(name="student_email_unique", columnNames="email")
        }
)
public class Customer {

    @Id
    @SequenceGenerator(name = "Customer_sequence",
            sequenceName = "customer_sequence",
            allocationSize=1)
    @GeneratedValue(strategy=SEQUENCE,generator = "customer_sequence")
    @Column(
            name="id",
            updatable=false
    )
    private Long id;

    @Column(
            name="first_name",
            nullable=false,
            columnDefinition = "TEXT"
    )
    private String firstname;

    @Column(
            name="last_name",
            nullable=false,
            columnDefinition = "TEXT"
    )
    private String lastname;

    @Column(
            name="email",
            nullable=false,
            columnDefinition = "TEXT"
    )
    private String email;

    @Column(
            name="dob",
            nullable=false,
            columnDefinition = "TEXT",
            updatable = false
    )
    private String dateOfBirth;

    public Customer() {
    }

    public Customer( String firstname, String lastname, String email, String dateOfBirth) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
