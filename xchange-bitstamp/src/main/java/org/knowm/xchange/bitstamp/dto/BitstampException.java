package org.knowm.xchange.bitstamp.dto;

import java.util.Collection;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

import si.mazi.rescu.HttpStatusExceptionSupport;

public class BitstampException extends HttpStatusExceptionSupport {

  private Map<String, Collection<String>> errors;

  public BitstampException(@JsonProperty("error") Object error, @JsonProperty("reason") Object reason) {
    super(getMessage(error == null ? reason : error));

    if (error == null) {
      error = reason;
    }
    if (error instanceof Map) {
      try {
        errors = (Map<String, Collection<String>>) error;
      } catch (Exception ignore) {
      }
    }
  }

  private static String getMessage(Object errors) {
    if (errors instanceof Map) {
      try {
        return BitstampNoteHelpToFixError.addNote((Map<String, Iterable>) errors);
      } catch (Exception ignore) {
      }
    }
    return BitstampNoteHelpToFixError.addNote(String.valueOf(errors));
  }

  public Map<String, Collection<String>> getErrors() {
    return errors;
  }

  public Collection<String> getErrors(String key) {
    return errors.get(key);
  }
}
