package Proyecto;

import java.io.*;
import javax.swing.JOptionPane;

public class GenerateInfoFiles {

	public  void Escribir(String nombre) {
		
		File f;
		FileWriter w;
		BufferedWriter bw;
		PrintWriter wr;
		
		try {
			
			f = new File(nombre);
			w = new FileWriter(f);
			bw = new BufferedWriter(w);
			wr = new PrintWriter(bw);
			
			wr.write("Esto es nuestra primer línea de prueba\n");
			wr.append("Esta es nuestra segunda línea de prueba\n");
			wr.append("Esta es nuestra línea final de prueba");
			
			wr.close();
			bw.close();
			
		} catch(Exception e){
			JOptionPane.showMessageDialog(null, "Ha ocurrido un error" + e);
		}
		

	}

}
