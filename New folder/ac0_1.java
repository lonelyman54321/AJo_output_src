/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.services.data.Address.CartDeliveryAddressInfo;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from aC0
 */
public final class ac0_1
implements F62 {
    public final /* synthetic */ dc0_1 a;

    public /* synthetic */ ac0_1(dc0_1 dc0_12) {
        this.a = dc0_12;
    }

    public final void onChanged(Object object) {
        boolean bl2 = false;
        ExReturnAddressActivity exReturnAddressActivity = null;
        int n3 = 1;
        object = (DataCallback)object;
        Object object2 = dc0_1.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        Intrinsics.checkNotNullParameter(object, "cartDeliveryAddressInfoDataCallback");
        Object object3 = cp_1.Companion;
        int n4 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n4 != 0) {
            object3 = ((dc0_1)object2).Sa().falrShimmer.falrShimmerFL;
            Object object4 = "falrShimmerFL";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
            ai0_2.i((View)object3);
            object3 = ((dc0_1)object2).k;
            if (object3 != null && (n4 = object3.isFinishing()) == 0) {
                n4 = ((DataCallback)object).getStatus();
                if (n4 == 0) {
                    boolean bl3;
                    Object object5;
                    int n7;
                    boolean bl4;
                    object = (CartDeliveryAddressInfo)((DataCallback)object).getData();
                    object3 = ((dc0_1)object2).m;
                    if (object3 != null) {
                        ((ArrayList)object3).clear();
                    }
                    if (bl4 = hv3_0.W()) {
                        object4 = ((dc0_1)object2).i;
                        if (object4 != null) {
                            ((CartDeliveryAddress)object4).setDefaultAddress(false);
                        }
                        if ((object4 = ((dc0_1)object2).i) != null) {
                            ((CartDeliveryAddress)object4).setDeliveredAddress(n3 != 0);
                        }
                        if (object3 != null) {
                            n7 = 4;
                            object5 = ((dc0_1)object2).i;
                            object4 = new j33(n7, object5);
                            ((ArrayList)object3).add(object4);
                        }
                    }
                    if (object != null && (object4 = ((CartDeliveryAddressInfo)object).getAddresses()) != null) {
                        object4 = ((CartDeliveryAddressInfo)object).getAddresses().iterator();
                        Object object6 = "iterator(...)";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object6);
                        while ((n7 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                            object6 = (CartDeliveryAddress)object4.next();
                            if (object3 == null) continue;
                            int n8 = 2;
                            object5 = new j33(n8, object6);
                            ((ArrayList)object3).add(object5);
                        }
                    }
                    if (object == null || (object = ((CartDeliveryAddressInfo)object).getAddresses()) == null || (bl3 = object.isEmpty())) {
                        bl2 = true;
                    }
                    ((dc0_1)object2).t = bl2;
                    ((dc0_1)object2).Ta();
                    object = ((dc0_1)object2).Pa();
                    ai0_2.B((View)object);
                    ((dc0_1)object2).Va();
                } else {
                    int n10 = ((DataCallback)object).getStatus();
                    if (n10 == n3) {
                        object = StringCompanionObject.INSTANCE;
                        n10 = R$string.acc_error_message;
                        object = hv3_0.K(n10);
                        n4 = R$string.addresses_not_able_to_fetch;
                        object3 = hv3_0.K(n4);
                        object4 = new Object[n3];
                        object4[0] = object3;
                        object = xh2_0.a((Object[])object4, n3, (String)object, "format(...)");
                        exReturnAddressActivity = ((dc0_1)object2).k;
                        if (exReturnAddressActivity != null) {
                            n3 = R$string.addresses_not_able_to_fetch;
                            String string2 = hv3_0.K(n3);
                            exReturnAddressActivity.showNotification(string2, (String)object);
                        }
                    }
                }
            }
        }
    }
}

