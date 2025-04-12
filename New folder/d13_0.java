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
 * Renamed from d13
 */
public final class d13_0
extends CharacterStyle {
    public final int a;
    public final float b;
    public final float c;
    public final float d;

    public d13_0(float f5, float f6, float f7, int n3) {
        this.a = n3;
        this.b = f5;
        this.c = f6;
        this.d = f7;
    }

    public final void updateDrawState(TextPaint textPaint) {
        float f5 = this.c;
        int n3 = this.a;
        float f6 = this.d;
        float f7 = this.b;
        textPaint.setShadowLayer(f6, f7, f5, n3);
    }
}

