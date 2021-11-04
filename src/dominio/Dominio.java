
package dominio;

import java.util.Random;
import  dominio.Estado.*;
import static dominio.Estado.*;
import javax.swing.JOptionPane;

public class Dominio {
    private String nombre;
    private String nombre2;
    private String apellidoP;
    private String apellidom;
    private String yearNacimidento;
    private String mesNacimiento;
    private String diaNacimiento;
    private String lugarNacimiento;
    private String sexo;
    
public Dominio(String nombre,String nombre2, String apellidoP, String apellidom, String yearNacimidento, String mesNacimiento, String diaNacimiento, String lugarNacimiento, String sexo) {
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.apellidoP = apellidoP;
        this.apellidom = apellidom;
        this.yearNacimidento = yearNacimidento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.sexo = sexo;
    }
public Dominio(String nombre, String apellidoP, String apellidom, String yearNacimidento, String mesNacimiento, String diaNacimiento, String lugarNacimiento, String sexo) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidom = apellidom;
        this.yearNacimidento = yearNacimidento;
        this.mesNacimiento = mesNacimiento;
        this.diaNacimiento = diaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.sexo = sexo;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public String getNombre2(){
        return this.nombre2;
    }

    public String getApellidoP() {
        return this.apellidoP;
    }

    public String getApellidom() {
        return this.apellidom;
    }

    public String getYearNacimidento() {
        return this.yearNacimidento;
    }

    public String getMesNacimiento() {
        return this.mesNacimiento;
    }

    public String getDiaNacimiento() {
        return this.diaNacimiento;
    }

    public String getLugarNacimiento() {
        return this.lugarNacimiento;
    }
    
    public String getSexo (String sexo){
        return this.sexo;
    }
    public String primerLetra(String letra){
        char c = 0;
        String nuevaLetra = "" ;
        c = letra.toUpperCase().charAt(0);
        nuevaLetra += c;
        return nuevaLetra.toUpperCase();
        
    }
    public String primerVocal(){
        getApellidoP();
        String nuevaLetra = "";
        char c = 0;
        char vocal = 0;
        for(int i = 0; i < apellidoP.length(); i++){
            c = apellidoP.charAt(i);
            if((apellidoP.charAt(0) == 'A' || apellidoP.charAt(0) == 'a') || (apellidoP.charAt(0) == 'E' || apellidoP.charAt(0) == 'e') || (apellidoP.charAt(0) == 'I' || apellidoP.charAt(0) == 'i') || (apellidoP.charAt(0) == 'O' || apellidoP.charAt(0) == 'o') || (apellidoP.charAt(0) == 'U' || apellidoP.charAt(0) == 'u')){
                c = apellidoP.charAt(i+1);
                if(c == 'A' || c == 'a'){
                vocal = c;
                break;
            }else if(c == 'E' || c == 'e'){
                vocal = c;
                break;
            }else if(c == 'I' || c == 'i'){
                vocal = c;
                break;
            }else if(c == 'O' || c == 'o'){
                vocal = c;
                break;
            }else if(c == 'I' || c == 'i'){
                vocal = c;
                break;
            }
            }else{
            if(c == 'A' || c == 'a'){
                vocal = apellidoP.toUpperCase().charAt(i);
                break;
            }else if(c == 'E' || c == 'e'){
                vocal = apellidoP.toUpperCase().charAt(i);
                break;
            }else if(c == 'I' || c == 'i'){
                vocal = apellidoP.toUpperCase().charAt(i);
                break;
            }else if(c == 'O' || c == 'o'){
                vocal = apellidoP.toUpperCase().charAt(i);
                break;
            }else if(c == 'I' || c == 'i'){
                vocal = apellidoP.toUpperCase().charAt(i);
                break;
            }
            }
        }
        nuevaLetra += vocal;
        return nuevaLetra.toUpperCase();
    }
    
