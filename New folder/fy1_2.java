/*
 * Decompiled with CFR 0.152.
 */
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fY1
 */
public final class fy1_2
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fy1_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                Object object3 = (v33)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((v33)object3).e;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                object3 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object2, "CartCheckout", false, null, null, 28, null);
                ((LiveData)object).k(object3);
                return Unit.a;
            }
            case 0: 
        }
        ((Boolean)object).booleanValue();
        oy1_1 oy1_12 = (oy1_1)this.b;
        Intrinsics.checkNotNullParameter(oy1_12, "this$0");
        object = oy1_12.getActivity();
        if (object != null) {
            ((ComponentActivity)object).onBackPressed();
        }
        return Unit.a;
    }
}

