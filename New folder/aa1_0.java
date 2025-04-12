/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.referral.RefereeEarnCash;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import com.ril.ajio.services.data.referral.ReferrerCashData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from aA1
 */
public final class aa1_0
implements F62 {
    public final /* synthetic */ da1_1 a;

    public /* synthetic */ aa1_0(da1_1 da1_12) {
        this.a = da1_12;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        da1_1 da1_12 = this.a;
        Intrinsics.checkNotNullParameter(da1_12, "this$0");
        cp$a cp$a = cp_1.Companion;
        int n3 = nn_2.b(cp$a, (DataCallback)object);
        if (n3 != 0 && (n3 = ((DataCallback)object).getStatus()) == 0) {
            float f5;
            Object object2;
            object = (ReferralConfigCash)((DataCallback)object).getData();
            da1_12.getClass();
            if (object != null && (object = ((ReferralConfigCash)object).getReferee()) != null) {
                object = ((ReferrerCashData)object).getRefereeUserRegistration();
            } else {
                object2 = 0;
                f5 = 0.0f;
                object = null;
            }
            bv1_0.c = object;
            if (object != null) {
                f5 = ((RefereeEarnCash)object).getAmount();
                n3 = 0;
                cp$a = null;
                float f6 = f5 - 0.0f;
                object2 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                if (object2 > 0) {
                    da1_12.Va();
                }
            }
        }
    }
}

