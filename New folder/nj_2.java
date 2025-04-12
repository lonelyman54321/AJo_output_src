/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 */
import android.view.Choreographer;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$Element;
import kotlin.coroutines.CoroutineContext$Element$a;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from nj
 */
public final class nj_2
implements yp1_2 {
    public final Choreographer a;
    public final AndroidUiDispatcher b;

    public nj_2(Choreographer choreographer, AndroidUiDispatcher androidUiDispatcher) {
        this.a = choreographer;
        this.b = androidUiDispatcher;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object R(Function1 object, f80_0 f80_02) {
        Object object2;
        boolean bl2;
        Object object3;
        Object object4 = this.b;
        if (object4 == null) {
            object4 = f80_02.getContext();
            object3 = d.n0;
            boolean bl3 = (object4 = object4.get((CoroutineContext$a)object3)) instanceof AndroidUiDispatcher;
            object4 = bl3 ? (AndroidUiDispatcher)object4 : null;
        }
        Object object5 = zj1_2.b(f80_02);
        int n3 = 1;
        object3 = new CancellableContinuationImpl(n3, (f80_0)object5);
        ((CancellableContinuationImpl)object3).r();
        object5 = new nj$c((CancellableContinuationImpl)object3, this, (Function1)object);
        if (object4 != null && (bl2 = Intrinsics.areEqual(object = object4.b, object2 = this.a))) {
            Unit unit;
            object = object4.d;
            // MONITORENTER : object
            object2 = object4.f;
            object2.add(object5);
            boolean bl4 = object4.i;
            if (!bl4) {
                object4.i = n3;
                unit = object4.b;
                object2 = object4.j;
                unit.postFrameCallback((Choreographer.FrameCallback)object2);
            }
            unit = Unit.a;
            // MONITOREXIT : object
            object = new nj$a_0((AndroidUiDispatcher)object4, (nj$c)object5);
            ((CancellableContinuationImpl)object3).x((Function1)object);
        } else {
            this.a.postFrameCallback((Choreographer.FrameCallback)object5);
            object = new nj$b(this, (nj$c)object5);
            ((CancellableContinuationImpl)object3).x((Function1)object);
        }
        object = ((CancellableContinuationImpl)object3).q();
        object4 = j90_0.COROUTINE_SUSPENDED;
        if (object != object4) return object;
        object4 = "frame";
        Intrinsics.checkNotNullParameter(f80_02, (String)object4);
        return object;
    }

    public final Object fold(Object object, Function2 function2) {
        return CoroutineContext$Element$a.a(this, object, function2);
    }

    public final CoroutineContext$Element get(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.b(this, coroutineContext$a);
    }

    public final CoroutineContext$a getKey() {
        return YP1$a.a;
    }

    public final CoroutineContext minusKey(CoroutineContext$a coroutineContext$a) {
        return CoroutineContext$Element$a.c(this, coroutineContext$a);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext$Element$a.d(coroutineContext, this);
    }
}

