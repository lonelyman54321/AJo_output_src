/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal
 */
import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.i;

/*
 * Renamed from O90
 */
public final class o90_0
extends Lambda
implements Function1 {
    public final /* synthetic */ CancellationSignal c;
    public final /* synthetic */ i d;

    public o90_0(CancellationSignal cancellationSignal, mb3_2 mb3_22) {
        this.c = cancellationSignal;
        this.d = mb3_22;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        object = this.c;
        if (object != null) {
            String string2 = "cancellationSignal";
            Intrinsics.checkNotNullParameter(object, string2);
            object.cancel();
        }
        this.d.d(null);
        return Unit.a;
    }
}

