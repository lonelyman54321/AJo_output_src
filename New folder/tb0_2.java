/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.ContentValues
 *  android.net.Uri
 */
import android.content.ComponentName;
import android.content.ContentValues;
import android.net.Uri;
import com.ril.ajio.AJIOApplication;
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from TB0
 */
public final class tb0_2
implements mu_1 {
    public final void a(AJIOApplication aJIOApplication, ComponentName object, int n3) {
        ContentValues contentValues = new ContentValues();
        String string2 = object.getPackageName();
        contentValues.put("package_name", string2);
        object = object.getClassName();
        contentValues.put("activity_name", (String)object);
        object = n3;
        contentValues.put("count", (Integer)object);
        aJIOApplication = aJIOApplication.getContentResolver();
        object = Uri.parse((String)"content://me.everything.badger/apps");
        aJIOApplication.insert((Uri)object, contentValues);
    }

    public final List b() {
        return Arrays.asList("me.everything.launcher");
    }
}

