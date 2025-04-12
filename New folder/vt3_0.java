/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.KeyEvent$Callback
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.payment.view.PaymentActivity;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from Vt3
 */
public final class vt3_0
extends Fragment
implements View.OnClickListener {
    public static final Vt3$a Companion;
    public final D a;
    public RecyclerView b;
    public View c;
    public ImageView d;
    public PaymentActivity e;

    static {
        Vt3$a vt3$a;
        Companion = vt3$a = new Object();
    }

    public vt3_0() {
        Object object = Reflection.getOrCreateKotlinClass(kj2_1.class);
        Vt3$b vt3$b = new Vt3$b(this);
        Vt3$c vt3$c = new Vt3$c(this);
        Vt3$d vt3$d = new Vt3$d(this);
        this.a = object = LW0.a(this, (yn1_2)object, vt3$b, vt3$c, vt3$d);
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getActivity();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.payment.view.PaymentActivity");
        object = (PaymentActivity)object;
        this.e = object;
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.cancel_view;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            object = this.getActivity();
            if (object != null) {
                ((ComponentActivity)object).onBackPressed();
            }
        } else {
            n7 = R$id.cancel_iv;
            if (object != null && (n4 = ((Integer)object).intValue()) == n7 && (object = this.getActivity()) != null) {
                ((ComponentActivity)object).onBackPressed();
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.layout_payment_upi_how_to;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDetach() {
        int n3;
        super.onDetach();
        PaymentActivity paymentActivity = this.e;
        if (paymentActivity == null) {
            Intrinsics.throwUninitializedPropertyAccessException("paymentActivity");
            paymentActivity = null;
        }
        if ((n3 = paymentActivity.F0) == 0) {
            n3 = 0;
            float f5 = 0.0f;
            paymentActivity.F0 = false;
            FrameLayout frameLayout = paymentActivity.E0;
            if (frameLayout != null) {
                int n4 = R$color.transparent;
                frameLayout.setBackgroundResource(n4);
            }
            if ((paymentActivity = paymentActivity.E0) != null) {
                n3 = 1065353216;
                f5 = 1.0f;
                paymentActivity.setAlpha(f5);
            }
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.main_view;
        object2 = (ConstraintLayout)object.findViewById(n3);
        Object object3 = Looper.getMainLooper();
        Object object4 = new Handler(object3);
        object3 = new yd0_1((KeyEvent.Callback)object2, 1);
        long l2 = 100;
        object4.postDelayed((Runnable)object3, l2);
        n3 = R$id.list_rv;
        object2 = (RecyclerView)object.findViewById(n3);
        this.b = object2;
        object4 = this.requireActivity();
        object2 = new LinearLayoutManager((Context)object4);
        object4 = this.b;
        object3 = "stepsRv";
        View view = null;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object3);
            object4 = null;
        }
        ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object2);
        object2 = ((kj2_1)this.a.getValue()).s;
        if (object2 != null) {
            object2 = ((PaymentInstruments)object2).getHowToFindUPISteps();
        } else {
            n3 = 0;
            object2 = null;
        }
        if (object2 != null) {
            object4 = this.b;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                object4 = null;
            }
            object3 = new ut3_0((List)object2);
            ((RecyclerView)object4).setAdapter((RecyclerView$f)object3);
        }
        n3 = R$id.cancel_view;
        object2 = object.findViewById(n3);
        this.c = object2;
        n3 = R$id.cancel_iv;
        object = (ImageView)object.findViewById(n3);
        this.d = object;
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelView");
            object = null;
        }
        object.setOnClickListener((View.OnClickListener)this);
        object = this.d;
        if (object == null) {
            object = "cancelIv";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            view = object;
        }
        view.setOnClickListener((View.OnClickListener)this);
    }
}

