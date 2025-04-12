/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.text.TextUtils
 */
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dc0$a
 */
public final class dc0$a_0
implements zc0_0 {
    public final /* synthetic */ dc0_2 a;

    public dc0$a_0(dc0_2 dc0_22) {
        this.a = dc0_22;
    }

    public final void a(String string2, String string3) {
        string3 = UrlHelper.Companion.getInstance().getCompleteUrl(string3);
        cp_1.Companion.getClass();
        cp$a.e().getClass();
        string3 = cp_1.b(string3, "offerspage");
        int n3 = R$string.coupon_share;
        Object object = new Object[]{string2, string3};
        string2 = hv3_0.L(n3, object);
        string3 = this.a.getContext();
        String string4 = hv3_0.K(R$string.pop_n_peek_share_subject);
        object = hv3_0.K(R$string.share_offer);
        d23_0.f((Context)string3, string2, string4, null, (String)object);
    }

    public final void b(String object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        sD3 sD32 = this.a;
        if (!bl2) {
            kj0_1 kj0_12 = kj0_1.g();
            sD32 = sD32.getActivity();
            kj0_12.w((Activity)sD32, (String)object);
        } else {
            object = sD32.e;
            Intrinsics.checkNotNull(object);
            object.Y0();
        }
        tj2_0.e(AnalyticsManager.Companion, "offers_page", "navigated_via_offers", "Offers Page");
    }

    public final void c(Integer n3) {
        ac0.Companion.getClass();
        ac0 ac02 = ac0.b;
        if (ac02 == null) {
            ac0.b = ac02 = new ac0();
        }
        ac02 = ac0.b;
        Intrinsics.checkNotNull(ac02);
        Intrinsics.checkNotNull(n3);
        ac02.a.b(n3);
    }

    public final void d(String string2) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (!bl2) {
            CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
            FragmentActivity fragmentActivity = this.a.requireActivity();
            String string3 = "requireActivity(...)";
            Intrinsics.checkNotNullExpressionValue(fragmentActivity, string3);
            int n3 = 6;
            CustomWebViewActivity$a.b(customWebViewActivity$a, (Context)fragmentActivity, string2, n3);
        }
    }
}

