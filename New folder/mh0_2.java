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
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from mH0
 */
public final class mh0_2
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Subcomponent b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ mh0_2(dr0_0 dr0_02, Activity activity, Subcomponent subcomponent) {
        this.a = activity;
        this.b = subcomponent;
        this.c = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$fleekViewModel");
        Bundle bundle = dm_1.a((String)object, "code", (String)object2, "name");
        Activity activity = this.a;
        Object object4 = null;
        if (activity != null) {
            int n3;
            Object object5;
            Object object6 = this.b;
            if (object6 != null && (object5 = ((Subcomponent)object6).getCta()) != null && (object5 = ((Cta)object5).getRedirectionUrl()) != null) {
                object4 = ((Object)StringsKt.m0((CharSequence)object5)).toString();
            }
            object5 = "insert";
            String string2 = "FLEEK_SOURCE_DETAILS";
            String string3 = "insert_";
            String string4 = "FLEEK_SOURCE";
            if (object4 != null && (n3 = ((String)object4).length()) != 0) {
                k01_0.a(string3, (String)object2, bundle, string4);
                bundle.putString(string2, (String)object5);
                object = sq0_1.a;
                object2 = "";
                if (object6 == null || (object3 = ((Subcomponent)object6).getResourceOwner()) == null || (object3 = ((ResourceOwner)object3).getName()) == null) {
                    object3 = object2;
                }
                if (object6 != null && (object6 = ((Subcomponent)object6).getResourceOwner()) != null && (object6 = ((ResourceOwner)object6).getName()) != null) {
                    object2 = object6;
                }
                ((sq0_1)object).a((String)object3, (String)object2);
                object = kj0_1.g();
                ((kj0_1)object).r(activity, (String)object4, bundle);
            } else {
                bundle.putString("brand_name", (String)object2);
                object4 = "brand_id";
                bundle.putString((String)object4, (String)object);
                k01_0.a(string3, (String)object2, bundle, string4);
                bundle.putString(string2, (String)object5);
                dr0_0.H((dr0_0)object3, activity, bundle);
                object = sq0_1.a;
                ((sq0_1)object).a((String)object2, (String)object2);
            }
            object4 = Unit.a;
        }
        return object4;
    }
}

