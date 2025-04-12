/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from eT0
 */
public final class et0_2
implements es0_2 {
    public final /* synthetic */ es0_2 a;
    public final /* synthetic */ int b;

    public et0_2(i23_0 i23_02, int n3) {
        this.a = i23_02;
        this.b = n3;
    }

    public final Object collect(fs0_2 object, f80_0 object2) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        int n3 = this.b;
        ft0_2 ft0_22 = new ft0_2(ref$IntRef, n3, (fs0_2)object);
        if ((object = this.a.collect(ft0_22, (f80_0)object2)) == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        return Unit.a;
    }
}

