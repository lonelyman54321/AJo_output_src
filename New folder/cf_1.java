/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from CF
 */
public final class cf_1
extends DF$a {
    public int a = 0;
    public final int b;
    public final /* synthetic */ DF c;

    public cf_1(DF dF) {
        int n3;
        this.c = dF;
        this.b = n3 = dF.size();
    }

    public final boolean hasNext() {
        int n3 = this.a;
        int n4 = this.b;
        n3 = n3 < n4 ? 1 : 0;
        return n3 != 0;
    }
}

