/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.ratings.UserReviewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from ZH2
 */
public final class zh2_1
implements Function2 {
    public final /* synthetic */ UserReviewModel a;

    public zh2_1(UserReviewModel userReviewModel) {
        this.a = userReviewModel;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 0xB;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.a;
            n3 = 8;
            ba2_1.a((UserReviewModel)object2, (b30_0)object, n3);
        }
        return Unit.a;
    }
}

