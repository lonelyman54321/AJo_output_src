/*
 * Decompiled with CFR 0.152.
 */
package org.jsoup.internal;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil$StringJoiner;

public final class StringUtil {
    private static final int MaxCachedBuilderSize = 8192;
    private static final int MaxIdleBuilders = 8;
    private static final Pattern controlChars;
    private static final Pattern extraDotSegmentsPattern;
    static final String[] padding;
    private static final ThreadLocal threadLocalBuilders;
    private static final Pattern validUriScheme;

    static {
        padding = new String[]{"", " ", "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
        extraDotSegmentsPattern = Pattern.compile("^/((\\.{1,2}/)+)");
        validUriScheme = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
        controlChars = Pattern.compile("[\\x00-\\x1f]*");
        se3_2 se3_22 = new Object();
        threadLocalBuilders = re3_2.a(se3_22);
    }

    public static void appendNormalisedWhitespace(StringBuilder stringBuilder, String string2, boolean bl2) {
        int n3;
        int n4 = string2.length();
        boolean bl3 = false;
        boolean bl4 = false;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            n3 = string2.codePointAt(i3);
            boolean bl5 = StringUtil.isActuallyWhitespace(n3);
            if (bl5) {
                if (!(bl2 && !bl3 || bl4)) {
                    stringBuilder.append(' ');
                    bl4 = true;
                }
            } else {
                bl5 = StringUtil.isInvisibleChar(n3);
                if (!bl5) {
                    stringBuilder.appendCodePoint(n3);
                    bl3 = true;
                    bl4 = false;
                }
            }
            n3 = Character.charCount(n3);
        }
    }

    public static StringBuilder borrowBuilder() {
        Serializable serializable = (Stack)threadLocalBuilders.get();
        int n3 = serializable.empty();
        if (n3 != 0) {
            n3 = 8192;
            serializable = new StringBuilder(n3);
        } else {
            serializable = (StringBuilder)serializable.pop();
        }
        return serializable;
    }

