/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zd3
 */
public final class zd3_2
implements Function1 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ft1_2 d;
    public final /* synthetic */ Function2 e;
    public final /* synthetic */ Activity f;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;

    public /* synthetic */ zd3_2(int n3, dr0_0 dr0_02, ft1_2 ft1_22, p83_0 p83_02, Activity activity, String string2, Function2 function2, boolean bl2) {
        this.a = p83_02;
        this.b = dr0_02;
        this.c = bl2;
        this.d = ft1_22;
        this.e = function2;
        this.f = activity;
        this.g = n3;
        this.h = string2;
    }

    public final Object invoke(Object object) {
        bd3_1 bd3_12;
        object = (dt1_0)object;
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$lazyRowState");
        Function2 function2 = this.e;
        Intrinsics.checkNotNullParameter(function2, "$sendImpression");
        Activity activity = this.f;
        Intrinsics.checkNotNullParameter(activity, "$activity");
        String string2 = this.h;
        Intrinsics.checkNotNullParameter(string2, "$key");
        Intrinsics.checkNotNullParameter(object, "$this$LazyRow");
        p83_0 p83_02 = this.a;
        int n3 = p83_02.size();
        boolean bl2 = this.c;
        int n4 = this.g;
        Object object3 = bd3_12;
        bd3_12 = new bd3_1(n4, dr0_02, (ft1_2)object2, p83_02, activity, string2, function2, bl2);
        boolean bl3 = true;
        object3 = new u10(1001046425, bd3_12, bl3);
        bt1.b((dt1_0)object, n3, null, (u10)object3, 6);
        object3 = dr0_02.D();
        cd3_1 cd3_12 = new cd3_1(dr0_02);
        object2 = new u10(2046610192, cd3_12, bl3);
        bt1.a((dt1_0)object, (hv1_1)((Object)object3), (gx0_2)object2, 2);
        return Unit.a;
    }
}

