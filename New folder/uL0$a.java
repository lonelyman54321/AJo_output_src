/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

public final class uL0$a
implements a93_0 {
    public final ul0_1 a;
    public long b;
    public boolean c;

    public uL0$a(ul0_1 ul0_12, long l2) {
        Intrinsics.checkNotNullParameter(ul0_12, "fileHandle");
        this.a = ul0_12;
        this.b = l2;
    }

    public final long a0(ce_2 ce_22, long l2) {
        uL0$a uL0$a = this;
        Object object = ce_22;
        long l3 = l2;
        Object object2 = "sink";
        Intrinsics.checkNotNullParameter(ce_22, (String)object2);
        boolean bl2 = this.c;
        int n3 = 1;
        if (bl2 ^= n3) {
            long l4 = this.b;
            object2 = this.a;
            object2.getClass();
            long l7 = 0L;
            long l8 = l2 == l7 ? 0 : (l2 < l7 ? -1 : 1);
            if (l8 >= 0) {
                long l12;
                long l14;
                long l15;
                block6: {
                    l3 = l2 + l4;
                    l15 = l4;
                    while (true) {
                        int n4;
                        l14 = -1;
                        Object object3 = l15 == l3 ? 0 : (l15 < l3 ? -1 : 1);
                        if (object3 >= 0) break;
                        vx2_2 vx2_22 = ((ce_2)object).O(n3);
                        int n7 = vx2_22.c;
                        l7 = l3 - l15;
                        byte[] byArray = vx2_22.a;
                        l8 = 8192 - n7;
                        long l16 = l8;
                        int n8 = (int)(l7 = Math.min(l7, l16));
                        object3 = ((ul0_1)object2).b(l15, byArray, n7, n8);
                        if (object3 == (n4 = -1)) {
                            int n10 = vx2_22.b;
                            int n14 = vx2_22.c;
                            if (n10 == n14) {
                                vx2_2 vx2_23;
                                ((ce_2)object).a = vx2_23 = vx2_22.a();
                                ax2_2.a(vx2_22);
                            }
                            if ((l12 = l4 == l15 ? 0 : (l4 < l15 ? -1 : 1)) != false) break;
                            l15 = l14;
                            break block6;
                        }
                        vx2_22.c = n4 = vx2_22.c + object3;
                        l7 = object3;
                        l15 += l7;
                        ((ce_2)object).b = l16 = ((ce_2)object).b + l7;
                        n3 = 1;
                    }
                    l15 -= l4;
                }
                l12 = l15 == l14 ? 0 : (l15 < l14 ? -1 : 1);
                if (l12 != false) {
                    long l17;
                    uL0$a.b = l17 = uL0$a.b + l15;
                }
                return l15;
            }
            object = Wm2.a(l2, "byteCount < 0: ");
            object = object.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        String string2 = "closed".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block5: {
            block4: {
                ul0_1 ul0_12;
                block3: {
                    boolean bl2 = this.c;
                    if (bl2) {
                        return;
                    }
                    this.c = bl2 = true;
                    ul0_12 = this.a;
                    reentrantLock = ul0_12.c;
                    reentrantLock.lock();
                    try {
                        int n3;
                        ul0_12.b = n3 = ul0_12.b + -1;
                        if (n3 == 0 && (n3 = (int)(ul0_12.a ? 1 : 0)) != 0) break block3;
                        break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                reentrantLock.unlock();
                ul0_12.a();
                return;
            }
            reentrantLock.unlock();
            return;
        }
        reentrantLock.unlock();
        throw throwable2;
    }

    public final a timeout() {
        return okio.a.d;
    }
}

