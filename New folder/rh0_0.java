/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import com.ril.ajio.services.data.fleek.explore_brands.Cta;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from rH0
 */
public final class rh0_0
implements Function2 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ Activity c;

    public /* synthetic */ rh0_0(dr0_0 dr0_02, Activity activity, Subcomponent subcomponent) {
        this.a = subcomponent;
        this.b = dr0_02;
        this.c = activity;
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (String)object;
        object2 = (String)object2;
        dr0_0 dr0_02 = this.b;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Bundle bundle = dm_1.a((String)object, "name", (String)object2, "code");
        Object object3 = this.a;
        object3 = object3 != null && (object3 = ((Subcomponent)object3).getCta()) != null && (object3 = ((Cta)object3).getRedirectionUrl()) != null ? ((Object)StringsKt.m0((CharSequence)object3)).toString() : null;
        Activity activity = this.c;
        String string2 = "insert";
        String string3 = "FLEEK_SOURCE_DETAILS";
        String string4 = "insert_";
        String string5 = "FLEEK_SOURCE";
        if (object3 != null && (n3 = ((String)object3).length()) != 0) {
            k01_0.a(string4, (String)object, bundle, string5);
            bundle.putString(string3, string2);
            object = kj0_1.g();
            ((kj0_1)object).r(activity, (String)object3, bundle);
        } else {
            bundle.putString("brand_name", (String)object);
            object3 = "brand_id";
            bundle.putString((String)object3, (String)object2);
            k01_0.a(string4, (String)object, bundle, string5);
            bundle.putString(string3, string2);
            dr0_0.H(dr0_02, activity, bundle);
        }
        return Unit.a;
    }
}

