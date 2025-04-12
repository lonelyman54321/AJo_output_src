/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.Unit;

public final class ET1$a
implements fs0_2 {
    public final /* synthetic */ ib3_0 a;
    public final /* synthetic */ tr1_0 b;
    public final /* synthetic */ qr1_1 c;

    public ET1$a(tr1_0 tr1_02, tr1_0 tr1_03, qr1_1 qr1_12) {
        this.a = tr1_02;
        this.b = tr1_03;
        this.c = qr1_12;
    }

    public final Object emit(Object object, f80_0 object2) {
        int n3;
        object = (uu_0)object;
        object2 = (List)this.a.getValue();
        int n4 = object2.size();
        if (n4 > (n3 = 1)) {
            object2 = Boolean.TRUE;
            tr1_0 tr1_02 = this.b;
            tr1_02.setValue(object2);
            float f5 = ((uu_0)object).c;
            object2 = this.c;
            object2.k(f5);
        }
        return Unit.a;
    }
}

