import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

public class OceanExplorer extends Application {

	final int dimensions = 10;
	final int scale = 50;

	@Override
	public void start(Stage oceanStage) throws Exception {
		OceanMap oceanMap = new OceanMap();
		boolean[][] oceanGrid = oceanMap.getMap();


		AnchorPane root = new AnchorPane();

		for (int x = 0; x < dimensions; x++) {
			for (int y = 0; y < dimensions; y++) {
				Rectangle rect = new Rectangle(x * scale, y * scale, scale, scale);
				rect.setStroke(Color.BLACK);
				rect.setFill(Color.PALETURQUOISE);
				root.getChildren().add(rect);
			}
		}


		Scene scene = new Scene(root, 500, 500);

		oceanStage.setTitle("Christopher Columbus Sails the Ocean Blue!");
		oceanStage.setScene(scene);
		oceanStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
