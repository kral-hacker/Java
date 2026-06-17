package DecisionMaking;

public class switchcase {
    public static void main(String[] args) {
        int day = 10;
        switch (day) {
            default:
                System.out.println("AWEFK.WRJKBFA.WRKBF");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;

        }
        int day1 = 1;
        switch (day1) {


            case 2:
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            default:  // it is used to execute wehn no case is matched
                System.out.println("No matching word case");
        }
    }
}

