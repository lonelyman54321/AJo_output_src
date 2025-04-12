/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.internal.Intrinsics;

public final class Qk3
implements Sj3 {
    public final /* synthetic */ Sk3 a;

    public Qk3(Sk3 sk3) {
        this.a = sk3;
    }

    public final void a() {
    }

    public final void b(long l2) {
        Sk3 sk3 = this.a;
        boolean bl2 = true;
        long l3 = sk3.k(bl2);
        float f5 = hY2.a;
        f5 = e72.d(l3);
        float f6 = e72.e(l3);
        float f7 = 1.0f;
        l3 = h72.a(f5, f6 -= f7);
        Object object = sk3.d;
        if (object != null && (object = ((Vt1)object).d()) != null) {
            sk3.m = l3 = ((Ul3)object).e(l3);
            object = new e72(l3);
            sk3.q.setValue(object);
            sk3.o = l3 = 0L;
            object = v21_0.Cursor;
            ParcelableSnapshotMutableState parcelableSnapshotMutableState = sk3.p;
            parcelableSnapshotMutableState.setValue(object);
            bl2 = false;
            f5 = 0.0f;
            object = null;
            sk3.t(false);
        }
    }

    public final void c() {
        Sk3 sk3 = this.a;
        Sk3.b(sk3, null);
        Sk3.a(sk3, null);
    }

    public final void d(long l2) {
        Object object = this.a;
        long l3 = ((Sk3)object).o;
        ((Sk3)object).o = l2 = e72.i(l3, l2);
        Object object2 = ((Sk3)object).d;
        if (object2 != null && (object2 = ((Vt1)object2).d()) != null) {
            l3 = ((Sk3)object).m;
            long l4 = ((Sk3)object).o;
            l3 = e72.i(l3, l4);
            Object object3 = new e72(l3);
            ((Sk3)object).q.setValue(object3);
            object3 = ((Sk3)object).b;
            Object object4 = ((Sk3)object).i();
            Intrinsics.checkNotNull(object4);
            l3 = ((e72)object4).a;
            boolean bl2 = true;
            int n3 = ((Ul3)object2).b(l3, bl2);
            n3 = object3.a(n3);
            l2 = nm3.a(n3, n3);
            object4 = ((Sk3)object).l();
            l3 = ((ql3_0)object4).b;
            boolean bl3 = mm3.a(l2, l3);
            if (bl3) {
                return;
            }
            object4 = ((Sk3)object).d;
            if ((object4 == null || (bl3 = ((Boolean)(object4 = (Boolean)((Vt1)object4).q.getValue())).booleanValue())) && (object4 = ((Sk3)object).i) != null) {
                object4.a();
            }
            object4 = ((Sk3)object).c;
            object = ((Sk3)object).l().a;
            object2 = Sk3.e((Sl)object, l2);
            object4.invoke(object2);
        }
    }

    public final void onCancel() {
    }

    public final void onStop() {
        Sk3 sk3 = this.a;
        Sk3.b(sk3, null);
        Sk3.a(sk3, null);
    }
}

