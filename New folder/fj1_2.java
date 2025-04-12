/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.SpannableStringBuilder
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.URLSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fj1
 */
public final class fj1_2
extends BottomSheetDialogFragment {
    public static final Fj1$a Companion;
    public LinearLayout a;
    public TextView b;
    public TextView c;
    public RecyclerView d;
    public TextView e;
    public PaymentInstrumentInfo f;
    public final hh3_2 g;

    static {
        Fj1$a fj1$a;
        Companion = fj1$a = new Object();
    }

    public fj1_2() {
        Object object = new ib0_0(this, 2);
        this.g = object = yr1_2.b((Function0)object);
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

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.pesdk_dialog_internal_wallet_desc;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onViewCreated(View object, Bundle object2) {
        int n3;
        Object object3;
        int n4;
        Object object4;
        int n7;
        Object object5 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object5);
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = (PaymentInstrumentInfo)((io2_1)this.g.getValue()).c.d();
        if (object2 != null) {
            this.f = object2;
        }
        int n8 = R$id.imv_dialog_close;
        object2 = (ImageView)object.findViewById(n8);
        int n10 = 1;
        object5 = new PP(this, n10);
        object2.setOnClickListener((View.OnClickListener)object5);
        n8 = R$id.tvOkay;
        object2 = (TextView)object.findViewById(n8);
        object5 = new dj1_2(this);
        object2.setOnClickListener((View.OnClickListener)object5);
        n8 = R$id.wallet_excluded_products;
        this.d = object2 = (RecyclerView)object.findViewById(n8);
        n8 = R$id.tvWalletExProductTitle;
        object2 = (TextView)object.findViewById(n8);
        this.e = object2;
        n8 = R$id.parent_layout;
        object2 = (LinearLayout)object.findViewById(n8);
        this.a = object2;
        object5 = Looper.getMainLooper();
        object2 = new Handler((Looper)object5);
        object5 = new ej1_2(this);
        long l2 = 100;
        object2.postDelayed((Runnable)object5, l2);
        n8 = R$id.tvWalletName;
        object2 = (TextView)object.findViewById(n8);
        this.b = object2;
        n8 = R$id.tvWalletDesc;
        object = (TextView)object.findViewById(n8);
        this.c = object;
        object = this.b;
        n8 = 0;
        object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvWalletName");
            n7 = 0;
            object = null;
        }
        object5 = this.f;
        String string2 = "paymentInstrumentInfo";
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object5 = null;
        }
        object5 = ((PaymentInstrumentInfo)object5).getName();
        object.setText((CharSequence)object5);
        object = hv3_0.a;
        object5 = this.c;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("tvWalletDesc");
            object5 = null;
        }
        if ((object4 = this.f) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object4 = null;
        }
        object4 = ((PaymentInstrumentInfo)object4).getDescription();
        object.getClass();
        Intrinsics.checkNotNullParameter(object5, "textView");
        object = hv3_0.f((String)object4);
        object4 = new SpannableStringBuilder((CharSequence)object);
        try {
            boolean bl2;
            n7 = object.length();
            object3 = URLSpan.class;
            object = object4.getSpans(0, n7, (Class)object3);
            object = (URLSpan[])object;
            object = ArrayIteratorKt.iterator((Object[])object);
            while (bl2 = object.hasNext()) {
                object3 = object.next();
                object3 = (URLSpan)object3;
                n3 = object4.getSpanStart(object3);
                int n14 = object4.getSpanEnd(object3);
                int n15 = object4.getSpanFlags(object3);
                dv3_0 dv3_02 = new dv3_0((TextView)object5, (URLSpan)object3);
                object4.setSpan((Object)dv3_02, n3, n14, n15);
                object4.removeSpan(object3);
            }
        }
        catch (Exception exception) {
            object3 = yn3_0.a;
            ((yn3$a)object3).e(exception);
        }
        object5.setText((CharSequence)object4);
        object = LinkMovementMethod.getInstance();
        object5.setMovementMethod((MovementMethod)object);
        object = this.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        object = ((PaymentInstrumentInfo)object).getExcludedProducts();
        object5 = "walletExcludedProducts";
        if (object != null && (n7 = (int)(object.isEmpty() ? 1 : 0)) == 0) {
            object = h40_0.a;
            n7 = (int)(h40_0.h1() ? 1 : 0);
            if (n7 != 0) {
                object = this.e;
                object4 = "tvListTitle";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n7 = 0;
                    object = null;
                }
                ai0_2.B((View)object);
                object = this.e;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n7 = 0;
                    object = null;
                }
                object4 = z40_0.Companion;
                object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a.d("hm_preorder_json");
                n3 = (int)(object4.has((String)(object3 = "hm_preorder_rone_excluded_text")) ? 1 : 0);
                if (n3 != 0) {
                    object4 = object4.getString((String)object3);
                    object3 = "getString(...)";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
                } else {
                    n4 = R$string.hm_preorder_title;
                    object4 = hv3_0.K(n4);
                }
                object.setText((CharSequence)object4);
                object4 = this.getContext();
                object = new LinearLayoutManager((Context)object4, 0, false);
                object4 = this.d;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n4 = 0;
                    object4 = null;
                }
                ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object);
                object = this.d;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n7 = 0;
                    object = null;
                }
                if ((object4 = this.f) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                } else {
                    object2 = object4;
                }
                object2 = ((PaymentInstrumentInfo)object2).getExcludedProducts();
                object5 = new ve3_0((List)object2);
                ((RecyclerView)object).setAdapter((RecyclerView$f)object5);
                return;
            }
        }
        if ((object = this.d) == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
        } else {
            object2 = object;
        }
        ai0_2.i((View)object2);
    }
}

