/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Et3
 */
public final class et3_0
extends tz2_1 {
    public byte[] a;
    public int b;

    public final Object a() {
        byte[] byArray = this.a;
        int n3 = this.b;
        byArray = Arrays.copyOf(byArray, n3);
        Intrinsics.checkNotNullExpressionValue(byArray, "copyOf(...)");
        Intrinsics.checkNotNullParameter(byArray, "storage");
        dt3_0 dt3_02 = new dt3_0(byArray);
        return dt3_02;
    }

    public final void b(int n3) {
        Object object = this.a;
        int n4 = ((byte[])object).length;
        if (n4 < n3) {
            n4 = ((byte[])object).length * 2;
            if (n3 < n4) {
                n3 = n4;
            }
            byte[] byArray = Arrays.copyOf(object, n3);
            Intrinsics.checkNotNullExpressionValue(byArray, "copyOf(...)");
            object = "storage";
            Intrinsics.checkNotNullParameter(byArray, (String)object);
            this.a = byArray;
        }
    }

    public final int d() {
        return this.b;
    }
}

