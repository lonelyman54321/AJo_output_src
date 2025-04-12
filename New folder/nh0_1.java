/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.reviewRatings.ProductReview;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nh0
 */
public final class nh0_1
implements Function1 {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ gx0_2 f;
    public final /* synthetic */ ProductReview g;

    public /* synthetic */ nh0_1(List list, List list2, int n3, Boolean bl2, Function0 function0, gx0_2 gx0_22, ProductReview productReview) {
        this.a = list;
        this.b = list2;
        this.c = n3;
        this.d = bl2;
        this.e = function0;
        this.f = gx0_22;
        this.g = productReview;
    }

    public final Object invoke(Object object) {
        sh0$a sh0$a;
        int n3;
        object = (dt1_0)object;
        gx0_2 gx0_22 = this.f;
        Intrinsics.checkNotNullParameter(gx0_22, "$imgClicked");
        Object object2 = "$this$LazyRow";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        List list = this.a;
        if (list != null) {
            int n4;
            n3 = n4 = list.size();
        } else {
            boolean bl2 = false;
            object2 = null;
            n3 = 0;
        }
        Function0 function0 = this.e;
        ProductReview productReview = this.g;
        List list2 = this.b;
        int n7 = this.c;
        Boolean bl3 = this.d;
        object2 = sh0$a;
        sh0$a = new sh0$a(list, list2, n7, bl3, function0, gx0_22, productReview);
        object2 = new u10(1428956173, sh0$a, true);
        bt1.b((dt1_0)object, n3, null, (u10)object2, 6);
        return Unit.a;
    }
}

