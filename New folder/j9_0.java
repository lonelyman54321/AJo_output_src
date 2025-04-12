/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from J9
 */
public final class j9_0
implements bx0_2 {
    public final /* synthetic */ int a;

    public /* synthetic */ j9_0(int n3) {
        this.a = n3;
    }

    public final Object apply(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
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
                return ApiErrorRepo.INSTANCE.handleApiException((Throwable)object2, "submitProductReview", true, "", "Forward");
            }
            case 0: 
        }
        Object object3 = object;
        object3 = (Throwable)object;
        Intrinsics.checkNotNullParameter(object3, "throwable");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, (Throwable)object3, "CouponPromotionRequest", false, null, null, 28, null);
    }
}

