public class Main {

	public static void main(String[] args) {

		int[] input = {1,0,0,0,0}; //entrada a evaluar
		int inicio = 1;  //estado de inicio
		int finalizar = 1; //estado final
		int actual = inicio; //estado actual

		boolean fin = false; //variable para evaluar y romper el ciclo

		int contador = 0; //contador para ciclar
		while(fin==false) //iteracion para evaluar
		{
			if(contador > input.length-1) //comienza evaluacion estado 1
			{
				fin = true;
				break;
			}
			if(actual==1)
			{
				if(input[contador]==1)
				{
					actual=1;
				}
				if(input[contador]==0)
				{
					actual=2;
				}
				contador++;
				continue;   //finaliza evaluacion estado 2
			}
			if(actual==2)   //comienza evaluacion estado 2
			{
				if(input[contador]==1)
				{
					actual=2;
				}
				if(input[contador]==0)
				{
					actual=1;
				}
				contador++;
				continue;
			}
		}           //finaliza evaluacion estado 2

		if(actual==finalizar) //evalua los estados, y si el estado inicial es igual al final entonces
                              //la cadena es correcta al menos para este automata
		{
			System.out.println("La cadena es correcta");
		}
		else
		{
			System.out.println("La cadena es incorrecta"); //obviamente si cambiamos los valores de entrada entonces
                                                           // el automata terminaria en diferente estado y la cadena seria incorrecta
		}

	}

}