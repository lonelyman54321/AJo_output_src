/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
package androidx.core.content;

import android.net.Uri;
import androidx.core.content.FileProvider;
import androidx.core.content.FileProvider$a;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class FileProvider$b
implements FileProvider$a {
    public final String a;
    public final HashMap b;

    public FileProvider$b(String string2) {
        HashMap hashMap;
        this.b = hashMap = new HashMap();
        this.a = string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean c(String string2, String string3) {
        boolean bl2 = (string2 = FileProvider.a(string2)).equals(string3 = FileProvider.a(string3));
        if (bl2) return true;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        char c2 = '/';
        stringBuilder.append(c2);
        string3 = stringBuilder.toString();
        boolean bl3 = string2.startsWith(string3);
        if (!bl3) return false;
        return true;
    }

    public final Uri a(File object) {
        Map.Entry entry;
        boolean bl2;
        Object object2;
        Object object3;
        try {
            object = ((File)object).getCanonicalPath();
            object3 = this.b.entrySet().iterator();
            object2 = null;
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder("Failed to resolve canonical path for ");
            stringBuilder.append(object);
            object = stringBuilder.toString();
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        while (bl2 = object3.hasNext()) {
            String string2;
            int n3;
            entry = object3.next();
            String string3 = ((File)entry.getValue()).getPath();
            int n4 = FileProvider$b.c((String)object, string3);
            if (n4 == 0 || object2 != null && (n3 = string3.length()) <= (n4 = (string2 = ((File)object2.getValue()).getPath()).length())) continue;
            object2 = entry;
        }
        if (object2 != null) {
            object3 = ((File)object2.getValue()).getPath();
            boolean bl3 = ((String)object3).endsWith((String)((Object)(entry = "/")));
            if (bl3) {
                int n8 = ((String)object3).length();
                object = ((String)object).substring(n8);
            } else {
                int n3 = ((String)object3).length() + 1;
                object = ((String)object).substring(n3);
            }
            object3 = new StringBuilder();
            object2 = Uri.encode((String)((String)object2.getKey()));
            ((StringBuilder)object3).append((String)object2);
            ((StringBuilder)object3).append('/');
            object = Uri.encode((String)object, (String)((Object)entry));
            ((StringBuilder)object3).append((String)object);
            object = ((StringBuilder)object3).toString();
            object3 = new Uri.Builder();
            object3 = object3.scheme("content");
            object2 = this.a;
            return object3.authority((String)object2).encodedPath((String)object).build();
        }
        object = kp1_0.c("Failed to find configured root that contains ", (String)object);
        object3 = new IllegalArgumentException((String)object);
        throw object3;
    }

    public final File b(Uri object) {
        Object object2 = object.getEncodedPath();
        int n3 = 1;
        int n4 = ((String)object2).indexOf(47, n3);
        String string2 = Uri.decode((String)((String)object2).substring(n3, n4));
        object2 = Uri.decode((String)((String)object2).substring(n4 += n3));
        Object object3 = (File)this.b.get(string2);
        if (object3 != null) {
            object = new File((File)object3, (String)object2);
            try {
                object = ((File)object).getCanonicalFile();
                object2 = ((File)object).getPath();
                object3 = ((File)object3).getPath();
            }
            catch (IOException iOException) {
                object3 = new StringBuilder("Failed to resolve canonical path for ");
                ((StringBuilder)object3).append(object);
                object = ((StringBuilder)object3).toString();
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            boolean bl2 = FileProvider$b.c((String)object2, (String)object3);
            if (bl2) {
                return object;
            }
            object = new SecurityException("Resolved path jumped beyond configured root");
            throw object;
        }
        object = og3_1.a((Uri)object, "Unable to find configured root for ");
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

