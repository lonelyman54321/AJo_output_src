/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from HD1
 */
public final class hd1_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ hd1_1(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        object = "this$0";
        Fragment fragment = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                String string2;
                boolean bl3;
                s12 s122 = (s12)fragment;
                Intrinsics.checkNotNullParameter(s122, (String)object);
                object = s122.i;
                n3 = 0;
                String string3 = null;
                if (object != null && (bl3 = object.getBoolean(string2 = "isFilterSelected", false)) == (bl2 = true)) {
                    object = h40_0.a;
                    object = z40_0.Companion;
                    object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
                    string2 = "showAlertForDiscardFilter";
                    bl3 = ((ao0_0)object).a(string2);
                    if (bl3 && !(bl3 = og1_1.c())) {
                        object = s12.Companion;
                        FragmentActivity fragmentActivity = s122.getActivity();
                        string3 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
                        Intrinsics.checkNotNull(fragmentActivity, string3);
                        AjioHomeActivity ajioHomeActivity = (AjioHomeActivity)fragmentActivity;
                        object.getClass();
                        s12$a.b(ajioHomeActivity);
                        return;
                    }
                }
                if ((object = s122.c) != null) {
                    object.z2();
                }
                if ((object = s122.Ta()) != null && (object = ((F12)object).d) != null) {
                    ((bv2_0)object).O = false;
                }
                s122.Xa();
                s122.Qa();
                object = s122.getParentFragment();
                if (object == null) return;
                if ((object = ((Fragment)object).getChildFragmentManager()) == null) return;
                ((FragmentManager)object).W();
                return;
            }
            case 0: 
        }
        kd1_0 kd1_02 = (kd1_0)fragment;
        Intrinsics.checkNotNullParameter(kd1_02, (String)object);
        object = kd1_02.a;
        if (object == null) return;
        object.l();
    }
}

