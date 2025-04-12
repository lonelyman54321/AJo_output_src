/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from YD1
 */
public final class yd1_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ yd1_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (s12)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = ((s12)object).c;
                if (object2 != null) {
                    object2.z2();
                }
                ((s12)object).Ra();
                object2 = ((s12)object).Ta();
                if (object2 != null && (object2 = ((F12)object2).d) != null) {
                    n3 = 0;
                    ((bv2_0)object2).O = false;
                }
                ((s12)object).Xa();
                object = ((Fragment)object).getParentFragment();
                if (object != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
                    ((FragmentManager)object).W();
                }
                return;
            }
            case 0: 
        }
        object = (zd1_1)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((zd1_1)object).h;
        if (object != null) {
            object.B0();
        }
    }
}

