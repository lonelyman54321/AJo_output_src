/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.FunctionReferenceImpl;

public final class zR2$a
extends FunctionReferenceImpl
implements gx0_2 {
    public static final zR2$a a;

    static {
        zR2$a zR2$a;
        a = zR2$a = new FunctionReferenceImpl(3, fs0_2.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (fs0_2)object;
        object3 = (f80_0)object3;
        return object.emit(object2, (f80_0)object3);
    }
}

