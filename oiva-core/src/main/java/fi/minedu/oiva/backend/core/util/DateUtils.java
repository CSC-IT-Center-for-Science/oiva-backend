package fi.minedu.oiva.backend.core.util;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by aheikkinen on 15/09/16.
 */
public class DateUtils {

    public static boolean isPastYear(final Integer year) {
        final LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
        return null == year ? false : year < ldt.getYear();
    }

    public static Timestamp getFirstOrNullDate(final Stream<Timestamp> source) {
        final Optional<Optional<Timestamp>> opt = source
            .sorted(Comparator.nullsLast(Comparator.naturalOrder()))
            .map(Optional::ofNullable).findFirst();
        return opt.isPresent() ? opt.get().orElse(null) : null;
    }

    public static Timestamp getNullOrLastDate(final Stream<Timestamp> source) {
        final Optional<Optional<Timestamp>> opt = source
            .sorted(Comparator.nullsFirst(Comparator.reverseOrder()))
            .map(Optional::ofNullable).findFirst();
        return opt.isPresent() ? opt.get().orElse(null) : null;
    }
}
