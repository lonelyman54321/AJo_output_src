/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class Ir0
implements xS2$b {
    public final /* synthetic */ iS2 a;

    public /* synthetic */ Ir0(jS2 jS22) {
        this.a = jS22;
    }

    public final Bundle a() {
        boolean bl2;
        Object object = this.a.e();
        Bundle bundle = new Bundle();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            ArrayList arrayList = (Map.Entry)object.next();
            String string2 = (String)arrayList.getKey();
            boolean bl3 = (arrayList = (List)arrayList.getValue()) instanceof ArrayList;
            if (bl3) {
                arrayList = arrayList;
            } else {
                ArrayList arrayList2;
                arrayList = arrayList;
                arrayList = arrayList2 = new ArrayList(arrayList);
            }
            bundle.putParcelableArrayList(string2, arrayList);
        }
        return bundle;
    }
}

