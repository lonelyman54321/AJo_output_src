/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.util;

import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public final class ArrayUtils {
    private ArrayUtils() {
    }

    public static Object[] concat(Object[] ... objectArray) {
        int n3 = objectArray.length;
        if (n3 != 0) {
            int n4;
            int n7;
            Object[] objectArray2 = null;
            int n8 = 0;
            Object[] objectArray3 = null;
            for (n3 = 0; n3 < (n7 = objectArray.length); ++n3) {
                Object[] objectArray4 = objectArray[n3];
                n7 = objectArray4.length;
                n8 += n7;
            }
            objectArray2 = Arrays.copyOf(objectArray[0], n8);
            objectArray3 = objectArray[0];
            n8 = objectArray3.length;
            for (n7 = 1; n7 < (n4 = objectArray.length); ++n7) {
                Object[] objectArray5 = objectArray[n7];
                int n10 = objectArray5.length;
                System.arraycopy(objectArray5, 0, objectArray2, n8, n10);
                n8 += n10;
            }
            return objectArray2;
        }
        return (Object[])Array.newInstance(objectArray.getClass(), 0);
    }

    public static byte[] concatByteArrays(byte[] ... byArray) {
        int n3 = byArray.length;
        if (n3 != 0) {
            int n4;
            int n7;
            byte[] byArray2 = null;
            int n8 = 0;
            byte[] byArray3 = null;
            for (n3 = 0; n3 < (n7 = byArray.length); ++n3) {
                byte[] byArray4 = byArray[n3];
                n7 = byArray4.length;
                n8 += n7;
            }
            byArray2 = Arrays.copyOf(byArray[0], n8);
            byArray3 = byArray[0];
            n8 = byArray3.length;
            for (n7 = 1; n7 < (n4 = byArray.length); ++n7) {
                byte[] byArray5 = byArray[n7];
                int n10 = byArray5.length;
                System.arraycopy(byArray5, 0, byArray2, n8, n10);
                n8 += n10;
            }
            return byArray2;
        }
        return new byte[0];
    }

    public static boolean contains(int[] nArray, int n3) {
        if (nArray != null) {
            int n4;
            for (int i3 = 0; i3 < (n4 = nArray.length); ++i3) {
                n4 = nArray[i3];
                if (n4 != n3) continue;
                return true;
            }
        }
        return false;
    }

    public static boolean contains(Object[] objectArray, Object object) {
        int n3 = objectArray != null ? objectArray.length : 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object2 = objectArray[i3];
            boolean bl2 = Objects.equal(object2, object);
            if (!bl2) continue;
            if (i3 < 0) break;
            return true;
        }
        return false;
    }

    public static ArrayList newArrayList() {
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public static Object[] removeAll(Object[] objectArray, Object ... objectArray2) {
        block8: {
            int n3;
            Object[] objectArray3;
            block10: {
                Object[] objectArray4;
                block9: {
                    int n4;
                    objectArray4 = null;
                    if (objectArray == null) {
                        return null;
                    }
                    if (objectArray2 == null || (n4 = objectArray2.length) == 0) break block8;
                    objectArray3 = objectArray2.getClass();
                    int n7 = objectArray.length;
                    objectArray3 = (Object[])Array.newInstance(objectArray3.getComponentType(), n7);
                    n3 = 1;
                    if (n4 == n3) {
                        n3 = 0;
                        Object var8_8 = null;
                        for (n4 = 0; n4 < n7; ++n4) {
                            Object object = objectArray2[0];
                            Object object2 = objectArray[n4];
                            int n8 = Objects.equal(object, object2);
                            if (n8 != 0) continue;
                            n8 = n3 + 1;
                            objectArray3[n3] = object2;
                            n3 = n8;
                        }
                    } else {
                        n4 = 0;
                        for (int i3 = 0; i3 < n7; ++i3) {
                            Object object = objectArray[i3];
                            int n10 = ArrayUtils.contains(objectArray2, object);
                            if (n10 != 0) continue;
                            n10 = n4 + 1;
                            objectArray3[n4] = object;
                            n4 = n10;
                        }
                        n3 = n4;
                    }
                    if (objectArray3 == null) break block9;
                    int n14 = objectArray3.length;
                    if (n3 != n14) break block10;
                    objectArray4 = objectArray3;
                }
                return objectArray4;
            }
            return Arrays.copyOf(objectArray3, n3);
        }
        int n15 = objectArray.length;
        return Arrays.copyOf(objectArray, n15);
    }

    public static ArrayList toArrayList(Object[] objectArray) {
        int n3 = objectArray.length;
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object = objectArray[i3];
            arrayList.add(object);
        }
        return arrayList;
    }

    public static int[] toPrimitiveArray(Collection object) {
        int n3;
        int n4 = 0;
        if (object != null && (n3 = object.isEmpty()) == 0) {
            int n7;
            n3 = object.size();
            int[] nArray = new int[n3];
            object = object.iterator();
            while ((n7 = object.hasNext()) != 0) {
                Integer n8 = (Integer)object.next();
                int n10 = n4 + 1;
                nArray[n4] = n7 = n8.intValue();
                n4 = n10;
            }
            return nArray;
        }
        return new int[0];
    }

    public static Integer[] toWrapperArray(int[] nArray) {
        if (nArray == null) {
            return null;
        }
        int n3 = nArray.length;
        Integer[] integerArray = new Integer[n3];
        for (int i3 = 0; i3 < n3; ++i3) {
            Integer n4;
            int n7 = nArray[i3];
            integerArray[i3] = n4 = Integer.valueOf(n7);
        }
        return integerArray;
    }

    public static void writeArray(StringBuilder stringBuilder, double[] dArray) {
        int n3 = dArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            if (i3 != 0) {
                String string2 = ",";
                stringBuilder.append(string2);
            }
            double d2 = dArray[i3];
            stringBuilder.append(d2);
        }
    }

    public static void writeArray(StringBuilder stringBuilder, float[] fArray) {
        int n3 = fArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            if (i3 != 0) {
                String string2 = ",";
                stringBuilder.append(string2);
            }
            float f5 = fArray[i3];
            stringBuilder.append(f5);
        }
    }

    public static void writeArray(StringBuilder stringBuilder, int[] nArray) {
        int n3 = nArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            if (i3 != 0) {
                String string2 = ",";
                stringBuilder.append(string2);
            }
            int n4 = nArray[i3];
            stringBuilder.append(n4);
        }
    }

    public static void writeArray(StringBuilder stringBuilder, long[] lArray) {
        int n3 = lArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            if (i3 != 0) {
                String string2 = ",";
                stringBuilder.append(string2);
            }
            long l2 = lArray[i3];
            stringBuilder.append(l2);
        }
    }

    public static void writeArray(StringBuilder stringBuilder, Object[] objectArray) {
        int n3 = objectArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            if (i3 != 0) {
                object = ",";
                stringBuilder.append((String)object);
            }
            object = objectArray[i3];
            stringBuilder.append(object);
        }
    }

    public static void writeArray(StringBuilder stringBuilder, boolean[] blArray) {
        int n3 = blArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            if (i3 != 0) {
                String string2 = ",";
                stringBuilder.append(string2);
            }
            boolean bl2 = blArray[i3];
            stringBuilder.append(bl2);
        }
    }

    public static void writeStringArray(StringBuilder stringBuilder, String[] stringArray) {
        int n3 = stringArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2;
            if (i3 != 0) {
                string2 = ",";
                stringBuilder.append(string2);
            }
            string2 = "\"";
            stringBuilder.append(string2);
            String string3 = stringArray[i3];
            stringBuilder.append(string3);
            stringBuilder.append(string2);
        }
    }
}

