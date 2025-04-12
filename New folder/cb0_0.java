/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from cB0
 */
public final class cb0_0 {
    public String a;
    public String b;
    public Long c;

    public cb0_0(String charSequence) {
        Long l2;
        long l3 = System.currentTimeMillis();
        long l4 = 1000;
        this.c = l2 = Long.valueOf(l3 / l4);
        this.b = charSequence;
        super("error_log_");
        Intrinsics.checkNotNull(l2, "null cannot be cast to non-null type kotlin.Long");
        l3 = l2;
        ((StringBuffer)charSequence).append(l3);
        ((StringBuffer)charSequence).append(".json");
        charSequence = ((StringBuffer)charSequence).toString();
        Intrinsics.checkNotNullExpressionValue(charSequence, "StringBuffer()\n         \u2026)\n            .toString()");
        this.a = charSequence;
    }

    public final String toString() {
        String string2;
        Object object;
        Object object2;
        block6: {
            object2 = new JSONObject();
            object = this.c;
            if (object == null) break block6;
            string2 = "timestamp";
            object2.put(string2, object);
        }
        object = "error_message";
        string2 = this.b;
        try {
            object2.put((String)object, (Object)string2);
        }
        catch (JSONException jSONException) {
            object2 = null;
        }
        if (object2 == null) {
            return super.toString();
        }
        object2 = object2.toString();
        Intrinsics.checkNotNullExpressionValue(object2, "params.toString()");
        return object2;
    }
}

