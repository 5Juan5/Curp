
package dominio;
public enum Estado {
    Zacatecas("ZS"),
    Yucatán ("YN"),
    Veracruz("VZ"),
    Tamaulipas("TS"),
    Tlaxcala("TL"),
    Tabasco("TC"),
    Sonora("SR"),
    SanLuisPotosí("SP"),
    Sinaloa("SL"),
    Querétaro("QT"),
    QuintanaRoo("QR"),
    Puebla("PL"),
    Oaxaca("OC"),
    Nayarit("NT"),
    NuevoLeon("NL"),
    Morelos("MS"),
    MichoacanDeOcampo("MN"),
    México("MC"),
    Jalisco("JC"),
    Hidalgo("HG"),
    Guanajuato("GT"),
    Gurrero("GR"),
    Durango("DG"),
    CiudadDeMexico("DF"),
    Chiapas("CS"),
    Colima("CM"),
    CoahuilaDeZaragoza("CL"),
    Chihuahua("CH"),
    Campeche("CC"),
    BajaCaliforniaSur("BS"),
    BajaCalifornia("BC"),
    Aguacalientes("AS"),
    Enero("01"),
    Febrero("02"),
    Marzo("03"),
    Abril("04"),
    Mayo("05"),
    Junio("06"),
    Julio("07"),
    Agosto("08"),
    Septiembre("09"),
    Octubre("10"),
    Noviembre("11"),
    Diciembre("12");
    
     private final String  nuevaLetra;
    
     Estado(String letra){
         this.nuevaLetra =  letra;
     }
     
     public String getEstado(){
         return this.nuevaLetra;
     }
}
