/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.kmm.shared.model.home.transform.BannerData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ju3
 */
public final class ju3_0
implements Function2 {
    public final /* synthetic */ LP1 a;
    public final /* synthetic */ BannerData b;
    public final /* synthetic */ g71_0 c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ ju3_0(LP1 lP1, BannerData bannerData, g71_0 g71_02, Function1 function1, int n3, int n4) {
        this.a = lP1;
        this.b = bannerData;
        this.c = g71_02;
        this.d = function1;
        this.e = n3;
        this.f = n4;
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Integer)object2).getClass();
        BannerData bannerData = this.b;
        Intrinsics.checkNotNullParameter(bannerData, "$bannerBuilderData");
        Function1 function1 = this.d;
        Intrinsics.checkNotNullParameter(function1, "$onBannerClick");
        int n3 = Me3.b(this.f | 1);
        g71_0 g71_02 = this.c;
        int n4 = this.e;
        ov3.a(this.a, bannerData, g71_02, function1, n4, (b30_0)object3, n3);
        return Unit.a;
    }
}

