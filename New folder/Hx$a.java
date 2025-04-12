/*
 * Decompiled with CFR 0.152.
 */
public final class Hx$a {
    public static final byte[] e;
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        int n3 = 1792;
        e = new byte[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            byte by2;
            byte[] byArray = e;
            byArray[i3] = by2 = Character.getDirectionality(i3);
        }
    }

    public Hx$a(CharSequence charSequence) {
        int n3;
        this.a = charSequence;
        this.b = n3 = charSequence.length();
    }

    public final byte a() {
        Object object = this.c + -1;
        Object object2 = this.a;
        object = object2.charAt((int)object);
        this.d = (char)object;
        if ((object = (Object)Character.isLowSurrogate((char)object)) != 0) {
            int by2;
            object = this.c;
            object = Character.codePointBefore((CharSequence)object2, (int)object);
            int n3 = this.c;
            int n4 = Character.charCount(object);
            this.c = by2 = n3 - n4;
            return Character.getDirectionality(object);
        }
        object = this.c + -1;
        this.c = object;
        object = this.d;
        byte by2 = 1792;
        if (object < by2) {
            object2 = e;
            object = object2[object];
        } else {
            object = Character.getDirectionality((char)object);
        }
        return object;
    }
}

