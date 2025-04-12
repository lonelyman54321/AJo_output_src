/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
import android.os.Build;

/*
 * Renamed from at2
 */
public final class at2_2 {
    public static final ci_2 a;
    public static final yh2_2 b;
    public static final we_2 c;

    static {
        Object object = System.getProperty("java.vm.name");
        object.getClass();
        int n3 = 0;
        String string2 = "RoboVM";
        boolean bl2 = ((String)object).equals(string2);
        if (!bl2) {
            string2 = "Dalvik";
            boolean n4 = ((String)object).equals(string2);
            if (!n4) {
                a = null;
                b = object = new Object();
                c = object = new Object();
            } else {
                a = object = new ci_2();
                int n7 = Build.VERSION.SDK_INT;
                n3 = 24;
                if (n7 >= n3) {
                    b = object = new Object();
                    c = object = new Object();
                } else {
                    b = object = new Object();
                    c = object = new Object();
                }
            }
        } else {
            a = null;
            b = object = new Object();
            c = object = new Object();
        }
    }
}

