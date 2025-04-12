/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.databinding.CartPdpWebViewBinding;
import com.ril.ajio.web.a;
import com.ril.ajio.web.a$a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from wO
 */
public final class wo_1
extends Fragment
implements a,
View.OnClickListener {
    public static final wO$a Companion;
    public static final /* synthetic */ gn1_2[] b;
    public final cc3_2 a;

    static {
        Object object = jz.a(wo_1.class, "binding", "getBinding()Lcom/ril/ajio/databinding/CartPdpWebViewBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        b = gn1_2Array;
        Companion = object = new Object();
    }

    public wo_1() {
        cc3_2 cc3_22;
        this.a = cc3_22 = z80_0.c(wO$b.a, this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void A9(String string2, String object) {
        boolean bl2 = TextUtils.isEmpty((CharSequence)object);
        String string3 = "AJIO";
        if (!bl2) {
            boolean bl3;
            Object object2;
            boolean bl4;
            bl2 = false;
            if (object != null) {
                bl4 = StringsKt.F((CharSequence)object, "sizeChartUrl", false);
                object2 = bl4;
            } else {
                bl4 = false;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            bl4 = (Boolean)object2;
            if (bl4 || (bl3 = StringsKt.F((CharSequence)object, (CharSequence)(object2 = "sizeguide"), false))) {
                int n3 = R$string.size_guide;
                string2 = hv3_0.K(n3);
                object = this.Oa().toolbarHeaderView.toolbarTitleTv;
                Intrinsics.checkNotNull(object);
                ai0_2.B((View)object);
                if (string2 != null) {
                    string3 = string2;
                }
                object.setText((CharSequence)string3);
                return;
            }
        }
        object = this.Oa().toolbarHeaderView.toolbarTitleTv;
        Intrinsics.checkNotNull(object);
        ai0_2.B((View)object);
        if (string2 == null) {
            string2 = string3;
        }
        object.setText((CharSequence)string2);
    }

    public final CartPdpWebViewBinding Oa() {
        Object object = b[0];
        object = this.a.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (CartPdpWebViewBinding)object;
    }

    public final void dismissProgress() {
        this.Oa().cartPDPWebView.setVisibility(0);
        this.Oa().loaderView.stopLoader();
    }

    public final void e8(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
    }

    public final void m3(String string2) {
        a$a.a(string2);
    }

    public final void onClick(View view) {
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.cart_pdp_web_view;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, object3);
        super.onViewCreated((View)object, (Bundle)object2);
        this.showProgress();
        af3_2.b(this.Oa().cartPDPWebView, this);
        object = this.getArguments();
        if (object != null) {
            int n3;
            object2 = object.getString("WEB_URL");
            object3 = "SOURCE";
            int n4 = -1;
            int n7 = object.getInt(object3, n4);
            if (object2 != null && (n3 = ((String)object2).length()) != 0) {
                object3 = this.Oa().cartPDPWebView;
                object = tf3_2.a(n7, (String)object2);
                object3.loadUrl((String)object);
            }
            if ((object = this.Oa().toolbar) != null) {
                int n8 = R$drawable.nav_back;
                ((Toolbar)object).setNavigationIcon(n8);
                n8 = R$string.back_button_text;
                object2 = hv3_0.K(n8);
                ((Toolbar)object).setNavigationContentDescription((CharSequence)object2);
                object2 = ((Toolbar)object).getNavigationIcon();
                if (object2 != null) {
                    object3 = "#000000";
                    n3 = Color.parseColor((String)object3);
                    PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                    object2.setColorFilter(n3, mode);
                }
                n3 = 0;
                object3 = null;
                object2 = new vo_1(this, 0);
                ((Toolbar)object).setNavigationOnClickListener((View.OnClickListener)object2);
            }
        }
    }

    public final void showProgress() {
        this.Oa().cartPDPWebView.setVisibility(8);
        this.Oa().loaderView.startLoader();
    }
}

