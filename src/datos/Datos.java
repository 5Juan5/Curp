package datos;
import javax.swing.JOptionPane;
import dominio.*;
import javax.swing.JComboBox;
import javax.swing.JDialog;

public class Datos {
    public static void main(String[] args) {
        String[] dias= {"---","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20"
                ,"21","22","23","24","25","26","27","28","29","30","31"};
        String[] meses= {"---","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        String[] sexos= {"---","H","M"};
        String[] entidad= {"---","CiudaddeMéxico","Aguascalientes","BajaCalifornia","BajaCalifornia","BajaCaliforniaSur","Campeche"
                ,"Chiapas","Chihuahua","Coahuila","CoahuailadeZaragoza","Colima","Durango","Guanajuato","Guerrero","Hidalgo","Jalisco"
                ,"México","MichoacándeOcampo","Morelos","Nayarit","Nuevo León","Oaxaca","Puebla","Querétaro","QuintanaRoo","SanLuisPotosí"
                ,"Sinaloa","Sonora","Tabasco","Tamaulipas","Tlaxcala","Veracruz","Yucatán","Zacatecas"};
        String nombre,nombre2 , apeP, apeM, year, curp = "";
        nombre =  JOptionPane.showInputDialog(null,"Nombre:","Digite nombre",-1);
        nombre2 =  JOptionPane.showInputDialog(null,"NOTA: en caso de no tener dar 'enter' o 'aceptar'.","Digite segundo nombre: ",-1);
        apeP = JOptionPane.showInputDialog(null,"APELLIDO PATERNO","Digite su apellido paterno",-1);
        apeM = JOptionPane.showInputDialog(null,"APELLIDO MATERNO","Digite su apellido materno",-1);
        Object dia = JOptionPane.showInputDialog(null,"DIA NACIMIENTO","Digite su dia de naciemiento",JOptionPane.QUESTION_MESSAGE,null,dias, dias[0]);
        Object mes = JOptionPane.showInputDialog(null,"MES NACIMIENTO","Digite su mes de nacimiento",JOptionPane.QUESTION_MESSAGE,null, meses, meses[0]);
        year = JOptionPane.showInputDialog(null,"AÑO NACIMIENTO","Digite su año de nacimiento",-1);
        Object sexo = JOptionPane.showInputDialog(null,"SEXO","Digite su sexo",JOptionPane.QUESTION_MESSAGE,null, sexos, sexos[0]);
        Object lugar = JOptionPane.showInputDialog(null,"Lugar","Digite su entdad federativa",JOptionPane.QUESTION_MESSAGE,null,entidad,entidad[0]);
        if(nombre2.equals("")){
            Dominio d = new Dominio(nombre,nombre2,apeP, apeM, year.toUpperCase(), (String) mes, (String) dia, (String) lugar, (String) sexo);
            curp = d.primerLetra(apeP)+d.primerVocal()+d.primerLetra(apeM)+d.nombrePila(nombre, nombre2)+d.yearDayMonth(Estado.valueOf((String)mes), dia , year)+d.sexo()+d.entidad(Estado.valueOf((String)lugar))+d.primer_Constante()+d.primer_ConstantSegundoApllido()+d.ConstanteNombrePlia()+d.ultimosDigitos()+d.codigoVerificador();
            JOptionPane.showMessageDialog(null, "CURP: "+curp+"\nDATOS\nNombre: "+d.getNombre()+"\nApellido Paterno: "
                +d.getApellidoP()+"\nApellido materno: "+d.getApellidom()+"\nDia de nacimiento: "+d.getDiaNacimiento()+"\nMes de nacimiento: "+d.getMesNacimiento()
            +"\nAño de nacimiento: "+d.getYearNacimidento());
        }else{
            Dominio d = new Dominio(nombre, nombre2 , apeP, apeM, year.toUpperCase(), (String) mes, (String) dia, (String) lugar, (String) sexo);
            curp = d.primerLetra(apeP)+d.primerVocal()+d.primerLetra(apeM)+d.nombrePila(nombre, nombre2)+d.yearDayMonth(Estado.valueOf((String)mes), dia, year)+d.sexo()+d.entidad(Estado.valueOf((String)lugar))+d.primer_Constante()+d.primer_ConstantSegundoApllido()+d.ConstanteNombrePlia()+d.ultimosDigitos()+d.codigoVerificador();
            JOptionPane.showMessageDialog(null, "CURP: "+curp+"\nDATOS\nNombre: "+d.getNombre()+"\nSegundo nombre: "+d.getNombre2()+"\nApellido Paterno: "
                +d.getApellidoP()+"\nApellido materno: "+d.getApellidom()+"\nDia de nacimiento: "+d.getDiaNacimiento()+"\nMes de nacimiento: "+d.getMesNacimiento()
            +"\nAño de nacimiento: "+d.getYearNacimidento());
        }
        
    }
}