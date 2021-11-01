
package dominio;
public enum Estado {
    Zacatecas("ZS"),
    Yucatán ("YN"),
    Veracruz("VZ"),
    Tamaulipas("TS"),
    Tlaxcala("TL"),
    Tabasco("TC"),
    Sonora("SR"),
    SanLuisPotosi("SP"),
    Sinaloa("SL"),
    Querétaro("QT"),
    QuintanaRoo("QR"),
    Puebla("PL"),
    Oaxaca("OC"),
    Nayarit("NT"),
    NuevoLeon("NL"),
    Morelos("MS"),
    MichoacanDeOcampo("MN"),
    Mexico("MC"),
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
    Aguacalientes("AS");
    
     private final String  nuevaLetra;
    
     Estado(String letra){
         this.nuevaLetra =  letra;
     }
     
     public String getEstado(){
         return this.nuevaLetra;
     }
}
