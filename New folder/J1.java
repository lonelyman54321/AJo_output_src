/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public abstract class J1 {
    public String a;
    public final int[] b;

    public J1() {
        int[] nArray = new int[2];
        this.b = nArray;
    }

    public abstract int[] a(int var1);

    public final int[] b(int n3, int n4) {
        if (n3 >= 0 && n4 >= 0 && n3 != n4) {
            int[] nArray = this.b;
            nArray[0] = n3;
            nArray[1] = n4;
            return nArray;
        }
        return null;
    }

    public final String c() {
        String string2 = this.a;
        if (string2 != null) {
            return string2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("text");
        return null;
    }

    public abstract int[] d(int var1);
}

