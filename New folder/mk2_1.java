/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources$NotFoundException
 *  android.net.Uri
 */
import android.content.res.Resources;
import android.net.Uri;

/*
 * Renamed from MK2
 */
public final class mk2_1
implements bH1 {
    public final Object a(Object object, ba2 object2) {
        block4: {
            int n3;
            block3: {
                Object object3;
                object2 = ((ba2)object2).a;
                object = (Number)object;
                n3 = ((Number)object).intValue();
                try {
                    object3 = object2.getResources();
                }
                catch (Resources.NotFoundException notFoundException) {}
                object3 = object3.getResourceEntryName(n3);
                if (object3 == null) break block3;
                String string2 = "android.resource://";
                object3 = new StringBuilder(string2);
                object2 = object2.getPackageName();
                ((StringBuilder)object3).append((String)object2);
                char c2 = '/';
                ((StringBuilder)object3).append(c2);
                ((StringBuilder)object3).append(n3);
                object = Uri.parse((String)((StringBuilder)object3).toString());
                break block4;
            }
            n3 = 0;
            object = null;
        }
        return object;
    }
}

