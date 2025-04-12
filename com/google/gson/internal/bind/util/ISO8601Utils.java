/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal.bind.util;

import java.io.Serializable;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class ISO8601Utils {
    private static final TimeZone TIMEZONE_UTC = TimeZone.getTimeZone("UTC");
    private static final String UTC_ID = "UTC";

    private static boolean checkOffset(String string2, int n3, char c2) {
        char c3;
        int n4 = string2.length();
        if (n3 < n4 && (c3 = string2.charAt(n3)) == c2) {
            c3 = '\u0001';
        } else {
            c3 = '\u0000';
            string2 = null;
        }
        return c3 != 0;
    }

    public static String format(Date date) {
        TimeZone timeZone = TIMEZONE_UTC;
        return ISO8601Utils.format(date, false, timeZone);
    }

    public static String format(Date date, boolean bl2) {
        TimeZone timeZone = TIMEZONE_UTC;
        return ISO8601Utils.format(date, bl2, timeZone);
    }

    public static String format(Date date, boolean n3, TimeZone timeZone) {
        long l2;
        int n4;
        Serializable serializable = Locale.US;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, (Locale)serializable);
        gregorianCalendar.setTime(date);
        char c2 = '\u0004';
        if (n3 != 0) {
            n4 = 4;
        } else {
            n4 = 0;
            serializable = null;
        }
        int n7 = 19 + n4;
        n4 = timeZone.getRawOffset();
        char c3 = '\u0001';
        n4 = n4 == 0 ? 1 : 6;
        serializable = new StringBuilder(n7 += n4);
        n7 = gregorianCalendar.get(c3);
        ISO8601Utils.padInt((StringBuilder)serializable, n7, c2);
        c2 = '-';
        ((StringBuilder)serializable).append(c2);
        n7 = 2;
        int n8 = gregorianCalendar.get(n7) + c3;
        ISO8601Utils.padInt((StringBuilder)serializable, n8, n7);
        ((StringBuilder)serializable).append(c2);
        c3 = gregorianCalendar.get(5);
        ISO8601Utils.padInt((StringBuilder)serializable, c3, n7);
        ((StringBuilder)serializable).append('T');
        c3 = gregorianCalendar.get(11);
        ISO8601Utils.padInt((StringBuilder)serializable, c3, n7);
        c3 = ':';
        ((StringBuilder)serializable).append(c3);
        n8 = gregorianCalendar.get(12);
        ISO8601Utils.padInt((StringBuilder)serializable, n8, n7);
        ((StringBuilder)serializable).append(c3);
        n8 = gregorianCalendar.get(13);
        ISO8601Utils.padInt((StringBuilder)serializable, n8, n7);
        if (n3 != 0) {
            ((StringBuilder)serializable).append('.');
            n3 = gregorianCalendar.get(14);
            n8 = 3;
            ISO8601Utils.padInt((StringBuilder)serializable, n3, n8);
        }
        if ((n3 = timeZone.getOffset(l2 = gregorianCalendar.getTimeInMillis())) != 0) {
            int n10 = n3 / 60000;
            int n14 = Math.abs(n10 / 60);
            n10 = Math.abs(n10 % 60);
            if (n3 >= 0) {
                c2 = '+';
            }
            ((StringBuilder)serializable).append(c2);
            ISO8601Utils.padInt((StringBuilder)serializable, n14, n7);
            ((StringBuilder)serializable).append(c3);
            ISO8601Utils.padInt((StringBuilder)serializable, n10, n7);
        } else {
            c2 = 'Z';
            ((StringBuilder)serializable).append(c2);
        }
        return ((StringBuilder)serializable).toString();
    }

    private static int indexOfNonDigit(String string2, int n3) {
        int n4;
        while (n3 < (n4 = string2.length())) {
            int n7;
            n4 = string2.charAt(n3);
            if (n4 >= (n7 = 48) && n4 <= (n7 = 57)) {
                ++n3;
                continue;
            }
            return n3;
        }
        return string2.length();
    }

    private static void padInt(StringBuilder stringBuilder, int n3, int n4) {
        String string2 = Integer.toString(n3);
        int c2 = string2.length();
        n4 -= c2;
        while (n4 > 0) {
            char c3 = '0';
            stringBuilder.append(c3);
            n4 += -1;
        }
        stringBuilder.append(string2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Date parse(String string2, ParsePosition parsePosition) {
        void var4_8;
        int n3;
        Object object;
        Object object2;
        String string3;
        block32: {
            Object object3;
            block28: {
                StringBuilder stringBuilder;
                String string4;
                int n4;
                int n7;
                int n8;
                int n10;
                int n14;
                int n15;
                int n16;
                int n17;
                int n18;
                int n19;
                Object object4;
                ParsePosition parsePosition2;
                block31: {
                    block29: {
                        int n20;
                        block30: {
                            string3 = string2;
                            parsePosition2 = parsePosition;
                            object3 = "Mismatching time zone indicator: ";
                            object2 = "GMT";
                            object = "00";
                            object4 = "Invalid time zone indicator '";
                            n19 = parsePosition.getIndex();
                            n18 = n19 + 4;
                            n17 = ISO8601Utils.parseInt(string2, n19, n18);
                            n16 = 45;
                            n15 = ISO8601Utils.checkOffset(string2, n18, (char)n16);
                            n14 = 5;
                            if (n15 != 0) {
                                n18 = n19 + 5;
                            }
                            n19 = n18 + 2;
                            n15 = ISO8601Utils.parseInt(string3, n18, n19);
                            n10 = ISO8601Utils.checkOffset(string3, n19, (char)n16);
                            if (n10 != 0) {
                                n19 = n18 + 3;
                            }
                            n18 = n19 + 2;
                            n10 = ISO8601Utils.parseInt(string3, n19, n18);
                            n8 = 84;
                            n8 = (int)(ISO8601Utils.checkOffset(string3, n18, (char)n8) ? 1 : 0);
                            n7 = 1;
                            n4 = 0;
                            string4 = null;
                            if (n8 == 0 && (n14 = string2.length()) <= n18) {
                                object3 = new GregorianCalendar(n17, n15 -= n7, n10);
                                ((Calendar)object3).setLenient(false);
                                parsePosition2.setIndex(n18);
                                return ((Calendar)object3).getTime();
                            }
                            n14 = 43;
                            n4 = 90;
                            if (n8 == 0) break block29;
                            n18 = n19 + 3;
                            n8 = n19 + 5;
                            n18 = ISO8601Utils.parseInt(string3, n18, n8);
                            n7 = 58;
                            n20 = ISO8601Utils.checkOffset(string3, n8, (char)n7);
                            if (n20 != 0) {
                                n8 = n19 + 6;
                            }
                            n19 = n8 + 2;
                            n20 = ISO8601Utils.parseInt(string3, n8, n19);
                            if ((n7 = (int)(ISO8601Utils.checkOffset(string3, n19, (char)n7) ? 1 : 0)) != 0) {
                                n19 = n8 += 3;
                            }
                            if ((n8 = string2.length()) <= n19 || (n8 = (int)string3.charAt(n19)) == n4 || n8 == n14 || n8 == n16) break block30;
                            n8 = n19 + 2;
                            n7 = ISO8601Utils.parseInt(string3, n19, n8);
                            if (n7 > (n16 = 59) && n7 < (n16 = 63)) {
                                n7 = 59;
                            }
                            n16 = 46;
                            if ((n16 = (int)(ISO8601Utils.checkOffset(string3, n8, (char)n16) ? 1 : 0)) != 0) {
                                n16 = n19 + 3;
                                n8 = n19 + 4;
                                n8 = ISO8601Utils.indexOfNonDigit(string3, n8);
                                n19 += 6;
                                n19 = Math.min(n8, n19);
                                int n21 = ISO8601Utils.parseInt(string3, n16, n19);
                                if ((n19 -= n16) != (n16 = 1)) {
                                    n16 = 2;
                                    if (n19 == n16) {
                                        n21 *= 10;
                                    }
                                } else {
                                    n21 *= 100;
                                }
                                n19 = n18;
                                n18 = n8;
                                n16 = n20;
                                n8 = n21;
                                break block31;
                            } else {
                                n19 = n18;
                                n18 = n8;
                                n16 = n20;
                                n8 = 0;
                            }
                            break block31;
                        }
                        n16 = n20;
                        n8 = 0;
                        n7 = 0;
                        int n22 = n18;
                        n18 = n19;
                        n19 = n22;
                        break block31;
                    }
                    n19 = 0;
                    stringBuilder = null;
                    n16 = 0;
                    n8 = 0;
                    n7 = 0;
                }
                n14 = string2.length();
                if (n14 <= n18) break block28;
                n14 = string3.charAt(n18);
                if (n14 == n4) {
                    object3 = TIMEZONE_UTC;
                    int n24 = 1;
                    n18 += n24;
                } else {
                    n4 = 43;
                    if (n14 != n4 && n14 != (n4 = 45)) {
                        object2 = new StringBuilder((String)object4);
                        ((StringBuilder)object2).append((char)n14);
                        object = "'";
                        ((StringBuilder)object2).append((String)object);
                        object2 = ((StringBuilder)object2).toString();
                        object3 = new IndexOutOfBoundsException((String)object2);
                        throw object3;
                    }
                    object4 = string3.substring(n18);
                    n14 = ((String)object4).length();
                    if (n14 < (n4 = 5)) {
                        object4 = ((String)object4).concat((String)object);
                    }
                    n3 = ((String)object4).length();
                    n18 += n3;
                    object = "+0000";
                    n3 = (int)(((String)object).equals(object4) ? 1 : 0);
                    if (n3 == 0 && (n3 = (int)(((String)(object = "+00:00")).equals(object4) ? 1 : 0)) == 0) {
                        String string5;
                        boolean bl2;
                        object = TimeZone.getTimeZone((String)(object2 = ((String)object2).concat((String)object4)));
                        n14 = (int)(((String)(object4 = ((TimeZone)object).getID())).equals(object2) ? 1 : 0);
                        if (n14 == 0 && !(bl2 = ((String)(object4 = ((String)object4).replace(string5 = ":", string4 = ""))).equals(object2))) {
                            stringBuilder = new StringBuilder((String)object3);
                            stringBuilder.append((String)object2);
                            object3 = " given, resolves to ";
                            stringBuilder.append((String)object3);
                            object3 = ((TimeZone)object).getID();
                            stringBuilder.append((String)object3);
                            object3 = stringBuilder.toString();
                            object4 = new IndexOutOfBoundsException((String)object3);
                            throw object4;
                        }
                        object3 = object;
                    } else {
                        object3 = TIMEZONE_UTC;
                    }
                }
                object2 = new GregorianCalendar((TimeZone)object3);
                int n25 = 0;
                object3 = null;
                ((Calendar)object2).setLenient(false);
                n25 = 1;
                ((Calendar)object2).set(n25, n17);
                n15 -= n25;
                n25 = 2;
                try {
                    ((Calendar)object2).set(n25, n15);
                    n25 = 5;
                    ((Calendar)object2).set(n25, n10);
                    n25 = 11;
                    ((Calendar)object2).set(n25, n19);
                    n25 = 12;
                    ((Calendar)object2).set(n25, n16);
                    n25 = 13;
                    ((Calendar)object2).set(n25, n7);
                    n25 = 14;
                    ((Calendar)object2).set(n25, n8);
                    parsePosition2.setIndex(n18);
                    return ((Calendar)object2).getTime();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                }
                catch (NumberFormatException numberFormatException) {
                }
                catch (IndexOutOfBoundsException indexOutOfBoundsException) {}
                break block32;
            }
            object2 = "No time zone indicator";
            object3 = new IllegalArgumentException((String)object2);
            throw object3;
        }
        if (string3 == null) {
            string3 = null;
        } else {
            object2 = "\"";
            n3 = 34;
            string3 = oj_0.b((char)n3, (String)object2, string3);
        }
        object2 = var4_8.getMessage();
        if (object2 == null || (n3 = (int)(((String)object2).isEmpty() ? 1 : 0)) != 0) {
            object2 = new StringBuilder("(");
            object = var4_8.getClass().getName();
            ((StringBuilder)object2).append((String)object);
            object = ")";
            ((StringBuilder)object2).append((String)object);
            object2 = ((StringBuilder)object2).toString();
        }
        string3 = UX.c("Failed to parse date [", string3, "]: ", (String)object2);
        int n26 = parsePosition.getIndex();
        object = new ParseException(string3, n26);
        ((Throwable)object).initCause((Throwable)var4_8);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int parseInt(String string2, int n3, int n4) {
        int n7;
        if (n3 >= 0 && n4 <= (n7 = string2.length()) && n3 <= n4) {
            int n8;
            int n10;
            String string3 = "Invalid number: ";
            int n14 = 10;
            if (n3 < n4) {
                n10 = n3 + 1;
                n8 = Character.digit(string2.charAt(n3), n14);
                if (n8 < 0) {
                    StringBuilder stringBuilder = new StringBuilder(string3);
                    string2 = string2.substring(n3, n4);
                    stringBuilder.append(string2);
                    string2 = stringBuilder.toString();
                    NumberFormatException numberFormatException = new NumberFormatException(string2);
                    throw numberFormatException;
                }
                n8 = -n8;
            } else {
                n8 = 0;
                n10 = n3;
            }
            while (true) {
                if (n10 >= n4) {
                    return -n8;
                }
                int n15 = n10 + 1;
                if ((n10 = Character.digit(string2.charAt(n10), n14)) < 0) {
                    StringBuilder stringBuilder = new StringBuilder(string3);
                    string2 = string2.substring(n3, n4);
                    stringBuilder.append(string2);
                    string2 = stringBuilder.toString();
                    NumberFormatException numberFormatException = new NumberFormatException(string2);
                    throw numberFormatException;
                }
                n8 = n8 * 10 - n10;
                n10 = n15;
            }
        }
        NumberFormatException numberFormatException = new NumberFormatException(string2);
        throw numberFormatException;
    }
}

