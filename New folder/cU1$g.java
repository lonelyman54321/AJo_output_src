/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

public final class cU1$g
extends vx_1 {
    public static long[] j(String object) {
        Intrinsics.checkNotNullParameter(object, "value");
        long l2 = ((Number)cU1.c.d((String)object)).longValue();
        object = new long[1];
        object[0] = l2;
        return object;
    }

    public final Object a(Bundle bundle, String string2) {
        return (long[])bU1.b("bundle", string2, "key", bundle, string2);
    }

    public final String b() {
        return "long[]";
    }

    public final Object c(Object object, String string2) {
        block3: {
            block2: {
                object = (long[])object;
                Object object2 = "value";
                Intrinsics.checkNotNullParameter(string2, (String)object2);
                if (object == null) break block2;
                object2 = cU1$g.j(string2);
                Intrinsics.checkNotNullParameter(object, "<this>");
                String string3 = "elements";
                Intrinsics.checkNotNullParameter(object2, string3);
                int n3 = ((Object)object).length;
                int n4 = n3 + 1;
                object = Arrays.copyOf((long[])object, n4);
                n4 = 0;
                int n7 = 1;
                System.arraycopy(object2, 0, object, n3, n7);
                Intrinsics.checkNotNull(object);
                if (object != null) break block3;
            }
            object = cU1$g.j(string2);
        }
        return object;
    }

    public final void e(Bundle bundle, String string2, Object object) {
        object = (long[])object;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        bundle.putLongArray(string2, (long[])object);
    }

    public final boolean g(Object object, Object object2) {
        Object[] objectArray;
        int n3;
        object = (long[])object;
        object2 = (long[])object2;
        int n4 = 0;
        Object object3 = "<this>";
        Long[] longArray = null;
        if (object != null) {
            Intrinsics.checkNotNullParameter(object, (String)object3);
            n3 = ((Object)object).length;
            objectArray = new Long[n3];
            for (Object object4 : object) {
                Long l2 = (long)object4;
                objectArray[var9_9] = l2;
            }
        } else {
            n3 = 0;
            objectArray = null;
        }
        if (object2 != null) {
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            longArray = new Long[((Object)object2).length];
            int n7 = ((Object)object2).length;
            while (n4 < n7) {
                Object object5 = object2[n4];
                longArray[n4] = object3 = Long.valueOf((long)object5);
                ++n4;
            }
        }
        return qp_1.b(objectArray, longArray);
    }

    public final Object h() {
        return new long[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final List i(Object arrayList) {
        if ((arrayList = (ArrayList<String>)((long[])arrayList)) == null) return mz0_2.a;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(arrayList, (String)object);
        int n3 = ((Object)arrayList).length;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                Intrinsics.checkNotNullParameter(arrayList, (String)object);
                n3 = ((Object)arrayList).length;
                object = new ArrayList(n3);
                for (ArrayList arrayList2 : arrayList) {
                    Long l2 = Long.valueOf(arrayList2);
                    ((ArrayList)object).add(l2);
                }
            } else {
                Object object2 = arrayList[0];
                arrayList = (long)object2;
                object = kotlin.collections.a.b(arrayList);
            }
        } else {
            object = mz0_2.a;
        }
        if (object == null) return mz0_2.a;
        object = (Iterable)object;
        n3 = yx_2.o((Iterable)object, 10);
        arrayList = new ArrayList<String>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            long l3 = ((Number)object.next()).longValue();
            String string2 = String.valueOf(l3);
            arrayList.add(string2);
        }
        return arrayList;
    }
}

