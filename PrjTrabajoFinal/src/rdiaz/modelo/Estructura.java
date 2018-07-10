package rdiaz.modelo;

public class Estructura {
    int decimal;
    int binario;
    int octal;
    String hexadecimal = "";

    public Estructura(int decimal,int binario,int octal,String hexadecimal) {
        this.decimal = decimal;
        this.binario = binario;
        this.octal = octal;
        this.hexadecimal = hexadecimal;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public int getBinario() {
        return binario;
    }

    public void setBinario(int binario) {
        this.binario = binario;
    }

    public int getOctal() {
        return octal;
    }

    public void setOctal(int octal) {
        this.octal = octal;
    }

    public String getHexadecimal() {
        return hexadecimal;
    }

    public void setHexadecimal(String hexadecimal) {
        this.hexadecimal = hexadecimal;
    }
        
}