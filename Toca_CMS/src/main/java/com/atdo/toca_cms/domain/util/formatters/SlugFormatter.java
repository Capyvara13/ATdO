package com.atdo.toca_cms.domain.util.formatters;

import java.text.Normalizer;
import java.util.Locale;
import java.util.regex.Pattern;

/**
 * Utility class for generating URL-friendly slugs from strings (e.g., titles).
 * This ensures consistency in creating clean, readable identifiers by normalizing
 * accents, converting to lowercase, and replacing spaces/special characters with hyphens.
 */
public final class SlugFormatter {

    // Regex pattern to strip accents and replace non-alphanumeric characters (except hyphens)
    private static final Pattern NON_LATIN = Pattern.compile("[^\\w-]+");
    private static final Pattern WHITE_SPACE = Pattern.compile("[\\s]");
    private static final Pattern HYPHENS = Pattern.compile("[-]+");

    /**
     * Private constructor to prevent instantiation of the utility class.
     */
    private SlugFormatter() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    /**
     * Converts a raw string (e.g., a title) into a URL-friendly slug.
     *
     * Steps:
     * 1. Normalize the string to separate accents (e.g., 'á' becomes 'a' + acute accent).
     * 2. Remove the accents (acute accent, tilde, etc.).
     * 3. Convert all characters to lowercase.
     * 4. Replace spaces and non-word characters with a single hyphen '-'.
     * 5. Trim leading and trailing hyphens.
     *
     * Example: "Ainda Estou Aqui" -> "ainda-estou-aqui"
     *
     * @param input The raw string to be slugified.
     * @return The normalized, clean slug string, or an empty string if input is null or blank.
     */
    public static String toSlug(String input) {
        if (input == null || input.trim().isEmpty()) {
            return "";
        }

        // 1. Normalize and remove accents
        String nowhitespace = WHITE_SPACE.matcher(input).replaceAll("-");
        String normalized = Normalizer.normalize(nowhitespace, Normalizer.Form.NFD);
        normalized = NON_LATIN.matcher(normalized).replaceAll("");

        // 2. Convert to lowercase and handle hyphens
        normalized = normalized.toLowerCase(Locale.ENGLISH); // Use ENGLISH for consistent ASCII conversion
        normalized = HYPHENS.matcher(normalized).replaceAll("-");

        // 3. Trim any leading/trailing hyphens
        return normalized.replaceAll("^-|-$", "");
    }
}