package org.knowm.xchange.bitstamp.dto;

import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The helpful original note from
 * <a href="https://www.bitstamp.net/api/#authentication-errors">Bitstamp API</a>
 * append to the specified error message.
 *
 * @author Kolozsy Gábor <a href="https://github.com/gaborkolozsy/>
 */
public final class BitstampNoteHelpToFixError {

    private static String currency;

    private static String amount;

    private static String parameter;

    /**
     * If instantiate with {@code new} keyword, then throws an exception.
     */
    public BitstampNoteHelpToFixError() {
        throw new UnsupportedOperationException();
    }

    /**
     * Append a helpful note to the error message.
     *
     * @param error The error message
     * @return The extended error message
     */
    public static String addNote(Map<String, Iterable> error) {
        final StringBuilder message = new StringBuilder(getMessage(error));
        BitstampError bitstampError = getError(generalizeError(message.toString()));
        final String extendedMessage = message.append(" - ").append(bitstampError.getNote()).toString();
        return extendedMessage;
    }

    /**
     * Return the error message.
     *
     * @param error The error message
     * @return The error message
     */
    private static String getMessage(Map<String, Iterable> error) {
        final StringBuilder sb = new StringBuilder();
        for (String key : error.keySet()) {
            for (Object msg : error.get(key)) {
                sb.append(msg);
            }
        }
        return sb.toString();
    }

    /**
     * Append a description to the error message.
     *
     * @param msg The error message
     * @return The extended error message
     */
    public static String addNote(String msg) {
        final StringBuilder message = new StringBuilder(msg + " - ");
        BitstampError bitstampError = getError(msg);
        return message.append(bitstampError.getNote()).toString();
    }

    /**
     * Return the right {@code BitstampError}.
     *
     * @param msg The error message.
     * @return {@code BitstampError}
     */
    private static BitstampError getError(String msg) {
        for (BitstampError bitstampError : BitstampError.values()) {
            if (bitstampError.getError().equals(msg)) {
                return bitstampError;
            }
        }
        return BitstampError.BITSTAMP_ERROR_0000;
    }

    private static String generalizeError(String error) {
        String generalizeError = generalizeCurrency(error);
        generalizeError = generalizeAmount(generalizeError);
        return generalizeError;
    }

    private static String specificNote(String note) {
        return replaceMatch(note, "0\\.00", amount);
    }

    private static String generalizeCurrency(String error) {
        return replaceMatch(error,"(USD|EUR)", "XXX");
    }

    private static String generalizeAmount(String error) {
        return replaceMatch(error,"(\\d{1,7}\\.\\d{2,8})", "0.00");
    }

    private static String replaceMatch(String error, String regex, String replacement) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(error);
        if (m.find()) {
            return m.replaceAll(replacement);
        }
        return error;
    }
}
