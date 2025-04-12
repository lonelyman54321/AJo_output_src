/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.dresstool.Question;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ug2
 */
public final class ug2_2
implements Function1 {
    public final /* synthetic */ Question a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ rp2_0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ LP1 e;
    public final /* synthetic */ LP1 f;

    public /* synthetic */ ug2_2(gv0_1 gv0_12, LP1 lP1, LP1 lP12, LP1 lP13, rp2_0 rp2_02, Question question) {
        this.a = question;
        this.b = lP1;
        this.c = rp2_02;
        this.d = gv0_12;
        this.e = lP12;
        this.f = lP13;
    }

    public final Object invoke(Object object) {
        zg2_2 zg2_22;
        int n3;
        object = (dt1_0)object;
        Question question = this.a;
        Intrinsics.checkNotNullParameter(question, "$question");
        LP1 lP1 = this.b;
        Intrinsics.checkNotNullParameter(lP1, "$cardModifier");
        rp2_0 rp2_02 = this.c;
        Intrinsics.checkNotNullParameter(rp2_02, "$cardShape");
        fx0_2 fx0_22 = this.d;
        Intrinsics.checkNotNullParameter(fx0_22, "$onItemClick");
        LP1 lP12 = this.e;
        Intrinsics.checkNotNullParameter(lP12, "$imgModifier");
        LP1 lP13 = this.f;
        Intrinsics.checkNotNullParameter(lP13, "$textModifier");
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        Object object2 = question.getStyles();
        if (object2 != null) {
            int n4;
            n3 = n4 = object2.size();
        } else {
            boolean bl2 = false;
            object2 = null;
            n3 = 0;
        }
        object2 = fx0_22;
        object2 = (gv0_1)fx0_22;
        fx0_22 = zg2_22;
        zg2_22 = new zg2_2((gv0_1)object2, lP1, lP12, lP13, rp2_02, question);
        fx0_22 = new u10(1526510212, zg2_22, true);
        bt1.b((dt1_0)object, n3, null, (u10)fx0_22, 6);
        return Unit.a;
    }
}

