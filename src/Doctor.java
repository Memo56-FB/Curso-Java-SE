public class Doctor {
    static int id = 0; //Autoincrement
    String name;
    String speciality;
    //Comportamientos
    Doctor() {
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }
    Doctor(String name) {
        id++;
        this.name = name;
    }
    public void showName() {
        System.out.println(name);
    }
    public void showId() {
        System.out.println("ID Doctor: " + id);
    }
}
