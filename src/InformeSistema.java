import java.io.IOException;
import java.lang.Runtime;

public class InformeSistema {

public static int NumProcesos(){
    int procesos = Runtime.getRuntime().availableProcessors();
    return procesos;
}
public  static int Memoria(){

}




    public static void main(String[] args) throws IOException {
        System.out.println(
                InformeSistema.NumProcesos()
        );
    }





}
