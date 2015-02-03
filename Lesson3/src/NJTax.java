public class NJTax extends Tax {
	 public double calcTax() {         
	      double  stateTax=0;
	      if (grossIncome <= 50000) {
	        stateTax=grossIncome*0.06;
	      }
	      else{
	        stateTax= grossIncome*0.08;
	      } 
	      
	      return stateTax;
	}

}