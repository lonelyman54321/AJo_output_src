/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

public final class pE2
implements bx0_2 {
    public final Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Intrinsics.checkNotNullParameter(object2, "throwable");
        object = yn3_0.a;
        String string2 = ((Throwable)object2).getLocalizedMessage();
        if (string2 == null) {
            string2 = "";
        }
        string2 = "error is :".concat(string2);
        Object[] objectArray = new Object[]{};
        ((yn3$a)object).f(string2, objectArray);
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, "submitUserRatingsReviews", true, "", "Forward");
    }
}

