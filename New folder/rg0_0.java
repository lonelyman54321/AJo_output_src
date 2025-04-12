/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from RG0
 */
public final class rg0_0
implements Function1 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ dr0_0 b;

    public /* synthetic */ rg0_0(dr0_0 dr0_02, Activity activity) {
        this.a = activity;
        this.b = dr0_02;
    }

    public final Object invoke(Object object) {
        Object object2;
        Object object3;
        object = (Subcomponent)object;
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        String string2 = null;
        object3 = object != null && (object3 = ((Subcomponent)object).getResourceOwner()) != null ? ((ResourceOwner)object3).getCode() : null;
        if (object != null && (object2 = ((Subcomponent)object).getResourceOwner()) != null) {
            string2 = ((ResourceOwner)object2).getName();
        }
        Activity activity = this.a;
        object2 = new kh0_1(dr0_02, activity, (Subcomponent)object);
        ai0_2.r((Function2)object2, object3, string2);
        return Unit.a;
    }
}

