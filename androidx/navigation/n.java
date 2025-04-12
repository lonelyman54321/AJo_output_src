/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import kotlin.jvm.internal.Intrinsics;

public final class n {
    public final boolean a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public String j;

    public n() {
        throw null;
    }

    public n(boolean bl2, boolean bl3, int n3, boolean bl4, boolean bl5, int n4, int n7, int n8, int n10) {
        this.a = bl2;
        this.b = bl3;
        this.c = n3;
        this.d = bl4;
        this.e = bl5;
        this.f = n4;
        this.g = n7;
        this.h = n8;
        this.i = n10;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    int n3;
                    String string2;
                    String string3;
                    int n4;
                    bl2 = true;
                    if (this == object) {
                        return bl2;
                    }
                    if (object == null || (n4 = object instanceof n) == 0) break block4;
                    object = (n)object;
                    int n7 = this.a;
                    n4 = ((n)object).a;
                    if (n7 != n4 || (n4 = this.b) != (n7 = ((n)object).b) || (n4 = this.c) != (n7 = ((n)object).c) || (n4 = (int)(Intrinsics.areEqual(string3 = this.j, string2 = ((n)object).j) ? 1 : 0)) == 0) break block5;
                    string3 = null;
                    n7 = 0;
                    string2 = null;
                    object.getClass();
                    n4 = (int)(Intrinsics.areEqual(null, null) ? 1 : 0);
                    if (n4 == 0) break block5;
                    string3 = null;
                    n7 = 0;
                    string2 = null;
                    object.getClass();
                    n4 = (int)(Intrinsics.areEqual(null, null) ? 1 : 0);
                    if (n4 != 0 && (n4 = (int)(this.d ? 1 : 0)) == (n7 = (int)(((n)object).d ? 1 : 0)) && (n4 = (int)(this.e ? 1 : 0)) == (n7 = (int)(((n)object).e ? 1 : 0)) && (n4 = this.f) == (n7 = ((n)object).f) && (n4 = this.g) == (n7 = ((n)object).g) && (n4 = this.h) == (n7 = ((n)object).h) && (n4 = this.i) == (n3 = ((n)object).i)) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a * 31;
        int n7 = this.b;
        n4 = (n4 + n7) * 31;
        int n8 = this.c;
        n4 = (n4 + n8) * 31;
        boolean bl2 = false;
        String string2 = this.j;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n4 = (((n4 + n3) * 31 + 0) * 31 + 0) * 31;
        int n10 = this.d;
        n4 = (n4 + n10) * 31;
        int n14 = this.e;
        n4 = (n4 + n14) * 31;
        int n15 = this.f;
        n4 = (n4 + n15) * 31;
        int n16 = this.g;
        n4 = (n4 + n16) * 31;
        int n17 = this.h;
        n4 = (n4 + n17) * 31;
        int n18 = this.i;
        return n4 + n18;
    }

    public final String toString() {
        String string2;
        CharSequence charSequence = new StringBuilder();
        String string3 = n.class.getSimpleName();
        ((StringBuilder)charSequence).append(string3);
        string3 = "(";
        ((StringBuilder)charSequence).append(string3);
        boolean bl2 = this.a;
        if (bl2) {
            string3 = "launchSingleTop ";
            ((StringBuilder)charSequence).append(string3);
        }
        if (bl2 = this.b) {
            string3 = "restoreState ";
            ((StringBuilder)charSequence).append(string3);
        }
        string3 = ")";
        int n3 = this.c;
        String string4 = this.j;
        int n4 = -1;
        if ((string4 != null || n3 != n4) && string4 != null) {
            String string5 = "popUpTo(";
            ((StringBuilder)charSequence).append(string5);
            if (string4 != null) {
                ((StringBuilder)charSequence).append(string4);
            } else {
                string4 = "0x";
                ((StringBuilder)charSequence).append(string4);
                string2 = Integer.toHexString(n3);
                ((StringBuilder)charSequence).append(string2);
            }
            n3 = (int)(this.d ? 1 : 0);
            if (n3 != 0) {
                string2 = " inclusive";
                ((StringBuilder)charSequence).append(string2);
            }
            if ((n3 = (int)(this.e ? 1 : 0)) != 0) {
                string2 = " saveState";
                ((StringBuilder)charSequence).append(string2);
            }
            ((StringBuilder)charSequence).append(string3);
        }
        n3 = this.i;
        int n7 = this.h;
        int n8 = this.g;
        int n10 = this.f;
        if (n10 != n4 || n8 != n4 || n7 != n4 || n3 != n4) {
            ((StringBuilder)charSequence).append("anim(enterAnim=0x");
            String string6 = Integer.toHexString(n10);
            ((StringBuilder)charSequence).append(string6);
            ((StringBuilder)charSequence).append(" exitAnim=0x");
            string6 = Integer.toHexString(n8);
            ((StringBuilder)charSequence).append(string6);
            string6 = " popEnterAnim=0x";
            ((StringBuilder)charSequence).append(string6);
            string4 = Integer.toHexString(n7);
            ((StringBuilder)charSequence).append(string4);
            string4 = " popExitAnim=0x";
            ((StringBuilder)charSequence).append(string4);
            string2 = Integer.toHexString(n3);
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(string3);
        }
        charSequence = ((StringBuilder)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "sb.toString()");
        return charSequence;
    }
}

