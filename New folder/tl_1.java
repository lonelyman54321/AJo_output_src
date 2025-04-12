/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from tl
 */
public final class tl_1 {
    public final Vs3 a;
    public final Object b;
    public final long c;
    public final Function0 d;
    public final ParcelableSnapshotMutableState e;
    public Ol f;
    public long g;
    public long h;
    public final ParcelableSnapshotMutableState i;

    public tl_1(Object object, Vs3 vs3, Ol ol, long l2, Object object2, long l3, Function0 function0) {
        this.a = vs3;
        this.b = object2;
        this.c = l3;
        this.d = function0;
        this.e = object = J83.g(object);
        this.f = object = Pl.a(ol);
        this.g = l2;
        this.h = Long.MIN_VALUE;
        this.i = object = J83.g(Boolean.TRUE);
    }

    public final void a() {
        Boolean bl2 = Boolean.FALSE;
        this.i.setValue(bl2);
        this.d.invoke();
    }
}

