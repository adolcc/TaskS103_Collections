package level2.ejercicio2.model;


public abstract class Restaurant implements Comparable<Restaurant> {

    private String name;
    private int score;


    public Restaurant(String name, int score) {

        this.name = name;
        this.score = score;

    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Restaurant)) return false;

        Restaurant other = (Restaurant) obj;

        return score == other.score && name.equals(other.name);

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + name.hashCode();
        result = 31 * result + score;
        return result;

    }

    @Override
    public int compareTo(Restaurant other) {
        int compareName = this.name.compareTo(other.name);

        if (compareName == 0) {
            return other.score - this.score;
        }
        return compareName;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
