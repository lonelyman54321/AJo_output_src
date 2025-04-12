/*
 * Decompiled with CFR 0.152.
 */
import io.reactivex.internal.functions.Functions;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from O53
 */
public final class o53_0
extends g53_0 {
    public final Callable a;

    public o53_0(Callable callable) {
        this.a = callable;
    }

    public final void g(t53_0 t53_02) {
        Object object = Functions.a;
        x03_0.b(object, "run is null");
        pq2_2 pq2_22 = new AtomicReference(object);
        t53_02.a(pq2_22);
        boolean bl2 = pq2_22.isDisposed();
        if (bl2) {
            return;
        }
        try {
            object = this.a;
        }
        catch (Throwable throwable) {
            mm0.h(throwable);
            boolean bl3 = pq2_22.isDisposed();
            if (!bl3) {
                t53_02.onError(throwable);
            } else {
                dr2_2.b(throwable);
            }
            return;
        }
        object = object.call();
        String string2 = "The callable returned a null value";
        x03_0.b(object, string2);
        boolean bl4 = pq2_22.isDisposed();
        if (!bl4) {
            t53_02.onSuccess(object);
        }
    }
}

