/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yW1
 */
public final class yw1_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yw1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (bv2_0)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((bv2_0)object3).h;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object2, "PLPSearchProducts", true, null, null, 24, null);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        object = (DataCallback)object;
        ex1_0 ex1_02 = (ex1_0)this.b;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        cp$a cp$a = cp_1.Companion;
        boolean bl2 = nn_2.b(cp$a, (DataCallback)object);
        if (bl2) {
            ex1_02.Xa();
            ex1_02.q0 = object = (ProductOptionVariant)((DataCallback)object).getData();
        }
        return Unit.a;
    }
}

