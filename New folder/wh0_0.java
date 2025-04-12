/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.explore_brands.Resource;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wH0
 */
public final class wh0_0
implements gx0_2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;

    public /* synthetic */ wh0_0(dr0_0 dr0_02, Activity activity) {
        this.a = activity;
        this.b = dr0_02;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Resource)object;
        int n3 = (Integer)object2;
        object3 = (String)object3;
        Object object4 = this.b;
        Intrinsics.checkNotNullParameter(object4, "$fleekViewModel");
        lh0_0 lh0_02 = new lh0_0((dr0_0)object4);
        object4 = this.a;
        ai0_2.r(lh0_02, object4, object);
        object4 = new StringBuilder("fleek_insert_explore_brand_product_");
        ((StringBuilder)object4).append((String)object3);
        object3 = ((StringBuilder)object4).toString();
        object4 = sq0_1.a;
        sq0_1.f(n3, (String)object3, (Resource)object);
        return Unit.a;
    }
}

