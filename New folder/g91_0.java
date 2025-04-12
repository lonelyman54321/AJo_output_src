/*
 * Decompiled with CFR 0.152.
 */
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;
import okhttp3.internal.concurrent.b;
import okhttp3.internal.concurrent.c;

/*
 * Renamed from G91
 */
public final class g91_0
implements Closeable {
    public static final R03 B;
    public final LinkedHashSet A;
    public final boolean a;
    public final G91$b b;
    public final LinkedHashMap c;
    public final String d;
    public int e;
    public int f;
    public boolean g;
    public final c h;
    public final b i;
    public final b j;
    public final b k;
    public final e60_0 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public final R03 r;
    public R03 s;
    public long t;
    public long u;
    public long v;
    public long w;
    public final Socket x;
    public final t91_0 y;
    public final G91$c z;

    static {
        R03 r03 = new R03();
        r03.c(7, (char)-1);
        r03.c(5, 16384);
        B = r03;
    }

    public g91_0(G91$a object) {
        long l2;
        b b2;
        boolean bl2;
        Object object2 = "builder";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        this.a = bl2 = ((G91$a)object).a;
        Object object3 = ((G91$a)object).g;
        this.b = object3;
        object3 = new LinkedHashMap();
        this.c = object3;
        object3 = ((G91$a)object).d;
        Object object4 = null;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            object3 = null;
        }
        this.d = object3;
        int n3 = ((G91$a)object).a;
        int n4 = n3 != 0 ? 3 : 2;
        this.f = n4;
        Object object5 = ((G91$a)object).b;
        this.h = object5;
        this.i = b2 = ((c)object5).f();
        Object object6 = ((c)object5).f();
        this.j = object6;
        this.k = object5 = ((c)object5).f();
        this.l = object5 = ((G91$a)object).h;
        object5 = new R03();
        if (n3 != 0) {
            n3 = 7;
            int n7 = 0x1000000;
            ((R03)object5).c(n3, n7);
        }
        this.r = object5;
        Object object7 = B;
        this.s = object7;
        n3 = ((R03)object7).a();
        this.w = l2 = (long)n3;
        object7 = ((G91$a)object).c;
        if (object7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            n3 = 0;
            object7 = null;
        }
        this.x = object7;
        object5 = ((G91$a)object).f;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            n4 = 0;
            object5 = null;
        }
        this.y = object7 = new t91_0((re_2)object5, bl2);
        object6 = ((G91$a)object).e;
        if (object6 != null) {
            object4 = object6;
        } else {
            object6 = "source";
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
        }
        object5 = new r91_0((se_1)object4, bl2);
        this.z = object7 = new G91$c(this, (r91_0)object5);
        object2 = new LinkedHashSet();
        this.A = object2;
        int n8 = ((G91$a)object).i;
        if (n8 != 0) {
            object2 = TimeUnit.MILLISECONDS;
            long l3 = n8;
            l3 = ((TimeUnit)((Object)object2)).toNanos(l3);
            object = Ft2.a((String)object3, " ping");
            object2 = new G91$d((String)object, this, l3);
            b2.c((ri3_1)object2, l3);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(ta0_2 object, ta0_2 ta0_22, IOException iOException) {
        Object object2;
        int n3;
        block15: {
            boolean bl2;
            block14: {
                Intrinsics.checkNotNullParameter(object, "connectionCode");
                Intrinsics.checkNotNullParameter((Object)ta0_22, "streamCode");
                try {
                    this.k((ta0_2)((Object)object));
                }
                catch (IOException iOException2) {}
                object = this.c;
                bl2 = object.isEmpty() ^ true;
                n3 = 0;
                if (!bl2) break block14;
                object = this.c;
                object = ((LinkedHashMap)object).values();
                object2 = new S91[]{};
                object = object.toArray((T[])object2);
                object2 = this.c;
                ((LinkedHashMap)object2).clear();
                break block15;
            }
            bl2 = false;
            object = null;
        }
        object2 = Unit.a;
        // MONITOREXIT : this
        object = (S91[])object;
        if (object != null) {
            int n4 = ((Object)object).length;
            while (n3 < n4) {
                Object object3 = object[n3];
                try {
                    ((S91)object3).c(ta0_22, iOException);
                }
                catch (IOException iOException3) {}
                ++n3;
            }
        }
        try {
            object = this.y;
            ((t91_0)object).close();
        }
        catch (IOException iOException4) {}
        try {
            object = this.x;
            ((Socket)object).close();
        }
        catch (IOException iOException5) {}
        this.i.f();
        this.j.f();
        this.k.f();
    }

    public final void b(IOException iOException) {
        ta0_2 ta0_22 = ta0_2.PROTOCOL_ERROR;
        this.a(ta0_22, ta0_22, iOException);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final S91 c(int n3) {
        synchronized (this) {
            LinkedHashMap linkedHashMap = this.c;
            Object object = n3;
            object = linkedHashMap.get(object);
            return (S91)object;
        }
    }

    public final void close() {
        ta0_2 ta0_22 = ta0_2.NO_ERROR;
        ta0_2 ta0_23 = ta0_2.CANCEL;
        this.a(ta0_22, ta0_23, null);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean d(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                long l3;
                Object object;
                block6: {
                    try {
                        object = this.g;
                        if (object == 0) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return false;
                }
                long l4 = this.p;
                long l7 = this.o;
                long l8 = l4 - l7;
                object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                return object >= 0 || (object = (Object)((l3 = l2 - (l4 = this.q)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) < 0;
                {
                }
            }
            throw throwable2;
        }
    }

    public final void flush() {
        this.y.flush();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final S91 h(int n3) {
        synchronized (this) {
            Object object = this.c;
            Object object2 = n3;
            object2 = object.remove(object2);
            object2 = (S91)object2;
            object = "null cannot be cast to non-null type java.lang.Object";
            Intrinsics.checkNotNull(this, (String)object);
            this.notifyAll();
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void k(ta0_2 ta0_22) {
        int n3;
        Object object;
        block8: {
            Intrinsics.checkNotNullParameter((Object)ta0_22, "statusCode");
            t91_0 t91_02 = this.y;
            // MONITORENTER : t91_02
            object = new Ref$IntRef();
            // MONITORENTER : this
            n3 = this.g;
            if (n3 == 0) break block8;
            // MONITOREXIT : this
            // MONITOREXIT : t91_02
            return;
        }
        this.g = n3 = 1;
        ((Ref$IntRef)object).element = n3 = this.e;
        object = Unit.a;
        // MONITOREXIT : this
        object = this.y;
        byte[] byArray = ez3.a;
        ((t91_0)object).d(n3, ta0_22, byArray);
        // MONITOREXIT : t91_02
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void n(long l2) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                block5: {
                    long l3;
                    try {
                        this.t = l3 = this.t + l2;
                        l2 = this.u;
                        l3 -= l2;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    {
                        R03 r03 = this.r;
                        int n3 = r03.a();
                        l2 = n3 /= 2;
                        long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                        if (l4 < 0) break block5;
                        n3 = 0;
                        r03 = null;
                        this.w(0, l3);
                        this.u = l2 = this.u + l3;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void p(int n3, boolean bl2, ce_2 ce_22, long l2) {
        long l3 = 0L;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object == false) {
            this.y.b(bl2, n3, ce_22, 0);
            return;
        }
        while ((object = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) > 0) {
            long l7;
            boolean bl3;
            Object object2;
            Object object3;
            long l8;
            long l12;
            long l14;
            long l15;
            // MONITORENTER : this
            while ((l15 = (l14 = (l12 = this.v) - (l8 = this.w)) == 0L ? 0 : (l14 < 0L ? -1 : 1)) >= 0) {
                object3 = this.c;
                object2 = n3;
                object = object3.containsKey(object2);
                if (object == false) {
                    String string2 = "stream closed";
                    IOException iOException = new IOException(string2);
                    throw iOException;
                }
                object3 = "null cannot be cast to non-null type java.lang.Object";
                Intrinsics.checkNotNull(this, (String)object3);
                this.wait();
            }
            l8 -= l12;
            l12 = Math.min(l2, l8);
            int n4 = (int)l12;
            object3 = this.y;
            object = ((t91_0)object3).d;
            object = Math.min(n4, (int)object);
            long l16 = this.v;
            long l17 = object;
            this.v = l16 += l17;
            object2 = Unit.a;
            object2 = this.y;
            bl3 = bl2 && !(bl3 = (l7 = (l2 -= l17) - l3) == 0L ? 0 : (l7 < 0L ? -1 : 1));
            ((t91_0)object2).b(bl3, n3, ce_22, (int)object);
        }
        return;
        {
            catch (Throwable throwable) {
                throw throwable;
            }
            catch (InterruptedException interruptedException) {}
            {
                Object object4 = Thread.currentThread();
                ((Thread)object4).interrupt();
                object4 = new InterruptedIOException();
                throw object4;
            }
        }
    }

    public final void u(int n3, ta0_2 ta0_22) {
        Intrinsics.checkNotNullParameter((Object)ta0_22, "errorCode");
        CharSequence charSequence = new StringBuilder();
        Object object = this.d;
        charSequence.append((String)object);
        charSequence.append('[');
        charSequence.append(n3);
        charSequence.append("] writeSynReset");
        charSequence = charSequence.toString();
        object = new G91$e((String)charSequence, this, n3, ta0_22);
        this.i.c((ri3_1)object, 0L);
    }

    public final void w(int n3, long l2) {
        Object object = new StringBuilder();
        String string2 = this.d;
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append('[');
        ((StringBuilder)object).append(n3);
        ((StringBuilder)object).append("] windowUpdate");
        String string3 = ((StringBuilder)object).toString();
        object = new G91$f(string3, this, n3, l2);
        this.i.c((ri3_1)object, 0L);
    }
}

