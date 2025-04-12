/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 */
import android.content.Intent;
import android.os.Bundle;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.FirebaseEvents;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.services.query.QueryAddress;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from u4
 */
public final class u4_0
implements F62 {
    public final /* synthetic */ AddAddressFragment a;

    public /* synthetic */ u4_0(AddAddressFragment addAddressFragment) {
        this.a = addAddressFragment;
    }

    public final void onChanged(Object object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        object = (DataCallback)object;
        String string2 = "Address created";
        AddAddressFragment addAddressFragment = this.a;
        Intrinsics.checkNotNullParameter(addAddressFragment, "this$0");
        Object object3 = cp_1.Companion;
        int n7 = nn_2.b(object3, (DataCallback)object);
        if (n7 != 0) {
            object3 = addAddressFragment.v;
            if (object3 != null) {
                ((AjioLoaderView)((Object)object3)).stopLoader();
            }
            Intrinsics.checkNotNull(object);
            n7 = ((DataCallback)object).getStatus();
            String string3 = "format(...)";
            if (n7 == 0) {
                Object object4;
                object3 = new Bundle();
                Object[] objectArray = "pincode";
                Object object5 = addAddressFragment.z;
                Intrinsics.checkNotNull(object5);
                object5 = ((h5_0)object5).q;
                object5 = ((QueryAddress)object5).getPostCode();
                object3.putString((String)objectArray, (String)object5);
                objectArray = "city";
                object5 = addAddressFragment.z;
                Intrinsics.checkNotNull(object5);
                object5 = ((h5_0)object5).q;
                object5 = ((QueryAddress)object5).getCity();
                object3.putString((String)objectArray, (String)object5);
                objectArray = "state";
                object5 = addAddressFragment.z;
                Intrinsics.checkNotNull(object5);
                object5 = ((h5_0)object5).q;
                object5 = ((QueryAddress)object5).getState();
                object3.putString((String)objectArray, (String)object5);
                objectArray = FirebaseEvents.Companion;
                objectArray = objectArray.getInstance();
                object5 = "add_address";
                objectArray.sendEvent((String)object5, (Bundle)object3);
                object3 = StringCompanionObject.INSTANCE;
                n7 = R$string.acc_alert_message;
                object3 = hv3_0.K(n7);
                objectArray = new Object[n4];
                objectArray[0] = string2;
                object2 = Arrays.copyOf(objectArray, n4);
                object2 = String.format((String)object3, object2);
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                try {
                    addAddressFragment.showNotification(string2, (String)object2);
                }
                catch (NullPointerException nullPointerException) {
                    object4 = yn3_0.a;
                    ((yn3$a)object4).e(nullPointerException);
                }
                object2 = addAddressFragment.u;
                if (object2 != null) {
                    Intrinsics.checkNotNull(object2);
                    n3 = object2.isFinishing();
                    if (n3 == 0) {
                        object2 = new Intent();
                        n4 = (int)(addAddressFragment.w ? 1 : 0);
                        if (n4 != 0 && (object4 = ((DataCallback)object).getData()) != null) {
                            object = (Serializable)((DataCallback)object).getData();
                            object4 = "Address";
                            object2.putExtra((String)object4, (Serializable)object);
                        }
                        object = addAddressFragment.u;
                        Intrinsics.checkNotNull(object);
                        n4 = -1;
                        object.setResult(n4, (Intent)object2);
                        object = addAddressFragment.u;
                        Intrinsics.checkNotNull(object);
                        object.finish();
                    }
                }
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n4) {
                    object = StringCompanionObject.INSTANCE;
                    n8 = R$string.acc_error_message;
                    object = hv3_0.K(n8);
                    int n10 = R$string.address_cannot_be_created;
                    string2 = hv3_0.K(n10);
                    object3 = new Object[n4];
                    object3[0] = string2;
                    object = xh2_0.a((Object[])object3, n4, (String)object, string3);
                    n3 = R$string.address_cannot_be_created;
                    object2 = hv3_0.K(n3);
                    addAddressFragment.showNotification((String)object2, (String)object);
                }
            }
        }
    }
}

