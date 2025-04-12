/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from UU
 */
public final class uu_1 {
    public final String a;
    public List b;
    public final ArrayList c;
    public final HashSet d;
    public final ArrayList e;
    public final ArrayList f;
    public final ArrayList g;

    public uu_1(String arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "serialName");
        this.a = arrayList;
        arrayList = mz0_2.a;
        this.b = arrayList;
        arrayList = new ArrayList();
        this.c = arrayList;
        this.d = arrayList;
        this.e = arrayList = new ArrayList();
        this.f = arrayList = new ArrayList();
        this.g = arrayList = new ArrayList();
    }

    public static void a(uu_1 object, String object2, SerialDescriptor serialDescriptor) {
        mz0_2 mz0_22 = mz0_2.a;
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "elementName");
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        Intrinsics.checkNotNullParameter(mz0_22, "annotations");
        HashSet hashSet = ((uu_1)object).d;
        boolean bl2 = hashSet.add(object2);
        if (bl2) {
            ((uu_1)object).c.add(object2);
            ((uu_1)object).e.add(serialDescriptor);
            ((uu_1)object).f.add(mz0_22);
            object2 = false;
            ((uu_1)object).g.add(object2);
            return;
        }
        object2 = Gn.a("Element with name '", (String)object2, "' is already registered in ");
        object = ((uu_1)object).a;
        ((StringBuilder)object2).append((String)object);
        object = ((StringBuilder)object2).toString();
        object = object.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

