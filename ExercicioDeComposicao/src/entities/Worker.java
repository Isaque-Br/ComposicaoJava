package entities;

import enums.WorkerLevel;                       // IMPORT DO ENUMS

import java.util.ArrayList;                     // IMPORTANDO UMA LISTA PARA  List<HourContract>
import java.util.Calendar;
import java.util.List;

public class Worker {                          // CLASSE COM DUAS ASSOCIAÇÕES, DOIS CONTRATO, DEPARTMENT E Lista HourContract

    // ATRIBUTOS
    private String name;
    private WorkerLevel level;                      // ASSOCIAÇÃO COM ENUMS
    private Double baseSalary;

    private Department department;                   // ASSOCIAÇÃO, 1 DEPARTMENT

    private List<HourContract> contracts = new ArrayList<>();       //ASSOCIAÇÃO COM (VARIOS CONTRATOS) LIST
    // COMPOSIÇÃO DE OBJETOS

    public Worker() {

    }
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }
    public double income(int year, int month) {
        double sum = baseSalary;                    // RECEBE O SALARIO DO TRABALHADOR
        Calendar cal = Calendar.getInstance();      // INSTANCIA UM CALENDARIO PRA SETAR AS DATAS / MES / ANO
        for (HourContract c: contracts) {           // PARA CADA CONTRATO C  NA LISTA DE CONTRACTS...
            cal.setTime(c.getDate());               // PEGOU A DATA DO CONTRATO E DEFINIU PARA A DATA DO CALENDARY /  PARA CADA CALENDARIO C SETA UMA DATA DO CALENDARIO
            int c_year = cal.get(Calendar.YEAR);        // REPRESENTA O ANO DO CONTRATO C
            int c_month = 1 + cal.get(Calendar.MONTH);  // RECEBE O MES DO CONTRATO C
            if (year == c_year && month == c_month) {       // IF HoursContract c for do mes e do ano
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
