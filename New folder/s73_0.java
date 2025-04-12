/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from s73
 */
public final class s73_0
extends j1_0
implements Xe1 {
    public static final s73_0 c;
    public final Object[] b;

    static {
        s73_0 s73_02;
        Object[] objectArray = new Object[]{};
        c = s73_02 = new s73_0(objectArray);
    }

    public s73_0(Object[] objectArray) {
        this.b = objectArray;
        int cfr_ignored_0 = objectArray.length;
    }

    public final ir2 A(j1$a object) {
        Object[] objectArray = this.b;
        int n3 = objectArray.length;
        int n4 = objectArray.length;
        Object[] objectArray2 = objectArray;
        boolean bl2 = false;
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object2 = objectArray[i3];
            Boolean bl3 = (Boolean)((j1$a)object).invoke(object2);
            int n7 = bl3.booleanValue();
            if (n7 != 0) {
                if (bl2) continue;
                n3 = objectArray.length;
                objectArray2 = Arrays.copyOf(objectArray, n3);
                String string2 = "copyOf(this, size)";
                Intrinsics.checkNotNullExpressionValue(objectArray2, string2);
                bl2 = true;
                n3 = i3;
                continue;
            }
            if (!bl2) continue;
            n7 = n3 + 1;
            objectArray2[n3] = object2;
            n3 = n7;
        }
        int n8 = objectArray.length;
        if (n3 == n8) {
            object = this;
        } else if (n3 == 0) {
            object = c;
        } else {
            objectArray = rp_1.m(objectArray2, 0, n3);
            object = new s73_0(objectArray);
        }
        return object;
    }

    public final int a() {
        return this.b.length;
    }

    public final ir2 add(int n3, Object objectArray) {
        Object[] objectArray2 = this.b;
        int n4 = objectArray2.length;
        bv1_0.b(n3, n4);
        n4 = objectArray2.length;
        if (n3 == n4) {
            return this.add(objectArray);
        }
        n4 = objectArray2.length;
        int n7 = 32;
        int n8 = 0;
        if (n4 < n7) {
            Object[] objectArray3 = new Object[objectArray2.length + 1];
            rp_1.k(objectArray2, 0, objectArray3, n3, 6);
            n7 = n3 + 1;
            n8 = objectArray2.length;
            rp_1.i(objectArray2, n7, objectArray3, n3, n8);
            objectArray3[n3] = objectArray;
            s73_0 s73_02 = new s73_0(objectArray3);
            return s73_02;
        }
        n4 = objectArray2.length;
        Object[] objectArray4 = Arrays.copyOf(objectArray2, n4);
        Intrinsics.checkNotNullExpressionValue(objectArray4, "copyOf(this, size)");
        int n10 = n3 + 1;
        int n14 = objectArray2.length + -1;
        rp_1.i(objectArray2, n10, objectArray4, n3, n14);
        objectArray4[n3] = objectArray;
        Object object = objectArray2[31];
        objectArray = new Object[n7];
        objectArray[0] = object;
        int n15 = objectArray2.length + 1;
        object = new mr2(objectArray4, n15, 0, objectArray);
        return object;
    }

    public final ir2 add(Object object) {
        Object[] objectArray = this.b;
        int n3 = objectArray.length;
        int n4 = 32;
        if (n3 < n4) {
            n3 = objectArray.length + 1;
            Object[] objectArray2 = Arrays.copyOf(objectArray, n3);
            Intrinsics.checkNotNullExpressionValue(objectArray2, "copyOf(this, newSize)");
            int n7 = objectArray.length;
            objectArray2[n7] = object;
            object = new s73_0(objectArray2);
            return object;
        }
        Object[] objectArray3 = new Object[n4];
        objectArray3[0] = object;
        int n8 = objectArray.length + 1;
        object = new mr2(objectArray, n8, 0, objectArray3);
        return object;
    }

    public final ir2 addAll(Collection object) {
        Object object2 = this.b;
        int n3 = ((Object[])object2).length;
        int n4 = object.size() + n3;
        if (n4 <= (n3 = 32)) {
            n3 = ((Object[])object2).length;
            n4 = object.size() + n3;
            Object[] objectArray = Arrays.copyOf(object2, n4);
            String string2 = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(objectArray, string2);
            int n7 = ((Object)object2).length;
            object = object.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                string2 = object.next();
                int n8 = n7 + 1;
                objectArray[n7] = string2;
                n7 = n8;
            }
            object = new s73_0(objectArray);
            return object;
        }
        object2 = this.b();
        ((nr2)object2).addAll((Collection)object);
        return ((nr2)object2).d();
    }

    public final nr2 b() {
        Object[] objectArray = this.b;
        nr2 nr22 = new nr2(this, null, objectArray, 0);
        return nr22;
    }

    public final Object get(int n3) {
        int n4 = this.a();
        bv1_0.a(n3, n4);
        return this.b[n3];
    }

    public final int indexOf(Object object) {
        return tp_2.F(this.b, object);
    }

    public final ir2 k(int n3) {
        Object[] objectArray = this.b;
        int n4 = objectArray.length;
        bv1_0.a(n3, n4);
        n4 = objectArray.length;
        int n7 = 1;
        if (n4 == n7) {
            return c;
        }
        n4 = objectArray.length - n7;
        Object[] objectArray2 = Arrays.copyOf(objectArray, n4);
        Intrinsics.checkNotNullExpressionValue(objectArray2, "copyOf(this, newSize)");
        n7 = n3 + 1;
        int n8 = objectArray.length;
        rp_1.i(objectArray, n3, objectArray2, n7, n8);
        s73_0 s73_02 = new s73_0(objectArray2);
        return s73_02;
    }

    public final int lastIndexOf(Object object) {
        String string2 = "<this>";
        Object[] objectArray = this.b;
        Intrinsics.checkNotNullParameter(objectArray, string2);
        int n3 = -1;
        if (object == null) {
            int n4 = objectArray.length + n3;
            if (n4 >= 0) {
                while (true) {
                    int n7 = n4 + -1;
                    Object object2 = objectArray[n4];
                    if (object2 == null) {
                        n3 = n4;
                    } else if (n7 >= 0) {
                        n4 = n7;
                        continue;
                    }
                    break;
                }
            }
        } else {
            int n8 = objectArray.length + n3;
            if (n8 >= 0) {
                while (true) {
                    int n10 = n8 + -1;
                    Object object3 = objectArray[n8];
                    boolean bl2 = Intrinsics.areEqual(object, object3);
                    if (bl2) {
                        n3 = n8;
                        break;
                    }
                    if (n10 < 0) break;
                    n8 = n10;
                }
            }
        }
        return n3;
    }

    public final ListIterator listIterator(int n3) {
        int n4 = this.a();
        bv1_0.b(n3, n4);
        int n7 = this.a();
        Object[] objectArray = this.b;
        ge_0 ge_02 = new ge_0(objectArray, n3, n7);
        return ge_02;
    }

    public final ir2 set(int n3, Object object) {
        Object[] objectArray = this.b;
        int n4 = objectArray.length;
        bv1_0.a(n3, n4);
        n4 = objectArray.length;
        objectArray = Arrays.copyOf(objectArray, n4);
        Intrinsics.checkNotNullExpressionValue(objectArray, "copyOf(this, size)");
        objectArray[n3] = object;
        s73_0 s73_02 = new s73_0(objectArray);
        return s73_02;
    }
}

