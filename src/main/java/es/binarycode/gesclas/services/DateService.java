package es.binarycode.gesclas.services;

import org.joda.time.DateTime;

/**
 * Provides the current date.
 * 
 * @author jerome
 */
public interface DateService {

  /**
   * @return current date at the moment of the call
   */
  DateTime now();
}
