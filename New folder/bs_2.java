/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bS
 */
public final class bs_2
extends tz2_1 {
    public char[] a;
    public int b;

    public final Object a() {
        char[] cArray = this.a;
        int n3 = this.b;
        cArray = Arrays.copyOf(cArray, n3);
        Intrinsics.checkNotNullExpressionValue(cArray, "copyOf(...)");
        return cArray;
    }

    public final void b(int n3) {
        Object object = this.a;
        int n4 = ((char[])object).length;
        if (n4 < n3) {
            n4 = ((char[])object).length * 2;
            if (n3 < n4) {
                n3 = n4;
            }
            char[] cArray = Arrays.copyOf(object, n3);
            object = "copyOf(...)";
            Intrinsics.checkNotNullExpressionValue(cArray, (String)object);
            this.a = cArray;
        }
    }

    public final int d() {
        return this.b;
    }
}

