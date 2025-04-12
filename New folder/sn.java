/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.InputFilter
 *  android.util.AttributeSet
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.appcompat.R$styleable;

public final class sn {
    public final TextView a;
    public final Vy0 b;

    public sn(TextView textView) {
        Vy0 vy0;
        this.a = textView;
        this.b = vy0 = new Vy0(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArray) {
        return this.b.a.a(inputFilterArray);
    }

    public final boolean b() {
        return this.b.a.b();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(AttributeSet attributeSet, int n3) {
        Throwable throwable2;
        block3: {
            boolean bl2;
            block2: {
                Context context = this.a.getContext();
                int[] nArray = R$styleable.AppCompatTextView;
                attributeSet = context.obtainStyledAttributes(attributeSet, nArray, n3, 0);
                try {
                    n3 = R$styleable.AppCompatTextView_emojiCompatEnabled;
                    n3 = (int)(attributeSet.hasValue(n3) ? 1 : 0);
                    bl2 = true;
                    if (n3 == 0) break block2;
                    n3 = R$styleable.AppCompatTextView_emojiCompatEnabled;
                    bl2 = attributeSet.getBoolean(n3, bl2);
                }
                catch (Throwable throwable2) {
                    break block3;
                }
            }
            attributeSet.recycle();
            this.e(bl2);
            return;
        }
        attributeSet.recycle();
        throw throwable2;
    }

    public final void d(boolean bl2) {
        this.b.a.c(bl2);
    }

    public final void e(boolean bl2) {
        this.b.a.d(bl2);
    }
}

