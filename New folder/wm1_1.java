/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from Wm1
 */
public final class wm1_1 {
    public static ArrayList a(JSONArray jSONArray) {
        int n3;
        if (jSONArray == null) {
            return null;
        }
        int n4 = jSONArray.length();
        ArrayList<Object> arrayList = new ArrayList<Object>(n4);
        for (n4 = 0; n4 < (n3 = jSONArray.length()); ++n4) {
            Object object;
            block7: {
                block5: {
                    Object object2;
                    block8: {
                        boolean bl2;
                        block6: {
                            object = jSONArray.opt(n4);
                            if (object == null || object == (object2 = JSONObject.NULL)) break block5;
                            bl2 = object instanceof JSONObject;
                            if (!bl2) break block6;
                            object = wm1_1.c((JSONObject)object);
                            break block7;
                        }
                        bl2 = object instanceof JSONArray;
                        if (!bl2) break block8;
                        object = wm1_1.a((JSONArray)object);
                        break block7;
                    }
                    boolean bl3 = object2.equals(object);
                    if (!bl3) break block7;
                }
                n3 = 0;
                object = null;
            }
            arrayList.add(object);
        }
        return arrayList;
    }

    public static JSONArray b(Iterable object) {
        boolean bl2;
        if (object == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = object.next();
            boolean bl3 = object2 instanceof Map;
            if (bl3) {
                object2 = wm1_1.d((Map)object2);
            } else {
                bl3 = object2 instanceof Iterable;
                if (bl3) {
                    object2 = wm1_1.b((Iterable)object2);
                } else if (object2 == null) {
                    object2 = JSONObject.NULL;
                }
            }
            jSONArray.put(object2);
        }
        return jSONArray;
    }

    public static HashMap c(JSONObject jSONObject) {
        boolean bl2;
        if (jSONObject == null) {
            return null;
        }
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Iterator iterator = jSONObject.keys();
        while (bl2 = iterator.hasNext()) {
            Object object;
            String string2;
            block7: {
                block5: {
                    Object object2;
                    block8: {
                        boolean bl3;
                        block6: {
                            string2 = (String)iterator.next();
                            object = jSONObject.opt(string2);
                            if (object == null || object == (object2 = JSONObject.NULL)) break block5;
                            bl3 = object instanceof JSONObject;
                            if (!bl3) break block6;
                            object = wm1_1.c((JSONObject)object);
                            break block7;
                        }
                        bl3 = object instanceof JSONArray;
                        if (!bl3) break block8;
                        object = wm1_1.a((JSONArray)object);
                        break block7;
                    }
                    boolean bl4 = object2.equals(object);
                    if (!bl4) break block7;
                }
                object = null;
            }
            hashMap.put(string2, object);
        }
        return hashMap;
    }

    public static JSONObject d(Map object) {
        boolean bl2;
        if (object == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            boolean bl3 = (object2 = object2.getValue()) instanceof Map;
            if (bl3) {
                object2 = wm1_1.d((Map)object2);
            } else {
                bl3 = object2 instanceof Iterable;
                if (bl3) {
                    object2 = wm1_1.b((Iterable)object2);
                } else {
                    bl3 = object2 instanceof Editable;
                    if (bl3) {
                        object2 = object2.toString();
                    } else if (object2 == null) {
                        object2 = JSONObject.NULL;
                    }
                }
            }
            jSONObject.put(string2, object2);
        }
        return jSONObject;
    }
}

