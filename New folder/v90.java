/*
 * Decompiled with CFR 0.152.
 */
import androidx.concurrent.futures.AbstractResolvableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class v90
extends Lambda
implements Function1 {
    public final /* synthetic */ eK$a c;
    public final /* synthetic */ vn0_2 d;

    public v90(eK$a eK$a, vn0_2 vn0_22) {
        this.c = eK$a;
        this.d = vn0_22;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (Throwable)object;
        eK$a eK$a = this.c;
        if (object != null) {
            boolean bl2 = object instanceof CancellationException;
            if (bl2) {
                boolean bl3;
                eK$a.d = bl3 = true;
                ListenableFuture listenableFuture = eK$a.b;
                if (listenableFuture != null && (bl3 = ((AbstractResolvableFuture)(listenableFuture = ((eK$d)listenableFuture).b)).cancel(bl3))) {
                    bl3 = false;
                    object = null;
                    eK$a.a = null;
                    eK$a.b = null;
                    eK$a.c = null;
                }
            } else {
                eK$a.b((Throwable)object);
            }
        } else {
            object = this.d.k();
            eK$a.a(object);
        }
        return Unit.a;
    }
}

