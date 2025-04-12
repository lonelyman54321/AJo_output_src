/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.res.Configuration
 */
import android.app.Activity;
import android.content.res.Configuration;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from YB
 */
public final class yb_0
implements Function1 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ ft1_2 d;
    public final /* synthetic */ dr0_0 e;
    public final /* synthetic */ p83_0 f;
    public final /* synthetic */ f23_0 g;
    public final /* synthetic */ Ref$ObjectRef h;
    public final /* synthetic */ Activity i;
    public final /* synthetic */ i90_0 j;
    public final /* synthetic */ yp0_0 k;
    public final /* synthetic */ yT1 l;
    public final /* synthetic */ String m;
    public final /* synthetic */ String n;
    public final /* synthetic */ String o;
    public final /* synthetic */ Configuration p;
    public final /* synthetic */ Component q;
    public final /* synthetic */ boolean r;

    public /* synthetic */ yb_0(p83_0 p83_02, p83_0 p83_03, Ref$ObjectRef ref$ObjectRef, ft1_2 ft1_22, dr0_0 dr0_02, p83_0 p83_04, f23_0 f23_02, Ref$ObjectRef ref$ObjectRef2, Activity activity, c80 c802, yp0_0 yp0_02, yT1 yT12, String string2, String string3, String string4, Configuration configuration, Component component, boolean bl2) {
        this.a = p83_02;
        this.b = p83_03;
        this.c = ref$ObjectRef;
        this.d = ft1_22;
        this.e = dr0_02;
        this.f = p83_04;
        this.g = f23_02;
        this.h = ref$ObjectRef2;
        this.i = activity;
        this.j = c802;
        this.k = yp0_02;
        this.l = yT12;
        this.m = string2;
        this.n = string3;
        this.o = string4;
        this.p = configuration;
        this.q = component;
        this.r = bl2;
    }

    public final Object invoke(Object object) {
        int n3;
        Object object2;
        Object object3;
        int n4;
        int n7;
        Object object4 = this;
        Object object5 = object;
        object5 = (dt1_0)object;
        Ref$ObjectRef ref$ObjectRef = this.c;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$brandResource");
        Object object6 = this.d;
        Intrinsics.checkNotNullParameter(object6, "$lazyListState");
        Object object7 = this.e;
        Intrinsics.checkNotNullParameter(object7, "$fleekViewModel");
        Object object8 = this.g;
        Intrinsics.checkNotNullParameter(object8, "$sharedFleekViewModel");
        Object object9 = this.h;
        Intrinsics.checkNotNullParameter(object9, "$brandsPageData");
        Object object10 = this.j;
        Intrinsics.checkNotNullParameter(object10, "$coroutineScope");
        Object object11 = this.k;
        Intrinsics.checkNotNullParameter(object11, "$fleekBrandPageGAEventsUtil");
        Object object12 = this.l;
        Intrinsics.checkNotNullParameter(object12, "$fleekAppNavigationController");
        Object object13 = this.p;
        Intrinsics.checkNotNullParameter(object13, "$configuration");
        Object object14 = "$this$LazyColumn";
        Intrinsics.checkNotNullParameter(object5, (String)object14);
        Object object15 = this.a;
        int n8 = 0;
        if (object15 != null) {
            n4 = n7 = ((p83_0)object15).size();
        } else {
            n4 = 0;
            object3 = null;
        }
        Object object16 = object10;
        object16 = (c80)object10;
        Object object17 = ((yb_0)object4).f;
        object14 = ((yb_0)object4).i;
        object10 = ((yb_0)object4).m;
        object = object5;
        String string2 = ((yb_0)object4).n;
        object5 = ((yb_0)object4).o;
        Object object18 = object10;
        object10 = object2;
        String string3 = object14;
        object14 = object15;
        Object object19 = object17;
        object17 = object6;
        object4 = object2;
        object2 = object7;
        object3 = object19;
        p83_0 p83_02 = object15;
        object15 = object9;
        Object object20 = object13;
        object13 = string3;
        yT1 yT12 = object12;
        object12 = object16;
        yp0_0 yp0_02 = object11;
        Ref$ObjectRef ref$ObjectRef2 = object9;
        object9 = yT12;
        dr0_0 dr0_02 = object7;
        object7 = object18;
        ft1_2 ft1_22 = object6;
        object6 = string2;
        object19 = object5;
        ((dc_0)object10)((p83_0)object14, ref$ObjectRef, (ft1_2)object17, (dr0_0)object2, (p83_0)object3, (f23_0)object8, (Ref$ObjectRef)object15, (Activity)string3, (c80)object16, (yp0_0)object11, yT12, (String)object18, string2, (String)object5, (Configuration)object20);
        boolean bl2 = true;
        object10 = new u10(186975984, object4, bl2);
        object4 = null;
        n7 = 6;
        object6 = object;
        bt1.b((dt1_0)object, n4, null, (u10)object10, n7);
        object10 = this;
        object2 = this.b;
        if (object2 != null) {
            n3 = n8 = ((p83_0)object2).size();
        } else {
            n3 = 0;
            object7 = null;
        }
        object11 = ((yb_0)object10).q;
        boolean bl3 = ((yb_0)object10).r;
        object17 = object9;
        object3 = dr0_02;
        object8 = p83_02;
        object15 = ft1_22;
        object13 = string3;
        object12 = object16;
        object20 = object11;
        object11 = ref$ObjectRef2;
        object4 = object9;
        object9 = object20;
        object7 = yp0_02;
        object19 = object18;
        object20 = string2;
        object16 = object5;
        ((id_0)object17)((p83_0)object2, dr0_02, p83_02, ft1_22, (Activity)string3, (c80)object12, ref$ObjectRef2, (Component)object9, yp0_02, bl3, (String)object18, string2, yT12, (String)object5);
        object5 = new u10(-883693849, object17, bl2);
        object4 = object6;
        bt1.b((dt1_0)object6, n3, null, (u10)object5, n7);
        return Unit.a;
    }
}

