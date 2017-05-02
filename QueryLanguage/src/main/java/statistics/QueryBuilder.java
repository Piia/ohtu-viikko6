package statistics;

import statistics.matcher.*;

public class QueryBuilder {

    Matcher matcher;

    public QueryBuilder() {
        this.matcher = new Default();
    }

    public Matcher build() {
        Matcher m = matcher;
        matcher = new Default();
        return m;
    }

    QueryBuilder playsIn(String team) {
        Matcher m = new PlaysIn(team);
        this.matcher = new And(matcher, m);
        return this;
    }

    QueryBuilder oneOf(Matcher m1, Matcher m2) {
        this.matcher = new Or(m1, m2);
        return this;
    }

    QueryBuilder not(Matcher... matchers) {
        Matcher m = new Not(matchers);
        this.matcher = new And(matcher, m);
        return this;
    }

    QueryBuilder hasFewerThan(int value, String category) {
        Matcher m = new HasFewerThan(value, category);
        this.matcher = new And(matcher, m);
        return this;
    }

    QueryBuilder hasAtLeast(int value, String category) {
        Matcher m = new HasAtLeast(value, category);
        this.matcher = new And(matcher, m);
        return this;
    }

}
