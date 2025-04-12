/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.net.Uri;
import android.os.Bundle;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Rf0
 */
public class rf0_1 {
    public Uri a;

    public rf0_1(String string2, Bundle bundle) {
        String string3 = null;
        int n3 = 1;
        Object[] objectArray = "action";
        Intrinsics.checkNotNullParameter(string2, (String)objectArray);
        if (bundle == null) {
            bundle = new Bundle();
        }
        Object object = gy0_0.values();
        int n4 = ((gy0_0[])object).length;
        Object object2 = new ArrayList(n4);
        n4 = ((gy0_0[])object).length;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            String string4 = object[i3].getRawValue();
            ((ArrayList)object2).add(string4);
        }
        boolean bl2 = ((ArrayList)object2).contains(string2);
        object2 = "/dialog/";
        if (bl2) {
            objectArray = StringCompanionObject.INSTANCE;
            objectArray = FacebookSdk.a;
            objectArray = new Object[n3];
            objectArray[0] = "fb.gg";
            object = "format(format, *args)";
            string3 = xh2_0.a(objectArray, n3, "%s", (String)object);
            string2 = ((String)object2).concat(string2);
            string2 = lz3_0.b(bundle, string3, string2);
        } else {
            Intrinsics.checkNotNullParameter(string2, (String)objectArray);
            string3 = q03.a();
            StringBuilder stringBuilder = new StringBuilder();
            objectArray = FacebookSdk.e();
            stringBuilder.append((String)objectArray);
            stringBuilder.append((String)object2);
            stringBuilder.append(string2);
            string2 = stringBuilder.toString();
            string2 = lz3_0.b(bundle, string3, string2);
        }
        this.a = string2;
    }
}