    public String nombrePila(String nombre, String nombre2){
        String nuevaLetra;
        if(nombre2.equals("")){
            nuevaLetra = primerLetra(nombre);
        }else if (nombre.equals("Ma.") || nombre.equals("Maria")  || nombre.equals("Jose") || nombre.equals("J") || nombre.equals("J.")){
            nuevaLetra = primerLetra(nombre2);
        }else{
                nuevaLetra = primerLetra(nombre);
            }
        return nuevaLetra.toUpperCase();
    }
    public String fecha(String dia, String mes, String year){
        String nuevaLetra = "";
        return nuevaLetra.toUpperCase();
    }
    public String yearDayMonth(Estado mes, Object dia, String year){
        String nuevaLetra = "";
        String res = null;
  switch(mes){
      case Enero:
          res = Enero.getEstado();
          break;
      case Febrero:
          res = Febrero.getEstado();
          break;
      case Marzo:
          res = Marzo.getEstado();
          break;
      case Abril:
          res = Abril.getEstado();
          break;
      case Mayo:
          res = Mayo.getEstado();
          break;
      case Junio:
          res = Junio.getEstado();
          break;
      case Julio:
          res = Julio.getEstado();
          break;
      case Agosto:
          res = Agosto.getEstado();
          break;
      case Septiembre:
          res = Septiembre.getEstado();
          break;
      case Octubre:
          res = Octubre.getEstado();
          break;
      case Noviembre:
          res = Noviembre.getEstado();
          break;
      case Diciembre:
          res = Diciembre.getEstado();
          break;
          default:
                JOptionPane.showMessageDialog(null, "MES", "No es un mes",  -1);
          
  }
        nuevaLetra = year.substring(2,4)+res+dia;//2000     0
        return nuevaLetra;
    }
    public String sexo(){
            String nuevaLetra = "";
            nuevaLetra = primerLetra(sexo);
            return nuevaLetra.toUpperCase();
        }
    //Aqui mande a llamar a la clade Enum, para los estados ya que estos los tenemos ya 
    public String entidad(Estado estado){
        String nuevaLetra = "";
        switch(estado){
            case Zacatecas:
                nuevaLetra = Zacatecas.getEstado();
                break;
            case Yucatán :
                nuevaLetra = Yucatán.getEstado();
                break;
            case Veracruz:
                nuevaLetra = Veracruz.getEstado();
                break;
            case Tamaulipas:
                nuevaLetra = Tamaulipas.getEstado();
                break;
            case Tlaxcala:
                nuevaLetra = Tlaxcala.getEstado();
                break;
            case Tabasco:
                nuevaLetra =  Tabasco.getEstado();
                break;
            case Sonora:
                nuevaLetra = Sonora.getEstado();
                break;
            case SanLuisPotosí:
                nuevaLetra = SanLuisPotosí.getEstado();
                break;
            case Sinaloa:
                nuevaLetra = Sinaloa.getEstado();
                break;
            case Querétaro:
                nuevaLetra = Querétaro.getEstado();
                break;
            case QuintanaRoo:
                nuevaLetra = QuintanaRoo.getEstado();
                break;
            case Puebla:
                nuevaLetra = Puebla.getEstado();
                break;
            case Oaxaca:
                nuevaLetra = Oaxaca.getEstado();
                break;
            case Nayarit:
                nuevaLetra = Nayarit.getEstado();
                break;
            case NuevoLeon:
                nuevaLetra = NuevoLeon.getEstado();
                break;
            case Morelos:
                nuevaLetra = Morelos.getEstado();
                break;
            case MichoacanDeOcampo:
                nuevaLetra = MichoacanDeOcampo.getEstado();
                break;
            case México:
                nuevaLetra = México.getEstado();
                break;
            case Jalisco:
                nuevaLetra = Jalisco.getEstado();
                break;
            case Hidalgo:
                nuevaLetra = Hidalgo.getEstado();
                break;
            case Guanajuato:
                nuevaLetra = Guanajuato.getEstado();
                break;
            case Gurrero:
                nuevaLetra = Gurrero.getEstado();
                break;
            case Durango:
                nuevaLetra = Durango.getEstado();
                break;
            case CiudadDeMexico:
                nuevaLetra = CiudadDeMexico.getEstado();
                break;
            case Chiapas:
                nuevaLetra = Chiapas.getEstado();
                break;
            case Colima:
                nuevaLetra = Colima.getEstado();
                break;
            case CoahuilaDeZaragoza:
                nuevaLetra = CoahuilaDeZaragoza.getEstado();
                break;
            case Chihuahua:
                nuevaLetra = Chihuahua.getEstado();
                break;
            case Campeche:
                nuevaLetra = Campeche.getEstado();
                break;
            case BajaCaliforniaSur:
                nuevaLetra = BajaCaliforniaSur.getEstado();
                break;
            case BajaCalifornia:
                nuevaLetra = BajaCalifornia.getEstado();
                break;
            case Aguacalientes:
                nuevaLetra = Aguacalientes.getEstado();
                break;
            default:
                JOptionPane.showConfirmDialog(null, "El estado ya no extiste","No existe",JOptionPane.ERROR);
                        }    
    return nuevaLetra;
}
    public String primer_Constante(){
        String nuevaLetra = "" ;
        char vocal = 0;
        char c=0;
        getApellidoP();
        for(int i = 0; i < apellidoP.length(); i++){
        c = apellidoP.toUpperCase().charAt(i+1);
        if(c == 'B' || c == 'C' || c == 'D' || c == 'F' || c == 'G' || c == 'H' || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'p' || c == 'Q' || c == 'R' || c == 'R' || c == 'S' || c == 'S' || c == 'T' || c == 'V' || c == 'W' || c == 'X' || c == 'X' || c == 'Y' || c == 'Z'){
            vocal = c;
            break;
        }
        }
        nuevaLetra += vocal;
        return nuevaLetra.toUpperCase();
    }
    public String primer_ConstantSegundoApllido(){
        String nuevaLetra = "" ;
        char vocal = 0;
        char c = 0;
        for(int i = 0; i < apellidom.length(); i++){
        c = apellidom.toUpperCase().charAt(i+1);
        if(c == 'B' || c == 'C' || c == 'D' || c == 'F' || c == 'G' || c == 'H' || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'p' || c == 'Q' || c == 'R' || c == 'R' || c == 'S' || c == 'S' || c == 'T' || c == 'V' || c == 'W' || c == 'X' || c == 'X' || c == 'Y' || c == 'Z'){
            vocal = c;
            break;
        }
        }
        nuevaLetra += vocal;
        return nuevaLetra.toUpperCase();
    }
    public String ConstanteNombrePlia(){
        String nuevaLetra = "" ;
        char vocal = 0;
        char c =0;
         if(nombre2.equals("")){
              for(int i = 0; i < nombre.length(); i++){
        c = nombre.toUpperCase().charAt(i+1);
        if(c == 'B' || c == 'C' || c == 'D' || c == 'F' || c == 'G' || c == 'H' || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'p' || c == 'Q' || c == 'R' || c == 'R' || c == 'S' || c == 'S' || c == 'T' || c == 'V' || c == 'W' || c == 'X' || c == 'X' || c == 'Y' || c == 'Z'){
            vocal = c;
            break;
        }
        }
         }else if (nombre.equals("Ma") || nombre.equals("Maria")  || nombre.equals("Jose")){
             for(int i = 0; i < nombre2.length(); i++){
        c = nombre2.toUpperCase().charAt(i+1);
        if(c == 'B' || c == 'C' || c == 'D' || c == 'F' || c == 'G' || c == 'H' || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'p' || c == 'Q' || c == 'R' || c == 'R' || c == 'S' || c == 'S' || c == 'T' || c == 'V' || c == 'W' || c == 'X' || c == 'X' || c == 'Y' || c == 'Z'){
            vocal = c;
            break;
        }
        }
        }else{
        for(int i = 0; i < nombre.length(); i++){
        c = nombre.toUpperCase().charAt(i+1);
        if(c == 'B' || c == 'C' || c == 'D' || c == 'F' || c == 'G' || c == 'H' || c == 'J' || c == 'K' || c == 'L' || c == 'M' || c == 'N' || c == 'p' || c == 'Q' || c == 'R' || c == 'R' || c == 'S' || c == 'S' || c == 'T' || c == 'V' || c == 'W' || c == 'X' || c == 'X' || c == 'Y' || c == 'Z'){
            vocal = c;
            break;
        }
        }
            }
        nuevaLetra += vocal;
        return nuevaLetra.toUpperCase();
}
    public String ultimosDigitos(){
        Random ram = new Random();
        int min = 1, max = 10;
        String nuevaLetra = "";
        int value;
        int anno = Integer.parseInt(yearNacimidento);
        if(anno < 2000){
            value = ram.nextInt(max + min) + min;
            nuevaLetra += value;
        }else if(anno >= 2000){
            char c = (char)(ram.nextInt(26) + 'a');
            nuevaLetra += c;
        }
        return nuevaLetra.toUpperCase();
    }
    public String codigoVerificador(){
        String nuevaLetra = "";
        Random ram = new Random();
        int min = 1, max = 10;
        int value = ram.nextInt(max + min) + min;
        return nuevaLetra+=value;
    }
}