/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.feedModel.FeedEngineData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PJ0
 */
public final class pj0_0
implements Function1 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ f23_0 c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ FeedEngineData e;
    public final /* synthetic */ ft1_2 f;
    public final /* synthetic */ i90_0 g;
    public final /* synthetic */ ib3_0 h;
    public final /* synthetic */ yT1 i;
    public final /* synthetic */ yp0_0 j;

    public /* synthetic */ pj0_0(p83_0 p83_02, Activity activity, f23_0 f23_02, dr0_0 dr0_02, FeedEngineData feedEngineData, ft1_2 ft1_22, c80 c802, ib3_0 ib3_02, yT1 yT12, yp0_0 yp0_02) {
        this.a = p83_02;
        this.b = activity;
        this.c = f23_02;
        this.d = dr0_02;
        this.e = feedEngineData;
        this.f = ft1_22;
        this.g = c802;
        this.h = ib3_02;
        this.i = yT12;
        this.j = yp0_02;
    }

    public final Object invoke(Object object) {
        i90_0 i90_02;
        Activity activity;
        int n3;
        fx0_2 fx0_22 = this;
        Object object2 = object;
        object2 = (dt1_0)object;
        f23_0 f23_02 = this.c;
        Intrinsics.checkNotNullParameter(f23_02, "$sharedFleekVM");
        dr0_0 dr0_02 = this.d;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        ft1_2 ft1_22 = this.f;
        Intrinsics.checkNotNullParameter(ft1_22, "$listState");
        Object object3 = this.g;
        Intrinsics.checkNotNullParameter(object3, "$scope");
        ib3_0 ib3_02 = this.h;
        Intrinsics.checkNotNullParameter(ib3_02, "$seenIndexList");
        yT1 yT12 = this.i;
        Intrinsics.checkNotNullParameter(yT12, "$fleekAppNavigationController");
        yp0_0 yp0_02 = this.j;
        Intrinsics.checkNotNullParameter(yp0_02, "$fleekBrandPageGAEventsUtil");
        Intrinsics.checkNotNullParameter(object2, "$this$LazyColumn");
        p83_0 p83_02 = this.a;
        if (p83_02 != null) {
            int n4;
            n3 = n4 = p83_02.size();
        } else {
            boolean bl2 = false;
            activity = null;
            n3 = 0;
        }
        qj0_1 qj0_12 = new qj0_1(0);
        rj0_1 rj0_12 = new rj0_1(p83_02, 0);
        FeedEngineData feedEngineData = fx0_22.e;
        i90_0 i90_03 = object3;
        i90_03 = (c80)object3;
        activity = fx0_22.b;
        object3 = i90_02;
        fx0_22 = i90_02;
        i90_02 = i90_03;
        ((fk0_1)object3)(p83_02, activity, f23_02, dr0_02, feedEngineData, ft1_22, (c80)i90_03, ib3_02, yT12, yp0_02);
        object3 = new u10(1827732514, fx0_22, true);
        object2.a(n3, qj0_12, rj0_12, (u10)object3);
        return Unit.a;
    }
}

