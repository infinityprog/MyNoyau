import Noyeau.UseCases.FindEmployee;

/* API REST */

public class Main {

    public static void main(String [ ] args)
    {
        FindEmployee findEmployee = new FindEmployee();

        System.out.println(findEmployee.findById(1).toString());
    }
}
