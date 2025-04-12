/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bc
 */
public final class bc_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bc_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object3 = object;
                object3 = (Throwable)object;
                object2 = (h91)object2;
                Intrinsics.checkNotNullParameter(object2, "this$0");
                object = ((h91)object2).h;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object3);
                object2 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object3, "InitiateCouponBuyRequest", false, null, null, 28, null);
                ((LiveData)object).k(object2);
                return Unit.a;
            }
            case 0: 
        }
        object = (Throwable)object;
        Object object4 = object2;
        object4 = (zr1_1)object2;
        Intrinsics.checkNotNullParameter(object4, "$ajioWalletMLD");
        Intrinsics.checkNotNullParameter(object, "it");
        object2 = dc.a;
        Intrinsics.checkNotNullParameter(object, "throwable");
        String string2 = "AJIOCashBonus";
        Intrinsics.checkNotNullParameter(string2, "requestID");
        object2 = ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, (Throwable)object, string2, true, null, null, 24, null);
        ((LiveData)object4).i(object2);
        return g53_0.c((Throwable)object);
    }
}

