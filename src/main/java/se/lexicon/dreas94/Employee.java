package se.lexicon.dreas94;

import java.time.LocalDate;

public abstract class Employee
{
    public final int baseSalary = 25000;
    private int id;
    private String name;
    private double salary;
    private LocalDate dateHired;
    private static int sequencer = 0;

    Employee()
    {
        setId(sequencer++);
        setSalary(baseSalary);
    }

    Employee(String name, LocalDate dateHired)
    {
        this();
        setName(name);
        setDateHired(dateHired);
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public LocalDate getDateHired()
    {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired)
    {
        this.dateHired = dateHired;
    }

    public abstract void calculateSalary();

    @Override
    public String toString()
    {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dateHired=" + dateHired +
                '}';
    }
}
