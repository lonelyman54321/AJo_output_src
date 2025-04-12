/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextPaint
 */
package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.emoji2.text.EmojiCompat$e;

public final class b
implements EmojiCompat$e {
    public static final ThreadLocal b;
    public final TextPaint a;

    static {
        ThreadLocal threadLocal;
        b = threadLocal = new ThreadLocal();
    }

    public b() {
        TextPaint textPaint;
        this.a = textPaint = new TextPaint();
        textPaint.setTextSize(10.0f);
    }
}

