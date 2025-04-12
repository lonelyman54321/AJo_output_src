/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import androidx.lifecycle.LiveData;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from w4
 */
public final class w4_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w4_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = 1;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n4 = this.a;
        switch (n4) {
            default: {
                Object object4 = object;
                object4 = (Throwable)object;
                object2 = (hy3_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((hy3_0)object2).l;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                DataCallback dataCallback = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object4, "UserProfile", false, null, null, 28, null);
                ((LiveData)object).k(dataCallback);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object2 = (AddAddressFragment)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object3, (DataCallback)object);
        if (n7 != 0) {
            object3 = ((AddAddressFragment)object2).v;
            if (object3 != null) {
                ((AjioLoaderView)((Object)object3)).stopLoader();
            }
            if ((n7 = ((DataCallback)object).getStatus()) == 0) {
                int n8;
                object3 = (CartDeliveryAddress)((DataCallback)object).getData();
                Object[] objectArray = ((AddAddressFragment)object2).X;
                objectArray.F((CartDeliveryAddress)object3);
                object = (CartDeliveryAddress)((DataCallback)object).getData();
                if (object != null) {
                    object = ((CartDeliveryAddress)object).getPostalCode();
                } else {
                    n8 = 0;
                    object = null;
                }
                objectArray.G((String)object);
                object = ((AddAddressFragment)object2).u;
                if (object != null) {
                    object = StringCompanionObject.INSTANCE;
                    n8 = R$string.acc_alert_message;
                    object = hv3_0.K(n8);
                    n7 = R$string.address_updated;
                    object3 = hv3_0.K(n7);
                    objectArray = new Object[n3];
                    Object var7_8 = null;
                    objectArray[0] = object3;
                    object3 = "format(...)";
                    object = xh2_0.a(objectArray, n3, (String)object, (String)object3);
                    n3 = R$string.address_updated;
                    String string2 = hv3_0.K(n3);
                    ((AddAddressFragment)object2).showNotification(string2, (String)object);
                    object = new Intent();
                    string2 = ((AddAddressFragment)object2).u;
                    if (string2 != null) {
                        n7 = -1;
                        string2.setResult(n7, (Intent)object);
                    }
                    if ((object = ((AddAddressFragment)object2).u) != null) {
                        object.finish();
                    }
                }
            } else {
                n7 = ((DataCallback)object).getStatus();
                if (n7 == n3) {
                    object = ((DataCallback)object).getError();
                    ((AddAddressFragment)object2).Va((DataError)object);
                }
            }
        }
        return Unit.a;
    }
}

