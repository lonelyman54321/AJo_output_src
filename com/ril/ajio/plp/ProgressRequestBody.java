/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.ril.ajio.plp;

import android.os.Handler;
import android.os.Looper;
import com.ril.ajio.plp.ProgressRequestBody$ProgressUpdater;
import com.ril.ajio.plp.ProgressRequestBody$a;
import java.io.File;
import java.io.FileInputStream;

public final class ProgressRequestBody
extends pj2_2 {
    public final File a;
    public final ProgressRequestBody$a b;
    public final String c;

    public ProgressRequestBody(File file, ProgressRequestBody$a progressRequestBody$a) {
        this.c = "image";
        this.a = file;
        this.b = progressRequestBody$a;
    }

    public final long contentLength() {
        return this.a.length();
    }

    public final jn1_0 contentType() {
        CharSequence charSequence = new StringBuilder();
        Object object = this.c;
        charSequence = h30_0.a(charSequence, (String)object, "/*");
        object = jn1_0.d;
        return JN1$a.b((String)charSequence);
    }

    public final void writeTo(re_2 re_22) {
        Throwable throwable2;
        FileInputStream fileInputStream;
        block11: {
            block10: {
                ProgressRequestBody$ProgressUpdater progressRequestBody$ProgressUpdater;
                int n3;
                long l2;
                long l3;
                File file = this.a;
                long l4 = file.length();
                int n4 = 1024;
                byte[] byArray = new byte[n4];
                fileInputStream = new FileInputStream(file);
                Object object = Looper.getMainLooper();
                try {
                    file = new Handler(object);
                    l2 = l3 = 0L;
                }
                catch (Throwable throwable2) {}
                while (true) {
                    n3 = fileInputStream.read(byArray);
                    n4 = -1;
                    if (n3 == n4) break block10;
                    object = progressRequestBody$ProgressUpdater;
                    break;
                }
                {
                    progressRequestBody$ProgressUpdater = new ProgressRequestBody$ProgressUpdater(this, l2, l4);
                    file.post(progressRequestBody$ProgressUpdater);
                    l3 = n3;
                    l2 += l3;
                    n4 = 0;
                    object = null;
                    re_22.S(0, byArray, n3);
                    continue;
                }
                break block11;
            }
            fileInputStream.close();
            return;
        }
        fileInputStream.close();
        throw throwable2;
    }
}

