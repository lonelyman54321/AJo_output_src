/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class jj1 {
    public static final jj1 a;
    public static boolean b;
    public static boolean c;

    static {
        jj1 jj12;
        a = jj12 = new jj1();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(String object) {
        Throwable throwable2;
        Object object2;
        Object object3;
        int n3;
        block9: {
            float[][] fArrayArray;
            float[] fArray;
            n3 = 1;
            int n4 = td0.b(this);
            if (n4 != 0) {
                return false;
            }
            n4 = td0.b(this);
            object3 = "none";
            object2 = null;
            if (n4 != 0) {
                return Intrinsics.areEqual(object3, object2) ^ n3;
            }
            n4 = 30;
            try {
                fArray = new float[n4];
                fArrayArray = null;
                for (int i3 = 0; i3 < n4; i3 += n3) {
                    fArray[i3] = 0.0f;
                }
            }
            catch (Throwable throwable2) {
                break block9;
            }
            HP1$a hP1$a = HP1$a.MTML_INTEGRITY_DETECT;
            fArrayArray = new float[n3][];
            fArrayArray[0] = fArray;
            object = new String[]{object};
            if ((object = hp1_1.f(hP1$a, fArrayArray, object)) != null && (object = object[0]) != null) {
                object2 = object;
                return Intrinsics.areEqual(object3, object2) ^ n3;
            }
            object2 = object3;
            return Intrinsics.areEqual(object3, object2) ^ n3;
        }
        try {
            td0.a(this, throwable2);
            return Intrinsics.areEqual(object3, object2) ^ n3;
        }
        catch (Throwable throwable3) {
            td0.a(this, throwable3);
            return false;
        }
    }
}

