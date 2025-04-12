/*
 * Decompiled with CFR 0.152.
 */
import java.text.BreakIterator;
import kotlin.jvm.internal.Intrinsics;

public final class O1
extends J1 {
    public static O1 d;
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
            object = this.c();
            n7 = ((String)object).length();
            if (n3 >= n7) {
                return null;
            }
            if (n3 < 0) {
                n3 = 0;
            }
            do {
                n7 = (int)(this.g(n3) ? 1 : 0);
                n4 = -1;
                string2 = "impl";
                if (n7 != 0) break block7;
                n7 = (int)(this.g(n3) ? 1 : 0);
                if (n7 != 0) {
                    if (n3 == 0) break block7;
                    n7 = n3 + -1;
                    if ((n7 = (int)(this.g(n7) ? 1 : 0)) == 0) break block7;
                }
                if ((object = this.c) != null) continue;
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n7 = 0;
                object = null;
            } while ((n3 = ((BreakIterator)object).following(n3)) != n4);
            return null;
        }
        if ((object = this.c) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n7 = 0;
            object = null;
        }
        if ((n7 = ((BreakIterator)object).following(n3)) != n4 && (n4 = (int)(this.f(n7) ? 1 : 0)) != 0) {
            return this.b(n3, n7);
        }
        return null;
    }

    public final int[] d(int n3) {
        block9: {
            int n4;
            block10: {
                int n7;
                String string2;
                BreakIterator breakIterator;
                int n8;
                block8: {
                    String string3 = this.c();
                    n8 = string3.length();
                    if (n8 <= 0) {
                        return null;
                    }
                    if (n3 <= 0) {
                        return null;
                    }
                    if (n3 > n8) {
                        n3 = n8;
                    }
                    do {
                        n8 = -1;
                        string2 = "impl";
                        if (n3 <= 0) break block8;
                        n7 = n3 + -1;
                        if ((n7 = (int)(this.g(n7) ? 1 : 0)) != 0 || (n7 = (int)(this.f(n3) ? 1 : 0)) != 0) break block8;
                        breakIterator = this.c;
                        if (breakIterator != null) continue;
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n7 = 0;
                        breakIterator = null;
                    } while ((n3 = breakIterator.preceding(n3)) != n8);
                    return null;
                }
                if ((breakIterator = this.c) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n7 = 0;
                    breakIterator = null;
                }
                if ((n4 = breakIterator.preceding(n3)) == n8 || (n8 = (int)(this.g(n4) ? 1 : 0)) == 0) break block9;
                if (n4 == 0) break block10;
                n8 = n4 + -1;
                if ((n8 = (int)(this.g(n8) ? 1 : 0)) != 0) break block9;
            }
            return this.b(n4, n3);
        }
        return null;
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

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean f(int n3) {
        if (n3 <= 0) return 0 != 0;
        int n4 = n3 + -1;
        if ((n4 = (int)(this.g(n4) ? 1 : 0)) == 0) return 0 != 0;
        String string2 = this.c();
        n4 = string2.length();
        if (n3 == n4) return 1 != 0;
        if ((n3 = (int)(this.g(n3) ? 1 : 0)) != 0) return 0 != 0;
        return 1 != 0;
    }

    public final boolean g(int n3) {
        String string2;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (string2 = this.c()).length())) {
            return Character.isLetterOrDigit(this.c().codePointAt(n3));
        }
        return false;
    }
}

