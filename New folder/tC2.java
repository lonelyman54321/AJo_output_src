/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 */
import org.json.JSONArray;

public final class tC2 {
    public ci3_1 a;
    public JSONArray b;
    public String c;

    public final boolean a() {
        int n3;
        JSONArray jSONArray = this.b;
        String string2 = this.c;
        if (string2 != null && jSONArray != null && (n3 = jSONArray.length()) > 0) {
            n3 = 0;
            jSONArray = null;
        } else {
            n3 = 1;
        }
        return n3 != 0;
    }

    public final String toString() {
        int n3;
        Object object = this.b;
        if (object != null) {
            n3 = object.length();
        } else {
            n3 = 0;
            object = null;
        }
        boolean bl2 = this.a();
        String string2 = " | numItems: ";
        Object object2 = this.a;
        String string3 = "table: ";
        if (bl2) {
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(object2);
            stringBuilder.append(string2);
            stringBuilder.append(n3);
            object = stringBuilder.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder(string3);
            stringBuilder.append(object2);
            stringBuilder.append(" | lastId: ");
            object2 = this.c;
            stringBuilder.append((String)object2);
            stringBuilder.append(string2);
            stringBuilder.append(n3);
            stringBuilder.append(" | items: ");
            object = this.b;
            stringBuilder.append(object);
            object = stringBuilder.toString();
        }
        return object;
    }
}

