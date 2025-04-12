/*
 * Decompiled with CFR 0.152.
 */
import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

public final class K1
extends J1 {
    public static K1 d;
    public BreakIterator c;

    public final int[] a(int n3) {
        String string2;
        int n4;
        int n7;
        Object object;
        block7: {
            object = this.c();
            n7 = ((String)object).length();
            if (n7 <= 0) {
                return null;
            }
            if (n3 >= n7) {
                return null;
            }
            if (n3 < 0) {
                n3 = 0;
            }
            do {
                object = this.c;
                string2 = "impl";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n7 = 0;
                    object = null;
                }
                n7 = (int)(((BreakIterator)object).isBoundary(n3) ? 1 : 0);
                n4 = -1;
                if (n7 != 0) break block7;
                object = this.c;
                if (object != null) continue;
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                object = null;
            } while ((n3 = ((BreakIterator)object).following(n3)) != n4);
            return null;
        }
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        if ((n7 = ((BreakIterator)object).following(n3)) == n4) {
            return null;
        }
        return this.b(n3, n7);
    }

    public final int[] d(int n3) {
        String string2;
        int n4;
        int n7;
        Object object;
        block7: {
            object = this.c();
            n7 = ((String)object).length();
            if (n7 <= 0) {
                return null;
            }
            if (n3 <= 0) {
                return null;
            }
            if (n3 > n7) {
                n3 = n7;
            }
            do {
                object = this.c;
                string2 = "impl";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n7 = 0;
                    object = null;
                }
                n7 = (int)(((BreakIterator)object).isBoundary(n3) ? 1 : 0);
                n4 = -1;
                if (n7 != 0) break block7;
                object = this.c;
                if (object != null) continue;
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                object = null;
            } while ((n3 = ((BreakIterator)object).preceding(n3)) != n4);
            return null;
        }
        object = this.c;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        if ((n7 = ((BreakIterator)object).preceding(n3)) == n4) {
            return null;
        }
        return this.b(n7, n3);
    }

    public final void e(String string2) {
        this.a = string2;
        BreakIterator breakIterator = this.c;
        if (breakIterator == null) {
            Intrinsics.throwUninitializedPropertyAccessException("impl");
            breakIterator = null;
        }
        breakIterator.setText(string2);
    }
}

