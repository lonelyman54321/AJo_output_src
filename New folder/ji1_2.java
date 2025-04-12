/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ji1
 */
public final class ji1_2
extends tz2_1 {
    public int[] a;
    public int b;

    public final Object a() {
        int[] nArray = this.a;
        int n3 = this.b;
        nArray = Arrays.copyOf(nArray, n3);
        Intrinsics.checkNotNullExpressionValue(nArray, "copyOf(...)");
        return nArray;
    }

    public final void b(int n3) {
        Object object = this.a;
        int n4 = ((int[])object).length;
        if (n4 < n3) {
            n4 = ((int[])object).length * 2;
            if (n3 < n4) {
                n3 = n4;
            }
            int[] nArray = Arrays.copyOf(object, n3);
            object = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(nArray, (String)object);
            this.a = nArray;
        }
    }

    public final int d() {
        return this.b;
    }
}

