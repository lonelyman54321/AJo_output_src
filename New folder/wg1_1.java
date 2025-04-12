/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wG1
 */
public final class wg1_1 {
    public int[] a;
    public int b;
    public float[] c;

    public wg1_1(int[] objectArray) {
        int n3;
        Intrinsics.checkNotNullParameter(objectArray, "shape");
        this.a = objectArray;
        this.b = n3 = wG1$a.a(objectArray);
        objectArray = new float[n3];
        this.c = objectArray;
    }
}

