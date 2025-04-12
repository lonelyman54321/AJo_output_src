/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.services.data.Cart.CartEarnPointData;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LM
 */
public final class lm_1
implements View.OnClickListener {
    public final /* synthetic */ mm_2 a;
    public final /* synthetic */ CartEarnPointData b;

    public /* synthetic */ lm_1(mm_2 mm_22, CartEarnPointData cartEarnPointData) {
        this.a = mm_22;
        this.b = cartEarnPointData;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        CartEarnPointData cartEarnPointData = this.b;
        Intrinsics.checkNotNullParameter(cartEarnPointData, "$cartEarnPointData");
        tj2_0.e(AnalyticsManager.Companion, "AJIOWallet", "What is Ajio Wallet ", "bag screen");
        object = ((mm_2)object2).a;
        object2 = cartEarnPointData.getWalletInfo();
        object.n2((String)object2);
    }
}

