/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class HP1$b$a {
    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static HP1$b a(JSONObject object) {
        HP1$b hP1$b;
        float[] fArray;
        Object object2;
        int n3;
        String string2;
        String string3;
        String string4;
        Object object3;
        void var1_9;
        block13: {
            int n4;
            JSONArray jSONArray;
            block12: {
                int n7;
                block14: {
                    Object var1_7 = null;
                    if (object == null) {
                        return var1_9;
                    }
                    object3 = "use_case";
                    string4 = object.getString((String)object3);
                    object3 = "asset_uri";
                    string3 = object.getString((String)object3);
                    object3 = "rules_uri";
                    string2 = object.optString((String)object3, null);
                    object3 = "version_id";
                    n3 = object.getInt((String)object3);
                    object3 = hp1_1.a;
                    object2 = "thresholds";
                    jSONArray = object.getJSONArray((String)object2);
                    object2 = hp1_1.class;
                    n7 = td0.b(object2);
                    if (n7 != 0) break block14;
                    {
                        catch (Exception exception) {
                            return var1_9;
                        }
                    }
                    object3.getClass();
                    n7 = td0.b(object3);
                    if (n7 != 0 || jSONArray == null) break block14;
                    try {
                        n7 = jSONArray.length();
                        fArray = new float[n7];
                        n4 = jSONArray.length();
                        break block12;
                    }
                    catch (Throwable throwable) {}
                    try {
                        td0.a(object3, throwable);
                    }
                    catch (Throwable throwable) {
                        td0.a(object2, throwable);
                    }
                }
                n7 = 0;
                fArray = null;
                break block13;
            }
            for (int i3 = 0; i3 < n4; ++i3) {
                try {
                    float f5;
                    String string5 = jSONArray.getString(i3);
                    String string6 = "jsonArray.getString(i)";
                    Intrinsics.checkNotNullExpressionValue(string5, string6);
                    fArray[i3] = f5 = Float.parseFloat(string5);
                    continue;
                }
                catch (JSONException jSONException) {}
            }
        }
        object3 = "useCase";
        Intrinsics.checkNotNullExpressionValue(string4, (String)object3);
        object3 = "assetUri";
        Intrinsics.checkNotNullExpressionValue(string3, (String)object3);
        object2 = hP1$b;
        HP1$b hP1$b2 = hP1$b = new HP1$b(string4, string3, string2, n3, fArray);
        return var1_9;
    }

    public static void b(HP1$b objectArray, ArrayList serializable) {
        boolean bl2;
        int n3;
        Intrinsics.checkNotNullParameter(objectArray, "master");
        Intrinsics.checkNotNullParameter(serializable, "slaves");
        Object object = objectArray.a;
        Object object2 = zz3_0.a();
        int n4 = objectArray.d;
        char c2 = '_';
        if (object2 != null && (object2 = ((File)object2).listFiles()) != null && (n3 = ((File[])object2).length) != 0) {
            CharSequence charSequence = new StringBuilder();
            charSequence.append((String)object);
            charSequence.append(c2);
            charSequence.append(n4);
            charSequence = charSequence.toString();
            for (File file : object2) {
                boolean bl3;
                String string2 = file.getName();
                String string3 = "name";
                Intrinsics.checkNotNullExpressionValue(string2, string3);
                boolean bl4 = b.s(string2, object, false);
                if (!bl4 || (bl3 = b.s(string2, (String)charSequence, false))) continue;
                file.delete();
            }
        }
        object = new StringBuilder();
        object2 = objectArray.a;
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(c2);
        ((StringBuilder)object).append(n4);
        object = ((StringBuilder)object).toString();
        object2 = new W9(serializable);
        objectArray = objectArray.b;
        File file = zz3_0.a();
        serializable = new File(file, (String)object);
        if (objectArray != null && !(bl2 = ((File)serializable).exists())) {
            object = new ol0_2((String)objectArray, (File)serializable, (ol0$a_0)object2);
            objectArray = new String[]{};
            object.execute(objectArray);
        } else {
            ((W9)object2).a((File)serializable);
        }
    }
}

