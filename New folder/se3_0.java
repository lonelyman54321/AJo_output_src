/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from sE3
 */
public class se3_0
extends F41 {
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public int E0 = 0;
    public boolean F0 = false;
    public int G0 = 0;
    public int H0 = 0;
    public final Zw$a I0;
    public Zw$b J0;
    public int z0 = 0;

    public se3_0() {
        Zw$a zw$a;
        this.I0 = zw$a;
        this.J0 = null;
    }

    public void a0(int n3, int n4, int n7, int n8) {
    }

    public final void b0(Y50 y50, Y50$b y50$b, int n3, Y50$b y50$b2, int n4) {
        Object object;
        Zw$b zw$b;
        while ((zw$b = this.J0) == null && (object = this.X) != null) {
            object = (Z50)object;
            this.J0 = zw$b = ((Z50)object).B0;
        }
        object = this.I0;
        ((Zw$a)object).a = y50$b;
        ((Zw$a)object).b = y50$b2;
        ((Zw$a)object).c = n3;
        ((Zw$a)object).d = n4;
        zw$b.b(y50, (Zw$a)object);
        int n7 = ((Zw$a)object).e;
        y50.W(n7);
        n7 = ((Zw$a)object).f;
        y50.R(n7);
        n7 = (int)(((Zw$a)object).h ? 1 : 0);
        y50.G = n7;
        n7 = ((Zw$a)object).g;
        y50.N(n7);
    }

    public final void c() {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.y0); ++i3) {
            boolean bl2;
            Y50 y50 = this.x0[i3];
            if (y50 == null) continue;
            y50.I = bl2 = true;
        }
    }
}

