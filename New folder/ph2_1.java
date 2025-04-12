/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextPaint
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.services.data.Cart.Pancard;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ph2
 */
public final class ph2_1
extends ClickableSpan {
    public final /* synthetic */ qh2_2 a;

    public ph2_1(qh2_2 qh2_22) {
        this.a = qh2_22;
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "clickedView");
        Object object = this.a.A;
        object = object != null && (object = ((zo_0)object).b) != null ? ((Pancard)object).getConsentFormLink() : null;
        view = view.getContext();
        if (view != null) {
            rm2_0.b("declaration cta click");
            CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
            int n3 = 23;
            CustomWebViewActivity$a.b(customWebViewActivity$a, (Context)view, (String)object, n3);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "drawState");
        super.updateDrawState(textPaint);
        boolean bl2 = og1_1.b();
        textPaint.setUnderlineText(bl2);
    }
}

