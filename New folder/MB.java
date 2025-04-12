/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class MB
implements Function2 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ p83_0 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ g71_0 f;
    public final /* synthetic */ int g;

    public /* synthetic */ MB(p83_0 p83_02, int n3, ft1_2 ft1_22, p83_0 p83_03, qc_1 qc_12, v9_0 v9_02, int n4) {
        this.a = p83_02;
        this.b = n3;
        this.c = ft1_22;
        this.d = p83_03;
        this.e = qc_12;
        this.f = v9_02;
        this.g = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        p83_0 p83_02 = this.a;
        Intrinsics.checkNotNullParameter(p83_02, "$components");
        ft1_2 ft1_22 = this.c;
        Intrinsics.checkNotNullParameter(ft1_22, "$lazyListState");
        p83_0 p83_03 = this.d;
        Intrinsics.checkNotNullParameter(p83_03, "$bannerDataList");
        object = this.e;
        Intrinsics.checkNotNullParameter(object, "$onBannerClick");
        int n3 = Me3.b(this.g | 1);
        Object object4 = object;
        object4 = (qc_1)object;
        Object object5 = object = this.f;
        object5 = (v9_0)object;
        int n4 = this.b;
        WB.c(p83_02, n4, ft1_22, p83_03, (qc_1)object4, (v9_0)object5, (b30_0)object3, n3);
        return Unit.a;
    }
}

