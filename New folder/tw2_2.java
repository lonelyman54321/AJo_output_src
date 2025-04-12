/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tw2
 */
public final class tw2_2
implements bx0_2 {
    public final Object apply(Object object) {
        Object object2 = object;
        object2 = (Throwable)object;
        Intrinsics.checkNotNullParameter(object2, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, (Throwable)object2, "RETURN_UPLOAD_IMAGE", true, null, null, 24, null);
    }
}

