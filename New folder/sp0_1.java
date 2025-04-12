/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.Product;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SP0
 */
public final class sp0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sp0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n4 = this.a;
        switch (n4) {
            default: {
                Object object4 = object;
                object4 = (Throwable)object;
                object2 = (N71)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((N71)object2).b;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                object2 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object4, "unratedItemRatingsReviews", false, null, null, 28, null);
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        object2 = (fq0_2)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = ((fq0_2)object2).i;
        if (object3 != null) {
            object3.stopLoader();
        }
        if ((n3 = nn_2.b((cp$a)(object3 = cp_1.Companion), (DataCallback)object)) != 0) {
            kx3_0.a = n3 = 1;
            n4 = ((DataCallback)object).getStatus();
            Object object5 = null;
            if (n4 == 0) {
                int n7;
                object = ((fq0_2)object2).w;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("wishlistActionSuccessFunction");
                    n7 = 0;
                    object = null;
                }
                object.invoke();
                n7 = 4;
                rw_1.a(n7, null);
                object = ((fq0_2)object2).q;
                object3 = "fleekViewModel";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n7 = 0;
                    object = null;
                }
                object = ((dr0_0)object).A0;
                object2 = ((fq0_2)object2).q;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                } else {
                    object5 = object2;
                }
                object2 = ((dr0_0)object5).A0.c;
                object3 = "plp screen";
                ((BH3)object).d((Product)object2, (String)object3);
            } else {
                int n8 = ((DataCallback)object).getStatus();
                if (n8 == n3) {
                    object = ((fq0_2)object2).x;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("wishlistActionFailureFunction");
                        n8 = 0;
                        object = null;
                    }
                    object.invoke();
                    n8 = 5;
                    rw_1.a(n8, null);
                }
            }
        }
        return Unit.a;
    }
}

