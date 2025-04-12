/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.activity.CheckoutAddressActivity;
import com.ril.ajio.services.data.Address.CartDeliveryAddressInfo;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZS
 */
public final class zs_0
implements F62 {
    public final /* synthetic */ CheckoutAddressActivity a;

    public /* synthetic */ zs_0(CheckoutAddressActivity checkoutAddressActivity) {
        this.a = checkoutAddressActivity;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onChanged(Object object) {
        String string2;
        int n3;
        CheckoutAddressActivity checkoutAddressActivity;
        block11: {
            block12: {
                yn3$a yn3$a;
                IllegalStateException illegalStateException2;
                block10: {
                    Object object2;
                    Object object3;
                    int n4;
                    block9: {
                        object = (DataCallback)object;
                        checkoutAddressActivity = this.a;
                        Intrinsics.checkNotNullParameter(checkoutAddressActivity, "this$0");
                        Object object4 = cp_1.Companion;
                        boolean bl2 = nn_2.b(object4, (DataCallback)object);
                        if (!bl2) return;
                        object4 = checkoutAddressActivity.Y;
                        if (object4 != null) {
                            ((AjioLoaderView)((Object)object4)).stopLoader();
                        }
                        bl2 = false;
                        object4 = null;
                        n3 = 1;
                        string2 = "";
                        if (object == null || (n4 = ((DataCallback)object).getStatus()) != 0) break block11;
                        try {
                            object = ((DataCallback)object).getData();
                            object = (CartDeliveryAddressInfo)object;
                            if (object == null || (object3 = ((CartDeliveryAddressInfo)object).getAddresses()) == null) break block9;
                            n4 = ((ArrayList)object3).size();
                            object2 = checkoutAddressActivity.Z;
                            if (object2 == null) break block9;
                            object2 = AnalyticsManager.Companion;
                            object2 = ((AnalyticsManager$Companion)object2).getInstance();
                            object2 = ((AnalyticsManager)object2).getGtmEvents();
                            Bundle bundle = new Bundle();
                            String string3 = "no_of_addresses";
                            bundle.putInt(string3, n4);
                            object3 = Unit.a;
                            object3 = "Check out Address delivery";
                            ((GTMEvents)object2).pushOpenScreenEvent((String)object3, bundle);
                        }
                        catch (IllegalStateException illegalStateException2) {
                            break block10;
                        }
                    }
                    if (object != null && (n4 = ((CartDeliveryAddressInfo)object).getShowStorePickUpTabForUser()) > 0) {
                        checkoutAddressActivity.y2(n3 != 0);
                        object3 = ((CartDeliveryAddressInfo)object).getPreferredStorePincode();
                        object2 = "getPreferredStorePincode(...)";
                        Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
                        object2 = "value";
                        Intrinsics.checkNotNullParameter(object3, (String)object2);
                        try {
                            Double.parseDouble((String)object3);
                        }
                        catch (NumberFormatException numberFormatException) {
                            n3 = 0;
                            yn3$a = null;
                        }
                        if (n3) {
                            string2 = ((CartDeliveryAddressInfo)object).getPreferredStorePincode();
                        }
                        break block12;
                    } else {
                        checkoutAddressActivity.y2(false);
                    }
                    break block12;
                }
                yn3$a = yn3_0.a;
                yn3$a.e(illegalStateException2);
                checkoutAddressActivity.y2(false);
            }
            checkoutAddressActivity.p0 = string2;
            return;
        }
        int n7 = ((DataCallback)object).getStatus();
        if (n7 != n3) return;
        checkoutAddressActivity.y2(false);
        checkoutAddressActivity.p0 = string2;
    }
}

