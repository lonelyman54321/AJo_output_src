/*
 * Decompiled with CFR 0.152.
 */
import java.text.CharacterIterator;

/*
 * Renamed from jS
 */
public final class js_0
implements CharacterIterator {
    public final CharSequence a;
    public final int b;
    public final int c;
    public int d;

    public js_0(int n3, CharSequence charSequence) {
        this.a = charSequence;
        this.b = 0;
        this.c = n3;
        this.d = 0;
    }

    public final Object clone() {
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            InternalError internalError = new InternalError();
            throw internalError;
        }
    }

    public final char current() {
        int n3 = this.d;
        int n4 = this.c;
        if (n3 == n4) {
            n3 = (char)-1;
        } else {
            CharSequence charSequence = this.a;
            n3 = charSequence.charAt(n3);
        }
        return (char)n3;
    }

    public final char first() {
        int n3;
        this.d = n3 = this.b;
        return this.current();
    }

    public final int getBeginIndex() {
        return this.b;
    }

    public final int getEndIndex() {
        return this.c;
    }

    public final int getIndex() {
        return this.d;
    }

    public final char last() {
        int n3 = this.b;
        int n4 = this.c;
        if (n3 == n4) {
            this.d = n4;
            n3 = (char)-1;
        } else {
            this.d = n4 += -1;
            CharSequence charSequence = this.a;
            n3 = charSequence.charAt(n4);
        }
        return (char)n3;
    }

    public final char next() {
        char c2 = this.d + 1;
        this.d = c2;
        int n3 = this.c;
        if (c2 >= n3) {
            this.d = n3;
            c2 = (char)-1;
        } else {
            CharSequence charSequence = this.a;
            c2 = charSequence.charAt(c2);
        }
        return c2;
    }

    public final char previous() {
        int n3 = this.d;
        int n4 = this.b;
        if (n3 <= n4) {
            n3 = (char)-1;
        } else {
            this.d = n3 += -1;
            CharSequence charSequence = this.a;
            n3 = charSequence.charAt(n3);
        }
        return (char)n3;
    }

    public final char setIndex(int n3) {
        int n4 = this.c;
        if (n3 <= n4 && (n4 = this.b) <= n3) {
            this.d = n3;
            return this.current();
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("invalid position");
        throw illegalArgumentException;
    }
}

