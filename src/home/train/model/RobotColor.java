package home.train.model;

import java.util.*;

public class RobotColor {

    private static final List<String> colors = Arrays.asList( "orange","yellow","Green", "White");



    public static String getColor() {
        Random r = new Random();
        int rand = r.nextInt(colors.size());
        return colors.get(rand);
//        int randomIndex= ThreadLocalRandom.current().nextInt(colors.size()) % colors.size();
    }

    public String getRandomElements(int numberOfElements) {
        Random random = new Random();
        String color=null;
//        List<String> randomList = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            int randomIndex = random.nextInt(colors.size());
            //colors.remove(randomIndex); if we want remove after pickup
           color=colors.get(randomIndex);
        }
        return color;
    }

    public List<String> ByCollectionUtils(int numberOfElement) {
        Collections.shuffle(colors);//for disarrange list
        List<String> randomList = colors.subList(0, numberOfElement);
        return randomList;
    }

}
