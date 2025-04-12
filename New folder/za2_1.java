/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.ratings.UserReviewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zA2
 */
public final class za2_1
implements Function1 {
    public final /* synthetic */ List a;
    public final /* synthetic */ UserReviewModel b;
    public final /* synthetic */ i90_0 c;
    public final /* synthetic */ tr1_0 d;
    public final /* synthetic */ tr1_0 e;

    public /* synthetic */ za2_1(ArrayList arrayList, UserReviewModel userReviewModel, c80 c802, tr1_0 tr1_02, tr1_0 tr1_03) {
        this.a = arrayList;
        this.b = userReviewModel;
        this.c = c802;
        this.d = tr1_02;
        this.e = tr1_03;
    }

    public final Object invoke(Object object) {
        object = (dt1_0)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$imageList");
        UserReviewModel userReviewModel = this.b;
        Intrinsics.checkNotNullParameter(userReviewModel, "$userReviewModel");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$coroutineScope");
        tr1_0 tr1_02 = this.d;
        Intrinsics.checkNotNullParameter(tr1_02, "$clickedIndex$delegate");
        tr1_0 tr1_03 = this.e;
        Intrinsics.checkNotNullParameter(tr1_03, "$showReviewImageBtnSheet$delegate");
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        int n3 = object2.size();
        List list = object2;
        list = (ArrayList)object2;
        BA2$c bA2$c = new BA2$c((ArrayList)list);
        i90_0 i90_02 = object3;
        i90_02 = (c80)object3;
        object2 = new BA2$d((ArrayList)list, userReviewModel, (c80)i90_02, tr1_02, tr1_03);
        object3 = new u10(-1091073711, object2, true);
        object.a(n3, null, bA2$c, (u10)object3);
        return Unit.a;
    }
}

