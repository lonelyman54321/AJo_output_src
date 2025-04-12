/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.fleek.explore_brands.Cta;
import com.ril.ajio.services.data.fleek.explore_brands.ResourceOwner;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from kH0
 */
public final class kh0_1
implements Function2 {
    public final /* synthetic */ Activity a;
    public final /* synthetic */ Subcomponent b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ kh0_1(dr0_0 dr0_02, Activity activity, Subcomponent subcomponent) {
        this.a = activity;
        this.b = subcomponent;
        this.c = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (String)object;
        object2 = (String)object2;
        Object object3 = this.c;
        Intrinsics.checkNotNullParameter(object3, "$fleekViewModel");
        Object object4 = dm_1.a((String)object, "code", (String)object2, "name");
        Object object5 = null;
        Activity activity = this.a;
        if (activity != null) {
            int n3;
            Object object6;
            Subcomponent subcomponent = this.b;
            object6 = subcomponent != null && (object6 = subcomponent.getCta()) != null && (object6 = ((Cta)object6).getRedirectionUrl()) != null ? ((Object)StringsKt.m0((CharSequence)object6)).toString() : null;
            String string2 = "insert";
            String string3 = "FLEEK_SOURCE_DETAILS";
            String string4 = "insert_";
            String string5 = "FLEEK_SOURCE";
            if (object6 != null && (n3 = ((String)object6).length()) != 0) {
                k01_0.a(string4, (String)object2, (Bundle)object4, string5);
                object4.putString(string3, string2);
                object = sq0_1.a;
                object2 = "";
                if (subcomponent == null || (object3 = subcomponent.getResourceOwner()) == null || (object3 = ((ResourceOwner)object3).getName()) == null) {
                    object3 = object2;
                }
                if (subcomponent != null && (object4 = subcomponent.getResourceOwner()) != null && (object4 = ((ResourceOwner)object4).getName()) != null) {
                    object2 = object4;
                }
                ((sq0_1)object).a((String)object3, (String)object2);
                boolean bl2 = activity instanceof AjioHomeActivity;
                if (bl2) {
                    object = activity;
                    object = (AjioHomeActivity)activity;
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object != null) {
                    boolean bl3;
                    ((AjioHomeActivity)object).t1 = bl3 = true;
                }
                object = kj0_1.g();
                object2 = Boolean.TRUE;
                ((kj0_1)object).s(activity, (String)object6, null, (Boolean)object2);
            } else {
                object4.putString("brand_name", (String)object2);
                object5 = "brand_id";
                object4.putString((String)object5, (String)object);
                k01_0.a(string4, (String)object2, (Bundle)object4, string5);
                object4.putString(string3, string2);
                dr0_0.H((dr0_0)object3, activity, (Bundle)object4);
                object = sq0_1.a;
                ((sq0_1)object).a((String)object2, (String)object2);
            }
            object5 = Unit.a;
        }
        return object5;
    }
}

