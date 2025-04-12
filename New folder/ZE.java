/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class ZE {
    public final byte[] a;
    public final int b;

    public ZE(byte[] byArray) {
        int n3;
        this.a = byArray;
        this.b = n3 = Arrays.hashCode(byArray);
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof ZE;
        if (!bl2) {
            return false;
        }
        object = ((ZE)object).a;
        return Arrays.equals(this.a, (byte[])object);
    }

    public final int hashCode() {
        return this.b;
    }
}

