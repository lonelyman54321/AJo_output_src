/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.concurrent.futures.a;
import androidx.work.c;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cI3
 */
public final class ci3_0
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ c b;
    public final /* synthetic */ EI3 c;
    public final /* synthetic */ CV0 d;
    public final /* synthetic */ Context e;

    public ci3_0(c c2, EI3 eI3, fi3_0 fi3_02, Context context, f80_0 f80_02) {
        this.b = c2;
        this.c = eI3;
        this.d = fi3_02;
        this.e = context;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        EI3 eI3 = this.c;
        Object object2 = this.d;
        CV0 cV0 = object2;
        cV0 = (fi3_0)object2;
        c c2 = this.b;
        Context context = this.e;
        object2 = object;
        object = new ci3_0(c2, eI3, (fi3_0)cV0, context, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ci3_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ci3_0)object).invokeSuspend(object2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 2;
        int n7 = 1;
        c c2 = this.b;
        if (n3 != 0) {
            if (n3 != n7) {
                if (n3 == n4) {
                    vl2_2.b(object);
                    return object;
                }
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = c2.getForegroundInfoAsync();
            object2 = "worker.getForegroundInfoAsync()";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            this.a = n7;
            object = androidx.work.impl.a.a((ListenableFuture)object, c2, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object = (AV0)object;
        object2 = this.c;
        if (object != null) {
            n7 = di3_0.a;
            Object object3 = qx1.a();
            object2 = ((EI3)object2).c;
            object3.getClass();
            object2 = c2.getId();
            object3 = this.d;
            c2 = this.e;
            object = object3.a((Context)c2, (UUID)object2, (AV0)object);
            object2 = "foregroundUpdater.setFor\u2026orker.id, foregroundInfo)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            this.a = n4;
            object = androidx.concurrent.futures.a.a((ListenableFuture)object, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        object = new StringBuilder("Worker was marked important (");
        String string2 = ((EI3)object2).c;
        object = h30_0.a((StringBuilder)object, string2, ") but did not provide ForegroundInfo");
        IllegalStateException illegalStateException = new IllegalStateException((String)object);
        throw illegalStateException;
    }
}

