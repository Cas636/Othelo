package Othelo;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Revision {

	public boolean revBlancas(int i, int j, int x, int y, JButton array[][], boolean ginet) {
		try {
			if(array[i][j].getText().equals("blancas")) {
				int w=i;
				int z=j;
				while (array[w][z].getText().equals("blancas") && (w<8) && (z<8) && (w>=0) && (z>=0)) {
					w=w+(i-x);
					z=z+(j-y);
					if((w==-1)||(z==-1)) {
						w=w+(x-i);
						z=z+(y-j);
						break;
					}
				}
				if (array[w][z].getText().equals("negras")) {
					ginet=false;
				}
			}
		}
		catch(Exception e) {
			//	JOptionPane.showMessageDialog(null, "Error desde el cambiar fichas del turno de las negras "+e.toString());
		}
		return ginet;

	}


	public boolean revNegras(int i, int j, int x, int y, JButton array[][], boolean ginet) {
		try{
			if(array[i][j].getText().equals("negras")) {
				int w=i;
				int z=j;
				while (array[w][z].getText().equals("negras") && (w<8) && (z<8) && (w>=0) && (z>=0)) {
					w=w+(i-x);
					z=z+(j-y);
					if((w==-1)||(z==-1)) {
						w=w+(x-i);
						z=z+(y-j);
						break;
					}
				}
				if (array[w][z].getText().equals("blancas")) {
					ginet=false;
				}
			}
		}
		catch(Exception e) {
			//JOptionPane.showMessageDialog(null, "Error desde el cambiar fichas del turno de las blancas "+e.toString());
		}
		return ginet;
	}

}
