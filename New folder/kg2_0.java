/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KG2
 */
public final class kg2_0
extends zj0_0 {
    public final hh3_2 c;

    public kg2_0(Activity object) {
        super((Activity)object);
        super();
        object = yr1_2.b((Function0)object);
        this.c = object;
    }

    public final void b(String object) {
        Intrinsics.checkNotNullParameter(object, "originalUrl");
        Activity activity = this.a;
        int n3 = activity instanceof AjioHomeActivity;
        if (n3 != 0) {
            object = this.c.getValue();
            Object object2 = "getValue(...)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            object = (UserInformation)object;
            boolean bl2 = ((UserInformation)object).isUserOnline();
            if (bl2) {
                gg2_1.Companion.getClass();
                bl2 = false;
                gg2_1 gg2_12 = GG2$a.a(0.0f, 0.0f);
                object = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                Intrinsics.checkNotNull(activity, (String)object);
                object2 = activity;
                object2 = (AjioHomeActivity)activity;
                Fragment fragment = ((AjioHomeActivity)object2).T0;
                Boolean bl3 = Boolean.FALSE;
                boolean bl4 = true;
                String string2 = "ReferralFragment";
                ((AjioHomeActivity)object2).Q1(fragment, gg2_12, bl4, string2, bl3);
            } else {
                Intrinsics.checkNotNullExpressionValue(activity, "activity");
                object = "source - deeplink";
                n3 = 52;
                at2_1.h(activity, (String)object, n3);
            }
        } else {
            n3 = activity instanceof OrderConfirmationActivity;
            if (n3 != 0) {
                kj0_1 kj0_12 = kj0_1.g();
                String string3 = "null cannot be cast to non-null type com.ril.ajio.payment.activity.OrderConfirmationActivity";
                Intrinsics.checkNotNull(activity, string3);
                activity = (OrderConfirmationActivity)activity;
                kj0_12.getClass();
                kj0_1.k((OrderConfirmationActivity)activity, (String)object);
            }
        }
    }
}

