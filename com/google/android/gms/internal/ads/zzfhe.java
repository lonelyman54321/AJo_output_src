/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzdul;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfgx;
import com.google.android.gms.internal.ads.zzfhd;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzfhe {
    public final List zza;
    public final zzfgw zzb;
    public final List zzc;
    public final zzbxu zzd;

    public zzfhe(JsonReader jsonReader, zzbxu arrayList) {
        boolean bl2;
        this.zzd = arrayList;
        Object object = zzbep.zzcd;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl3 = (Boolean)object;
        if (bl3 && arrayList != null && (arrayList = ((zzbxu)((Object)arrayList)).zzm) != null) {
            object = zzdul.zzm.zza();
            object2 = zzu.zzB();
            long l2 = object2.currentTimeMillis();
            arrayList.putLong((String)object, l2);
        }
        arrayList = Collections.emptyList();
        object = new ArrayList();
        jsonReader.beginObject();
        object2 = null;
        zzfgw zzfgw2 = null;
        while (bl2 = jsonReader.hasNext()) {
            String string2 = "responses";
            Object object3 = jsonReader.nextName();
            boolean bl4 = string2.equals(object3);
            if (bl4) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (bl2 = jsonReader.hasNext()) {
                    string2 = "ad_configs";
                    object3 = jsonReader.nextName();
                    bl4 = string2.equals(object3);
                    if (bl4) {
                        arrayList = new ArrayList<Object>();
                        jsonReader.beginArray();
                        while (bl2 = jsonReader.hasNext()) {
                            object3 = new zzfgt(jsonReader);
                            arrayList.add(object3);
                        }
                        jsonReader.endArray();
                        continue;
                    }
                    string2 = "common";
                    bl2 = ((String)object3).equals(string2);
                    if (bl2) {
                        zzfgw2 = new zzfgw(jsonReader);
                        continue;
                    }
                    jsonReader.skipValue();
                }
                jsonReader.endObject();
                jsonReader.endArray();
                continue;
            }
            string2 = "actions";
            bl2 = ((String)object3).equals(string2);
            if (!bl2) continue;
            jsonReader.beginArray();
            while (bl2 = jsonReader.hasNext()) {
                Object object4;
                boolean bl5;
                jsonReader.beginObject();
                bl2 = false;
                object3 = null;
                bl4 = false;
                string2 = null;
                while (bl5 = jsonReader.hasNext()) {
                    String string3 = "name";
                    object4 = jsonReader.nextName();
                    boolean bl6 = string3.equals(object4);
                    if (bl6) {
                        object3 = jsonReader.nextString();
                        continue;
                    }
                    string3 = "info";
                    bl5 = string3.equals(object4);
                    if (bl5) {
                        string2 = zzbw.zzi(jsonReader);
                        continue;
                    }
                    jsonReader.skipValue();
                }
                if (object3 != null) {
                    object4 = new zzfhd((String)object3, (JSONObject)string2);
                    ((ArrayList)object).add(object4);
                }
                jsonReader.endObject();
            }
            jsonReader.endArray();
        }
        this.zzc = object;
        this.zza = arrayList;
        if (zzfgw2 == null) {
            object = "{}";
            arrayList = new ArrayList<Object>((String)object);
            jsonReader = new JsonReader((Reader)((Object)arrayList));
            zzfgw2 = new zzfgw(jsonReader);
        }
        this.zzb = zzfgw2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzfhe zza(Reader reader, zzbxu zzbxu2) {
        Throwable throwable2;
        block8: {
            zzfhe zzfhe2;
            try {
                JsonReader jsonReader = new JsonReader(reader);
                zzfhe2 = new zzfhe(jsonReader, zzbxu2);
            }
            catch (Throwable throwable2) {
                break block8;
            }
            catch (AssertionError assertionError) {
            }
            catch (NumberFormatException numberFormatException) {
            }
            catch (JSONException jSONException) {
            }
            catch (IllegalStateException illegalStateException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
            IOUtils.closeQuietly(reader);
            return zzfhe2;
            {
                String string2 = "unable to parse ServerResponse";
                zzfgx zzfgx2 = new zzfgx(string2, (Throwable)((Object)zzbxu2));
                throw zzfgx2;
            }
        }
        IOUtils.closeQuietly(reader);
        throw throwable2;
    }
}

