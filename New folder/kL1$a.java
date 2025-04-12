/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.view.InputEvent
 */
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class kL1$a
extends kl1_0 {
    public final ll1_0 a;

    public kL1$a(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        object = gl1_1.a(object);
        Intrinsics.checkNotNullExpressionValue(object, "context.getSystemService\u2026:class.java\n            )");
        object = (ll1_0)object;
        Intrinsics.checkNotNullParameter(object, "mMeasurementManager");
        this.a = object;
    }

    public Object a(Mo0 object, f80_0 f80_02) {
        f80_02 = zj1_2.b(f80_02);
        object = new CancellableContinuationImpl(1, f80_02);
        ((CancellableContinuationImpl)object).r();
        hl1_1.a();
        throw null;
    }

    public Object b(f80_0 f80_02) {
        Object object = zj1_2.b(f80_02);
        int n3 = 1;
        Object object2 = new CancellableContinuationImpl(n3, (f80_0)object);
        ((CancellableContinuationImpl)object2).r();
        object = new Object();
        i80 i802 = new i80((CancellableContinuationImpl)object2);
        ll1_0 ll1_02 = this.a;
        ll1_02.getMeasurementApiStatus((Executor)object, i802);
        object2 = ((CancellableContinuationImpl)object2).q();
        object = j90_0.COROUTINE_SUSPENDED;
        if (object2 == object) {
            object = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object);
        }
        return object2;
    }

    public Object c(Uri object, InputEvent object2, f80_0 f80_02) {
        Object object3 = zj1_2.b(f80_02);
        int n3 = 1;
        Object object4 = new CancellableContinuationImpl(n3, (f80_0)object3);
        ((CancellableContinuationImpl)object4).r();
        object3 = new Object();
        i80 i802 = new i80((CancellableContinuationImpl)object4);
        ll1_0 ll1_02 = this.a;
        ll1_02.registerSource((Uri)object, (InputEvent)object2, (Executor)object3, i802);
        object = ((CancellableContinuationImpl)object4).q();
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            object4 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object4);
        }
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }

    public Object d(Uri object, f80_0 f80_02) {
        f80_02 = zj1_2.b(f80_02);
        object = new CancellableContinuationImpl(1, f80_02);
        ((CancellableContinuationImpl)object).r();
        new i80((CancellableContinuationImpl)object);
        this.a.getClass();
        object = new RuntimeException("Stub!");
        throw object;
    }

    public Object e(yf3_0 object, f80_0 f80_02) {
        f80_02 = zj1_2.b(f80_02);
        object = new CancellableContinuationImpl(1, f80_02);
        ((CancellableContinuationImpl)object).r();
        il1_0.a();
        throw null;
    }

    public Object f(zf3_1 object, f80_0 f80_02) {
        f80_02 = zj1_2.b(f80_02);
        object = new CancellableContinuationImpl(1, f80_02);
        ((CancellableContinuationImpl)object).r();
        Yx0.b();
        throw null;
    }
}

