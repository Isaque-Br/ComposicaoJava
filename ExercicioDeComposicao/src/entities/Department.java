package entities;

public class Department {

    private String name;

    public Department() {                   // CONSTRUTOR PADRÃO, VAZIO

    }

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
