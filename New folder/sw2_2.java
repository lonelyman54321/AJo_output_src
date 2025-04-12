/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Order.ImageUploadResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Sw2
 */
public final class sw2_2
implements Function1 {
    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (dl2_2)object;
        Intrinsics.checkNotNullParameter(object2, "response");
        object = (ImageUploadResponse)((dl2_2)object2).b;
        Object object3 = ((dl2_2)object2).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object != null) {
            object3 = DataCallback.Companion;
            object = ((DataCallback$Companion)object3).onSuccess(object);
        } else {
            object3 = ApiErrorRepo.INSTANCE;
            int n3 = 24;
            String string2 = "RETURN_UPLOAD_IMAGE";
            boolean bl3 = true;
            object = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object3, (dl2_2)object2, string2, bl3, null, null, n3, null);
        }
        return object;
    }
}

