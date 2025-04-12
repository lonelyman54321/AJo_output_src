/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aB1
 */
public final class ab1_1
extends tz2_1 {
    public long[] a;
    public int b;

    public final Object a() {
        long[] lArray = this.a;
        int n3 = this.b;
        lArray = Arrays.copyOf(lArray, n3);
        Intrinsics.checkNotNullExpressionValue(lArray, "copyOf(...)");
        return lArray;
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
            object = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(lArray, (String)object);
            this.a = lArray;
        }
    }

    public final int d() {
        return this.b;
    }
}

