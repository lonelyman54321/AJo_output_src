/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
import android.util.Base64;
import java.io.ByteArrayInputStream;

public final class wi0$c$a
implements wi0$a {
    public final ByteArrayInputStream a(String object) {
        Object object2 = "data:image";
        boolean n3 = ((String)object).startsWith((String)object2);
        if (n3) {
            int n4;
            int n7 = ((String)object).indexOf(44);
            if (n7 != (n4 = -1)) {
                String string2;
                n4 = 0;
                String string3 = ((String)object).substring(0, n7);
                boolean bl2 = string3.endsWith(string2 = ";base64");
                if (bl2) {
                    int n8 = n7 + 1;
                    object = Base64.decode((String)((String)object).substring(n8), (int)0);
                    object2 = new ByteArrayInputStream((byte[])object);
                    return object2;
                }
                object = new IllegalArgumentException("Not a base64 image data URL.");
                throw object;
            }
            object = new IllegalArgumentException("Missing comma in data URL.");
            throw object;
        }
        object = new IllegalArgumentException("Not a valid image data URL.");
        throw object;
    }
}

