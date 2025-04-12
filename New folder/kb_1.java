/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from KB
 */
public final class kb_1
implements Function1 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ BaseValue b;
    public final /* synthetic */ ScreenInfo c;
    public final /* synthetic */ int d;
    public final /* synthetic */ p83_0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ ft1_2 g;
    public final /* synthetic */ ft1_2 h;
    public final /* synthetic */ Function2 i;

    public /* synthetic */ kb_1(p83_0 p83_02, BaseValue baseValue, ScreenInfo screenInfo, int n3, p83_0 p83_03, int n4, ft1_2 ft1_22, ft1_2 ft1_23, qc_1 qc_12) {
        this.a = p83_02;
        this.b = baseValue;
        this.c = screenInfo;
        this.d = n3;
        this.e = p83_03;
        this.f = n4;
        this.g = ft1_22;
        this.h = ft1_23;
        this.i = qc_12;
    }

    public final Object invoke(Object object) {
        rd_1 rd_12;
        object = (dt1_0)object;
        p83_0 p83_02 = this.a;
        Intrinsics.checkNotNullParameter(p83_02, "$bannerDataList");
        BaseValue baseValue = this.b;
        Intrinsics.checkNotNullParameter(baseValue, "$baseValue");
        ScreenInfo screenInfo = this.c;
        Intrinsics.checkNotNullParameter(screenInfo, "$screenInfo");
        p83_0 p83_03 = this.e;
        Intrinsics.checkNotNullParameter(p83_03, "$components");
        ft1_2 ft1_22 = this.g;
        Intrinsics.checkNotNullParameter(ft1_22, "$lazyListState");
        ft1_2 ft1_23 = this.h;
        Intrinsics.checkNotNullParameter(ft1_23, "$lazyRowState");
        fx0_2 fx0_22 = this.i;
        Intrinsics.checkNotNullParameter(fx0_22, "$onBannerClick");
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        int n3 = p83_02.size();
        int n4 = this.f;
        Function2 function2 = fx0_22;
        function2 = (qc_1)fx0_22;
        int n7 = this.d;
        fx0_22 = rd_12;
        rd_12 = new rd_1(p83_02, baseValue, screenInfo, n7, p83_03, n4, ft1_22, ft1_23, (qc_1)function2);
        fx0_22 = new u10(3523940, rd_12, true);
        bt1.b((dt1_0)object, n3, null, (u10)fx0_22, 6);
        return Unit.a;
    }
}

