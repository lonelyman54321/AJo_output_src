/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 */
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;

/*
 * Renamed from EN1
 */
public final class en1_0
implements BP1 {
    public final Context a;

    public en1_0(Context context) {
        this.a = context = context.getApplicationContext();
    }

    public final BP1$a a(Object object, int n3, int n4, Z92 object2) {
        BP1$a bP1$a;
        object = (Uri)object;
        int n7 = -1 << -1;
        if (n3 != n7 && n4 != n7 && n3 <= (n7 = 512) && n4 <= (n3 = 384)) {
            k62 k622 = new k62(object);
            Context context = this.a;
            ContentResolver contentResolver = context.getContentResolver();
            object2 = new rn3$a(contentResolver);
            object = rn3_0.c(context, (Uri)object, (sn3)object2);
            bP1$a = new BP1$a(k622, (ei0_0)object);
        } else {
            n3 = 0;
            bP1$a = null;
        }
        return bP1$a;
    }

    public final boolean b(Object object) {
        String string2;
        boolean bl2;
        boolean bl3 = FN1.a((Uri)(object = (Uri)object));
        if (bl3 && !(bl2 = (object = object.getPathSegments()).contains(string2 = "video"))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

