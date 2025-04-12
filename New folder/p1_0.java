/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from p1
 */
public abstract class p1_0 {
    public r1_0[] a;
    public int b;
    public int c;
    public ff3_2 d;

    public final ff3_2 b() {
        synchronized (this) {
            Throwable throwable2;
            block10: {
                ff3_2 ff3_22;
                block9: {
                    try {
                        ff3_22 = this.d;
                        if (ff3_22 != null) break block9;
                    }
                    catch (Throwable throwable2) {}
                    int n3 = this.b;
                    he_2 he_22 = he_2.DROP_OLDEST;
                    int n4 = 1;
                    int n7 = -1 >>> 1;
                    ff3_22 = new i23_0(n4, n7, he_22);
                    Integer n8 = n3;
                    ff3_22.a(n8);
                    this.d = ff3_22;
                    break block10;
                }
                return ff3_22;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final r1_0 f() {
        r1_0 r1_02;
        int n3;
        r1_0[] r1_0Array;
        int n4;
        Object object;
        block9: {
            // MONITORENTER : this
            object = this.a;
            if (object == null) {
                object = this.h();
                this.a = object;
                break block9;
            }
            n4 = this.b;
            int n7 = ((r1_0[])object).length;
            if (n4 >= n7) {
                n4 = ((r1_0[])object).length * 2;
                object = Arrays.copyOf(object, n4);
                r1_0Array = "copyOf(...)";
                Intrinsics.checkNotNullExpressionValue(object, (String)r1_0Array);
                r1_0Array = object;
                this.a = r1_0Array = object;
            }
        }
        n4 = this.c;
        do {
            if ((r1_02 = object[n4]) == null) {
                object[n4] = r1_02 = this.g();
            }
            if (++n4 >= (n3 = ((r1_0[])object).length)) {
                n4 = 0;
                r1_0Array = null;
            }
            String string2 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>";
            Intrinsics.checkNotNull(r1_02, string2);
        } while ((n3 = (int)(r1_02.a(this) ? 1 : 0)) == 0);
        this.c = n4;
        int n8 = this.b;
        n4 = 1;
        this.b = n8 += n4;
        object = this.d;
        // MONITOREXIT : this
        if (object == null) return r1_02;
        ((ff3_2)object).w(n4);
        return r1_02;
    }

    public abstract r1_0 g();

    public abstract r1_0[] h();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void i(r1_0 f80_0Array) {
        // MONITORENTER : this
        int n3 = this.b;
        int n4 = -1;
        this.b = n3 += n4;
        ff3_2 ff3_22 = this.d;
        int n7 = 0;
        if (n3 == 0) {
            this.c = 0;
        }
        String string2 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>";
        Intrinsics.checkNotNull(f80_0Array, string2);
        f80_0Array = f80_0Array.b(this);
        // MONITOREXIT : this
        n3 = f80_0Array.length;
        while (true) {
            if (n7 >= n3) {
                if (ff3_22 == null) return;
                ff3_22.w(n4);
                return;
            }
            f80_0 f80_02 = f80_0Array[n7];
            if (f80_02 != null) {
                Object object = tl2_2.b;
                object = Unit.a;
                f80_02.resumeWith(object);
            }
            ++n7;
        }
    }
}

