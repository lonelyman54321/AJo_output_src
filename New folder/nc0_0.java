/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.WindowManager$LayoutParams
 */
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nc0
 */
public final class nc0_0
implements View.OnClickListener {
    public final /* synthetic */ sc0_2 a;

    public /* synthetic */ nc0_0(sc0_2 sc0_22) {
        this.a = sc0_22;
    }

    public final void onClick(View object) {
        boolean bl2 = false;
        object = null;
        sc0_2 sc0_22 = this.a;
        Intrinsics.checkNotNullParameter(sc0_22, "this$0");
        Object object2 = sc0_22.m;
        Intrinsics.checkNotNull(object2);
        boolean bl3 = ((hy3_0)object2).p();
        if (bl3) {
            int n3;
            Object object3 = sc0_22.a;
            Intrinsics.checkNotNull(object3);
            object2 = new Dialog((Context)object3);
            object3 = "<set-?>";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            sc0_22.n = object2;
            object2 = sc0_22.Pa();
            int bl4 = R$layout.dialog_coupons_warning_1;
            object2.setContentView(bl4);
            object2 = sc0_22.Pa().getWindow();
            if (object2 != null) {
                object2 = sc0_22.Pa().getWindow();
                Intrinsics.checkNotNull(object2);
                int n4 = -1;
                n3 = -2;
                object2.setLayout(n4, n3);
            }
            object2 = sc0_22.Pa();
            int n7 = R$id.coupon_cancel;
            object2 = (AjioTextView)object2.findViewById(n7);
            object3 = sc0_22.Pa();
            n3 = R$id.coupon_buynow;
            object3 = (AjioTextView)object3.findViewById(n3);
            Object object4 = sc0_22.Pa();
            int n8 = R$id.coupon_tv;
            object4 = (AjioTextView)object4.findViewById(n8);
            n8 = R$string.coupon_promotion_warning_msg_1;
            int n10 = sc0_22.k.size();
            Integer n14 = n10;
            int n15 = 1;
            Object[] objectArray = new Object[n15];
            objectArray[0] = n14;
            String string2 = hv3_0.L(n8, objectArray);
            object4.setText((CharSequence)string2);
            object4 = new Pc0(sc0_22, 0);
            object2.setOnClickListener((View.OnClickListener)object4);
            object2 = new Qc0(sc0_22);
            object3.setOnClickListener((View.OnClickListener)object2);
            object2 = new WindowManager.LayoutParams();
            object3 = sc0_22.Pa().getWindow();
            n3 = 0;
            object4 = null;
            if (object3 != null) {
                object3 = object3.getAttributes();
            } else {
                boolean bl5 = false;
                object3 = null;
            }
            object2.copyFrom((WindowManager.LayoutParams)object3);
            object3 = sc0_22.a;
            Intrinsics.checkNotNull(object3);
            int n16 = el3.b((Context)object3) * 90 / 100;
            double d2 = n16;
            double d5 = 0.5142857142857142;
            n8 = (int)(d2 *= d5);
            ((WindowManager.LayoutParams)object2).width = n16;
            ((WindowManager.LayoutParams)object2).height = n8;
            object3 = sc0_22.a;
            if (object3 != null) {
                boolean bl6 = object3.isFinishing();
                object4 = bl6;
            }
            Intrinsics.checkNotNull(object4);
            boolean bl7 = (Boolean)object4;
            if (!bl7) {
                object3 = sc0_22.Pa();
                object3.show();
            }
            if ((object3 = sc0_22.Pa().getWindow()) != null) {
                object3.setAttributes((WindowManager.LayoutParams)object2);
            }
            sc0_22 = sc0_22.Pa();
            sc0_22.setCancelable(false);
        } else {
            object = sc0_22.a;
            if (object != null) {
                Intrinsics.checkNotNull(object);
                bl2 = object.isFinishing();
                if (!bl2) {
                    object = sc0_22.a;
                    Intrinsics.checkNotNull(object);
                    int n17 = 6;
                    object2 = "source - coupon promotion";
                    at2_1.h((Activity)object, (String)object2, n17);
                }
            }
        }
    }
}

