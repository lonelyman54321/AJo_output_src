/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.style.UnderlineSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$color;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.ActionContent;
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartExchangeReturnPolicy;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from WO
 */
public final class wo_0
extends RecyclerView$B
implements View.OnClickListener {
    public final View a;
    public final j82_0 b;
    public final dn_1 c;
    public final ConstraintLayout d;
    public final AjioTextView e;
    public final LinearLayout f;
    public final AjioTextView g;

    public wo_0(View object, j82_0 object2, dn_1 dn_12) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "mOnCartClickListener");
        Intrinsics.checkNotNullParameter(dn_12, "cartInfoProvider");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = dn_12;
        int n3 = R$id.cart_return_exchange_policy_layout;
        object2 = (ConstraintLayout)object.findViewById(n3);
        this.d = object2;
        n3 = R$id.ex_ret_title;
        object2 = (AjioTextView)object.findViewById(n3);
        this.e = object2;
        n3 = R$id.cart_return_exchange_policy_layout;
        object2 = (ConstraintLayout)object.findViewById(n3);
        n3 = R$id.ret_ex_layout;
        object2 = (LinearLayout)object.findViewById(n3);
        this.f = object2;
        n3 = R$id.ret_ex_policy_tv;
        object = (AjioTextView)object.findViewById(n3);
        this.g = object;
    }

    public final void onClick(View view) {
    }

    public final void w(Cart object) {
        int n3 = 1;
        uo_0 uo_02 = null;
        Object object2 = this.e;
        String string2 = "titleTv";
        Intrinsics.checkNotNullExpressionValue(object2, string2);
        ai0_2.t((View)object2);
        CartExchangeReturnPolicy cartExchangeReturnPolicy = this.c.o7();
        if (cartExchangeReturnPolicy != null) {
            boolean bl2;
            String string3;
            Object object3;
            int n4;
            Object object4;
            boolean bl3;
            int n7;
            int n8;
            String string4 = cartExchangeReturnPolicy.getCartReturnRefundTitle();
            if (string4 != null) {
                object2.setText((CharSequence)string4);
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                ai0_2.B((View)object2);
            }
            if (object != null && (object2 = ((Cart)object).getRvpReturnFee()) != null && (object2 = ((ProfileHealth)object2).getActionContent()) != null && (object2 = ((ActionContent)object2).getReturn_fee()) != null) {
                float f5 = ((Float)object2).floatValue();
                n7 = n8 = (int)f5;
            } else {
                n7 = 0;
                string4 = null;
            }
            object2 = cartExchangeReturnPolicy.getCartReturnRefundMsg();
            int n10 = 0;
            string2 = null;
            Object object5 = this.a;
            Object object6 = "retExLayout";
            LinearLayout linearLayout = this.f;
            if (object2 != null && !(bl3 = object2.isEmpty())) {
                Intrinsics.checkNotNullExpressionValue(linearLayout, (String)object6);
                ai0_2.B((View)linearLayout);
                linearLayout.removeAllViews();
                object4 = ((ArrayList)object2).iterator();
                String string5 = "iterator(...)";
                Intrinsics.checkNotNullExpressionValue(object4, string5);
                while ((n4 = (int)(object4.hasNext() ? 1 : 0)) != 0) {
                    string5 = object4.next();
                    Intrinsics.checkNotNullExpressionValue(string5, "next(...)");
                    object3 = LayoutInflater.from((Context)object5.getContext());
                    int n14 = R$layout.cart_ex_ret_policy_item;
                    object3 = object3.inflate(n14, null);
                    n14 = R$id.txt;
                    AjioTextView ajioTextView = (AjioTextView)object3.findViewById(n14);
                    ajioTextView.setText(string5);
                    n4 = R$id.imv;
                    string5 = (ImageView)object3.findViewById(n4);
                    n14 = ((ArrayList)object2).size();
                    if (n14 > n3) {
                        n14 = 0;
                        ajioTextView = null;
                    } else {
                        n14 = 8;
                    }
                    string5.setVisibility(n14);
                    linearLayout.addView((View)object3);
                }
            }
            if ((object4 = cartExchangeReturnPolicy.getCartReturnRefundMsgReturnFee()) != null && (n4 = ((String)object4).length()) > 0 && n7 > 0 && object2 != null && (n4 = (int)(object2.isEmpty() ? 1 : 0)) == 0) {
                Intrinsics.checkNotNullExpressionValue(linearLayout, (String)object6);
                ai0_2.B((View)linearLayout);
                n8 = (int)(((ArrayList)object2).isEmpty() ? 1 : 0);
                if (n8 != 0) {
                    linearLayout.removeAllViews();
                }
                object2 = StringCompanionObject.INSTANCE;
                object2 = n7;
                object6 = new Object[n3];
                object6[0] = object2;
                string3 = xh2_0.a(object6, n3, (String)object4, "format(...)");
                object2 = LayoutInflater.from((Context)object5.getContext());
                int n15 = R$layout.cart_ex_ret_policy_item;
                object2 = object2.inflate(n15, null);
                n10 = R$id.txt;
                string2 = object2.findViewById(n10);
                object4 = string2;
                object4 = (AjioTextView)((Object)string2);
                n10 = R$id.imv;
                string2 = (ImageView)object2.findViewById(n10);
                string2.setVisibility(0);
                if (object == null || (object = ((Cart)object).getRvpReturnFee()) == null || (object = ((ProfileHealth)object).getActionContent()) == null || (object = ((ActionContent)object).getReturn_fee_cta()) == null) {
                    object = "";
                }
                if ((n10 = ((String)object).length()) == 0) {
                    object = object2.getContext();
                    n10 = R$string.know_more_refresh;
                    object = object.getString(n10);
                }
                object6 = object;
                object = hv3_0.a;
                Intrinsics.checkNotNull(object4);
                n4 = R$color.accent_color_4;
                object3 = new to_2(this, 0);
                object.getClass();
                object5 = string3;
                hv3_0.d0(n7, string3, (String)object6, (TextView)object4, n4, (Function0)object3);
                linearLayout.addView((View)object2);
            }
            object = cartExchangeReturnPolicy.getReturnPolicyLinkText();
            string3 = cartExchangeReturnPolicy.getReturnPolicyLinkUrl();
            object2 = this.g;
            if (object != null && (n10 = ((String)object).length()) != 0 && string3 != null && (n10 = string3.length()) != 0) {
                string2 = "policyTv";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                ai0_2.B((View)object2);
                n10 = (int)(og1_1.c() ? 1 : 0);
                if (n10 != 0) {
                    string2 = new SpannableString((CharSequence)object);
                    object = new UnderlineSpan();
                    int n16 = string2.length();
                    string2.setSpan(object, 0, n16, 0);
                    object2.setText((CharSequence)string2);
                } else {
                    object2.setText((CharSequence)object);
                }
            }
            if (bl2 = km_1.b((cp$a)(object = cp_1.Companion))) {
                object = this.d;
                if (object != null) {
                    uo_02 = new uo_0(this, string3);
                    object.setOnClickListener((View.OnClickListener)uo_02);
                }
            } else if (object2 != null) {
                object = new vo_0(this, string3);
                object2.setOnClickListener((View.OnClickListener)object);
            }
        }
        GTMEvents.pushCartInteractionsEvent$default(AnalyticsManager.Companion.getInstance().getGtmEvents(), "policy changes card view", "", "policy_changes_card_view", "bag screen", "bag interactions", null, 32, null);
    }
}

