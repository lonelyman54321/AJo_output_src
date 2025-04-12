/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oh0
 */
public final class oh0_1
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProductReview b;
    public final /* synthetic */ Boolean c;
    public final /* synthetic */ List d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ Function0 f;
    public final /* synthetic */ gx0_2 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ oh0_1(int n3, ProductReview productReview, Boolean bl2, List list, LP1 lP1, Function0 function0, gx0_2 gx0_22, int n4, int n7) {
        this.a = n3;
        this.b = productReview;
        this.c = bl2;
        this.d = list;
        this.e = lP1;
        this.f = function0;
        this.g = gx0_22;
        this.h = n4;
        this.i = n7;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).intValue();
        gx0_2 gx0_22 = this.g;
        Intrinsics.checkNotNullParameter(gx0_22, "$imgClicked");
        int n3 = Me3.b(this.h | 1);
        int n4 = this.a;
        ProductReview productReview = this.b;
        Boolean bl2 = this.c;
        List list = this.d;
        LP1 lP1 = this.e;
        Function0 function0 = this.f;
        int n7 = this.i;
        sh0_0.a(n4, productReview, bl2, list, lP1, function0, gx0_22, (b30_0)object3, n3, n7);
        return Unit.a;
    }
}

