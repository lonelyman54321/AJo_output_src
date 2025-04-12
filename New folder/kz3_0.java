/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.i;

/*
 * Renamed from Kz3
 */
public final class kz3_0
implements Function1 {
    public final /* synthetic */ i a;

    public kz3_0(xl1_2 xl1_22) {
        this.a = xl1_22;
    }

    public final Object invoke(Object object) {
        if ((object = (Throwable)object) != null) {
            object = ((Throwable)object).getMessage();
            CancellationException cancellationException = new CancellationException((String)object);
            object = this.a;
            object.d(cancellationException);
        }
        return Unit.a;
    }
}

