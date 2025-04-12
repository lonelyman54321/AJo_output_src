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
import com.ril.ajio.services.data.freebies.FreebieGift;
import kotlin.jvm.internal.Intrinsics;

public final class lX0$a
extends ClickableSpan {
    public final /* synthetic */ lx0_1 a;
    public final /* synthetic */ Object b;

    public lX0$a(lx0_1 lx0_12, Object object) {
        this.a = lx0_12;
        this.b = object;
    }

    public final void onClick(View object) {
        String string2 = "clickedView";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a.c;
        boolean bl2 = object instanceof wc1_2;
        if (bl2) {
            object = (wc1_2)object;
            string2 = ((FreebieGift)this.b).getDetailsUrl();
            object.v3(string2);
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        String string2 = "drawState";
        Intrinsics.checkNotNullParameter(textPaint, string2);
        super.updateDrawState(textPaint);
        int n3 = og1_1.c();
        lx0_1 lx0_12 = this.a;
        if (n3 != 0) {
            string2 = lx0_12.b.getContext();
            int n4 = R$color.luxe_color_121212;
            n3 = t70.getColor((Context)string2, n4);
            textPaint.setColor(n3);
        } else {
            string2 = lx0_12.b.getContext();
            int n7 = R$color.option_blue;
            n3 = t70.getColor((Context)string2, n7);
            textPaint.setColor(n3);
            n3 = 0;
            string2 = null;
            textPaint.setUnderlineText(false);
        }
    }
}

