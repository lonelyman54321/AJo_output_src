/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mo2
 */
public final class mo2_2
implements bx0_2 {
    public final Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        String string2 = "LP_BALANCE";
        Intrinsics.checkNotNullParameter(string2, "$requestID");
        Intrinsics.checkNotNullParameter(object2, "t");
        return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, string2, true, "single page checkout", "Forward");
    }
}

