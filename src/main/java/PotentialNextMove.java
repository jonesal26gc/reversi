import java.util.HashMap;

public class PotentialNextMove implements Comparable<PotentialNextMove> {
    private int xAxis;
    private int yAxis;
    private HashMap<DirectionOfCapture, Integer> directionOfCaptureAndScores = new HashMap<DirectionOfCapture, Integer>();
    private int score = 0;
    private int preferenceRating;

    public PotentialNextMove(int xAxis, int yAxis) {
        this.xAxis = xAxis;
        this.yAxis = yAxis;
    }

    public int getXAxis() {
        return xAxis;
    }

    public int getYAxis() {
        return yAxis;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPreferenceRating() {
        return preferenceRating;
    }

    public void setPreferenceRating(int preferenceRating) {
        this.preferenceRating = preferenceRating;
    }

    public HashMap<DirectionOfCapture, Integer> getDirectionOfCaptureAndScores() {
        return directionOfCaptureAndScores;
    }

    public int getDirectionOfCaptureAndScoresSize() {
        return directionOfCaptureAndScores.size();
    }

    public void addDirectionOfCaptureAndScores(DirectionOfCapture directionOfCapture, Integer score) {
        directionOfCaptureAndScores.put(directionOfCapture, score);
    }

    @Override
    public String toString() {
        return "PotentialNextMove{" +
                "xAxis=" + xAxis +
                ", yAxis=" + yAxis +
                ", directionOfCaptureAndScores=" + directionOfCaptureAndScores +
                ", score=" + score +
                '}';
    }

    public int compareTo(PotentialNextMove o) {
        int x = o.preferenceRating - this.preferenceRating;
        if (x != 0) {
            return x;
        } else {
            return o.score - this.score;
        }
    }
}
