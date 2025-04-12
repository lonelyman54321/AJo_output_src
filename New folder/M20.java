/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal
 */
import android.os.CancellationSignal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class M20
extends Lambda
implements Function1 {
    public final /* synthetic */ CancellationSignal c;

    public M20(CancellationSignal cancellationSignal) {
        this.c = cancellationSignal;
        super(1);
    }

    public final Object invoke(Object object) {
        if ((object = (Throwable)object) != null) {
            object = this.c;
            object.cancel();
        }
        return Unit.a;
    }
}

