/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

public final class TC0
implements View.OnClickListener {
    public final void onClick(View view) {
        CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
        view = view.getContext();
        Intrinsics.checkNotNullExpressionValue(view, "getContext(...)");
        hv3_0.a.getClass();
        String string2 = hv3_0.t();
        CustomWebViewActivity$a.b(customWebViewActivity$a, (Context)view, string2, 18);
    }
}

