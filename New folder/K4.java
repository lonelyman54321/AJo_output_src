/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.payment.fragment.b;
import kotlin.jvm.internal.Intrinsics;

public final class K4
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ K4(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (b)this.b;
                Intrinsics.checkNotNullParameter(object, "this$0");
                DialogInterface.OnDismissListener onDismissListener = ((b)object).g;
                if (onDismissListener != null) {
                    if (onDismissListener == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("dismissListener");
                        boolean bl2 = false;
                        onDismissListener = null;
                    }
                    Dialog dialog = ((DialogFragment)object).getDialog();
                    onDismissListener.onDismiss((DialogInterface)dialog);
                }
                ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
                return;
            }
            case 0: 
        }
        object = (s4_0)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((Fragment)object).getActivity();
        boolean bl3 = object2 instanceof AjioHomeActivity;
        if (bl3) {
            object = ((Fragment)object).getActivity();
            object2 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
            Intrinsics.checkNotNull(object, (String)object2);
            object = (AjioHomeActivity)object;
            ((AjioHomeActivity)object).onBackPressed();
        }
    }
}

