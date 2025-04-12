/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ot3
 */
public final class ot3_0
extends tz2_1 {
    public long[] a;
    public int b;

    public final Object a() {
        long[] lArray = this.a;
        int n3 = this.b;
        lArray = Arrays.copyOf(lArray, n3);
        Intrinsics.checkNotNullExpressionValue(lArray, "copyOf(...)");
        Intrinsics.checkNotNullParameter(lArray, "storage");
        nt3_0 nt3_02 = new nt3_0(lArray);
        return nt3_02;
    }

    public final void b(int n3) {
        Object object = this.a;
        int n4 = ((long[])object).length;
        if (n4 < n3) {
            n4 = ((long[])object).length * 2;
            if (n3 < n4) {
                n3 = n4;
            }
            long[] lArray = Arrays.copyOf(object, n3);
            Intrinsics.checkNotNullExpressionValue(lArray, "copyOf(...)");
            object = "storage";
            Intrinsics.checkNotNullParameter(lArray, (String)object);
            this.a = lArray;
        }
    }

    public final int d() {
        return this.b;
    }
}

