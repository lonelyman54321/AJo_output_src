/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.payment.activity.CheckoutAddressActivity;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from cT
 */
public final class ct_0
implements F62 {
    public final /* synthetic */ gt_2 a;

    public /* synthetic */ ct_0(gt_2 gt_22) {
        this.a = gt_22;
    }

    public final void onChanged(Object object) {
        CheckoutAddressActivity checkoutAddressActivity = null;
        int n3 = 1;
        object = (DataCallback)object;
        gt_2 gt_22 = this.a;
        Intrinsics.checkNotNullParameter(gt_22, "this$0");
        Object object2 = cp_1.Companion;
        boolean bl2 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (bl2) {
            int n4;
            object2 = "format(...)";
            if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
                object = StringCompanionObject.INSTANCE;
                int n7 = R$string.acc_alert_popup;
                object = hv3_0.K(n7);
                n4 = R$string.address_deleted_successfully;
                String string2 = hv3_0.K(n4);
                Object[] objectArray = new Object[n3];
                objectArray[0] = string2;
                object = xh2_0.a(objectArray, n3, (String)object, (String)object2);
                checkoutAddressActivity = gt_22.b;
                if (checkoutAddressActivity != null) {
                    n3 = R$string.address_deleted_successfully;
                    String string3 = hv3_0.K(n3);
                    checkoutAddressActivity.showNotification(string3, (String)object);
                }
                gt_22.Pa();
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n3) {
                    gt_22.Oa();
                    object = StringCompanionObject.INSTANCE;
                    n8 = R$string.acc_error_message;
                    object = hv3_0.K(n8);
                    n4 = R$string.delete_address_alert;
                    String string4 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = string4;
                    object = xh2_0.a(objectArray, n3, (String)object, (String)object2);
                    checkoutAddressActivity = gt_22.b;
                    if (checkoutAddressActivity != null) {
                        n3 = R$string.delete_address_alert;
                        String string5 = hv3_0.K(n3);
                        checkoutAddressActivity.showNotification(string5, (String)object);
                    }
                }
            }
        }
    }
}

