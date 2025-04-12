/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Dp
 */
public final class dp_1
implements CharSequence {
    public final char[] a;
    public int b;

    public dp_1(char[] cArray) {
        int n3;
        Intrinsics.checkNotNullParameter(cArray, "buffer");
        this.a = cArray;
        this.b = n3 = cArray.length;
    }

    public final char charAt(int n3) {
        return this.a[n3];
    }

    public final int length() {
        return this.b;
    }

    public final CharSequence subSequence(int n3, int n4) {
        int n7 = this.b;
        n4 = Math.min(n4, n7);
        return kotlin.text.b.g(this.a, n3, n4);
    }

    public final String toString() {
        int n3 = this.b;
        n3 = Math.min(n3, n3);
        return kotlin.text.b.g(this.a, 0, n3);
    }
}

