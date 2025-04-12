/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonWriter
 */
package com.google.android.gms.ads.internal.util.client;

import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.client.zzg;
import com.google.android.gms.ads.internal.util.client.zzh;
import com.google.android.gms.ads.internal.util.client.zzi;
import com.google.android.gms.ads.internal.util.client.zzj;
import com.google.android.gms.ads.internal.util.client.zzk;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class zzl {
    public static final /* synthetic */ int zza = 0;
    private static final Object zzb;
    private static boolean zzc = false;
    private static boolean zzd = false;
    private static final Clock zze;
    private static final Set zzf;
    private final List zzg;

    static {
        HashSet<String> hashSet = new HashSet<String>();
        zzb = hashSet;
        zze = DefaultClock.getInstance();
        List<String> list = Arrays.asList(new String[0]);
        zzf = hashSet = new HashSet<String>(list);
    }

    public zzl() {
        throw null;
    }

    public zzl(String list) {
        boolean bl2 = zzl.zzk();
        if (!bl2) {
            list = new List<String>();
        } else {
            list = String.valueOf(UUID.randomUUID().toString());
            String string2 = "network_request_";
            list = string2.concat((String)((Object)list));
            list = Arrays.asList(list);
        }
        this.zzg = list;
    }

    public static /* synthetic */ void zza(String string2, String string3, Map map2, byte[] byArray, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        JsonWriter jsonWriter2 = jsonWriter.name("uri");
        jsonWriter2.value(string2);
        string2 = jsonWriter.name("verb");
        string2.value(string3);
        jsonWriter.endObject();
        zzl.zzr(jsonWriter, map2);
        if (byArray != null) {
            string2 = jsonWriter.name("body");
            string3 = Base64Utils.encode(byArray);
            string2.value(string3);
        }
        jsonWriter.endObject();
    }

    public static /* synthetic */ void zzb(int n3, Map map2, JsonWriter jsonWriter) {
        jsonWriter.name("params").beginObject();
        jsonWriter.name("firstline").beginObject();
        JsonWriter jsonWriter2 = jsonWriter.name("code");
        long l2 = n3;
        jsonWriter2.value(l2);
        jsonWriter.endObject();
        zzl.zzr(jsonWriter, map2);
        jsonWriter.endObject();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzi() {
        Object object = zzb;
        synchronized (object) {
            String string2 = null;
            zzc = false;
            zzd = false;
            string2 = "Ad debug logging enablement is out of date.";
            zzm.zzj(string2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzj(boolean bl2) {
        Object object = zzb;
        synchronized (object) {
            boolean bl3;
            zzc = bl3 = true;
            zzd = bl2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zzk() {
        Object object = zzb;
        synchronized (object) {
            try {
                boolean bl2 = zzc;
                boolean bl3 = false;
                if (!bl2) return bl3;
                bl2 = zzd;
                if (!bl2) return bl3;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static boolean zzl() {
        Object object = zzb;
        synchronized (object) {
            return zzc;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zzm(String string2) {
        Class<zzl> clazz = zzl.class;
        synchronized (clazz) {
            String string3 = "GMA Debug BEGIN";
            try {
                zzm.zzi(string3);
                int n3 = 0;
                string3 = null;
                while (true) {
                    int n4;
                    if (n3 >= (n4 = string2.length())) {
                        string2 = "GMA Debug FINISH";
                        zzm.zzi(string2);
                        return;
                    }
                    n4 = n3 + 4000;
                    int n7 = string2.length();
                    n7 = Math.min(n4, n7);
                    string3 = string2.substring(n3, n7);
                    string3 = String.valueOf(string3);
                    String string4 = "GMA Debug CONTENT ";
                    string3 = string4.concat(string3);
                    zzm.zzi(string3);
                    n3 = n4;
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzn(String iterator, zzk object) {
        StringWriter stringWriter;
        block4: {
            IOException iOException2;
            block3: {
                stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter((Writer)stringWriter);
                try {
                    boolean bl2;
                    jsonWriter.beginObject();
                    String string2 = "timestamp";
                    string2 = jsonWriter.name(string2);
                    Clock clock = zze;
                    long l2 = clock.currentTimeMillis();
                    string2.value(l2);
                    string2 = "event";
                    string2 = jsonWriter.name(string2);
                    string2.value((String)((Object)iterator));
                    iterator = "components";
                    iterator = jsonWriter.name((String)((Object)iterator));
                    iterator.beginArray();
                    iterator = this.zzg;
                    iterator = iterator.iterator();
                    while (bl2 = iterator.hasNext()) {
                        string2 = iterator.next();
                        jsonWriter.value(string2);
                    }
                }
                catch (IOException iOException2) {
                    break block3;
                }
                jsonWriter.endArray();
                object.zza(jsonWriter);
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
                break block4;
            }
            object = "unable to log";
            zzm.zzh((String)object, iOException2);
        }
        zzl.zzm(stringWriter.toString());
    }

    private final void zzo(String string2) {
        zzi zzi2 = new zzi(string2);
        this.zzn("onNetworkRequestError", zzi2);
    }

    private final void zzp(String string2, String string3, Map map2, byte[] byArray) {
        zzg zzg2 = new zzg(string2, string3, map2, byArray);
        this.zzn("onNetworkRequest", zzg2);
    }

    private final void zzq(Map map2, int n3) {
        zzj zzj2 = new zzj(n3, map2);
        this.zzn("onNetworkResponse", zzj2);
    }

    private static void zzr(JsonWriter jsonWriter, Map object) {
        boolean bl2;
        if (object == null) {
            return;
        }
        Object object2 = jsonWriter.name("headers");
        object2.beginArray();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            Object object3 = zzf;
            object2 = (Map.Entry)object.next();
            String string2 = (String)object2.getKey();
            boolean bl3 = object3.contains(string2);
            if (bl3) continue;
            object3 = object2.getValue();
            bl3 = object3 instanceof List;
            String string3 = "value";
            String string4 = "name";
            if (bl3) {
                object2 = ((List)object2.getValue()).iterator();
                while (bl3 = object2.hasNext()) {
                    object3 = (String)object2.next();
                    jsonWriter.beginObject();
                    jsonWriter.name(string4).value(string2);
                    JsonWriter jsonWriter2 = jsonWriter.name(string3);
                    jsonWriter2.value((String)object3);
                    jsonWriter.endObject();
                }
                continue;
            }
            object3 = object2.getValue();
            bl3 = object3 instanceof String;
            if (bl3) {
                jsonWriter.beginObject();
                object3 = jsonWriter.name(string4);
                object3.value(string2);
                string2 = jsonWriter.name(string3);
                object2 = (String)object2.getValue();
                string2.value((String)object2);
                jsonWriter.endObject();
                continue;
            }
            object = "Connection headers should be either Map<String, String> or Map<String, List<String>>";
            zzm.zzg((String)object);
            break;
        }
        jsonWriter.endArray();
    }

    public final void zzc(HttpURLConnection object, byte[] byArray) {
        Object object2;
        boolean bl2 = zzl.zzk();
        if (!bl2) {
            return;
        }
        HashMap hashMap = ((URLConnection)object).getRequestProperties();
        if (hashMap == null) {
            bl2 = false;
            hashMap = null;
        } else {
            object2 = ((URLConnection)object).getRequestProperties();
            hashMap = new HashMap(object2);
        }
        String string2 = ((URLConnection)object).getURL().toString();
        object2 = new String(string2);
        object = ((HttpURLConnection)object).getRequestMethod();
        string2 = new String((String)object);
        this.zzp((String)object2, string2, hashMap, byArray);
    }

    public final void zzd(String string2, String string3, Map map2, byte[] byArray) {
        boolean bl2 = zzl.zzk();
        if (!bl2) {
            return;
        }
        this.zzp(string2, "GET", map2, byArray);
    }

    public final void zze(HttpURLConnection object, int n3) {
        String string2;
        block8: {
            block7: {
                int n4 = zzl.zzk();
                if (n4 == 0) break block7;
                HashMap<String, List<String>> hashMap = ((URLConnection)object).getHeaderFields();
                string2 = null;
                if (hashMap == null) {
                    n4 = 0;
                    hashMap = null;
                } else {
                    Map<String, List<String>> map2 = ((URLConnection)object).getHeaderFields();
                    hashMap = new HashMap<String, List<String>>(map2);
                }
                this.zzq(hashMap, n3);
                n4 = 200;
                if (n3 < n4 || n3 >= (n4 = 300)) break block8;
            }
            return;
        }
        try {
            string2 = ((HttpURLConnection)object).getResponseMessage();
        }
        catch (IOException iOException) {
            object = String.valueOf(iOException.getMessage());
            String string3 = "Can not get error message from error HttpURLConnection\n";
            object = string3.concat((String)object);
            zzm.zzj((String)object);
        }
        this.zzo(string2);
    }

    public final void zzf(Map map2, int n3) {
        block3: {
            block2: {
                boolean bl2 = zzl.zzk();
                if (!bl2) break block2;
                this.zzq(map2, n3);
                int n4 = 200;
                if (n3 < n4 || n3 >= (n4 = 300)) break block3;
            }
            return;
        }
        this.zzo(null);
    }

    public final void zzg(String object) {
        boolean bl2 = zzl.zzk();
        if (bl2 && object != null) {
            object = ((String)object).getBytes();
            this.zzh((byte[])object);
        }
    }

    public final void zzh(byte[] byArray) {
        zzh zzh2 = new zzh(byArray);
        this.zzn("onNetworkResponseBody", zzh2);
    }
}

