/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Jt3
 */
public final class jt3_0
extends tz2_1 {
    public int[] a;
    public int b;

    public final Object a() {
        int[] nArray = this.a;
        int n3 = this.b;
        nArray = Arrays.copyOf(nArray, n3);
        Intrinsics.checkNotNullExpressionValue(nArray, "copyOf(...)");
        Intrinsics.checkNotNullParameter(nArray, "storage");
        it3_0 it3_02 = new it3_0(nArray);
        return it3_02;
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
            Intrinsics.checkNotNullExpressionValue(nArray, "copyOf(...)");
            object = "storage";
            Intrinsics.checkNotNullParameter(nArray, (String)object);
            this.a = nArray;
        }
    }

    public final int d() {
        return this.b;
    }
}

