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

public final class cU1$c
extends vx_1 {
    public static float[] j(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        float f5 = ((Number)cU1.d.d(string2)).floatValue();
        float[] fArray = new float[]{f5};
        return fArray;
    }

    public final Object a(Bundle bundle, String string2) {
        return (float[])bU1.b("bundle", string2, "key", bundle, string2);
    }

    public final String b() {
        return "float[]";
    }

    public final Object c(Object object, String string2) {
        block3: {
            block2: {
                object = (float[])object;
                Object object2 = "value";
                Intrinsics.checkNotNullParameter(string2, (String)object2);
                if (object == null) break block2;
                object2 = cU1$c.j(string2);
                Intrinsics.checkNotNullParameter(object, "<this>");
                String string3 = "elements";
                Intrinsics.checkNotNullParameter(object2, string3);
                int n3 = ((Object)object).length;
                int n4 = n3 + 1;
                object = Arrays.copyOf((float[])object, n4);
                n4 = 0;
                int n7 = 1;
                System.arraycopy(object2, 0, object, n3, n7);
                Intrinsics.checkNotNull(object);
                if (object != null) break block3;
            }
            object = cU1$c.j(string2);
        }
        return object;
    }

    public final void e(Bundle bundle, String string2, Object object) {
        object = (float[])object;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(string2, "key");
        bundle.putFloatArray(string2, (float[])object);
    }

    public final boolean g(Object object, Object object2) {
        Object[] objectArray;
        int n3;
        object = (float[])object;
        object2 = (float[])object2;
        int n4 = 0;
        Object object3 = "<this>";
        Float[] floatArray = null;
        if (object != null) {
            Intrinsics.checkNotNullParameter(object, (String)object3);
            n3 = ((Object)object).length;
            objectArray = new Float[n3];
            for (Object object4 : object) {
                Float f5 = Float.valueOf((float)object4);
                objectArray[var9_9] = f5;
            }
        } else {
            n3 = 0;
            objectArray = null;
        }
        if (object2 != null) {
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            floatArray = new Float[((Object)object2).length];
            int n7 = ((Object)object2).length;
            while (n4 < n7) {
                Object object5 = object2[n4];
                floatArray[n4] = object3 = Float.valueOf((float)object5);
                ++n4;
            }
        }
        return qp_1.b(objectArray, floatArray);
    }

    public final Object h() {
        return new float[0];
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final List i(Object arrayList) {
        if ((arrayList = (ArrayList<String>)((float[])arrayList)) == null) return mz0_2.a;
        Object object = "<this>";
        Intrinsics.checkNotNullParameter(arrayList, (String)object);
        int n3 = ((Object)arrayList).length;
        if (n3 != 0) {
            int n4 = 1;
            Object object2 = Float.MIN_VALUE;
            if (n3 != n4) {
                Intrinsics.checkNotNullParameter(arrayList, (String)object);
                n3 = ((Object)arrayList).length;
                object = new ArrayList(n3);
                n3 = ((ArrayList<E>)arrayList).length;
                for (int i3 = 0; i3 < n3; ++i3) {
                    object2 = arrayList[i3];
                    Float f5 = Float.valueOf(object2);
                    ((ArrayList)object).add(f5);
                }
            } else {
                Object object3 = arrayList[0];
                arrayList = Float.valueOf((float)object3);
                object = kotlin.collections.a.b(arrayList);
            }
        } else {
            object = mz0_2.a;
        }
        if (object == null) return mz0_2.a;
        object = (Iterable)object;
        float f6 = 1.4E-44f;
        n3 = yx_2.o((Iterable)object, 10);
        arrayList = new ArrayList<String>(n3);
        object = object.iterator();
        while ((n3 = (int)(object.hasNext() ? 1 : 0)) != 0) {
            f6 = ((Number)object.next()).floatValue();
            String string2 = String.valueOf(f6);
            arrayList.add(string2);
        }
        return arrayList;
    }
}

