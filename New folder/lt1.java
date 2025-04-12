/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.AndroidUiDispatcher;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

public final class lt1 {
    public final es0_2 a;
    public final CoroutineContext b;
    public final nt1_0 c;
    public final ParcelableSnapshotMutableState d;
    public final ParcelableSnapshotMutableState e;

    public lt1(ee2_2 object) {
        Intrinsics.checkNotNullParameter(object, "flow");
        this.a = object;
        Object object2 = (CoroutineContext)AndroidUiDispatcher.l.getValue();
        this.b = object2;
        object = (Ml2)CollectionsKt.firstOrNull(object.c());
        Object object3 = new nt1_0(this, (CoroutineContext)object2, (Ml2)object);
        this.c = object3;
        this.d = object = J83.g(((Sl2)object3).d());
        object = (wZ)((Sl2)object3).j.a.getValue();
        if (object == null) {
            Qv1 qv1 = qt1.a;
            object3 = qv1.a;
            Ov1 ov1 = qv1.b;
            Ov1 ov12 = qv1.c;
            object2 = object;
            object = new wZ((Ov1)object3, ov1, ov12, qv1, null);
        }
        this.e = object = J83.g(object);
    }

    public final Object a(f80_0 object) {
        Object object2 = this.c.j;
        lt1$a lt1$a = new lt1$a(this);
        ut0$a_0 ut0$a_0 = new ut0$a_0(lt1$a);
        if ((object = object2.a.collect(ut0$a_0, (f80_0)object)) != (object2 = j90_0.COROUTINE_SUSPENDED)) {
            object = Unit.a;
        }
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }

    public final Object b(int n3) {
        this.c.b(n3);
        return ((wk1_0)this.d.getValue()).get(n3);
    }
}

