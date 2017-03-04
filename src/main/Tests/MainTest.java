import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by julianweisbord on 2/3/17.
 */
class MainTest {
    @Test
    void main() {
        String[] a =  {"/Test/1/2/3","/Something/SomethingElse"};
    }

    @Test
    //This simply creates a fresh model and is first called when the game is started. 
    //A fresh model should have a completely populated AI board so to make sure the game was initiliazed properly]
    //Continue to fire at the enemey until you hit a ship
    //The test is a success if you are able to hit enemy ships
    //The test is a failure if you hit enough squares on the enemy board to conclude that there are no ships present because you never hit one. 
    void newModel() {
        Main t = new Main();
        assertEquals(true,t.createdNewModel());
    }
    //At first it seemed like this would be used to create a new BattleshipModel for every request
    //But that didn't fit in with the front-end being stateless.
    //Therefore the only thing I could think of doing was using GSON to convert a request's text into a BattleshipModel.
    //It's not clear how this is useful and seems impossible to test.
    @Test
    void getModelFromReq() {
        Main t = new Main();

    }

    //The test for this is to go to the hosted site and fill in each attribute with a valid position
    //Click place ship and if the ship is placed on the board then the test passes
    //If no ship appears on the player board then the test fails.
    //assertEquals(true,t.createdPlaceShip());
    @Test
    void placeShip() {
        Main t = new Main();
    }

    //To test select an x,y coordinate to fire at. Click the fire button in the UI.
    //If a shot appears on the enemy board that is either a hit or miss then the test succeeds.
    //If nothing appears or an alert pops up then the test fails
    //Please see /r/therewasanattempt for more information
    @Test
    void fireAt() {
        Main t = new Main();
    }
}
