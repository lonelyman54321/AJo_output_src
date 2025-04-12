/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 */
import android.widget.CompoundButton;
import com.ril.ajio.payment.listener.OnCheckoutClickListener;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qT
 */
public final class qt_1
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ rt_1 a;

    public /* synthetic */ qt_1(rt_1 rt_12) {
        this.a = rt_12;
    }

    public final void onCheckedChanged(CompoundButton object, boolean bl2) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        String string2 = "Expected Delivery";
        if (bl2) {
            String string3;
            OnCheckoutClickListener onCheckoutClickListener = ((rt_1)object).c;
            if (onCheckoutClickListener != null) {
                string3 = "Open";
                onCheckoutClickListener.w6(string3, string2);
            }
            if ((onCheckoutClickListener = ((rt_1)object).c) != null) {
                string2 = ((rt_1)object).n.getEC_CHECKOUT_INTERACTIONS();
                string3 = "EDD accordian open";
                String string4 = "checkout_accordian_open";
                onCheckoutClickListener.J8(string2, string3, string4);
            }
            onCheckoutClickListener = ((rt_1)object).g;
            string2 = null;
            onCheckoutClickListener.setVisibility(0);
            ((rt_1)object).w(false);
        } else {
            String string5;
            Object object2 = ((rt_1)object).g;
            int n3 = 8;
            object2.setVisibility(n3);
            object2 = ((rt_1)object).c;
            if (object2 != null) {
                string5 = "Close";
                object2.w6(string5, string2);
            }
            if (object2 != null) {
                string2 = ((rt_1)object).n.getEC_CHECKOUT_INTERACTIONS();
                string5 = "EDD accordian close";
                String string6 = "checkout_accordian_close";
                object2.J8(string2, string5, string6);
            }
            bl2 = true;
            ((rt_1)object).w(bl2);
        }
    }
}

