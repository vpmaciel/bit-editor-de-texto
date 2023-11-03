package arquitetura.gui;

import javax.swing.JOptionPane;

public final class Msg {

	private static Object[] botoesSimNao = new Object[] { "Sim", "Nao" };

	public static final int confirmarFecharJanela() {
		return JOptionPane.showOptionDialog(null, "Deseja fechar a janela ?", "Informação",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.YES_NO_OPTION, null, botoesSimNao,
				botoesSimNao[JOptionPane.INFORMATION_MESSAGE]);
	}
}
