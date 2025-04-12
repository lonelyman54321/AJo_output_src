/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Js0$b
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ js0_1 d;
    public final /* synthetic */ cs0_0 e;

    public Js0$b(Ref$ObjectRef ref$ObjectRef, js0_1 js0_12, cs0_0 cs0_02) {
        this.c = ref$ObjectRef;
        this.d = js0_12;
        this.e = cs0_02;
        super(1);
    }

    public final Object invoke(Object object) {
        float f5;
        float f6;
        long l2;
        boolean bl2;
        Object object2 = object = (yr3_0)object;
        object2 = (js0_1)object;
        Ds0 ds0 = go0.g(this.d).getDragAndDropManager();
        boolean bl3 = ds0.b((Es0)object2);
        if (bl3 && (bl2 = Ks0.a((Es0)object2, l2 = h72.a(f6 = (ds0 = this.e.a).getX(), f5 = ds0.getY())))) {
            object2 = this.c;
            ((Ref$ObjectRef)object2).element = object;
            object = Xr3.CancelTraversal;
        } else {
            object = Xr3.ContinueTraversal;
        }
        return object;
    }
}

