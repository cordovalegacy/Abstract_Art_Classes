import com.java.abstraction.Art;
import com.java.abstraction.Painting;
import com.java.abstraction.Sculpture;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("<--Running Main-->");
        ArrayList<Art> museum = new ArrayList<Art>();

        Painting starryNight = new Painting("Starry Night", "Vincent Van Gough", "Created in 1889, it depicts a small town with church steeples and cypress trees against a vibrant night sky filled with swirling stars.", "Linseed Oil");
        Painting monaLisa = new Painting("Mona Lisa", "Leonardo da Vinci", "It portrays a woman with an enigmatic expression, sitting against a distant landscape. The painting is known for the subject's mysterious smile and the artist's exquisite use of light and shadow.\n", "Oil Paints");
        Painting theScream = new Painting("The Scream", "Edvard Munch", " It features a figure standing on a bridge with a turbulent orange and red sky in the background. The distorted face of the central figure and the dramatic colors contribute to the painting's intense emotional impact.", "Oil, Tempera, and Pastel Paints");
        Sculpture davidofMichaelAngelo = new Sculpture("David", "Michelangelo di Lodovico Buonarroti Simoni", "Depicts the biblical hero David who defeated the giant Goliath with a single stone. The sculpture captures the moment before the battle, with David in a state of concentrated determination.", "High Quality Marble");
        Sculpture atlasTheTitan = new Sculpture("Atlas", "Unknown", "Atlas was a Titan condemned to hold up the celestial spheres or the heavens for eternity. He is often depicted as a strong man carrying the world on his shoulders, symbolizing endurance and strength.", "Marble, Bronze, and Stone");

        museum.add(starryNight);
        museum.add(monaLisa);
        museum.add(theScream);
        museum.add(davidofMichaelAngelo);
        museum.add(atlasTheTitan);

        for (int i = 0; i < museum.size(); i++) {
            System.out.println(Arrays.toString(museum.get(i).viewArt()));
        }
    }
}