/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wD
 */
public final class wd_1
implements Function1 {
    public final /* synthetic */ List a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ ft1_2 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Activity g;
    public final /* synthetic */ int h;
    public final /* synthetic */ String i;
    public final /* synthetic */ p83_0 j;
    public final /* synthetic */ Function2 k;

    public /* synthetic */ wd_1(float f5, float f6, int n3, uj0_2 uj0_22, xj0_0 xj0_02, dr0_0 dr0_02, ft1_2 ft1_22, p83_0 p83_02, Activity activity, ArrayList arrayList) {
        this.a = arrayList;
        this.b = dr0_02;
        this.c = f5;
        this.d = uj0_22;
        this.e = ft1_22;
        this.f = f6;
        this.g = activity;
        this.h = n3;
        this.i = "BRAND_THUMBNAIL";
        this.j = p83_02;
        this.k = xj0_02;
    }

    public final Object invoke(Object object) {
        DD dD;
        int n3;
        int n4;
        fx0_2 fx0_22 = this;
        Object object2 = object;
        object2 = (dt1_0)object;
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object3 = this.d;
        Intrinsics.checkNotNullParameter(object3, "$onItemClick");
        ft1_2 ft1_22 = this.e;
        Intrinsics.checkNotNullParameter(ft1_22, "$lazyRowState");
        Activity activity = this.g;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this.i, "$key");
        fx0_2 fx0_23 = this.k;
        Intrinsics.checkNotNullParameter(fx0_23, "$sendImpression");
        Intrinsics.checkNotNullParameter(object2, "$this$LazyRow");
        List list = this.a;
        if (list != null) {
            n3 = n4 = list.size();
        } else {
            n4 = 0;
            n3 = 0;
        }
        Function1 function1 = object3;
        function1 = (uj0_2)object3;
        List list2 = list;
        list2 = (ArrayList)list;
        Function2 function2 = fx0_23;
        function2 = (xj0_0)fx0_23;
        float f5 = fx0_22.c;
        float f6 = fx0_22.f;
        n4 = fx0_22.h;
        list = fx0_22.j;
        object3 = dD;
        dD = new DD(f5, f6, n4, (uj0_2)function1, (xj0_0)function2, dr0_02, ft1_22, (p83_0)list, activity, (ArrayList)list2);
        boolean bl2 = true;
        object3 = new u10(-2000637522, dD, bl2);
        bt1.b((dt1_0)object2, n3, null, (u10)object3, 6);
        object3 = dr0_02.D();
        fx0_23 = new FD(dr0_02, f5, f6);
        fx0_22 = new u10(-1332179931, fx0_23, bl2);
        bt1.a((dt1_0)object2, (hv1_1)((Object)object3), (gx0_2)fx0_22, 2);
        return Unit.a;
    }
}

