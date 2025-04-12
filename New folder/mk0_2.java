/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mK0
 */
public final class mk0_2
implements Function2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ mk0_2(dr0_0 dr0_02, Activity activity) {
        this.a = dr0_02;
        this.b = activity;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Activity activity = this.b;
        Intrinsics.checkNotNullParameter(activity, "$it");
        Bundle bundle = dm_1.a((String)object, "id", (String)object2, "name");
        bundle.putString("brand_name", (String)object2);
        bundle.putString("brand_id", (String)object);
        k01_0.a("insert_", (String)object2, bundle, "FLEEK_SOURCE");
        bundle.putString("FLEEK_SOURCE_DETAILS", "insert");
        dr0_0.H(dr0_02, activity, bundle);
        return Unit.a;
    }
}

