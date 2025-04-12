/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.net.Uri
 *  android.util.Log
 */
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.Objects;

public final class TK2
implements BP1 {
    public final Context a;
    public final BP1 b;

    public TK2(Context context, BP1 bP1) {
        this.a = context = context.getApplicationContext();
        this.b = bP1;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final BP1$a a(Object object, int n3, int n4, Z92 z92) {
        object = (Uri)object;
        Object object2 = object.getPathSegments();
        int n7 = object2.size();
        BP1 bP1 = this.b;
        Object object3 = null;
        int n8 = 5;
        BP1$a bP1$a = null;
        String string2 = "ResourceUriLoader";
        int n10 = 1;
        if (n7 == n10) {
            block7: {
                int n14;
                try {
                    object2 = object.getPathSegments();
                    object2 = object2.get(0);
                    object2 = (String)object2;
                    n14 = Integer.parseInt((String)object2);
                    if (n14 == 0) {
                        n3 = (int)(Log.isLoggable((String)string2, (int)n8) ? 1 : 0);
                        if (n3 == 0) return bP1$a;
                        object.toString();
                        return bP1$a;
                    }
                }
                catch (NumberFormatException numberFormatException) {
                    break block7;
                }
                {
                    object2 = n14;
                    return bP1.a(object2, n3, n4, z92);
                }
            }
            n3 = (int)(Log.isLoggable((String)string2, (int)n8) ? 1 : 0);
            if (n3 == 0) return bP1$a;
            Objects.toString(object);
            return bP1$a;
        }
        int n15 = object2.size();
        if (n15 != (n7 = 2)) {
            n3 = (int)(Log.isLoggable((String)string2, (int)n8) ? 1 : 0);
            if (n3 == 0) return bP1$a;
            object.toString();
            return bP1$a;
        }
        object2 = object.getPathSegments();
        String string3 = (String)object2.get(0);
        object2 = (String)object2.get(n10);
        object3 = this.a;
        Resources resources = object3.getResources();
        n15 = resources.getIdentifier((String)object2, string3, (String)(object3 = object3.getPackageName()));
        if (n15 == 0) {
            n3 = (int)(Log.isLoggable((String)string2, (int)n8) ? 1 : 0);
            if (n3 == 0) return bP1$a;
            object.toString();
            return bP1$a;
        }
        object = n15;
        return bP1.a(object, n3, n4, z92);
    }

    public final boolean b(Object object) {
        boolean bl2;
        String string2 = "android.resource";
        String string3 = (object = (Uri)object).getScheme();
        boolean bl3 = string2.equals(string3);
        if (bl3 && (bl2 = (string3 = this.a.getPackageName()).equals(object = object.getAuthority()))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

