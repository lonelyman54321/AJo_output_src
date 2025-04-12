/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from DA2
 */
public final class da2_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tr1_0 b;
    public final /* synthetic */ tr1_0 c;

    public da2_2(int n3, tr1_0 tr1_02, tr1_0 tr1_03, f80_0 f80_02) {
        this.a = n3;
        this.b = tr1_02;
        this.c = tr1_03;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tr1_0 tr1_02 = this.b;
        tr1_0 tr1_03 = this.c;
        int n3 = this.a;
        object = new da2_2(n3, tr1_02, tr1_03, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (da2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((da2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = this.a;
        this.b.setValue(object);
        object = Boolean.TRUE;
        this.c.setValue(object);
        return Unit.a;
    }
}

