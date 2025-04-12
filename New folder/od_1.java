/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import com.ril.ajio.services.data.fleek.brand_page.Layout;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from oD
 */
public final class od_1
implements gx0_2 {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ i90_0 g;
    public final /* synthetic */ yp0_0 h;
    public final /* synthetic */ Activity i;
    public final /* synthetic */ yT1 j;
    public final /* synthetic */ String k;

    public od_1(Ref$ObjectRef ref$ObjectRef, p83_0 p83_02, dr0_0 dr0_02, String string2, String string3, String string4, c80 c802, yp0_0 yp0_02, Activity activity, yT1 yT12, String string5) {
        this.a = ref$ObjectRef;
        this.b = p83_02;
        this.c = dr0_02;
        this.d = string2;
        this.e = string3;
        this.f = string4;
        this.g = c802;
        this.h = yp0_02;
        this.i = activity;
        this.j = yT12;
        this.k = string5;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        jd_1 jd_12;
        od_1 od_12 = this;
        Object object4 = object;
        object4 = (kl_0)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        ((Number)object3).intValue();
        object6 = "$this$AnimatedVisibility";
        Intrinsics.checkNotNullParameter(object4, (String)object6);
        object4 = (BrandPageModel)this.a.element;
        object4 = object4 != null && (object4 = ((BrandPageModel)object4).getLayout()) != null ? ((Layout)object4).getSearchEnabled() : null;
        object6 = object4;
        String string2 = od_12.f;
        Object object7 = object4 = od_12.g;
        object7 = (c80)object4;
        dr0_0 dr0_02 = od_12.c;
        object4 = od_12.d;
        String string3 = od_12.e;
        yp0_0 yp0_02 = od_12.h;
        Object object8 = jd_12;
        jd_12 = new jd_1(dr0_02, (String)object4, string3, string2, (c80)object7, yp0_02);
        Activity activity = od_12.i;
        Object object9 = od_12.j;
        kd_1 kd_12 = new kd_1(activity, dr0_02, (yT1)object9);
        object8 = od_12.k;
        object9 = new ld_1(activity, dr0_02, (String)object8, (String)object4);
        p83_0 p83_02 = od_12.b;
        bb_0.a((Boolean)object6, p83_02, dr0_02, jd_12, kd_12, (ld_1)object9, (b30_0)object5, 512);
        return Unit.a;
    }
}

