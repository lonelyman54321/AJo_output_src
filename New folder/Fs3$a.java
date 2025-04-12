/*
 * Decompiled with CFR 0.152.
 */
public final class Fs3$a
implements UW2 {
    public final Vm2 a;
    public final /* synthetic */ Fs3 b;

    public Fs3$a(Fs3 object) {
        this.b = object;
        int n3 = 4;
        byte[] byArray = new byte[n3];
        this.a = object = new Vm2(byArray, n3);
    }

    public final void a(Xm2 xm2) {
        Fs3 fs3;
        int n3 = xm2.w();
        if (n3 != 0) {
            return;
        }
        n3 = xm2.w() & 0x80;
        if (n3 == 0) {
            return;
        }
        xm2.J(6);
        n3 = xm2.a();
        int n4 = 4;
        n3 /= n4;
        int n7 = 0;
        while (true) {
            fs3 = this.b;
            if (n7 >= n3) break;
            Vm2 vm2 = this.a;
            Object object = vm2.a;
            xm2.g(0, (byte[])object, n4);
            vm2.m(0);
            int n8 = vm2.g(16);
            vm2.o(3);
            int n10 = 13;
            if (n8 == 0) {
                vm2.o(n10);
            } else {
                int n14 = vm2.g(n10);
                object = fs3.i.get(n14);
                if (object == null) {
                    object = fs3.i;
                    Fs3$b fs3$b = new Fs3$b(fs3, n14);
                    vw2_0 vw2_02 = new vw2_0(fs3$b);
                    object.put(n14, (Object)vw2_02);
                    fs3.o = n14 = fs3.o + 1;
                }
            }
            ++n7;
        }
        int n15 = fs3.a;
        n3 = 2;
        if (n15 != n3) {
            xm2 = fs3.i;
            xm2.remove(0);
        }
    }

    public final void b(On3 on3, gi0_0 gi0_02, Gs3$d gs3$d) {
    }
}

