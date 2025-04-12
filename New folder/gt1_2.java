/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from gt1
 */
public final class gt1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ ft1_2 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public gt1_2(ft1_2 ft1_22, int n3, int n4, f80_0 f80_02) {
        this.a = ft1_22;
        this.b = n3;
        this.c = n4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.b;
        int n4 = this.c;
        ft1_2 ft1_22 = this.a;
        object = new gt1_2(ft1_22, n3, n4, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (QT2)object;
        object2 = (f80_0)object2;
        object = (gt1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((gt1_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = this.a;
        int n3 = this.b;
        int n4 = this.c;
        ((ft1_2)object).l(n3, n4);
        return Unit.a;
    }
}

