/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Product.RecentlyViewedProducts;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sp2
 */
public final class sp2_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sp2_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2;
                Object object3 = object;
                object3 = (dl2_2)object;
                Object object4 = object2 = this.b;
                object4 = (String)object2;
                Intrinsics.checkNotNullParameter(object4, "$requestID");
                Intrinsics.checkNotNullParameter(object3, "response");
                object = (RecentlyViewedProducts)((dl2_2)object3).b;
                object2 = ((dl2_2)object3).a;
                n3 = (int)(((cl2_2)object2).d() ? 1 : 0);
                if (n3 != 0 && object != null) {
                    object2 = DataCallback.Companion;
                    object = ((DataCallback$Companion)object2).onSuccess(object);
                } else {
                    ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                    int n4 = 24;
                    object = ApiErrorRepo.handleApiError$default(apiErrorRepo, (dl2_2)object3, (String)object4, false, null, null, n4, null);
                }
                return object;
            }
            case 0: 
        }
        Object object5 = object;
        object5 = (Throwable)object;
        Object object6 = (op2_2)this.b;
        Intrinsics.checkNotNullParameter(object6, "this$0");
        object = ((op2_2)object6).m;
        object6 = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object5);
        object6 = ((ApiErrorRepo)object6).handleApiException((Throwable)object5, "PAYMENT_TransactionStatus", true, "single page checkout", "Forward");
        ((LiveData)object).k(object6);
        return Unit.a;
    }
}

