/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5;

import javax.swing.JOptionPane;

/**
 *
 * @author RICK LOPEZ
 */
public class Procesos {
    private double radio;
    private double arista;
    private double area;
    private double volumencubo;
    private double volumenesfera;
    private double perimetro;
    private double promedio;
   private double vector[]=new double[10];

    public double[] getVector() {
        return vector;
    }

    public void setVector(double[] vector) {
        this.vector = vector;
    }
    

   public double[]llenarVector() {
 
       
       for(int i=0;i<10;i++){
          this.vector[i]=Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el numero en la posicion #"+(i+1)));
       }
        return null;
   }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getVolumencubo() {
        this.volumencubo=(arista)*(arista)*(arista);
        return volumencubo;
    }

    public void setVolumencubo(double volumencubo) {
        this.volumencubo = volumencubo;
    }

    public double getVolumenesfera() {
        this.volumenesfera=(3.1416)*(radio)*(radio)*(radio);
        return volumenesfera;
    }

    public void setVolumenesfera(double volumenesfera) {
        this.volumenesfera = volumenesfera;
    }

    public double getPerimetro() {
        this.perimetro=(2)*(3.1416)*(radio);
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getPromedio() {
         double suma=0;
        double media=0;
        for(int i=0;i<10;i++){
           suma=vector[i]+suma;
        }
        media=suma/10;
        promedio=media;
        return promedio;
    }

    public void setPromedio(double promedio) {
       
        this.promedio = promedio;
    }
    
    
   
}
