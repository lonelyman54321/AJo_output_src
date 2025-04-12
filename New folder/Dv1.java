/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class Dv1
implements Runnable {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ kn1_0 d;

    public /* synthetic */ Dv1(Ref$ObjectRef objectRef, Function2 function2, Object object, kn1_0 kn1_02) {
        this.a = objectRef;
        this.b = function2;
        this.c = object;
        this.d = kn1_02;
    }

    public final void run() {
        boolean bl2;
        Ref$ObjectRef ref$ObjectRef = this.a;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$old");
        Function2 function2 = this.b;
        Intrinsics.checkNotNullParameter(function2, "$areEqual");
        kn1_0 kn1_02 = this.d;
        Intrinsics.checkNotNullParameter(kn1_02, "$distinctMediator");
        Object object = ref$ObjectRef.element;
        Object object2 = ft0.b;
        Object object3 = this.c;
        if (object == object2 || !(bl2 = ((Boolean)(object = (Boolean)function2.invoke(object, object3))).booleanValue())) {
            ref$ObjectRef.element = object3;
            kn1_02.i(object3);
        }
    }
}

