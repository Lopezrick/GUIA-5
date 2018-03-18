package guia5;

import javax.swing.JOptionPane;

public class Analizar {
    private boolean flash;
    private int cpu;
    private double pantalla;
    private double ram;
    private int garantia;
    private double precio;
    private double pixels;
    private int marca;
    private int bateria;

    public Analizar(boolean flash, int cpu, double pantalla, double ram, int garantia, double precio, double pixels, int marca, int bateria) {
        this.flash = flash;
        this.cpu = cpu;
        this.pantalla = pantalla;
        this.ram = ram;
        this.garantia = garantia;
        this.precio = precio;
        this.pixels = pixels;
        this.marca = marca;
        this.bateria = bateria;
    }

    Analizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    public void setFlash(boolean flash) {
        this.flash = flash;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public void setPantalla(double pantalla) {
        this.pantalla = pantalla;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setPixels(double pixels) {
        this.pixels = pixels;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    

    
    public void mostrar(){
       double suma=0;
       if(pantalla<=4){
           if(bateria<=1200){
               suma=suma+3;
           }
           else 
           if(bateria>=1200 && bateria<=2400){
               suma=suma+4;
           }
            if(bateria>=2400 && bateria<=3100){
               suma=suma+5;
           }
            else{
           suma=suma+6;
       }
       }
       else if(pantalla<=5 && pantalla>4){
           if(bateria<=1200){
               suma=suma+1;
           }
           else 
           if(bateria>=1200 && bateria<=2400){
               suma=suma+2;
           }
            if(bateria>=2400 && bateria<=3100){
               suma=suma+3;
           }
            else{
           suma=suma+4;
       }
       }
       else if(pantalla<=6.7 && pantalla>5){
         if(bateria<=1200){
               suma=suma+0;
           }
           else 
           if(bateria>=1200 && bateria<=2400){
               suma=suma+1;
           }
            if(bateria>=2400 && bateria<=3100){
               suma=suma+2;
           }
            else{
           suma=suma+3;
       }  
       }       
        if(marca<=5){
            suma=suma+4;
        }
        else if(marca>5 && marca<=8){
             suma=suma+3;
        }
        else if(marca==9){
             suma=suma+2;
        }
    if(precio<100){
         suma=suma+2;
    }
    else if(precio>=100 && precio<350){
         suma=suma+3;
    }
    else if(precio>=350){
         suma=suma+4;
    }
    if (garantia<=3){
         suma=suma+1;
    }
    else if(garantia>3 && garantia<=6){
         suma=suma+2;
    }
    else if(garantia>6){
         suma=suma+4;
    }
    if(cpu<2){
         suma=suma+0;
    }
    else if(cpu>2 && cpu<=4){
         suma=suma+1;
    }
     else if(cpu>4 && cpu<=6){
         suma=suma+2;
    }
    else if(cpu>6 ){
         suma=suma+3;
    }
    if(ram<1){
        suma=suma+0; 
    }
    else if(ram>=1 && ram <2){
         suma=suma+2;
    }
    else if(ram>=2 && ram <4){
         suma=suma+4;
        
    }
    else if(ram>4){
         suma=suma+6;
    }
    if(pixels<=5){
         suma=suma+1;
        
    }
    else if(pixels>5 && pixels <=8){
         suma=suma+2;
    }
    else if(pixels>8){
         suma=suma+3;
    }
    if(flash==false){
         suma=suma-1;
    }
    if (suma<=7){
        JOptionPane.showMessageDialog(null,"No es buena inversion");
    }
    else if (suma>7 && suma<=14){
       JOptionPane.showMessageDialog(null,"Inversion de riesgo"); 
    }
    else if (suma>14 && suma<=21){
       JOptionPane.showMessageDialog(null,"La inversion es viable"); 
    }
    else if (suma>21 ){
       JOptionPane.showMessageDialog(null,"Es una buena inversion"); 
    }
    }
}
