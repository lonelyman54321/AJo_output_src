/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class Z43 {
    public int[] a;
    public Object[] b;
    public int c;

    public Z43() {
        this(0);
    }

    public Z43(int n3) {
        Object[] objectArray = m62.b;
        this.a = objectArray;
        objectArray = m62.c;
        this.b = objectArray;
        this.c = 0;
    }

    public final Object a(Object object) {
        int n3;
        if (object == null) {
            n3 = this.c();
        } else {
            int n4 = object.hashCode();
            n3 = this.b(n4, object);
        }
        if (n3 >= 0) {
            Object[] objectArray = this.b;
            n3 = (n3 << 1) + 1;
            object = objectArray[n3];
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public final int b(int n3, Object object) {
        Object object2;
        Object object3;
        int n4 = this.c;
        if (n4 == 0) {
            return -1;
        }
        int[] nArray = this.a;
        int n7 = m62.a(n4, n3, nArray);
        if (n7 < 0) {
            return n7;
        }
        Object object4 = this.b;
        int n8 = n7 << 1;
        int n10 = Intrinsics.areEqual(object, object4 = object4[n8]);
        if (n10 != 0) {
            return n7;
        }
        for (n10 = n7 + 1; n10 < n4 && (n8 = (object3 = this.a)[n10]) == n3; ++n10) {
            object3 = this.b;
            int n14 = n10 << 1;
            n8 = (int)(Intrinsics.areEqual(object, object3 = (Object)object3[n14]) ? 1 : 0);
            if (n8 == 0) continue;
            return n10;
        }
        n7 += -1;
        while (n7 >= 0 && (n4 = (object2 = this.a)[n7]) == n3) {
            object2 = this.b;
            n8 = n7 << 1;
            n4 = (int)(Intrinsics.areEqual(object, object2 = (Object)object2[n8]) ? 1 : 0);
            if (n4 != 0) {
                return n7;
            }
            n7 += -1;
        }
        return ~n10;
    }

    public final int c() {
        Object object;
        Object object2;
        int n3 = this.c;
        if (n3 == 0) {
            return -1;
        }
        int[] nArray = this.a;
        int n4 = 0;
        Object object3 = null;
        int n7 = m62.a(n3, 0, nArray);
        if (n7 < 0) {
            return n7;
        }
        object3 = this.b;
        int n8 = n7 << 1;
        if ((object3 = object3[n8]) == null) {
            return n7;
        }
        for (n4 = n7 + 1; n4 < n3 && (n8 = (object2 = this.a)[n4]) == 0; ++n4) {
            object2 = this.b;
            int n10 = n4 << 1;
            if ((object2 = (Object)object2[n10]) != null) continue;
            return n4;
        }
        n7 += -1;
        while (n7 >= 0 && (n3 = (object = this.a)[n7]) == 0) {
            object = this.b;
            n8 = n7 << 1;
            if ((object = (Object)object[n8]) == null) {
                return n7;
            }
            n7 += -1;
        }
        return ~n4;
    }

    public final Object d(Fq$b object, Fq$a fq$a) {
        Object[] objectArray;
        int n3;
        int n4;
        int n7;
        int n8;
        int n10 = this.c;
        if (object == null) {
            n8 = this.c();
            n7 = 0;
        } else {
            n7 = ((Fq$b)object).hashCode();
            n8 = this.b(n7, object);
        }
        if (n8 >= 0) {
            int n14 = (n8 << 1) + 1;
            Object[] objectArray2 = this.b;
            Object object2 = objectArray2[n14];
            objectArray2[n14] = fq$a;
            return object2;
        }
        n8 ^= 0xFFFFFFFF;
        Object[] objectArray3 = this.a;
        int n15 = objectArray3.length;
        if (n10 >= n15) {
            n15 = 8;
            if (n10 >= n15) {
                n15 = (n10 >> 1) + n10;
            } else {
                n4 = 4;
                if (n10 < n4) {
                    n15 = 4;
                }
            }
            objectArray3 = Arrays.copyOf(objectArray3, n15);
            String string2 = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(objectArray3, string2);
            this.a = objectArray3;
            objectArray3 = this.b;
            objectArray3 = Arrays.copyOf(objectArray3, n15 <<= 1);
            Intrinsics.checkNotNullExpressionValue(objectArray3, string2);
            this.b = objectArray3;
            n3 = this.c;
            if (n10 != n3) {
                object = new ConcurrentModificationException();
                throw object;
            }
        }
        if (n8 < n10) {
            objectArray3 = this.a;
            n15 = n8 + 1;
            rp_1.f(n15, n8, n10, objectArray3, objectArray3);
            objectArray3 = this.b;
            n4 = n8 << 1;
            int n16 = this.c << 1;
            rp_1.i(objectArray3, n15 <<= 1, objectArray3, n4, n16);
        }
        if (n10 == (n3 = this.c) && n8 < (n15 = (objectArray = this.a).length)) {
            objectArray[n8] = n7;
            objectArray = this.b;
            objectArray[n8 <<= 1] = (int)object;
            objectArray[++n8] = (int)fq$a;
            this.c = ++n3;
            return null;
        }
        object = new ConcurrentModificationException();
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean equals(Object object) {
        block22: {
            int n3;
            boolean bl2;
            block18: {
                bl2 = true;
                if (this == object) {
                    return bl2;
                }
                n3 = object instanceof Z43;
                if (n3 == 0) break block18;
                object = (Z43)object;
                n3 = this.c;
                int n4 = ((Z43)object).c;
                if (n3 != n4) {
                    return false;
                }
                n4 = 0;
                Object var5_6 = null;
                while (true) {
                    block21: {
                        int n7;
                        Object object2;
                        Object object3;
                        block19: {
                            block20: {
                                if (n4 >= n3) {
                                    return bl2;
                                }
                                object3 = this.b;
                                int n8 = n4 << 1;
                                Object object4 = object3[n8];
                                object3 = object3[++n8];
                                object2 = ((Z43)object).a(object4);
                                if (object3 != null) break block19;
                                if (object2 != null) break block20;
                                if (object4 == null) {
                                    n7 = ((Z43)object).c();
                                } else {
                                    n7 = object4.hashCode();
                                    n7 = ((Z43)object).b(n7, object4);
                                }
                                if (n7 >= 0) break block21;
                            }
                            return false;
                        }
                        n7 = Intrinsics.areEqual(object3, object2);
                        if (n7 == 0) {
                            return false;
                        }
                    }
                    ++n4;
                }
            }
            n3 = object instanceof Map;
            if (n3 == 0) break block22;
            try {
                n3 = this.c;
                Object object5 = object;
                object5 = (Map)object;
                int n10 = object5.size();
                if (n3 != n10) {
                    return false;
                }
                n3 = this.c;
                n10 = 0;
                object5 = null;
                while (true) {
                    block25: {
                        boolean bl3;
                        Object object6;
                        Object object7;
                        block23: {
                            block24: {
                                if (n10 >= n3) {
                                    return bl2;
                                }
                                object7 = this.b;
                                int n14 = n10 << 1;
                                Object object8 = object7[n14];
                                object7 = object7[++n14];
                                object6 = object;
                                object6 = (Map)object;
                                object6 = object6.get(object8);
                                if (object7 != null) break block23;
                                if (object6 != null) break block24;
                                object7 = object;
                                object7 = (Map)object;
                                bl3 = object7.containsKey(object8);
                                if (bl3) break block25;
                            }
                            return false;
                        }
                        bl3 = Intrinsics.areEqual(object7, object6);
                        if (!bl3) {
                            return false;
                        }
                    }
                    ++n10;
                }
            }
            catch (ClassCastException | NullPointerException runtimeException) {}
        }
        return false;
    }

    public final int hashCode() {
        int[] nArray = this.a;
        Object[] objectArray = this.b;
        int n3 = this.c;
        int n4 = 1;
        int n7 = 0;
        int n8 = 0;
        while (n7 < n3) {
            int n10;
            Object object = objectArray[n4];
            int n14 = nArray[n7];
            if (object != null) {
                n10 = object.hashCode();
            } else {
                n10 = 0;
                object = null;
            }
            n8 += (n10 ^= n14);
            ++n7;
            n4 += 2;
        }
        return n8;
    }

    public final String toString() {
        int n3 = this.c;
        if (n3 <= 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(n3 *= 28);
        stringBuilder.append('{');
        n3 = this.c;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            if (i3 > 0) {
                object = ", ";
                stringBuilder.append((String)object);
            }
            object = this.b;
            int n4 = i3 << 1;
            object = object[n4];
            String string2 = "(this Map)";
            if (object != this) {
                stringBuilder.append(object);
            } else {
                stringBuilder.append(string2);
            }
            char c2 = '=';
            stringBuilder.append(c2);
            object = this.b;
            object = object[++n4];
            if (object != this) {
                stringBuilder.append(object);
                continue;
            }
            stringBuilder.append(string2);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

