/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from Vq0
 */
public final class vq0_0
extends hm0_2 {
    public final hm0_2 b;

    public vq0_0(hm0_2 hm0_22) {
        Intrinsics.checkNotNullParameter(hm0_22, "delegate");
        this.b = hm0_22;
    }

    public static void m(hn2_2 hn2_22, String string2, String string3) {
        Intrinsics.checkNotNullParameter(hn2_22, "path");
        Intrinsics.checkNotNullParameter(string2, "functionName");
        Intrinsics.checkNotNullParameter(string3, "parameterName");
    }

    public final y63_0 a(hn2_2 hn2_22) {
        String string2 = "file";
        Intrinsics.checkNotNullParameter(hn2_22, string2);
        vq0_0.m(hn2_22, "appendingSink", string2);
        return this.b.a(hn2_22);
    }

    public final void b(hn2_2 hn2_22, hn2_2 hn2_23) {
        String string2 = "source";
        Intrinsics.checkNotNullParameter(hn2_22, string2);
        String string3 = "target";
        Intrinsics.checkNotNullParameter(hn2_23, string3);
        String string4 = "atomicMove";
        vq0_0.m(hn2_22, string4, string2);
        vq0_0.m(hn2_23, string4, string3);
        this.b.b(hn2_22, hn2_23);
    }

    public final void c(hn2_2 hn2_22) {
        String string2 = "dir";
        Intrinsics.checkNotNullParameter(hn2_22, string2);
        vq0_0.m(hn2_22, "createDirectory", string2);
        this.b.c(hn2_22);
    }

    public final void d(hn2_2 hn2_22) {
        String string2 = "path";
        Intrinsics.checkNotNullParameter(hn2_22, string2);
        vq0_0.m(hn2_22, "delete", string2);
        this.b.d(hn2_22);
    }

    public final List g(hn2_2 iterator) {
        boolean bl2;
        ArrayList<hn2_2> arrayList = "dir";
        Intrinsics.checkNotNullParameter(iterator, (String)((Object)arrayList));
        String string2 = "list";
        vq0_0.m((hn2_2)((Object)iterator), string2, (String)((Object)arrayList));
        iterator = this.b.g((hn2_2)((Object)iterator));
        arrayList = new ArrayList<hn2_2>();
        iterator = iterator.iterator();
        while (bl2 = iterator.hasNext()) {
            hn2_2 hn2_22 = (hn2_2)iterator.next();
            Intrinsics.checkNotNullParameter(hn2_22, "path");
            String string3 = "functionName";
            Intrinsics.checkNotNullParameter(string2, string3);
            arrayList.add(hn2_22);
        }
        bx_2.p(arrayList);
        return arrayList;
    }

    public final hl0_1 i(hn2_2 object) {
        hl0_1 hl0_12;
        Object object2 = "path";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        String string2 = "metadataOrNull";
        vq0_0.m((hn2_2)object, string2, (String)object2);
        hm0_2 hm0_22 = this.b;
        object = hm0_22.i((hn2_2)object);
        if (object == null) {
            return null;
        }
        hn2_2 hn2_22 = ((hl0_1)object).c;
        if (hn2_22 == null) {
            return object;
        }
        Intrinsics.checkNotNullParameter(hn2_22, (String)object2);
        Intrinsics.checkNotNullParameter(string2, "functionName");
        Map map2 = ((hl0_1)object).h;
        Intrinsics.checkNotNullParameter(map2, "extras");
        Long l2 = ((hl0_1)object).f;
        Long l3 = ((hl0_1)object).g;
        boolean bl2 = ((hl0_1)object).a;
        boolean bl3 = ((hl0_1)object).b;
        Long l4 = ((hl0_1)object).d;
        Long l7 = ((hl0_1)object).e;
        object2 = hl0_12;
        hl0_12 = new hl0_1(bl2, bl3, hn2_22, l4, l7, l2, l3, map2);
        return hl0_12;
    }

    public final ul0_1 j(hn2_2 hn2_22) {
        String string2 = "file";
        Intrinsics.checkNotNullParameter(hn2_22, string2);
        vq0_0.m(hn2_22, "openReadOnly", string2);
        return this.b.j(hn2_22);
    }

    public final y63_0 k(hn2_2 hn2_22) {
        Object object = hn2_22.b();
        if (object != null) {
            boolean bl2;
            boolean bl3;
            String string2 = "dir";
            Intrinsics.checkNotNullParameter(object, string2);
            Intrinsics.checkNotNullParameter(object, string2);
            Intrinsics.checkNotNullParameter(this, "<this>");
            Intrinsics.checkNotNullParameter(object, string2);
            Object object2 = new fp_2();
            while (object != null && !(bl3 = this.f((hn2_2)object))) {
                ((fp_2)object2).addFirst(object);
                object = ((hn2_2)object).b();
            }
            object = ((AbstractCollection)object2).iterator();
            while (bl2 = object.hasNext()) {
                object2 = (hn2_2)object.next();
                Intrinsics.checkNotNullParameter(object2, string2);
                this.c((hn2_2)object2);
            }
        }
        object = "file";
        Intrinsics.checkNotNullParameter(hn2_22, (String)object);
        vq0_0.m(hn2_22, "sink", (String)object);
        return this.b.k(hn2_22);
    }

    public final a93_0 l(hn2_2 hn2_22) {
        String string2 = "file";
        Intrinsics.checkNotNullParameter(hn2_22, string2);
        vq0_0.m(hn2_22, "source", string2);
        return this.b.l(hn2_22);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = Reflection.getOrCreateKotlinClass(this.getClass()).getSimpleName();
        stringBuilder.append((String)object);
        stringBuilder.append('(');
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

