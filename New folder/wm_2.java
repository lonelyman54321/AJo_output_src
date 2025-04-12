/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.cart.address.CartAddressListBottomSheet;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wM
 */
public final class wm_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wm_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (hy3_0)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((hy3_0)object3).k;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object2, "request_otp_mobile_update", false, null, null, 28, null);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        Object object4 = (CartAddressListBottomSheet)this.b;
        Intrinsics.checkNotNullParameter(object4, "this$0");
        cp$a cp$a = cp_1.Companion;
        boolean bl2 = nn_2.b(cp$a, (DataCallback)object);
        if (bl2 && (object = ((CartAddressListBottomSheet)object4).e) != null && (object4 = ((CartAddressListBottomSheet)object4).u) != null) {
            Intrinsics.checkNotNull(object);
            object4.z8((CartDeliveryAddress)object);
        }
        return Unit.a;
    }
}

