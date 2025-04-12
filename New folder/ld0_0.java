/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 *  android.widget.Toast
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lD0
 */
public final class ld0_0
implements View.OnClickListener {
    public final /* synthetic */ pd0_1 a;
    public final /* synthetic */ CartEntry b;
    public final /* synthetic */ CartEntry c;
    public final /* synthetic */ pD0$b d;

    public /* synthetic */ ld0_0(pd0_1 pd0_12, CartEntry cartEntry, CartEntry cartEntry2, int n3, pD0$b b2) {
        this.a = pd0_12;
        this.b = cartEntry;
        this.c = cartEntry2;
        this.d = b2;
    }

    public final void onClick(View view) {
        Object object;
        String string2;
        int n3;
        ld0_0 ld0_02 = this;
        int n4 = 1;
        r72_0 r72_02 = null;
        pd0_1 pd0_12 = this.a;
        pd0_12.getClass();
        int n7 = h40_0.l1();
        Object object2 = this.b;
        Object object3 = this.c;
        if (n7 != 0 && (n3 = (string2 = pd0_12.h).isEmpty()) == 0 && (n7 = string2.equals(object = "return")) != 0) {
            ((CartEntry)object2).setReturnClicked(n4 != 0);
            r72_0 r72_03 = pd0_12.a;
            r72_03.h1((CartEntry)object3, 0);
        } else {
            String string3;
            String string4;
            String string5;
            ((CartEntry)object2).setReturnClicked(false);
            string2 = pd0_12.d;
            object2 = "EX";
            n7 = string2.startsWith((String)object2);
            if (n7 != 0) {
                n7 = R$string.acc_error_message;
                string2 = hv3_0.K(n7);
                object2 = hv3_0.K(R$string.product_cannot_be_exchange);
                object3 = new Object[n4];
                object3[0] = object2;
                string2 = String.format(string2, (Object[])object3);
                ig0_0.Companion.getClass();
                AJIOApplication.Companion.getClass();
                object2 = AJIOApplication$a.a();
                object3 = ld0_02.d.itemView.getContext();
                n3 = R$string.product_cannot_be_exchange;
                object3 = object3.getString(n3);
                object = n4;
                Intrinsics.checkNotNullParameter(object2, "context");
                Intrinsics.checkNotNullParameter(object3, "msg");
                string5 = LayoutInflater.from((Context)object2);
                Intrinsics.checkNotNullExpressionValue(string5, "from(...)");
                int n8 = R$layout.custome_revamp_toast_large_padding;
                string5 = string5.inflate(n8, null);
                Intrinsics.checkNotNullExpressionValue(string5, "inflate(...)");
                n8 = R$id.toast_text;
                string4 = string5.findViewById(n8);
                string3 = "findViewById(...)";
                Intrinsics.checkNotNullExpressionValue(string4, string3);
                string4 = (TextView)string4;
                string4.setText((CharSequence)object3);
                object3 = new kg0(string2);
                string4.setAccessibilityDelegate((View.AccessibilityDelegate)object3);
                string2 = new Toast((Context)object2);
                int n10 = 200;
                int n14 = 80;
                string2.setGravity(n14, 0, n10);
                Intrinsics.checkNotNull(object);
                string2.setDuration(n4);
                string2.setView((View)string5);
                string2.show();
            } else {
                r72_02 = pd0_12.a;
                r72_02.h1((CartEntry)object3, n4);
            }
            String string6 = pd0_12.j;
            object = pd0_12.i;
            String string7 = "return or exchange mode selection screen";
            String string8 = pd0_12.k;
            string5 = "buttonTap";
            string4 = "return or exchange mode selection interaction";
            string3 = "exchange";
            String string9 = "buttonTap";
            ((NewCustomEventsRevamp)object).newPushCustomEvent(string5, string4, string3, string9, string7, string8, string6, null, string8);
        }
    }
}

