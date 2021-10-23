import javax.swing.JOptionPane;


public class Sudoku{
	public static void main(String[] args) {
		Doublo d = new Doublo();

		SudokuHelp s = new SudokuHelp();

		s.intialize();

		while (true){
			s.print();
			System.out.println("Digite o valpor a ser inserido no jogo");
			int valor = d.toInt();
			while(valor<=0 || valor> 9){
				System.out.println("VAlor ultrapassa os limites do jogo");
				valor = d.toInt();
			}
			System.out.println("Digite as cordenad\ndigite a cordenad de i");
			int i = 0, j = 0;
			i = d.toInt();
			while(valor<=0 || valor> 9){
				System.out.println("VAlor ultrapassa os limites do jogo");
				i = d.toInt();
			}

			System.out.println("Digite a cordenada de j");
			j = d.toInt();

			while(valor<=0 || valor> 9){
				System.out.println("VAlor ultrapassa os limites do jogo");
				j = d.toInt();
			}
			s.insere(valor, i,j);
			int sair = 1;
			System.out.println("Digite 0 para sair do jogo");
			sair = d.toInt();
			if(sair != 1){
				s.print();
				break;
			}

		}





	}
}