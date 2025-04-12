/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class vp$a$a {
    public static final float[] a() {
        float[] fArray = vp$a_0.s;
        if (fArray != null) {
            Intrinsics.checkNotNull(fArray);
        } else {
            int n3 = 91;
            vp$a_0.s = fArray = new float[n3];
            Intrinsics.checkNotNull(fArray);
        }
        return fArray;
    }
}

