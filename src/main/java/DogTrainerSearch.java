import java.util.List;

public class DogTrainerSearch {
    public int searchDogTrainers(String postCode, List<String> dogTrainers) {
        return (int) dogTrainers.stream()
                .filter(s->s.contains(postCode))
                .count();
    }
}
