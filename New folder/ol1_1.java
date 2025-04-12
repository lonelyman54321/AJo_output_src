/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/*
 * Renamed from Ol1
 */
public final class ol1_1
extends d63_0 {
    public final JSONArray b;

    public ol1_1(JSONArray jSONArray) {
        String string2 = "Feedback Text or Actions is missing or empty";
        Intrinsics.checkNotNullParameter(string2, "errorMsg");
        super(jSONArray, string2);
        this.b = jSONArray;
    }

    public final boolean a() {
        boolean bl2;
        JSONArray jSONArray = this.b;
        boolean bl3 = true;
        if (jSONArray == null) {
            bl2 = true;
        } else {
            bl2 = false;
            jSONArray = null;
        }
        if (bl2) {
            ak2_1.b();
        }
        return bl2 ^ bl3;
    }
}

