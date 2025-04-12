/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

/*
 * Renamed from Tq0
 */
public final class tq0_2
extends pv0_2 {
    public boolean b;
    public final /* synthetic */ rq0_2 c;
    public final /* synthetic */ rq0$b_0 d;

    public tq0_2(a93_0 a93_02, rq0_2 rq0_22, rq0$b_0 rq0$b_0) {
        this.c = rq0_22;
        this.d = rq0$b_0;
        super(a93_02);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        super.close();
        boolean bl2 = this.b;
        if (bl2) return;
        this.b = bl2 = true;
        rq0_2 rq0_22 = this.c;
        Object object = this.d;
        synchronized (rq0_22) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        int n3;
                        ((rq0$b_0)object).h = n3 = ((rq0$b_0)object).h + -1;
                        if (n3 != 0 || (n3 = (int)(((rq0$b_0)object).f ? 1 : 0)) == 0) break block3;
                        rq0_22.z((rq0$b_0)object);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }
}

