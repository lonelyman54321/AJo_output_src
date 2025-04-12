/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/*
 * Renamed from r30
 */
public final class r30_0
implements qx_1 {
    public final ArrayList a;

    public r30_0() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    public final void a(JSONArray jSONArray, boolean bl2) {
        boolean bl3;
        Intrinsics.checkNotNullParameter(jSONArray, "batch");
        Iterator iterator = this.a.iterator();
        while (bl3 = iterator.hasNext()) {
            qx_1 qx_12 = (qx_1)iterator.next();
            qx_12.a(jSONArray, bl2);
        }
    }
}

