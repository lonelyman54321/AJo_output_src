/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Cl2$g
extends Lambda
implements Function0 {
    public final /* synthetic */ Cl2 c;

    public Cl2$g(Cl2 cl2) {
        this.c = cl2;
        super(0);
    }

    /*
     * WARNING - void declaration
     */
    public final Object invoke() {
        void var3_11;
        Cl2 cl2 = this.c;
        Object object = cl2.j;
        boolean n3 = ((xm0_0)object).b();
        if (!n3) {
            int n4 = cl2.j();
        } else {
            object = cl2.r;
            int n7 = ((e83_0)object).o();
            int n8 = -1;
            float f5 = 0.0f / 0.0f;
            if (n7 != n8) {
                int n10 = ((e83_0)object).o();
            } else {
                float f6 = Math.abs(cl2.k());
                Vo0 vo0 = cl2.p;
                f5 = El2.a;
                float f7 = vo0.J0(f5);
                f5 = cl2.n();
                float f8 = 2.0f;
                f7 = Math.min(f7, f5 /= f8);
                n8 = cl2.n();
                f5 = n8;
                float f11 = f6 - (f7 = Math.abs(f7 / f5));
                Object object2 = f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1);
                if (object2 >= 0) {
                    object = (Boolean)cl2.E.getValue();
                    boolean bl2 = (Boolean)object;
                    if (bl2) {
                        int n14 = cl2.d + 1;
                    } else {
                        int n15 = cl2.d;
                    }
                } else {
                    int n16 = cl2.j();
                }
            }
        }
        return cl2.i((int)var3_11);
    }
}

