/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Hv2
 */
public class hv2_2
implements SerialDescriptor,
qj_1 {
    public final String a;
    public final dz0_2 b;
    public final int c;
    public int d;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final rq1_2 i;
    public final rq1_2 j;
    public final rq1_2 k;

    public hv2_2(String object, dz0_2 object2, int n3) {
        int n4;
        String string2 = "serialName";
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = object;
        this.b = object2;
        this.c = n3;
        this.d = n4 = -1;
        object = new String[n3];
        object2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object[i3] = string2 = "[UNINITIALIZED]";
        }
        this.e = object;
        n4 = this.c;
        object2 = new List[n4];
        this.f = object2;
        object = new boolean[n4];
        this.g = (boolean[])object;
        this.h = object = fh1_2.f();
        object = et1_2.PUBLICATION;
        super(this);
        this.i = object2 = yr1_2.a((et1_2)((Object)object), (Function0)object2);
        super(this, 1);
        this.j = object2 = yr1_2.a((et1_2)((Object)object), (Function0)object2);
        super(this);
        this.k = object = yr1_2.a((et1_2)((Object)object), (Function0)object2);
    }

    public final Set a() {
        return this.h.keySet();
    }

    public final /* synthetic */ boolean b() {
        return false;
    }

    public final int c(String object) {
        Intrinsics.checkNotNullParameter(object, "name");
        Map map2 = this.h;
        object = (Integer)map2.get(object);
        int n3 = object != null ? (Integer)object : -3;
        return n3;
    }

    public final int d() {
        return this.c;
    }

    public final String e(int n3) {
        return this.e[n3];
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public boolean equals(Object objectArray) {
        boolean bl2 = true;
        if (this == objectArray) {
            return bl2;
        }
        boolean bl3 = objectArray instanceof hv2_2;
        if (!bl3) return false;
        Object[] objectArray2 = objectArray;
        Object object = this.a;
        SerialDescriptor serialDescriptor = (SerialDescriptor)objectArray;
        Object[] objectArray3 = serialDescriptor.h();
        int n3 = Intrinsics.areEqual(object, objectArray3);
        if (n3 == 0) return false;
        objectArray = (hv2_2)objectArray;
        objectArray3 = (SerialDescriptor[])this.j.getValue();
        int n4 = Arrays.equals(objectArray3, objectArray = (SerialDescriptor[])objectArray.j.getValue());
        if (n4 == 0 || (n3 = this.c) != (n4 = serialDescriptor.d())) return false;
        n4 = 0;
        objectArray = null;
        while (n4 < n3) {
            Object object2;
            object = this.g(n4).h();
            boolean bl4 = Intrinsics.areEqual(object, object2 = serialDescriptor.g(n4).h());
            if (!bl4 || !(bl4 = Intrinsics.areEqual(object = this.g(n4).getKind(), object2 = serialDescriptor.g(n4).getKind()))) {
                return false;
            }
            ++n4;
        }
        return bl2;
    }

    public final List f(int n3) {
        List[] listArray = this.f;
        List list = listArray[n3];
        if (list == null) {
            list = mz0_2.a;
        }
        return list;
    }

    public SerialDescriptor g(int n3) {
        return ((KSerializer[])this.i.getValue())[n3].getDescriptor();
    }

    public final List getAnnotations() {
        return mz0_2.a;
    }

    public xz2_1 getKind() {
        return Ye3$a.a;
    }

    public final String h() {
        return this.a;
    }

    public int hashCode() {
        return ((Number)this.k.getValue()).intValue();
    }

    public final boolean i(int n3) {
        return this.g[n3];
    }

    public /* synthetic */ boolean isInline() {
        return false;
    }

    public final void j(String object, boolean n3) {
        int n4;
        String string2 = "name";
        Intrinsics.checkNotNullParameter(object, string2);
        this.d = n4 = this.d + 1;
        String[] stringArray = this.e;
        stringArray[n4] = object;
        this.g[n4] = n3;
        object = this.f;
        n3 = 0;
        object[n4] = null;
        int n7 = this.c + -1;
        if (n4 == n7) {
            object = new HashMap();
            n3 = stringArray.length;
            string2 = null;
            for (n4 = 0; n4 < n3; ++n4) {
                Integer n8 = n4;
                String string3 = stringArray[n4];
                ((HashMap)object).put(string3, n8);
            }
            this.h = object;
        }
    }

    public String toString() {
        int n3 = this.c;
        IntRange intRange = kotlin.ranges.f.m(0, n3);
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a;
        String string3 = ui0_1.a(stringBuilder, string2, '(');
        cj2_2 cj2_22 = new cj2_2(this, 1);
        return CollectionsKt.R(intRange, ", ", string3, ")", cj2_22, 24);
    }
}

