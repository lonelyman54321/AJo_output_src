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
import com.ril.ajio.R$attr;
import com.ril.ajio.R$color;
import com.ril.ajio.services.data.Offers.BankOfferItem;
import com.ril.ajio.web.CustomWebViewActivity;
import com.ril.ajio.web.CustomWebViewActivity$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nh2
 */
public final class nh2_1
extends ClickableSpan {
    public final /* synthetic */ BankOfferItem a;
    public final /* synthetic */ oh2_1 b;

    public nh2_1(BankOfferItem bankOfferItem, oh2_1 oh2_12) {
        this.a = bankOfferItem;
        this.b = oh2_12;
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "textView");
        object = this.a.getTncUrl();
        CustomWebViewActivity$a customWebViewActivity$a = CustomWebViewActivity.Companion;
        Context context = this.b.b.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CustomWebViewActivity$a.b(customWebViewActivity$a, context, (String)object, 13);
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        super.updateDrawState(textPaint);
        Context context = null;
        textPaint.setUnderlineText(false);
        int n3 = og1_1.c();
        Object object = this.b;
        if (n3 == 0) {
            context = ((oh2_1)object).b.getContext();
            object = "getContext(...)";
            Intrinsics.checkNotNullExpressionValue(context, (String)object);
            int n4 = R$attr.accent_color_4;
            n3 = tm3_0.a(n4, context);
            textPaint.setColor(n3);
        } else {
            context = ((oh2_1)object).b.getContext();
            int n7 = R$color.black;
            n3 = t70.getColor(context, n7);
            textPaint.setColor(n3);
        }
    }
}

