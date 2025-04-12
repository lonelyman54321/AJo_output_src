/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class Iu1
implements fs0_2 {
    public final /* synthetic */ hr1_0 a;
    public final /* synthetic */ Ju1 b;

    public Iu1(hr1_0 hr1_02, Ju1 ju1) {
        this.a = hr1_02;
        this.b = ju1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object emit(Object object, f80_0 object2) {
        kj1 kj12 = (kj1)object;
        int n3 = kj12 instanceof x91;
        int n4 = 1;
        if ((n3 = n3 != 0 ? 1 : kj12 instanceof rt0_0) == 0) {
            n4 = kj12 instanceof Ey2$b;
        }
        hr1_0 hr1_02 = this.a;
        if (n4 != 0) {
            hr1_02.b(kj12);
        } else {
            n4 = kj12 instanceof y91;
            if (n4 != 0) {
                x91 x912 = ((y91)kj12).a;
                hr1_02.c(x912);
            } else {
                n4 = kj12 instanceof ST0;
                if (n4 != 0) {
                    rt0_0 rt0_02 = ((ST0)kj12).a;
                    hr1_02.c(rt0_02);
                } else {
                    n4 = kj12 instanceof Ey2$c;
                    if (n4 != 0) {
                        Ey2$b ey2$b = ((Ey2$c)kj12).a;
                        hr1_02.c(ey2$b);
                    } else {
                        n4 = kj12 instanceof Ey2$a;
                        if (n4 != 0) {
                            Ey2$b ey2$b = ((Ey2$a)kj12).a;
                            hr1_02.c(ey2$b);
                        }
                    }
                }
            }
        }
        Object[] objectArray = hr1_02.a;
        n3 = hr1_02.b;
        n4 = 0;
        int n7 = 0;
        while (true) {
            block18: {
                int n8;
                block16: {
                    kj1 kj13;
                    Ju1 ju1;
                    block17: {
                        boolean bl2;
                        block15: {
                            ju1 = this.b;
                            if (n4 >= n3) {
                                ju1.d.e(n7);
                                return Unit.a;
                            }
                            kj13 = (kj1)objectArray[n4];
                            bl2 = kj13 instanceof x91;
                            if (!bl2) break block15;
                            n8 = ju1.b;
                            break block16;
                        }
                        bl2 = kj13 instanceof rt0_0;
                        if (!bl2) break block17;
                        n8 = ju1.a;
                        break block16;
                    }
                    boolean bl3 = kj13 instanceof Ey2$b;
                    if (!bl3) break block18;
                    n8 = ju1.c;
                }
                n7 |= n8;
            }
            ++n4;
        }
    }
}

