/*
 * Decompiled with CFR 0.152.
 */
public abstract class qn2 {
    public final boolean a;
    public final boolean b;

    public qn2(int n3, boolean bl2, boolean bl3) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            bl2 = false;
        }
        if ((n3 &= 2) != 0) {
            bl3 = false;
        }
        this.a = bl2;
        this.b = bl3;
    }
}

