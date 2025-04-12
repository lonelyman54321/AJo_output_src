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
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vO
 */
public final class vo_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vo_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        Object object2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (s)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                int n4 = ((s)object).S;
                n3 = -1;
                if (n4 != n3 || (n4 = (int)(((s)object).W ? 1 : 0)) != 0) {
                    n4 = 0;
                    object2 = null;
                    ((s)object).M(false);
                }
                return;
            }
            case 1: {
                object = (lo2_2)object;
                Intrinsics.checkNotNullParameter(object, (String)object2);
                ((BottomSheetDialogFragment)object).dismiss();
                return;
            }
            case 0: 
        }
        object = (wo_1)object;
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object2 = ((Fragment)object).getParentFragment();
        int n7 = object2 instanceof uo_2;
        if (n7 != 0) {
            object = ((Fragment)object).getParentFragment();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.cart.cartlist.fragment.CartPDPBSF");
            object = (uo_2)object;
            object2 = ((Fragment)object).getChildFragmentManager();
            n7 = ((FragmentManager)object2).J();
            if (n7 > 0) {
                object = ((Fragment)object).getChildFragmentManager();
                ((FragmentManager)object).W();
            } else {
                ((BottomSheetDialogFragment)object).dismiss();
            }
        }
    }
}

