/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from DJ0
 */
public final class dj0_2
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ dj0_2(int n3) {
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
                apiErrorRepo.handleApiException((Throwable)object2, "BackGround_RTB_Request", false, "bag screen", "Forward");
                object = yn3_0.a;
                Object[] objectArray = new Object[]{};
                ((yn3$a)object).d("api rtb event failure", objectArray);
                return Unit.a;
            }
            case 0: 
        }
        object = (dt1_0)object;
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        u10 u102 = r10_0.a;
        bt1.b((dt1_0)object, 5, null, u102, 6);
        return Unit.a;
    }
}

