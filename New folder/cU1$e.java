/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

public final class cU1$e
extends vx_1 {
    public static int[] j(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        int n3 = ((Number)cU1.b.d(string2)).intValue();
        return new int[]{n3};
    }

    public final Object a(Bundle bundle, String string2) {
        return (int[])bU1.b("bundle", string2, "key", bundle, string2);
    }

    public final String b() {
        return "integer[]";
    }

    public final Object c(Object object, String string2) {
        object = (int[])object;
        Object object2 = "value";
        Intrinsics.checkNotNullParameter(string2, (String)object2);
        if (object == null || (object = (Object)rp_1.r((int[])object, (int[])(object2 = (Object)cU1$e.j(string2)))) == null) {
            object = cU1$e.j(string2);
        }
        return object;
    }

    public final void e(Bundle bundle, String string2, Object object) {
        object = (int[])object;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        bundle.putIntArray(string2, (int[])object);
    }

    public final boolean g(Object object, Object object2) {
        Object[] objectArray;
        int n3;
        object = (int[])object;
        object2 = (int[])object2;
        int n4 = 0;
        Object object3 = "<this>";
        Integer[] integerArray = null;
        if (object != null) {
            Intrinsics.checkNotNullParameter(object, (String)object3);
            n3 = ((Object)object).length;
            objectArray = new Integer[n3];
            for (Object object4 : object) {
                Integer n7 = (int)object4;
                objectArray[var9_9] = n7;
            }
        } else {
            n3 = 0;
            objectArray = null;
        }
        if (object2 != null) {
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            integerArray = new Integer[((Object)object2).length];
            int n8 = ((Object)object2).length;
            while (n4 < n8) {
                Object object5 = object2[n4];
                integerArray[n4] = object3 = Integer.valueOf((int)object5);
                ++n4;
            }
        }
        return qp_1.b(objectArray, integerArray);
    }

    public final Object h() {
        return new int[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final List i(Object arrayList) {
        if ((arrayList = (ArrayList<String>)((int[])arrayList)) == null) return mz0_2.a;
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
                    Integer n7 = Integer.valueOf(arrayList2);
                    ((ArrayList)object).add(n7);
                }
            } else {
                Object object2 = arrayList[0];
                arrayList = (int)object2;
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
            n3 = ((Number)object.next()).intValue();
            String string2 = String.valueOf(n3);
            arrayList.add(string2);
        }
        return arrayList;
    }
}

