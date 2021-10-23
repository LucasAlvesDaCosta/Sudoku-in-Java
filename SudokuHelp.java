import java.util.Random;


public class SudokuHelp{
	private int[][] orig = new int[9][9];
	private int[][] copia = new int[9][9];

	SudokuHelp(){}


	private int verifyhori(){
		int veri = 0, key = 0;
		for(int n = 0; n < 9; n++){

			for(int i = 0;i < 9; i++){

				for(int j = 0; j < 9; j++){
					if(orig[n][j] == orig[n][i] && i != j){
						veri = 1;
					}
				}
			}
		}
		return veri;
	}

	private int verifyverti(){
		int veri = 0;

		for(int n = 0; n < 9; n++){
			for(int i = 0; i < 9; i++){
				for(int j = 0; j < 9; j++){
					if(orig[j][n] == orig[i][n] && i != j){
						veri = 1;
					}
				}
			}
		}
		return veri;
	}

	private int veriquadrante(int k, int quad){
		int ini = 0, inj = 0, fi = 0, fj = 0 ;
		if(quad == 1){
			fi = 3;
			fj = 3;
		}
		else if(quad == 2){
			fi = 3;
			fj = 6;
		}
		else if(quad == 3){
			fi = 3;
			fj = 9;
		}
		else if(quad == 4){
			fi = 6;
			fj = 3;
		}
		else if(quad == 5){
			fi = 6;
			fj = 6;
		}
		else if(quad == 6){
			fi = 6;
			fj = 9;
		}
		else if(quad == 7){
			fi = 9;
			fj = 3;
		}
		else if( quad ==8){
			fi = 9;
			fj = 6;
		}
		else {
			fi = 9;
			fj = 9;
		}

		ini = fi - 3;
		inj = fj - 3;

		for (int i = ini; i < fi; i++){
			for(int j = inj; j < fj; j++){
				if(orig[i][j] == k){
					return 1;
				}
			}
		}
		return 0;
	}

	private void copy(){
		for(int i = 0; i < 9; i ++){
			for(int j = 0; j < 9; j++){
				copia[i][j] = orig[i][j];
			}
		}
	}



	private int identificaquad(int i, int j){
		if(i <3){
			if(j < 3){
				return 1;
			}
			else if( j < 6 && j >=3){
				return 2;
			}
			else return 3;
		}
		else if(i < 6 && i >=3){
			if(j < 3){
				return 4;
			}
			else if(j >=3 && j < 6){
				return 5;
			}
			else return 6;
		}
		else{
			if(j < 3){
				return 7;
			}
			else if(j >=3 && j < 6){
				return 8;
			}
			else return 9;	
		}
	}


	private int verificah(int k, int j){
		for(int i = 0; i < 9; i++){
			if(orig[j][i] == k){
				return 1;
			}
		}
		return 0;
	}


	private int verificav(int k, int j){
		for(int i = 0; i < 9; i++){
			if(orig[i][j] == k){
				return 1;
			}
		}
		return 0;
	}


	public void insere(int valor,int i, int j){
		
		int veri = 0;
		veri = verificav(valor, j); 
		veri += verificah(valor, i);
		int quad = identificaquad(i, j);
		veri += veriquadrante(valor, quad);
		
		if(veri ==0){
			if(copia[i][j] != 0){
				System.out.println("valor não iserido, por que  ja existe um valor no jogo");	
			}
			else{
				orig[i][j] = valor;
			}
		}
		else{
			System.out.println("valor não iserido, por que ele ja existe no jogo");
		}
	}


	public void intialize(){
		for(int r = 0; r < 9; r ++){
			for(int s = 0; s < 9; s++){
				copia[r][s] = 0;
			}
		}

		Random d = new Random();

		// int i = d.nextInt(9), j = d.nextInt(9);

		for(int n = 0; n < 9; n++){
			int i = d.nextInt(9), j = d.nextInt(9);
			int tmp = d.nextInt(9); 
			if(tmp ==0){
				tmp = 1;
			}
			insere(tmp, i, j);
		}

		copy();
	}

	public void print(){
		System.out.println("Jogo Sudoku");
		for(int i = 0; i < 9; i ++){
			for(int j = 0; j < 9; j++){
				System.out.printf("\t%d",orig[i][j]);
			}
			System.out.println();
		}
	}

	public void valida(){
		int veri = 0;
		veri = verifyverti();
		veri+= verifyhori();
		if(veri == 0){
			System.out.println("Jogo valido ");
		}
		else{
			System.out.println("Jogo invalido");
		}
	}

}
