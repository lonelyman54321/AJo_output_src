/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from H53
 */
public final class h53_0
extends g53_0 {
    public final v53_0 a;

    public h53_0(v53_0 v53_02) {
        this.a = v53_02;
    }

    public final void g(t53_0 object) {
        block3: {
            H53$a h53$a = new H53$a((t53_0)object);
            object.a(h53$a);
            object = this.a;
            try {
                object.b(h53$a);
            }
            catch (Throwable throwable) {
                mm0.h(throwable);
                boolean bl2 = h53$a.b(throwable);
                if (bl2) break block3;
                dr2_2.b(throwable);
            }
        }
    }
}

