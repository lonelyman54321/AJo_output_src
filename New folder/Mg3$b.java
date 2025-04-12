/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Mg3$b
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ ol_1 e;
    public final /* synthetic */ Ol f;
    public final /* synthetic */ il_0 g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Function1 i;

    public Mg3$b(Ref$ObjectRef ref$ObjectRef, Object object, ol_1 ol_12, Ol ol, il_0 il_02, float f5, Function1 function1) {
        this.c = ref$ObjectRef;
        this.d = object;
        this.e = ol_12;
        this.f = ol;
        this.g = il_02;
        this.h = f5;
        this.i = function1;
        super(1);
    }

    public final Object invoke(Object object) {
        long l2 = ((Number)object).longValue();
        Object object2 = this.e;
        Vs3 vs3 = object2.f();
        Object object3 = object2.h();
        object2 = this.g;
        ng3_2 ng3_22 = new ng3_2((il_0)object2);
        Ol ol = this.f;
        Object object4 = this.d;
        object2 = object;
        object = new tl_1(object4, vs3, ol, l2, object3, l2, ng3_22);
        float f5 = this.h;
        ol_1 ol_12 = this.e;
        il_0 il_02 = this.g;
        object3 = this.i;
        mg3_0.g((tl_1)object, l2, f5, ol_12, il_02, (Function1)object3);
        this.c.element = object;
        return Unit.a;
    }
}

