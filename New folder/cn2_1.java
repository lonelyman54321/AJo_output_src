/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Cn2
 */
public final class cn2_1
extends BottomSheetDialogFragment {
    public CountDownTimer a;
    public dn2_1 b;
    public ka0_0 c;
    public final long d;
    public final long e;

    public cn2_1() {
        this.d = 15000L;
        this.e = 1000L;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        an2_2 an2_22 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)an2_22);
        ((BottomSheetDialog)object).setCanceledOnTouchOutside(false);
        ((BottomSheetDialog)object).setCancelable(false);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.payment_accessibility_bottom_sheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDestroyView() {
        CountDownTimer countDownTimer = this.a;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        super.onDestroyView();
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = new Ref$ObjectRef();
        int n3 = R$id.acc_payment_parent_layout;
        object = object.findViewById(n3);
        object2.element = object;
        Object object3 = Looper.getMainLooper();
        object = new Handler(object3);
        object3 = new bn2_0((Ref$ObjectRef)object2);
        object.postDelayed((Runnable)object3, 200L);
        long l2 = this.d;
        long l3 = this.e;
        object = new Cn2$a(this, l2, l3);
        object = object.start();
        this.a = object;
    }
}

