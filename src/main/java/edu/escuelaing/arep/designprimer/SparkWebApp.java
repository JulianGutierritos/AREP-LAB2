package edu.escuelaing.arep.designprimer;


import static spark.Spark.*;
import edu.escuelaing.arep.designprimer.model.*;
public class SparkWebApp {

	public static void main(String[] args) {
		 port(getPort());
		 staticFiles.location("/static");
		 post("/calcular",(req, res) -> {
			String valores[] = req.body().split(",");
			try {
				Lista lista = new LinkedList();
				double numero;
				for(String val : valores){
					numero = Double.parseDouble(val);
					lista.add(numero);
				}
				return CalculadoraApp.calcularMediaYDesviacion(lista);
			}catch (NumberFormatException e){
				return "error de parseo";
			}
        });
	}
	
	static int getPort() {
		if (System.getenv("PORT") != null) {
			return Integer.parseInt(System.getenv("PORT"));
		}
		return 4567; //returns default port if heroku-port isn't set (i.e. on localhost)
	}
}