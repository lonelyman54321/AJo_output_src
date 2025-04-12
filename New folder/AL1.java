/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;

public final class AL1 {
    public static boolean a(Bundle bundle, Bundle bundle2) {
        int n3;
        int n4;
        int n7;
        boolean bl2 = true;
        if (bundle == bundle2) {
            return bl2;
        }
        String string2 = "android.media.browse.extra.PAGE_SIZE";
        String string3 = "android.media.browse.extra.PAGE";
        int n8 = -1;
        if (bundle == null) {
            int n10 = bundle2.getInt(string3, n8);
            if (n10 != n8 || (n10 = bundle2.getInt(string2, n8)) != n8) {
                bl2 = false;
            }
            return bl2;
        }
        if (bundle2 == null) {
            int n14;
            int n15 = bundle.getInt(string3, n8);
            if (n15 != n8 || (n14 = bundle.getInt(string2, n8)) != n8) {
                bl2 = false;
            }
            return bl2;
        }
        int n16 = bundle.getInt(string3, n8);
        if (n16 != (n7 = bundle2.getInt(string3, n8)) || (n4 = bundle.getInt(string2, n8)) != (n3 = bundle2.getInt(string2, n8))) {
            bl2 = false;
        }
        return bl2;
    }
}

