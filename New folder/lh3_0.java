/*
 * Decompiled with CFR 0.152.
 */
import java.text.BreakIterator;

/*
 * Renamed from LH3
 */
public final class lh3_0
implements xx2_0 {
    public final CharSequence a;
    public final KH3 b;

    public lh3_0(CharSequence charSequence, KH3 kH3) {
        this.a = charSequence;
        this.b = kH3;
    }

    public final int G(int n3) {
        int n4;
        block1: {
            CharSequence charSequence;
            do {
                Object object = this.b;
                ((KH3)object).a(n3);
                object = ((KH3)object).d;
                n3 = ((BreakIterator)object).preceding(n3);
                n4 = -1;
                if (n3 == n4 || n3 == 0) break block1;
                n4 = n3 + -1;
            } while ((n4 = (int)(Character.isWhitespace((charSequence = this.a).charAt(n4)) ? 1 : 0)) != 0);
            return n3;
        }
        return n4;
    }

    public final int h(int n3) {
        int n4;
        block1: {
            CharSequence charSequence;
            do {
                int n7;
                Object object = this.b;
                ((KH3)object).a(n3);
                object = ((KH3)object).d;
                n3 = ((BreakIterator)object).following(n3);
                n4 = -1;
                if (n3 == n4 || n3 == (n7 = (charSequence = this.a).length())) break block1;
            } while ((n4 = (int)(Character.isWhitespace(charSequence.charAt(n3)) ? 1 : 0)) != 0);
            return n3;
        }
        return n4;
    }

    public final int j(int n3) {
        Object object;
        int n4;
        do {
            object = this.b;
            ((KH3)object).a(n3);
            object = ((KH3)object).d;
            n3 = ((BreakIterator)object).preceding(n3);
            n4 = -1;
            if (n3 != n4) continue;
            return n4;
        } while ((n4 = (int)(Character.isWhitespace((object = this.a).charAt(n3)) ? 1 : 0)) != 0);
        return n3;
    }

    public final int l(int n3) {
        CharSequence charSequence;
        int n4;
        do {
            Object object = this.b;
            ((KH3)object).a(n3);
            object = ((KH3)object).d;
            n3 = ((BreakIterator)object).following(n3);
            n4 = -1;
            if (n3 == n4) {
                return n4;
            }
            n4 = n3 + -1;
        } while ((n4 = (int)(Character.isWhitespace((charSequence = this.a).charAt(n4)) ? 1 : 0)) != 0);
        return n3;
    }
}

