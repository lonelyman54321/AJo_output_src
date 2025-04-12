/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jx3
 */
public final class jx3_0
implements jm2_2 {
    public final jm2_2 a;

    public jx3_0(km2_2 km2_22) {
        Intrinsics.checkNotNullParameter(km2_22, "encodedParametersBuilder");
        this.a = km2_22;
        boolean cfr_ignored_0 = km2_22.a;
    }

    public final void a(String string2, Iterable object) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(object, "values");
        string2 = pw_1.e(string2, false);
        int n3 = yx_2.o((Iterable)object, 10);
        ArrayList<String> arrayList = new ArrayList<String>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            String string3 = (String)object.next();
            String string4 = "<this>";
            Intrinsics.checkNotNullParameter(string3, string4);
            boolean bl2 = true;
            string3 = pw_1.e(string3, bl2);
            arrayList.add(string3);
        }
        this.a.a(string2, arrayList);
    }

    public final void b(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(string3, "value");
        string2 = pw_1.e(string2, false);
        Intrinsics.checkNotNullParameter(string3, "<this>");
        string3 = pw_1.e(string3, true);
        this.a.b(string2, string3);
    }

    public final void clear() {
        this.a.clear();
    }

    public final Set entries() {
        return ((ye3_2)((Object)kx3_0.a((km2_2)this.a))).entries();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }
}

