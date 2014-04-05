
package jppairprograming;

public class Exercicio4 {
    
    public Exercicio4(int v){
        tabuada(v);
    }
    
    private void tabuada(int v){
        System.out.println("--------------Tabuada------------");
        for(int i=1;i<=10;i++){
            if(isprimo((v*i))){                
                System.out.printf(v+" x "+i+" = %d é primo\n",(v * i));
            }else{
                System.out.printf(v+" x "+i+" = %d \n",(v * i));
            }            
        }                       
    }
    
    public boolean isprimo(int valor){
        boolean primo = true;
        for(int i = (valor/2); i > 1;i--){
            if (valor %(i) == 0)
            {
                primo = false;  
            }
        }
        return primo;
    }
}
    