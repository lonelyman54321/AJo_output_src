/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from l8
 */
public final class l8_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object4 = object;
                object4 = (Throwable)object;
                object3 = (ZC2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object = ((ZC2)object3).g;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object4);
                object2 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object4, "BackGround_RecentlyViewedProductList", false, null, null, 24, null);
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 2: {
                object = (DataCallback)object;
                object3 = (op2_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                ((op2_2)object3).g.k(object);
                return Unit.a;
            }
            case 1: {
                object = (Ns2$a)object;
                object3 = (Ns2)object3;
                Ns2$a.f((Ns2$a)object, (Ns2)object3, 0, 0);
                return Unit.a;
            }
            case 0: 
        }
        ((Boolean)object).getClass();
        object = q9_0.Companion;
        object3 = (q9_0)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        object = h40_0.a;
        boolean bl2 = h40_0.k1();
        if (bl2) {
            object = z40_0.Companion;
            object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
            object2 = "mandatory_on_start_permissions";
            bl2 = ((ao0_0)object).a((String)object2);
            if (bl2) {
                ((q9_0)object3).pb();
            }
        }
        return Unit.a;
    }
}

