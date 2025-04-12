/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 */
import android.text.TextPaint;

public final class R01
extends k0_0 {
    public final CharSequence a;
    public final TextPaint b;

    public R01(TextPaint textPaint, CharSequence charSequence) {
        this.a = charSequence;
        this.b = textPaint;
    }

    public final int U(int n3) {
        CharSequence charSequence = this.a;
        int n4 = charSequence.length();
        return Q01.a(this.b, charSequence, n4, n3);
    }

    public final int V(int n3) {
        CharSequence charSequence = this.a;
        int n4 = charSequence.length();
        return P01.a(this.b, charSequence, n4, n3);
    }
}

