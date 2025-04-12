/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.lazy.layout.c;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.io.Serializable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;

public final class Gr1 {
    public static final long s;
    public static final /* synthetic */ int t;
    public final i90_0 a;
    public final T01 b;
    public final Function0 c;
    public un0_0 d;
    public un0_0 e;
    public un0_0 f;
    public boolean g;
    public final ParcelableSnapshotMutableState h;
    public final ParcelableSnapshotMutableState i;
    public final ParcelableSnapshotMutableState j;
    public final ParcelableSnapshotMutableState k;
    public long l;
    public long m;
    public W01 n;
    public final Lj o;
    public final Lj p;
    public final ParcelableSnapshotMutableState q;
    public long r;

    static {
        int n3 = -1 >>> 1;
        s = Ti1.a(n3, n3);
    }

    public Gr1(c80 object, T01 object2, c object3) {
        long l2;
        long l3;
        this.a = object;
        this.b = object2;
        this.c = object3;
        object = Boolean.FALSE;
        this.h = object3 = J83.g(object);
        this.i = object3 = J83.g(object);
        this.j = object3 = J83.g(object);
        this.k = object = J83.g(object);
        this.l = l3 = s;
        this.m = l2 = 0L;
        object = null;
        object2 = object2 != null ? object2.b() : null;
        this.n = object2;
        object3 = new Si1(l2);
        Object object4 = ya3_0.g;
        int n3 = 12;
        this.o = object2 = new Lj(object3, (Ws3)object4, null, n3);
        object3 = Float.valueOf(1.0f);
        object4 = FloatCompanionObject.INSTANCE;
        object4 = ya3_0.a;
        this.p = object2 = new Lj(object3, (Ws3)object4, null, n3);
        object = new Si1(l2);
        this.q = object = J83.g(object);
        this.r = l3;
    }

    public final void a() {
        W01 w01 = this.n;
        un0_0 un0_02 = this.d;
        Serializable serializable = (Boolean)this.i.getValue();
        boolean bl2 = serializable;
        i90_0 i90_02 = this.a;
        int n3 = 3;
        if (!bl2 && un0_02 != null && w01 != null) {
            Gr1$b gr1$b;
            boolean bl3 = true;
            float f5 = Float.MIN_VALUE;
            this.d(bl3);
            boolean bl4 = this.b() ^ bl3;
            if (bl4) {
                boolean bl5 = false;
                f5 = 0.0f;
                serializable = null;
                w01.f(0.0f);
            }
            serializable = gr1$b;
            gr1$b = new Gr1$b(bl4, this, un0_02, w01, null);
            Ae3.d(i90_02, null, null, gr1$b, n3);
            return;
        }
        boolean bl6 = this.b();
        if (bl6) {
            if (w01 != null) {
                int n4 = 1065353216;
                float f6 = 1.0f;
                w01.f(f6);
            }
            serializable = new Gr1$a(this, null);
            Ae3.d(i90_02, null, null, (Function2)((Object)serializable), n3);
        }
    }

    public final boolean b() {
        return (Boolean)this.j.getValue();
    }

    public final void c() {
        long l2;
        Object object = (Boolean)this.h.getValue();
        boolean bl2 = (Boolean)object;
        Object object2 = this.a;
        int n3 = 3;
        if (bl2) {
            this.f(false);
            object = new Gr1$c(this, null);
            Ae3.d((i90_0)object2, null, null, (Function2)object, n3);
        }
        if (bl2 = ((Boolean)(object = (Boolean)this.i.getValue())).booleanValue()) {
            this.d(false);
            object = new Gr1$d(this, null);
            Ae3.d((i90_0)object2, null, null, (Function2)object, n3);
        }
        if (bl2 = this.b()) {
            this.e(false);
            object = new Gr1$e(this, null);
            Ae3.d((i90_0)object2, null, null, (Function2)object, n3);
        }
        this.g = false;
        this.g(0L);
        this.l = l2 = s;
        object = this.n;
        if (object != null && (object2 = this.b) != null) {
            object2.a((W01)object);
        }
        this.n = null;
        this.d = null;
        this.f = null;
        this.e = null;
    }

    public final void d(boolean bl2) {
        Boolean bl3 = bl2;
        this.i.setValue(bl3);
    }

    public final void e(boolean bl2) {
        Boolean bl3 = bl2;
        this.j.setValue(bl3);
    }

    public final void f(boolean bl2) {
        Boolean bl3 = bl2;
        this.h.setValue(bl3);
    }

    public final void g(long l2) {
        Si1 si1 = new Si1(l2);
        this.q.setValue(si1);
    }
}

