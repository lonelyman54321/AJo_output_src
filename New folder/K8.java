/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class K8
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ K8(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object4 = object;
                object4 = (Throwable)object;
                object2 = (e12_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((e12_0)object2).S0;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                object2 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object4, "BackGround_CartWishListCount", false, null, null, 24, null);
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 0: 
        }
        object = (Boolean)object;
        object.getClass();
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        ((q9_0)object2).D0 = object;
        object = ((q9_0)object2).E0;
        if (object != null) {
            cp_1.Companion.getClass();
            object3 = cp$a.e();
            object3.getClass();
            boolean bl2 = cp_1.I((BaseResponse)object);
            if (bl2) {
                ((q9_0)object2).jb((BaseResponse)object);
            }
        }
        return Unit.a;
    }
}

