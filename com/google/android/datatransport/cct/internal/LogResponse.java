/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.JsonReader
 *  android.util.JsonToken
 */
package com.google.android.datatransport.cct.internal;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.android.datatransport.cct.internal.AutoValue_LogResponse;
import java.io.IOException;
import java.io.Reader;

public abstract class LogResponse {
    private static final String LOG_TAG = "LogResponseInternal";

    public static LogResponse create(long l2) {
        AutoValue_LogResponse autoValue_LogResponse = new AutoValue_LogResponse(l2);
        return autoValue_LogResponse;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static LogResponse fromJson(Reader var0) {
        block6: {
            var1_2 = new JsonReader((Reader)var0);
            try {
                var1_2.beginObject();
lbl4:
                // 2 sources

                while (var2_3 = var1_2.hasNext()) {
                    var0 = var1_2.nextName();
                    var2_3 = var0.equals(var3_4 = "nextRequestWaitMillis");
                    if (!var2_3) ** GOTO lbl-1000
                    var0 = var1_2.peek();
                    if (var0 != (var3_4 = JsonToken.STRING)) ** GOTO lbl-1000
                    ** GOTO lbl-1000
                }
                ** GOTO lbl25
            }
            catch (Throwable var0_1) {
                break block6;
            }
lbl-1000:
            // 1 sources

            {
                var0 = var1_2.nextString();
                var4_5 = Long.parseLong((String)var0);
                var0 = LogResponse.create(var4_5);
            }
            var1_2.close();
            return var0;
lbl-1000:
            // 1 sources

            {
                var4_6 = var1_2.nextLong();
                var0 = LogResponse.create(var4_6);
            }
            var1_2.close();
            return var0;
lbl-1000:
            // 1 sources

            {
                var1_2.skipValue();
                ** GOTO lbl4
lbl25:
                // 1 sources

                var3_4 = "Response is missing nextRequestWaitMillis field.";
                var0 = new IOException(var3_4);
                throw var0;
            }
        }
        var1_2.close();
        throw var0_1;
    }

    public abstract long getNextRequestWaitMillis();
}

