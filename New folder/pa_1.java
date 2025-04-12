/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
import org.json.JSONObject;

/*
 * Renamed from Pa
 */
public final class pa_1 {
    public static boolean a;

    public static final boolean a() {
        cp_1.Companion.getClass();
        JSONObject jSONObject = cp$a.q();
        String string2 = "master_flag";
        boolean bl2 = jSONObject.has(string2);
        if (bl2 && (bl2 = (jSONObject = cp$a.q()).getBoolean(string2))) {
            bl2 = true;
        } else {
            bl2 = false;
            jSONObject = null;
        }
        return bl2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b() {
        boolean bl2 = og1_1.b();
        if (bl2) return false;
        bl2 = pa_1.a();
        if (!bl2) return false;
        cp_1.Companion.getClass();
        JSONObject jSONObject = cp$a.q();
        String string2 = "spc_order_flag";
        bl2 = jSONObject.has(string2);
        if (!bl2) return false;
        jSONObject = cp$a.q();
        bl2 = jSONObject.getBoolean(string2);
        if (!bl2) return false;
        bl2 = a;
        if (!bl2) return false;
        return true;
    }
}

