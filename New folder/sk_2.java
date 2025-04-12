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
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from SK
 */
public final class sk_2
extends BottomSheetDialogFragment {
    public static final SK$a Companion;
    public SK$b a;

    static {
        SK$a sK$a;
        Companion = sK$a = new Object();
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
            n3 = R$layout.pesdk_lux_dialog_cancel_transaction;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
            Intrinsics.checkNotNull(layoutInflater);
        } else {
            n3 = R$layout.pesdk_dialog_cancel_transaction;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
            Intrinsics.checkNotNull(layoutInflater);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        int n3 = R$id.imv_dialog_close;
        Object object = (ImageView)view.findViewById(n3);
        Object object2 = new pk_1(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
        n3 = R$id.tv_cancel;
        object = (TextView)view.findViewById(n3);
        object2 = new qk_1(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
        n3 = R$id.tv_confirm;
        view2 = (TextView)view.findViewById(n3);
        object = new rk_1(this);
        view2.setOnClickListener((View.OnClickListener)object);
        NewCustomEventsRevamp.newPushCustomEvent$default(AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp(), "", "", "", "screen_view", "upi_cancellation_halfcard_screen", "", "", null, "", false, null, 1536, null);
    }
}

