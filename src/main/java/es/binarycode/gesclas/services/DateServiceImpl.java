package es.binarycode.gesclas.services;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;

import java.util.TimeZone;

import static com.google.common.base.Preconditions.checkNotNull;

public final class DateServiceImpl implements DateService {

  private final DateTimeZone timeZone;

  /**
   * Force system-wide timezone to ensure consistent
   * dates over all servers, independently from the region
   * the server is running.
   */
  public DateServiceImpl(final DateTimeZone timeZone) {
    super();
    this.timeZone = checkNotNull(timeZone);

    System.setProperty("user.timezone", timeZone.getID());
    TimeZone.setDefault(timeZone.toTimeZone());
    DateTimeZone.setDefault(timeZone);
  }

  @Override
  public DateTime now() {
    return DateTime.now(timeZone);
  }
}
