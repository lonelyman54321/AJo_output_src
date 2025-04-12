/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.InputFilter
 *  android.text.method.TransformationMethod
 *  android.widget.TextView
 */
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.widget.TextView;
import androidx.emoji2.text.EmojiCompat;

public final class Vy0$c
extends vy0$b_0 {
    public final vy0$a_0 a;

    public Vy0$c(TextView textView) {
        vy0$a_0 vy0$a_0;
        this.a = vy0$a_0 = new vy0$a_0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArray) {
        boolean bl2 = EmojiCompat.c() ^ true;
        if (bl2) {
            return inputFilterArray;
        }
        return this.a.a(inputFilterArray);
    }

    public final boolean b() {
        return this.a.c;
    }

    public final void c(boolean bl2) {
        boolean bl3 = EmojiCompat.c() ^ true;
        if (bl3) {
            return;
        }
        this.a.c(bl2);
    }

    public final void d(boolean bl2) {
        boolean bl3 = EmojiCompat.c() ^ true;
        vy0$a_0 vy0$a_0 = this.a;
        if (bl3) {
            vy0$a_0.c = bl2;
        } else {
            vy0$a_0.d(bl2);
        }
    }

    public final TransformationMethod e(TransformationMethod transformationMethod) {
        boolean bl2 = EmojiCompat.c() ^ true;
        if (bl2) {
            return transformationMethod;
        }
        return this.a.e(transformationMethod);
    }
}

