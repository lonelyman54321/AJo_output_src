/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from mR
 */
public final class mr_2 {
    public static final mr_2 c;
    public final Set a;
    public final i0_0 b;

    static {
        mr_2 mr_22;
        Collection collection = new Collection();
        collection = CollectionsKt.o0(collection);
        c = mr_22 = new mr_2((Set)collection, null);
    }

    public mr_2(Set set, i0_0 i0_02) {
        Intrinsics.checkNotNullParameter(set, "pins");
        this.a = set;
        this.b = i0_02;
    }

    public final void a(String string2, Function0 iterator) {
        String string3 = "hostname";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(iterator, "cleanedPeerCertificatesFn");
        Intrinsics.checkNotNullParameter(string2, string3);
        iterator = this.a;
        mz0_2 mz0_22 = mz0_2.a;
        iterator = iterator.iterator();
        boolean bl2 = iterator.hasNext();
        if (!bl2) {
            mz0_22.getClass();
            return;
        }
        ((mR$a)iterator.next()).getClass();
        Intrinsics.checkNotNullParameter(string2, string3);
        kotlin.text.b.s(null, "**.", false);
        throw null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2 = object instanceof mr_2;
        if (!bl2) return false;
        object = (mr_2)object;
        Object object2 = ((mr_2)object).a;
        Set set = this.a;
        bl2 = Intrinsics.areEqual(object2, set);
        if (!bl2) return false;
        object = ((mr_2)object).b;
        object2 = this.b;
        boolean bl3 = Intrinsics.areEqual(object, object2);
        if (!bl3) return false;
        return true;
    }

    public final int hashCode() {
        int n3;
        Set set = this.a;
        int n4 = (((Object)set).hashCode() + 1517) * 41;
        i0_0 i0_02 = this.b;
        if (i0_02 != null) {
            n3 = i0_02.hashCode();
        } else {
            n3 = 0;
            i0_02 = null;
        }
        return n4 + n3;
    }
}

