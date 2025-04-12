/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import okio.AsyncTimeout;
import okio.a;

/*
 * Renamed from Q91
 */
public final class q91_0
implements ac0_2 {
    public static final List g = ez3.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = ez3.l("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public final je2_2 a;
    public final te2_2 b;
    public final g91_0 c;
    public volatile S91 d;
    public final ib2_2 e;
    public volatile boolean f;

    public q91_0(x72_0 object, je2_2 object2, te2_2 te2_22, g91_0 g91_02) {
        Intrinsics.checkNotNullParameter(object, "client");
        Intrinsics.checkNotNullParameter(object2, "connection");
        Intrinsics.checkNotNullParameter(te2_22, "chain");
        String string2 = "http2Connection";
        Intrinsics.checkNotNullParameter(g91_02, string2);
        this.a = object2;
        this.b = te2_22;
        this.c = g91_02;
        object = ((x72_0)object).t;
        object2 = ib2_2.H2_PRIOR_KNOWLEDGE;
        boolean bl2 = object.contains(object2);
        if (!bl2) {
            object2 = ib2_2.HTTP_2;
        }
        this.e = object2;
    }

    public final a93_0 a(cl2_2 object) {
        Intrinsics.checkNotNullParameter(object, "response");
        object = this.d;
        Intrinsics.checkNotNull(object);
        return ((S91)object).i;
    }

    public final void b() {
        S91 s91 = this.d;
        Intrinsics.checkNotNull(s91);
        s91.g().close();
    }

    public final long c(cl2_2 cl2_22) {
        String string2 = "response";
        Intrinsics.checkNotNullParameter(cl2_22, string2);
        boolean bl2 = ia1_1.a(cl2_22);
        long l2 = !bl2 ? 0L : ez3.k(cl2_22);
        return l2;
    }

    public final void cancel() {
        boolean bl2;
        this.f = bl2 = true;
        S91 s91 = this.d;
        if (s91 != null) {
            ta0_2 ta0_22 = ta0_2.CANCEL;
            s91.e(ta0_22);
        }
    }

    public final je2_2 d() {
        return this.a;
    }

    public final y63_0 e(kj2_2 object, long l2) {
        Intrinsics.checkNotNullParameter(object, "request");
        object = this.d;
        Intrinsics.checkNotNull(object);
        return ((S91)object).g();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void f(kj2_2 object) {
        block21: {
            ta0_2 ta0_22;
            long l2;
            long l3;
            long l4;
            long l7;
            S91 s91;
            int n3;
            StringBuilder stringBuilder;
            int n4;
            int n7 = 1;
            Intrinsics.checkNotNullParameter(object, "request");
            Object object2 = this.d;
            if (object2 != null) {
                return;
            }
            object2 = ((kj2_2)object).d;
            Object object3 = null;
            if (object2 != null) {
                n4 = 1;
            } else {
                n4 = 0;
                object2 = null;
            }
            Intrinsics.checkNotNullParameter(object, "request");
            Object object4 = ((kj2_2)object).c;
            int n8 = ((m41_0)object4).size() + 4;
            ArrayList<Object> arrayList = new ArrayList<Object>(n8);
            Object object5 = w31_0.f;
            Object object6 = ((kj2_2)object).b;
            Object object7 = new w31_0((ff_2)object5, (String)object6);
            arrayList.add(object7);
            object5 = w31_0.g;
            Object object8 = ((kj2_2)object).a;
            Intrinsics.checkNotNullParameter(object8, "url");
            object6 = ((ob1_1)object8).b();
            String string2 = ((ob1_1)object8).d();
            if (string2 != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append((String)object6);
                n3 = 63;
                stringBuilder.append((char)n3);
                stringBuilder.append(string2);
                object6 = stringBuilder.toString();
            }
            object7 = new w31_0((ff_2)object5, (String)object6);
            arrayList.add(object7);
            object7 = "Host";
            object = ((kj2_2)object).b((String)object7);
            if (object != null) {
                object5 = w31_0.i;
                object7 = new w31_0((ff_2)object5, (String)object);
                arrayList.add(object7);
            }
            object7 = w31_0.h;
            object5 = ((ob1_1)object8).a;
            object = new w31_0((ff_2)object7, (String)object5);
            arrayList.add(object);
            int n10 = ((m41_0)object4).size();
            object7 = null;
            for (n8 = 0; n8 < n10; n8 += n7) {
                object5 = ((m41_0)object4).c(n8);
                object6 = Locale.US;
                object6 = g;
                object8 = "US";
                string2 = "this as java.lang.String).toLowerCase(locale)";
                n3 = (int)(object6.contains(object5 = zn0_1.a((Locale)object6, (String)object8, (String)object5, (Locale)object6, string2)) ? 1 : 0);
                if (n3 != 0 && ((n3 = (int)(Intrinsics.areEqual(object5, object6 = "te") ? 1 : 0)) == 0 || (n3 = (int)(Intrinsics.areEqual(object6 = ((m41_0)object4).g(n8), object8 = "trailers") ? 1 : 0)) == 0)) continue;
                object8 = ((m41_0)object4).g(n8);
                object6 = new w31_0((String)object5, (String)object8);
                arrayList.add(object6);
            }
            object = this.c;
            object.getClass();
            object4 = "requestHeaders";
            Intrinsics.checkNotNullParameter(arrayList, (String)object4);
            boolean bl2 = n4 ^ true;
            object7 = ((g91_0)object).y;
            // MONITORENTER : object7
            int n14 = ((g91_0)object).f;
            n3 = -1 >>> 2;
            if (n14 > n3) {
                object5 = ta0_2.REFUSED_STREAM;
                ((g91_0)object).k((ta0_2)((Object)object5));
            }
            if ((n14 = (int)(((g91_0)object).g ? 1 : 0)) != 0) break block21;
            int n15 = ((g91_0)object).f;
            ((g91_0)object).f = n14 = n15 + 2;
            stringBuilder = null;
            object5 = s91;
            n3 = n15;
            object8 = object;
            s91 = new S91(n15, (g91_0)object, bl2, false, null);
            if (n4 != 0 && (n4 = (l7 = (l4 = ((g91_0)object).v) - (l3 = ((g91_0)object).w)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) < 0 && (n4 = (int)((l2 = (l4 = s91.e) - (l3 = s91.f)) == 0L ? 0 : (l2 < 0L ? -1 : 1))) < 0) {
                n7 = 0;
                ta0_22 = null;
            }
            if ((n4 = s91.i()) != 0) {
                object2 = ((g91_0)object).c;
                object3 = n15;
                object2.put(object3, s91);
            }
            object2 = Unit.a;
            // MONITOREXIT : object
            object2 = ((g91_0)object).y;
            ((t91_0)object2).h(arrayList, n15, bl2);
            // MONITOREXIT : object7
            if (n7 != 0) {
                object = ((g91_0)object).y;
                ((t91_0)object).flush();
            }
            this.d = s91;
            n10 = (int)(this.f ? 1 : 0);
            if (n10 == 0) {
                object = this.d;
                Intrinsics.checkNotNull(object);
                object = ((S91)object).k;
                long l8 = this.b.g;
                object3 = TimeUnit.MILLISECONDS;
                ((a)object).g(l8, (TimeUnit)((Object)object3));
                object = this.d;
                Intrinsics.checkNotNull(object);
                object = ((S91)object).l;
                l8 = this.b.h;
                ((a)object).g(l8, (TimeUnit)((Object)object3));
                return;
            }
            object = this.d;
            Intrinsics.checkNotNull(object);
            ta0_22 = ta0_2.CANCEL;
            ((S91)object).e(ta0_22);
            object = new IOException("Canceled");
            throw object;
        }
        try {
            ConnectionShutdownException connectionShutdownException = new ConnectionShutdownException();
            throw connectionShutdownException;
        }
        catch (Throwable throwable) {}
        throw throwable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final cl2$a_0 g(boolean n3) {
        int n4;
        Object object;
        Object object2;
        int n7;
        Object object3;
        Object object4;
        Object object5;
        block16: {
            Throwable throwable2;
            block14: {
                block15: {
                    boolean bl2;
                    object5 = this.d;
                    if (object5 == null) {
                        IOException iOException = new IOException("stream wasn't created");
                        throw iOException;
                    }
                    // MONITORENTER : object5
                    object4 = object5.k;
                    ((AsyncTimeout)object4).h();
                    try {
                        while ((bl2 = ((ArrayDeque)(object4 = object5.g)).isEmpty()) && (object4 = object5.m) == null) {
                            object5.l();
                        }
                    }
                    catch (Throwable throwable2) {
                        break block14;
                    }
                    object4 = object5.k;
                    ((S91$c)object4).l();
                    object4 = object5.g;
                    bl2 = ((ArrayDeque)object4).isEmpty() ^ true;
                    if (!bl2) break block15;
                    object4 = object5.g;
                    object4 = ((ArrayDeque)object4).removeFirst();
                    object3 = "headersQueue.removeFirst()";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                    object4 = (m41_0)object4;
                    // MONITOREXIT : object5
                    object5 = this.e;
                    Intrinsics.checkNotNullParameter(object4, "headerBlock");
                    Intrinsics.checkNotNullParameter(object5, "protocol");
                    object3 = new m41$a_0();
                    n7 = ((m41_0)object4).size();
                    object2 = null;
                    object = null;
                    break block16;
                }
                IOException iOException = object5.n;
                if (iOException != null) {
                    throw iOException;
                }
                object4 = object5.m;
                Intrinsics.checkNotNull(object4);
                iOException = new StreamResetException((ta0_2)((Object)object4));
                throw iOException;
            }
            object4 = object5.k;
            ((S91$c)object4).l();
            throw throwable2;
        }
        for (int i3 = 0; i3 < n7; ++i3) {
            String string2 = ((m41_0)object4).c(i3);
            String string3 = ((m41_0)object4).g(i3);
            Object object6 = ":status";
            boolean bl3 = Intrinsics.areEqual(string2, object6);
            if (bl3) {
                string2 = "HTTP/1.1 ";
                object = new StringBuilder(string2);
                ((StringBuilder)object).append(string3);
                object = zc3$a.a(((StringBuilder)object).toString());
                continue;
            }
            object6 = h;
            bl3 = object6.contains(string2);
            if (bl3) continue;
            ((m41$a_0)object3).c(string2, string3);
        }
        if (object == null) {
            ProtocolException protocolException = new ProtocolException("Expected ':status' header not present");
            throw protocolException;
        }
        object4 = new cl2$a_0();
        ((cl2$a_0)object4).d((ib2_2)((Object)object5));
        ((cl2$a_0)object4).c = n4 = ((zc3_1)object).b;
        object5 = ((zc3_1)object).c;
        String string4 = "message";
        Intrinsics.checkNotNullParameter(object5, string4);
        ((cl2$a_0)object4).d = object5;
        object5 = ((m41$a_0)object3).e();
        ((cl2$a_0)object4).c((m41_0)object5);
        if (n3 == 0) return object4;
        n3 = ((cl2$a_0)object4).c;
        n4 = 100;
        if (n3 != n4) return object4;
        return object2;
    }

    public final void h() {
        this.c.flush();
    }
}

