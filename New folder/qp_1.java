/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;

/*
 * Renamed from Qp
 */
public class qp_1
extends pp_2 {
    public static boolean b(Object[] objectArray, Object[] objectArray2) {
        int n3;
        int n4;
        boolean bl2 = true;
        if (objectArray == objectArray2) {
            return bl2;
        }
        if (objectArray != null && objectArray2 != null && (n4 = objectArray.length) == (n3 = objectArray2.length)) {
            n4 = objectArray.length;
            for (n3 = 0; n3 < n4; ++n3) {
                Object object = objectArray[n3];
                Object object2 = objectArray2[n3];
                if (object == object2) continue;
                if (object != null && object2 != null) {
                    boolean bl3;
                    boolean bl4 = object instanceof Object[];
                    if (bl4 && (bl4 = object2 instanceof Object[])) {
                        bl3 = qp_1.b(object = (Object[])object, object2 = (Object[])object2);
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof byte[];
                    if (bl4 && (bl4 = object2 instanceof byte[])) {
                        bl3 = Arrays.equals((byte[])(object = (Object)((byte[])object)), (byte[])(object2 = (Object)((byte[])object2)));
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof short[];
                    if (bl4 && (bl4 = object2 instanceof short[])) {
                        bl3 = Arrays.equals((short[])(object = (Object)((short[])object)), (short[])(object2 = (Object)((short[])object2)));
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof int[];
                    if (bl4 && (bl4 = object2 instanceof int[])) {
                        bl3 = Arrays.equals((int[])(object = (Object)((int[])object)), (int[])(object2 = (Object)((int[])object2)));
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof long[];
                    if (bl4 && (bl4 = object2 instanceof long[])) {
                        bl3 = Arrays.equals((long[])(object = (Object)((long[])object)), (long[])(object2 = (Object)((long[])object2)));
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof float[];
                    if (bl4 && (bl4 = object2 instanceof float[])) {
                        bl3 = Arrays.equals((float[])(object = (Object)((float[])object)), (float[])(object2 = (Object)((float[])object2)));
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof double[];
                    if (bl4 && (bl4 = object2 instanceof double[])) {
                        bl3 = Arrays.equals((double[])(object = (Object)((double[])object)), (double[])(object2 = (Object)((double[])object2)));
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof char[];
                    if (bl4 && (bl4 = object2 instanceof char[])) {
                        bl3 = Arrays.equals((char[])(object = (Object)((char[])object)), (char[])(object2 = (Object)((char[])object2)));
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof boolean[];
                    if (bl4 && (bl4 = object2 instanceof boolean[])) {
                        bl3 = Arrays.equals((boolean[])(object = (Object)((boolean[])object)), (boolean[])(object2 = (Object)((boolean[])object2)));
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof dt3_0;
                    Object object3 = null;
                    if (bl4 && (bl4 = object2 instanceof dt3_0)) {
                        object = (dt3_0)object;
                        object2 = (dt3_0)object2;
                        object = object.a;
                        if (object == null) {
                            bl3 = false;
                            object = null;
                        }
                        if ((object2 = (Object)object2.a) != null) {
                            object3 = object2;
                        }
                        bl3 = Arrays.equals((byte[])object, (byte[])object3);
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof mu3_0;
                    if (bl4 && (bl4 = object2 instanceof mu3_0)) {
                        object = (mu3_0)object;
                        object2 = (mu3_0)object2;
                        object = object.a;
                        if (object == null) {
                            bl3 = false;
                            object = null;
                        }
                        if ((object2 = (Object)object2.a) != null) {
                            object3 = object2;
                        }
                        bl3 = Arrays.equals((short[])object, (short[])object3);
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof it3_0;
                    if (bl4 && (bl4 = object2 instanceof it3_0)) {
                        object = (it3_0)object;
                        object2 = (it3_0)object2;
                        object = object.a;
                        if (object == null) {
                            bl3 = false;
                            object = null;
                        }
                        if ((object2 = (Object)object2.a) != null) {
                            object3 = object2;
                        }
                        bl3 = Arrays.equals((int[])object, (int[])object3);
                        if (bl3) continue;
                        return false;
                    }
                    bl4 = object instanceof nt3_0;
                    if (bl4 && (bl4 = object2 instanceof nt3_0)) {
                        object = (nt3_0)object;
                        object2 = (nt3_0)object2;
                        object = object.a;
                        if (object == null) {
                            bl3 = false;
                            object = null;
                        }
                        if ((object2 = (Object)object2.a) != null) {
                            object3 = object2;
                        }
                        bl3 = Arrays.equals((long[])object, (long[])object3);
                        if (bl3) continue;
                        return false;
                    }
                    bl3 = Intrinsics.areEqual(object, object2);
                    if (bl3) continue;
                    return false;
                }
                return false;
            }
            return bl2;
        }
        return false;
    }

    public static String c(Object[] object) {
        if (object == null) {
            return "null";
        }
        int n3 = ((Object[])object).length;
        int n4 = 0x19999999;
        if (n3 > n4) {
            n3 = 0x19999999;
        }
        n3 = n3 * 5 + 2;
        StringBuilder stringBuilder = new StringBuilder(n3);
        ArrayList arrayList = new ArrayList();
        qp_1.d(object, stringBuilder, arrayList);
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static final void d(Object[] objectArray, StringBuilder stringBuilder, ArrayList arrayList) {
        int n3 = arrayList.contains(objectArray);
        if (n3 != 0) {
            stringBuilder.append("[...]");
            return;
        }
        arrayList.add(objectArray);
        stringBuilder.append('[');
        n3 = objectArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n4;
            String string2;
            String string3;
            KMappedMarker kMappedMarker;
            Object object;
            if (i3 != 0) {
                object = ", ";
                stringBuilder.append((String)object);
            }
            object = objectArray[i3];
            Object object2 = "null";
            if (object == null) {
                stringBuilder.append((String)object2);
                continue;
            }
            boolean bl2 = object instanceof Object[];
            if (bl2) {
                object = object;
                qp_1.d(object, stringBuilder, arrayList);
                continue;
            }
            bl2 = object instanceof byte[];
            String string4 = "toString(...)";
            if (bl2) {
                object = Arrays.toString((byte[])object);
                Intrinsics.checkNotNullExpressionValue(object, string4);
                stringBuilder.append((String)object);
                continue;
            }
            bl2 = object instanceof short[];
            if (bl2) {
                object = Arrays.toString((short[])object);
                Intrinsics.checkNotNullExpressionValue(object, string4);
                stringBuilder.append((String)object);
                continue;
            }
            bl2 = object instanceof int[];
            if (bl2) {
                object = Arrays.toString((int[])object);
                Intrinsics.checkNotNullExpressionValue(object, string4);
                stringBuilder.append((String)object);
                continue;
            }
            bl2 = object instanceof long[];
            if (bl2) {
                object = Arrays.toString((long[])object);
                Intrinsics.checkNotNullExpressionValue(object, string4);
                stringBuilder.append((String)object);
                continue;
            }
            bl2 = object instanceof float[];
            if (bl2) {
                object = Arrays.toString((float[])object);
                Intrinsics.checkNotNullExpressionValue(object, string4);
                stringBuilder.append((String)object);
                continue;
            }
            bl2 = object instanceof double[];
            if (bl2) {
                object = Arrays.toString((double[])object);
                Intrinsics.checkNotNullExpressionValue(object, string4);
                stringBuilder.append((String)object);
                continue;
            }
            bl2 = object instanceof char[];
            if (bl2) {
                object = Arrays.toString((char[])object);
                Intrinsics.checkNotNullExpressionValue(object, string4);
                stringBuilder.append((String)object);
                continue;
            }
            bl2 = object instanceof boolean[];
            if (bl2) {
                object = Arrays.toString((boolean[])object);
                Intrinsics.checkNotNullExpressionValue(object, string4);
                stringBuilder.append((String)object);
                continue;
            }
            bl2 = object instanceof dt3_0;
            if (bl2) {
                object = ((dt3_0)object).a;
                if (object != null && (object = CollectionsKt.R(kMappedMarker = new dt3_0((byte[])object), string4 = ", ", string3 = "[", string2 = "]", null, n4 = 56)) != null) {
                    object2 = object;
                }
                stringBuilder.append((String)object2);
                continue;
            }
            bl2 = object instanceof mu3_0;
            if (bl2) {
                object = ((mu3_0)object).a;
                if (object != null && (object = CollectionsKt.R(kMappedMarker = new mu3_0((short[])object), string4 = ", ", string3 = "[", string2 = "]", null, n4 = 56)) != null) {
                    object2 = object;
                }
                stringBuilder.append((String)object2);
                continue;
            }
            bl2 = object instanceof it3_0;
            if (bl2) {
                object = ((it3_0)object).a;
                if (object != null && (object = CollectionsKt.R(kMappedMarker = new it3_0((int[])object), string4 = ", ", string3 = "[", string2 = "]", null, n4 = 56)) != null) {
                    object2 = object;
                }
                stringBuilder.append((String)object2);
                continue;
            }
            bl2 = object instanceof nt3_0;
            if (bl2) {
                object = ((nt3_0)object).a;
                if (object != null && (object = CollectionsKt.R(kMappedMarker = new nt3_0((long[])object), string4 = ", ", string3 = "[", string2 = "]", null, n4 = 56)) != null) {
                    object2 = object;
                }
                stringBuilder.append((String)object2);
                continue;
            }
            object = object.toString();
            stringBuilder.append((String)object);
        }
        stringBuilder.append(']');
        int n7 = xx_2.h(arrayList);
        arrayList.remove(n7);
    }
}

