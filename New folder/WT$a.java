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

public final class WT$a
extends ClickableSpan {
    public final /* synthetic */ wt_0 a;

    public WT$a(wt_0 wt_02) {
        this.a = wt_02;
    }

    public final void onClick(View object) {
        String string2 = "widget";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a.d;
        if (object != null) {
            object.j5();
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        String string2 = "ds";
        Intrinsics.checkNotNullParameter(textPaint, string2);
        int n3 = og1_1.b();
        if (n3 != 0) {
            textPaint.setUnderlineText(true);
            n3 = hv3_0.m(R$color.luxe_color_121212);
            textPaint.setColor(n3);
        } else {
            string2 = null;
            textPaint.setUnderlineText(false);
            n3 = hv3_0.m(R$color.accent_color_4);
            textPaint.setColor(n3);
        }
    }
}

