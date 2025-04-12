/*
 * Decompiled with CFR 0.152.
 */
public final class Sk3$a
implements sQ1 {
    public final /* synthetic */ Sk3 a;

    public Sk3$a(Sk3 sk3) {
        this.a = sk3;
    }

    public final void a() {
    }

    public final boolean b(long l2, PX2 pX2) {
        Object object;
        Sk3 sk3 = this.a;
        int n3 = sk3.j();
        if (n3 != 0 && (n3 = ((String)(object = sk3.l().a.a)).length()) != 0 && (object = sk3.d) != null && (object = ((Vt1)object).d()) != null) {
            ql3_0 ql3_02 = sk3.l();
            this.d(ql3_02, l2, false, pX2);
            return true;
        }
        return false;
    }

    public final boolean c(long l2, PX2 pX2) {
        Object object;
        Sk3 sk3 = this.a;
        int n3 = sk3.j();
        ql3_0 ql3_02 = null;
        if (n3 != 0 && (n3 = ((String)(object = sk3.l().a.a)).length()) != 0 && (object = sk3.d) != null && (object = ((Vt1)object).d()) != null) {
            object = sk3.j;
            if (object != null) {
                ((ou0_0)object).b();
            }
            sk3.m = l2;
            sk3.r = -1;
            boolean bl2 = true;
            sk3.h(bl2);
            ql3_02 = sk3.l();
            long l3 = sk3.m;
            object = this;
            this.d(ql3_02, l3, true, pX2);
            return bl2;
        }
        return false;
    }

    public final void d(ql3_0 object, long l2, boolean bl2, PX2 pX2) {
        Sk3 sk3 = this.a;
        long l3 = Sk3.c(sk3, object, l2, bl2, false, pX2, false);
        boolean bl3 = mm3.b(l3);
        object = bl3 ? x21_0.Cursor : x21_0.Selection;
        this.a.r((x21_0)((Object)object));
    }
}

