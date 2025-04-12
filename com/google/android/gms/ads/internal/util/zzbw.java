/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.JsonReader
 *  android.util.JsonToken
 *  android.util.JsonWriter
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.ads.internal.util;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbu;
import com.google.android.gms.ads.internal.util.zzbv;
import com.google.android.gms.internal.ads.zzfgy;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzbw {
    public static final zzbv zza;

    static {
        zzbu zzbu2 = new zzbu();
        zza = zzbu2;
    }

    public static Bundle zza(JSONObject jSONObject) {
        boolean bl2;
        if (jSONObject == null) {
            return null;
        }
        Iterator iterator = jSONObject.keys();
        Bundle bundle = new Bundle();
        while (bl2 = iterator.hasNext()) {
            int n3;
            String string2 = (String)iterator.next();
            Object object = jSONObject.opt(string2);
            if (object == null) continue;
            int n4 = object instanceof Boolean;
            if (n4 != 0) {
                object = (Boolean)object;
                n3 = ((Boolean)object).booleanValue();
                bundle.putBoolean(string2, n3 != 0);
                continue;
            }
            n4 = object instanceof Double;
            if (n4 != 0) {
                object = (Double)object;
                double d2 = (Double)object;
                bundle.putDouble(string2, d2);
                continue;
            }
            n4 = object instanceof Integer;
            if (n4 != 0) {
                object = (Integer)object;
                n3 = (Integer)object;
                bundle.putInt(string2, n3);
                continue;
            }
            n4 = object instanceof Long;
            if (n4 != 0) {
                object = (Long)object;
                long l2 = (Long)object;
                bundle.putLong(string2, l2);
                continue;
            }
            n4 = object instanceof String;
            if (n4 != 0) {
                object = (String)object;
                bundle.putString(string2, (String)object);
                continue;
            }
            n4 = object instanceof JSONArray;
            if (n4 != 0) {
                int n7;
                n4 = (object = (JSONArray)object).length();
                if (n4 == 0) continue;
                n4 = object.length();
                int n8 = 0;
                String string3 = null;
                int n10 = 0;
                Object object2 = null;
                Object object3 = null;
                for (n7 = 0; object2 == null && n7 < n4; ++n7) {
                    n10 = object.isNull(n7);
                    if (n10 == 0) {
                        object2 = object.opt(n7);
                        continue;
                    }
                    n10 = 0;
                    object2 = null;
                }
                if (object2 == null) {
                    string2 = String.valueOf(string2);
                    object = "Expected JSONArray with at least 1 non-null element for key:";
                    string2 = ((String)object).concat(string2);
                    zzm.zzj(string2);
                    continue;
                }
                n7 = object2 instanceof JSONObject;
                if (n7 != 0) {
                    object2 = new Bundle[n4];
                    while (n8 < n4) {
                        n7 = (int)(object.isNull(n8) ? 1 : 0);
                        if (n7 == 0) {
                            object3 = zzbw.zza(object.optJSONObject(n8));
                        } else {
                            n7 = 0;
                            object3 = null;
                        }
                        object2[n8] = object3;
                        ++n8;
                    }
                    bundle.putParcelableArray(string2, (Parcelable[])object2);
                    continue;
                }
                n7 = object2 instanceof Number;
                if (n7 != 0) {
                    n10 = object.length();
                    object2 = new double[n10];
                    while (n8 < n4) {
                        double d5 = object.optDouble(n8);
                        object2[n8] = (Bundle)d5;
                        ++n8;
                    }
                    bundle.putDoubleArray(string2, (double[])object2);
                    continue;
                }
                n7 = object2 instanceof CharSequence;
                if (n7 != 0) {
                    object2 = new String[n4];
                    while (n8 < n4) {
                        n7 = (int)(object.isNull(n8) ? 1 : 0);
                        if (n7 == 0) {
                            object3 = object.optString(n8);
                        } else {
                            n7 = 0;
                            object3 = null;
                        }
                        object2[n8] = object3;
                        ++n8;
                    }
                    bundle.putStringArray(string2, (String[])object2);
                    continue;
                }
                n7 = object2 instanceof Boolean;
                if (n7 != 0) {
                    object2 = new boolean[n4];
                    while (n8 < n4) {
                        n7 = (int)(object.optBoolean(n8) ? 1 : 0);
                        object2[n8] = (Bundle)n7;
                        ++n8;
                    }
                    bundle.putBooleanArray(string2, (boolean[])object2);
                    continue;
                }
                object = object2.getClass().getCanonicalName();
                string3 = "JSONArray with unsupported type ";
                StringBuilder stringBuilder = new StringBuilder(string3);
                stringBuilder.append((String)object);
                object = " for key:";
                stringBuilder.append((String)object);
                stringBuilder.append(string2);
                string2 = stringBuilder.toString();
                zzm.zzj(string2);
                continue;
            }
            n4 = object instanceof JSONObject;
            if (n4 != 0) {
                object = zzbw.zza((JSONObject)object);
                bundle.putBundle(string2, (Bundle)object);
                continue;
            }
            string2 = String.valueOf(string2);
            object = "Unsupported type for key:";
            string2 = ((String)object).concat(string2);
            zzm.zzj(string2);
        }
        return bundle;
    }

    public static String zzb(String string2, JSONObject object, String ... object2) {
        string2 = zzbw.zzn(object, object2);
        object = "";
        if (string2 == null) {
            return object;
        }
        object2 = object2[0];
        return string2.optString((String)object2, (String)object);
    }

    public static List zzc(JSONArray jSONArray, List arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList<String>();
        }
        if (jSONArray != null) {
            int n3;
            for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
                String string2 = jSONArray.getString(i3);
                arrayList.add(string2);
            }
        }
        return arrayList;
    }

    public static List zzd(JsonReader jsonReader) {
        boolean bl2;
        ArrayList<String> arrayList = new ArrayList<String>();
        jsonReader.beginArray();
        while (bl2 = jsonReader.hasNext()) {
            String string2 = jsonReader.nextString();
            arrayList.add(string2);
        }
        jsonReader.endArray();
        return arrayList;
    }

    public static Map zze(JsonReader jsonReader) {
        boolean bl2;
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        while (bl2 = jsonReader.hasNext()) {
            boolean bl3;
            String string2 = jsonReader.nextName();
            HashMap<String, String> hashMap2 = new HashMap<String, String>();
            jsonReader.beginObject();
            while (bl3 = jsonReader.hasNext()) {
                String string3 = jsonReader.nextName();
                String string4 = jsonReader.nextString();
                hashMap2.put(string3, string4);
            }
            jsonReader.endObject();
            hashMap.put(string2, hashMap2);
        }
        jsonReader.endObject();
        return hashMap;
    }

    public static JSONArray zzf(JsonReader object) {
        boolean bl2;
        Object object2 = new JSONArray();
        object.beginArray();
        while (bl2 = object.hasNext()) {
            JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
            Object object3 = object.peek();
            boolean bl3 = jsonToken.equals(object3);
            if (bl3) {
                object3 = zzbw.zzf(object);
                object2.put(object3);
                continue;
            }
            jsonToken = JsonToken.BEGIN_OBJECT;
            bl3 = jsonToken.equals(object3);
            if (bl3) {
                object3 = zzbw.zzi(object);
                object2.put(object3);
                continue;
            }
            jsonToken = JsonToken.BOOLEAN;
            bl3 = jsonToken.equals(object3);
            if (bl3) {
                bl2 = object.nextBoolean();
                object2.put(bl2);
                continue;
            }
            jsonToken = JsonToken.NUMBER;
            bl3 = jsonToken.equals(object3);
            if (bl3) {
                double d2 = object.nextDouble();
                object2.put(d2);
                continue;
            }
            jsonToken = JsonToken.STRING;
            bl3 = jsonToken.equals(object3);
            if (bl3) {
                object3 = object.nextString();
                object2.put(object3);
                continue;
            }
            object2 = String.valueOf(object3);
            object2 = "unexpected json token: ".concat((String)object2);
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object.endArray();
        return object2;
    }

    public static JSONObject zzg(JSONObject jSONObject, String string2) {
        try {
            jSONObject = jSONObject.getJSONObject(string2);
        }
        catch (JSONException jSONException) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject.put(string2, (Object)jSONObject2);
            jSONObject = jSONObject2;
        }
        return jSONObject;
    }

    public static JSONObject zzh(JSONObject jSONObject, String ... object) {
        if ((jSONObject = zzbw.zzn(jSONObject, object)) == null) {
            return null;
        }
        object = object[1];
        return jSONObject.optJSONObject((String)object);
    }

    public static JSONObject zzi(JsonReader object) {
        boolean bl2;
        Object object2 = new JSONObject();
        object.beginObject();
        while (bl2 = object.hasNext()) {
            String string2 = object.nextName();
            JsonToken jsonToken = JsonToken.BEGIN_ARRAY;
            Object object3 = object.peek();
            boolean bl3 = jsonToken.equals(object3);
            if (bl3) {
                object3 = zzbw.zzf(object);
                object2.put(string2, object3);
                continue;
            }
            jsonToken = JsonToken.BEGIN_OBJECT;
            bl3 = jsonToken.equals(object3);
            if (bl3) {
                object3 = zzbw.zzi(object);
                object2.put(string2, object3);
                continue;
            }
            jsonToken = JsonToken.BOOLEAN;
            bl3 = jsonToken.equals(object3);
            if (bl3) {
                boolean bl4 = object.nextBoolean();
                object2.put(string2, bl4);
                continue;
            }
            jsonToken = JsonToken.NUMBER;
            bl3 = jsonToken.equals(object3);
            if (bl3) {
                double d2 = object.nextDouble();
                object2.put(string2, d2);
                continue;
            }
            jsonToken = JsonToken.STRING;
            bl3 = jsonToken.equals(object3);
            if (bl3) {
                object3 = object.nextString();
                object2.put(string2, object3);
                continue;
            }
            object2 = String.valueOf(object3);
            object2 = "unexpected json token: ".concat((String)object2);
            object = new IllegalStateException((String)object2);
            throw object;
        }
        object.endObject();
        return object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzj(JsonWriter var0, JSONArray var1_2) {
        block9: {
            block13: {
                block12: {
                    block11: {
                        block10: {
                            block8: {
                                try {
                                    var0 /* !! */ .beginArray();
                                    var2_3 = false;
                                    var3_4 = null;
lbl6:
                                    // 2 sources

                                    while (var2_3 < (var4_5 = var1_2 /* !! */ .length())) {
                                        break block8;
                                    }
                                    ** GOTO lbl57
                                }
                                catch (JSONException var0_1) {
                                    break block9;
                                }
                            }
                            var5_6 = var1_2 /* !! */ .get((int)var2_3);
                            var6_7 = var5_6 instanceof String;
                            if (!var6_7) break block10;
                            {
                                var5_6 = (String)var5_6;
                                var0 /* !! */ .value((String)var5_6);
                                ** GOTO lbl45
                            }
                        }
                        var6_7 = var5_6 instanceof Number;
                        if (!var6_7) break block11;
                        {
                            var5_6 = (Number)var5_6;
                            var0 /* !! */ .value((Number)var5_6);
                            ** GOTO lbl45
                        }
                    }
                    var6_7 = var5_6 instanceof Boolean;
                    if (!var6_7) break block12;
                    {
                        var5_6 = (Boolean)var5_6;
                        var4_5 = var5_6.booleanValue();
                        var0 /* !! */ .value(var4_5);
                        ** GOTO lbl45
                    }
                }
                var6_7 = var5_6 instanceof JSONObject;
                if (!var6_7) break block13;
                {
                    var5_6 = (JSONObject)var5_6;
                    zzbw.zzk(var0 /* !! */ , (JSONObject)var5_6);
                    ** GOTO lbl45
                }
            }
            var6_7 = var5_6 instanceof JSONArray;
            if (!var6_7) ** GOTO lbl47
            {
                var5_6 = (JSONArray)var5_6;
                zzbw.zzj(var0 /* !! */ , (JSONArray)var5_6);
lbl45:
                // 5 sources

                var2_3 += 1;
                ** GOTO lbl6
lbl47:
                // 1 sources

                var1_2 /* !! */  = String.valueOf(var5_6);
                var3_4 = new StringBuilder();
                var5_6 = "unable to write field: ";
                var3_4.append((String)var5_6);
                var3_4.append((String)var1_2 /* !! */ );
                var1_2 /* !! */  = var3_4.toString();
                var0 /* !! */  = new JSONException((String)var1_2 /* !! */ );
                throw var0 /* !! */ ;
lbl57:
                // 1 sources

                var0 /* !! */ .endArray();
                return;
            }
        }
        var1_2 /* !! */  = new IOException(var0_1);
        throw var1_2 /* !! */ ;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzk(JsonWriter var0, JSONObject var1_2) {
        block9: {
            block13: {
                block12: {
                    block11: {
                        block10: {
                            block8: {
                                try {
                                    var0 /* !! */ .beginObject();
                                    var2_3 = var1_2 /* !! */ .keys();
lbl5:
                                    // 6 sources

                                    while (var3_4 = var2_3.hasNext()) {
                                        var4_5 /* !! */  = var2_3.next();
                                        break block8;
                                    }
                                    ** GOTO lbl61
                                }
                                catch (JSONException var0_1) {
                                    break block9;
                                }
                            }
                            var5_6 = var1_2 /* !! */ .get(var4_5 /* !! */  = (String)var4_5 /* !! */ );
                            var6_7 = var5_6 instanceof String;
                            if (!var6_7) break block10;
                            {
                                var4_5 /* !! */  = var0 /* !! */ .name(var4_5 /* !! */ );
                                var5_6 = (String)var5_6;
                                var4_5 /* !! */ .value((String)var5_6);
                                ** GOTO lbl5
                            }
                        }
                        var6_7 = var5_6 instanceof Number;
                        if (!var6_7) break block11;
                        {
                            var4_5 /* !! */  = var0 /* !! */ .name(var4_5 /* !! */ );
                            var5_6 = (Number)var5_6;
                            var4_5 /* !! */ .value((Number)var5_6);
                            ** GOTO lbl5
                        }
                    }
                    var6_7 = var5_6 instanceof Boolean;
                    if (!var6_7) break block12;
                    {
                        var4_5 /* !! */  = var0 /* !! */ .name(var4_5 /* !! */ );
                        var5_6 = (Boolean)var5_6;
                        var7_8 = var5_6.booleanValue();
                        var4_5 /* !! */ .value(var7_8);
                        ** GOTO lbl5
                    }
                }
                var6_7 = var5_6 instanceof JSONObject;
                if (!var6_7) break block13;
                {
                    var4_5 /* !! */  = var0 /* !! */ .name(var4_5 /* !! */ );
                    var5_6 = (JSONObject)var5_6;
                    zzbw.zzk(var4_5 /* !! */ , (JSONObject)var5_6);
                    ** GOTO lbl5
                }
            }
            var6_7 = var5_6 instanceof JSONArray;
            if (!var6_7) ** GOTO lbl51
            {
                var4_5 /* !! */  = var0 /* !! */ .name(var4_5 /* !! */ );
                var5_6 = (JSONArray)var5_6;
                zzbw.zzj(var4_5 /* !! */ , (JSONArray)var5_6);
                ** GOTO lbl5
lbl51:
                // 1 sources

                var1_2 /* !! */  = String.valueOf(var5_6);
                var2_3 = new StringBuilder();
                var4_5 /* !! */  = "unable to write field: ";
                var2_3.append((String)var4_5 /* !! */ );
                var2_3.append((String)var1_2 /* !! */ );
                var1_2 /* !! */  = var2_3.toString();
                var0 /* !! */  = new JSONException((String)var1_2 /* !! */ );
                throw var0 /* !! */ ;
lbl61:
                // 1 sources

                var0 /* !! */ .endObject();
                return;
            }
        }
        var1_2 /* !! */  = new IOException(var0_1);
        throw var1_2 /* !! */ ;
    }

    public static boolean zzl(boolean bl2, JSONObject jSONObject, String ... object) {
        JSONObject jSONObject2 = zzbw.zzn(jSONObject, object);
        jSONObject = null;
        if (jSONObject2 == null) {
            return false;
        }
        int n3 = ((String[])object).length + -1;
        object = object[n3];
        return jSONObject2.optBoolean((String)object, false);
    }

    public static String zzm(zzfgy zzfgy2) {
        String string2 = null;
        if (zzfgy2 != null) {
            Object object = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter((Writer)object);
            try {
                zzbw.zzo(jsonWriter, zzfgy2);
                jsonWriter.close();
                string2 = ((StringWriter)object).toString();
            }
            catch (IOException iOException) {
                object = "Error when writing JSON.";
                zzm.zzh((String)object, iOException);
            }
        }
        return string2;
    }

    private static JSONObject zzn(JSONObject jSONObject, String[] stringArray) {
        int n3;
        int n4 = 0;
        String string2 = null;
        while (n4 < (n3 = stringArray.length + -1)) {
            if (jSONObject == null) {
                return null;
            }
            string2 = stringArray[0];
            jSONObject = jSONObject.optJSONObject(string2);
            n4 = 1;
        }
        return jSONObject;
    }

    private static void zzo(JsonWriter jsonWriter, Object iterator) {
        if (iterator == null) {
            jsonWriter.nullValue();
            return;
        }
        boolean bl2 = iterator instanceof Number;
        if (bl2) {
            iterator = (Number)((Object)iterator);
            jsonWriter.value((Number)((Object)iterator));
            return;
        }
        bl2 = iterator instanceof Boolean;
        if (bl2) {
            boolean bl3 = (Boolean)((Object)iterator);
            jsonWriter.value(bl3);
            return;
        }
        bl2 = iterator instanceof String;
        if (bl2) {
            iterator = (String)((Object)iterator);
            jsonWriter.value((String)((Object)iterator));
            return;
        }
        bl2 = iterator instanceof zzfgy;
        if (bl2) {
            iterator = ((zzfgy)((Object)iterator)).zzd;
            zzbw.zzk(jsonWriter, (JSONObject)iterator);
            return;
        }
        bl2 = iterator instanceof Map;
        if (bl2) {
            jsonWriter.beginObject();
            iterator = ((Map)((Object)iterator)).entrySet().iterator();
            while (bl2 = iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                Object object = entry.getKey();
                boolean bl4 = object instanceof String;
                if (!bl4) continue;
                entry = entry.getValue();
                object = (String)object;
                object = jsonWriter.name(object);
                zzbw.zzo(object, entry);
            }
            jsonWriter.endObject();
            return;
        }
        bl2 = iterator instanceof List;
        if (bl2) {
            jsonWriter.beginArray();
            iterator = ((List)((Object)iterator)).iterator();
            while (bl2 = iterator.hasNext()) {
                Map.Entry entry = iterator.next();
                zzbw.zzo(jsonWriter, entry);
            }
            jsonWriter.endArray();
            return;
        }
        jsonWriter.nullValue();
    }
}

