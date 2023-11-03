package erp.main;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import erp.utilitarios.editor.EditorTextoJan;

public class EditorMain {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			EditorTextoJan editorTextoJan = new EditorTextoJan();

			editorTextoJan.setLocationRelativeTo(null);
			editorTextoJan.setVisible(true);
			editorTextoJan.setResizable(false);
			editorTextoJan.toFront();

		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException
				| UnsupportedLookAndFeelException exception) {
			exception.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

		}
	}
}