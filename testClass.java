package www.html.sinacofi;
import java.io.File;
import java.io.PrintStream;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
/**
 *
 * @author usr_tecnova_04
 */
public class testClass {
    public static void main(String arg[]) throws Exception{

    }
    //(1)  494 lineas
    public String get494lineas(String banco, int ciclo) throws Exception {
        // no se puede aplicar
        // throws Exception { } catch (Exception e) {

        return "";
    }

    //(2)  180 lineas de error
    public void get180Lineas(HttpServletRequest request){

        String str = (String)request.getSession().getAttribute("NombreAtributoTest");
        System.out.println(str);

    }
    //(3) 92 lineas de error
    public ArrayList get92lineas(String banco, int ciclo) throws Exception {
        ArrayList<String> arrList = new ArrayList<String>();
        arrList.add("Hola Mundo");

        return arrList;
    }

    //(4) 396 lineas de e.print
    public void get396lineas(){
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //(5) 43 lineas + 34 lineas son la  misma configuracion
    public void get43lineas(HttpServletRequest request){

        String dirPath = "www.files.cl";
        File filerr = new File(Paths.get(dirPath).toAbsolutePath().toString());
        System.out.println(filerr.getName().toString());

        PrintStream out = System.out;

        out.println("socket_port=" + request.getParameter("puerto"));
        out.println("server_ip=" + request.getParameter("ipfts"));
        out.println("fti_codigo=" + request.getParameter("codigo"));

    }
    //(6) 23 lineas de condigo out.println
    public void get23lineas(HttpServletRequest request){
        //esta linea se agrega sino se presentan errores
        PrintStream out = System.out;

        out.println("socket_port=" + request.getParameter("puerto"));
        out.println("server_ip=" + request.getParameter("ipfts"));
        out.println("fti_codigo=" + request.getParameter("codigo"));
    }
    public String getDatosReunion(int idCiclo, int banco) throws Exception {
        return "";
    }
}
