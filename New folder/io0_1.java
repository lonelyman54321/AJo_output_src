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
 *  android.widget.TextView
 */
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Io0
 */
public final class io0_1
extends BottomSheetDialogFragment {
    public io0$a_0 a;
    public PaymentInstrumentInfo b;
    public final hh3_2 c;

    public io0_1() {
        Object object = new Ca(this, 1);
        this.c = object = yr1_2.b((Function0)object);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bundle = this.getDialog();
        if (bundle != null && (bundle = bundle.getWindow()) != null) {
            int n3 = R$style.DialogAnimation;
            bundle.setWindowAnimations(n3);
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$style.MobileBottomSheetFragment;
        this.setStyle(0, n3);
        object = this.c;
        PaymentInstrumentInfo paymentInstrumentInfo = (PaymentInstrumentInfo)((io2_1)((hh3_2)object).getValue()).c.d();
        if (paymentInstrumentInfo != null) {
            this.b = object = (PaymentInstrumentInfo)((io2_1)((hh3_2)object).getValue()).c.d();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.pesdk_lux_dialog_delete_card;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
            Intrinsics.checkNotNull(layoutInflater);
        } else {
            n3 = R$layout.pesdk_dialog_delete_card;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
            Intrinsics.checkNotNull(layoutInflater);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View view, Bundle object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        int n3 = R$id.parent_layout;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (LinearLayout)object;
        Object object2 = Looper.getMainLooper();
        Object object3 = new Handler(object2);
        object2 = new ho0_2((LinearLayout)object);
        object3.postDelayed((Runnable)object2, (long)100);
        n3 = R$id.imv_dialog_close;
        object = (ImageView)view.findViewById(n3);
        int n4 = 1;
        object3 = new Ea(this, n4);
        object.setOnClickListener((View.OnClickListener)object3);
        n3 = R$id.tv_no;
        object = (TextView)view.findViewById(n3);
        object3 = new fa_0(this, n4);
        object.setOnClickListener((View.OnClickListener)object3);
        n3 = R$id.tv_yes;
        view = (TextView)view.findViewById(n3);
        object = new UT(this, 1);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

