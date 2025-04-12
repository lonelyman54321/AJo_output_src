/*
 * Decompiled with CFR 0.152.
 */
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.CodedOutputStream;
import androidx.datastore.preferences.protobuf.G;
import androidx.datastore.preferences.protobuf.H;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.a_0;
import androidx.datastore.preferences.protobuf.g_0;
import androidx.datastore.preferences.protobuf.j;
import androidx.datastore.preferences.protobuf.j_0;
import androidx.datastore.preferences.protobuf.l_0;
import androidx.datastore.preferences.protobuf.o;
import androidx.datastore.preferences.protobuf.p$b;
import androidx.datastore.preferences.protobuf.t;
import java.lang.reflect.Constructor;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

public final class E {
    public static final Class a;
    public static final H b;
    public static final H c;
    public static final j_0 d;

    static {
        Object object = "androidx.datastore.preferences.protobuf.GeneratedMessageV3";
        try {
            object = Class.forName((String)object);
        }
        catch (Throwable throwable) {
            object = null;
        }
        a = object;
        b = E.A(false);
        c = E.A(true);
        d = object = new H();
    }

    public static H A(boolean bl2) {
        Class[] classArray;
        int n3 = 1;
        Constructor constructor = "androidx.datastore.preferences.protobuf.UnknownFieldSetSchema";
        try {
            constructor = Class.forName((String)((Object)constructor));
        }
        catch (Throwable throwable) {
            constructor = null;
        }
        if (constructor == null) {
            return null;
        }
        try {
            classArray = new Class[n3];
        }
        catch (Throwable throwable) {
            return null;
        }
        Class<Boolean> clazz = Boolean.TYPE;
        classArray[0] = clazz;
        constructor = ((Class)((Object)constructor)).getConstructor(classArray);
        Boolean bl3 = bl2;
        Object[] objectArray = new Object[n3];
        objectArray[0] = bl3;
        bl3 = constructor.newInstance(objectArray);
        return (H)((Object)bl3);
    }

    public static void B(j object, Object iterator, Object object2) {
        object2 = ((j)object).c(object2);
        Object object3 = ((l_0)object2).a;
        boolean bl2 = ((AbstractMap)object3).isEmpty();
        if (!bl2) {
            boolean bl3;
            object = ((j)object).d(iterator);
            object.getClass();
            int n3 = 0;
            iterator = null;
            while (true) {
                object3 = ((l_0)object2).a;
                List list = ((G)object3).b;
                int n4 = list.size();
                if (n3 >= n4) break;
                object3 = ((G)object3).e(n3);
                ((l_0)object).j((Map.Entry)object3);
                ++n3;
            }
            iterator = ((G)object3).f().iterator();
            while (bl3 = iterator.hasNext()) {
                object2 = (Map.Entry)iterator.next();
                ((l_0)object).j((Map.Entry)object2);
            }
        }
    }

