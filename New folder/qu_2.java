/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.b;
import kotlinx.coroutines.i;

/*
 * Renamed from qu
 */
public final class qu_2 {
    public static final Object a(Collection object, f80_0 f80_02) {
        int n3 = 1;
        boolean bl2 = object.isEmpty();
        if (bl2) {
            return mz0_2.a;
        }
        int n4 = 0;
        Object object2 = new vn0_2[]{};
        object = object.toArray((T[])object2);
        Object object3 = new ou_2((vn0_2[])object);
        f80_0 f80_03 = zj1_2.b(f80_02);
        object2 = new CancellableContinuationImpl(n3, f80_03);
        ((CancellableContinuationImpl)object2).r();
        int n7 = ((vn0_2[])object).length;
        ou$a[] ou$aArray = new ou$a[n7];
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = null;
        for (int i3 = 0; i3 < n7; i3 += n3) {
            Object object4 = object[i3];
            object4.start();
            ou$a ou$a = new ou$a((ou_2)object3, (CancellableContinuationImpl)object2);
            ou$a.f = object4 = mm0.f((i)object4, ou$a);
            object4 = Unit.a;
            ou$aArray[i3] = ou$a;
        }
        object = new ou$b(ou$aArray);
        while (n4 < n7) {
            object3 = ou$aArray[n4];
            object3.getClass();
            atomicReferenceFieldUpdater = ou$a.h;
            atomicReferenceFieldUpdater.set(object3, object);
            n4 += n3;
        }
        n3 = (int)(((CancellableContinuationImpl)object2).n() ? 1 : 0);
        if (n3 != 0) {
            ((ou$b)object).a();
        } else {
            dl_2.b((bl_2)object2, (b)object);
        }
        object = ((CancellableContinuationImpl)object2).q();
        Object object5 = j90_0.COROUTINE_SUSPENDED;
        if (object == object5) {
            object5 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object5);
        }
        return object;
    }
}

