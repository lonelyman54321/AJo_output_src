/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Mg3$d
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ol_1 e;
    public final /* synthetic */ il_0 f;
    public final /* synthetic */ Function1 g;

    public Mg3$d(Ref$ObjectRef ref$ObjectRef, float f5, ol_1 ol_12, il_0 il_02, Function1 function1) {
        this.c = ref$ObjectRef;
        this.d = f5;
        this.e = ol_12;
        this.f = il_02;
        this.g = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((Number)object).longValue();
        object = this.c.element;
        Intrinsics.checkNotNull(object);
        Object object2 = object;
        object2 = (tl_1)object;
        il_0 il_02 = this.f;
        Function1 function1 = this.g;
        float f5 = this.d;
        ol_1 ol_12 = this.e;
        mg3_0.g((tl_1)object2, l2, f5, ol_12, il_02, function1);
        return Unit.a;
    }
}

