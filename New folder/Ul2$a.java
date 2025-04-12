/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.util.Log
 */
import android.os.Build;
import android.util.Log;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class Ul2$a
implements fs0_2 {
    public final /* synthetic */ Sl2 a;
    public final /* synthetic */ Ml2 b;

    public Ul2$a(Sl2 sl2, Ml2 ml2) {
        this.a = sl2;
        this.b = ml2;
    }

    public final Object emit(Object object, f80_0 object2) {
        Ml2 ml2;
        tl2_0 tl2_02;
        Object object3;
        int n3;
        boolean bl2;
        object = (rk2_0)object;
        Object object4 = Build.ID;
        if (object4 != null && (bl2 = Log.isLoggable((String)(object4 = "Paging"), (int)(n3 = 2)))) {
            object4 = new StringBuilder("Collected ");
            ((StringBuilder)object4).append(object);
            object4 = ((StringBuilder)object4).toString();
            object3 = "message";
            Intrinsics.checkNotNullParameter(object4, (String)object3);
        }
        if ((object = Ae3.g(object2, (CoroutineContext)(object3 = ((Sl2)object4).a), tl2_02 = new tl2_0((rk2_0)object, (Sl2)(object4 = this.a), ml2 = this.b, null))) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        return object;
    }
}

