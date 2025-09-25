package es.upm.miw.devops.code;

import java.util.stream.Stream;

public class Searches {
    public Stream<String> findUserIdBySomeProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(Fraction::isProper))
                .map(User::getId);
    }

    public Double findFirstDecimalFractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream())
                .map(Fraction::decimal)
                .findFirst()
                .orElse(null);
    }

    public Stream<String> findUserIdByAllProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> !user.getFractions().isEmpty()
                        && user.getFractions().stream().allMatch(Fraction::isProper))
                .map(User::getId); 
    }

    public Fraction findFractionSubtractionByUserName(String name) {
        return new UsersDatabase().findAll()
                .filter(user -> name.equals(user.getName()))
                .flatMap(user -> user.getFractions().stream())
                .reduce((f1, f2) -> f1.add(new Fraction(-f2.getNumerator(), f2.getDenominator())))
                .orElse(null);
    }
}
