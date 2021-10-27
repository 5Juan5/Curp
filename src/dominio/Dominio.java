
package dominio;

import java.util.Random;

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
    public String yearDayMonth(Object dia, Object mes, String year){
        String nuevaLetra = "";
    if(mes.equals("Enero")){
        mes = "01";
    }else if(mes.equals("Febrero")){
        mes = "02";
    }else if(dia == "Marzo"){
        mes = "03";
    }else if(mes == "Abril"){
        mes = "04";
    }else if(mes == "Mayo"){
        mes = "05";
    }else if(mes == "Junio"){
        mes = "06";
    }else if(mes.equals("Julio")){
        mes = "07";
    }else if(mes == "Agosto"){
        mes = "08";
    }else if(mes == "Septiembre"){
        mes = "09";
    }else if(mes == "Octubre"){
        mes = "10";
    }else if(mes == "Noviembre"){
        mes = "11";
    }else if(mes == "Diciembre"){
        mes = "12";
    }
        nuevaLetra = year.substring(2,4)+mes+dia;//2000     0
        return nuevaLetra;
    }
    public String sexo(){
            String nuevaLetra = "";
            nuevaLetra = primerLetra(sexo);
            return nuevaLetra.toUpperCase();
        }
    public String entidad(){
    String nuevaLetra = "";
    if(lugarNacimiento.equals("Zacatecas")){
        nuevaLetra = "ZS";
    }else if(lugarNacimiento.equals("Yucatán")){
        nuevaLetra = "YN";
    }else if(lugarNacimiento.equals("Veracruz de Ignacio de la Llave")){
        nuevaLetra = "VZ";
    }else if(lugarNacimiento.equals("Tamaulipas")){
        nuevaLetra = "TS";
    }else if(lugarNacimiento.equals("Tlaxcala")){
        nuevaLetra = "TL";
    }else if(lugarNacimiento.equals("Tabasco")){
        nuevaLetra = "TC";
    }else if(lugarNacimiento.equals("Sonora")){
        nuevaLetra = " SR";
    }else if(lugarNacimiento.equals("San Luis Potosí")){
        nuevaLetra = "SP";
    }else if(lugarNacimiento.equals("Sinaloa")){
        nuevaLetra = "SL";
    }else if(lugarNacimiento.equals("Querétaro")){
        nuevaLetra = "QT";
    }else if(lugarNacimiento.equals("Quintana Roo")){
     nuevaLetra = "QR";   
    }else if(lugarNacimiento.equals("Puebla")){
        nuevaLetra = "PL";
    }else if(lugarNacimiento.equals("Oaxaca")){
        nuevaLetra = "OC";
    }else if(lugarNacimiento.equals("Nayarit")){
        nuevaLetra = "NT";
    }else if(lugarNacimiento.equals("Nuevo León")){
        nuevaLetra = "NL";
    }else if(lugarNacimiento.equals("Morelos")){
        nuevaLetra = "MS";
    }else if(lugarNacimiento.equals("Michoacán de Ocampo")){
        nuevaLetra = "MN";
    }else if(lugarNacimiento.equals("México")){
     nuevaLetra = "MC";   
    }else if(lugarNacimiento.equals("Jalisco")){
        nuevaLetra = "JC";
    }else if(lugarNacimiento.equals("Hidalgo")){
        nuevaLetra = "HG";
    }else if(lugarNacimiento.equals("Guanajuato")){
        nuevaLetra = "GT";
    }else if(lugarNacimiento.equals("Guerrero")){
        nuevaLetra = "GR";
    }else if(lugarNacimiento.equals("Durango")){
        nuevaLetra = "DG";
    }else if(lugarNacimiento.equals("Ciudad de México")){
        nuevaLetra = "DF";
    }else if(lugarNacimiento.equals("Chiapas")){
        nuevaLetra = "CS";
    }else if(lugarNacimiento.equals("Colima")){
        nuevaLetra = "CM";
    }else if(lugarNacimiento.equals("Coahuila de Zaragoza")){
        nuevaLetra = "CL";
    }else if(lugarNacimiento.equals("Chihuahua")){
        nuevaLetra = "CH";
    }else if(lugarNacimiento.equals("Campeche")){
        nuevaLetra = "CC";
    }else if(lugarNacimiento.equals("Baja California Sur")){
        nuevaLetra = "BS";
    }else if(lugarNacimiento.equals("Baja California")){
        nuevaLetra = "BC";
    }else if(lugarNacimiento.equals("Aguascalientes")){
        nuevaLetra = "AS";
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