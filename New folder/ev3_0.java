/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextPaint
 *  android.text.style.ClickableSpan
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ev3
 */
public final class ev3_0
extends ClickableSpan {
    public final /* synthetic */ Function0 a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ int c;

    public ev3_0(Function0 function0, TextView textView, int n3) {
        this.a = function0;
        this.b = textView;
        this.c = n3;
    }

    public final void onClick(View view) {
        Intrinsics.checkNotNullParameter(view, "clickedView");
        this.a.invoke();
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "drawState");
        super.updateDrawState(textPaint);
        Context context = this.b.getContext();
        int n3 = this.c;
        int n4 = t70.getColor(context, n3);
        textPaint.setColor(n4);
        textPaint.setUnderlineText(false);
    }
}

