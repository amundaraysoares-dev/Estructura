import java.io.File;
import java.io.IOException;
import java.lang.Runtime;
import java.util.Properties;
import java.util.Scanner;
import java.util.TreeSet;

public class InformeSistema {

public static void NumProcesos() {
    int procesos = Runtime.getRuntime().availableProcessors();
    System.out.println(" PROCESADORES");
    System.out.println("============================================================");
    System.out.println("\tDisponible JMV: "+ procesos+ "mib");
    System.out.println("\t(son hilos lógicos: con SMT no coincide con los núcleos físicos)");
    System.out.println(" ");
}
public  static void Memoria(){
    long mtotal = Runtime.getRuntime().totalMemory();
    long mFree = Runtime.getRuntime().freeMemory();
    long mMax = Runtime.getRuntime().maxMemory();
    long mUse = mtotal - mFree;

    long mib = (1024 * 1024);

    long totalMiB = mtotal / mib;
    long MAximaMib = mMax / mib;
    long freeMiB = mFree / mib;
    long useMiB = mUse / mib;
    long mPorcentaje = (mUse * 100l) / mtotal;


    System.out.println("MEMORIO . ANTES");
    System.out.println("============================================================");
    System.out.println("\tTotal reservada: "+totalMiB+" mib");
    System.out.println("\tLibre: "+freeMiB+" mib");
    System.out.println("\tEn uso: "+useMiB+" mib " +"("+ mPorcentaje +"% de la total)");
    System.out.println("\tMáxima (-Xmx): "+MAximaMib+" mib");
    System.out.println(" ");

    long[] reservado = new long[8 * 1024 * 1024];
    if (reservado.length > 0){
        reservado[0] = 1L;
    }
    long dmtotal = Runtime.getRuntime().totalMemory();
    long dmFree = Runtime.getRuntime().freeMemory();
    long dmMax = Runtime.getRuntime().maxMemory();
    long dmUse = dmtotal - dmFree;

    long dtotalMiB = dmtotal / mib;
    long dMAximaMib = dmMax / mib;
    long dfreeMiB = dmFree / mib;
    long duseMiB = dmUse / mib;
    long dmPorcentaje = (dmUse * 100l) / dmtotal;

    System.out.println("MEMORIO . DESPUES");
    System.out.println("============================================================");
    System.out.println("\tTotal reservada: "+dtotalMiB+" mib");
    System.out.println("\tLibre: "+dfreeMiB+" mib");
    System.out.println("\tEn uso: "+duseMiB+" mib " +"("+ dmPorcentaje +"% de la total)");
    System.out.println("\tMáxima (-Xmx): "+dMAximaMib+" mib");
}

public static void SISTEMA(){
   String SO =  System.getProperty("os.name");
   String separador = File.separator;
    String ruta = System.getProperty("user.home");
    System.out.println("SISTEMA");
    System.out.println("============================================================");
    System.out.println("\tos.name: "+SO);
    System.out.println("\tfile.separator: "+separador);
    System.out.println("\tRuta construida con las propiedades: "+ruta+"psp"+separador+"informe.txt");
    System.out.println(" ");
}
    public static void PROPIEDADES(String[] pref){
        String[] prefijos =  pref;

        if (pref == null || pref.length == 0){
            prefijos = new String[]{"os.","user.","java.version"};
        }

        System.out.println("PROPIEDADES QUE EMPIEZAN POR os., user., java.version");
        System.out.println("============================================================");

        Properties prop = System.getProperties();
        TreeSet<String> Orden = new TreeSet<>(prop.stringPropertyNames());

        for (String Key : Orden ){
            for (String prefijo : prefijos){
                if (Key.startsWith(prefijo)){
                    System.out.println("\t" + Key + " = " + prop.getProperty(Key));
                    break;
                }

            }

        }
        System.out.println(" ");

    }
    public static void ESPERA(){
        System.out.println("\t PROCESO EN ESPERA");
        System.out.println("\t ============================================================");
        System.out.println("\t Buscame desde otra terminal con:");
        System.out.println("\t  ps -ef | grep InformeSistema");
        System.out.println("  ");
        System.out.println("\tPulsa INTRO para terminar...");
        System.out.println("\tFin del programa.");
        Scanner enter = new Scanner(System.in);
        enter.nextLine();
    };












    public static void main(String[] args) throws IOException {
        InformeSistema.NumProcesos();
        InformeSistema.Memoria();
        InformeSistema.SISTEMA();
        InformeSistema.PROPIEDADES(new String[]{});
        InformeSistema.ESPERA();
    }





}
