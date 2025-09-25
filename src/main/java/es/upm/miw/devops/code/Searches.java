package es.upm.miw.devops.code;

import java.util.Objects;
import java.util.stream.Stream;

public class Searches {
    Stream<String> findUserIdBySomeProperFraction() {
        return new UsersDatabase().findAll()
                .filter(user -> user.getFractions().stream().anyMatch(Fraction::isProper))
                .map(User::getId);
    }
}
