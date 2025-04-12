/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xZ1
 */
public final class xz1_1
implements wW0 {
    public final /* synthetic */ bz1_2 a;

    public /* synthetic */ xz1_1(bz1_2 bz1_22) {
        this.a = bz1_22;
    }

    public final void a(Bundle object, String string2) {
        bz1_2 bz1_22 = this.a;
        Intrinsics.checkNotNullParameter(bz1_22, "this$0");
        Intrinsics.checkNotNullParameter(string2, "requestKey");
        String string3 = "bundle";
        Intrinsics.checkNotNullParameter(object, string3);
        int n3 = string2.hashCode();
        int n4 = 986651517;
        if (n3 == n4 && (n3 = (int)(string2.equals(object = "verify_ril_profile_success") ? 1 : 0)) != 0) {
            bz1_22.ib();
        }
    }
}

