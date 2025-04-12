/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.payment.activity.TermsAndConditionActivity;
import com.ril.ajio.services.data.Payment.PaymentInstruments;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from es2
 */
public final class es2_2
extends BottomSheetDialogFragment {
    public final D a;

    public es2_2() {
        Object object = Reflection.getOrCreateKotlinClass(kj2_1.class);
        es2$a es2$a = new es2$a(this);
        es2$b es2$b = new es2$b(this);
        es2$c es2$c = new es2$c(this);
        this.a = object = LW0.a(this, (yn1_2)object, es2$a, es2$b, es2$c);
    }

    public final void Oa(String object) {
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        Intent intent = new Intent((Context)aJIOApplication, TermsAndConditionActivity.class);
        aJIOApplication = new Bundle();
        String string2 = "url";
        aJIOApplication.putString(string2, (String)object);
        intent.putExtras((Bundle)aJIOApplication);
        object = this.getActivity();
        if (object != null) {
            object.startActivity(intent);
        }
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
            n3 = R$layout.pesdk_lux_payment_offer_bottom_view;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.pesdk_payment_offer_bottom_view;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
    }

    public final void onViewCreated(View view, Bundle object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        int n3 = R$id.parent_layout;
        object = view.findViewById(n3);
        Object object2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (LinearLayout)object;
        Object object3 = Looper.getMainLooper();
        Object object4 = new Handler(object3);
        int n4 = 1;
        object3 = new H22(object, n4);
        long l2 = 100;
        object4.postDelayed((Runnable)object3, l2);
        n3 = R$id.offer_list_view;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        object = (RecyclerView)object;
        object2 = this.a;
        object4 = ((kj2_1)((D)object2).getValue()).s;
        int n7 = object4 != null && (object4 = ((PaymentInstruments)object4).getBanners()) != null ? object4.size() : 1;
        object3 = this.getContext();
        if (object3 != null) {
            int n8;
            int n10;
            Object object5 = this.getContext();
            object2 = ((kj2_1)((D)object2).getValue()).s;
            if (object2 != null) {
                object2 = ((PaymentInstruments)object2).getBanners();
            } else {
                n10 = 0;
                object2 = null;
            }
            object3 = new RecyclerView$f();
            object5 = (LayoutInflater)object5.getSystemService("layout_inflater");
            object3.a = object5;
            object3.b = object2;
            object3.c = this;
            object5 = this.requireActivity();
            object2 = new LinearLayoutManager((Context)object5);
            object5 = object.getLayoutParams();
            String string2 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
            Intrinsics.checkNotNull(object5, string2);
            object5 = (LinearLayout.LayoutParams)object5;
            object5.height = n8 = mz3_0.d(60) * n7;
            object.setLayoutParams((ViewGroup.LayoutParams)object5);
            ((RecyclerView)object).setLayoutManager((RecyclerView$o)object2);
            ((RecyclerView)object).setAdapter((RecyclerView$f)object3);
            n3 = R$id.offer_close;
            view = view.findViewById(n3);
            n10 = 1;
            object = new gb_0(this, n10);
            view.setOnClickListener((View.OnClickListener)object);
        }
    }
}

