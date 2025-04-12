/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class pQ2
implements Function1 {
    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Object[] objectArray = ApiErrorRepo.INSTANCE;
        Intrinsics.checkNotNull(object2);
        ApiErrorRepo.handleApiException$default((ApiErrorRepo)objectArray, (Throwable)object2, "BackGround_RTB_Request", false, "plp screen", null, 16, null);
        object = yn3_0.a;
        objectArray = new Object[]{};
        ((yn3$a)object).d("api rtb event failure", objectArray);
        return Unit.a;
    }
}

