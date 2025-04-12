/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.navigation.d;
import androidx.navigation.i;
import androidx.navigation.n;
import androidx.navigation.p;
import androidx.navigation.p$a;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class A20
extends p {
    public final ParcelableSnapshotMutableState c;

    public A20() {
        ParcelableSnapshotMutableState parcelableSnapshotMutableState;
        this.c = parcelableSnapshotMutableState = J83.g(Boolean.FALSE);
    }

    public final i a() {
        u10 u102 = H10.a;
        A20$a a20$a = new A20$a(this, u102);
        return a20$a;
    }

    public final void d(List object, n object2, p$a object3) {
        boolean bl2;
        object = ((Iterable)object).iterator();
        block0: while (bl2 = object.hasNext()) {
            Object object4;
            Object object5;
            boolean bl3;
            Object object6;
            kb3_2 kb3_22;
            block9: {
                block8: {
                    object2 = (d)object.next();
                    object3 = this.b();
                    Intrinsics.checkNotNullParameter(object2, "backStackEntry");
                    kb3_22 = ((kU1)object3).c;
                    object6 = (Iterable)kb3_22.getValue();
                    bl3 = object6 instanceof Collection;
                    object5 = ((kU1)object3).e;
                    if (!bl3) break block8;
                    object4 = object6;
                    object4 = (Collection)object6;
                    bl3 = object4.isEmpty();
                    if (bl3) break block9;
                }
                object6 = object6.iterator();
                while (bl3 = object6.hasNext()) {
                    object4 = (d)object6.next();
                    if (object4 != object2) continue;
                    object6 = (Iterable)((ge2_2)object5).a.getValue();
                    bl3 = object6 instanceof Collection;
                    if (bl3) {
                        object4 = object6;
                        object4 = (Collection)object6;
                        bl3 = object4.isEmpty();
                        if (bl3) break;
                    }
                    object6 = ((Iterable)object6).iterator();
                    while (bl3 = object6.hasNext()) {
                        object4 = (d)object6.next();
                        if (object4 != object2) continue;
                        continue block0;
                    }
                    break block1;
                }
            }
            object6 = (d)CollectionsKt.T((List)((ge2_2)object5).a.getValue());
            bl3 = false;
            object4 = null;
            if (object6 != null) {
                object5 = (Set)kb3_22.getValue();
                object6 = q03_0.i((Set)object5, object6);
                kb3_22.k(null, object6);
            }
            object6 = q03_0.i((Set)kb3_22.getValue(), object2);
            kb3_22.k(null, object6);
            ((kU1)object3).f((d)object2);
        }
        object = Boolean.FALSE;
        this.c.setValue(object);
    }

    public final void e(d object, boolean bl2) {
        this.b().d((d)object, bl2);
        object = Boolean.TRUE;
        this.c.setValue(object);
    }
}

