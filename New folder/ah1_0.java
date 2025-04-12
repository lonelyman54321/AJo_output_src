/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ah1
 */
public final class ah1_0
extends Lambda
implements Function1 {
    public final /* synthetic */ vg1_0 c;
    public final /* synthetic */ Vg1$a d;

    public ah1_0(vg1_0 vg1_02, Vg1$a vg1$a) {
        this.c = vg1_02;
        this.d = vg1$a;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Dr0)object;
        object = this.c;
        Object object2 = ((vg1_0)object).a;
        Vg1$a vg1$a = this.d;
        ((WR1)object2).b(vg1$a);
        object2 = Boolean.TRUE;
        ((vg1_0)object).b.setValue(object2);
        object2 = new Zg1((vg1_0)object, vg1$a);
        return object2;
    }
}

