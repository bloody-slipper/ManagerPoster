import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {

    Poster film1 = new Poster(1, "Бладшот", ",боевик");
    Poster film2 = new Poster(2, "Вперед", ",мультфильм");
    Poster film3 = new Poster(3, "Отель Белград", "комедия");
    Poster film4 = new Poster(4, "Джентельмены", "боевик");
    Poster film5 = new Poster(5, "Человек-невидимка", "ужасы");
    Poster film6 = new Poster(6, "Тролли.Мировой тур", "Мультфильм");
    Poster film7 = new Poster(7, "Номер один", "комедия");
    Poster film8 = new Poster(8, "Молчание ягнят", "триллер");
    Poster film9 = new Poster(9, "Зеленая миля", "драма");
    Poster film10 = new Poster(10, "Аватар", "фантастика");
    Poster film11 = new Poster(11, "Девушка с татуировкой дракона", "детектив");
    Poster film12 = new Poster(12, "Исчезнувшая", "триллер");
    Poster film13 = new Poster(13, "Паразиты", "драма");
    Poster film14 = new Poster(14, "Матрица", "фантастика");
    Poster film15 = new Poster(15, "Ветреная река", "детектив");


    @Test
    public void shouldAddFilms() {
        Manager manager = new Manager();
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);

        Poster[] expected = {film1, film2, film3};
        Poster[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLast10() {
        Manager manager = new Manager();
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);
        manager.add(film9);
        manager.add(film10);
        manager.add(film11);
        manager.add(film12);
        manager.add(film13);
        manager.add(film14);
        manager.add(film15);

        manager.findLast();

        Poster[] expected = {film15, film14, film13, film12, film11, film10, film9, film8, film7, film6};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLast5() {
        Manager manager = new Manager(5);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);

        manager.findLast();

        Poster[] expected = {film8, film7, film6, film5, film4};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindLast8() {
        Manager manager = new Manager(10);
        manager.add(film1);
        manager.add(film2);
        manager.add(film3);
        manager.add(film4);
        manager.add(film5);
        manager.add(film6);
        manager.add(film7);
        manager.add(film8);

        manager.findLast();

        Poster[] expected = {film8, film7, film6, film5, film4, film3, film2, film1};
        Poster[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

