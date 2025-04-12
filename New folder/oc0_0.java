/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.WindowManager$LayoutParams
 */
import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.view.WindowManager;
import com.google.android.material.search.SearchView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Oc0
 */
public final class oc0_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oc0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3;
        Object object2 = this.b;
        int bl2 = 1;
        int n4 = this.a;
        switch (n4) {
            default: {
                SearchView.a((SearchView)object2, (View)object);
                return;
            }
            case 0: 
        }
        object2 = (sc0_2)object2;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object2.getClass();
        Object object3 = ((sc0_2)object2).a;
        Intrinsics.checkNotNull(object3);
        object = new Dialog((Context)object3);
        object3 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        ((sc0_2)object2).n = object;
        object = ((sc0_2)object2).Pa();
        n4 = R$layout.dialog_coupons_warning_2;
        object.setContentView(n4);
        object = ((sc0_2)object2).Pa().getWindow();
        if (object != null) {
            n4 = -1;
            n3 = -2;
            object.setLayout(n4, n3);
        }
        object = ((sc0_2)object2).Pa();
        n4 = R$id.coupon_ok_tv;
        object = (AjioTextView)object.findViewById(n4);
        object3 = ((sc0_2)object2).Pa();
        n3 = R$id.tv_coupon_msg2;
        object3 = (AjioTextView)object3.findViewById(n3);
        Object object4 = ((sc0_2)object2).Pa();
        int n7 = R$id.tv_coupon_msg3;
        object4 = (AjioTextView)object4.findViewById(n7);
        Object object5 = ((sc0_2)object2).Pa();
        int n8 = R$id.tv_coupon_msg4;
        object5 = (AjioTextView)object5.findViewById(n8);
        n8 = R$string.coupon_promotion_warning_msg_3;
        Object[] objectArray = ((sc0_2)object2).e;
        Intrinsics.checkNotNull(objectArray);
        objectArray = objectArray.getBalancePoints();
        Object[] objectArray2 = new Object[bl2];
        objectArray2[0] = objectArray;
        Object object6 = hv3_0.L(n8, objectArray2);
        object3.setText((CharSequence)object6);
        n4 = R$string.coupon_promotion_warning_msg_4;
        n8 = ((sc0_2)object2).Qa();
        object6 = n8;
        objectArray = new Object[bl2];
        objectArray[0] = object6;
        object3 = hv3_0.L(n4, objectArray);
        object4.setText((CharSequence)object3);
        n4 = R$string.coupon_promotion_warning_msg_5;
        n3 = ((sc0_2)object2).Qa();
        object4 = n3;
        Object object7 = new Object[bl2];
        object7[0] = object4;
        object7 = hv3_0.L(n4, (Object[])object7);
        object5.setText((CharSequence)object7);
        object7 = new rc0_0(object2, 0);
        object.setOnClickListener((View.OnClickListener)object7);
        object = new WindowManager.LayoutParams();
        object7 = ((sc0_2)object2).Pa().getWindow();
        if (object7 != null) {
            object7 = ((sc0_2)object2).Pa().getWindow();
            Intrinsics.checkNotNull(object7);
            object7 = object7.getAttributes();
            object.copyFrom((WindowManager.LayoutParams)object7);
        }
        object7 = ((sc0_2)object2).a;
        Intrinsics.checkNotNull(object7);
        int n10 = el3.b((Context)object7) * 84 / 100;
        double d2 = n10;
        double d5 = 0.6285714285714286;
        n4 = (int)(d2 *= d5);
        ((WindowManager.LayoutParams)object).width = n10;
        ((WindowManager.LayoutParams)object).height = n4;
        object7 = ((sc0_2)object2).a;
        if (object7 != null) {
            boolean bl3 = object7.isFinishing();
            object7 = bl3;
        } else {
            boolean bl4 = false;
            object7 = null;
        }
        Intrinsics.checkNotNull(object7);
        boolean bl5 = (Boolean)object7;
        if (!bl5) {
            object7 = ((sc0_2)object2).Pa();
            object7.show();
        }
        if ((object7 = ((sc0_2)object2).Pa().getWindow()) != null) {
            object7.setAttributes((WindowManager.LayoutParams)object);
        }
        ((sc0_2)object2).Pa().setCancelable(false);
    }
}