    public static boolean C(Object object, Object object2) {
        boolean bl2;
        if (!(object == object2 || object != null && (bl2 = object.equals(object2)))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }

    public static Object D(int n3, int n4, Object object, H h3) {
        if (object == null) {
            object = h3.m();
        }
        long l2 = n4;
        h3.e(object, n3, l2);
        return object;
    }

    public static void E(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Boolean bl2 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    ((Boolean)list.get(n3)).getClass();
                    n4 += 1;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    bl2 = (Boolean)list.get(n7);
                    n3 = (byte)(bl2.booleanValue() ? 1 : 0);
                    ((CodedOutputStream)object).D((byte)n3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Boolean bl3 = (Boolean)list.get(n7);
                    n4 = bl3.booleanValue();
                    ((CodedOutputStream)object).E(n3, n4 != 0);
                }
            }
        }
    }

    public static void F(int n3, List list, L l2) {
        int n4;
        if (list != null && (n4 = list.isEmpty()) == 0) {
            int n7;
            l2 = (g_0)l2;
            l2.getClass();
            for (n4 = 0; n4 < (n7 = list.size()); ++n4) {
                DF dF = (DF)list.get(n4);
                CodedOutputStream codedOutputStream = ((g_0)l2).a;
                codedOutputStream.G(n3, dF);
            }
        }
    }

    public static void G(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Double d2 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    ((Double)list.get(n3)).getClass();
                    n4 += 8;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    d2 = (Double)list.get(n7);
                    double d5 = d2;
                    long l2 = Double.doubleToRawLongBits(d5);
                    ((CodedOutputStream)object).L(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Double d7 = (Double)list.get(n7);
                    double d9 = d7;
                    object.getClass();
                    long l3 = Double.doubleToRawLongBits(d9);
                    ((CodedOutputStream)object).K(n3, l3);
                }
            }
        }
    }

    public static void H(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Integer n10 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    Integer n14 = (Integer)list.get(n3);
                    n8 = CodedOutputStream.o(n14);
                    n4 += n8;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    n10 = (Integer)list.get(n7);
                    n3 = n10;
                    ((CodedOutputStream)object).N(n3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Integer n15 = (Integer)list.get(n7);
                    n4 = n15;
                    ((CodedOutputStream)object).M(n3, n4);
                }
            }
        }
    }

    public static void I(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Integer n10 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    ((Integer)list.get(n3)).getClass();
                    n4 += 4;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    n10 = (Integer)list.get(n7);
                    n3 = n10;
                    ((CodedOutputStream)object).J(n3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Integer n14 = (Integer)list.get(n7);
                    n4 = n14;
                    ((CodedOutputStream)object).I(n3, n4);
                }
            }
        }
    }

    public static void J(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Long l2 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    ((Long)list.get(n3)).getClass();
                    n4 += 8;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    l2 = (Long)list.get(n7);
                    long l3 = l2;
                    ((CodedOutputStream)object).L(l3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Long l4 = (Long)list.get(n7);
                    long l7 = l4;
                    ((CodedOutputStream)object).K(n3, l7);
                }
            }
        }
    }

    public static void K(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                float f5 = 0.0f;
                Float f6 = null;
                n4 = 0;
                float f7 = 0.0f;
                Object var8_9 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    ((Float)list.get(n3)).getClass();
                    n4 += 4;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    f6 = (Float)list.get(n7);
                    f5 = f6.floatValue();
                    n3 = Float.floatToRawIntBits(f5);
                    ((CodedOutputStream)object).J(n3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Float f8 = (Float)list.get(n7);
                    float f11 = f8.floatValue();
                    object.getClass();
                    n4 = Float.floatToRawIntBits(f11);
                    ((CodedOutputStream)object).I(n3, n4);
                }
            }
        }
    }

    public static void L(int n3, List list, L l2, st2_0 st2_02) {
        int n4;
        if (list != null && (n4 = list.isEmpty()) == 0) {
            int n7;
            l2 = (g_0)l2;
            l2.getClass();
            for (n4 = 0; n4 < (n7 = list.size()); ++n4) {
                Object e2 = list.get(n4);
                ((g_0)l2).i(n3, e2, st2_02);
            }
        }
    }

    public static void M(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Integer n10 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    Integer n14 = (Integer)list.get(n3);
                    n8 = CodedOutputStream.o(n14);
                    n4 += n8;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    n10 = (Integer)list.get(n7);
                    n3 = n10;
                    ((CodedOutputStream)object).N(n3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Integer n15 = (Integer)list.get(n7);
                    n4 = n15;
                    ((CodedOutputStream)object).M(n3, n4);
                }
            }
        }
    }

    public static void N(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                long l2;
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Long l3 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    Long l4 = (Long)list.get(n3);
                    l2 = l4;
                    n8 = CodedOutputStream.B(l2);
                    n4 += n8;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    l3 = (Long)list.get(n7);
                    l2 = l3;
                    ((CodedOutputStream)object).Y(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Long l7 = (Long)list.get(n7);
                    long l8 = l7;
                    ((CodedOutputStream)object).X(n3, l8);
                }
            }
        }
    }

    public static void O(int n3, List list, L l2, st2_0 st2_02) {
        int n4;
        if (list != null && (n4 = list.isEmpty()) == 0) {
            int n7;
            l2 = (g_0)l2;
            l2.getClass();
            for (n4 = 0; n4 < (n7 = list.size()); ++n4) {
                Object e2 = list.get(n4);
                ((g_0)l2).l(n3, e2, st2_02);
            }
        }
    }

    public static void P(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Integer n10 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    ((Integer)list.get(n3)).getClass();
                    n4 += 4;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    n10 = (Integer)list.get(n7);
                    n3 = n10;
                    ((CodedOutputStream)object).J(n3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Integer n14 = (Integer)list.get(n7);
                    n4 = n14;
                    ((CodedOutputStream)object).I(n3, n4);
                }
            }
        }
    }

    public static void Q(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Long l2 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    ((Long)list.get(n3)).getClass();
                    n4 += 8;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    l2 = (Long)list.get(n7);
                    long l3 = l2;
                    ((CodedOutputStream)object).L(l3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Long l4 = (Long)list.get(n7);
                    long l7 = l4;
                    ((CodedOutputStream)object).K(n3, l7);
                }
            }
        }
    }

    public static void R(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Integer n10 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    Integer n14 = (Integer)list.get(n3);
                    n8 = n14;
                    int n15 = n8 << 1;
                    n8 = CodedOutputStream.z(n8 >> 31 ^ n15);
                    n4 += n8;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    n10 = (Integer)list.get(n7);
                    n3 = n10;
                    n4 = n3 << 1;
                    n3 = n3 >> 31 ^ n4;
                    ((CodedOutputStream)object).W(n3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Integer n16 = (Integer)list.get(n7);
                    n4 = n16;
                    int n17 = n4 << 1;
                    n4 = n4 >> 31 ^ n17;
                    ((CodedOutputStream)object).V(n3, n4);
                }
            }
        }
    }

    public static void S(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            int n8;
            if (list == null || (n8 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            n8 = 63;
            int n10 = 1;
            if (n4) {
                long l2;
                long l3;
                int n14;
                ((CodedOutputStream)object).U(n3, 2);
                Long l4 = null;
                n4 = 0;
                Object var8_8 = null;
                for (n3 = 0; n3 < (n14 = list.size()); ++n3) {
                    Long l7 = (Long)list.get(n3);
                    l3 = l7;
                    l2 = l3 << n10;
                    l3 = l3 >> n8 ^ l2;
                    n14 = CodedOutputStream.B(l3);
                    n4 += n14;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    l4 = (Long)list.get(n7);
                    l3 = l4;
                    l2 = l3 << n10;
                    l3 = l3 >> n8 ^ l2;
                    ((CodedOutputStream)object).Y(l3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Long l8 = (Long)list.get(n7);
                    long l12 = l8;
                    long l14 = l12 << n10;
                    l12 = l12 >> n8 ^ l14;
                    ((CodedOutputStream)object).X(n3, l12);
                }
            }
        }
    }

    public static void T(int n3, List list, L object) {
        block5: {
            int n4;
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = (g_0)object;
            object.getClass();
            n7 = list instanceof Dt1;
            object = ((g_0)object).a;
            if (n7 != 0) {
                int n8;
                List list2 = list;
                list2 = (Dt1)list;
                for (n4 = 0; n4 < (n8 = list.size()); ++n4) {
                    Object object2 = list2.getRaw(n4);
                    boolean bl2 = object2 instanceof String;
                    if (bl2) {
                        object2 = (String)object2;
                        ((CodedOutputStream)object).S(n3, (String)object2);
                        continue;
                    }
                    object2 = (DF)object2;
                    ((CodedOutputStream)object).G(n3, (DF)object2);
                }
            } else {
                while (n4 < (n7 = list.size())) {
                    String string2 = (String)list.get(n4);
                    ((CodedOutputStream)object).S(n3, string2);
                    ++n4;
                }
            }
        }
    }

    public static void U(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Integer n10 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    Integer n14 = (Integer)list.get(n3);
                    n8 = CodedOutputStream.z(n14);
                    n4 += n8;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    n10 = (Integer)list.get(n7);
                    n3 = n10;
                    ((CodedOutputStream)object).W(n3);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Integer n15 = (Integer)list.get(n7);
                    n4 = n15;
                    ((CodedOutputStream)object).V(n3, n4);
                }
            }
        }
    }

    public static void V(int n3, List list, L object, boolean n4) {
        block5: {
            int n7;
            if (list == null || (n7 = list.isEmpty()) != 0) break block5;
            object = ((g_0)object).a;
            if (n4) {
                long l2;
                int n8;
                ((CodedOutputStream)object).U(n3, 2);
                Long l3 = null;
                n4 = 0;
                Object var6_6 = null;
                for (n3 = 0; n3 < (n8 = list.size()); ++n3) {
                    Long l4 = (Long)list.get(n3);
                    l2 = l4;
                    n8 = CodedOutputStream.B(l2);
                    n4 += n8;
                }
                ((CodedOutputStream)object).W(n4);
                while (n7 < (n3 = list.size())) {
                    l3 = (Long)list.get(n7);
                    l2 = l3;
                    ((CodedOutputStream)object).Y(l2);
                    ++n7;
                }
            } else {
                for (n7 = 0; n7 < (n4 = list.size()); ++n7) {
                    Long l7 = (Long)list.get(n7);
                    long l8 = l7;
                    ((CodedOutputStream)object).X(n3, l8);
                }
            }
        }
    }

    public static int a(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return CodedOutputStream.e(n3) * n4;
    }

    public static int b(List list) {
        return list.size();
    }

    public static int c(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        n3 = CodedOutputStream.x(n3) * n4;
        for (int i3 = 0; i3 < (n4 = list.size()); ++i3) {
            DF dF = (DF)list.get(i3);
            n4 = CodedOutputStream.g(dF);
            n3 += n4;
        }
        return n3;
    }

    public static int d(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = E.e(list);
        return CodedOutputStream.x(n3) * n4 + n7;
    }

    public static int e(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof o;
        if (n7 != 0) {
            list = (o)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                ((o)list).c(n3);
                int[] nArray = ((o)list).b;
                int n8 = CodedOutputStream.o(nArray[n3]);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = CodedOutputStream.o(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int f(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return CodedOutputStream.j(n3) * n4;
    }

    public static int g(List list) {
        return list.size() * 4;
    }

    public static int h(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        return CodedOutputStream.k(n3) * n4;
    }

    public static int i(List list) {
        return list.size() * 8;
    }

    public static int j(int n3, List list, st2_0 st2_02) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            wo1_1 wo1_12 = (wo1_1)list.get(i3);
            int n8 = CodedOutputStream.m(n3, wo1_12, st2_02);
            n7 += n8;
        }
        return n7;
    }

    public static int k(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = E.l(list);
        return CodedOutputStream.x(n3) * n4 + n7;
    }

    public static int l(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof o;
        if (n7 != 0) {
            list = (o)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                ((o)list).c(n3);
                int[] nArray = ((o)list).b;
                int n8 = CodedOutputStream.o(nArray[n3]);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = CodedOutputStream.o(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int m(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        n4 = E.n(list);
        int n7 = list.size();
        return CodedOutputStream.x(n3) * n7 + n4;
    }

    public static int n(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof t;
        if (n7 != 0) {
            list = (t)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                ((t)list).c(n3);
                long[] lArray = ((t)list).b;
                long l2 = lArray[n3];
                int n8 = CodedOutputStream.B(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = CodedOutputStream.B(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static int o(int n3, Object object, st2_0 st2_02) {
        boolean bl2 = object instanceof yq1_0;
        if (bl2) {
            object = (yq1_0)object;
            n3 = CodedOutputStream.x(n3);
            return CodedOutputStream.q((yq1_0)object) + n3;
        }
        object = (wo1_1)object;
        n3 = CodedOutputStream.x(n3);
        int n4 = ((a_0)object).c(st2_02);
        return CodedOutputStream.z(n4) + n4 + n3;
    }

    public static int p(int n3, List list, st2_0 st2_02) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        n3 = CodedOutputStream.x(n3) * n4;
        for (int i3 = 0; i3 < n4; ++i3) {
            int n7;
            Object object = list.get(i3);
            int n8 = object instanceof yq1_0;
            if (n8 != 0) {
                object = (yq1_0)object;
                n3 = n7 = CodedOutputStream.q(object) + n3;
                continue;
            }
            object = (a_0)((wo1_1)object);
            n7 = ((a_0)object).c(st2_02);
            n3 = n8 = CodedOutputStream.z(n7) + n7 + n3;
        }
        return n3;
    }

    public static int q(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = E.r(list);
        return CodedOutputStream.x(n3) * n4 + n7;
    }

    public static int r(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof o;
        if (n7 != 0) {
            list = (o)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                ((o)list).c(n3);
                int[] nArray = ((o)list).b;
                int n8 = nArray[n3];
                int n10 = n8 << 1;
                n8 = CodedOutputStream.z(n8 >> 31 ^ n10);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n14 = (Integer)list.get(n3);
                int n15 = n14;
                int n16 = n15 << 1;
                n15 = CodedOutputStream.z(n15 >> 31 ^ n16);
                n7 += n15;
                ++n3;
            }
        }
        return n7;
    }

    public static int s(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = E.t(list);
        return CodedOutputStream.x(n3) * n4 + n7;
    }

    public static int t(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof t;
        int n8 = 63;
        int n10 = 1;
        if (n7 != 0) {
            list = (t)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                ((t)list).c(n3);
                long[] lArray = ((t)list).b;
                long l2 = lArray[n3];
                long l3 = l2 << n10;
                long l4 = l2 >> n8 ^ l3;
                int n14 = CodedOutputStream.B(l4);
                n7 += n14;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l7 = (Long)list.get(n3);
                long l8 = l7;
                long l12 = l8 << n10;
                l8 = l8 >> n8 ^ l12;
                int n15 = CodedOutputStream.B(l8);
                n7 += n15;
                ++n3;
            }
        }
        return n7;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int u(int n3, List list) {
        int n4;
        int n7 = list.size();
        if (n7 == 0) {
            return 0;
        }
        n3 = CodedOutputStream.x(n3) * n7;
        int n8 = list instanceof Dt1;
        if (n8 != 0) {
            list = (Dt1)list;
            for (n4 = 0; n4 < n7; ++n4) {
                Object object = list.getRaw(n4);
                boolean bl2 = object instanceof DF;
                if (bl2) {
                    DF dF = (DF)object;
                    n8 = CodedOutputStream.g(dF);
                } else {
                    String string2 = (String)object;
                    n8 = CodedOutputStream.w(string2);
                }
                n3 = n8 += n3;
            }
            return n3;
        } else {
            while (n4 < n7) {
                Object e2 = list.get(n4);
                boolean bl3 = e2 instanceof DF;
                if (bl3) {
                    DF dF = (DF)e2;
                    n8 = CodedOutputStream.g(dF);
                } else {
                    String string3 = (String)e2;
                    n8 = CodedOutputStream.w(string3);
                }
                n3 = n8 += n3;
                ++n4;
            }
        }
        return n3;
    }

    public static int v(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = E.w(list);
        return CodedOutputStream.x(n3) * n4 + n7;
    }

    public static int w(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof o;
        if (n7 != 0) {
            list = (o)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                ((o)list).c(n3);
                int[] nArray = ((o)list).b;
                int n8 = CodedOutputStream.z(nArray[n3]);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Integer n10 = (Integer)list.get(n3);
                int n14 = CodedOutputStream.z(n10);
                n7 += n14;
                ++n3;
            }
        }
        return n7;
    }

    public static int x(int n3, List list) {
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = E.y(list);
        return CodedOutputStream.x(n3) * n4 + n7;
    }

    public static int y(List list) {
        int n3;
        int n4 = list.size();
        if (n4 == 0) {
            return 0;
        }
        int n7 = list instanceof t;
        if (n7 != 0) {
            list = (t)list;
            n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                ((t)list).c(n3);
                long[] lArray = ((t)list).b;
                long l2 = lArray[n3];
                int n8 = CodedOutputStream.B(l2);
                n7 += n8;
            }
        } else {
            n7 = 0;
            while (n3 < n4) {
                Long l3 = (Long)list.get(n3);
                long l4 = l3;
                int n10 = CodedOutputStream.B(l4);
                n7 += n10;
                ++n3;
            }
        }
        return n7;
    }

    public static Object z(int n3, List object, p$b p$b, Object object2, H h3) {
        if (p$b == null) {
            return object2;
        }
        int n4 = object instanceof RandomAccess;
        if (n4 != 0) {
            n4 = object.size();
            int n7 = 0;
            for (int i3 = 0; i3 < n4; ++i3) {
                Integer n8 = (Integer)((List)object).get(i3);
                int n10 = n8;
                boolean bl2 = p$b.a();
                if (bl2) {
                    if (i3 != n7) {
                        ((List)object).set(n7, n8);
                    }
                    ++n7;
                    continue;
                }
                object2 = E.D(n3, n10, object2, h3);
            }
            if (n7 != n4) {
                List list = ((List)object).subList(n7, n4);
                list.clear();
            }
        } else {
            object = object.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Integer n14 = (Integer)object.next();
                n4 = n14;
                boolean bl3 = p$b.a();
                if (bl3) continue;
                object2 = E.D(n3, n4, object2, h3);
                object.remove();
            }
        }
        return object2;
    }
}

