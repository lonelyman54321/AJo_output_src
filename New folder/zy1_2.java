/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.myaccount.order.exchangereturn.activity.revamp.b;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZY1
 */
public final class zy1_2
implements Function0 {
    public final /* synthetic */ b a;
    public final /* synthetic */ int b;

    public /* synthetic */ zy1_2(b b2, int n3) {
        this.a = b2;
        this.b = n3;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
        Bundle bundle = ((b)object).Pa();
        int n3 = this.b;
        bundle.putInt("return_fee", n3);
        String string2 = "buttonTap";
        String string3 = "return mode selection interaction";
        String string4 = "know why";
        String string5 = "buttonTap";
        String string6 = "return mode confirmation screen";
        String string7 = "";
        int n4 = 1632;
        NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object2, string2, string3, string4, string5, string6, null, null, bundle, string7, false, null, n4, null);
        hv3_0 hv3_02 = hv3_0.a;
        object2 = ((b)object).r;
        object2 = object2 != null ? ((ReturnOrderItemDetails)object2).getActionContent() : null;
        object = ((Fragment)object).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object, "getChildFragmentManager(...)");
        hv3_02.getClass();
        hv3_0.c0((ActionContent)object2, (FragmentManager)object);
        return Unit.a;
    }
}

