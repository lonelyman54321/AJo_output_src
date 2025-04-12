/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class YT2$a
extends qg3_2
implements Function2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ long b;

    public YT2$a(long l2, f80_0 f80_02) {
        this.b = l2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        long l2 = this.b;
        YT2$a yT2$a = new YT2$a(l2, f80_02);
        yT2$a.a = object;
        return yT2$a;
    }

    public final Object invoke(Object object, Object object2) {
        object = (tU1)object;
        object2 = (f80_0)object2;
        object = (YT2$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((YT2$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        vl2_2.b(object);
        object = (tU1)this.a;
        long l2 = this.b;
        object.a(l2);
        return Unit.a;
    }
}

