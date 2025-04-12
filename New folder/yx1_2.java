/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yx1
 */
public final class yx1_2
implements tx1_2 {
    public final ux1_2 a;

    public yx1_2() {
        int n3 = 1;
        int n4 = wx1_2.a;
        Object object = da1_2.class;
        Object object2 = ((Class)object).getName();
        Object object3 = wx1_2.b().a();
        object2 = object3.a((String)object2);
        boolean bl2 = wx1_2.d;
        if (bl2) {
            object3 = fz3_0.a;
            int n7 = 0;
            Object object4 = null;
            if (object3 == null) {
                bl2 = fz3_0.b;
                if (bl2) {
                    bl2 = false;
                    object3 = null;
                } else {
                    try {
                    }
                    catch (SecurityException securityException) {
                        bl2 = false;
                        object3 = null;
                    }
                    fz3_0.a = object3;
                    fz3_0.b = n3;
                }
            }
            if (object3 != null) {
                String string2;
                int n8;
                int n10;
                object3 = ((fz3$a)object3).getClassContext();
                object4 = fz3_0.class.getName();
                for (n10 = 0; n10 < (n8 = ((Class[])object3).length) && (n8 = (int)(((String)object4).equals(string2 = object3[n10].getName()) ? 1 : 0)) == 0; n10 += n3) {
                }
                n7 = ((Class[])object3).length;
                if (n10 >= n7 || (n10 += 2) >= (n7 = ((Class[])object3).length)) {
                    IllegalStateException illegalStateException = new IllegalStateException("Failed to find org.slf4j.helpers.Util or its caller in the stack; this should not happen");
                    throw illegalStateException;
                }
                object4 = object3[n10];
            }
            if (object4 != null && (n3 ^= (n4 = (int)(((Class)object4).isAssignableFrom((Class<?>)object) ? 1 : 0))) != 0) {
                String string3 = object2.getName();
                object = ((Class)object4).getName();
                object4 = "Detected logger name mismatch. Given name: \"";
                super((String)object4);
                ((StringBuilder)object3).append(string3);
                ((StringBuilder)object3).append("\"; computed name: \"");
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append("\".");
                hj2_2.e(((StringBuilder)object3).toString());
                string3 = "See https://www.slf4j.org/codes.html#loggerNameMismatch for an explanation";
                hj2_2.e(string3);
            }
        }
        Intrinsics.checkNotNull(object2);
        this.a = object2;
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        this.a.info(string2);
    }
}

