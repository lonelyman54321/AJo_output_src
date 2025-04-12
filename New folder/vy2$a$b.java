/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class vy2$a$b
extends Lambda
implements Function1 {
    public final /* synthetic */ Ref$ObjectRef c;

    public vy2$a$b(Ref$ObjectRef ref$ObjectRef) {
        this.c = ref$ObjectRef;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (yr3_0)object;
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
        object = ((as3)object).n;
        Ref$ObjectRef ref$ObjectRef = this.c;
        Object object2 = (Object[])ref$ObjectRef.element;
        if (object2 != null) {
            object2.add(object);
        } else {
            int n3 = 1;
            object2 = new xs1[n3];
            object2[0] = object;
            object2 = xx_2.j(object2);
        }
        ref$ObjectRef.element = object2;
        return Xr3.SkipSubtreeAndContinueTraversal;
    }
}

