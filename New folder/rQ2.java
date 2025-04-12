/*
 * Decompiled with CFR 0.152.
 */
public final class rQ2 {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;

    public final void a(int n3, int n4) {
        this.c = n3;
        this.d = n4;
        this.h = true;
        boolean bl2 = this.g;
        int n7 = -1 << -1;
        if (bl2) {
            if (n4 != n7) {
                this.a = n4;
            }
            if (n3 != n7) {
                this.b = n3;
            }
        } else {
            if (n3 != n7) {
                this.a = n3;
            }
            if (n4 != n7) {
                this.b = n4;
            }
        }
    }
}

