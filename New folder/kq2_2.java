/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Kq2
 */
public final class kq2_2
implements wW0 {
    public final /* synthetic */ lq2_1 a;

    public /* synthetic */ kq2_2(lq2_1 lq2_12) {
        this.a = lq2_12;
    }

    public final void a(Bundle object, String object2) {
        int n3;
        lq2_1 lq2_12 = this.a;
        Intrinsics.checkNotNullParameter(lq2_12, "this$0");
        Intrinsics.checkNotNullParameter(object2, "requestKey");
        String string2 = "resultBundle";
        Intrinsics.checkNotNullParameter(object, string2);
        int n4 = object2.hashCode();
        int n7 = 731097229;
        if (n4 == n7 && (n3 = object2.equals(string2 = "permission_result")) != 0) {
            object2 = "result";
            int n8 = object.getInt((String)object2);
            if (n8 == (n3 = 100)) {
                object = lq2_12.g;
                if (object != null) {
                    object2 = lq2_12.d();
                    ((I3)object).a(object2);
                }
            } else {
                lq2_12.h();
            }
        } else {
            lq2_12.h();
        }
    }
}

