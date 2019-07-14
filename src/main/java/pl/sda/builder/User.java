package pl.sda.builder;

public class User {
    private String name;
    private String lastname;
    private boolean active;
    private String city;
    private String password;
    private String postalCode;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", active=" + active +
                ", city='" + city + '\'' +
                ", password='" + password + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    /** flouent steps **/ //po kropce

    public static final class Builder{

        private String name;
        private String lastname;
        private boolean active;
        private String city;
        private String password;
        private String postalCode;

        public User build(){
            User user = new User();
            user.name = this.name;
            user.lastname = this.lastname;
            user.city = this.city;
            user.password = this.password;
            user.postalCode = this.postalCode;
            user.active = this.active;

            return user;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder lastname(String lastname){
            this.lastname = lastname;
            return this;
        }

        public Builder active(boolean active) {
            this.active = active;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder postalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }

    }
}
