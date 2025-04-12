/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class Zk$b
implements fs0_2 {
    public final /* synthetic */ Mz2 a;
    public final /* synthetic */ gr3 b;
    public final /* synthetic */ ib3_0 c;

    public Zk$b(Mz2 mz2, gr3 gr32, tr1_0 tr1_02) {
        this.a = mz2;
        this.b = gr32;
        this.c = tr1_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        boolean bl2 = (Boolean)(object = (Boolean)object);
        if (bl2) {
            object = (Function2)this.c.getValue();
            object2 = this.b;
            Object object3 = ((gr3)object2).a.a();
            object2 = ((gr3)object2).d.getValue();
            object = (Boolean)object.invoke(object3, object2);
            bl2 = (Boolean)object;
        } else {
            bl2 = false;
            object = null;
        }
        object = bl2;
        this.a.setValue(object);
        return Unit.a;
    }
}

