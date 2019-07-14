package pl.sda.builder;

public class App 
{
    public static void main( String[] args )
    {
        User user = new User.Builder()
                .lastname("bop")
                .name("pop")
                .active(false)
                .city("mop")
                .password("admin")
                .postalCode("1234").build();

        System.out.println(user);
    }
}
