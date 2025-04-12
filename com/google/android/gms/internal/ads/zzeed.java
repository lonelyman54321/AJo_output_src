/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 */
package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzbw;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzfgx;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;

public final class zzeed {
    public int zza = 0;
    public Map zzb;
    public String zzc;
    public long zzd;

    public zzeed() {
        HashMap hashMap;
        this.zzb = hashMap = new HashMap();
        this.zzc = "";
        this.zzd = -1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzeed zza(Reader reader) {
        Throwable throwable2;
        block14: {
            void var1_7;
            block15: {
                Object object;
                try {
                    boolean bl2;
                    object = new JsonReader(reader);
                    HashMap<String, Object> hashMap = new HashMap<String, Object>();
                    String string2 = "";
                    object.beginObject();
                    long l2 = -1;
                    int n3 = 0;
                    while (bl2 = object.hasNext()) {
                        Object object2 = "response";
                        String string3 = object.nextName();
                        boolean bl3 = ((String)object2).equals(string3);
                        if (bl3) {
                            n3 = object.nextInt();
                            continue;
                        }
                        object2 = "body";
                        bl3 = ((String)object2).equals(string3);
                        if (bl3) {
                            string2 = object.nextString();
                            continue;
                        }
                        object2 = "latency";
                        bl3 = ((String)object2).equals(string3);
                        if (bl3) {
                            l2 = object.nextLong();
                            continue;
                        }
                        object2 = "headers";
                        bl2 = ((String)object2).equals(string3);
                        if (bl2) {
                            hashMap = new HashMap<String, Object>();
                            object.beginObject();
                            while (bl2 = object.hasNext()) {
                                string3 = object.nextName();
                                object2 = zzbw.zzd(object);
                                hashMap.put(string3, object2);
                            }
                            object.endObject();
                            continue;
                        }
                        object.skipValue();
                    }
                    object.endObject();
                    object = new zzeed();
                    object.zza = n3;
                    if (string2 != null) {
                        object.zzc = string2;
                    }
                    object.zzd = l2;
                    object.zzb = hashMap;
                }
                catch (Throwable throwable2) {
                    break block14;
                }
                catch (AssertionError assertionError) {
                    break block15;
                }
                catch (NumberFormatException numberFormatException) {
                    break block15;
                }
                catch (IllegalStateException illegalStateException) {
                    break block15;
                }
                catch (IOException iOException) {}
                IOUtils.closeQuietly(reader);
                return object;
            }
            String string4 = "Unable to parse Response";
            zzfgx zzfgx2 = new zzfgx(string4, (Throwable)var1_7);
            throw zzfgx2;
        }
        IOUtils.closeQuietly(reader);
        throw throwable2;
    }
}

