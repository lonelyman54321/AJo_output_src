/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HY1
 */
public final class hy1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Hj b;

    public /* synthetic */ hy1_2(Hj hj, int n3) {
        this.a = n3;
        this.b = hj;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (hy3_0)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((hy3_0)object3).u;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object2, "MyAccountsCancelRequest", false, null, null, 28, null);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        object = (Throwable)object;
        ky1_0 ky1_02 = (ky1_0)this.b;
        Intrinsics.checkNotNullParameter(ky1_02, "this$0");
        zr1_1 zr1_12 = ky1_02.m;
        Intrinsics.checkNotNull(object);
        object = ky1_02.c.handleApiExceptionForWishList((Throwable)object, "ShowWishList");
        zr1_12.k(object);
        return Unit.a;
    }
}

