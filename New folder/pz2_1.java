/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from PZ2
 */
public final class pz2_1
implements SerialDescriptor,
qj_1 {
    public final String a;
    public final xz2_1 b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final SerialDescriptor[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final SerialDescriptor[] k;
    public final hh3_2 l;

    public pz2_1(String object, xz2_1 object2, int n3, List list, uu_1 object3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "serialName");
        Intrinsics.checkNotNullParameter(object2, "kind");
        Intrinsics.checkNotNullParameter(list, "typeParameters");
        Object object4 = "builder";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        this.a = object;
        this.b = object2;
        this.c = n3;
        object = ((uu_1)object3).b;
        this.d = object;
        object = ((uu_1)object3).c;
        this.e = object2 = CollectionsKt.i0((Iterable)object);
        Object object5 = new String[]{};
        object = object.toArray((T[])object5);
        this.f = object;
        object5 = kt2_2.b(((uu_1)object3).e);
        this.g = object5;
        object5 = ((uu_1)object3).f;
        object2 = new List[]{};
        object2 = ((ArrayList)object5).toArray((T[])object2);
        this.h = object2;
        object2 = ((uu_1)object3).g;
        Intrinsics.checkNotNullParameter(object2, "<this>");
        n3 = object2.size();
        object5 = new boolean[n3];
        object2 = object2.iterator();
        int n4 = 0;
        object3 = null;
        while (bl2 = object2.hasNext()) {
            object4 = (Boolean)object2.next();
            bl2 = (Boolean)object4;
            int n7 = n4 + 1;
            object5[n4] = bl2;
            n4 = n7;
        }
        this.i = (boolean[])object5;
        Intrinsics.checkNotNullParameter(object, "<this>");
        super((Object[])object);
        object2 = new jg1_2((Function0)object5);
        n3 = yx_2.o((Iterable)object2, 10);
        super(n3);
        object2 = ((jg1_2)object2).iterator();
        while (true) {
            object5 = object2;
            object5 = (kg1_2)object2;
            object3 = ((kg1_2)object5).a;
            n4 = (int)(object3.hasNext() ? 1 : 0);
            if (n4 == 0) break;
            object5 = (IndexedValue)((kg1_2)object5).next();
            object3 = ((IndexedValue)object5).b;
            n3 = ((IndexedValue)object5).a;
            object5 = n3;
            object4 = new Pair(object3, object5);
            object.add(object4);
        }
        this.j = object = fh1_2.n((Iterable)object);
        object = kt2_2.b(list);
        this.k = object;
        super(this);
        this.l = object = yr1_2.b((Function0)object);
    }

    public final Set a() {
        return this.e;
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final int c(String object) {
        Intrinsics.checkNotNullParameter(object, "name");
        Map map2 = this.j;
        object = (Integer)map2.get(object);
        int n3 = object != null ? (Integer)object : -3;
        return n3;
    }

    public final int d() {
        return this.c;
    }

    public final String e(int n3) {
        return this.f[n3];
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final boolean equals(Object objectArray) {
        boolean bl2 = true;
        if (this == objectArray) {
            return bl2;
        }
        int n3 = objectArray instanceof pz2_1;
        if (n3 == 0) return false;
        Object[] objectArray2 = this.h();
        Object[] objectArray3 = objectArray;
        SerialDescriptor serialDescriptor = (SerialDescriptor)objectArray;
        Object object = serialDescriptor.h();
        n3 = Intrinsics.areEqual(objectArray2, object);
        if (n3 == 0) return false;
        objectArray = (pz2_1)objectArray;
        objectArray2 = this.k;
        objectArray = objectArray.k;
        int n4 = Arrays.equals(objectArray2, objectArray);
        if (n4 == 0 || (n4 = this.d()) != (n3 = serialDescriptor.d())) return false;
        n4 = this.d();
        n3 = 0;
        objectArray2 = null;
        while (n3 < n4) {
            Object object2;
            object = this.g(n3).h();
            boolean bl3 = Intrinsics.areEqual(object, object2 = serialDescriptor.g(n3).h());
            if (!bl3 || !(bl3 = Intrinsics.areEqual(object = this.g(n3).getKind(), object2 = serialDescriptor.g(n3).getKind()))) {
                return false;
            }
            ++n3;
        }
        return bl2;
    }

    public final List f(int n3) {
        return this.h[n3];
    }

    public final SerialDescriptor g(int n3) {
        return this.g[n3];
    }

    public final List getAnnotations() {
        return this.d;
    }

    public final xz2_1 getKind() {
        return this.b;
    }

    public final String h() {
        return this.a;
    }

    public final int hashCode() {
        return ((Number)this.l.getValue()).intValue();
    }

    public final boolean i(int n3) {
        return this.i[n3];
    }

    public final /* synthetic */ boolean isInline() {
        return false;
    }

    public final String toString() {
        int n3 = this.c;
        IntRange intRange = kotlin.ranges.f.m(0, n3);
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a;
        String string3 = ui0_1.a(stringBuilder, string2, '(');
        oz2_1 oz2_12 = new oz2_1(this);
        return CollectionsKt.R(intRange, ", ", string3, ")", oz2_12, 24);
    }
}

