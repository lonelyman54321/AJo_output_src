/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ril.ajio.remoteconfig.devsettings.Data;
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity;
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity$b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

public final class o40
implements Callable {
    public final /* synthetic */ ConfigEditActivity$b a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public /* synthetic */ o40(ConfigEditActivity$b configEditActivity$b, String string2) {
        this.a = configEditActivity$b;
        this.b = "";
        this.c = string2;
    }

    public final Object call() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$prefix");
        Iterator iterator = this.c;
        Intrinsics.checkNotNullParameter(iterator, "$editOnly");
        object2 = new String[]{object2, iterator};
        object = ((ConfigEditActivity$b)object).d;
        iterator = ((ConfigEditActivity)object).X;
        Intrinsics.checkNotNull(iterator);
        HashMap<String, Data> hashMap = object2[0];
        iterator = ((FirebaseRemoteConfig)((Object)iterator)).getKeysByPrefix((String)((Object)hashMap));
        Intrinsics.checkNotNullExpressionValue(iterator, "getKeysByPrefix(...)");
        int n3 = 1;
        object2 = object2[n3];
        boolean bl2 = Boolean.parseBoolean((String)object2);
        int n4 = iterator.size() * 2;
        hashMap = new HashMap<String, Data>(n4);
        iterator = iterator.iterator();
        while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            boolean bl3;
            String string2 = (String)iterator.next();
            Intrinsics.checkNotNull(string2);
            Object object3 = ((ConfigEditActivity)object).X;
            Intrinsics.checkNotNull(object3);
            object3 = ((FirebaseRemoteConfig)object3).getValue(string2);
            try {
                object3 = object3.asString();
            }
            catch (Exception exception) {
                object3 = "(empty)";
            }
            Object object4 = ((ConfigEditActivity)object).k0;
            Intrinsics.checkNotNull(object4);
            object4.getClass();
            Intrinsics.checkNotNullParameter(string2, "key");
            object4 = ((ao0_0)object4).d;
            boolean bl4 = false;
            object4 = object4.getString(string2, null);
            Data data = new Data(string2, (String)object3, (String)object4);
            if (bl2 && ((bl4 = TextUtils.isEmpty((CharSequence)object4)) || (bl3 = TextUtils.equals((CharSequence)object4, (CharSequence)object3)))) continue;
            string2 = string2.toLowerCase();
            object3 = "toLowerCase(...)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object3);
            hashMap.put(string2, data);
        }
        return hashMap;
    }
}

