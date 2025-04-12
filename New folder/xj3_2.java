/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import com.ril.ajio.AJIOApplication;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from xJ3
 */
public final class xj3_2
implements mu_1 {
    public final void a(AJIOApplication aJIOApplication, ComponentName object, int n3) {
        Bundle bundle = dk0.a(n3, "app_badge_count");
        object = object.flattenToString();
        bundle.putString("app_badge_component_name", (String)object);
        aJIOApplication = aJIOApplication.getContentResolver();
        object = Uri.parse((String)"content://com.android.launcher3.cornermark.unreadbadge");
        aJIOApplication.call((Uri)object, "setAppUnreadCount", null, bundle);
    }

    public final List b() {
        ArrayList arrayList = new ArrayList(0);
        return arrayList;
    }
}

