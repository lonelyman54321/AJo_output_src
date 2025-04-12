/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.d;

public final class QD
extends LP1$c
implements JD,
xp1_1,
yr3_0 {
    public static final QD$a p;
    public PD n;
    public boolean o;

    static {
        QD$a qD$a;
        p = qD$a = new Object();
    }

    public static final aG2 r1(QD object, w32_0 w32_02, Function0 object2) {
        boolean bl2 = ((LP1$c)object).m;
        aG2 aG22 = null;
        if (bl2 && (bl2 = ((QD)object).o)) {
            float f5;
            object = go0.e((fo0)object);
            LP1$c lP1$c = w32_02.j1();
            bl2 = lP1$c.m;
            if (!bl2) {
                w32_02 = null;
                f5 = 0.0f;
            }
            if (w32_02 != null && (object2 = (aG2)object2.invoke()) != null) {
                bl2 = false;
                lP1$c = null;
                object = ((w32_0)object).G(w32_02, false);
                f5 = ((aG2)object).a;
                float f6 = ((aG2)object).b;
                long l2 = h72.a(f5, f6);
                aG22 = ((aG2)object2).i(l2);
            }
        }
        return aG22;
    }

    public final Object Q(w32_0 object, Function0 object2, f80_0 f80_02) {
        SD sD = new SD(this, (w32_0)object, (Function0)object2);
        RD rD = new RD(this, (w32_0)object, (Function0)object2, sD, null);
        if ((object = kotlinx.coroutines.d.c(rD, f80_02)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }

    public final boolean g1() {
        return false;
    }

    public final void o0(zp1 zp12) {
        this.o = true;
    }

    public final Object v() {
        return p;
    }

    public final /* synthetic */ void x(long l2) {
    }
}

