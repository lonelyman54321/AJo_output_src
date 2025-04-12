/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oM2
 */
public final class om2_1
implements Function1 {
    public final /* synthetic */ aM2$d a;
    public final /* synthetic */ LP1 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ rp2_0 d;

    public om2_1(aM2$d aM2$d, LP1 lP1, sz_1 sz_12, rp2_0 rp2_02) {
        this.a = aM2$d;
        this.b = lP1;
        this.c = sz_12;
        this.d = rp2_02;
    }

    public final Object invoke(Object object) {
        object = (dt1_0)object;
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        Object object2 = this.a;
        int n3 = ((aM2$d)object2).a.getRecommendedStyles().size();
        sz_1 sz_12 = (sz_1)this.c;
        LP1 lP1 = this.b;
        rp2_0 rp2_02 = this.d;
        nm2_0 nm2_02 = new nm2_0((aM2$d)object2, lP1, sz_12, rp2_02);
        object2 = new u10(757958950, nm2_02, true);
        bt1.b((dt1_0)object, n3, null, (u10)object2, 6);
        return Unit.a;
    }
}

