/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

public final class j30$b
extends A30 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final LinkedHashSet e;
    public final ParcelableSnapshotMutableState f;
    public final /* synthetic */ j30_0 g;

    public j30$b(j30_0 object, int n3, boolean bl2, boolean bl3, P30 p30) {
        this.g = object;
        this.a = n3;
        this.b = bl2;
        this.c = bl3;
        object = new LinkedHashSet();
        this.e = object;
        object = qq2_0.g;
        J83.i();
        vf_1 vf_12 = vf_1.b;
        this.f = object = J83.f(object, vf_12);
    }

    public final void a(k80 k802, u10 u102) {
        this.g.b.a(k802, u102);
    }

    public final void b(vQ1 vQ12) {
        this.g.b.b(vQ12);
    }

    public final void c() {
        int n3;
        j30_0 j30_02 = this.g;
        j30_02.z = n3 = j30_02.z + -1;
    }

    public final boolean d() {
        return this.g.b.d();
    }

    public final boolean e() {
        return this.b;
    }

    public final boolean f() {
        return this.c;
    }

    public final rq2_1 g() {
        return (rq2_1)this.f.getValue();
    }

    public final int h() {
        return this.a;
    }

    public final CoroutineContext i() {
        return this.g.b.i();
    }

    public final void j(k80 k802) {
        j30_0 j30_02 = this.g;
        A30 a30 = j30_02.b;
        k80 k803 = j30_02.g;
        a30.j(k803);
        j30_02.b.j(k802);
    }

    public final void k(vQ1 vQ12, uq1_0 uq1_02) {
        this.g.b.k(vQ12, uq1_02);
    }

    public final uq1_0 l(vQ1 vQ12) {
        return this.g.b.l(vQ12);
    }

    public final void m(Set set) {
        HashSet<Set> hashSet = this.d;
        if (hashSet == null) {
            this.d = hashSet = new HashSet<Set>();
        }
        hashSet.add(set);
    }

    public final void n(j30_0 j30_02) {
        Intrinsics.checkNotNull(j30_02, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
        this.e.add(j30_02);
    }

    public final void o(k80 k802) {
        this.g.b.o(k802);
    }

    public final void p() {
        int n3;
        j30_0 j30_02 = this.g;
        j30_02.z = n3 = j30_02.z + 1;
    }

    public final void q(b30_0 b30_02) {
        Object object = this.d;
        if (object != null) {
            boolean bl2;
            object = ((HashSet)object).iterator();
            while (bl2 = object.hasNext()) {
                Set set = (Set)object.next();
                Intrinsics.checkNotNull(b30_02, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                Object object2 = b30_02;
                object2 = ((j30_0)b30_02).c;
                set.remove(object2);
            }
        }
        TypeIntrinsics.asMutableCollection(this.e).remove(b30_02);
    }

    public final void r(k80 k802) {
        this.g.b.r(k802);
    }

    public final void s() {
        LinkedHashSet linkedHashSet = this.e;
        boolean bl2 = linkedHashSet.isEmpty() ^ true;
        if (bl2) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                boolean bl3;
                Iterator iterator = linkedHashSet.iterator();
                while (bl3 = iterator.hasNext()) {
                    boolean bl4;
                    j30_0 j30_02 = (j30_0)iterator.next();
                    Iterator iterator2 = hashSet.iterator();
                    while (bl4 = iterator2.hasNext()) {
                        Set set = (Set)iterator2.next();
                        l73 l732 = j30_02.c;
                        set.remove(l732);
                    }
                }
            }
            linkedHashSet.clear();
        }
    }
}

