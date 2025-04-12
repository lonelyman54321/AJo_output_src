/*
 * Decompiled with CFR 0.152.
 */
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.b;

/*
 * Renamed from t72
 */
public final class t72_0
implements HostnameVerifier {
    public static final t72_0 a;

    static {
        t72_0 t72_02;
        a = t72_02 = new Object();
    }

    public static List a(X509Certificate iterator, int n3) {
        ArrayList arrayList;
        block15: {
            iterator = ((X509Certificate)((Object)iterator)).getSubjectAlternativeNames();
            if (iterator != null) break block15;
            return mz0_2.a;
        }
        try {
            arrayList = new ArrayList();
            iterator = iterator.iterator();
        }
        catch (CertificateParsingException certificateParsingException) {
            return mz0_2.a;
        }
        while (true) {
            boolean bl2 = iterator.hasNext();
            if (!bl2) break;
            Object object = iterator.next();
            if ((object = (List)object) == null) continue;
            int n4 = object.size();
            int n7 = 2;
            if (n4 < n7) continue;
            n4 = 0;
            Object var7_7 = null;
            var7_7 = object.get(0);
            Integer n8 = n3;
            n4 = (int)(Intrinsics.areEqual(var7_7, n8) ? 1 : 0);
            if (n4 == 0) continue;
            n4 = 1;
            object = object.get(n4);
            if (object == null) continue;
            object = (String)object;
            arrayList.add(object);
            continue;
            break;
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean b(String string2) {
        int n3 = string2.length();
        int n4 = string2.length();
        String string3 = "<this>";
        Intrinsics.checkNotNullParameter(string2, string3);
        if (n4 < 0) {
            string2 = Gj0.b(n4, "endIndex < beginIndex: ", " < 0");
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        int n7 = string2.length();
        if (n4 > n7) {
            StringBuilder stringBuilder = wk0_0.a(n4, "endIndex > string.length: ", " > ");
            int n8 = string2.length();
            stringBuilder.append(n8);
            string2 = stringBuilder.toString();
            string2 = string2.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        n7 = 0;
        string3 = null;
        long l2 = 0L;
        int n10 = 0;
        while (n10 < n4) {
            int n14 = string2.charAt(n10);
            int n15 = 128;
            long l3 = 1L;
            if (n14 < n15) {
                l2 += l3;
            } else {
                long l4;
                n15 = 2048;
                if (n14 < n15) {
                    n14 = 2;
                } else {
                    n15 = 55296;
                    if (n14 >= n15 && n14 <= (n15 = 57343)) {
                        int n16 = n10 + 1;
                        int n17 = n16 < n4 ? string2.charAt(n16) : 0;
                        int n18 = 56319;
                        if (n14 <= n18 && n17 >= (n14 = 56320) && n17 <= n15) {
                            n14 = 4;
                            l4 = n14;
                            l2 += l4;
                            n10 += 2;
                            continue;
                        }
                        l2 += l3;
                        n10 = n16;
                        continue;
                    }
                    n14 = 3;
                }
                l4 = n14;
                l2 += l4;
            }
            ++n10;
        }
        int n19 = (int)l2;
        if (n3 != n19) return n7 != 0;
        return 1 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static boolean c(String string2, X509Certificate iterator) {
        int n3 = 1;
        Intrinsics.checkNotNullParameter(string2, "host");
        Intrinsics.checkNotNullParameter(iterator, "certificate");
        Object object = ez3.a;
        Intrinsics.checkNotNullParameter(string2, "<this>");
        object = ez3.f;
        int n4 = ((Regex)object).c(string2);
        if (n4 != 0) {
            string2 = w91_0.b(string2);
            n4 = (iterator = (Iterable)t72_0.a(iterator, 7)) instanceof Collection;
            if (n4 != 0) {
                object = iterator;
                object = (Collection)((Object)iterator);
                n4 = object.isEmpty();
                if (n4 != 0) return 0 != 0;
            }
            iterator = ((Iterable)((Object)iterator)).iterator();
            do {
                if ((n4 = iterator.hasNext()) == 0) return 0 != 0;
            } while ((n4 = Intrinsics.areEqual(string2, object = w91_0.b((String)iterator.next()))) == 0);
            return n3 != 0;
        }
        n4 = t72_0.b(string2);
        String string3 = "this as java.lang.String).toLowerCase(locale)";
        String string4 = "US";
        if (n4 != 0) {
            object = Locale.US;
            string2 = zn0_1.a((Locale)object, string4, string2, (Locale)object, string3);
        }
        if ((n4 = (iterator = (Iterable)t72_0.a((X509Certificate)((Object)iterator), 2)) instanceof Collection) != 0) {
            object = iterator;
            object = (Collection)((Object)iterator);
            n4 = object.isEmpty();
            if (n4 != 0) return 0 != 0;
        }
        iterator = ((Iterable)((Object)iterator)).iterator();
        do {
            block14: {
                block13: {
                    int n7;
                    int n8;
                    int n10;
                    String string5;
                    int n14;
                    Object object2;
                    boolean bl2;
                    int n15;
                    if ((n4 = iterator.hasNext()) == 0) {
                        return 0 != 0;
                    }
                    object = (String)iterator.next();
                    if (string2 == null || (n15 = string2.length()) == 0 || (bl2 = b.s(string2, (String)(object2 = "."), false)) || (n14 = b.h(string2, string5 = "..", false)) != 0 || object == null || (n14 = ((String)object).length()) == 0 || (n14 = (int)(b.s((String)object, (String)object2, false) ? 1 : 0)) != 0 || (bl2 = b.h((String)object, string5, false))) break block13;
                    bl2 = b.h(string2, (String)object2, false);
                    string5 = !bl2 ? string2.concat((String)object2) : string2;
                    n14 = (int)(b.h((String)object, (String)object2, false) ? 1 : 0);
                    if (n14 == 0) {
                        object = ((String)object).concat((String)object2);
                    }
                    if ((n15 = (int)(t72_0.b((String)object) ? 1 : 0)) != 0) {
                        object2 = Locale.US;
                        object = zn0_1.a((Locale)object2, string4, (String)object, (Locale)object2, string3);
                    }
                    if ((n15 = (int)(StringsKt.F((CharSequence)object, (CharSequence)(object2 = "*"), false) ? 1 : 0)) == 0) {
                        n4 = Intrinsics.areEqual(string5, object);
                        continue;
                    }
                    object2 = "*.";
                    n14 = (int)(b.s((String)object, (String)object2, false) ? 1 : 0);
                    if (n14 == 0 || (n14 = StringsKt.N((CharSequence)object, '*', n3, false, n10 = 4)) != (n8 = -1) || (n14 = string5.length()) < (n7 = ((String)object).length()) || (n15 = (int)(Intrinsics.areEqual(object2, object) ? 1 : 0)) != 0) break block13;
                    object = ((String)object).substring(n3);
                    object2 = "this as java.lang.String).substring(startIndex)";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    n15 = (int)(b.h(string5, (String)object, false) ? 1 : 0);
                    if (n15 == 0) break block13;
                    n15 = string5.length();
                    n4 = ((String)object).length();
                    if ((n15 -= n4) <= 0 || (n4 = StringsKt.Q(string5, '.', n15 -= n3, n10)) == n8) break block14;
                }
                n4 = 0;
                object = null;
                continue;
            }
            n4 = 1;
        } while (n4 == 0);
        return n3 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean verify(String string2, SSLSession object) {
        Intrinsics.checkNotNullParameter(string2, "host");
        String string3 = "session";
        Intrinsics.checkNotNullParameter(object, string3);
        boolean bl2 = t72_0.b(string2);
        boolean bl3 = false;
        if (!bl2) {
            return bl3;
        }
        try {
            Certificate[] certificateArray = object.getPeerCertificates();
            Certificate certificate = certificateArray[0];
            string3 = "null cannot be cast to non-null type java.security.cert.X509Certificate";
            Intrinsics.checkNotNull(certificate, string3);
            X509Certificate x509Certificate = (X509Certificate)certificate;
            return t72_0.c(string2, x509Certificate);
        }
        catch (SSLException sSLException) {
            return bl3;
        }
    }
}

