/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from v00
 */
public final class v00_0
extends u00_0 {
    public final i00_0 a;

    public v00_0(i00_0 i00_02) {
        this.a = i00_02;
    }

    public final void b(h00_0 object) {
        v00$a v00$a = new v00$a((h00_0)object);
        object.a(v00$a);
        object = this.a;
        try {
            object.a(v00$a);
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            v00$a.b(throwable);
        }
    }
}

