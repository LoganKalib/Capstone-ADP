package za.ac.cput.Domain;

/*
    Payment Model Class
    Author: Sheldon Luke Arendse 221190384
    Date: 21 March 2024
*/
import java.util.Objects;

public class Payment extends Order{
    private final String name, surname, email, password;
    private final long contactInfo;

    private Payment(Builder obj) {
        this.name =obj.name;
        this.surname = obj.surname;
        this.email = obj.email;
        this.password = obj.password;
        this.contactInfo = obj.contactInfo;
    }

    public String getName() { return name; }

    public String getSurname() { return surname; }

    public String getEmail() { return email; }

    public String getPassword() { return password; }

    public long getContactInfo() { return contactInfo; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment payment)) return false;
        return getContactInfo() == payment.getContactInfo() && Objects.equals(getName(),
                payment.getName()) && Objects.equals(getSurname(), payment.getSurname())
                && Objects.equals(getEmail(), payment.getEmail())
                && Objects.equals(getPassword(), payment.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getEmail(), getPassword(), getContactInfo());
    }

    @Override
    public String toString() {
        return "Payment{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", contactInfo=" + contactInfo +
                '}';
    }

    public static class Builder {
        private String name, surname, email, password;
        private long contactInfo;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }

        public Builder setContactInfo(long contactInfo) {
            this.contactInfo = contactInfo;
            return this;
        }

        public Builder copy(Payment obj) {
            this.name =obj.name;
            this.surname = obj.surname;
            this.email = obj.email;
            this.password = obj.password;
            this.contactInfo = obj.contactInfo;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }


}
