package library.customer;

import java.time.LocalDate;

class LibraryCustomerBuilder {

    private String[] name = new String[2];
    private String email;
    private LocalDate dateOfBirth = LocalDate.now();
    private Address address = new Address();

    LibraryCustomer buildCustomer() {
        return new LibraryCustomer(name, email, dateOfBirth, address);
    }

    LibraryCustomerBuilder name(String forename, String surname) {
        this.name[0] = forename;
        this.name[1] = surname;
        return this;
    }

    LibraryCustomerBuilder email(String email) {
        this.email = email;
        return this;
    }

    LibraryCustomerBuilder dob(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    LibraryCustomerBuilder address(String streetAddress, String postCode) {
        this.address.setStreetAddress(streetAddress);
        this.address.setPostCode(postCode);
        return this;
    }

    LibraryCustomerBuilder address(String streetAddress, String town, String postCode) {
        this.address.setStreetAddress(streetAddress);
        this.address.setTown(town);
        this.address.setPostCode(postCode);
        return this;
    }

    LibraryCustomerBuilder address(String streetAddress, String town, String county, String postCode) {
        this.address.setStreetAddress(streetAddress);
        this.address.setTown(town);
        this.address.setCounty(county);
        this.address.setPostCode(postCode);
        return this;
    }
}
