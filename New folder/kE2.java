/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.ratings.ReviewsResponse;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class kE2
implements Function1 {
    public final Object invoke(Object object) {
        Object object2 = object;
        object2 = (dl2_2)object;
        Intrinsics.checkNotNullParameter(object2, "reviewsResponse");
        object = (ReviewsResponse)((dl2_2)object2).b;
        Object object3 = ((dl2_2)object2).a;
        boolean bl2 = ((cl2_2)object3).d();
        if (bl2 && object != null) {
            object3 = DataCallback.Companion;
            object = ((DataCallback$Companion)object3).onSuccess(object);
        } else {
            object3 = ApiErrorRepo.INSTANCE;
            String string2 = "";
            String string3 = "Forward";
            String string4 = "submitProductReview";
            boolean bl3 = true;
            object = ((ApiErrorRepo)object3).handleApiError((dl2_2)object2, string4, bl3, string2, string3);
        }
        return object;
    }
}

