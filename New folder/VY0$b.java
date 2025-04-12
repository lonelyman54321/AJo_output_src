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
import kotlin.jvm.internal.Intrinsics;

public final class VY0$b
extends ClickableSpan {
    public final /* synthetic */ vy0_0 a;

    public VY0$b(vy0_0 vy0_02) {
        this.a = vy0_02;
    }

    public final void onClick(View object) {
        String string2 = "textView";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.a.g;
        if (object != null) {
            object.q5();
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        textPaint.setUnderlineText(false);
    }
}

