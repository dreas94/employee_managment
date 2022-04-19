package se.lexicon.dreas94;

import java.time.LocalDate;
import java.util.Arrays;

public class SalesPerson extends Employee
{
    private final int extraPriceForKeptClients = 500;
    private final int extraPriceForAcquiredClients = 1000;
    private String[] clients;
    private int acquiredClients;

    SalesPerson()
    {
        super();
        setClients(new String[0]);
        setAcquiredClients(0);
        calculateSalary();
    }

    SalesPerson(String name, LocalDate dateHired, String[] clients, int acquiredClients)
    {
       super(name, dateHired);
       setClients(clients);
       setAcquiredClients(acquiredClients);
       calculateSalary();
    }

    public void addClient(String client)
    {
        String[] newArray = Arrays.copyOf(clients, clients.length + 1);
        newArray[newArray.length -1 ] = client;
        setClients(newArray);
        acquiredClients++;
    }

    public String[] getClients()
    {
        return clients;
    }

    public void setClients(String[] clients)
    {
        this.clients = clients;
    }

    public int getAcquiredClients()
    {
        return acquiredClients;
    }

    public void setAcquiredClients(int acquiredClients)
    {
        this.acquiredClients = acquiredClients;
    }

    @Override
    public void calculateSalary()
    {
        double result = super.baseSalary +
                (clients.length * extraPriceForKeptClients) +
                (acquiredClients*extraPriceForAcquiredClients);
        setSalary(result);
    }

    @Override
    public String toString() {
        return "SalesPerson{" +
                "clients =" + Arrays.toString(clients) +
                ", Number of Acquired Clients =" + acquiredClients +
                super.toString() +
                '}';
    }
}
