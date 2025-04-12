/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sj0
 */
public final class sj0_1
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ sj0_1(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (Throwable)object;
                ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                Intrinsics.checkNotNull(object2);
                ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object2, "BackGround_RTB_Request", false, "order confirmation screen", null, 16, null);
                object = yn3_0.a;
                Object[] objectArray = new Object[]{};
                ((yn3$a)object).d("api rtb event failure", objectArray);
                return Unit.a;
            }
            case 0: 
        }
        object = (Dw2)object;
        Intrinsics.checkNotNullParameter(object, "$this$popUpTo");
        ((Dw2)object).b = true;
        return Unit.a;
    }
}

