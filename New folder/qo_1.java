/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Cart.CartCount;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QO
 */
public final class qo_1
implements Function1 {
    public final /* synthetic */ so_1 a;

    public /* synthetic */ qo_1(so_1 so_12) {
        this.a = so_12;
    }

    public final Object invoke(Object object) {
        cl2_2 cl2_22;
        boolean bl2;
        Object object2 = object;
        object2 = (dl2_2)object;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string2 = "BackGround_CartWishListCount";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "response");
        Object object3 = (CartCount)((dl2_2)object2).b;
        if (object3 != null && (bl2 = (cl2_22 = ((dl2_2)object2).a).d())) {
            object2 = ((so_1)object).b;
            int n3 = ((CartCount)object3).getCartCount();
            ((jo_2)object2).p(n3);
            float f5 = ((CartCount)object3).getCartAmount();
            ((so_1)object).b.o(f5);
            object = DataCallback.Companion.onSuccess(object3);
        } else {
            object3 = ApiErrorRepo.INSTANCE;
            bl2 = false;
            cl2_22 = null;
            int n4 = 28;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object3, (dl2_2)object2, string2, false, null, null, n4, null);
        }
        return object;
    }
}

