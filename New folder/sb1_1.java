/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sB1
 */
public final class sb1_1
extends Sc {
    public final long b(w32_0 tb1_02, long l2) {
        tb1_02 = tb1_02.h1();
        Intrinsics.checkNotNull(tb1_02);
        long l3 = ((xb1_0)tb1_02).n;
        float f5 = (int)(l3 >> 32);
        float f6 = (int)(l3 & 0xFFFFFFFFL);
        return e72.i(h72.a(f5, f6), l2);
    }

    public final Map c(w32_0 tb1_02) {
        tb1_02 = ((w32_0)tb1_02).h1();
        Intrinsics.checkNotNull(tb1_02);
        return ((xb1_0)tb1_02).z0().p();
    }

    public final int d(w32_0 tb1_02, Oc oc) {
        tb1_02 = ((w32_0)tb1_02).h1();
        Intrinsics.checkNotNull(tb1_02);
        return tb1_02.U(oc);
    }
}

