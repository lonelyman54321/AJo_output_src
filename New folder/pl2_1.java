/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnKeyListener
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PL2
 */
public final class pl2_1
extends k61_0 {
    public static final PL2$a Companion;
    public final hh3_2 f;

    static {
        PL2$a pL2$a;
        Companion = pL2$a = new Object();
    }

    public pl2_1() {
        Object object = new uZ0(this, 1);
        this.f = object = yr1_2.b((Function0)object);
    }

    public static final ov0_0 Pa(pl2_1 pl2_12) {
        return (ov0_0)pl2_12.f.getValue();
    }

    public final void Qa() {
        this.dismissAllowingStateLoss();
        Fragment fragment = this.getParentFragment();
        boolean bl2 = fragment instanceof tv0_2;
        fragment = bl2 ? (tv0_2)fragment : null;
        if (fragment != null) {
            ((BottomSheetDialogFragment)fragment).dismissAllowingStateLoss();
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        Object object2 = new nl2_1((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)object2);
        object2 = new ol2_1(this);
        object.setOnKeyListener((DialogInterface.OnKeyListener)object2);
        return object;
    }

    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        Intrinsics.checkNotNullParameter(object, "inflater");
        object2 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object2, "requireContext(...)");
        object = new ComposeView((Context)object2, null, 6, 0);
        object3 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object3, "getViewLifecycleOwner(...)");
        object2 = new KC3$a((mu1_1)object3);
        ((AbstractComposeView)((Object)object)).setViewCompositionStrategy((KC3)object2);
        object2 = new PL2$b(this);
        object3 = new u10(1324675922, object2, true);
        ((ComposeView)((Object)object)).setContent((Function2)object3);
        return object;
    }
}

