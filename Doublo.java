// package questao2;

import java.util.Scanner;
// import java.io.BufferReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Doublo{
	Scanner in = new Scanner(System.in);

	double a;
	float b;
	int c;


	public  Doublo(){}

	public void setFloat(float b){
		this.b = b;
	}

	public float getFloat(){
		return this.b;
	}

	private void setDouble(double a){
		this.a = a;
	}

	private double getDouble(){
		return this.a;
	}

	private void setInt(int c){
		this.c = c;
	}

	private int getInt(){
		return this.c;
	}

	private void salva1(){
		double a  = 0;
		String str;
		Scanner in = new Scanner(System.in);
		while (true){
			// JOptionPane.showMessageDialog(null,"Digite :","Entrada de numero",JOptionPane.PLAIN_MESSAGE);
			str = in.nextLine(); 
			
			try{
				a = Double.parseDouble(str);
				break;
			}
			catch(NumberFormatException b){
				JOptionPane.showMessageDialog(null,"Digite um valor de ponto flutante \"12.12 ou  12\"","ERRo de entrada",JOptionPane.WARNING_MESSAGE);
			}
		}
		setDouble(a);
	}

	private void salva2(){
		float b  = 0;
		String str;
		while (true){
			// JOptionPane.showMessageDialog(null,"Digite :","Entrada de numero",JOptionPane.PLAIN_MESSAGE);
			str = in.nextLine(); 
			
			try{
				b = Float.parseFloat(str);
				break;
			}
			catch(NumberFormatException m){
				JOptionPane.showMessageDialog(null,"Digite um valor de ponto flutante \"12.12 ou  12\"","ERRo de entrada",JOptionPane.WARNING_MESSAGE);
			}
		}
		setFloat(b);
	}

	private void salva3(){
		int c  = 0;
		String str;
		while (true){
			 // JOptionPane.showMessageDialog(null,"Digite :","Entrada de numero",JOptionPane.PLAIN_MESSAGE);
			str = in.nextLine(); 
			
			try{
				c = Integer.parseInt(str);
				break;
			}
			catch(NumberFormatException m){
				JOptionPane.showMessageDialog(null,"Digite um valor de ponto flutante \"12.12 ou  12\"","ERRo de entrada",JOptionPane.WARNING_MESSAGE);
			}
		}
		setInt(c);
	}
	
	public double toDouble(){
		salva1();
		return getDouble();
	}


	public float toFloat(){
		salva2();
		return getFloat();
	}

	public int toInt(){
		salva3();
		return getInt();
	}

}