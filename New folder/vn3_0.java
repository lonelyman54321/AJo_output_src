/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vn3
 */
public final class vn3_0 {
    public static final boolean a(int n3, int n4) {
        n3 = n3 == n4 ? 1 : 0;
        return n3 != 0;
    }

    public static final int b(int n3, wr1_0 wr1_02, Object object) {
        int n4;
        if (object != null && (n4 = wr1_02.getItemCount()) != 0) {
            int n7;
            Object object2;
            n4 = wr1_02.getItemCount();
            if (n3 < n4 && (n4 = (int)(Intrinsics.areEqual(object, object2 = wr1_02.c(n3)) ? 1 : 0)) != 0) {
                return n3;
            }
            int n8 = wr1_02.b(object);
            if (n8 != (n7 = -1)) {
                return n8;
            }
        }
        return n3;
    }
}

