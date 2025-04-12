/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fV
 */
public final class fv_0
extends BottomSheetDialogFragment {
    public final hZ1$e a;

    public fv_0(hZ1$e hZ1$e) {
        Intrinsics.checkNotNullParameter(hZ1$e, "onAppliedFilterItemClick");
        this.a = hZ1$e;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.CustomBottomSheetDialogTheme;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.clear_all_confirmation_bottomsheet_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        int n3 = R$id.cancelClearBtn;
        object = (TextView)view.findViewById(n3);
        int n4 = R$id.clearAllBtn;
        Object object2 = (TextView)view.findViewById(n4);
        int n7 = R$id.clear_filter_cancel_iv;
        view = (ImageView)view.findViewById(n7);
        cV cV2 = new cV(this, 0);
        object2.setOnClickListener((View.OnClickListener)cV2);
        object2 = new dV(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
        object = new eV(this, 0);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

