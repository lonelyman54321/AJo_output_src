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
import java.util.Arrays;
import java.util.List;

/*
 * Renamed from Tb1
 */
public final class tb1_2
implements mu_1 {
    public final void a(AJIOApplication aJIOApplication, ComponentName object, int n3) {
        Bundle bundle = new Bundle();
        String string2 = aJIOApplication.getPackageName();
        bundle.putString("package", string2);
        object = object.getClassName();
        bundle.putString("class", (String)object);
        bundle.putInt("badgenumber", n3);
        aJIOApplication = aJIOApplication.getContentResolver();
        object = Uri.parse((String)"content://com.huawei.android.launcher.settings/badge/");
        aJIOApplication.call((Uri)object, "change_badge", null, bundle);
    }

    public final List b() {
        return Arrays.asList("com.huawei.android.launcher");
    }
}

