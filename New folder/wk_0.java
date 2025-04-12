/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from wk
 */
public final class wk_0
implements Cr0 {
    public final /* synthetic */ p83_0 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Hk c;

    public wk_0(p83_0 p83_02, Object object, Hk hk) {
        this.a = p83_02;
        this.b = object;
        this.c = hk;
    }

    public final void dispose() {
        p83_0 p83_02 = this.a;
        Object object = this.b;
        p83_02.remove(object);
        this.c.d.g(object);
    }
}

