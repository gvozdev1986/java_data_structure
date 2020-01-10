package by.hvozdzeu.structure.beans;

import java.util.Arrays;
import java.util.Objects;

public class VideoGame {

    private String title;
    private int year;
    private String rating;
    private String[] platforms;

    public VideoGame() {
    }

    public VideoGame(String title, int year, String rating, String[] platforms) {
        this.title = title;
        this.year = year;
        this.rating = rating;
        this.platforms = platforms;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String[] getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String[] platforms) {
        this.platforms = platforms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VideoGame videoGame = (VideoGame) o;
        return year == videoGame.year &&
                Objects.equals(title, videoGame.title) &&
                Objects.equals(rating, videoGame.rating) &&
                Arrays.equals(platforms, videoGame.platforms);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, year, rating);
        result = 31 * result + Arrays.hashCode(platforms);
        return result;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", rating='" + rating + '\'' +
                ", platforms=" + Arrays.toString(platforms) +
                '}';
    }
}
