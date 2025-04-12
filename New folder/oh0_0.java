/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.explore_brands.Resource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from oH0
 */
public final class oh0_0
implements Function2 {
    public final /* synthetic */ dr0_0 a;

    public /* synthetic */ oh0_0(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Activity)object;
        object2 = (Resource)object2;
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Intrinsics.checkNotNullParameter(object, "mActivity");
        String string2 = "mProduct";
        Intrinsics.checkNotNullParameter(object2, string2);
        object2 = ((Resource)object2).getId();
        if (object2 == null) {
            object2 = "";
        }
        dr0_02.getClass();
        dr0_0.F((Activity)object, (String)object2);
        return Unit.a;
    }
}

