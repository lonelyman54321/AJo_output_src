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
 * Renamed from GN1
 */
public final class gn1_0
implements BP1 {
    public final Context a;

    public gn1_0(Context context) {
        this.a = context = context.getApplicationContext();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final BP1$a a(Object object, int n3, int n4, Z92 object2) {
        long l2;
        object = (Uri)object;
        int n7 = -1 << -1;
        if (n3 == n7) return null;
        if (n4 == n7) return null;
        n7 = 512;
        if (n3 > n7) return null;
        n3 = 384;
        if (n4 > n3) return null;
        Object object3 = fb3_0.d;
        if ((object3 = (Long)((Z92)object2).c((U92)object3)) == null) return null;
        long l3 = (Long)object3;
        long l4 = l3 - (l2 = (long)-1);
        Object object4 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object4 != false) return null;
        k62 k622 = new k62(object);
        Context context = this.a;
        ContentResolver contentResolver = context.getContentResolver();
        object2 = new rn3$b(contentResolver);
        object = rn3_0.c(context, (Uri)object, (sn3)object2);
        return new BP1$a(k622, (ei0_0)object);
    }

    public final boolean b(Object object) {
        String string2;
        boolean bl2;
        boolean bl3 = FN1.a((Uri)(object = (Uri)object));
        if (bl3 && (bl2 = (object = object.getPathSegments()).contains(string2 = "video"))) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

