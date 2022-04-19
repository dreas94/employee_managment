package se.lexicon.dreas94;

import java.time.LocalDate;

public class App 
{
    public static void main(String[] args)
    {
        SystemDeveloper fullstackDev1 = new SystemDeveloper();
        fullstackDev1.setName("Dev1");
        fullstackDev1.addCertificateToArray("OCA"); // 1000
        fullstackDev1.addCertificateToArray("OCP"); // 1000
        fullstackDev1.addCertificateToArray("CEH"); // 1000

        fullstackDev1.addLanguageToArray("Java"); //1500
        fullstackDev1.addLanguageToArray("Python"); // 1500

        fullstackDev1.setDateHired(LocalDate.parse("2020-01-01"));
        fullstackDev1.calculateSalary();
        System.out.println(fullstackDev1);

        SystemDeveloper developer2 = new SystemDeveloper();
        developer2.setName("Dev2");
        developer2.setDateHired(LocalDate.parse("2022-01-01"));
        developer2.calculateSalary();
        System.out.println(developer2);
    }

}
