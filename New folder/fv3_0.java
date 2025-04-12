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
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Fv3
 */
public final class fv3_0
extends ClickableSpan {
    public final /* synthetic */ int a;

    public fv3_0(int n3) {
        this.a = n3;
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "textView");
        CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
        view = view.getContext();
        Intrinsics.checkNotNullExpressionValue(view, "getContext(...)");
        hv3_0.a.getClass();
        String string2 = hv3_0.t();
        CustomWebViewActivity$a.b(customWebViewActivity$a, (Context)view, string2, 9);
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "drawState");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        int n3 = this.a;
        textPaint.setColor(n3);
    }
}

