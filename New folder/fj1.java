/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class fj1 {
    public int[] a;
    public int b;

    public fj1() {
        int[] nArray = new int[10];
        this.a = nArray;
    }

    public final int a() {
        int n3;
        int[] nArray = this.a;
        this.b = n3 = this.b + -1;
        return nArray[n3];
    }

    public final void b(int n3) {
        int[] nArray;
        int n4 = this.b;
        Object object = this.a;
        int n7 = ((int[])object).length;
        if (n4 >= n7) {
            n4 = ((int[])object).length * 2;
            nArray = Arrays.copyOf(object, n4);
            object = "copyOf(this, newSize)";
            Intrinsics.checkNotNullExpressionValue(nArray, (String)object);
            this.a = nArray;
        }
        nArray = this.a;
        int n8 = this.b;
        this.b = n7 = n8 + 1;
        nArray[n8] = n3;
    }
}

