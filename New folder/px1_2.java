/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

/*
 * Renamed from px1
 */
public final class px1_2 {
    public static boolean a(ux1_2 object, cu1_2 object2) {
        int n3 = object2.toInt();
        if (n3 != 0) {
            int n4 = 10;
            if (n3 != n4) {
                n4 = 20;
                if (n3 != n4) {
                    n4 = 30;
                    if (n3 != n4) {
                        n4 = 40;
                        if (n3 == n4) {
                            return object.e();
                        }
                        StringBuilder stringBuilder = new StringBuilder("Level [");
                        stringBuilder.append(object2);
                        stringBuilder.append("] not recognized.");
                        object2 = stringBuilder.toString();
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                    return object.a();
                }
                return object.c();
            }
            return object.b();
        }
        return object.d();
    }

    public static Bundle b(String string2, String string3, String string4, String string5) {
        Bundle bundle = new Bundle();
        bundle.putString(string2, string3);
        bundle.putString(string4, string5);
        return bundle;
    }
}

