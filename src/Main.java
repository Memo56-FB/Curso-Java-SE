import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args){
        Doctor myDoctor = new Doctor("Pablo");
        myDoctor.showName();
        myDoctor.showId();

        Doctor myDoctorMemo = new Doctor("Memo");
        myDoctorMemo.showId();

        showMenu();
    }
    
}