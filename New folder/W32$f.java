/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class W32$f
extends Lambda
implements Function2 {
    public final /* synthetic */ w32_0 c;

    public W32$f(w32_0 w32_02) {
        this.c = w32_02;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (iL)object;
        object2 = (W01)object2;
        w32_0 w32_02 = this.c;
        Object object3 = w32_02.m;
        boolean bl2 = ((xp1_0)object3).L();
        if (bl2) {
            object3 = aq1_0.a(w32_02.m).getSnapshotObserver();
            W32$c w32$c = w32_0.J;
            X32 x32 = new X32(w32_02, (iL)object, (W01)object2);
            ((ch2)object3).a(w32_02, w32$c, x32);
            boolean bl3 = false;
            object = null;
            w32_02.F = false;
        } else {
            boolean bl4;
            w32_02.F = bl4 = true;
        }
        return Unit.a;
    }
}

