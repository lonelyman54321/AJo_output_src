/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rL0
 */
public final class rl0_1
implements sl0_0 {
    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final rs0_1 a(Pair object) {
        void var1_6;
        ox_0 ox_02;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "urlMeta");
        Object object3 = object2 = object.a;
        object3 = (String)object2;
        long l2 = 0L;
        int n3 = 62;
        object2 = ox_02;
        ox_02 = new ox_0((String)object3, false, null, null, l2, n3, 0);
        ie0_0 ie0_02 = (ie0_0)((Object)object.b);
        object2 = rL0$a.$EnumSwitchMapping$0;
        int n4 = ie0_02.ordinal();
        Object object4 = object2[n4];
        int n7 = 1;
        if (object4 != n7 && object4 != (n7 = 2)) {
            n7 = 3;
            if (object4 == n7) {
                U91$a u91$a = U91$a.DOWNLOAD_BYTES;
                return u91_0.a((U91$a)var1_6, ox_02);
            }
            NoWhenBranchMatchedException noWhenBranchMatchedException = new NoWhenBranchMatchedException();
            throw noWhenBranchMatchedException;
        }
        U91$a u91$a = U91$a.DOWNLOAD_INAPP_BITMAP;
        return u91_0.a((U91$a)var1_6, ox_02);
    }
}

