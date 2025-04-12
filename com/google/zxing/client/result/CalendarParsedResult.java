/*
 * Decompiled with CFR 0.152.
 */
package com.google.zxing.client.result;

import com.google.zxing.client.result.ParsedResult;
import com.google.zxing.client.result.ParsedResultType;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class CalendarParsedResult
extends ParsedResult {
    private static final Pattern DATE_TIME;
    private static final Pattern RFC2445_DURATION;
    private static final long[] RFC2445_DURATION_FIELD_UNITS;
    private final String[] attendees;
    private final String description;
    private final long end;
    private final boolean endAllDay;
    private final double latitude;
    private final String location;
    private final double longitude;
    private final String organizer;
    private final long start;
    private final boolean startAllDay;
    private final String summary;

    static {
        long[] lArray;
        RFC2445_DURATION = Pattern.compile("P(?:(\\d+)W)?(?:(\\d+)D)?(?:T(?:(\\d+)H)?(?:(\\d+)M)?(?:(\\d+)S)?)?");
        long[] lArray2 = lArray = new long[5];
        long[] lArray3 = lArray;
        lArray2[0] = 604800000L;
        lArray3[1] = 86400000L;
        lArray2[2] = 3600000L;
        lArray3[3] = 60000L;
        lArray3[4] = 1000L;
        RFC2445_DURATION_FIELD_UNITS = lArray;
        DATE_TIME = Pattern.compile("[0-9]{8}(T[0-9]{6}Z?)?");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public CalendarParsedResult(String string2, String string3, String string4, String string5, String string6, String string7, String[] stringArray, String string8, double d2, double d5) {
        Object object;
        Object object2;
        block8: {
            long l2;
            block7: {
                long l3;
                CalendarParsedResult calendarParsedResult = this;
                object2 = ParsedResultType.CALENDAR;
                super((ParsedResultType)((Object)object2));
                object2 = string2;
                this.summary = string2;
                try {
                    this.start = l2 = CalendarParsedResult.parseDate(string3);
                    if (string4 != null) break block7;
                }
                catch (ParseException parseException) {
                    String string10 = ((Object)parseException).toString();
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string10);
                    throw illegalArgumentException;
                }
                long l4 = CalendarParsedResult.parseDurationMS(string5);
                long l7 = l4 - (l3 = 0L);
                object = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                l2 = object < 0 ? (long)-1 : (l2 += l4);
                calendarParsedResult.end = l2;
                break block8;
            }
            try {
                this.end = l2 = CalendarParsedResult.parseDate(string4);
            }
            catch (ParseException parseException) {
                String string9 = ((Object)parseException).toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string9);
                throw illegalArgumentException;
            }
        }
        object = string3.length();
        boolean bl2 = false;
        Object var23_22 = null;
        int n3 = 8;
        if (object == n3) {
            object = 1;
        } else {
            object = 0;
            object2 = null;
        }
        calendarParsedResult.startAllDay = object;
        if (string4 != null && (object = (Object)string4.length()) == n3) {
            bl2 = true;
        }
        calendarParsedResult.endAllDay = bl2;
        object2 = string6;
        calendarParsedResult.location = string6;
        object2 = string7;
        calendarParsedResult.organizer = string7;
        object2 = stringArray;
        calendarParsedResult.attendees = stringArray;
        object2 = string8;
        calendarParsedResult.description = string8;
        calendarParsedResult.latitude = d2;
        calendarParsedResult.longitude = d5;
    }

    private static String format(boolean bl2, long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            return null;
        }
        int n3 = 2;
        DateFormat dateFormat = bl2 ? DateFormat.getDateInstance(n3) : DateFormat.getDateTimeInstance(n3, n3);
        Long l7 = l2;
        return dateFormat.format(l7);
    }

    private static long parseDate(String object) {
        Object object2 = DATE_TIME.matcher((CharSequence)object);
        boolean n3 = ((Matcher)object2).matches();
        TimeZone timeZone = null;
        if (n3) {
            char c2;
            int n4;
            char c3;
            int n7;
            int n8 = ((String)object).length();
            if (n8 == (n7 = 8)) {
                Locale locale = Locale.ENGLISH;
                object2 = new SimpleDateFormat("yyyyMMdd", locale);
                timeZone = TimeZone.getTimeZone("GMT");
                ((DateFormat)object2).setTimeZone(timeZone);
                return ((DateFormat)object2).parse((String)object).getTime();
            }
            int n10 = ((String)object).length();
            if (n10 == (n7 = 16) && (c3 = ((String)object).charAt(n4 = 15)) == (c2 = 'Z')) {
                long l2 = CalendarParsedResult.parseDateTimeString(((String)object).substring(0, n4));
                object = new GregorianCalendar();
                long l3 = ((Calendar)object).get(n4);
                object2 = new Date(l2 += l3);
                ((Calendar)object).setTime((Date)object2);
                l3 = ((Calendar)object).get(n7);
                return l2 + l3;
            }
            return CalendarParsedResult.parseDateTimeString((String)object);
        }
        object2 = new ParseException((String)object, 0);
        throw object2;
    }

    private static long parseDateTimeString(String string2) {
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd'T'HHmmss", locale);
        return simpleDateFormat.parse(string2).getTime();
    }

    private static long parseDurationMS(CharSequence object) {
        long[] lArray;
        int n3;
        int n4;
        long l2 = -1;
        if (object == null) {
            return l2;
        }
        Pattern pattern = RFC2445_DURATION;
        boolean n42 = ((Matcher)(object = pattern.matcher((CharSequence)object))).matches();
        if (!n42) {
            return l2;
        }
        l2 = 0L;
        boolean bl2 = false;
        pattern = null;
        while (n4 < (n3 = (lArray = RFC2445_DURATION_FIELD_UNITS).length)) {
            n3 = n4 + true;
            String string2 = ((Matcher)object).group(n3);
            if (string2 != null) {
                long l3 = lArray[n4];
                int n7 = Integer.parseInt(string2);
                long l4 = n7;
                l2 = l3 = l3 * l4 + l2;
            }
            n4 = n3;
        }
        return l2;
    }

    public String[] getAttendees() {
        return this.attendees;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDisplayResult() {
        StringBuilder stringBuilder = new StringBuilder(100);
        ParsedResult.maybeAppend(this.summary, stringBuilder);
        boolean bl2 = this.startAllDay;
        long l2 = this.start;
        ParsedResult.maybeAppend(CalendarParsedResult.format(bl2, l2), stringBuilder);
        bl2 = this.endAllDay;
        l2 = this.end;
        ParsedResult.maybeAppend(CalendarParsedResult.format(bl2, l2), stringBuilder);
        ParsedResult.maybeAppend(this.location, stringBuilder);
        ParsedResult.maybeAppend(this.organizer, stringBuilder);
        ParsedResult.maybeAppend(this.attendees, stringBuilder);
        ParsedResult.maybeAppend(this.description, stringBuilder);
        return stringBuilder.toString();
    }

    public Date getEnd() {
        long l2 = this.end;
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            return null;
        }
        long l7 = this.end;
        Date date = new Date(l7);
        return date;
    }

    public long getEndTimestamp() {
        return this.end;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public String getLocation() {
        return this.location;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getOrganizer() {
        return this.organizer;
    }

    public Date getStart() {
        long l2 = this.start;
        Date date = new Date(l2);
        return date;
    }

    public long getStartTimestamp() {
        return this.start;
    }

    public String getSummary() {
        return this.summary;
    }

    public boolean isEndAllDay() {
        return this.endAllDay;
    }

    public boolean isStartAllDay() {
        return this.startAllDay;
    }
}

