/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FV1
 */
public final class fv1_2
implements wW0 {
    public final /* synthetic */ iv1_2 a;
    public final /* synthetic */ String b;

    public /* synthetic */ fv1_2(iv1_2 iv1_22, String string2) {
        this.a = iv1_22;
        this.b = string2;
    }

    public final void a(Bundle object, String string2) {
        iv1_2 iv1_22 = this.a;
        Intrinsics.checkNotNullParameter(iv1_22, "this$0");
        String string3 = this.b;
        Intrinsics.checkNotNullParameter(string3, "$coupon");
        Intrinsics.checkNotNullParameter(string2, "requestKey");
        String string4 = "bundle";
        Intrinsics.checkNotNullParameter(object, string4);
        int n3 = string2.hashCode();
        int n4 = 986651517;
        if (n3 == n4 && (n3 = (int)(string2.equals(object = "verify_ril_profile_success") ? 1 : 0)) != 0) {
            iv1_22.Oa(string3);
        }
    }
}

