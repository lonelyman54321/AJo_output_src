/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.style.ClickableSpan
 *  android.view.View
 */
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ril.ajio.R$color;
import kotlin.jvm.internal.Intrinsics;

public final class XB0$b$a
extends ClickableSpan {
    public final /* synthetic */ xb0_0 a;

    public XB0$b$a(xb0_0 xb0_02) {
        this.a = xb0_02;
    }

    public final void onClick(View object) {
        String string2 = "widget";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a.c;
        if (object != null) {
            object.H2();
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        super.updateDrawState(textPaint);
        int n3 = hv3_0.m(R$color.accent_color_4);
        textPaint.setColor(n3);
        textPaint.setUnderlineText(false);
    }
}

