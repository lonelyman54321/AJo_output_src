/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.navigation.e;
import com.ril.ajio.view.BaseActivity;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eN
 */
public final class en_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ en_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (yT1)object;
                Intrinsics.checkNotNullParameter(object, "$fleekAppNavigationController");
                String string2 = "brands";
                Intrinsics.checkNotNullParameter(string2, "route");
                Intrinsics.checkNotNullParameter(object, "fleekAppNavigationController");
                pj0_1 pj0_12 = new pj0_1(0);
                ((e)object).o(string2, pj0_12);
                return;
            }
            case 0: 
        }
        Object object2 = qn_2.Companion;
        object = (qn_2)object;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object2 = ((Fragment)object).getActivity();
        if (object2 != null && (n3 = (int)((object2 = ((Fragment)object).requireActivity()).isFinishing() ? 1 : 0)) == 0 && (object = (BaseActivity)((Fragment)object).getActivity()) != null) {
            ((BaseActivity)object).U1(0);
        }
    }
}

