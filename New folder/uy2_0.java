/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Uy2
 */
public final class uy2_0 {
    public static final List a(M11 object, Function1 function1, boolean bl2) {
        int n3;
        ArrayList<Object[]> arrayList = new ArrayList<Object[]>();
        int n4 = 1;
        Object object2 = new M11[n4];
        boolean bl3 = false;
        Boolean bl4 = null;
        object2[0] = object;
        object = xx_2.j(object2);
        while ((n3 = object.isEmpty() ^ n4) != 0) {
            object2 = (M11)cx_2.y((List)object);
            bl4 = (Boolean)function1.invoke(object2);
            bl3 = bl4;
            if (bl3) {
                if (bl2) {
                    return a.b(object2);
                }
                arrayList.add((Object[])object2);
            }
            object2 = object2.g;
            object.addAll(object2);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Object[] b(Class object, int n3) {
        int n4 = 0;
        if (object == null) return new Object[0];
        try {
            Object object2;
            int n7;
            block20: {
                boolean bl2;
                int n8;
                Object var7_7;
                int n10;
                Object object3;
                hz2_2 hz2_22;
                block21: {
                    block19: {
                        object = ((Class)object).getConstructors();
                        n7 = ((Object)object).length;
                        hz2_22 = null;
                        object3 = null;
                        n10 = 0;
                        var7_7 = null;
                        n8 = 0;
                        while (true) {
                            bl2 = true;
                            if (n10 >= n7) break;
                            Object object4 = object[n10];
                            Class<?>[] classArray = ((Constructor)object4).getParameterTypes();
                            int n14 = classArray.length;
                            if (n14 == 0) {
                                if (n8 != 0) break block19;
                                object3 = object4;
                                n8 = 1;
                            }
                            ++n10;
                        }
                        if (n8 != 0) break block21;
                    }
                    object3 = null;
                }
                if (object3 == null) {
                    String string2 = "PreviewParameterProvider constructor can not have parameters";
                    object = new IllegalArgumentException(string2);
                    throw object;
                }
                ((AccessibleObject)object3).setAccessible(bl2);
                object = ((Constructor)object3).newInstance(null);
                object2 = "null cannot be cast to non-null type androidx.compose.ui.tooling.preview.PreviewParameterProvider<*>";
                Intrinsics.checkNotNull(object, (String)object2);
                object = (ty2_0)object;
                if (n3 < 0) {
                    Object object5 = object.getValues();
                    int n15 = object.getCount();
                    object5 = object5.iterator();
                    object2 = new Object[n15];
                    while (true) {
                        if (n4 >= n15) {
                            return object2;
                        }
                        hz2_22 = object5.next();
                        object2[n4] = hz2_22;
                        ++n4;
                    }
                }
                object = object.getValues();
                object2 = "<this>";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                hz2_22 = new hz2_2(n3);
                Intrinsics.checkNotNullParameter(object, (String)object2);
                object2 = "defaultValue";
                Intrinsics.checkNotNullParameter(hz2_22, (String)object2);
                if (n3 < 0) {
                    object = n3;
                    object = hz2_22.invoke(object);
                } else {
                    object = object.iterator();
                    n7 = 0;
                    object2 = null;
                    while ((n10 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                        var7_7 = object.next();
                        n8 = n7 + 1;
                        if (n3 == n7) {
                            object = var7_7;
                            break block20;
                        }
                        n7 = n8;
                    }
                    object = n3;
                    object = hz2_22.invoke(object);
                }
            }
            object = a.b(object);
            object = (Iterable)object;
            n7 = 10;
            n7 = yx_2.o((Iterable)object, n7);
            ArrayList<Object[]> arrayList = new ArrayList<Object[]>(n7);
            object = object.iterator();
            while (true) {
                if ((n7 = (int)(object.hasNext() ? 1 : 0)) == 0) {
                    object = new Object[]{};
                    return arrayList.toArray((T[])object);
                }
                object2 = object.next();
                object2 = uy2_0.c(object2);
                arrayList.add((Object[])object2);
            }
        }
        catch (lo1_2 lo1_22) {}
        object = new IllegalStateException("Deploying Compose Previews with PreviewParameterProvider arguments requires adding a dependency to the kotlin-reflect library.\nConsider adding 'debugImplementation \"org.jetbrains.kotlin:kotlin-reflect:$kotlin_version\"' to the module's build.gradle.");
        throw object;
    }

    public static final Object c(Object object) {
        if (object != null) {
            Object object2 = object.getClass().getAnnotations();
            int n3 = ((Annotation[])object2).length;
            int n4 = 0;
            Object object3 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                Class<?> clazz = object2[i3];
                boolean bl2 = clazz instanceof tn1_2;
                if (!bl2) continue;
                object2 = object.getClass().getDeclaredFields();
                n3 = ((Object[])object2).length;
                while (n4 < n3) {
                    object3 = object2[n4];
                    clazz = ((Field)object3).getType();
                    bl2 = clazz.isPrimitive();
                    if (bl2) {
                        object2 = ((Field)object3).getName();
                        object2 = object.getClass().getDeclaredField((String)object2);
                        ((AccessibleObject)object2).setAccessible(true);
                        return ((Field)object2).get(object);
                    }
                    ++n4;
                }
                object = new NoSuchElementException("Array contains no element matching the predicate.");
                throw object;
            }
        }
        return object;
    }
}

