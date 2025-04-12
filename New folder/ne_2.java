/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nE
 */
public final class ne_2
extends FunctionReferenceImpl
implements gx0_2 {
    public ne_2(Object object) {
        super(3, object, le_2.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (Throwable)object;
        object = ((vr_2)object2).a;
        object3 = (CoroutineContext)object3;
        object2 = ((le_2)this.receiver).b;
        Intrinsics.checkNotNull(object2);
        object = vr_2.a(object);
        Intrinsics.checkNotNull(object);
        hz0_2.a((Function1)object2, object, (CoroutineContext)object3);
        return Unit.a;
    }
}

