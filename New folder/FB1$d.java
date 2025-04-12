/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public final class FB1$d
extends qg3_2
implements Function1 {
    public final /* synthetic */ fb1_0 a;
    public final /* synthetic */ QB1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;

    public FB1$d(fb1_0 fb1_02, QB1 qB1, float f5, int n3, boolean bl2, f80_0 f80_02) {
        this.a = fb1_02;
        this.b = qB1;
        this.c = f5;
        this.d = n3;
        this.e = bl2;
        super(1, f80_02);
    }

    public final f80_0 create(f80_0 f80_02) {
        int n3 = this.d;
        boolean bl2 = this.e;
        fb1_0 fb1_02 = this.a;
        QB1 qB1 = this.b;
        float f5 = this.c;
        FB1$d fB1$d = new FB1$d(fb1_02, qB1, f5, n3, bl2, f80_02);
        return fB1$d;
    }

    public final Object invoke(Object object) {
        object = (f80_0)object;
        object = (FB1$d)this.create((f80_0)object);
        Unit unit = Unit.a;
        return ((FB1$d)object).invokeSuspend(unit);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        object2 = ((fb1_0)object).i;
        Object object3 = this.b;
        ((h83_0)object2).setValue(object3);
        float f5 = this.c;
        ((fb1_0)object).t(f5);
        int n3 = this.d;
        ((fb1_0)object).i(n3);
        object2 = Boolean.FALSE;
        object3 = ((fb1_0)object).a;
        ((h83_0)object3).setValue(object2);
        n3 = (int)(this.e ? 1 : 0);
        if (n3 != 0) {
            long l2 = Long.MIN_VALUE;
            object2 = l2;
            object = ((fb1_0)object).l;
            ((h83_0)object).setValue(object2);
        }
        return Unit.a;
    }
}

