/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author est.joao.f
 */
public class fazoperacoes {
    private int num1,num2;
    private float result;
    
    public float fazsoma(int n1,int n2)
    {
        this.setNum1(n1);
        this.setNum2(n2);
        
        this.setResult(n1+n2);
        
        return getResult();
    }
    
    public float fazsub(int n1,int n2)
    {
        this.result=n1-n2;
        
        
        return result;
    }
    
    public float fazmult(int n1,int n2)
    {
        this.result=n1*n2;
        
        
        return result;
    }
    
    public float fazdiv(int n1,int n2)
    {
        this.result=n1/n2;
        
        
        return result;
    }
    
    
 

     
     
    
    
  
    
    
    
    
    
    
    
    // métodos acessores e mutantes 
    public int getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public int getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    /**
     * @return the result
     */
    public float getResult() {
        return result;
    }

    /**
     * @param result the result to set
     */
    public void setResult(float result) {
        this.result = result;
    }
    
    
    
}
