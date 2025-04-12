/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wM0
 */
public final class wm0_0
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final wM0$a Companion;
    public final xM0 a;
    public View b;
    public View c;
    public View d;

    static {
        wM0$a wM0$a;
        Companion = wM0$a = new Object();
    }

    public wm0_0(xM0 xM02) {
        this.a = xM02;
    }

    public final void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        Intrinsics.checkNotNullParameter(context, "<set-?>");
    }

    public final void onClick(View view) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(view, string2);
        int n3 = view.getId();
        int n4 = R$id.layout_apply;
        xM0 xM02 = this.a;
        if (n3 == n4) {
            this.dismiss();
            if (xM02 != null) {
                xM02.P9();
            }
        } else {
            n4 = R$id.layout_discard;
            if (n3 == n4) {
                this.dismiss();
                if (xM02 != null) {
                    xM02.T();
                }
            } else {
                n4 = R$id.id_image_search_close_dialog;
                if (n3 == n4) {
                    this.dismiss();
                }
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        vm0_0 vm0_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)vm0_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.filter_apply_discard_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
    }

    public final void onViewCreated(View object, Bundle bundle) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onViewCreated((View)object, bundle);
        int n3 = R$id.layout_apply;
        bundle = object.findViewById(n3);
        this.b = bundle;
        n3 = R$id.layout_discard;
        bundle = object.findViewById(n3);
        this.c = bundle;
        n3 = R$id.id_image_search_close_dialog;
        bundle = object.findViewById(n3);
        this.d = bundle;
        bundle = this.b;
        if (bundle != null) {
            bundle.setOnClickListener((View.OnClickListener)this);
        }
        if ((bundle = this.c) != null) {
            bundle.setOnClickListener((View.OnClickListener)this);
        }
        if ((bundle = this.d) != null) {
            bundle.setOnClickListener((View.OnClickListener)this);
        }
        n3 = R$id.layout_parent_image_search;
        object = (ConstraintLayout)object.findViewById(n3);
        object2 = Looper.getMainLooper();
        bundle = new Handler((Looper)object2);
        object2 = new um0_0((ConstraintLayout)((Object)object));
        bundle.postDelayed((Runnable)object2, 300L);
    }
}

