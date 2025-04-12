/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from k43
 */
public final class k43_0
extends tz2_1 {
    public short[] a;
    public int b;

    public final Object a() {
        short[] sArray = this.a;
        int n3 = this.b;
        sArray = Arrays.copyOf(sArray, n3);
        Intrinsics.checkNotNullExpressionValue(sArray, "copyOf(...)");
        return sArray;
    }

    public final void b(int n3) {
        Object object = this.a;
        int n4 = ((short[])object).length;
        if (n4 < n3) {
            n4 = ((short[])object).length * 2;
            if (n3 < n4) {
                n3 = n4;
            }
            short[] sArray = Arrays.copyOf(object, n3);
            object = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(sArray, (String)object);
            this.a = sArray;
        }
    }

    public final int d() {
        return this.b;
    }
}

