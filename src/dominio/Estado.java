
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
    Mexico("MC");
    
    
     private final String  nuevaLetra;
    
     Estado(String letra){
         this.nuevaLetra =  letra;
     }
}
