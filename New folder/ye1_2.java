/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.services.data.Home.HomePageRatingResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yE1
 */
public final class ye1_2
implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ye1_2(int n3) {
        this.a = n3;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = object;
                object2 = (dl2_2)object;
                Intrinsics.checkNotNullParameter(object2, "walletResp");
                object = (HomePageRatingResponse)((dl2_2)object2).b;
                Object object3 = ((dl2_2)object2).a;
                n3 = (int)(((cl2_2)object3).d() ? 1 : 0);
                if (n3 != 0 && object != null) {
                    object3 = DataCallback.Companion;
                    object = ((DataCallback$Companion)object3).onSuccess(object);
                } else {
                    ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
                    String string2 = "";
                    String string3 = "Forward";
                    String string4 = "unratedItemRatingsReviews";
                    boolean bl2 = true;
                    object = apiErrorRepo.handleApiError((dl2_2)object2, string4, bl2, string2, string3);
                }
                return object;
            }
            case 0: 
        }
        object = (UY2)object;
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        RY2.d((UY2)object);
        return Unit.a;
    }
}

