
package javaapplication9;

public class ShelSort {

    public static void main(String[] args) {
         int m[] = {2,7,1,0,5,4};
         System.out.println("Antes de aplicar o metodo");
          for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]+" ");
        }
        shelsort(m);
          System.out.println("\n Depois de aplicar o metodo");
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]+" ");
        }
        
    }
        public static void shelsort(int []num){
int i, j, aux, n = num.length; 
boolean trocou;
int h = n/2;  //n representa o tamanho do vetor
while( h >0 ){ 
	i = h; // A variavel i compara os numeros segundo a distancia calculada
	while(i<num.length){ // nessa parte procura-se obter um valor superior entre os comparados
		aux = num[i];//  variavel aux armazena temporaria o primeiro valor a comparar
		j = i-h;
		trocou = true;
		while(j>=0 && num[j] > aux){ // trocar a posicao dos valores caso o primeiro seja maior
			trocou = true;
			num[j+h] = num[j];
			j-=h;
		}
		if(trocou){ 
			num[j+h] = aux;
		}
		i+=1;
	}
	h/=2;// calcula novamente o h para obter o numero das distancias de comparação
}

}
    }
    

