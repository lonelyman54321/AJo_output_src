/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;

public final class oY2$b
implements fs0_2 {
    public final /* synthetic */ Lj a;
    public final /* synthetic */ i90_0 b;

    public oY2$b(Lj lj, i90_0 i90_02) {
        this.a = lj;
        this.b = i90_02;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object emit(Object object, f80_0 object2) {
        j90_0 j90_02;
        boolean bl2;
        long l2 = ((e72)object).a;
        object = this.a;
        e72 e722 = (e72)((Lj)object).d();
        long l3 = e722.a;
        boolean bl3 = h72.c(l3);
        if (bl3 && (bl2 = h72.c(l2))) {
            float f5;
            e722 = (e72)((Lj)object).d();
            l3 = e722.a;
            float f6 = e72.e(l3);
            float f7 = f6 - (f5 = e72.e(l2));
            Object object3 = f7 == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1);
            if (object3 != false) {
                boolean bl4 = false;
                f6 = 0.0f;
                e722 = null;
                py2_1 py2_12 = new py2_1((Lj)object, l2, null);
                object = this.b;
                int n3 = 3;
                Ae3.d((i90_0)object, null, null, py2_12, n3);
                return Unit.a;
            }
        }
        if ((object = ((Lj)object).e((f80_0)object2, e722 = new e72(l2))) != (j90_02 = j90_0.COROUTINE_SUSPENDED)) return Unit.a;
        return object;
    }
}

