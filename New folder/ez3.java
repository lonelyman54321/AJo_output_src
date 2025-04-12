/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;
import okio.a;

public final class ez3 {
    public static final byte[] a;
    public static final m41_0 b;
    public static final jl2_2 c;
    public static final aa2_2 d;
    public static final TimeZone e;
    public static final Regex f;
    public static final String g;

    static {
        Object object = new byte[]{};
        a = object;
        b = m41$b.c(new String[0]);
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = new ce_2();
        ((ce_2)object3).Q((byte[])object);
        long l2 = 0;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        c = object2 = new jl2_2(null, l2, (se_1)object3);
        PJ2$a.d(pj2_2.Companion, object, null, 0, 7);
        object = ff_2.d;
        object = ff$a_0.b("efbbbf");
        object2 = ff$a_0.b("feff");
        object3 = ff$a_0.b("fffe");
        ff_2 ff_22 = ff$a_0.b("0000ffff");
        ff_2 ff_23 = ff$a_0.b("ffff0000");
        ff_2[] ff_2Array = new ff_2[]{object, object2, object3, ff_22, ff_23};
        d = aa2$a.b(ff_2Array);
        Object object4 = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(object4);
        e = object4;
        object4 = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        f = object4;
        object4 = x72_0.class.getName();
        Intrinsics.checkNotNullExpressionValue(object4, "OkHttpClient::class.java.name");
        g = StringsKt.V(StringsKt.U((String)object4, "okhttp3."), "Client");
    }

