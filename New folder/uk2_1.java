/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from UK2
 */
public final class uk2_1
implements bH1 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object a(Object object, ba2 object2) {
        int n3;
        Object object3;
        Object object4 = (object = (Uri)object).getScheme();
        int n4 = Intrinsics.areEqual(object4, object3 = "android.resource");
        if (n4 == 0) return null;
        object4 = object.getAuthority();
        if (object4 == null) return null;
        n4 = b.k((CharSequence)object4);
        if (n4 != 0) return null;
        object4 = object.getPathSegments();
        n4 = object4.size();
        if (n4 != (n3 = 2)) return null;
        object4 = object.getAuthority();
        if (object4 == null) {
            object4 = "";
        }
        object2 = ((ba2)object2).a.getPackageManager().getResourcesForApplication((String)object4);
        object3 = object.getPathSegments();
        String string2 = (String)object3.get(0);
        int n7 = 1;
        int n8 = object2.getIdentifier((String)(object3 = (String)object3.get(n7)), string2, (String)object4);
        if (n8 != 0) {
            object3 = "android.resource://";
            object = new StringBuilder((String)object3);
            ((StringBuilder)object).append((String)object4);
            n4 = 47;
            ((StringBuilder)object).append((char)n4);
            ((StringBuilder)object).append(n8);
            return Uri.parse((String)((StringBuilder)object).toString());
        }
        object = og3_1.a((Uri)object, "Invalid android.resource URI: ");
        object = object.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

