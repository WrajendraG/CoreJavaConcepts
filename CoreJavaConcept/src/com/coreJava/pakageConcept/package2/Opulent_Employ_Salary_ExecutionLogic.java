/**
 * Created by WrajendraG on 2/9/2017.
 */

package com.coreJava.pakageConcept.package2;

import java.util.Scanner;

import com.coreJava.exceptionsConceptRules.NegativeSalaryException;
import com.coreJava.pakageConcept.package1.EmploySalaryDetails;

public class Opulent_Employ_Salary_ExecutionLogic
{
    public static void main (String args    []  )
    {
        String sal;

        Scanner s=new Scanner(System.in);
        EmploySalaryDetails obj = new EmploySalaryDetails();

        System.out.print("\n\t\t\t Enter Salary of Employ ");
        sal = s.nextLine();
        try
        {
            obj.DecideSalary(sal);
        }
        catch (NegativeSalaryException nse)
        {

            System.err.print("\n\t\t\t Do not Enter Ngative or Zero Salary ");
        }
    }
}