    public static final boolean a(ob1_1 object, ob1_1 object2) {
        boolean bl2;
        int n3;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object2, "other");
        String string2 = ((ob1_1)object).d;
        String string3 = ((ob1_1)object2).d;
        int n4 = Intrinsics.areEqual(string2, string3);
        if (n4 != 0 && (n4 = ((ob1_1)object).e) == (n3 = ((ob1_1)object2).e) && (bl2 = Intrinsics.areEqual(object = ((ob1_1)object).a, object2 = ((ob1_1)object2).a))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static final int b(String object, long l2, TimeUnit timeUnit) {
        String string2 = "name";
        Intrinsics.checkNotNullParameter(object, string2);
        long l3 = 0L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            if (timeUnit != null) {
                long l7;
                long l8 = (l2 = timeUnit.toMillis(l2)) - (l7 = Integer.MAX_VALUE);
                Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                if (object2 <= 0) {
                    object2 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                    if (object2 == false && l4 > 0) {
                        object = ((String)object).concat(" too small.");
                        object = object.toString();
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                        throw illegalArgumentException;
                    }
                    return (int)l2;
                }
                object = ((String)object).concat(" too large.");
                object = object.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            String string3 = "unit == null".toString();
            object = new IllegalStateException(string3);
            throw object;
        }
        object = ((String)object).concat(" < 0");
        object = object.toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void c(Closeable closeable) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(closeable, string2);
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void d(Socket socket) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(socket, string2);
        try {
            socket.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            string2 = runtimeException.getMessage();
            String string3 = "bio == null";
            boolean bl2 = Intrinsics.areEqual(string2, string3);
            if (!bl2) throw runtimeException;
            return;
        }
        catch (AssertionError assertionError) {
            throw assertionError;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static final int e(int n3, int n4, String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        String string4 = "delimiters";
        Intrinsics.checkNotNullParameter(string3, string4);
        while (n3 < n4) {
            char c2 = string2.charAt(n3);
            if ((c2 = (char)(StringsKt.G(string3, c2) ? 1 : 0)) != '\u0000') {
                return n3;
            }
            ++n3;
        }
        return n4;
    }

    public static final int f(String string2, char c2, int n3, int n4) {
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(string2, string3);
        while (n3 < n4) {
            char c3 = string2.charAt(n3);
            if (c3 == c2) {
                return n3;
            }
            ++n3;
        }
        return n4;
    }

    public static /* synthetic */ int g(String string2, char c2, int n3, int n4, int n7) {
        int n8 = n7 & 2;
        if (n8 != 0) {
            n3 = 0;
        }
        if ((n7 &= 4) != 0) {
            n4 = string2.length();
        }
        return ez3.f(string2, c2, n3, n4);
    }

    public static final boolean h(a93_0 a93_02, TimeUnit timeUnit) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(a93_02, "<this>");
        String string2 = "timeUnit";
        Intrinsics.checkNotNullParameter((Object)timeUnit, string2);
        int n3 = 100;
        try {
            bl2 = ez3.u(a93_02, n3, timeUnit);
        }
        catch (IOException iOException) {
            bl2 = false;
            a93_02 = null;
        }
        return bl2;
    }

    public static final String i(String string2, Object ... objectArray) {
        Intrinsics.checkNotNullParameter(string2, "format");
        Intrinsics.checkNotNullParameter(objectArray, "args");
        Object object = StringCompanionObject.INSTANCE;
        object = Locale.US;
        int n3 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n3);
        n3 = objectArray.length;
        return IV0.a(objectArray, n3, (Locale)object, string2, "format(locale, format, *args)");
    }

    public static final boolean j(String[] stringArray, String[] stringArray2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(stringArray, "<this>");
        String string2 = "comparator";
        Intrinsics.checkNotNullParameter(comparator, string2);
        int n3 = stringArray.length;
        if (n3 != 0 && stringArray2 != null && (n3 = stringArray2.length) != 0) {
            for (String string3 : stringArray) {
                int n4;
                Iterator iterator = ArrayIteratorKt.iterator(stringArray2);
                while ((n4 = iterator.hasNext()) != 0) {
                    String string4 = (String)iterator.next();
                    n4 = comparator.compare(string3, string4);
                    if (n4 != 0) continue;
                    return true;
                }
            }
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final long k(cl2_2 object) {
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object, string2);
        String string3 = "Content-Length";
        object = ((cl2_2)object).f.a(string3);
        long l2 = -1;
        if (object == null) return l2;
        Intrinsics.checkNotNullParameter(object, string2);
        try {
            return Long.parseLong((String)object);
        }
        catch (NumberFormatException numberFormatException) {
            return l2;
        }
    }

    public static final List l(Object ... object) {
        Intrinsics.checkNotNullParameter(object, "elements");
        object = (Object[])object.clone();
        int n3 = ((Object[])object).length;
        object = Collections.unmodifiableList(xx_2.i(Arrays.copyOf(object, n3)));
        Intrinsics.checkNotNullExpressionValue(object, "unmodifiableList(listOf(*elements.clone()))");
        return object;
    }

    public static final int m(String string2) {
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(string2, string3);
        int n3 = string2.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4 = string2.charAt(i3);
            int n7 = Intrinsics.compare(n4, 31);
            if (n7 > 0 && (n4 = Intrinsics.compare(n4, n7 = 127)) < 0) {
                continue;
            }
            return i3;
        }
        return -1;
    }

    public static final int n(int n3, int n4, String string2) {
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(string2, string3);
        while (n3 < n4) {
            int n7;
            int n8 = string2.charAt(n3);
            if (n8 == (n7 = 9) || n8 == (n7 = 10) || n8 == (n7 = 12) || n8 == (n7 = 13) || n8 == (n7 = 32)) {
                ++n3;
                continue;
            }
            return n3;
        }
        return n4;
    }

    public static final int o(int n3, int n4, String string2) {
        block3: {
            String string3 = "<this>";
            Intrinsics.checkNotNullParameter(string2, string3);
            if (n3 <= (n4 += -1)) {
                int n7;
                int n8;
                while ((n8 = string2.charAt(n4)) == (n7 = 9) || n8 == (n7 = 10) || n8 == (n7 = 12) || n8 == (n7 = 13) || n8 == (n7 = 32)) {
                    if (n4 != n3) {
                        n4 += -1;
                        continue;
                    }
                    break block3;
                }
                return n4 + 1;
            }
        }
        return n3;
    }

    public static final String[] p(String[] stringArray, String[] stringArray2, Comparator comparator) {
        Intrinsics.checkNotNullParameter(stringArray, "<this>");
        Intrinsics.checkNotNullParameter(stringArray2, "other");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        ArrayList<String> arrayList = new ArrayList<String>();
        block0: for (String string2 : stringArray) {
            for (String string3 : stringArray2) {
                int n3 = comparator.compare(string2, string3);
                if (n3 != 0) continue;
                arrayList.add(string2);
                continue block0;
            }
        }
        stringArray = new String[]{};
        return arrayList.toArray(stringArray);
    }

    public static final boolean q(String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "name");
        String string3 = "Authorization";
        boolean bl3 = true;
        boolean bl4 = kotlin.text.b.i(string2, string3, bl3);
        if (!(bl4 || (bl4 = kotlin.text.b.i(string2, string3 = "Cookie", bl3)) || (bl4 = kotlin.text.b.i(string2, string3 = "Proxy-Authorization", bl3)) || (bl2 = kotlin.text.b.i(string2, string3 = "Set-Cookie", bl3)))) {
            bl3 = false;
        }
        return bl3;
    }

