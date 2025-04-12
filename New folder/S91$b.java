/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.StreamResetException;
import okio.a;

public final class S91$b
implements a93_0 {
    public final long a;
    public boolean b;
    public final ce_2 c;
    public final ce_2 d;
    public boolean e;
    public final /* synthetic */ S91 f;

    public S91$b(S91 object, long l2, boolean bl2) {
        this.f = object;
        this.a = l2;
        this.b = bl2;
        this.c = object = new ce_2();
        this.d = object = new ce_2();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final long a0(ce_2 ce_22, long l2) {
        S91 s91;
        Object object;
        block18: {
            long l3;
            long l4;
            Object object2;
            S91$b s91$b = this;
            object = ce_22;
            long l7 = l2;
            Object object3 = "sink";
            Intrinsics.checkNotNullParameter(ce_22, (String)object3);
            long l8 = 0L;
            long l12 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
            if (l12 < 0) {
                object = Wm2.a(l2, "byteCount < 0: ");
                object = object.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
            while (true) {
                boolean bl2;
                block19: {
                    int n3;
                    boolean bl3;
                    Object object4;
                    boolean bl4;
                    s91 = s91$b.f;
                    // MONITORENTER : s91
                    object2 = s91.k;
                    object2.h();
                    object2 = s91.f();
                    if (object2 != null && !(bl4 = s91$b.b)) {
                        object2 = s91.n;
                        if (object2 == null) {
                            object4 = s91.f();
                            Intrinsics.checkNotNull(object4);
                            object2 = new StreamResetException((ta0_2)((Object)object4));
                        }
                    } else {
                        bl4 = false;
                        object2 = null;
                    }
                    if (bl3 = s91$b.e) break block18;
                    object4 = s91$b.d;
                    long l14 = ((ce_2)object4).b;
                    l4 = -1;
                    bl2 = false;
                    Object object5 = l14 == l8 ? 0 : (l14 < l8 ? -1 : 1);
                    if (object5 > 0) {
                        long l15;
                        l14 = Math.min(l7, l14);
                        l3 = ((ce_2)object4).a0((ce_2)object, l14);
                        s91.c = l15 = s91.c + l3;
                        l8 = s91.d;
                        l15 -= l8;
                        if (object2 != null) break block19;
                        object3 = s91.b;
                        object3 = ((g91_0)object3).r;
                        n3 = ((R03)object3).a();
                        l8 = n3 /= 2;
                        long l16 = l15 - l8;
                        Object object6 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                        if (object6 >= 0) {
                            object3 = s91.b;
                            int n4 = s91.a;
                            ((g91_0)object3).w(n4, l15);
                            s91.d = l8 = s91.c;
                        }
                        break block19;
                    }
                    n3 = s91$b.b;
                    if (n3 == 0 && object2 == null) {
                        s91.l();
                        bl2 = true;
                    }
                    l3 = l4;
                }
                object3 = s91.k;
                ((S91$c)object3).l();
                object3 = Unit.a;
                if (!bl2) break;
                l8 = 0L;
            }
            Object object7 = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
            if (object7 != false) {
                return l3;
            }
            if (object2 != null) throw object2;
            return l4;
        }
        try {
            String string2 = "stream closed";
            object = new IOException(string2);
            throw object;
        }
        catch (Throwable throwable) {}
        S91$c s91$c = s91.k;
        s91$c.l();
        throw throwable;
    }

    public final void close() {
        Object object = this.f;
        synchronized (object) {
            block7: {
                boolean bl2 = true;
                this.e = bl2;
                Object object2 = this.d;
                long l2 = ((ce_2)object2).b;
                ((ce_2)object2).b();
                object2 = "null cannot be cast to non-null type java.lang.Object";
                Intrinsics.checkNotNull(object, (String)object2);
                object.notifyAll();
                object2 = Unit.a;
                long l3 = 0L;
                long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                if (l4 <= 0) break block7;
                object = ez3.a;
                object = this.f.b;
                ((g91_0)object).n(l2);
            }
            this.f.a();
            return;
            finally {
            }
        }
    }

    public final a timeout() {
        return this.f.k;
    }
}

