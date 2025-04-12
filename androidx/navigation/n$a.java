/*
 * Decompiled with CFR 0.152.
 */
package androidx.navigation;

import androidx.navigation.i;
import androidx.navigation.n;

public final class n$a {
    public boolean a;
    public boolean b;
    public int c;
    public String d;
    public boolean e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;

    public final n a() {
        n n3;
        String string2 = this.d;
        if (string2 != null) {
            boolean bl2 = this.a;
            boolean bl3 = this.b;
            boolean bl4 = this.e;
            boolean bl5 = this.f;
            int n4 = this.g;
            int n7 = this.h;
            int n8 = this.i;
            int n10 = this.j;
            int n14 = androidx.navigation.i.j;
            int n15 = "android-app://androidx.navigation/".concat(string2).hashCode();
            n3 = new n(bl2, bl3, n15, bl4, bl5, n4, n7, n8, n10);
            n3.j = string2;
        } else {
            boolean bl6 = this.a;
            boolean bl7 = this.b;
            int n16 = this.c;
            boolean bl8 = this.e;
            boolean bl9 = this.f;
            int n17 = this.g;
            int n18 = this.h;
            int n19 = this.i;
            int n20 = this.j;
            n3 = new n(bl6, bl7, n16, bl8, bl9, n17, n18, n19, n20);
        }
        return n3;
    }
}

