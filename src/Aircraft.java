public class Aircraft {

    private int id;
    private String name;

    public Aircraft(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
