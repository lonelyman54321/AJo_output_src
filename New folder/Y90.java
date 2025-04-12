/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.DialogFragment;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class Y90
extends DialogFragment {
    public static final Y90$a Companion;
    public LottieAnimationView a;
    public TextView b;
    public TextView c;
    public ImageView d;
    public ConstraintLayout e;
    public String f;
    public String g;

    static {
        Y90$a y90$a;
        Companion = y90$a = new Object();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.dialog_cart_coupon_saving;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onStart() {
        Dialog dialog = this.getDialog();
        if (dialog != null) {
            int n3;
            Window window = dialog.getWindow();
            if (window != null) {
                n3 = hv3_0.F();
                int n4 = -1;
                window.setLayout(n3, n4);
            }
            if ((window = dialog.getWindow()) != null) {
                n3 = 17170445;
                window.setBackgroundDrawableResource(n3);
            }
            boolean bl2 = true;
            dialog.setCanceledOnTouchOutside(bl2);
        }
        super.onStart();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Object[] objectArray;
        int n3;
        Object object;
        Object object2;
        Object object3;
        int n4 = 0;
        float f5 = 0.0f;
        Object object4 = null;
        int n7 = 1;
        Intrinsics.checkNotNullParameter(view, "view");
        int n8 = R$id.dlprLayoutContent;
        this.e = object3 = (ConstraintLayout)view.findViewById(n8);
        n8 = R$id.confettiSaleAnim;
        object3 = (LottieAnimationView)view.findViewById(n8);
        this.a = object3;
        n8 = R$id.cart_saving_dialog_coupon_name;
        object3 = (TextView)view.findViewById(n8);
        this.b = object3;
        n8 = R$id.cart_saving_dialog_coupon_amount;
        object3 = (TextView)view.findViewById(n8);
        this.c = object3;
        n8 = R$id.close_dialog;
        object3 = (ImageView)view.findViewById(n8);
        this.d = object3;
        n8 = R$id.baseRl;
        object3 = (RelativeLayout)view.findViewById(n8);
        if (object3 != null) {
            object2 = new v90_0(this);
            object3.setOnClickListener((View.OnClickListener)object2);
        }
        object3 = this.e;
        int n10 = 0;
        float f6 = 0.0f;
        object2 = null;
        if (object3 != null) {
            object3.setOnClickListener(null);
        }
        if ((object3 = this.d) != null) {
            object = new w90_0(this);
            object3.setOnClickListener((View.OnClickListener)object);
        }
        if ((object3 = this.b) != null) {
            n3 = R$string.cart_coupon_applied;
            objectArray = this.f;
            Object[] objectArray2 = new Object[n7];
            objectArray2[0] = objectArray;
            object = hv3_0.L(n3, objectArray2);
            object3.setText((CharSequence)object);
        }
        n8 = R$string.cart_coupon_applied;
        object = this.f;
        objectArray = new Object[n7];
        objectArray[0] = object;
        object3 = hv3_0.L(n8, objectArray);
        object = this.g;
        if (object != null) {
            n10 = ok1_1.b(Float.parseFloat((String)object));
            f6 = n10;
            object2 = Float.valueOf(f6);
        }
        object2 = qz2_0.m((Float)object2);
        n3 = R$string.saved_that_feels_amazing;
        object = hv3_0.K(n3);
        object3 = n1.a((String)object3, (String)object2, (String)object);
        object2 = this.b;
        if (object2 != null) {
            object = StringCompanionObject.INSTANCE;
            n3 = R$string.acc_alert_popup;
            object = hv3_0.K(n3);
            objectArray = new Object[n7];
            objectArray[0] = object3;
            object3 = "format(...)";
            He1.a(objectArray, n7, (String)object, (String)object3, (TextView)object2);
        }
        object3 = Looper.getMainLooper();
        Handler handler = new Handler((Looper)object3);
        object3 = new X90(this, 0);
        long l2 = 10;
        handler.postDelayed((Runnable)object3, l2);
        object4 = this.g;
        if (object4 != null && (handler = this.c) != null) {
            n4 = ok1_1.b(Float.parseFloat((String)object4));
            f5 = n4;
            object4 = qz2_0.m(Float.valueOf(f5));
            handler.setText((CharSequence)object4);
        }
        object4 = tr2_2.a;
        tr2_2.h(this.a);
        super.onViewCreated(view, bundle);
    }
}

