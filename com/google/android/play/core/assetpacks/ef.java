/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.play.core.assetpacks;

import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.List;

final class ef {
    public static String a(List object) {
        int n3;
        MessageDigest messageDigest = MessageDigest.getInstance("SHA256");
        int n4 = 8192;
        byte[] byArray = new byte[n4];
        object = object.iterator();
        while ((n3 = object.hasNext()) != 0) {
            Throwable throwable2;
            FileInputStream fileInputStream;
            block7: {
                int n7;
                File file = (File)object.next();
                fileInputStream = new FileInputStream(file);
                do {
                    try {
                        n3 = ((InputStream)fileInputStream).read(byArray);
                        if (n3 <= 0) continue;
                        n7 = 0;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    messageDigest.update(byArray, 0, n3);
                } while (n3 != (n7 = -1));
                ((InputStream)fileInputStream).close();
                continue;
            }
            try {
                ((InputStream)fileInputStream).close();
            }
            catch (Throwable throwable3) {
                throwable2.addSuppressed(throwable3);
            }
            throw throwable2;
        }
        return Base64.encodeToString((byte[])messageDigest.digest(), (int)11);
    }
}