    public static boolean in(String string2, String ... stringArray) {
        for (String string3 : stringArray) {
            boolean bl2 = string3.equals(string2);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public static boolean inSorted(String string2, String[] stringArray) {
        int n3 = Arrays.binarySearch(stringArray, string2);
        if (n3 >= 0) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        return n3 != 0;
    }

    public static boolean isActuallyWhitespace(int n3) {
        int n4 = 32;
        n3 = n3 != n4 && n3 != (n4 = 9) && n3 != (n4 = 10) && n3 != (n4 = 12) && n3 != (n4 = 13) && n3 != (n4 = 160) ? 0 : 1;
        return n3 != 0;
    }

    public static boolean isAscii(String string2) {
        int n3;
        Validate.notNull(string2);
        for (int i3 = 0; i3 < (n3 = string2.length()); ++i3) {
            int n4;
            n3 = string2.charAt(i3);
            if (n3 <= (n4 = 127)) continue;
            return false;
        }
        return true;
    }

    public static boolean isBlank(String string2) {
        int n3;
        boolean bl2 = true;
        if (string2 != null && (n3 = string2.length()) != 0) {
            n3 = string2.length();
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl3 = StringUtil.isWhitespace(string2.codePointAt(i3));
                if (bl3) continue;
                return false;
            }
        }
        return bl2;
    }

    public static boolean isInvisibleChar(int n3) {
        int n4 = 8203;
        n3 = n3 != n4 && n3 != (n4 = 173) ? 0 : 1;
        return n3 != 0;
    }

    public static boolean isNumeric(String string2) {
        int n3;
        if (string2 != null && (n3 = string2.length()) != 0) {
            n3 = string2.length();
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl2 = Character.isDigit(string2.codePointAt(i3));
                if (bl2) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean isWhitespace(int n3) {
        int n4 = 32;
        n3 = n3 != n4 && n3 != (n4 = 9) && n3 != (n4 = 10) && n3 != (n4 = 12) && n3 != (n4 = 13) ? 0 : 1;
        return n3 != 0;
    }

    public static String join(Collection collection, String string2) {
        return StringUtil.join(collection.iterator(), string2);
    }

    public static String join(Iterator iterator, String string2) {
        boolean bl2;
        boolean bl3 = iterator.hasNext();
        if (!bl3) {
            return "";
        }
        String string3 = iterator.next().toString();
        boolean bl4 = iterator.hasNext();
        if (!bl4) {
            return string3;
        }
        StringUtil$StringJoiner stringUtil$StringJoiner = new StringUtil$StringJoiner(string2);
        stringUtil$StringJoiner.add(string3);
        while (bl2 = iterator.hasNext()) {
            string2 = iterator.next();
            stringUtil$StringJoiner.add(string2);
        }
        return stringUtil$StringJoiner.complete();
    }

    public static String join(String[] stringArray, String string2) {
        return StringUtil.join(Arrays.asList(stringArray), string2);
    }

    public static String normaliseWhitespace(String string2) {
        StringBuilder stringBuilder = StringUtil.borrowBuilder();
        StringUtil.appendNormalisedWhitespace(stringBuilder, string2, false);
        return StringUtil.releaseBuilder(stringBuilder);
    }

    public static String padding(int n3) {
        return StringUtil.padding(n3, 30);
    }

    public static String padding(int n3, int n4) {
        Object[] objectArray;
        int n7 = 0;
        int n8 = 1;
        int n10 = n3 >= 0 ? 1 : 0;
        String string2 = "width must be >= 0";
        Validate.isTrue(n10 != 0, string2);
        n10 = -1;
        if (n4 < n10) {
            n8 = 0;
        }
        Validate.isTrue(n8 != 0);
        if (n4 != n10) {
            n3 = Math.min(n3, n4);
        }
        if (n3 < (n8 = (objectArray = padding).length)) {
            return objectArray[n3];
        }
        objectArray = new char[n3];
        while (n7 < n3) {
            n8 = 32;
            objectArray[n7] = (String)n8;
            ++n7;
        }
        return String.valueOf((char[])objectArray);
    }

    public static String releaseBuilder(StringBuilder stringBuilder) {
        int n3;
        Stack stack;
        Validate.notNull(stringBuilder);
        String string2 = stringBuilder.toString();
        int n4 = stringBuilder.length();
        int n7 = 8192;
        if (n4 > n7) {
            stringBuilder = new StringBuilder(n7);
        } else {
            n4 = 0;
            stack = null;
            n7 = stringBuilder.length();
            stringBuilder.delete(0, n7);
        }
        stack = (Stack)threadLocalBuilders.get();
        stack.push(stringBuilder);
        while ((n3 = ((AbstractCollection)stack).size()) > (n7 = 8)) {
            stack.pop();
        }
        return string2;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String resolve(String object, String string2) {
        object = StringUtil.stripControlChars((String)object);
        string2 = StringUtil.stripControlChars(string2);
        URL uRL = new URL((String)object);
        object = StringUtil.resolve(uRL, string2);
        return ((URL)object).toExternalForm();
        {
            catch (MalformedURLException malformedURLException) {}
        }
        catch (MalformedURLException malformedURLException) {
            object = new URL(string2);
            return ((URL)object).toExternalForm();
        }
        object = validUriScheme.matcher(string2);
        boolean bl2 = ((Matcher)object).find();
        if (!bl2) return "";
        return string2;
    }

    public static URL resolve(URL object, String object2) {
        String string2;
        Object object3;
        boolean n3 = ((String)(object2 = StringUtil.stripControlChars((String)object2))).startsWith((String)(object3 = "?"));
        if (n3) {
            object3 = new StringBuilder();
            string2 = ((URL)object).getPath();
            ((StringBuilder)object3).append(string2);
            ((StringBuilder)object3).append((String)object2);
            object2 = ((StringBuilder)object3).toString();
        }
        object3 = new URL((URL)object, (String)object2);
        object = extraDotSegmentsPattern;
        object2 = ((URL)object3).getFile();
        object = ((Pattern)object).matcher((CharSequence)object2).replaceFirst("/");
        object2 = ((URL)object3).getRef();
        if (object2 != null) {
            object = nn_2.a((String)object, "#");
            object2 = ((URL)object3).getRef();
            ((StringBuilder)object).append((String)object2);
            object = ((StringBuilder)object).toString();
        }
        string2 = ((URL)object3).getProtocol();
        String string3 = ((URL)object3).getHost();
        int n4 = ((URL)object3).getPort();
        object2 = new URL(string2, string3, n4, (String)object);
        return object2;
    }

    public static boolean startsWithNewline(String string2) {
        char c2;
        int n3;
        boolean bl2 = false;
        if (string2 != null && (n3 = string2.length()) != 0 && (c2 = string2.charAt(0)) == (n3 = 10)) {
            bl2 = true;
        }
        return bl2;
    }

    private static String stripControlChars(String string2) {
        return controlChars.matcher(string2).replaceAll("");
    }
}

