/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/*
 * Renamed from Bl1
 */
public final class bl1_2
extends FunctionReferenceImpl
implements Function1 {
    public bl1_2(Object object) {
        super(1, object, cl1_2.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        ((cl1_2)this.receiver).j((Throwable)object);
        return Unit.a;
    }
}

