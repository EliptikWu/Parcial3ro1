package domain.models;

public class Contact {
    private String name;

    private String direction;

    private Long typeContactT;

    public void setDirection(String direction) {
        this.direction = direction;
    }
    public void setTypeContactT(Long typeContactT) {
        this.typeContactT = typeContactT;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public String getDirection() {
        return direction;
    }

    public Long getTypeContactT() {
        return typeContactT;
    }
    public Contact(String name, String direction, Long typeContactT) {
        this.name = name;
        this.direction = direction;
        this.typeContactT = typeContactT;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", direction='" + direction + '\'' +
                ", typeContactT=" + typeContactT +
                '}';
    }

}
