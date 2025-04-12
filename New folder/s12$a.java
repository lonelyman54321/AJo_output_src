/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

public final class s12$a {
    public static s12 a(int n3, String string2) {
        Object object = "filterStoreTheme";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        int n4 = 100;
        object = n3 != n4 ? (n3 != (n4 = 101) ? new s12() : new CF1()) : new s12();
        Bundle bundle = new Bundle();
        bundle.putInt("PLP_TYPE", n3);
        bundle.putString("FILTER_STORE_THEME", string2);
        ((Fragment)object).setArguments(bundle);
        return object;
    }

    public static void b(Activity object) {
        Object object2 = "activity";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof AjioHomeActivity;
        if (bl2) {
            object2 = wm0_0.Companion;
            s12 s122 = s12.v;
            object2.getClass();
            object2 = new Bundle();
            wm0_0 wm0_02 = new wm0_0(s122);
            wm0_02.setArguments((Bundle)object2);
            object = ((AjioHomeActivity)object).getSupportFragmentManager();
            object2 = "Apply/Discard";
            wm0_02.show((FragmentManager)object, (String)object2);
        }
    }
}

