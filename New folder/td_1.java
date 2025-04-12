/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from td
 */
public final class td_1
implements Function1 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ yT1 c;
    public final /* synthetic */ Activity d;

    public /* synthetic */ td_1(p83_0 p83_02, dr0_0 dr0_02, yT1 yT12, Activity activity) {
        this.a = p83_02;
        this.b = dr0_02;
        this.c = yT12;
        this.d = activity;
    }

    public final Object invoke(Object object) {
        object = (dt1_0)object;
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$fleekViewModel");
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$fleekAppNavigationController");
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        p83_0 p83_02 = this.a;
        int n3 = p83_02.size();
        Activity activity = this.d;
        ad_0 ad_02 = new ad_0(p83_02, (dr0_0)object2, (yT1)object3, activity);
        boolean bl2 = true;
        object3 = new u10(-1672895947, ad_02, bl2);
        int n4 = 6;
        ad_02 = null;
        bt1.b((dt1_0)object, n3, null, (u10)object3, n4);
        object2 = (hv1_1)((Object)object2.k.getValue());
        object3 = hv1_1.PAGINATING;
        if (object2 == object3) {
            object2 = y10.a;
            int n7 = 3;
            bt1.a((dt1_0)object, null, (gx0_2)object2, n7);
        }
        return Unit.a;
    }
}

