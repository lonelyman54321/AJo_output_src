/*
 * Decompiled with CFR 0.152.
 */
import java.text.BreakIterator;
import java.util.Locale;

public final class KH3 {
    public final CharSequence a;
    public final int b;
    public final int c;
    public final BreakIterator d;

    public KH3(CharSequence object, int n3, Locale cloneable) {
        this.a = object;
        int n4 = object.length();
        if (n4 >= 0) {
            if (n3 >= 0 && n3 <= (n4 = object.length())) {
                cloneable = BreakIterator.getWordInstance((Locale)cloneable);
                this.d = cloneable;
                this.b = n4 = Math.max(0, -50);
                n4 = object.length();
                int n7 = n3 + 50;
                this.c = n4 = Math.min(n4, n7);
                js_0 js_02 = new js_0(n3, (CharSequence)object);
                ((BreakIterator)cloneable).setText(js_02);
                return;
            }
            String string2 = "input end index is outside the CharSequence".toString();
            object = new IllegalArgumentException(string2);
            throw object;
        }
        String string3 = "input start index is outside the CharSequence".toString();
        object = new IllegalArgumentException(string3);
        throw object;
    }

    public final void a(int n3) {
        int n4 = this.b;
        int n7 = this.c;
        if (n3 <= n7 && n4 <= n3) {
            return;
        }
        String string2 = tu.a(fQ2.a("Invalid offset: ", ". Valid range is [", " , ", n3, n4), n7, ']');
        string2 = string2.toString();
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
        throw illegalArgumentException;
    }

    public final boolean b(int n3) {
        CharSequence charSequence;
        int n4 = this.b;
        int n7 = 1;
        int n8 = this.c;
        if (n3 <= n8 && (n4 += n7) <= n3 && (n3 = (int)(Character.isLetterOrDigit(Character.codePointBefore(charSequence = this.a, n3)) ? 1 : 0)) != 0) {
            return n7 != 0;
        }
        return false;
    }

    public final boolean c(int n3) {
        int n4 = this.b + 1;
        int n7 = this.c;
        if (n3 <= n7 && n4 <= n3) {
            return KH3$a.a(Character.codePointBefore(this.a, n3));
        }
        return false;
    }

    public final boolean d(int n3) {
        CharSequence charSequence;
        int n4 = this.c;
        return n3 < n4 && (n4 = this.b) <= n3 && (n3 = (int)(Character.isLetterOrDigit(Character.codePointAt(charSequence = this.a, n3)) ? 1 : 0)) != 0;
    }

    public final boolean e(int n3) {
        int n4 = this.c;
        if (n3 < n4 && (n4 = this.b) <= n3) {
            return KH3$a.a(Character.codePointAt(this.a, n3));
        }
        return false;
    }
}