    public static final int r(char n3) {
        int n4;
        int n7 = 48;
        n3 = n7 <= n3 && n3 < (n4 = 58) ? (n3 -= n7) : ((n7 = 97) <= n3 && n3 < (n7 = 103) ? (n3 += -87) : ((n7 = 65) <= n3 && n3 < (n7 = 71) ? (n3 += -55) : -1));
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final Charset s(se_1 object, Charset object2) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(object2, "default");
        Object object3 = d;
        int n3 = object.d0((aa2_2)object3);
        int n4 = -1;
        if (n3 == n4) return object2;
        if (n3 != 0) {
            int n7 = 1;
            if (n3 != n7) {
                n7 = 2;
                if (n3 != n7) {
                    n7 = 3;
                    object3 = "forName(...)";
                    if (n3 != n7) {
                        n7 = 4;
                        if (n3 == n7) {
                            Charsets.a.getClass();
                            object = Charsets.d;
                            if (object != null) return object;
                            object = Charset.forName("UTF-32LE");
                            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                            Charsets.d = object;
                            return object;
                        }
                        object = new AssertionError();
                        throw object;
                    }
                    Charsets.a.getClass();
                    object = Charsets.e;
                    if (object != null) return object;
                    object = Charset.forName("UTF-32BE");
                    Intrinsics.checkNotNullExpressionValue(object, (String)object3);
                    Charsets.e = object;
                    return object;
                }
                object2 = StandardCharsets.UTF_16LE;
                object = "UTF_16LE";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object);
                return object2;
            } else {
                object2 = StandardCharsets.UTF_16BE;
                object = "UTF_16BE";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object);
            }
            return object2;
        } else {
            object2 = StandardCharsets.UTF_8;
            object = "UTF_8";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object);
        }
        return object2;
    }

    public static final int t(se_1 se_12) {
        Intrinsics.checkNotNullParameter(se_12, "<this>");
        int n3 = (se_12.readByte() & 0xFF) << 16;
        int n4 = (se_12.readByte() & 0xFF) << 8;
        return se_12.readByte() & 0xFF | (n3 |= n4);
    }

    public static final boolean u(a93_0 object, int n3, TimeUnit timeUnit) {
        boolean bl2;
        block18: {
            long l2;
            long l3;
            block17: {
                long l4;
                Throwable throwable2;
                block16: {
                    ce_2 ce_22;
                    Intrinsics.checkNotNullParameter(object, "<this>");
                    String string2 = "timeUnit";
                    Intrinsics.checkNotNullParameter((Object)timeUnit, string2);
                    long l7 = System.nanoTime();
                    a a2 = object.timeout();
                    boolean bl3 = a2.e();
                    l3 = Long.MAX_VALUE;
                    if (bl3) {
                        a2 = object.timeout();
                        l2 = a2.c() - l7;
                    } else {
                        l2 = l3;
                    }
                    a2 = object.timeout();
                    long l8 = n3;
                    long l12 = timeUnit.toNanos(l8);
                    l12 = Math.min(l2, l12) + l7;
                    a2.d(l12);
                    try {
                        ce_22 = new ce_2();
                    }
                    catch (Throwable throwable2) {
                        break block16;
                    }
                    catch (InterruptedIOException interruptedIOException) {
                        break block17;
                    }
                    while (true) {
                        l8 = 8192L;
                        l8 = object.a0(ce_22, l8);
                        long l14 = -1;
                        l4 = l8 == l14 ? 0 : (l8 < l14 ? -1 : 1);
                        if (l4 == false) break;
                        ce_22.b();
                        continue;
                        break;
                    }
                    n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
                    if (n3 == 0) {
                        object = object.timeout();
                        ((a)object).a();
                    } else {
                        object = object.timeout();
                        ((a)object).d(l7 += l2);
                    }
                    bl2 = true;
                    break block18;
                }
                l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 == false) {
                    object = object.timeout();
                    ((a)object).a();
                } else {
                    object = object.timeout();
                    ((a)object).d(l7 += l2);
                }
                throw throwable2;
            }
            n3 = (int)(l2 == l3 ? 0 : (l2 < l3 ? -1 : 1));
            if (n3 == 0) {
                object = object.timeout();
                ((a)object).a();
            } else {
                object = object.timeout();
                ((a)object).d(l7 += l2);
            }
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public static final m41_0 v(List object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        m41$a_0 m41$a_0 = new m41$a_0();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (w31_0)object.next();
            String string2 = ((w31_0)object2).a.q();
            object2 = ((w31_0)object2).b.q();
            m41$a_0.c(string2, (String)object2);
        }
        return m41$a_0.e();
    }

    public static final String w(ob1_1 object, boolean bl2) {
        String string2;
        block5: {
            int n3;
            block4: {
                int n4;
                Intrinsics.checkNotNullParameter(object, "<this>");
                String string3 = ((ob1_1)object).d;
                String string4 = ":";
                n3 = StringsKt.F(string3, string4, false);
                string2 = ((ob1_1)object).d;
                if (n3 != 0) {
                    string3 = "[";
                    char c2 = ']';
                    string2 = oj_0.b(c2, string3, string2);
                }
                n3 = ((ob1_1)object).e;
                if (bl2) break block4;
                object = ((ob1_1)object).a;
                Intrinsics.checkNotNullParameter(object, "scheme");
                String string5 = "http";
                boolean bl3 = Intrinsics.areEqual(object, string5);
                n4 = bl3 ? 80 : ((n4 = (int)(Intrinsics.areEqual(object, string5 = "https") ? 1 : 0)) != 0 ? 443 : -1);
                if (n3 == n4) break block5;
            }
            object = new StringBuilder();
            ((StringBuilder)object).append(string2);
            char c3 = ':';
            ((StringBuilder)object).append(c3);
            ((StringBuilder)object).append(n3);
            string2 = ((StringBuilder)object).toString();
        }
        return string2;
    }

    public static final List x(List list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        list = Collections.unmodifiableList(CollectionsKt.m0(list));
        Intrinsics.checkNotNullExpressionValue(list, "unmodifiableList(toMutableList())");
        return list;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final int y(int n3, String string2) {
        if (string2 == null) return n3;
        try {
            long l2 = Long.parseLong(string2);
            long l3 = Integer.MAX_VALUE;
            Object object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
            if (object > 0) {
                return -1 >>> 1;
            }
            l3 = 0L;
            long l4 = l2 - l3;
            object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object >= 0) return (int)l2;
            return 0;
        }
        catch (NumberFormatException numberFormatException) {
            return n3;
        }
    }

    public static final String z(int n3, int n4, String string2) {
        Intrinsics.checkNotNullParameter(string2, "<this>");
        n3 = ez3.n(n3, n4, string2);
        n4 = ez3.o(n3, n4, string2);
        String string3 = string2.substring(n3, n4);
        Intrinsics.checkNotNullExpressionValue(string3, "this as java.lang.String\u2026ing(startIndex, endIndex)");
        return string3;
    }
}

