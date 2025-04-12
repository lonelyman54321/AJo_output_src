/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.activity.CheckoutAddressActivity;
import com.ril.ajio.services.data.Address.CartDeliveryAddressInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from bT
 */
public final class bt_0
implements F62 {
    public final /* synthetic */ gt_2 a;

    public /* synthetic */ bt_0(gt_2 gt_22) {
        this.a = gt_22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onChanged(Object object) {
        block23: {
            String string2;
            Object object2;
            Object object3;
            Object object4;
            gt_2 gt_22;
            int n3;
            int n4;
            block25: {
                String string3;
                block24: {
                    int n7;
                    Object object5;
                    block19: {
                        IllegalStateException illegalStateException2;
                        block22: {
                            block20: {
                                block21: {
                                    int n8;
                                    n4 = 0;
                                    n3 = 1;
                                    object = (DataCallback)object;
                                    string3 = "getPreferredStorePincode(...)";
                                    gt_22 = this.a;
                                    Intrinsics.checkNotNullParameter(gt_22, "this$0");
                                    object4 = cp_1.Companion;
                                    boolean bl2 = nn_2.b((cp$a)object4, (DataCallback)object);
                                    if (!bl2) break block23;
                                    gt_22.Oa();
                                    object4 = gt_22.g;
                                    if (object == null || (n8 = ((DataCallback)object).getStatus()) != 0) break block24;
                                    try {
                                        object = ((DataCallback)object).getData();
                                        object = (CartDeliveryAddressInfo)object;
                                        if (object == null || (object3 = ((CartDeliveryAddressInfo)object).getAddresses()) == null) break block19;
                                        object3 = z40_0.Companion;
                                        object2 = gt_22.requireActivity();
                                        object2 = object2.getApplication();
                                        string2 = "getApplication(...)";
                                        Intrinsics.checkNotNullExpressionValue(object2, string2);
                                        object3.getClass();
                                        object3 = z40$a.a((Context)object2);
                                        object3 = ((z40_0)object3).a;
                                        object2 = "enablePickupstore";
                                        n8 = (int)(((ao0_0)object3).a((String)object2) ? 1 : 0);
                                        object2 = AJIOApplication.Companion;
                                        object2.getClass();
                                        object2 = AJIOApplication$a.a();
                                        object2 = z40$a.a((Context)object2);
                                        object2 = ((z40_0)object2).a;
                                        string2 = "masterFlagToEnablePickupstore";
                                        boolean bl3 = ((ao0_0)object2).a(string2);
                                        if (!bl3 || n8 == 0 || (n8 = ((CartDeliveryAddressInfo)object).getShowStorePickUpTabForUser()) <= 0) break block20;
                                        object3 = gt_22.b;
                                        if (object3 == null) break block21;
                                        ((CheckoutAddressActivity)object3).y2(n3 != 0);
                                    }
                                    catch (IllegalStateException illegalStateException2) {
                                        break block22;
                                    }
                                }
                                object3 = ((CartDeliveryAddressInfo)object).getPreferredStorePincode();
                                Intrinsics.checkNotNullExpressionValue(object3, string3);
                                object2 = "value";
                                Intrinsics.checkNotNullParameter(object3, (String)object2);
                                try {
                                    Double.parseDouble((String)object3);
                                }
                                catch (NumberFormatException numberFormatException) {
                                    n3 = 0;
                                    object5 = null;
                                }
                                object3 = "pinCode";
                                if (n3) {
                                    object5 = gt_22.b;
                                    if (object5 != null) {
                                        object = ((CartDeliveryAddressInfo)object).getPreferredStorePincode();
                                        Intrinsics.checkNotNullExpressionValue(object, string3);
                                        Intrinsics.checkNotNullParameter(object, (String)object3);
                                        ((CheckoutAddressActivity)object5).p0 = object;
                                    }
                                    break block19;
                                } else {
                                    object = gt_22.b;
                                    if (object != null) {
                                        object5 = "";
                                        Intrinsics.checkNotNullParameter(object5, (String)object3);
                                        ((CheckoutAddressActivity)object).p0 = object5;
                                    }
                                }
                                break block19;
                            }
                            ((ArrayList)object4).clear();
                            object = ((CartDeliveryAddressInfo)object).getAddresses();
                            ((ArrayList)object4).addAll(object);
                            gt_22.Sa();
                            break block19;
                        }
                        object5 = yn3_0.a;
                        ((yn3$a)object5).e(illegalStateException2);
                    }
                    if ((object = gt_22.b) == null) break block25;
                    object = gt_22.a;
                    if (object != null) {
                        ((LT)object).b = object5 = gt_22.f;
                    }
                    if ((n7 = ((ArrayList)object4).size()) == 0) {
                        object = gt_22.e;
                        if (object != null) {
                            n3 = 8;
                            object.setVisibility(n3);
                        }
                        break block25;
                    } else {
                        object = gt_22.e;
                        if (object != null) {
                            object.setVisibility(0);
                        }
                        if ((object = gt_22.a) != null) {
                            ((RecyclerView$f)object).notifyDataSetChanged();
                        }
                    }
                    break block25;
                }
                int n10 = ((DataCallback)object).getStatus();
                if (n10 == n3) {
                    object = StringCompanionObject.INSTANCE;
                    n10 = R$string.acc_error_message;
                    object = hv3_0.K(n10);
                    int n14 = R$string.addresses_not_able_to_fetch;
                    string3 = hv3_0.K(n14);
                    object3 = new Object[n3];
                    object3[0] = string3;
                    string3 = "format(...)";
                    object = xh2_0.a((Object[])object3, n3, (String)object, string3);
                    CheckoutAddressActivity checkoutAddressActivity = gt_22.b;
                    if (checkoutAddressActivity != null) {
                        n14 = R$string.addresses_not_able_to_fetch;
                        string3 = hv3_0.K(n14);
                        checkoutAddressActivity.showNotification(string3, (String)object);
                    }
                }
            }
            Bundle bundle = new Bundle();
            object = gt_22.o;
            if (object4 != null && !(n3 = (int)(((ArrayList)object4).isEmpty() ? 1 : 0))) {
                object = ((NewCustomEventsRevamp)object).getNO_OF_ADDRESS();
                n4 = ((ArrayList)object4).size();
                bundle.putInt((String)object, n4);
            } else {
                object = ((NewCustomEventsRevamp)object).getNO_OF_ADDRESS();
                bundle.putInt((String)object, 0);
            }
            String string4 = gt_22.p;
            String string5 = gt_22.q;
            object3 = gt_22.o;
            object2 = "address list screen - shipping";
            string2 = "address management screen";
            ((NewCustomEventsRevamp)object3).newPushCustomScreenView((String)object2, string2, string4, bundle, string5);
        }
    }
}

