/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;

/*
 * Renamed from ap1
 */
public class ap1_2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bundle = this.getDialog();
        if (bundle != null && (bundle = this.getDialog().getWindow()) != null) {
            bundle = this.getDialog().getWindow();
            int n3 = R$style.DialogAnimation;
            bundle.setWindowAnimations(n3);
        }
    }

    public final void onClick(View view) {
        int n3;
        int n4 = view.getId();
        if (n4 == (n3 = R$id.imv_close)) {
            this.dismiss();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int n3 = R$style.PriceRangeBottomSheetFragment;
        this.setStyle(0, n3);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.fragment_lpinfo_lux_bottom_sheet;
            return layoutInflater.inflate(n3, viewGroup, false);
        }
        n3 = R$layout.fragment_lpinfo_revamp_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        int n3 = R$id.imv_close;
        view.findViewById(n3).setOnClickListener((View.OnClickListener)this);
    }
}

