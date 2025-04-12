/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import com.clevertap.android.sdk.inapp.InAppController;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

public final class Af1
implements Function2 {
    public final /* synthetic */ InAppController a;

    public /* synthetic */ Af1(InAppController inAppController) {
        this.a = inAppController;
    }

    public final Object invoke(Object arrayList, Object object) {
        arrayList = (JSONObject)arrayList;
        object = (String)object;
        Object object2 = this.a;
        object2.getClass();
        Intrinsics.checkNotNullParameter(arrayList, "limitJSON");
        Object object3 = "frequencyLimits";
        arrayList = arrayList.optJSONArray((String)object3);
        if (arrayList == null) {
            arrayList = new JSONArray();
        }
        object3 = new ArrayList();
        int n3 = arrayList.length();
        ru1_2 ru1_22 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object4 = arrayList.get(i3);
            boolean bl2 = object4 instanceof JSONObject;
            if (!bl2) continue;
            ((ArrayList)object3).add(object4);
        }
        n3 = yx_2.o(object3, 10);
        arrayList = new ArrayList(n3);
        object3 = ((ArrayList)object3).iterator();
        while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            JSONObject jSONObject = (JSONObject)object3.next();
            ru1_22 = new ru1_2(jSONObject);
            arrayList.add(ru1_22);
        }
        arrayList = CollectionsKt.m0(arrayList);
        object2 = ((InAppController)object2).g;
        object2.getClass();
        Intrinsics.checkNotNullParameter(arrayList, "listOfLimitAdapter");
        Intrinsics.checkNotNullParameter(object, "campaignId");
        return ((yB0)object2).c.b((String)object, arrayList) ^ true;
    }
}

