public class Manager {
    protected Poster[] films = new Poster[0];
    protected int limit;

    public Manager() {
        this.limit = 10;

    }

    public Manager(int limit) {
        this.limit = limit;

    }

    public void add(Poster film) {
        Poster[] tmp = new Poster[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Poster[] findAll() {
        return films;
    }


    public Poster[] findLast() {
        int resultLength;
        if (films.length >= limit) {
            resultLength = limit;
        } else {
            resultLength = films.length;
        }
        Poster[] result = new Poster[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = films[films.length - 1 - i];
        }
        return result;
    }
}



