/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from l30
 */
public final class l30_0
extends Lambda
implements Function0 {
    public final /* synthetic */ j30_0 c;
    public final /* synthetic */ zr_1 d;
    public final /* synthetic */ k73 e;
    public final /* synthetic */ vQ1 f;

    public l30_0(j30_0 j30_02, zr_1 zr_12, k73 k732, vQ1 vQ12) {
        this.c = j30_02;
        this.d = zr_12;
        this.e = k732;
        this.f = vQ12;
        super(0);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke() {
        Throwable throwable222222;
        j30_0 j30_02 = this.c;
        d30_0 d30_02 = j30_02.L;
        Object object = this.d;
        Object object2 = this.e;
        Object object3 = this.f;
        zr_1 zr_12 = d30_02.b;
        d30_02.b = object;
        object = j30_02.F;
        int[] nArray = j30_02.n;
        Pi1 pi1 = j30_02.u;
        tq1_0 tq1_02 = null;
        j30_02.n = null;
        j30_02.u = null;
        j30_02.F = object2;
        boolean bl2 = d30_02.e;
        tq1_02 = null;
        {
            catch (Throwable throwable222222) {}
        }
        d30_02.e = false;
        tq1_02 = ((vQ1)object3).a;
        rq2_1 rq2_12 = ((vQ1)object3).g;
        object3 = ((vQ1)object3).b;
        j30_0.M(j30_02, tq1_02, rq2_12, object3);
        d30_02.e = bl2;
        object2 = Unit.a;
        j30_02.F = object;
        j30_02.n = nArray;
        j30_02.u = pi1;
        return Unit.a;
        catch (Throwable throwable3) {
            d30_02.e = bl2;
            throw throwable3;
        }
        try {
            j30_02.F = object;
            j30_02.n = nArray;
            j30_02.u = pi1;
            throw throwable222222;
        }
        catch (Throwable throwable4) {
            throw throwable4;
        }
        finally {
            d30_02.b = zr_12;
        }
    }
}

