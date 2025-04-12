/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.activity.CheckoutAddressActivity;
import com.ril.ajio.services.data.Address.CartDeliveryAddressInfo;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class MT
implements F62 {
    public final /* synthetic */ ot_2 a;

    public /* synthetic */ MT(ot_2 ot_22) {
        this.a = ot_22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onChanged(Object object) {
        Object object2;
        ot_2 ot_22;
        String string2;
        int n3;
        CheckoutAddressActivity checkoutAddressActivity;
        block17: {
            int n4;
            Object object3;
            ArrayList arrayList;
            int n7;
            block13: {
                IllegalStateException illegalStateException2;
                block16: {
                    block14: {
                        block15: {
                            String string3;
                            n7 = 0;
                            checkoutAddressActivity = null;
                            n3 = 1;
                            object = (DataCallback)object;
                            string2 = "getPreferredStorePincode(...)";
                            ot_22 = this.a;
                            Intrinsics.checkNotNullParameter(ot_22, "this$0");
                            object2 = cp_1.Companion;
                            int n8 = nn_2.b((cp$a)object2, (DataCallback)object);
                            if (n8 == 0) return;
                            object2 = ot_22.g;
                            arrayList = ot_22.f;
                            if (object2 != null) {
                                object2.P0();
                            }
                            if (object == null || (n8 = ((DataCallback)object).getStatus()) != 0) break block17;
                            try {
                                object = ((DataCallback)object).getData();
                                object = (CartDeliveryAddressInfo)object;
                                if (object == null || (object2 = ((CartDeliveryAddressInfo)object).getAddresses()) == null) break block13;
                                n8 = (int)(ot_22.i ? 1 : 0);
                                if (n8 == 0 || (n8 = ((CartDeliveryAddressInfo)object).getShowStorePickUpTabForUser()) <= 0) break block14;
                                object2 = ((CartDeliveryAddressInfo)object).getPreferredStorePincode();
                                Intrinsics.checkNotNullExpressionValue(object2, string2);
                                string3 = "value";
                                Intrinsics.checkNotNullParameter(object2, string3);
                                try {
                                    Double.parseDouble((String)object2);
                                }
                                catch (NumberFormatException numberFormatException) {
                                    n3 = 0;
                                    object3 = null;
                                }
                                object2 = "pinCode";
                                if (n3 == 0) break block15;
                            }
                            catch (IllegalStateException illegalStateException2) {
                                break block16;
                            }
                            object3 = ot_22.b;
                            if (object3 != null) {
                                string3 = ((CartDeliveryAddressInfo)object).getPreferredStorePincode();
                                Intrinsics.checkNotNullExpressionValue(string3, string2);
                                Intrinsics.checkNotNullParameter(string3, (String)object2);
                                ((CheckoutAddressActivity)object3).p0 = string3;
                            }
                            if ((object3 = ot_22.j) == null) {
                                object3 = "viewModel";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                                n3 = 0;
                                object3 = null;
                            }
                            object2 = ((CartDeliveryAddressInfo)object).getPreferredStorePincode();
                            Intrinsics.checkNotNullExpressionValue(object2, string2);
                            object3.getClass();
                            string2 = "pincode";
                            Intrinsics.checkNotNullParameter(object2, string2);
                            object3 = ((ys2_1)object3).d;
                            ((LiveData)object3).k(object2);
                            break block14;
                        }
                        object3 = ot_22.b;
                        if (object3 != null) {
                            string2 = "";
                            Intrinsics.checkNotNullParameter(string2, (String)object2);
                            ((CheckoutAddressActivity)object3).p0 = string2;
                        }
                    }
                    arrayList.clear();
                    object = ((CartDeliveryAddressInfo)object).getAddresses();
                    arrayList.addAll(object);
                    ot_22.Ra();
                    break block13;
                }
                object3 = yn3_0.a;
                ((yn3$a)object3).e(illegalStateException2);
            }
            if ((object = ot_22.b) == null) {
                return;
            }
            object = ot_22.a;
            if (object != null) {
                ((LT)object).b = object3 = ot_22.e;
            }
            if ((n4 = arrayList.size()) == 0) {
                object = ot_22.d;
                if (object == null) return;
                n7 = 8;
                object.setVisibility(n7);
                return;
            }
            object = ot_22.d;
            if (object != null) {
                object.setVisibility(0);
            }
            if ((object = ot_22.a) == null) return;
            ((RecyclerView$f)object).notifyDataSetChanged();
            return;
        }
        int n10 = ((DataCallback)object).getStatus();
        if (n10 != n3) return;
        object = StringCompanionObject.INSTANCE;
        n10 = R$string.acc_error_message;
        object = hv3_0.K(n10);
        int n14 = R$string.addresses_not_able_to_fetch;
        string2 = hv3_0.K(n14);
        object2 = new Object[n3];
        object2[0] = string2;
        object = xh2_0.a(object2, n3, (String)object, "format(...)");
        checkoutAddressActivity = ot_22.b;
        if (checkoutAddressActivity == null) return;
        n3 = R$string.addresses_not_able_to_fetch;
        String string4 = hv3_0.K(n3);
        checkoutAddressActivity.showNotification(string4, (String)object);
    }
}

