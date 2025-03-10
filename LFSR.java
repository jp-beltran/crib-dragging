package aula04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LFSR {
	private static int[] cabeca = new int[32];
	private static int[] reg0 = new int[32];
	private static int[] reg1 = new int[32];
	
	private static void inicializar(int[] registrador) {
		BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Digite uma senha de 4 letras: ");
			String chave = leitor.readLine();
			
			for(int letra=0; letra<4; letra++) {
				int decimal = chave.charAt(letra);
				String binario = Integer.toBinaryString(decimal);
				
				for(int i=0; i<(8-binario.length()); i++) {
					binario = "0" + binario;
				}
				
				for(int i = 0; i<8; i++) {
					registrador[(letra * 8) + i] = Integer.parseInt(binario.substring(i,i+1));
				}
			}
			
		}catch(Exception error){
			System.out.println("Erro!" + error);
			
		}
		
	}
	public static void main(String[] args) {
		inicializar(cabeca);
		inicializar(reg0);
		inicializar(reg1);
		
		pseudoAleatorizar();
		
	}
	
	private static void pseudoAleatorizar() {
		String byteFinal = "";
		
		for(int i=0; i < 8192; i++) { //1KByte
			int bitFinal = 0;
			int bit0 = 0;
			int bit1 = 0;
			
			if(shiftar(cabeca,0) == 0) {
				bit0 = shiftar(reg0, 0);
				bit1 = reg1[0];
				
			}else {
				bit0 = reg0[0];
				bit1 = shiftar(reg1, 0);
			}
			
			bitFinal = (bit0 ^bit1);
			byteFinal += ("" + bitFinal);
			if((i%8) == 7) {
				System.out.print((char) Integer.parseInt(byteFinal, 2));
				byteFinal = "";
			}
		}
	}
	
	private static int shiftar(int[] registrador, int tipo) {
		int retorno = 0;
		int novo = 0;
		
		if(tipo == 0) {
			novo = (registrador[31] ^
					registrador[6] ^
					registrador[4] ^
					registrador[2] ^
					registrador[1] ^
					registrador[0]
					);
					
		}else {
			novo = (registrador[31] ^
					registrador[6] ^
					registrador[5] ^
					registrador[1] 
					);
					
		}
		
		retorno = registrador[0];
		for(int i=0; i<31; i++) {
			registrador[i] = registrador[i+1];
		}
		
		registrador[31] = novo;
		return retorno;
	}
}
