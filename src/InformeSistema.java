import java.io.File;
import java.io.IOException;
import java.lang.Runtime;
import java.util.Properties;
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

}
    public static void PROPIEDADES(){
        String version = System.getProperty("java.version");
        String versionDate = System.getProperty("java.version.date");
        String osArch = System.getProperty("os.arch");
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperty("os.version");
        String userCountry = System.getProperty("user.country ");
        String dir = System.getProperty("os.arch");
        String home = System.getProperty("os.arch");
        String language = System.getProperty("os.arch");
        String userName = System.getProperty("os.arch");


        System.out.println(version);
        System.out.println(versionDate);
        System.out.println(osArch);

    }



    public static void main(String[] args) throws IOException {
        InformeSistema.NumProcesos();
        InformeSistema.Memoria();
        InformeSistema.SISTEMA();
        InformeSistema.PROPIEDADES();
    }





}
