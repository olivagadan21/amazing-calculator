package calculator;

public class IncredibleCalculator {
	public static void main(String[] args) {

        System.out.println("Selecciona la operaci�n que prefieras realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir (divisi�n entera)");
        System.out.println("5. Dividir (divisi�n con decimales)");

        int opcion = leerEnteroEntrada();


        switch (opcion) {
            case 1: 
            	//Aqu� deber�a ir el c�digo que realizar�a la suma de los n�meros escaneados.
                    break;
            case 2: 
            	//Aqu� deber�a ir el c�digo que realizar�a la resta de los n�meros escaneados.
                    break;
            case 3:
            	//Aqu� deber�a ir el c�digo que realizar�a la multiplicaci�n de los n�meros escaneados.
                    break;
            case 4: 
            	//Aqu� deber�a ir el c�digo que realizar�a la divisi�n con n�meros enteros de los n�meros escaneados.
                    break;
            case 5: 
            	
                    break;

        }

    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static int resta(int a, int b) {
        return a - b;
    }

    public static int multiplicacion(int a, int b) {
        return a * b;
    }

    public static int divisionEntera(int a, int b) {
        return a / b;
    }

    public static double divisionConDecimales(int a, int b) {
        return a / (b * 1.0);
        
    }

    public static int leerEnteroEntrada() {
        try {
            Scanner sc = new Scanner(System.in);
            int result = Integer.parseInt(sc.next());
            sc.close();
            return result;
        } catch (NumberFormatException ex) {
            System.err.println("Lo que has introducido no es un n�mero entero!");
            System.exit(1);
            return -1;
        }

    }
}
