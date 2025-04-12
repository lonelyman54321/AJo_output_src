/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.net.Uri
 *  android.util.Log
 */
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

public final class NK2
implements BP1 {
    public final BP1 a;
    public final Resources b;

    public NK2(Resources resources, BP1 bP1) {
        this.b = resources;
        this.a = bP1;
    }

    public final BP1$a a(Object object, int n3, int n4, Z92 z92) {
        object = (Integer)object;
        Object object2 = this.b;
        String string2 = "android.resource://";
        BP1$a bP1$a = null;
        StringBuilder stringBuilder = new StringBuilder(string2);
        int c2 = (Integer)object;
        string2 = object2.getResourcePackageName(c2);
        stringBuilder.append(string2);
        char c3 = '/';
        stringBuilder.append(c3);
        int n7 = (Integer)object;
        String string3 = object2.getResourceTypeName(n7);
        stringBuilder.append(string3);
        stringBuilder.append(c3);
        int n8 = (Integer)object;
        object = object2.getResourceEntryName(n8);
        stringBuilder.append((String)object);
        object = stringBuilder.toString();
        try {
            object = Uri.parse((String)object);
        }
        catch (Resources.NotFoundException notFoundException) {
            int n10 = 5;
            Log.isLoggable((String)"ResourceLoader", (int)n10);
            n8 = 0;
            object = null;
        }
        if (object != null) {
            object2 = this.a;
            bP1$a = object2.a(object, n3, n4, z92);
        }
        return bP1$a;
    }
}

