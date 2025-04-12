/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/*
 * Renamed from B21
 */
public final class b21_0
implements Function1 {
    public final /* synthetic */ c21_0 a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ b21_0(c21_0 c21_02, a21_0 a21_02) {
        this.a = c21_02;
        this.b = a21_02;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.a.b;
        Runnable runnable2 = this.b;
        object.removeCallbacks(runnable2);
        return Unit.a;
    }
}

