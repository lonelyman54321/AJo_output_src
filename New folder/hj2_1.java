/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.PdpSizeChartPagerBinding;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.a;
import com.ril.ajio.web.a$a;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hj2
 */
public final class hj2_1
extends Fragment
implements a,
View.OnClickListener {
    public static final hj2$a Companion;
    public static final /* synthetic */ gn1_2[] d;
    public final hh3_2 a;
    public final hh3_2 b;
    public final cc3_2 c;

    static {
        Object object = jz.a(hj2_1.class, "binding", "getBinding()Lcom/ril/ajio/databinding/PdpSizeChartPagerBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        d = gn1_2Array;
        Companion = object = new Object();
    }

    public hj2_1() {
        Object object = new dj2_1(this);
        this.a = object = yr1_2.b((Function0)object);
        object = new ej2_1(this);
        this.b = object = yr1_2.b((Function0)object);
        object = new fj2_2(this);
        yr1_2.b((Function0)object);
        this.c = object = z80_0.c(hj2$b.a, this);
    }

    public final void A9(String string2, String string3) {
    }

    public final PdpSizeChartPagerBinding Oa() {
        Object object = d[0];
        object = this.c.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (PdpSizeChartPagerBinding)object;
    }

    public final void dismissProgress() {
        this.Oa().progressBar.dismiss();
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
        int n3 = R$layout.pdp_size_chart_pager;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        this.showProgress();
        af3_2.b(this.Oa().pdpSizeWeb, this);
        object = this.b;
        object2 = (e12_0)((hh3_2)object).getValue();
        if (object2 != null) {
            object = (e12_0)((hh3_2)object).getValue();
            Intrinsics.checkNotNull(object);
            object2 = null;
            object = ((e12_0)object).p(false);
            boolean bl2 = TextUtils.isEmpty((CharSequence)object);
            if (!bl2) {
                object2 = p3.a("isPDP", "true");
                object3 = UrlHelper.Companion.getInstance();
                Intrinsics.checkNotNull(object);
                object = ((UrlHelper)object3).addParams((String)object, (HashMap)object2);
                object2 = this.Oa().pdpSizeWeb;
                int n3 = 10;
                object = tf3_2.a(n3, (String)object);
                object2.loadUrl((String)object);
            }
        }
    }

    public final void showProgress() {
        this.Oa().progressBar.show();
    }
}

