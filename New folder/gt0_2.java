/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from gT0
 */
public final class gt0_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ Function2 b;

    public gt0_2(qr_2 qr_22, Cb3$b cb3$b) {
        this.a = qr_22;
        this.b = cb3$b;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        Function2 function2 = this.b;
        ht0_2 ht0_22 = new ht0_2(ref$BooleanRef, (fs0_2)object, function2);
        if ((object = this.a.collect(ht0_22, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

