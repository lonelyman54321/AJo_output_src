/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;

public final class FN1 {
    public static boolean a(Uri object) {
        boolean bl2;
        String string2;
        String string3;
        boolean bl3;
        if (object != null && (bl3 = (string3 = "content").equals(string2 = object.getScheme())) && (bl2 = (string3 = "media").equals(object = object.getAuthority()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

