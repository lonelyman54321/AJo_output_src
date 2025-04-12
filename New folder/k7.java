/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.text.TextUtils;
import android.util.Log;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

public final class k7 {
    public static final String a(String object, String object2, String string2) {
        block5: {
            block4: {
                Intrinsics.checkNotNullParameter(object, "date");
                Intrinsics.checkNotNullParameter(object2, "inputFormat");
                Intrinsics.checkNotNullParameter(string2, "outputFormat");
                Locale locale = Locale.ENGLISH;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object2, locale);
                object2 = new SimpleDateFormat(string2, locale);
                int n3 = ((String)object).length();
                if (n3 <= 0) break block4;
                object = simpleDateFormat.parse((String)object);
                try {
                    object = ((DateFormat)object2).format((Date)object);
                    break block5;
                }
                catch (Exception exception) {
                    object2 = yn3_0.a;
                    ((yn3$a)object2).e(exception);
                }
            }
            object = "";
        }
        return object;
    }

    public static final long b(String object) {
        int n3;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Date date = new Date();
        if (object != null && (n3 = object.length()) != 0 && object != null) {
            int n4;
            String string2;
            n3 = ((String)object).length();
            for (int i3 = 0; i3 < n3; ++i3) {
                boolean bl2 = Character.isDigit(((String)object).charAt(i3));
                if (bl2) continue;
                object = ((String)object).substring(0, i3);
                string2 = "substring(...)";
                Intrinsics.checkNotNullExpressionValue(object, string2);
                break;
            }
            ref$IntRef.element = n4 = Integer.parseInt((String)object);
            if (n4 < 0) {
                return -1;
            }
            object = Calendar.getInstance();
            string2 = "getInstance(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            ((Calendar)object).setTime(date);
            int n7 = 5;
            int n8 = ref$IntRef.element;
            ((Calendar)object).add(n7, n8);
            date = ((Calendar)object).getTime();
        }
        return date.getTime();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String c(String object, String object2, String objectArray) {
        Exception exception2;
        String string2;
        block4: {
            Locale locale;
            Object object3;
            block3: {
                Intrinsics.checkNotNullParameter(object2, "olddateFormat");
                object3 = "originalDateFormat";
                Intrinsics.checkNotNullParameter(objectArray, (String)object3);
                boolean bl2 = TextUtils.isEmpty((CharSequence)object);
                string2 = "";
                if (bl2) {
                    return string2;
                }
                try {
                    locale = Locale.ENGLISH;
                    object3 = new SimpleDateFormat((String)objectArray, locale);
                    boolean bl3 = TextUtils.isEmpty((CharSequence)object2);
                    if (!bl3) break block3;
                    object2 = "dd-MM-yyyy";
                }
                catch (Exception exception2) {
                    break block4;
                }
            }
            objectArray = new SimpleDateFormat((String)object2, locale);
            object = ((DateFormat)object3).parse((String)object);
            object2 = Calendar.getInstance();
            ((Calendar)object2).clear();
            ((Calendar)object2).setTime((Date)object);
            object = ((Calendar)object2).getTime();
            object = objectArray.format((Date)object);
            object2 = "format(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            return object;
        }
        object2 = yn3_0.a;
        ((yn3$a)object2).e(exception2);
        String string3 = Log.getStackTraceString((Throwable)exception2);
        objectArray = new Object[]{};
        ((yn3$a)object2).a(string3, objectArray);
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String d(long l2, long l3) {
        Exception exception2;
        String string2;
        block12: {
            Object object;
            int n3;
            int n4;
            Object object2;
            int n7;
            Calendar calendar;
            Calendar calendar2;
            int n8;
            long l4;
            int n10;
            int n14;
            block11: {
                n14 = 2;
                n10 = 5;
                l4 = 0L;
                string2 = "";
                n8 = -1;
                calendar2 = null;
                Object object3 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                if (object3 >= 0) {
                    try {
                        calendar = Calendar.getInstance();
                        Intrinsics.checkNotNull(calendar);
                        calendar.setTimeInMillis(l2);
                        n7 = calendar.get(n10);
                        object2 = k7.o(n7);
                        n4 = calendar.get(n14) + 1;
                        break block11;
                    }
                    catch (Exception exception2) {
                        break block12;
                    }
                }
                object2 = string2;
                object3 = 0;
                calendar = null;
                n7 = -1;
                n4 = -1;
            }
            long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (l7 >= 0) {
                calendar2 = Calendar.getInstance();
                Intrinsics.checkNotNull(calendar2);
                calendar2.setTimeInMillis(l3);
                n8 = calendar2.get(n10);
                n3 = calendar2.get(n14) + 1;
                object = k7.o(n8);
                int n15 = n8;
                n8 = n3;
                n3 = n15;
            } else {
                object = string2;
                n3 = -1;
            }
            if (n4 == n8 && n3 == n7) {
                n8 = 0;
            }
            Object object4 = " 'MMM";
            Object object5 = "dd'";
            if (n4 > 0 && n8 > 0) {
                if (n8 == n4) {
                    StringBuilder stringBuilder = new StringBuilder((String)object5);
                    stringBuilder.append((String)object2);
                    object2 = "'";
                    stringBuilder.append((String)object2);
                    object2 = stringBuilder.toString();
                    stringBuilder = new StringBuilder((String)object5);
                    stringBuilder.append((String)object);
                    stringBuilder.append((String)object4);
                    object4 = stringBuilder.toString();
                } else {
                    StringBuilder stringBuilder = new StringBuilder((String)object5);
                    stringBuilder.append((String)object2);
                    stringBuilder.append((String)object4);
                    object2 = stringBuilder.toString();
                    stringBuilder = new StringBuilder((String)object5);
                    stringBuilder.append((String)object);
                    stringBuilder.append((String)object4);
                    object4 = stringBuilder.toString();
                }
                object = Locale.ENGLISH;
                object5 = new SimpleDateFormat((String)object2, (Locale)object);
                object2 = new SimpleDateFormat((String)object4, (Locale)object);
                Intrinsics.checkNotNull(calendar);
                object4 = calendar.getTime();
                object4 = ((DateFormat)object5).format((Date)object4);
                Intrinsics.checkNotNull(calendar2);
                object5 = calendar2.getTime();
                object2 = ((DateFormat)object2).format((Date)object5);
                object5 = new StringBuilder();
                ((StringBuilder)object5).append((String)object4);
                object4 = " - ";
                ((StringBuilder)object5).append((String)object4);
                ((StringBuilder)object5).append((String)object2);
                return ((StringBuilder)object5).toString();
            }
            String string3 = "format(...)";
            if (n4 > 0) {
                object = new StringBuilder((String)object5);
                ((StringBuilder)object).append((String)object2);
                ((StringBuilder)object).append((String)object4);
                object4 = ((StringBuilder)object).toString();
                object5 = Locale.ENGLISH;
                object2 = new SimpleDateFormat((String)object4, (Locale)object5);
                Intrinsics.checkNotNull(calendar);
                object4 = calendar.getTime();
                object4 = ((DateFormat)object2).format((Date)object4);
                Intrinsics.checkNotNullExpressionValue(object4, string3);
                return object4;
            }
            if (n8 <= 0) return string2;
            object2 = new StringBuilder((String)object5);
            ((StringBuilder)object2).append((String)object);
            ((StringBuilder)object2).append((String)object4);
            object4 = ((StringBuilder)object2).toString();
            object5 = Locale.ENGLISH;
            object2 = new SimpleDateFormat((String)object4, (Locale)object5);
            Intrinsics.checkNotNull(calendar2);
            object4 = calendar2.getTime();
            object4 = ((DateFormat)object2).format((Date)object4);
            Intrinsics.checkNotNullExpressionValue(object4, string3);
            return object4;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String e(long l2, long l3) {
        Exception exception2;
        block10: {
            int n3;
            int n4;
            int n7;
            Calendar calendar;
            Calendar calendar2;
            int n8;
            long l4;
            int n10;
            int n14;
            block9: {
                n14 = 2;
                n10 = 5;
                l4 = 0L;
                n8 = -1;
                calendar2 = null;
                Object object = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                if (object >= 0) {
                    try {
                        calendar = Calendar.getInstance();
                        Intrinsics.checkNotNull(calendar);
                        calendar.setTimeInMillis(l2);
                        n7 = calendar.get(n10);
                        n4 = calendar.get(n14) + 1;
                        break block9;
                    }
                    catch (Exception exception2) {
                        break block10;
                    }
                }
                object = 0;
                calendar = null;
                n7 = -1;
                n4 = -1;
            }
            long l7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (l7 >= 0) {
                calendar2 = Calendar.getInstance();
                Intrinsics.checkNotNull(calendar2);
                calendar2.setTimeInMillis(l3);
                n8 = calendar2.get(n10);
                n3 = calendar2.get(n14) + 1;
                int n15 = n8;
                n8 = n3;
                n3 = n15;
            } else {
                n3 = -1;
            }
            if (n4 == n8 && n3 == n7) {
                n8 = 0;
            }
            Object object = "yyyyMMdd";
            if (n4 > 0 && n8 > 0) {
                Serializable serializable = Locale.ENGLISH;
                Object object2 = new SimpleDateFormat((String)object, (Locale)serializable);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object, (Locale)serializable);
                Intrinsics.checkNotNull(calendar);
                object = calendar.getTime();
                object = ((DateFormat)object2).format((Date)object);
                Intrinsics.checkNotNull(calendar2);
                object2 = calendar2.getTime();
                object2 = simpleDateFormat.format((Date)object2);
                serializable = new StringBuilder();
                ((StringBuilder)serializable).append((String)object);
                object = " - ";
                ((StringBuilder)serializable).append((String)object);
                ((StringBuilder)serializable).append((String)object2);
                return ((StringBuilder)serializable).toString();
            }
            String string2 = "format(...)";
            if (n4 > 0) {
                Locale locale = Locale.ENGLISH;
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object, locale);
                Intrinsics.checkNotNull(calendar);
                object = calendar.getTime();
                object = simpleDateFormat.format((Date)object);
                Intrinsics.checkNotNullExpressionValue(object, string2);
                return object;
            }
            if (n8 <= 0) return "";
            Locale locale = Locale.ENGLISH;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object, locale);
            Intrinsics.checkNotNull(calendar2);
            object = calendar2.getTime();
            object = simpleDateFormat.format((Date)object);
            Intrinsics.checkNotNullExpressionValue(object, string2);
            return object;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
        return "";
    }

    public static final String f(long l2, String objectArray) {
        Object object;
        long l3 = -1;
        String string2 = "";
        Object object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (object2 == false) {
            return string2;
        }
        boolean bl2 = TextUtils.isEmpty((CharSequence)objectArray);
        if (bl2) {
            objectArray = "dd-MM-yyyy";
        }
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)objectArray, locale);
        try {
            objectArray = Calendar.getInstance();
        }
        catch (Exception exception) {
            object = yn3_0.a;
            ((yn3$a)object).e(exception);
            String string3 = Log.getStackTraceString((Throwable)exception);
            objectArray = new Object[]{};
            ((yn3$a)object).a(string3, objectArray);
            return string2;
        }
        objectArray.clear();
        objectArray.setTimeInMillis(l2);
        Object object3 = objectArray.getTime();
        object3 = simpleDateFormat.format((Date)object3);
        object = "format(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object);
        return object3;
    }

    public static final Calendar g(CharSequence object, String object2) {
        Object object3 = "dateFormat";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        Calendar calendar = null;
        if (!bl2) {
            Locale locale = Locale.ENGLISH;
            object3 = new SimpleDateFormat((String)object2, locale);
            object = String.valueOf(object);
            object = ((DateFormat)object3).parse((String)object);
            calendar = Calendar.getInstance();
            try {
                calendar.setTime((Date)object);
            }
            catch (ParseException parseException) {
                object2 = yn3_0.a;
                ((yn3$a)object2).e(parseException);
            }
        }
        return calendar;
    }

    public static final String h(Date object) {
        if (object == null) {
            return "";
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime((Date)object);
        Intrinsics.checkNotNull(calendar);
        object = k7.o(calendar.get(5));
        object = cP.a("d'", (String)object, "' MMMM, yyyy");
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object, locale);
        object = calendar.getTime();
        object = simpleDateFormat.format((Date)object);
        Intrinsics.checkNotNullExpressionValue(object, "format(...)");
        return object;
    }

    public static final String i(String object) {
        Intrinsics.checkNotNullParameter(object, "dateFormatString");
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object, locale);
        object = Calendar.getInstance().getTime();
        object = simpleDateFormat.format((Date)object);
        Intrinsics.checkNotNullExpressionValue(object, "format(...)");
        return object;
    }

    public static final Date j(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        Date date = null;
        if (bl2) {
            return null;
        }
        String string3 = "yyyy-MM-dd'T'HH:mm:ssZ";
        Locale locale = Locale.ENGLISH;
        Object object = new SimpleDateFormat(string3, locale);
        try {
            date = ((DateFormat)object).parse(string2);
        }
        catch (ParseException parseException) {
            object = yn3_0.a;
            ((yn3$a)object).e(parseException);
        }
        return date;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String k(String string2) {
        Exception exception2;
        String string3;
        block3: {
            long l2;
            SimpleDateFormat simpleDateFormat;
            Object object;
            boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
            string3 = "";
            if (bl2) {
                return string3;
            }
            try {
                object = "dd MMM ''yy";
                Locale locale = Locale.ENGLISH;
                simpleDateFormat = new SimpleDateFormat((String)object, locale);
                l2 = string2 != null ? Long.parseLong(string2) : 0L;
            }
            catch (Exception exception2) {
                break block3;
            }
            object = new Date(l2);
            return simpleDateFormat.format((Date)object);
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
        return string3;
    }

    public static final String l(long l2) {
        Object object = StringCompanionObject.INSTANCE;
        object = TimeUnit.MILLISECONDS;
        Long l3 = ((TimeUnit)((Object)object)).toHours(l2);
        long l4 = ((TimeUnit)((Object)object)).toMinutes(l2);
        TimeUnit timeUnit = TimeUnit.HOURS;
        long l7 = ((TimeUnit)((Object)object)).toHours(l2);
        long l8 = timeUnit.toMinutes(l7);
        Long l12 = l4 - l8;
        long l14 = ((TimeUnit)((Object)object)).toSeconds(l2);
        TimeUnit timeUnit2 = TimeUnit.MINUTES;
        l2 = ((TimeUnit)((Object)object)).toMinutes(l2);
        l2 = timeUnit2.toSeconds(l2);
        Long l15 = l14 - l2;
        int n3 = 3;
        object = new Object[n3];
        object[0] = l3;
        object[1] = l12;
        object[2] = l15;
        return xh2_0.a((Object[])object, n3, "%02dh %02dm %02ds", "format(...)");
    }

    public static final String m(String object) {
        Object object2 = "dateInString";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        if (bl2) {
            return "";
        }
        object = k7.j((String)object);
        Locale locale = Locale.ENGLISH;
        object2 = new SimpleDateFormat("dd MMM", locale);
        return ((DateFormat)object2).format((Date)object);
    }

    public static final String n(String object) {
        Object object2;
        Object object3 = "dateInString";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        String string2 = "";
        if (bl2) {
            return string2;
        }
        bl2 = TextUtils.isEmpty((CharSequence)object);
        Date date = null;
        if (!bl2) {
            object2 = "yyyy-MM-dd";
            Locale locale = Locale.ENGLISH;
            object3 = new SimpleDateFormat((String)object2, locale);
            try {
                date = ((DateFormat)object3).parse((String)object);
            }
            catch (ParseException parseException) {
                object3 = yn3_0.a;
                ((yn3$a)object3).e(parseException);
            }
        }
        object3 = "dd MMM";
        object2 = Locale.ENGLISH;
        object = new SimpleDateFormat((String)object3, (Locale)object2);
        if (date == null) {
            return string2;
        }
        return ((DateFormat)object).format(date);
    }

    public static String o(int n3) {
        int n4 = 11;
        String string2 = "th";
        if (n4 <= n3 && n3 < (n4 = 14)) {
            return string2;
        }
        n4 = 1;
        if ((n3 %= 10) != n4) {
            n4 = 2;
            if (n3 != n4) {
                n4 = 3;
                if (n3 == n4) {
                    string2 = "rd";
                }
            } else {
                string2 = "nd";
            }
        } else {
            string2 = "st";
        }
        return string2;
    }

    public static final long p() {
        return Calendar.getInstance(TimeZone.getTimeZone("IST")).getTimeInMillis();
    }

    public static final long q() {
        long l2 = Calendar.getInstance(TimeZone.getTimeZone("IST")).getTimeInMillis();
        long l3 = 1000;
        return l2 / l3;
    }

    public static String r(String object) {
        int n3;
        if (object != null && (n3 = ((String)object).length()) != 0) {
            Locale locale = Locale.ENGLISH;
            String string2 = "yyyy-MM-dd'T'HH:mm";
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string2, locale);
            object = simpleDateFormat.parse((String)object);
            if (object == null) {
                return null;
            }
            string2 = "dd MMM, hh:mm a";
            simpleDateFormat = new SimpleDateFormat(string2, locale);
            try {
                return simpleDateFormat.format((Date)object);
            }
            catch (Exception | ParseException exception) {}
        }
        return null;
    }

    public static final Long s(String object) {
        int n3;
        if (object != null && (n3 = object.length()) != 0) {
            Date date = new Date();
            String string2 = "yyyy-MM-dd hh:mm:ss";
            Locale locale = Locale.ENGLISH;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string2, locale);
            try {
                date = simpleDateFormat.parse((String)object);
            }
            catch (ParseException parseException) {}
            if (date != null) {
                long l2 = date.getTime();
                object = l2;
            } else {
                object = null;
            }
            return object;
        }
        return 0L;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final long t(String object) {
        void var0_6;
        int n3;
        int n4;
        String[] stringArray;
        List list;
        String string2 = null;
        if (object != null && (list = StringsKt.a0((CharSequence)object, stringArray = new String[]{":"}, false, 0, n4 = 6)) != null) {
            Collection collection = list;
            stringArray = new String[]{};
            String[] stringArray2 = collection.toArray(stringArray);
        } else {
            n3 = 0;
            Object var0_5 = null;
        }
        if (var0_6 == null) return 0L;
        int n7 = ((void)var0_6).length;
        n4 = 1;
        if (n7 == 0) {
            n7 = 1;
        } else {
            n7 = 0;
            stringArray = null;
        }
        if ((n7 ^= n4) == 0) return 0L;
        string2 = var0_6[0];
        long l2 = Long.parseLong(string2);
        void var0_7 = var0_6[n4];
        long l3 = Long.parseLong((String)var0_7);
        long l4 = (long)3600 * l2;
        n3 = 60;
        l2 = (long)n3 * l3 + l4;
        l3 = 1000;
        return l2 * l3;
    }

    public static String u(String object) {
        Object object2 = new Date();
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", locale);
        Locale locale2 = null;
        if (object != null) {
            try {
                object2 = object = simpleDateFormat.parse((String)object);
            }
            catch (Exception exception) {}
        } else {
            object2 = null;
        }
        if (object2 != null) {
            locale2 = Locale.ENGLISH;
            object = new SimpleDateFormat("hh:mm a", locale2);
            return ((DateFormat)object).format((Date)object2);
        }
        return null;
    }

    public static String v(String object) {
        Object object2 = new Date();
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm", locale);
        if (object != null) {
            try {
                object2 = object = simpleDateFormat.parse((String)object);
            }
            catch (ParseException parseException) {}
        } else {
            object2 = null;
        }
        object = Calendar.getInstance().getTime();
        if (object2 != null) {
            ((Date)object2).getTime();
            long l2 = ((Date)object2).getTime();
            long l3 = ((Date)object).getTime();
            double d2 = Math.abs((double)(l2 - l3));
            l2 = (long)d2;
            l3 = 3600000;
            int n3 = (int)(l2 / l3);
            int n4 = 60000;
            l3 = n4;
            int n7 = (int)(l2 /= l3) % 60;
            if (n3 > 0 || n7 > 0) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(n3);
                ((StringBuilder)object2).append("h ");
                ((StringBuilder)object2).append(n7);
                ((StringBuilder)object2).append("m");
                return ((StringBuilder)object2).toString();
            }
        }
        return null;
    }

    public static final long w(String object, String object2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        long l2 = -1;
        if (bl2) {
            return l2;
        }
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat((String)object2, locale);
        try {
            object = simpleDateFormat.parse((String)object);
        }
        catch (Exception exception) {
            yn3_0.a.e(exception);
            return l2;
        }
        object2 = Calendar.getInstance();
        ((Calendar)object2).clear();
        ((Calendar)object2).setTime((Date)object);
        return ((Date)object).getTime();
    }

    public static final boolean x(long l2, String object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        boolean bl3 = false;
        if (bl2) {
            return false;
        }
        if ((object = k7.j((String)object)) != null) {
            Object object2 = new Date(l2);
            Intrinsics.checkNotNullParameter(object, "dateEarly");
            Intrinsics.checkNotNullParameter(object2, "dateLater");
            Object object3 = Calendar.getInstance();
            ((Calendar)object3).setTime((Date)object);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime((Date)object2);
            long l3 = calendar.getTimeInMillis();
            object = calendar.getTimeZone();
            long l4 = calendar.getTimeInMillis();
            int n3 = ((TimeZone)object).getOffset(l4);
            long l7 = n3;
            l3 += l7;
            l7 = ((Calendar)object3).getTimeInMillis();
            object2 = ((Calendar)object3).getTimeZone();
            l4 = ((Calendar)object3).getTimeInMillis();
            int n4 = ((TimeZone)object2).getOffset(l4);
            l4 = n4;
            object3 = TimeUnit.DAYS;
            object2 = TimeUnit.MILLISECONDS;
            l3 = ((TimeUnit)((Object)object3)).convert(l3, (TimeUnit)((Object)object2));
            l2 = ((TimeUnit)((Object)object3)).convert(l7 += l4, (TimeUnit)((Object)object2));
            l3 -= l2;
            l2 = 0L;
            long l8 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (l8 > 0) {
                bl3 = true;
            }
        }
        return bl3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean y(String object) {
        boolean bl2 = false;
        if (object == null) return bl2;
        int n3 = ((String)object).length();
        if (n3 == 0) {
            return bl2;
        }
        Object object2 = "yyyy-MM-dd'T'HH:mm";
        Locale locale = Locale.ENGLISH;
        Cloneable cloneable = new SimpleDateFormat((String)object2, locale);
        try {
            object = ((DateFormat)cloneable).parse((String)object);
            if (object == null) {
                return false;
            }
            cloneable = Calendar.getInstance();
            object2 = Calendar.getInstance();
            ((Calendar)object2).setTime((Date)object);
            int n4 = 1;
            int n7 = ((Calendar)object2).get(n4);
            int n8 = ((Calendar)cloneable).get(n4);
            if (n7 != n8) return bl2;
            n7 = 6;
            int n10 = ((Calendar)object2).get(n7);
            if (n10 != (n3 = ((Calendar)cloneable).get(n7))) return bl2;
            return true;
        }
        catch (Exception | ParseException exception) {
            return bl2;
        }
    }

    public static final long z(String object) {
        Intrinsics.checkNotNullParameter(object, "absoluteTime");
        String string2 = "yyyy-MM-dd'T'HH:mm:ss";
        Intrinsics.checkNotNullParameter(string2, "dateFormat");
        Locale locale = Locale.ENGLISH;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string2, locale);
        try {
            object = simpleDateFormat.parse((String)object);
        }
        catch (ParseException parseException) {
            return 0L;
        }
        return ((Date)object).getTime();
    }
}

