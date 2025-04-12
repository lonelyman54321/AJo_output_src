/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.connection.RealCall;

/*
 * Renamed from M72
 */
public final class m72_0
implements Function1 {
    public final /* synthetic */ ij_2 a;

    public m72_0(RealCall realCall) {
        this.a = realCall;
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        this.a.cancel();
        return Unit.a;
    }
}

