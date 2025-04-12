/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.i;
import androidx.media3.exoplayer.source.r;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.List;

/*
 * Renamed from w30
 */
public final class w30_0
implements r {
    public final ImmutableList a;
    public long b;

    public w30_0(List collection, List list) {
        w30$a w30$a;
        ImmutableList$Builder immutableList$Builder = ImmutableList.builder();
        int n3 = collection.size();
        int n4 = list.size();
        int n7 = 0;
        if (n3 == n4) {
            n3 = 1;
        } else {
            n3 = 0;
            w30$a = null;
        }
        ct3.a(n3 != 0);
        while (n7 < (n3 = collection.size())) {
            r r5 = (r)collection.get(n7);
            List list2 = (List)list.get(n7);
            w30$a = new w30$a(r5, list2);
            immutableList$Builder.add(w30$a);
            ++n7;
        }
        collection = immutableList$Builder.build();
        this.a = collection;
        this.b = -9223372036854775807L;
    }

    public final boolean a(i i3) {
        long l2;
        long l3;
        long l4;
        long l7;
        boolean bl2 = false;
        while ((l7 = (l4 = (l3 = this.d()) - (l2 = Long.MIN_VALUE)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false) {
            Object object;
            int n3;
            boolean bl3 = false;
            for (l7 = (long)0; l7 < (n3 = ((AbstractCollection)(object = this.a)).size()); ++l7) {
                long l8;
                long l12;
                long l14;
                w30$a w30$a = (w30$a)object.get((int)l7);
                long l15 = w30$a.d();
                long l16 = l15 - l2;
                Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
                object2 = object2 != false && (l14 = (l12 = l15 - (l8 = i3.a)) == 0L ? 0 : (l12 < 0L ? -1 : 1)) <= 0 ? (Object)1 : (Object)0;
                Object object3 = l15 == l3 ? 0 : (l15 < l3 ? -1 : 1);
                if (object3 != false && object2 == false) continue;
                object = (w30$a)object.get((int)l7);
                boolean bl4 = ((w30$a)object).a(i3);
                bl3 |= bl4;
            }
            bl2 |= bl3;
            if (bl3) continue;
        }
        return bl2;
    }

    public final long d() {
        long l2;
        long l3 = Long.MAX_VALUE;
        int n3 = 0;
        long l4 = l3;
        while (true) {
            Object object = this.a;
            int n4 = ((AbstractCollection)object).size();
            l2 = Long.MIN_VALUE;
            if (n3 >= n4) break;
            long l7 = ((w30$a)(object = (w30$a)object.get(n3))).d();
            long l8 = l7 - l2;
            Object object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object2 != false) {
                l4 = Math.min(l4, l7);
            }
            ++n3;
        }
        n3 = (int)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1));
        if (n3 == 0) {
            l4 = l2;
        }
        return l4;
    }

    public final boolean isLoading() {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((AbstractCollection)(object = this.a)).size()); ++i3) {
            boolean bl2 = ((w30$a)(object = (w30$a)object.get(i3))).isLoading();
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    public final long o() {
        long l2;
        long l3 = Long.MAX_VALUE;
        int n3 = 0;
        long l4 = l3;
        long l7 = l3;
        while (true) {
            long l8;
            int n4;
            Integer n7;
            Object object = this.a;
            int n8 = ((AbstractCollection)object).size();
            l2 = Long.MIN_VALUE;
            if (n3 >= n8) break;
            object = (w30$a)object.get(n3);
            long l12 = ((w30$a)object).o();
            Serializable serializable = ((w30$a)object).c();
            n8 = (int)(serializable.contains(n7 = Integer.valueOf(n4 = 1)) ? 1 : 0);
            if ((n8 != 0 || (n8 = (int)((serializable = ((w30$a)object).c()).contains(n7 = Integer.valueOf(n4 = 2)) ? 1 : 0)) != 0 || (l8 = (long)((ImmutableList)(object = ((w30$a)object).c())).contains(serializable = Integer.valueOf(n8 = 4))) != false) && (l8 = l12 == l2 ? 0 : (l12 < l2 ? -1 : 1)) != false) {
                l4 = Math.min(l4, l12);
            }
            if ((l8 = l12 == l2 ? 0 : (l12 < l2 ? -1 : 1)) != false) {
                l7 = Math.min(l7, l12);
            }
            ++n3;
        }
        n3 = (int)(l4 == l3 ? 0 : (l4 < l3 ? -1 : 1));
        if (n3 != 0) {
            this.b = l4;
            return l4;
        }
        n3 = (int)(l7 == l3 ? 0 : (l7 < l3 ? -1 : 1));
        if (n3 != 0) {
            l3 = this.b;
            long l14 = -9223372036854775807L;
            long l15 = l3 - l14;
            Object object = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
            if (object != false) {
                l7 = l3;
            }
            return l7;
        }
        return l2;
    }

    public final void q(long l2) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((AbstractCollection)(object = this.a)).size()); ++i3) {
            object = (w30$a)object.get(i3);
            ((w30$a)object).q(l2);
        }
    }
}

