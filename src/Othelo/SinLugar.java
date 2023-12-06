package Othelo;

import javax.swing.JButton;

public class SinLugar {
	
	Revision rev = new Revision();

	public boolean TurnoExtra( int contador, JButton array[][], boolean ginet ){
		try {
			for(int x=0;x<8;x++){
				for(int y=0;y<8;y++){

					if((x!=0) && (y!=0) && (x!=7) && (y!=7) && (array[x][y].getText().equals("boton "+ x +" , " + y))) {
						int g=(x-1);
						int m=(y-1);
						for(int i=(x-1);i<(g+3);i++){//revisar el alrededor de la casilla 
							for(int j=(y-1);j<(m+3);j++){//del color diferente al que esta jugando
								if((contador%2)==0) {
									if(array[i][j].getText().equals("blancas")) {
										ginet=rev.revBlancas(i,j,x,y,array,ginet);
									}
								}else {
									if(array[i][j].getText().equals("negras")) {
										ginet=rev.revNegras(i,j,x,y,array,ginet);
									}
								}
							}
						}

					}
					else if((x==0) && (y==0)&& (array[x][y].getText().equals("boton "+ x +" , " + y))){
						for(int i=x;i<2;i++){//revisar el alrededor de la casilla 
							for(int j=y;j<2;j++){//del color diferente al que esta jugando
								if((contador%2)==0) {
									if(array[i][j].getText().equals("blancas")) {
										ginet=rev.revBlancas(i,j,x,y,array,ginet);

									}
								}else {
									if(array[i][j].getText().equals("negras")) {
										ginet=rev.revNegras(i,j,x,y,array,ginet);

									}
								}
							}
						}
					}
					else if((x==0) && (y!=0) && (y!=7)&& (array[x][y].getText().equals("boton "+ x +" , " + y))){
						int m=y;
						for(int i=(x);i<2;i++){//revisar el alrededor de la casilla 
							for(int j=(y-1);j<(m+2);j++){//del color diferente al que esta jugando
								if((contador%2)==0) {
									if(array[i][j].getText().equals("blancas")) {
										ginet=rev.revBlancas(i,j,x,y,array,ginet);
									}
								}else {
									if(array[i][j].getText().equals("negras")) {
										ginet=rev.revNegras(i,j,x,y,array,ginet);
										
									}
								}
							}
						}
					}
					else if((x!=7) && (x!=0) && (y==0)&& (array[x][y].getText().equals("boton "+ x +" , " + y))){
						for(int i=(x-1);i<(x+2);i++){//revisar el alrededor de la casilla 
							for(int j=y;j<2;j++){//del color diferente al que esta jugando
								if((contador%2)==0) {
									if(array[i][j].getText().equals("blancas")) {
										ginet=rev.revBlancas(i,j,x,y,array,ginet);
									}
								}else {
									if(array[i][j].getText().equals("negras")) {
										ginet=rev.revNegras(i,j,x,y,array,ginet);

									}
								}
							}
						}
					}
					else if((x==7) && (y==7)&& (array[x][y].getText().equals("boton "+ x +" , " + y))){
						for(int i=(x-1);i<(x+1);i++){//revisar el alrededor de la casilla 
							for(int j=(y-1);j<(y+1);j++){//del color diferente al que esta jugando
								if((contador%2)==0) {
									if(array[i][j].getText().equals("blancas")) {
										ginet=rev.revBlancas(i,j,x,y,array,ginet);
									}
								}else {
									if(array[i][j].getText().equals("negras")) {
										ginet=rev.revNegras(i,j,x,y,array,ginet);

									}
								}
							}
						}
					}
					else if((x==7) && (y==0)&& (array[x][y].getText().equals("boton "+ x +" , " + y))){
						for(int i=6;i<8;i++){//revisar el alrededor de la casilla 
							for(int j=0;j<2;j++){//del color diferente al que esta jugando
								if((contador%2)==0) {
									if(array[i][j].getText().equals("blancas")) {
										ginet=rev.revBlancas(i,j,x,y,array,ginet);

									}
								}else {
									if(array[i][j].getText().equals("negras")) {
										ginet=rev.revNegras(i,j,x,y,array,ginet);

									}
								}
							}
						}
					}
					else if((x==0) && (y==7)&& (array[x][y].getText().equals("boton "+ x +" , " + y))){
						for(int i=0;i<2;i++){//revisar el alrededor de la casilla 
							for(int j=6;j<8;j++){//del color diferente al que esta jugando
								if((contador%2)==0) {
									if(array[i][j].getText().equals("blancas")) {
										ginet=rev.revBlancas(i,j,x,y,array,ginet);

									}
								}else {
									if(array[i][j].getText().equals("negras")) {
										ginet=rev.revNegras(i,j,x,y,array,ginet);

									}
								}
							}
						}
					}
					else if((x!=0) && (y==7)&& (x!=7)&& (array[x][y].getText().equals("boton "+ x +" , " + y))){
						for(int i=(x-1);i<(x+2);i++){//revisar el alrededor de la casilla 
							for(int j=(y-1);j<(y+1);j++){//del color diferente al que esta jugando
								if((contador%2)==0) {
									if(array[i][j].getText().equals("blancas")) {
										ginet=rev.revBlancas(i,j,x,y,array,ginet);

									}
								}else {
									if(array[i][j].getText().equals("negras")) {

										ginet=rev.revNegras(i,j,x,y,array,ginet);
									}
								}
							}
						}
					}
					else if((x==7) && (y!=0) && (y!=7)&& (array[x][y].getText().equals("boton "+ x +" , " + y))){
						for(int i=(x-1);i<(x+1);i++){//revisar el alrededor de la casilla 
							for(int j=(y-1);j<(y+2);j++){//del color diferente al que esta jugando
								if((contador%2)==0) {
									if(array[i][j].getText().equals("blancas")) {
										ginet=rev.revBlancas(i,j,x,y,array,ginet);

									}
								}else {
									if(array[i][j].getText().equals("negras")) {
										ginet=rev.revNegras(i,j,x,y,array,ginet);
									}
								}
							}
						}
					}
				}
			}
		}
		catch(Exception e) {
			//	JOptionPane.showMessageDialog(null, "Error desde el validar "+e.toString());
		}
		return ginet;
	}
}
