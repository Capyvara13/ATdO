package com.atdo.toca_cms.domain.util.formatters;

/**
 * Utility class for cleaning and normalizing ISBN strings (ISBN-10 and ISBN-13).
 * This formatter ensures consistency by removing common non-numeric characters (hyphens and spaces),
 * which is typically required before validation or persistence.
 */
public final class IsbnFormatter {

    /**
     * Private constructor to prevent instantiation of the utility class.
     */
    private IsbnFormatter() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /**
     * Cleans an ISBN string by removing all hyphens and spaces.
     * The ISBN-10 check digit 'X' (case-insensitive) is preserved and converted to uppercase.
     *
     * Example: "978-85-333-0227-2" -> "9788533302272"
     * Example: "0-7475-3274-5" -> "0747532745"
     *
     * @param isbn The raw ISBN string.
     * @return The normalized, clean ISBN string (digits only, possibly ending in 'X'), or the original
     * string if null or empty.
     */
    public static String clean(String isbn) {
        if (isbn == null || isbn.isEmpty()) {
            return isbn;
        }
        // 1. Remove hyphens and spaces
        // 2. Convert to uppercase (important for ISBN-10 check digit 'X')
        return isbn.replaceAll("[\\s-]+", "").toUpperCase();
    }

    /**
     * Checks if a clean ISBN string has a valid length (10 or 13 digits).
     * Note: This method does NOT perform check digit validation.
     *
     * @param cleanIsbn The cleaned ISBN string (no hyphens/spaces).
     * @return true if the length is 10 or 13, false otherwise.
     */
    public static boolean isValidLength(String cleanIsbn) {
        if (cleanIsbn == null) {
            return false;
        }
        int length = cleanIsbn.length();

        if (length == 10) {
            // Must be 9 digits + 1 digit/X
            return cleanIsbn.matches("(\\d{9}[\\dX])");
        }

        if (length == 13) {
            // Must be 13 digits
            return cleanIsbn.matches("\\d{13}");
        }

        return false;
    }
}