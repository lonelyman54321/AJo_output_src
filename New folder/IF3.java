/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collections;
import java.util.Set;

public final class IF3 {
    public String a;
    public String b;
    public Set c;
    public String d;
    public String e;
    public int f;
    public boolean g;
    public int h;
    public boolean i;
    public final int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public float o;
    public int p;
    public boolean q;

    public IF3() {
        int n3;
        Set set;
        String string2;
        this.a = string2 = "";
        this.b = string2;
        this.c = set = Collections.emptySet();
        this.d = string2;
        this.e = null;
        this.g = false;
        this.i = false;
        this.j = n3 = -1;
        this.k = n3;
        this.l = n3;
        this.m = n3;
        this.n = n3;
        this.p = n3;
        this.q = false;
    }

    public static int a(int n3, int n4, String string2, String string3) {
        int n7 = string2.isEmpty();
        if (n7 == 0 && n3 != (n7 = -1)) {
            boolean bl2 = string2.equals(string3);
            if (bl2) {
                n7 = n3 + n4;
            }
            return n7;
        }
        return n3;
    }
}

