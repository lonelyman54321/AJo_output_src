/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
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
import androidx.lifecycle.D;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from tv0
 */
public final class tv0_2
extends l51_0 {
    public static final tv0$a Companion;
    public final D f;

    static {
        tv0$a tv0$a;
        Companion = tv0$a = new Object();
    }

    public tv0_2() {
        Object object = new tv0$c(this);
        Object object2 = et1_2.NONE;
        Lambda lambda = new tv0$d((tv0$c)object);
        object = yr1_2.a(object2, lambda);
        object2 = Reflection.getOrCreateKotlinClass(ov0_0.class);
        super((rq1_2)object);
        tv0$f tv0$f = new tv0$f((rq1_2)object);
        tv0$g tv0$g = new tv0$g(this, (rq1_2)object);
        this.f = object = LW0.a(this, (yn1_2)object2, lambda, tv0$f, tv0$g);
    }

    public final ov0_0 Pa() {
        return (ov0_0)this.f.getValue();
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        sv0_2 sv0_22 = new sv0_2((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)sv0_22);
        return object;
    }

    public final View onCreateView(LayoutInflater object, ViewGroup object2, Bundle object3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "inflater");
        object = this.Pa();
        object2 = this.getArguments();
        ((ov0_0)object).e = object2;
        object = this.Pa();
        object2 = this.getArguments();
        object3 = null;
        if (object2 != null) {
            String string2 = "show_banner";
            bl2 = object2.getBoolean(string2);
        } else {
            bl2 = false;
            object2 = null;
        }
        ((ov0_0)object).f = bl2;
        object2 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(object2, "requireContext(...)");
        object = new ComposeView((Context)object2, null, 6, 0);
        object3 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(object3, "getViewLifecycleOwner(...)");
        object2 = new KC3$a((mu1_1)object3);
        ((AbstractComposeView)((Object)object)).setViewCompositionStrategy((KC3)object2);
        object2 = new tv0$b(this);
        object3 = new u10(-1080827264, object2, true);
        ((ComposeView)((Object)object)).setContent((Function2)object3);
        return object;
    }
}

