/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.affise.attribution.referrer;

import android.content.Context;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.jvm.internal.Intrinsics;

public final class PartnerKeyKt {
    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String getPartnerKey(Context object) {
        Throwable throwable522;
        Throwable throwable2222;
        Object object2;
        block16: {
            Intrinsics.checkNotNullParameter(object, "<this>");
            Object object3 = null;
            object = object.getAssets();
            object2 = "partner_key";
            object = object.open((String)object2);
            Object object4 = new InputStreamReader((InputStream)object);
            object2 = new BufferedReader((Reader)object4);
            try {
                String string2;
                object4 = new StringBuilder();
                do {
                    if ((string2 = ((BufferedReader)object2).readLine()) != null) {
                        String string3 = "readLine()";
                        Intrinsics.checkNotNullExpressionValue(string2, string3);
                        ((StringBuilder)object4).append(string2);
                        continue;
                    }
                    string2 = null;
                } while (string2 != null);
                object4 = ((StringBuilder)object4).toString();
            }
            catch (Throwable throwable2222) {
                break block16;
            }
            xj3_1.b((Closeable)object2, null);
            xj3_1.b((Closeable)object, null);
            return object4;
            {
                catch (Throwable throwable3) {
                    return object3;
                }
            }
        }
        try {
            throw throwable2222;
        }
        catch (Throwable throwable4) {
            try {
                xj3_1.b((Closeable)object2, throwable2222);
                throw throwable4;
            }
            catch (Throwable throwable522) {}
        }
        try {
            throw throwable522;
        }
        catch (Throwable throwable6) {
            xj3_1.b((Closeable)object, throwable522);
            throw throwable6;
        }
    }
}

