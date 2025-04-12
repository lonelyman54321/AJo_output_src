/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import androidx.paging.AsyncPagingDataDiffer$LoadStateListenerRunnable$1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class yq
extends Lambda
implements Function1 {
    public final /* synthetic */ Cq c;

    public yq(Cq cq2) {
        this.c = cq2;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (wZ)object;
        Intrinsics.checkNotNullParameter(object, "loadState");
        Object object2 = this.c;
        Object object3 = (Boolean)((Cq)object2).e.getValue();
        boolean bl2 = (Boolean)object3;
        if (!bl2) {
            object2 = ((Cq)object2).m.iterator();
            while (bl2 = object2.hasNext()) {
                object3 = (Function1)object2.next();
                object3.invoke(object);
            }
        } else {
            object3 = (Handler)((Cq)object2).o.getValue();
            object2 = ((Cq)object2).p;
            object3.removeCallbacks((Runnable)object2);
            AtomicReference atomicReference = ((AsyncPagingDataDiffer$LoadStateListenerRunnable$1)object2).a;
            atomicReference.set(object);
            object3.post((Runnable)object2);
        }
        return Unit.a;
    }
}

