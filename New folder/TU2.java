/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;

public final class TU2 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(HashMap hashMap) {
        int n3;
        Object object;
        Object object2;
        Object object3 = ",";
        Intrinsics.checkNotNullParameter(hashMap, "map");
        Object object4 = "";
        try {
            object2 = h40_0.a;
            object2 = z40_0.Companion;
            object = AJIOApplication.Companion;
            object.getClass();
            object = AJIOApplication$a.a();
            object2.getClass();
            object2 = z40$a.a((Context)object);
            object2 = ((z40_0)object2).a;
            object = "search_experiment_flags";
            object2 = ((ao0_0)object2).b((String)object);
            object = new JSONArray((String)object2);
            n3 = object.length();
            if (n3 > 0) {
                object4 = object.join((String)object3);
            }
        }
        catch (Exception exception) {}
        object3 = new String[]{object3};
        object = null;
        object3 = StringsKt.a0((CharSequence)object4, (String[])object3, false, 0, 6);
        n3 = yx_2.o((Iterable)object3, 10);
        object4 = new ArrayList(n3);
        object3 = object3.iterator();
        while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            Object object5;
            Object object6;
            int n4;
            object2 = (String)object3.next();
            int n7 = ((String)object2).length();
            if (n7 >= (n4 = 2) && (n7 = (int)(Intrinsics.areEqual(object6 = String.valueOf(((String)object2).charAt(0)), object5 = "\"") ? 1 : 0)) != 0) {
                n7 = ((String)object2).length();
                int n8 = 1;
                n7 -= n8;
                object6 = String.valueOf(((String)object2).charAt(n7));
                if ((n7 = (int)(Intrinsics.areEqual(object6, object5) ? 1 : 0)) != 0) {
                    n7 = ((String)object2).length() - n8;
                    object2 = ((String)object2).substring(n8, n7);
                    object6 = "substring(...)";
                    Intrinsics.checkNotNullExpressionValue(object2, (String)object6);
                }
            }
            object6 = z40_0.Companion;
            object5 = AJIOApplication.Companion;
            object6 = Q.a((AJIOApplication$a)object5, (z40$a)object6).a.b((String)object2);
            n4 = ((String)object6).length();
            if (n4 != 0) {
                hashMap.put(object2, object6);
            }
            object2 = Unit.a;
            ((ArrayList)object4).add(object2);
        }
        return;
    }
}

