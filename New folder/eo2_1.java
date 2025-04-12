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

/*
 * Renamed from eO2
 */
public final class eo2_1
extends ClickableSpan {
    public final /* synthetic */ fo2_2 a;

    public eo2_1(fo2_2 fo2_22) {
        this.a = fo2_22;
    }

    public final void onClick(View object) {
        Intrinsics.checkNotNullParameter(object, "widget");
        object = this.a.b;
        Intrinsics.checkNotNull(object);
        String string2 = bz1_2.class.getName();
        object.onFragmentInteraction(string2, 12, null);
    }

    public final void updateDrawState(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "ds");
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}

