package user.recognition;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class userAdd {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		System.out.println("prenom : ");
		String prenom = in.nextLine();
		System.out.println("nom: ");
		String nom = in.nextLine();
		System.out.println("classe : ");
		String classe = in.nextLine();
		System.out.println("cardID : ");
		String cardID = in.nextLine();
		System.out.println("nombre de participations : ");
		String part = in.nextLine();
		Path path = Paths
				.get("C:\\Users\\EntMak2\\Documents\\GitHub\\java_project\\Person_library\\Users\\" + classe + "\\");
		System.out.println(path);
		Files.createDirectories(path);

		if (part == null)
			part = "0";
		in.close();
		try {
			User user = new User(prenom, nom, classe, cardID, part);
			XML.XMLTools.encodeToFile(user, (path + "\\" + cardID + ".xml"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}