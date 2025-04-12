/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 *  android.text.style.CharacterStyle
 */
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/*
 * Renamed from Kj3
 */
public final class kj3_0
extends CharacterStyle {
    public final boolean a;
    public final boolean b;

    public kj3_0(boolean bl2, boolean bl3) {
        this.a = bl2;
        this.b = bl3;
    }

    public final void updateDrawState(TextPaint textPaint) {
        boolean bl2 = this.a;
        textPaint.setUnderlineText(bl2);
        bl2 = this.b;
        textPaint.setStrikeThruText(bl2);
    }
}

