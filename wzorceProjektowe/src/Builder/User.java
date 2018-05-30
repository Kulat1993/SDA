package Builder;

public class User {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String phone;
    private final String adress;

    public static class Builder {
        private final String firstName;
        private final String lastName;

        private int age;
        private String phone;
        private String adress;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder setAge(int val) {
            age = val;
            return this;
        }

        public Builder setPhone(String val) {
            phone = val;
            return this;
        }

        public Builder setAdress(String val) {
            adress = val;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
    private User(Builder builder) {
        firstName = builder.firstName;
        lastName = builder.lastName;
        age = builder.age;
        phone = builder.phone;
        adress = builder.adress;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
