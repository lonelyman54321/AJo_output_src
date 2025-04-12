/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;

public final class Jj$a
extends Lambda
implements Function1 {
    public final /* synthetic */ Lj c;
    public final /* synthetic */ il_0 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Ref$BooleanRef f;

    public Jj$a(Lj lj, il_0 il_02, Function1 function1, Ref$BooleanRef ref$BooleanRef) {
        this.c = lj;
        this.d = il_02;
        this.e = function1;
        this.f = ref$BooleanRef;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (tl_1)object;
        Lj lj = this.c;
        Object object2 = lj.c;
        mg3_0.i((tl_1)object, (il_0)object2);
        object2 = ((tl_1)object).e;
        Object object3 = ((h83_0)object2).getValue();
        object3 = Lj.a(lj, object3);
        object2 = ((h83_0)object2).getValue();
        boolean bl2 = Intrinsics.areEqual(object3, object2);
        Function1 function1 = this.e;
        if (!bl2) {
            boolean bl3;
            lj.c.b.setValue(object3);
            object2 = this.d.b;
            ((h83_0)object2).setValue(object3);
            if (function1 != null) {
                function1.invoke(lj);
            }
            ((tl_1)object).a();
            object = this.f;
            ((Ref$BooleanRef)object).element = bl3 = true;
        } else if (function1 != null) {
            function1.invoke(lj);
        }
        return Unit.a;
    }
}

