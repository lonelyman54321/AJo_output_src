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
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from v4
 */
public final class v4_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v4_0(Object object, int n3) {
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
                object2 = (w23_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((w23_0)object2).g;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                DataCallback dataCallback = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object4, "SharedWithMeProductList", false, null, null, 24, null);
                ((LiveData)object).k(dataCallback);
                return Unit.a;
            }
            case 1: {
                object = (DataCallback)object;
                object2 = (wx1_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((wx1_1)object2).N.k(object);
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
            Intrinsics.checkNotNull(object);
            n7 = ((DataCallback)object).getStatus();
            if (n7 == 0) {
                object = ((AddAddressFragment)object2).u;
                if (object != null) {
                    object = StringCompanionObject.INSTANCE;
                    int n8 = R$string.acc_alert_message;
                    object = hv3_0.K(n8);
                    object3 = hv3_0.K(R$string.address_updated);
                    Object[] objectArray = new Object[n3];
                    Object var7_8 = null;
                    objectArray[0] = object3;
                    object3 = "format(...)";
                    object = xh2_0.a(objectArray, n3, (String)object, (String)object3);
                    n3 = R$string.address_updated;
                    String string2 = hv3_0.K(n3);
                    ((AddAddressFragment)object2).showNotification(string2, (String)object);
                    object = new Intent();
                    string2 = ((AddAddressFragment)object2).u;
                    Intrinsics.checkNotNull(string2);
                    n7 = -1;
                    string2.setResult(n7, (Intent)object);
                    object = ((AddAddressFragment)object2).u;
                    Intrinsics.checkNotNull(object);
                    object.finish();
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

