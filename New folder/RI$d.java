/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class RI$d {
    public static final String k;
    public static final String l;
    public final ob1_1 a;
    public final m41_0 b;
    public final String c;
    public final ib2_2 d;
    public final int e;
    public final String f;
    public final m41_0 g;
    public final k21_0 h;
    public final long i;
    public final long j;

    static {
        zs2_2.a.getClass();
        k = "OkHttp-Sent-Millis";
        zs2_2.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public RI$d(a93_0 a93_02) {
        Throwable throwable2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        block16: {
            object4 = "<this>";
            object3 = "Cache corruption for ";
            object2 = "rawSource";
            Intrinsics.checkNotNullParameter(a93_02, (String)object2);
            try {
                String string2;
                int n3;
                char c2;
                object2 = o72_0.b(a93_02);
                long l2 = Long.MAX_VALUE;
                object = ((ie2_2)object2).x(l2);
                Intrinsics.checkNotNullParameter(object, (String)object4);
                try {
                    Intrinsics.checkNotNullParameter(object, (String)object4);
                    object4 = new Ob1$a();
                    ((Ob1$a)object4).e(null, (String)object);
                    object4 = ((Ob1$a)object4).b();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    c2 = '\u0000';
                    object4 = null;
                }
                if (object4 == null) break block16;
                this.a = object4;
                this.c = object4 = ((ie2_2)object2).x(l2);
                object4 = new m41$a_0();
                int n4 = RI$c.b((ie2_2)object2);
                int n7 = 0;
                object = null;
                Object object5 = null;
                for (n3 = 0; n3 < n4; ++n3) {
                    string2 = ((ie2_2)object2).x(l2);
                    ((m41$a_0)object4).b(string2);
                }
                this.b = object4 = ((m41$a_0)object4).e();
                object4 = ((ie2_2)object2).x(l2);
                object4 = zc3$a.a((String)object4);
                object3 = ((zc3_1)object4).a;
                this.d = object3;
                this.e = n4 = ((zc3_1)object4).b;
                this.f = object4 = ((zc3_1)object4).c;
                object4 = new m41$a_0();
                n4 = RI$c.b((ie2_2)object2);
                while (n7 < n4) {
                    object5 = ((ie2_2)object2).x(l2);
                    ((m41$a_0)object4).b((String)object5);
                    ++n7;
                }
                object3 = k;
                object = ((m41$a_0)object4).f((String)object3);
                object5 = l;
                string2 = ((m41$a_0)object4).f((String)object5);
                ((m41$a_0)object4).g((String)object3);
                ((m41$a_0)object4).g((String)object5);
                long l3 = 0L;
                long l4 = object != null ? Long.parseLong((String)object) : l3;
                this.i = l4;
                if (string2 != null) {
                    l3 = Long.parseLong(string2);
                }
                this.j = l3;
                this.g = object4 = ((m41$a_0)object4).e();
                object4 = this.a;
                object4 = ((ob1_1)object4).a;
                object3 = "https";
                c2 = Intrinsics.areEqual(object4, object3);
                if (c2 != '\u0000') {
                    object4 = ((ie2_2)object2).x(l2);
                    n4 = ((String)object4).length();
                    if (n4 > 0) {
                        object2 = new StringBuilder();
                        String string3 = "expected \"\" but was \"";
                        ((StringBuilder)object2).append(string3);
                        ((StringBuilder)object2).append((String)object4);
                        c2 = '\"';
                        ((StringBuilder)object2).append(c2);
                        object4 = ((StringBuilder)object2).toString();
                        object3 = new IOException((String)object4);
                        throw object3;
                    }
                    object4 = ((ie2_2)object2).x(l2);
                    object3 = iu_1.b;
                    object4 = ((iu$b_0)object3).b((String)object4);
                    object3 = RI$d.a((ie2_2)object2);
                    object = RI$d.a((ie2_2)object2);
                    n3 = (int)(((ie2_2)object2).g() ? 1 : 0);
                    if (n3 == 0) {
                        object5 = wn3_0.Companion;
                        object2 = ((ie2_2)object2).x(l2);
                        object5.getClass();
                        object2 = Wn3$a.a((String)object2);
                    } else {
                        object2 = wn3_0.SSL_3_0;
                    }
                    Object object6 = "tlsVersion";
                    Intrinsics.checkNotNullParameter(object2, (String)object6);
                    object6 = "cipherSuite";
                    Intrinsics.checkNotNullParameter(object4, (String)object6);
                    object6 = "peerCertificates";
                    Intrinsics.checkNotNullParameter(object3, (String)object6);
                    object6 = "localCertificates";
                    Intrinsics.checkNotNullParameter(object, (String)object6);
                    object3 = ez3.x((List)object3);
                    List list = ez3.x((List)object);
                    object = new j21_0((List)object3);
                    this.h = object6 = new k21_0((wn3_0)((Object)object2), (iu_1)object4, list, (Function0)object);
                } else {
                    this.h = null;
                }
                object4 = Unit.a;
            }
            catch (Throwable throwable2) {}
            xj3_1.b(a93_02, null);
            return;
        }
        object3 = ((String)object3).concat((String)object);
        object4 = new IOException((String)object3);
        object3 = zs2_2.a;
        object3 = zs2_2.a;
        object2 = "cache corruption";
        object3.getClass();
        int n8 = 5;
        zs2_2.i(n8, (String)object2, (Throwable)object4);
        throw object4;
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            xj3_1.b(a93_02, throwable2);
            throw throwable3;
        }
    }

    public RI$d(cl2_2 cl2_22) {
        long l2;
        int n3;
        Intrinsics.checkNotNullParameter(cl2_22, "response");
        Object object = cl2_22.a;
        Object object2 = ((kj2_2)object).a;
        this.a = object2;
        Intrinsics.checkNotNullParameter(cl2_22, "<this>");
        object2 = cl2_22.h;
        Intrinsics.checkNotNull(object2);
        object2 = ((cl2_2)object2).a.c;
        m41_0 m41_02 = cl2_22.f;
        Set set = RI$c.c(m41_02);
        boolean bl2 = set.isEmpty();
        if (bl2) {
            object2 = ez3.b;
        } else {
            m41$a_0 m41$a_0 = new m41$a_0();
            int n4 = ((m41_0)object2).size();
            for (int i3 = 0; i3 < n4; ++i3) {
                String string2 = ((m41_0)object2).c(i3);
                boolean bl3 = set.contains(string2);
                if (!bl3) continue;
                String string3 = ((m41_0)object2).g(i3);
                m41$a_0.a(string2, string3);
            }
            object2 = m41$a_0.e();
        }
        this.b = object2;
        this.c = object = ((kj2_2)object).b;
        object = cl2_22.b;
        this.d = object;
        this.e = n3 = cl2_22.d;
        object = cl2_22.c;
        this.f = object;
        this.g = m41_02;
        object = cl2_22.e;
        this.h = object;
        this.i = l2 = cl2_22.k;
        this.j = l2 = cl2_22.l;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List a(ie2_2 var0) {
        block7: {
            block6: {
                var1_3 = RI$c.b((ie2_2)var0);
                if (var1_3 == (var2_4 = -1)) {
                    return mz0_2.a;
                }
                var3_5 = "X.509";
                try {
                    var3_5 = CertificateFactory.getInstance((String)var3_5);
                    var4_6 = new ArrayList<Object>(var1_3);
                    var5_7 = 0;
lbl9:
                    // 2 sources

                    while (var5_7 < var1_3) {
                        var6_8 = 0x7FFFFFFFFFFFFFFFL;
                        var8_9 = var0.x(var6_8);
                        var9_10 = new ce_2();
                        break block6;
                    }
                    return var4_6;
                }
                catch (CertificateException var0_1) {
                    break block7;
                }
            }
            var8_9 = ff$a_0.a((String)var8_9);
            if (var8_9 == null) {
                var10_11 = "Corrupt certificate in cache entry";
                var0 = new IOException(var10_11);
                throw var0;
            }
            var9_10.P((ff_2)var8_9);
            var8_9 = new ce$a_1(var9_10);
            var8_9 = var3_5.generateCertificate((InputStream)var8_9);
            var4_6.add(var8_9);
            ++var5_7;
            ** GOTO lbl9
        }
        var0_2 = var0_1.getMessage();
        var10_12 = new IOException(var0_2);
        throw var10_12;
    }

    public static void b(he2_2 he2_22, List iterator) {
        CertificateEncodingException certificateEncodingException2;
        block15: {
            block14: {
                int n3 = iterator.size();
                long l2 = n3;
                he2_22.Y(l2);
                n3 = 10;
                try {
                    he2_22.writeByte(n3);
                    iterator = iterator.iterator();
                }
                catch (CertificateEncodingException certificateEncodingException2) {}
                while (true) {
                    boolean bl2 = iterator.hasNext();
                    if (!bl2) break block14;
                    break;
                }
                {
                    Object object = iterator.next();
                    object = (Certificate)object;
                    object = ((Certificate)object).getEncoded();
                    Object object2 = ff_2.d;
                    object2 = "bytes";
                    Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                    object = ff$a_0.d(object);
                    object = ((ff_2)object).a();
                    he2_22.D((String)object);
                    he2_22.writeByte(n3);
                    continue;
                }
                break block15;
            }
            return;
        }
        String string2 = certificateEncodingException2.getMessage();
        iterator = new Iterator(string2);
        throw iterator;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(rq0$a_0 object) {
        Throwable throwable2;
        block11: {
            CharSequence charSequence;
            String string2;
            String string3;
            long l2;
            int n3;
            String string4;
            int n4;
            Object object2 = this.a;
            k21_0 k21_02 = this.h;
            Object object3 = this.g;
            Object object4 = this.b;
            Intrinsics.checkNotNullParameter(object, "editor");
            int n7 = 0;
            object = o72_0.a(((rq0$a_0)object).d(0));
            try {
                String string5 = ((ob1_1)object2).i;
                ((he2_2)object).D(string5);
                n4 = 10;
                ((he2_2)object).writeByte(n4);
                string4 = this.c;
                ((he2_2)object).D(string4);
                ((he2_2)object).writeByte(n4);
                n3 = ((m41_0)object4).size();
                l2 = n3;
                ((he2_2)object).Y(l2);
                ((he2_2)object).writeByte(n4);
                n3 = ((m41_0)object4).size();
                int n8 = 0;
                string3 = null;
                while (true) {
                    string2 = ": ";
                    if (n8 < n3) {
                        charSequence = ((m41_0)object4).c(n8);
                        ((he2_2)object).D((String)charSequence);
                        ((he2_2)object).D(string2);
                        string2 = ((m41_0)object4).g(n8);
                        object.D(string2);
                        object.writeByte(n4);
                        ++n8;
                        continue;
                    }
                    break;
                }
            }
            catch (Throwable throwable2) {
                break block11;
            }
            object4 = this.d;
            n3 = this.e;
            string3 = this.f;
            charSequence = "protocol";
            Intrinsics.checkNotNullParameter(object4, (String)charSequence);
            charSequence = "message";
            Intrinsics.checkNotNullParameter(string3, (String)charSequence);
            charSequence = new StringBuilder();
            ib2_2 ib2_22 = ib2_2.HTTP_1_0;
            if (object4 == ib2_22) {
                object4 = "HTTP/1.0";
                ((StringBuilder)charSequence).append((String)object4);
            } else {
                object4 = "HTTP/1.1";
                ((StringBuilder)charSequence).append((String)object4);
            }
            int n10 = 32;
            ((StringBuilder)charSequence).append((char)n10);
            ((StringBuilder)charSequence).append(n3);
            ((StringBuilder)charSequence).append((char)n10);
            ((StringBuilder)charSequence).append(string3);
            object4 = ((StringBuilder)charSequence).toString();
            string4 = "StringBuilder().apply(builderAction).toString()";
            Intrinsics.checkNotNullExpressionValue(object4, string4);
            ((he2_2)object).D((String)object4);
            ((he2_2)object).writeByte(n4);
            n10 = ((m41_0)object3).size() + 2;
            l2 = n10;
            ((he2_2)object).Y(l2);
            ((he2_2)object).writeByte(n4);
            n10 = ((m41_0)object3).size();
            while (n7 < n10) {
                string4 = ((m41_0)object3).c(n7);
                ((he2_2)object).D(string4);
                ((he2_2)object).D(string2);
                string4 = ((m41_0)object3).g(n7);
                object.D(string4);
                object.writeByte(n4);
                ++n7;
            }
            object3 = k;
            ((he2_2)object).D((String)object3);
            ((he2_2)object).D(string2);
            long l3 = this.i;
            object.Y(l3);
            object.writeByte(n4);
            object3 = l;
            ((he2_2)object).D((String)object3);
            ((he2_2)object).D(string2);
            l3 = this.j;
            object.Y(l3);
            object.writeByte(n4);
            object2 = ((ob1_1)object2).a;
            object3 = "https";
            boolean bl2 = Intrinsics.areEqual(object2, object3);
            if (bl2) {
                ((he2_2)object).writeByte(n4);
                Intrinsics.checkNotNull(k21_02);
                object2 = k21_02.b;
                object2 = ((iu_1)object2).a;
                ((he2_2)object).D((String)object2);
                ((he2_2)object).writeByte(n4);
                object2 = k21_02.a();
                RI$d.b((he2_2)object, (List)object2);
                object2 = k21_02.c;
                RI$d.b((he2_2)object, (List)object2);
                object2 = k21_02.a;
                object2 = ((wn3_0)((Object)object2)).javaName();
                ((he2_2)object).D((String)object2);
                ((he2_2)object).writeByte(n4);
            }
            object2 = Unit.a;
            xj3_1.b((Closeable)object, null);
            return;
        }
        try {
            throw throwable2;
        }
        catch (Throwable throwable3) {
            xj3_1.b((Closeable)object, throwable2);
            throw throwable3;
        }
    }
}

