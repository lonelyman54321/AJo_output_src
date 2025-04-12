/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Date;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from hA3
 */
public final class ha3_1 {
    public static final String[] b = new String[]{".", ":", "$", "'", "\"", "\\"};
    public static final String[] c = new String[]{".", ":", "$", "'", "\"", "\\"};
    public static final String[] d = new String[]{"'", "\"", "\\"};
    public static final String[] e = new String[]{"Stayed", "Notification Clicked", "Notification Viewed", "UTM Visited", "Notification Sent", "App Launched", "wzrk_d", "App Uninstalled", "Notification Bounced", "Geocluster Entered", "Geocluster Exited", "SCOutgoing", "SCIncoming", "SCEnd", "SCCampaignOptOut"};
    public ArrayList a;

    public static da3_1 a(String string2) {
        int n3;
        int n4;
        da3_1 da3_12 = new da3_1();
        string2 = string2.trim();
        Object object = b;
        int n7 = 0;
        String string3 = null;
        for (n4 = 0; n4 < (n3 = 6); ++n4) {
            String string4 = object[n4];
            String string5 = "";
            string2 = string2.replace(string4, string5);
        }
        int n8 = string2.length();
        if (n8 > (n4 = 512)) {
            string2 = string2.substring(0, 511);
            object = string2.trim();
            object = new String[]{object, "512"};
            n7 = 510;
            n4 = 11;
            object = zB1.a(object, n7, n4);
            da3_12.b = string3 = object.b;
            da3_12.a = n8 = object.a;
        }
        string2 = string2.trim();
        da3_12.c = string2;
        return da3_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static da3_1 b(String string2) {
        int n3;
        int n4;
        String string3;
        String string4;
        da3_1 da3_12 = new da3_1();
        string2 = string2.trim().toLowerCase();
        String[] stringArray = d;
        int n7 = 0;
        String string5 = null;
        for (n4 = 0; n4 < (n3 = 3); string2 = string2.replace(string4, string3), ++n4) {
            string4 = stringArray[n4];
            string3 = "";
        }
        try {
            int n8 = string2.length();
            n4 = 512;
            if (n8 > n4) {
                n8 = 511;
                string2 = string2.substring(0, n8);
                String string6 = "512";
                String[] stringArray2 = new String[]{string2, string6};
                n7 = 521;
                n4 = 11;
                da3_1 da3_13 = zB1.a(stringArray2, n7, n4);
                da3_12.b = string5 = da3_13.b;
                da3_12.a = n8 = da3_13.a;
            }
        }
        catch (Exception exception) {}
        da3_12.c = string2;
        return da3_12;
    }

    public static da3_1 c(String string2) {
        int n3;
        int n4;
        da3_1 da3_12 = new da3_1();
        string2 = string2.trim();
        Object object = c;
        int n7 = 0;
        String string3 = null;
        for (n4 = 0; n4 < (n3 = 6); ++n4) {
            String string4 = object[n4];
            String string5 = "";
            string2 = string2.replace(string4, string5);
        }
        int n8 = string2.length();
        if (n8 > (n4 = 120)) {
            string2 = string2.substring(0, 119);
            object = string2.trim();
            object = new String[]{object, "120"};
            n7 = 520;
            n4 = 11;
            object = zB1.a(object, n7, n4);
            da3_12.b = string3 = object.b;
            da3_12.a = n8 = object.a;
        }
        string2 = string2.trim();
        da3_12.c = string2;
        return da3_12;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static da3_1 d(Object object, ha3$b_0 object2) {
        String[] stringArray;
        String string2;
        ArrayList<String> arrayList;
        int n3;
        Object object3;
        int n4;
        int n7;
        String string3;
        int n8;
        da3_1 da3_12;
        block28: {
            block27: {
                Object object4;
                block26: {
                    void var0_16;
                    block21: {
                        block22: {
                            void var0_13;
                            int n10;
                            void var0_11;
                            block23: {
                                block24: {
                                    block25: {
                                        boolean bl2;
                                        da3_12 = new da3_1();
                                        n8 = object instanceof Integer;
                                        if (n8 != 0 || (n8 = object instanceof Float) != 0 || (n8 = object instanceof Boolean) != 0 || (n8 = object instanceof Double) != 0 || (n8 = object instanceof Long) != 0) break block22;
                                        n8 = object instanceof String;
                                        string3 = "";
                                        n7 = 521;
                                        n4 = 0;
                                        if (n8 != 0 || (n8 = object instanceof Character) != 0) break block23;
                                        n8 = object instanceof Date;
                                        if (n8 != 0) {
                                            object3 = new StringBuilder("$D_");
                                            long l2 = ((Date)object).getTime() / 1000L;
                                            ((StringBuilder)object3).append(l2);
                                            String string4 = ((StringBuilder)object3).toString();
                                            da3_12.c = string4;
                                            return da3_12;
                                        }
                                        n8 = object instanceof String[];
                                        if (n8 == 0 && !(bl2 = object instanceof ArrayList) || (n3 = object3.equals(object4 = ha3$b_0.Profile)) == 0) break block24;
                                        n3 = object instanceof ArrayList;
                                        bl2 = false;
                                        object4 = null;
                                        if (n3 != 0) {
                                            object3 = object;
                                            object3 = (ArrayList)object;
                                        } else {
                                            n3 = 0;
                                            object3 = null;
                                        }
                                        if (n8 != 0) {
                                            object4 = object;
                                            object4 = object;
                                        }
                                        arrayList = new ArrayList<String>();
                                        if (object4 == null) break block25;
                                        n3 = ((String[])object4).length;
                                        string2 = null;
                                        break block26;
                                    }
                                    object3 = ((ArrayList)object3).iterator();
                                    break block27;
                                }
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Not a String, Boolean, Long, Integer, Float, Double, or Date");
                                throw illegalArgumentException;
                            }
                            int n14 = object instanceof Character;
                            if (n14 != 0) {
                                String string5 = String.valueOf(object);
                            } else {
                                String string6 = (String)object;
                            }
                            String string7 = var0_11.trim();
                            object3 = d;
                            String string8 = null;
                            for (n8 = 0; n8 < (n10 = 3); ++n8) {
                                String string9 = object3[n8];
                                String string10 = var0_13.replace(string9, string3);
                            }
                            try {
                                n14 = var0_13.length();
                                n8 = 512;
                                if (n14 > n8) {
                                    n14 = 511;
                                    String string11 = var0_13.substring(0, n14);
                                    object3 = string11.trim();
                                    string8 = "512";
                                    object3 = new String[]{object3, string8};
                                    n8 = 11;
                                    object3 = zB1.a((String[])object3, n7, n8);
                                    da3_12.b = string8 = ((da3_1)object3).b;
                                    da3_12.a = n14 = ((da3_1)object3).a;
                                }
                                break block21;
                            }
                            catch (Exception exception) {}
                        }
                        da3_12.c = object;
                        return da3_12;
                    }
                    String string12 = var0_16.trim();
                    da3_12.c = string12;
                    return da3_12;
                }
                for (n8 = 0; n8 < n3; ++n8) {
                    String string13 = object4[n8];
                    try {
                        arrayList.add(string13);
                        continue;
                    }
                    catch (Exception exception) {}
                }
                break block28;
            }
            while ((n8 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                string2 = (String)object3.next();
                try {
                    arrayList.add(string2);
                }
                catch (Exception exception) {}
            }
        }
        if ((n3 = (stringArray = (String[])arrayList.toArray((T[])(object3 = new String[0]))).length) > 0 && (n3 = stringArray.length) <= (n8 = 100)) {
            object3 = new JSONArray();
            string2 = new JSONObject();
            int n15 = stringArray.length;
            while (n4 < n15) {
                String string14 = stringArray[n4];
                object3.put((Object)string14);
                ++n4;
            }
            String string15 = "$set";
            string2.put(string15, object3);
        } else {
            int n16;
            object3 = new StringBuilder();
            String string16 = g30.a(stringArray.length, string3, (StringBuilder)object3);
            String[] stringArray2 = new String[]{string16, "100"};
            n3 = 13;
            da3_1 da3_13 = zB1.a(stringArray2, n7, n3);
            da3_12.b = object3 = da3_13.b;
            da3_12.a = n16 = da3_13.a;
            return da3_12;
            catch (JSONException jSONException) {}
        }
        da3_12.c = string2;
        return da3_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int e(JSONArray jSONArray, HashSet hashSet, BitSet bitSet, int n3) {
        int n4 = jSONArray.length();
        int n7 = 1;
        n4 -= n7;
        while (true) {
            block11: {
                if (n4 < 0) {
                    return 0;
                }
                try {
                    int n8;
                    int n10;
                    Object object = jSONArray.get(n4);
                    if (object != null) {
                        object = object.toString();
                    } else {
                        n10 = 0;
                        object = null;
                    }
                    if (bitSet == null) {
                        if (object != null) {
                            hashSet.add(object);
                        }
                        break block11;
                    }
                    if (object != null && (n8 = hashSet.contains(object)) == 0) {
                        hashSet.add(object);
                        n10 = hashSet.size();
                        n8 = 100;
                        if (n10 == n8) {
                            return n4;
                        }
                    } else {
                        n10 = n4 + n3;
                        bitSet.set(n10, n7 != 0);
                    }
                }
                catch (Throwable throwable) {}
            }
            n4 += -1;
        }
    }
}

