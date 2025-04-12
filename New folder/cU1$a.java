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

public final class cU1$a
extends vx_1 {
    public static boolean[] j(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        boolean bl2 = (Boolean)cU1.e.d(string2);
        boolean[] blArray = new boolean[]{bl2};
        return blArray;
    }

    public final Object a(Bundle bundle, String string2) {
        return (boolean[])bU1.b("bundle", string2, "key", bundle, string2);
    }

    public final String b() {
        return "boolean[]";
    }

    public final Object c(Object object, String string2) {
        block3: {
            block2: {
                object = (boolean[])object;
                Object object2 = "value";
                Intrinsics.checkNotNullParameter(string2, (String)object2);
                if (object == null) break block2;
                object2 = cU1$a.j(string2);
                Intrinsics.checkNotNullParameter(object, "<this>");
                String string3 = "elements";
                Intrinsics.checkNotNullParameter(object2, string3);
                int n3 = ((Object)object).length;
                int n4 = n3 + 1;
                object = Arrays.copyOf((boolean[])object, n4);
                n4 = 0;
                int n7 = 1;
                System.arraycopy(object2, 0, object, n3, n7);
                Intrinsics.checkNotNull(object);
                if (object != null) break block3;
            }
            object = cU1$a.j(string2);
        }
        return object;
    }

    public final void e(Bundle bundle, String string2, Object object) {
        object = (boolean[])object;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        bundle.putBooleanArray(string2, (boolean[])object);
    }

    public final boolean g(Object object, Object object2) {
        Object[] objectArray;
        int n3;
        object = (boolean[])object;
        object2 = (boolean[])object2;
        int n4 = 0;
        Object object3 = "<this>";
        Boolean[] booleanArray = null;
        if (object != null) {
            Intrinsics.checkNotNullParameter(object, (String)object3);
            n3 = ((Object)object).length;
            objectArray = new Boolean[n3];
            for (Object object4 : object) {
                Boolean bl2 = (boolean)object4;
                objectArray[var9_9] = bl2;
            }
        } else {
            n3 = 0;
            objectArray = null;
        }
        if (object2 != null) {
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            booleanArray = new Boolean[((Object)object2).length];
            int n7 = ((Object)object2).length;
            while (n4 < n7) {
                Object object5 = object2[n4];
                booleanArray[n4] = object3 = Boolean.valueOf((boolean)object5);
                ++n4;
            }
        }
        return qp_1.b(objectArray, booleanArray);
    }

    public final Object h() {
        return new boolean[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final List i(Object arrayList) {
        if ((arrayList = (ArrayList<String>)((boolean[])arrayList)) == null) return mz0_2.a;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(arrayList, (String)object);
        int n3 = ((Object)arrayList).length;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                Intrinsics.checkNotNullParameter(arrayList, (String)object);
                n3 = ((Object)arrayList).length;
                object = new ArrayList(n3);
                n3 = ((ArrayList<E>)arrayList).length;
                for (int i3 = 0; i3 < n3; ++i3) {
                    n4 = (int)arrayList[i3];
                    Boolean bl2 = n4 != 0;
                    ((ArrayList)object).add(bl2);
                }
            } else {
                Object object2 = arrayList[0];
                arrayList = (boolean)object2;
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
            n3 = (int)(((Boolean)object.next()).booleanValue() ? 1 : 0);
            String string2 = String.valueOf(n3 != 0);
            arrayList.add(string2);
        }
        return arrayList;
    }
}

