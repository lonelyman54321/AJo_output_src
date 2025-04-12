/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.PopupMenu
 */
import android.view.View;
import android.widget.PopupMenu;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.services.data.Order.ReturnRequest;
import in.juspay.hypersdk.core.InflateView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rO
 */
public final class ro_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ro_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        Object object2 = "this$0";
        Object object3 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object3 = (fo2_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object = ((fo2_2)object3).g;
                if (object != null && (object2 = ((fo2_2)object3).a) != null) {
                    object3 = null;
                    object2.t5((ReturnRequest)object, false);
                }
                return;
            }
            case 2: {
                InflateView.c((PopupMenu)object3, (View)object);
                return;
            }
            case 1: {
                boolean bl2;
                object3 = (hy0_2)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                object = ((Fragment)object3).getActivity();
                if (object != null && !(bl2 = (object = ((Fragment)object3).requireActivity()).isFinishing())) {
                    object = ((Fragment)object3).requireActivity();
                    ((ComponentActivity)object).onBackPressed();
                }
                return;
            }
            case 0: 
        }
        object = uo_2.Companion;
        object3 = (uo_2)object3;
        Intrinsics.checkNotNullParameter(object3, (String)object2);
        ((BottomSheetDialogFragment)object3).dismiss();
    }
}

