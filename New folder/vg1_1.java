/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vg1
 */
public final class vg1_1 {
    public final int a;
    public final ug1_0 b;

    public vg1_1(int n3) {
        ug1_0 ug1_02 = new ug1_0(n3);
        Intrinsics.checkNotNullParameter(ug1_02, "memoryCache");
        this.a = n3;
        this.b = ug1_02;
    }

    public final boolean a(Object object, String string2) {
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        String string4 = "value";
        Intrinsics.checkNotNullParameter(object, string4);
        int n3 = zy_0.b(object);
        int n4 = this.a;
        ug1_0 ug1_02 = this.b;
        if (n3 > n4) {
            Intrinsics.checkNotNullParameter(string2, string3);
            ug1_02.c(string2);
            return false;
        }
        ug1_02.a(object, string2);
        return true;
    }
}

