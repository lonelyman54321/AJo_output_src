/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Zs2$a {
    public static ArrayList a(List arrayList) {
        Object object;
        int n3;
        Intrinsics.checkNotNullParameter(arrayList, "protocols");
        arrayList = arrayList;
        Object object2 = new ArrayList();
        arrayList = arrayList.iterator();
        while ((n3 = arrayList.hasNext()) != 0) {
            Object object3 = object = arrayList.next();
            object3 = (ib2_2)((Object)object);
            ib2_2 ib2_22 = ib2_2.HTTP_1_0;
            if (object3 == ib2_22) continue;
            ((ArrayList)object2).add(object);
        }
        n3 = yx_2.o(object2, 10);
        arrayList = new ArrayList(n3);
        object2 = ((ArrayList)object2).iterator();
        while ((n3 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
            object = ((ib2_2)((Object)object2.next())).toString();
            arrayList.add(object);
        }
        return arrayList;
    }

    public static byte[] b(List object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "protocols");
        ce_2 ce_22 = new ce_2();
        object = Zs2$a.a((List)object).iterator();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            int n3 = string2.length();
            ce_22.U(n3);
            ce_22.I0(string2);
        }
        long l2 = ce_22.b;
        return ce_22.w(l2);
    }

    public static boolean c() {
        String string2 = System.getProperty("java.vm.name");
        return Intrinsics.areEqual("Dalvik", string2);
    }
}

