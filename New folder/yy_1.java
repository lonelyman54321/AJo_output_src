/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yy
 */
public final class yy_1
extends tz2_1 {
    public boolean[] a;
    public int b;

    public final Object a() {
        boolean[] blArray = this.a;
        int n3 = this.b;
        blArray = Arrays.copyOf(blArray, n3);
        Intrinsics.checkNotNullExpressionValue(blArray, "copyOf(...)");
        return blArray;
    }

    public final void b(int n3) {
        Object object = this.a;
        int n4 = ((boolean[])object).length;
        if (n4 < n3) {
            n4 = ((boolean[])object).length * 2;
            if (n3 < n4) {
                n3 = n4;
            }
            boolean[] blArray = Arrays.copyOf(object, n3);
            object = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(blArray, (String)object);
            this.a = blArray;
        }
    }

    public final int d() {
        return this.b;
    }
}

