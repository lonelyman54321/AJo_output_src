/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ajio.ril.core.network.model.DataError;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jx0
 */
public final class jx0_1
extends BottomSheetDialogFragment {
    public static final jx0$a Companion;
    public jx0$b a;
    public DataError b;

    static {
        jx0$a jx0$a;
        Companion = jx0$a = new Object();
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        bundle = this.getDialog();
        if (bundle != null && (bundle = bundle.getWindow()) != null) {
            int n3 = R$style.bottomDialogAnimation;
            bundle.setWindowAnimations(n3);
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        boolean bl2 = false;
        int n3 = R$style.PinCodeBottomSheetFragment;
        this.setStyle(0, n3);
        object = this.getArguments();
        if (object != null) {
            object = this.getArguments();
            String string2 = "DATA_ERROR";
            Object object2 = null;
            if (object != null) {
                bl2 = object.containsKey(string2);
                object = bl2;
            } else {
                bl2 = false;
                object = null;
            }
            Intrinsics.checkNotNull(object);
            bl2 = (Boolean)object;
            if (bl2) {
                object = this.getArguments();
                if (object != null) {
                    int n4 = Build.VERSION.SDK_INT;
                    int n7 = 33;
                    if (n4 >= n7) {
                        object = hx0_1.a((Bundle)object);
                    } else {
                        n3 = (object = object.getSerializable(string2)) instanceof DataError;
                        if (n3 != 0) {
                            object2 = object;
                        }
                        object = object2;
                        object = (DataError)object2;
                    }
                    object2 = object;
                    object2 = (DataError)object;
                }
                this.b = object2;
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_shipping_edd_fail;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onViewCreated(View var1_1, Bundle var2_2) {
        Intrinsics.checkNotNullParameter(var1_1 /* !! */ , "view");
        super.onViewCreated(var1_1 /* !! */ , var2_2 /* !! */ );
        var3_3 = R$id.shipping_edd_fail_tv_message;
        var2_2 /* !! */  = (TextView)var1_1 /* !! */ .findViewById(var3_3);
        var4_4 = R$id.shipping_edd_fail_btn_goBack;
        var5_5 = (AjioTextView)var1_1 /* !! */ .findViewById(var4_4);
        var6_6 = R$id.shipping_edd_fail_btn_retry;
        var1_1 /* !! */  = (AjioTextView)var1_1 /* !! */ .findViewById(var6_6);
        var7_7 = z40_0.Companion;
        var7_7 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)var7_7).a;
        var8_8 = "shipping_edd_error_btn_count";
        var9_9 = var7_7.h(var8_8);
        var11_10 = this.b;
        if (var11_10 == null || (var11_10 = var11_10.getErrorMessage()) == null) ** GOTO lbl-1000
        var11_10 = this.b;
        var12_11 = null;
        if (var11_10 != null && (var11_10 = var11_10.getErrorMessage()) != null) {
            var11_10 = var11_10.getType();
        } else {
            var13_12 = 0;
            var11_10 = null;
        }
        var14_13 = "CommerceCartModificationError";
        var13_12 = (long)var14_13.equalsIgnoreCase((String)var11_10);
        if (var13_12 == false) ** GOTO lbl-1000
        var11_10 = this.b;
        if (var11_10 != null && (var11_10 = var11_10.getErrorMessage()) != null) {
            var11_10 = var11_10.getReason();
        } else {
            var13_12 = 0;
            var11_10 = null;
        }
        var14_13 = "MAX_CART_VALUE_LIMIT";
        var13_12 = (long)var14_13.equalsIgnoreCase((String)var11_10);
        if (var13_12 == false) ** GOTO lbl-1000
        var11_10 = this.b;
        if (var11_10 != null && (var11_10 = var11_10.getErrorMessage()) != null) {
            var11_10 = var11_10.getMessage();
        } else {
            var13_12 = 0;
            var11_10 = null;
        }
        var13_12 = (long)TextUtils.isEmpty((CharSequence)var11_10);
        if (var13_12 == false) {
            var7_7 = this.b;
            if (var7_7 != null && (var7_7 = var7_7.getErrorMessage()) != null) {
                var12_11 = var7_7.getMessage();
            }
            var9_9 = 1L;
        } else lbl-1000:
        // 4 sources

        {
            var12_11 = "";
        }
        var15_14 = 2;
        var13_12 = var9_9 == var15_14 ? 0 : (var9_9 < var15_14 ? -1 : 1);
        if (var13_12 == false) {
            var6_6 = R$string.shipping_edd_fail_two_btn_message;
            var7_7 = hv3_0.K(var6_6);
            var2_2 /* !! */ .setText((CharSequence)var7_7);
        } else {
            var7_7 = hv3_0.K(R$string.shipping_edd_fail_one_btn_message);
            var2_2 /* !! */ .setText((CharSequence)var7_7);
            var6_6 = 8;
            var1_1 /* !! */ .setVisibility(var6_6);
            var7_7 = var5_5.getLayoutParams();
            var8_8 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams";
            Intrinsics.checkNotNull(var7_7, var8_8);
            var7_7 = (LinearLayout.LayoutParams)var7_7;
            var7_7.weight = var17_15 = 2.0f;
            var5_5.setLayoutParams((ViewGroup.LayoutParams)var7_7);
        }
        if (var12_11 != null && (var6_6 = var12_11.length()) != 0) {
            var2_2 /* !! */ .setText((CharSequence)var12_11);
        }
        var2_2 /* !! */  = new ov_1(this, 1);
        var1_1 /* !! */ .setOnClickListener((View.OnClickListener)var2_2 /* !! */ );
        var1_1 /* !! */  = new ix0_1(this, 0);
        var5_5.setOnClickListener((View.OnClickListener)var1_1 /* !! */ );
    }
}

