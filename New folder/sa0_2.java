/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SA0
 */
public final class sa0_2
extends BottomSheetDialogFragment {
    public static final SA0$a Companion;
    public ir2_1 a;

    static {
        SA0$a sA0$a;
        Companion = sA0$a = new Object();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bundle = this.getDialog();
        if (bundle != null && (bundle = bundle.getWindow()) != null) {
            int n3 = R$style.DialogAnimation;
            bundle.setWindowAnimations(n3);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.MobileBottomSheetFragment;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        String string2 = "inflate(...)";
        if (n3 != 0) {
            n3 = R$layout.pesdk_lux_dialog_error;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(layoutInflater, string2);
            return layoutInflater;
        }
        n3 = R$layout.pesdk_dialog_error;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, string2);
        return layoutInflater;
    }

    public final void onViewCreated(View view, Bundle object) {
        int n3;
        int n4;
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(view, (String)object2);
        super.onViewCreated(view, (Bundle)object);
        object = this.getArguments();
        if (object != null) {
            object2 = "SERVERERROR";
            object = object.get((String)object2);
        } else {
            n4 = 0;
            object = null;
        }
        object = (ir2_1)((Object)object);
        this.a = object;
        if (object == null) {
            this.dismissAllowingStateLoss();
        }
        n4 = R$id.dialog_error_tv_title;
        object = view.findViewById(n4);
        object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (TextView)object;
        int n7 = R$id.dialog_error_tv_desc;
        View view2 = view.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(view2, (String)object2);
        view2 = (TextView)view2;
        int n8 = R$id.dialog_error_tv_button;
        view = view.findViewById(n8);
        Intrinsics.checkNotNullExpressionValue(view, (String)object2);
        view = (TextView)view;
        object2 = this.a;
        if (object2 == null) {
            n3 = -1;
        } else {
            int[] nArray = SA0$b.$EnumSwitchMapping$0;
            n3 = ((Enum)object2).ordinal();
            n3 = nArray[n3];
        }
        n8 = 1;
        String string2 = "Please check your internet connection.";
        String string3 = "You are Offline";
        if (n3 != n8) {
            n8 = 2;
            String string4 = "Oops! Something went wrong.";
            if (n3 != n8) {
                n8 = 3;
                if (n3 != n8) {
                    object.setText((CharSequence)string3);
                    view2.setText((CharSequence)string2);
                } else {
                    object.setText((CharSequence)string4);
                    object = "Looks like something went wrong.Please try again in sometime.";
                    view2.setText((CharSequence)object);
                }
            } else {
                object.setText((CharSequence)string4);
                object = "Looks like something went wrong with our servers.";
                view2.setText((CharSequence)object);
            }
        } else {
            object.setText((CharSequence)string3);
            view2.setText((CharSequence)string2);
        }
        object = new ra0_0(this);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

