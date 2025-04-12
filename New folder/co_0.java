/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/*
 * Renamed from Co
 */
public final class co_0
implements qx_1 {
    public final ArrayList a;

    public co_0() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final void a(JSONArray object, boolean bl2) {
        String string2 = "batch";
        Intrinsics.checkNotNullParameter(object, string2);
        int n3 = object.length();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string3;
            String string4 = object.getJSONObject(i3).optString("evtName");
            boolean bl3 = Intrinsics.areEqual(string4, string3 = "App Launched");
            if (!bl3 || !bl2) continue;
            object = this.a.iterator();
            while (bl2 = object.hasNext()) {
                Function0 function0 = (Function0)object.next();
                function0.invoke();
            }
            return;
        }
    }
}

