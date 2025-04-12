/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.Serializable;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.StreamResetException;

public final class S91 {
    public final int a;
    public final g91_0 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final S91$b i;
    public final S91$a j;
    public final S91$c k;
    public final S91$c l;
    public ta0_2 m;
    public IOException n;

    public S91(int n3, g91_0 object, boolean bl2, boolean bl3, m41_0 m41_02) {
        Serializable serializable;
        block5: {
            block4: {
                block2: {
                    block3: {
                        S91$b s91$b;
                        long l2;
                        Intrinsics.checkNotNullParameter(object, "connection");
                        this.a = n3;
                        this.b = object;
                        n3 = ((g91_0)object).s.a();
                        this.f = l2 = (long)n3;
                        this.g = serializable = new Serializable();
                        int n4 = ((g91_0)object).r.a();
                        long l3 = n4;
                        this.i = s91$b = new S91$b(this, l3, bl3);
                        super(this, bl2);
                        this.j = object;
                        this.k = object = new S91$c(this);
                        this.l = object = new S91$c(this);
                        if (m41_02 == null) break block2;
                        n4 = this.h() ^ 1;
                        if (n4 == 0) break block3;
                        serializable.add(m41_02);
                        break block4;
                    }
                    object = "locally-initiated streams shouldn't have headers yet".toString();
                    super((String)object);
                    throw serializable;
                }
                n3 = (int)(this.h() ? 1 : 0);
                if (n3 == 0) break block5;
            }
            return;
        }
        object = "remotely-initiated streams should have headers".toString();
        super((String)object);
        throw serializable;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a() {
        boolean bl2;
        int n3;
        Object object;
        block5: {
            block4: {
                object = ez3.a;
                // MONITORENTER : this
                object = this.i;
                n3 = ((S91$b)object).b;
                if (n3 != 0 || !(bl2 = ((S91$b)object).e)) break block4;
                object = this.j;
                n3 = ((S91$a)object).a;
                if (n3 == 0 && !(bl2 = ((S91$a)object).c)) break block4;
                bl2 = true;
                break block5;
            }
            bl2 = false;
            object = null;
        }
        n3 = this.i();
        // MONITOREXIT : this
        if (bl2) {
            object = (Object)ta0_2.CANCEL;
            n3 = 0;
            this.c((ta0_2)((Object)object), null);
            return;
        }
        if (n3 != 0) return;
        object = this.b;
        n3 = this.a;
        ((g91_0)object).h(n3);
    }

    public final void b() {
        Object object = this.j;
        boolean bl2 = ((S91$a)object).c;
        if (!bl2) {
            boolean bl3 = ((S91$a)object).a;
            if (!bl3) {
                object = this.m;
                if (object != null) {
                    object = this.n;
                    if (object == null) {
                        ta0_2 ta0_22 = this.m;
                        Intrinsics.checkNotNull((Object)ta0_22);
                        object = new StreamResetException(ta0_22);
                    }
                    throw object;
                }
                return;
            }
            object = new IOException("stream finished");
            throw object;
        }
        object = new IOException("stream closed");
        throw object;
    }

    public final void c(ta0_2 ta0_22, IOException object) {
        String string2 = "rstStatusCode";
        Intrinsics.checkNotNullParameter((Object)ta0_22, string2);
        boolean bl2 = this.d(ta0_22, (IOException)object);
        if (!bl2) {
            return;
        }
        object = this.b;
        object.getClass();
        Intrinsics.checkNotNullParameter((Object)ta0_22, "statusCode");
        object = ((g91_0)object).y;
        int n3 = this.a;
        ((t91_0)object).n(n3, ta0_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean d(ta0_2 object, IOException iOException) {
        block6: {
            block5: {
                Object object2 = ez3.a;
                // MONITORENTER : this
                object2 = (Object)this.m;
                if (object2 == null) break block5;
                return false;
            }
            this.m = object;
            this.n = iOException;
            object = "null cannot be cast to non-null type java.lang.Object";
            Intrinsics.checkNotNull(this, (String)object);
            this.notifyAll();
            object = this.i;
            boolean bl2 = ((S91$b)object).b;
            if (!bl2) break block6;
            object = this.j;
            bl2 = ((S91$a)object).a;
            if (!bl2) break block6;
            // MONITOREXIT : this
            return false;
        }
        object = Unit.a;
        object = this.b;
        int n3 = this.a;
        ((g91_0)object).h(n3);
        return true;
    }

    public final void e(ta0_2 ta0_22) {
        Intrinsics.checkNotNullParameter((Object)ta0_22, "errorCode");
        g91_0 g91_02 = null;
        boolean bl2 = this.d(ta0_22, null);
        if (!bl2) {
            return;
        }
        g91_02 = this.b;
        int n3 = this.a;
        g91_02.u(n3, ta0_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ta0_2 f() {
        synchronized (this) {
            return this.m;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final S91$a g() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.h;
                    if (!bl2 && !(bl2 = this.h())) {
                        String string2 = "reply before requesting the sink";
                        string2 = string2.toString();
                        IllegalStateException illegalStateException = new IllegalStateException(string2);
                        throw illegalStateException;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                Unit unit = Unit.a;
                return this.j;
            }
            throw throwable2;
        }
    }

    /*
     * WARNING - void declaration
     */
    public final boolean h() {
        void var1_5;
        int bl2 = this.a;
        int n3 = 1;
        int n4 = bl2 & n3;
        if (n4 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
        }
        g91_0 g91_02 = this.b;
        boolean bl5 = g91_02.a;
        if (bl5 != var1_5) {
            n3 = 0;
        }
        return n3 != 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean i() {
        synchronized (this) {
            boolean bl2;
            Object object = this.m;
            if (object != null) {
                return false;
            }
            object = this.i;
            boolean bl3 = ((S91$b)object).b;
            if (bl3 || (bl2 = ((S91$b)object).e)) {
                object = this.j;
                bl3 = ((S91$a)object).a;
                if ((bl3 || (bl2 = ((S91$a)object).c)) && (bl2 = this.h)) {
                    return false;
                }
            }
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void j(m41_0 object, boolean bl2) {
        boolean bl3;
        block5: {
            Object object2;
            block4: {
                Intrinsics.checkNotNullParameter(object, "headers");
                object2 = ez3.a;
                // MONITORENTER : this
                boolean bl4 = this.h;
                bl3 = true;
                if (!bl4 || !bl2) break block4;
                object = this.i;
                object.getClass();
                break block5;
            }
            this.h = bl3;
            object2 = this.g;
            object2.add(object);
        }
        if (bl2) {
            object = this.i;
            ((S91$b)object).b = bl3;
        }
        boolean bl5 = this.i();
        Object object3 = "null cannot be cast to non-null type java.lang.Object";
        Intrinsics.checkNotNull(this, (String)object3);
        this.notifyAll();
        object3 = Unit.a;
        // MONITOREXIT : this
        if (bl5) return;
        object = this.b;
        bl2 = this.a;
        ((g91_0)object).h((int)(bl2 ? 1 : 0));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(ta0_2 object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    Object object2 = "errorCode";
                    try {
                        Intrinsics.checkNotNullParameter(object, object2);
                        object2 = this.m;
                        if (object2 != null) break block4;
                        this.m = object;
                        object = "null cannot be cast to non-null type java.lang.Object";
                        Intrinsics.checkNotNull(this, (String)object);
                        this.notifyAll();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void l() {
        Object object = "null cannot be cast to non-null type java.lang.Object";
        try {
            Intrinsics.checkNotNull(this, (String)object);
            this.wait();
            return;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            object = new InterruptedIOException();
            throw object;
        }
    }
}

