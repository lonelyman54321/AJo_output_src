/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.ratings.UserReviewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AA2
 */
public final class aa2_1
implements Function2 {
    public final /* synthetic */ UserReviewModel a;
    public final /* synthetic */ int b;

    public /* synthetic */ aa2_1(UserReviewModel userReviewModel, int n3) {
        this.a = userReviewModel;
        this.b = n3;
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Integer)object2).intValue();
        UserReviewModel userReviewModel = this.a;
        Intrinsics.checkNotNullParameter(userReviewModel, "$userReviewModel");
        int n3 = Me3.b(this.b | 1);
        ba2_1.a(userReviewModel, (b30_0)object, n3);
        return Unit.a;
    }
}

