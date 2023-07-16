
package View;

import Class.Capturar;


public class Tienda {
    
    public static void main(String[] args) {
        
        Integer cantidad, i, contApr, contDes;
        Double porApr, porDes, nota;
        
           Capturar cap = new Capturar();
           cap.setMensaje("--DIGITE LA CANTIDAD DE APRENDICEZ--");
           cantidad =cap.Capturar().intValue();
           
            i=0;
        contApr=0;
        contDes=0;
        while (i<cantidad) {
            nota=0.0;
            i++;
            do {  
                cap.setMensaje("--DIGITE LAS NOTAS DE LOS APRENDICEZ  "+i+": ");
                nota = cap.Capturar();
            } while (nota<=0 || nota >100);
            
            if(nota>=70){
                contApr++;
            }else{
                contDes++;                
            }              
        }
        porApr=(double)(contApr*100/cantidad);
        porDes=(double)(contDes*100/cantidad);
        
        System.out.println("DE  "+ cantidad +"       aprobo  %"  +porApr);
         System.out.println("DE  "+  cantidad  +"    desaprobó % "+porDes);
    }
    }
    

