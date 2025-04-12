/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from ea3
 */
public final class ea3_0
extends mi1_2 {
    public int a;
    public final /* synthetic */ ca3 b;

    public ea3_0(ca3 ca32) {
        this.b = ca32;
    }

    public final boolean hasNext() {
        int n3 = this.a;
        ca3 ca32 = this.b;
        int n4 = ca32.j();
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }

    public final int nextInt() {
        int n3;
        int n4 = this.a;
        this.a = n3 = n4 + 1;
        return this.b.g(n4);
    }
}

