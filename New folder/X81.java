/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class X81
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ X81(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (LP1)object;
                Intrinsics.checkNotNullParameter(object, "$this$conditional");
                rp2_0 rp2_02 = SP2.a;
                return QV.a((LP1)object, rp2_02);
            }
            case 0: 
        }
        Object object2 = object;
        object2 = (Throwable)object;
        Object[] objectArray = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object2);
        ApiErrorRepo.handleApiException$default((ApiErrorRepo)objectArray, (Throwable)object2, "BackGround_RTB_Request", false, "landing screen", null, 16, null);
        object = yn3_0.a;
        objectArray = new Object[]{};
        ((yn3$a)object).d("api rtb event failure", objectArray);
        return Unit.a;
    }
}

