/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonWriter
 */
package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzbgm;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

public final class zzdvo {
    private final Clock zza;

    public zzdvo(Clock clock) {
        this.zza = clock;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(List object, String string2, String object2, Object ... objectArray) {
        StringWriter stringWriter;
        block7: {
            int n3;
            int n4;
            JsonWriter jsonWriter;
            block6: {
                IOException iOException2;
                block5: {
                    Object object3 = (Boolean)zzbgm.zza.zze();
                    boolean bl2 = (Boolean)object3;
                    if (!bl2) {
                        return;
                    }
                    object3 = this.zza;
                    long l2 = object3.currentTimeMillis();
                    stringWriter = new StringWriter();
                    jsonWriter = new JsonWriter((Writer)stringWriter);
                    try {
                        jsonWriter.beginObject();
                        String string3 = "timestamp";
                        string3 = jsonWriter.name(string3);
                        string3.value(l2);
                        object3 = "source";
                        object3 = jsonWriter.name((String)object3);
                        object3.value(string2);
                        string2 = "event";
                        string2 = jsonWriter.name(string2);
                        string2.value((String)object2);
                        string2 = "components";
                        string2 = jsonWriter.name(string2);
                        string2.beginArray();
                        object = object.iterator();
                        while ((n4 = object.hasNext()) != 0) {
                            string2 = object.next();
                            string2 = string2.toString();
                            jsonWriter.value(string2);
                        }
                    }
                    catch (IOException iOException2) {
                        break block5;
                    }
                    jsonWriter.endArray();
                    object = "params";
                    object = jsonWriter.name((String)object);
                    object.beginArray();
                    n3 = objectArray.length;
                    string2 = null;
                    break block6;
                }
                string2 = "unable to log";
                zzm.zzh(string2, iOException2);
                break block7;
            }
            for (n4 = 0; n4 < n3; ++n4) {
                object2 = objectArray[n4];
                object2 = object2 != null ? object2.toString() : null;
                jsonWriter.value((String)object2);
            }
            jsonWriter.endArray();
            jsonWriter.endObject();
            jsonWriter.flush();
            jsonWriter.close();
        }
        object = String.valueOf(stringWriter.toString());
        zzm.zzi("AD-DBG ".concat((String)object));
    }
}

