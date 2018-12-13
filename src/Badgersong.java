import javax.swing.JOptionPane;

public class Badgersong {
	public static void main(String[] args) {

		for (int k = 0; k < 3; k++) {

			for (int i = 0; i < 13; i++) {
				JOptionPane.showMessageDialog(null, "Badger");
			}

			for (int i = 0; i < 3; i++) {
				if (i == 2)
				JOptionPane.showMessageDialog(null, "Mushroom");
			}

			for (int i = 0; i < 2; i++) {
				if (k == 2) {
					JOptionPane.showMessageDialog(null, "Snake");

				}
			}
		}

	}
}
