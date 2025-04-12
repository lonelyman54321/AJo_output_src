/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.text.Spannable
 *  android.text.SpannableString
 */
import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

public final class iw3
implements Spannable {
    public boolean a = false;
    public Spannable b;

    public iw3(Spannable spannable) {
        this.b = spannable;
    }

    public final void a() {
        int n3;
        iw3$a iw3$a;
        Spannable spannable = this.b;
        int n4 = this.a;
        if (n4 == 0 && (n4 = (int)((iw3$a = (n4 = Build.VERSION.SDK_INT) < (n3 = 28) ? new Object() : new Object()).a((CharSequence)spannable) ? 1 : 0)) != 0) {
            iw3$a = new SpannableString((CharSequence)spannable);
            this.b = iw3$a;
        }
        this.a = true;
    }

    public final char charAt(int n3) {
        return this.b.charAt(n3);
    }

    public final IntStream chars() {
        return hw3.a((CharSequence)this.b);
    }

    public final IntStream codePoints() {
        return gw3.a((CharSequence)this.b);
    }

    public final int getSpanEnd(Object object) {
        return this.b.getSpanEnd(object);
    }

    public final int getSpanFlags(Object object) {
        return this.b.getSpanFlags(object);
    }

    public final int getSpanStart(Object object) {
        return this.b.getSpanStart(object);
    }

    public final Object[] getSpans(int n3, int n4, Class clazz) {
        return this.b.getSpans(n3, n4, clazz);
    }

    public final int length() {
        return this.b.length();
    }

    public final int nextSpanTransition(int n3, int n4, Class clazz) {
        return this.b.nextSpanTransition(n3, n4, clazz);
    }

    public final void removeSpan(Object object) {
        this.a();
        this.b.removeSpan(object);
    }

    public final void setSpan(Object object, int n3, int n4, int n7) {
        this.a();
        this.b.setSpan(object, n3, n4, n7);
    }

    public final CharSequence subSequence(int n3, int n4) {
        return this.b.subSequence(n3, n4);
    }

    public final String toString() {
        return this.b.toString();
    }
}

