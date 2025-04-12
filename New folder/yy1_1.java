/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.view.View
 */
import android.app.Application;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Yy1
 */
public final class yy1_1
implements Function1 {
    public final /* synthetic */ fz1_2 a;

    public /* synthetic */ yy1_1(fz1_2 fz1_22) {
        this.a = fz1_22;
    }

    public final Object invoke(Object object) {
        object = (DataCallback)object;
        Object object2 = fz1_2.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Object object3 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n3 != 0 && (n3 = ((DataCallback)object).getStatus()) == 0) {
            object3 = Ey1.a;
            object = (ReferralConfigCash)((DataCallback)object).getData();
            object3 = ((fz1_2)object2).Qa().loginAjioCashInfo;
            Intrinsics.checkNotNullExpressionValue(object3, "loginAjioCashInfo");
            object2 = ((Fragment)object2).requireActivity().getApplication();
            String string2 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            Ey1.f((ReferralConfigCash)object, (View)object3, (Application)object2);
        }
        return Unit.a;
    }
}

