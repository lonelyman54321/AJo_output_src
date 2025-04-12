/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/*
 * Renamed from KO1$a
 */
public final class ko1$a_0 {
    public static void a(JSONObject jSONObject) {
        boolean bl2;
        Iterator iterator = jSONObject.keys();
        while (bl2 = iterator.hasNext()) {
            String string2 = (String)iterator.next();
            Object object = jSONObject.optJSONObject(string2);
            if (object == null) continue;
            Object object2 = "k";
            Object object3 = object.optString((String)object2);
            String string3 = "v";
            object = object.optString(string3);
            Intrinsics.checkNotNullExpressionValue(object3, (String)object2);
            int n3 = ((String)object3).length();
            if (n3 == 0) continue;
            object2 = ko1_1.a();
            Intrinsics.checkNotNullExpressionValue(string2, "key");
            String[] stringArray = new String[]{","};
            int n4 = 6;
            object3 = StringsKt.a0((CharSequence)object3, stringArray, false, 0, n4);
            Intrinsics.checkNotNullExpressionValue(object, string3);
            ko1_1 ko1_12 = new ko1_1(string2, (String)object, (List)object3);
            ((CopyOnWriteArraySet)object2).add(ko1_12);
        }
    }
}

