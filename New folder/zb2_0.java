/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.ArrayList;

/*
 * Renamed from ZB2
 */
public final class zb2_0 {
    public static String a(Bundle bundle) {
        return bundle.getString("wzrk_acct_id", "");
    }

    public static ArrayList b() {
        ArrayList<String> arrayList = new ArrayList<String>();
        XB2$a[] xB2$aArray = XB2$a.values();
        int n3 = xB2$aArray.length;
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = xB2$aArray[i3].name();
            arrayList.add(string2);
        }
        return arrayList;
    }
}

