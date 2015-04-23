// Programa de dividir.
// Interfaz grafico.

package division;
import net.mindview.util.*;
import java.util.*;
import java.lang.*;
import java.io.*;
import java.awt.*;
import java.sql.*;


public class Division {
    private double dividendo;
    private double divisor;
    private double cociente;
    
    public double getDividendo() {
        return dividendo;
    }
    public void setDividendo(double dividendo) {
        this.dividendo = dividendo;
    }
    public double getDivisor() {
        return divisor;
    }
    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }
    public double getCociente() {
        return cociente;
    }
    public void setCociente() {
        this.cociente = dividendo / divisor;
    }
    public void setCociente(double cociente) {
        this.cociente = cociente;
    }
}
