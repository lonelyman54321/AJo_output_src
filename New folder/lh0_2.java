/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Lh0
 */
public final class lh0_2
extends BottomSheetDialogFragment {
    public static final Lh0$a Companion;

    static {
        Lh0$a lh0$a;
        Companion = lh0$a = new Object();
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
        if (n3 != 0) {
            n3 = R$layout.pesdk_lux_dialog_cvv_info;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.pesdk_dialog_cvv_info;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, bundle);
        int n3 = R$id.imv_dialog_close;
        bundle = (ImageView)object.findViewById(n3);
        int n4 = R$id.parent_layout;
        object = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (LinearLayout)object;
        Object object2 = Looper.getMainLooper();
        Handler handler = new Handler(object2);
        object2 = new jh0_0(object, 0);
        handler.postDelayed((Runnable)object2, (long)100);
        object = new kh0_0(this, 0);
        bundle.setOnClickListener((View.OnClickListener)object);
    }
}

