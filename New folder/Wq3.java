/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Wq3 {
    public static final Wq3 e;
    public final int[] a;
    public final List b;
    public final int c;
    public final List d;

    static {
        Wq3 wq3;
        mz0_2 mz0_22 = mz0_2.a;
        e = wq3 = new Wq3(0, mz0_22);
    }

    public Wq3(int n3, List list) {
        Intrinsics.checkNotNullParameter(list, "data");
        int[] nArray = new int[]{n3};
        this(nArray, list, n3, null);
    }

    public Wq3(int[] object, List object2, int n3, List list) {
        Intrinsics.checkNotNullParameter(object, "originalPageOffsets");
        String string2 = "data";
        Intrinsics.checkNotNullParameter(object2, string2);
        this.a = object;
        this.b = object2;
        this.c = n3;
        this.d = list;
        int n4 = ((int[])object).length;
        n3 = 1;
        if (n4 == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            object = null;
        }
        if ((n4 ^= n3) != 0) {
            if (list != null && (n4 = list.size()) != (n3 = object2.size())) {
                object = new StringBuilder;
                super("If originalIndices (size = ");
                Intrinsics.checkNotNull(list);
                n3 = list.size();
                ((StringBuilder)object).append(n3);
                ((StringBuilder)object).append(") is provided, it must be same length as data (size = ");
                int n7 = object2.size();
                ((StringBuilder)object).append(n7);
                ((StringBuilder)object).append(')');
                object = ((StringBuilder)object).toString();
                object = object.toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            return;
        }
        object = new IllegalArgumentException;
        object2 = "originalPageOffsets cannot be empty when constructing TransformablePage".toString();
        super((String)object2);
        throw object;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = Wq3.class) == (object2 = object.getClass())) {
            object = (Wq3)object;
            object2 = this.a;
            object3 = ((Wq3)object).a;
            int n3 = Arrays.equals((int[])object2, (int[])object3);
            if (n3 == 0) {
                return false;
            }
            object2 = this.b;
            object3 = ((Wq3)object).b;
            n3 = Intrinsics.areEqual(object2, object3);
            if (n3 == 0) {
                return false;
            }
            n3 = this.c;
            int n4 = ((Wq3)object).c;
            if (n3 != n4) {
                return false;
            }
            object2 = this.d;
            object = ((Wq3)object).d;
            boolean bl3 = Intrinsics.areEqual(object2, object);
            if (!bl3) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int[] nArray = this.a;
        int n3 = Arrays.hashCode(nArray);
        int n4 = 31;
        n3 *= 31;
        List list = this.b;
        n3 = ne_0.a(n3, n4, list);
        int n7 = this.c;
        n3 = (n3 + n7) * 31;
        List list2 = this.d;
        if (list2 != null) {
            n4 = ((Object)list2).hashCode();
        } else {
            n4 = 0;
            list2 = null;
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TransformablePage(originalPageOffsets=");
        Object object = Arrays.toString(this.a);
        stringBuilder.append((String)object);
        stringBuilder.append(", data=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", hintOriginalPageOffset=");
        int n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", hintOriginalIndices=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

