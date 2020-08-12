public class Main {

    public static void main(String[] args) {
        User tim = new User();
        tim.setFirstName( "Tim" );
        tim.setLastName( "Towler" );
        System.out.println(tim.getFullName());

        User katie = new User();
        katie.setFirstName( "Katie" );
        katie.setLastName( null );
        System.out.println(katie.getFullName());

        User john = new User();
        john.setFirstName( null );
        john.setLastName( "Travolta" );
        System.out.println(john.getFullName());

        User unknown = new User();
        unknown.setFirstName( null );
        unknown.setLastName( null );
        System.out.println(unknown.getFullName());
    }
}
