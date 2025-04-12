/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vi2
 */
public final class vi2_1
extends RecyclerView$B {
    public final View a;
    public final yi2_1 b;
    public final sj2_0 c;
    public final View d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final LinearLayout i;

    public vi2_1(yi2_1 object, sj2_0 object2, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(object, "pdpInfoProvider");
        String string2 = "pdpuiDelegateListener";
        Intrinsics.checkNotNullParameter(object2, string2);
        super(view);
        this.a = view;
        this.b = object;
        this.c = object2;
        Intrinsics.checkNotNullParameter(view, "itemView");
        this.d = view;
        object = "parentView";
        object2 = null;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            view = null;
        }
        int n3 = R$id.row_pdp_tv_return_info;
        view = (TextView)view.findViewById(n3);
        this.e = view;
        view = this.d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            view = null;
        }
        n3 = R$id.row_pdp_tv_no_return_info;
        view = (TextView)view.findViewById(n3);
        this.f = view;
        view = this.d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            view = null;
        }
        n3 = R$id.returns_title;
        view = (TextView)view.findViewById(n3);
        this.g = view;
        view = this.d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            view = null;
        }
        n3 = R$id.parent_panel_product_return;
        view = (LinearLayout)view.findViewById(n3);
        view = this.d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            view = null;
        }
        n3 = R$id.accessibility_click_here;
        view = (TextView)view.findViewById(n3);
        this.h = view;
        view = this.d;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
            view = null;
        }
        int n4 = R$id.returns_container;
        object = (LinearLayout)view.findViewById(n4);
        this.i = object;
        object = this.g;
        if (object == null) {
            object = "returnsTitle";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        ai0_2.t((View)object2);
    }

    /*
     * Unable to fully structure code
     */
    public final void w(Product var1_1, boolean var2_2) {
        var3_3 = null;
        if (!var2_2) ** GOTO lbl-1000
        if (var1_1 != null) {
            var4_4 = var1_1.getReturnUrl();
        } else {
            var2_2 = false;
            var4_4 = null;
        }
        var2_2 = TextUtils.isEmpty((CharSequence)var4_4);
        if (!var2_2) {
            var1_1 = var1_1 != null ? var1_1.getReturnUrl() : null;
        } else lbl-1000:
        // 2 sources

        {
            var1_1 = UrlHelper.Companion.getInstance();
            var2_2 = false;
            var4_4 = new Object[]{};
            var5_5 = "misc";
            var6_6 = "faq_returns";
            var1_1 = var1_1.getApiUrl(var5_5, var6_6, (Object[])var4_4);
        }
        var4_4 = this.b;
        var2_2 = var4_4.u7();
        var7_7 = 14;
        if (var2_2) {
            var4_4 = this.c;
            var4_4.w1(var7_7, (String)var1_1);
        } else {
            var4_4 = CustomWebViewActivity.Companion;
            var6_6 = this.d;
            if (var6_6 == null) {
                var6_6 = "parentView";
                Intrinsics.throwUninitializedPropertyAccessException(var6_6);
            } else {
                var3_3 = var6_6;
            }
            var3_3 = var3_3.getContext();
            var6_6 = "getContext(...)";
            Intrinsics.checkNotNullExpressionValue(var3_3, var6_6);
            CustomWebViewActivity$a.b((CustomWebViewActivity$a)var4_4, (Context)var3_3, (String)var1_1, var7_7);
        }
    }
}

