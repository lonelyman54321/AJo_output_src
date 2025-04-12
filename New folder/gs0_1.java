/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gs0
 */
public final class gs0_1
extends tz2_1 {
    public double[] a;
    public int b;

    public final Object a() {
        double[] dArray = this.a;
        int n3 = this.b;
        dArray = Arrays.copyOf(dArray, n3);
        Intrinsics.checkNotNullExpressionValue(dArray, "copyOf(...)");
        return dArray;
    }

    public final void b(int n3) {
        Object object = this.a;
        int n4 = ((double[])object).length;
        if (n4 < n3) {
            n4 = ((double[])object).length * 2;
            if (n3 < n4) {
                n3 = n4;
            }
            double[] dArray = Arrays.copyOf(object, n3);
            object = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(dArray, (String)object);
            this.a = dArray;
        }
    }

    public final int d() {
        return this.b;
    }
}

