package Noyeau.UseCases;

import Noyeau.Entity.Employee;


import java.util.ArrayList;
import java.util.List;

public class FindEmployee {

    public static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee(1,"Cianciolo", "Hugo", "hugo220798@gmail.com", "Patron", 70000 ));
        employees.add(new Employee(2,"Abach", "Yousouph", "ezfz@gsd.be", "Employe", 1600 ));
        employees.add(new Employee(3,"Van De Velde", "Louis", "ergre@fdsf.be", "Ingenieur", 4000 ));
    }

    public Employee findById(int id_search) {
        for (Employee employe: employees) {
            if(employe.getId() == id_search)
            {
                return employe;
            }
        }
        return null;
    }
}
