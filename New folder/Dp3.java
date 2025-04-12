/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class Dp3 {
    public final Cp3[] a;
    public int b;

    public Dp3(Cp3 ... cp3Array) {
        this.a = cp3Array;
        int cfr_ignored_0 = cp3Array.length;
    }

    public final boolean equals(Object objectArray) {
        Object[] objectArray2;
        Class<Dp3> clazz;
        if (this == objectArray) {
            return true;
        }
        if (objectArray != null && (clazz = Dp3.class) == (objectArray2 = objectArray.getClass())) {
            objectArray = (Dp3)objectArray;
            objectArray2 = this.a;
            objectArray = objectArray.a;
            return Arrays.equals(objectArray2, objectArray);
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.b;
        if (n3 == 0) {
            int n4;
            Object[] objectArray = this.a;
            n3 = Arrays.hashCode(objectArray);
            this.b = n4 = 527 + n3;
        }
        return this.b;
    }
}

