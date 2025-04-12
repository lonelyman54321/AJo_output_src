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
import com.ril.ajio.R$color;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

public final class xD2
extends ClickableSpan {
    public final /* synthetic */ wd2_0 a;

    public xD2(wd2_0 wd2_02) {
        this.a = wd2_02;
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        object = h40_0.a;
        object = h40_0.m0();
        String string2 = "reviewsPrivacyPolicyUrl";
        boolean bl2 = object.has(string2);
        if (bl2) {
            object = object.getString(string2);
            Intrinsics.checkNotNull(object);
        } else {
            object = "";
        }
        string2 = this.a.getContext();
        if (string2 != null) {
            CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
            int n3 = 20;
            CustomWebViewActivity$a.b(customWebViewActivity$a, (Context)string2, (String)object, n3);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        String string2 = "textPaint";
        Intrinsics.checkNotNullParameter(textPaint, string2);
        int n3 = R$color.option_blue;
        Context context = this.a.getContext();
        if (context != null) {
            n3 = t70.getColor(context, n3);
            textPaint.setColor(n3);
            n3 = 0;
            string2 = null;
            textPaint.setUnderlineText(false);
        }
    }
}

