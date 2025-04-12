/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.user.GPSResponse;
import com.ril.ajio.services.data.user.LocationResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xM
 */
public final class xm_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xm_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        int n3;
        int n4 = this.a;
        switch (n4) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (v33)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((v33)object3).c;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object2, "ShippingEddCheck", false, null, null, 28, null);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object4 = (CartAddressListBottomSheet)this.b;
        Intrinsics.checkNotNullParameter(object4, "this$0");
        Object object5 = cp_1.Companion;
        int n7 = nn_2.b((cp$a)object5, (DataCallback)object);
        if (n7 == 0) return Unit.a;
        n7 = ((DataCallback)object).getStatus();
        Object object6 = null;
        if (n7 == 0) {
            object5 = (LocationResponse)((DataCallback)object).getData();
            if (object5 != null) {
                object5 = ((LocationResponse)object5).getData();
            } else {
                n7 = 0;
                object5 = null;
            }
            if (object5 != null) {
                AJIOApplication.Companion.getClass();
                Object object7 = AJIOApplication$a.a();
                object5 = new jo_2((Context)object7);
                object = (LocationResponse)((DataCallback)object).getData();
                object7 = "";
                if (object == null || (object = ((LocationResponse)object).getData()) == null || (object = ((GPSResponse)object).getPincodeGroup()) == null) {
                    object = object7;
                }
                ((jo_2)object5).z((String)object);
                boolean bl2 = ap_0.b();
                if (!bl2) {
                    ((CartAddressListBottomSheet)object4).Oa();
                    return Unit.a;
                }
                object = ((CartAddressListBottomSheet)object4).D;
                if (object == null) {
                    object = "cartViewModel";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object6 = object;
                }
                object = ((CartAddressListBottomSheet)object4).e;
                if (object == null || (object = ((CartDeliveryAddress)object).getId()) == null) {
                    object = object7;
                }
                ((wx1_1)object6).h((String)object7, (String)object);
                return Unit.a;
            }
        }
        if ((object = (LocationResponse)((DataCallback)object).getData()) != null) {
            object = ((LocationResponse)object).getData();
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) return Unit.a;
        n3 = R$string.ajio_something_went_wrong;
        object = ((Fragment)object4).getString(n3);
        object4 = "getString(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object4);
        n4 = 1;
        hv3_0.o0(n4, (String)object, null);
        return Unit.a;
    }
}

