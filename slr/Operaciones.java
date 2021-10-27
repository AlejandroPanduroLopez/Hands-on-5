package slr;


import java.util.Scanner;
public class Operaciones {
    
//Xi 
public int OperacionX1(int numeros[]){
     int resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=numeros[i];  
      }  
  return resultado;
} 
//X^2i
public int OperacionX2(int numeros[]){
    int resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=Math.pow(numeros[i],2);
    }
    return resultado;
}
//Yi
public int OperacionY1(int numeros[]){
    int resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=numeros[i];    
    }
    return resultado;
}
//Xi*Yi
public int OperacionMulti(int numeros[],int numeros2[]){
    int resultado=0;
    for(int i=0;i<numeros.length;i++){
        resultado+=(numeros[i]*numeros2[i]);
    }
    return resultado;
} 
}
