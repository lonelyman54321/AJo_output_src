/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.explore_brands.BrandItemData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yd
 */
public final class yd_1
implements Function1 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ BrandItemData c;
    public final /* synthetic */ p83_0 d;
    public final /* synthetic */ int e;

    public /* synthetic */ yd_1(Activity activity, dr0_0 dr0_02, BrandItemData brandItemData, p83_0 p83_02, int n3) {
        this.a = activity;
        this.b = dr0_02;
        this.c = brandItemData;
        this.d = p83_02;
        this.e = n3;
    }

    public final Object invoke(Object object) {
        boolean bl2 = (Boolean)object;
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        BrandItemData brandItemData = this.c;
        Object object2 = "$item";
        Intrinsics.checkNotNullParameter(brandItemData, (String)object2);
        Activity activity = this.a;
        if (activity != null) {
            zd_1 zd_12;
            p83_0 p83_02 = this.d;
            int n3 = this.e;
            object2 = zd_12;
            zd_12 = new zd_1(bl2, brandItemData, (dr0_0)object, p83_02, n3);
            object.getClass();
            dr0_0.c(activity, zd_12);
        }
        return Unit.a;
    }
}

