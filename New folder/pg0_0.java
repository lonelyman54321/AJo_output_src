/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.explore_brands.ExploreBrandsPageModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PG0
 */
public final class pg0_0
implements Function1 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ ExploreBrandsPageModel b;
    public final /* synthetic */ ft1_2 c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ Activity e;
    public final /* synthetic */ yT1 f;

    public /* synthetic */ pg0_0(p83_0 p83_02, ExploreBrandsPageModel exploreBrandsPageModel, ft1_2 ft1_22, dr0_0 dr0_02, Activity activity, yT1 yT12) {
        this.a = p83_02;
        this.b = exploreBrandsPageModel;
        this.c = ft1_22;
        this.d = dr0_02;
        this.e = activity;
        this.f = yT12;
    }

    public final Object invoke(Object object) {
        ch0_1 ch0_12;
        int n3;
        object = (dt1_0)object;
        ft1_2 ft1_22 = this.c;
        Intrinsics.checkNotNullParameter(ft1_22, "$listStateColumn");
        dr0_0 dr0_02 = this.d;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        yT1 yT12 = this.f;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        hx0_2 hx0_22 = q10_0.a;
        int n4 = 3;
        ExploreBrandsPageModel exploreBrandsPageModel = null;
        bt1.a((dt1_0)object, null, hx0_22, n4);
        p83_0 p83_02 = this.a;
        if (p83_02 != null) {
            int n7;
            n3 = n7 = p83_02.size();
        } else {
            boolean bl2 = false;
            hx0_22 = null;
            n3 = 0;
        }
        ss_2 ss_22 = new ss_2(p83_02, 1);
        exploreBrandsPageModel = this.b;
        Activity activity = this.e;
        hx0_22 = ch0_12;
        ch0_12 = new ch0_1(p83_02, exploreBrandsPageModel, ft1_22, dr0_02, activity, yT12);
        hx0_22 = new u10(43165482, ch0_12, true);
        bt1.b((dt1_0)object, n3, ss_22, hx0_22, 4);
        return Unit.a;
    }
}

