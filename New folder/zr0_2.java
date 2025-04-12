/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZR0
 */
public final class zr0_2
extends tz2_1 {
    public float[] a;
    public int b;

    public final Object a() {
        float[] fArray = this.a;
        int n3 = this.b;
        fArray = Arrays.copyOf(fArray, n3);
        Intrinsics.checkNotNullExpressionValue(fArray, "copyOf(...)");
        return fArray;
    }

    public final void b(int n3) {
        Object object = this.a;
        int n4 = ((float[])object).length;
        if (n4 < n3) {
            n4 = ((float[])object).length * 2;
            if (n3 < n4) {
                n3 = n4;
            }
            float[] fArray = Arrays.copyOf(object, n3);
            object = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(fArray, (String)object);
            this.a = fArray;
        }
    }

    public final int d() {
        return this.b;
    }
}

