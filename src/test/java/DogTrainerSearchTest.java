import jdk.jfr.Recording;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTrainerSearchTest {

    private final List<String> dogTrainers=new ArrayList<>();
    @BeforeEach
    public void setUp(){
        dogTrainers.add("PO146RE");
        dogTrainers.add("SO157RA");
    }
    @Test
    public void testReturn1DogTrainersForGivenPostcode(){
        DogTrainerSearch dogTrainerSearch = new DogTrainerSearch();
        assertEquals(1, dogTrainerSearch.searchDogTrainers("PO", dogTrainers));
    }

}
