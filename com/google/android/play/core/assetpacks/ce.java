/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.AssetLocation;
import com.google.android.play.core.assetpacks.bq;
import com.google.android.play.core.assetpacks.cc;
import com.google.android.play.core.assetpacks.cd;
import com.google.android.play.core.assetpacks.internal.aj;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.zip.ZipException;

final class ce {
    public static AssetLocation a(String string2, String string3) {
        long l2;
        long l3;
        long l4;
        Object object;
        int n3;
        Object object2;
        String string4;
        block15: {
            int n4;
            Object object3;
            Object object4;
            int n7;
            int n8;
            int n10;
            long l7;
            Object object5;
            int n14;
            block14: {
                boolean bl2;
                string4 = string2;
                object2 = string3;
                int n15 = 5;
                n3 = 6;
                int n16 = 0;
                if (string2 != null) {
                    bl2 = true;
                } else {
                    bl2 = false;
                    object = null;
                }
                aj.b(bl2, "Attempted to get file location from a null apk path.");
                object = new StringBuilder("Attempted to get file location in apk ");
                ((StringBuilder)object).append(string4);
                String string5 = " with a null file path.";
                ((StringBuilder)object).append(string5);
                object = ((StringBuilder)object).toString();
                if (object2 != null) {
                    n14 = 1;
                } else {
                    n14 = 0;
                    string5 = null;
                }
                aj.b(n14 != 0, object);
                string5 = "r";
                object = new RandomAccessFile(string4, string5);
                n14 = 22;
                object5 = new byte[n14];
                l7 = ((RandomAccessFile)object).length();
                long l8 = -22;
                ((RandomAccessFile)object).seek(l7 += l8);
                ((RandomAccessFile)object).readFully((byte[])object5);
                n10 = cc.b(object5, 0);
                n8 = 1347093766;
                object5 = n10 == n8 ? (Object)ce.b(object5) : null;
                if (object5 == null) {
                    long l12 = ((RandomAccessFile)object).length();
                    l8 += l12;
                    l4 = ((RandomAccessFile)object).length();
                    l3 = Math.min(1024L, l4);
                    n7 = (int)l3;
                    object4 = new byte[n7];
                    object3 = new byte[n14];
                    while (true) {
                        long l14;
                        long l15;
                        long l16;
                        if ((n16 = (l16 = (l15 = l12 + 0xFFFEFFEAL) - (l14 = 0L)) == 0L ? 0 : (l16 < 0L ? -1 : 1)) < 0) {
                            l15 = l12;
                            l2 = l14;
                        } else {
                            l2 = l15;
                            l15 = l12;
                        }
                        long l17 = n7;
                        l8 -= l17;
                        l17 = Math.max((long)3 + l8, l2);
                        ((RandomAccessFile)object).seek(l17);
                        ((RandomAccessFile)object).readFully((byte[])object4);
                        for (n4 = n7 + -4; n4 >= 0; n4 += -4) {
                            n16 = object4[n4];
                            n16 = n16 != n15 ? (n16 != n3 ? (n16 != (n10 = 75) ? (n16 != (n10 = 80) ? -1 : 0) : 1) : 3) : 2;
                            if (n16 < 0 || n4 < n16) continue;
                            n10 = n4 - n16;
                            if ((n10 = cc.b(object4, n10)) != n8) continue;
                            l2 = n4;
                            l17 += l2;
                            l2 = n16;
                            ((RandomAccessFile)object).seek(l17 -= l2);
                            ((RandomAccessFile)object).readFully((byte[])object3);
                            object5 = ce.b(object3);
                            break block14;
                        }
                        n16 = (int)(l17 == l2 ? 0 : (l17 < l2 ? -1 : 1));
                        if (n16 == 0) break;
                        l8 = l17;
                        l12 = l15;
                    }
                    string4 = kp1_0.c("End Of Central Directory signature not found in APK ", string4);
                    object2 = new ZipException(string4);
                    throw object2;
                }
            }
            Object object6 = ((String)object2).getBytes("UTF-8");
            object4 = new byte[46];
            int n17 = string3.length();
            Object object7 = new byte[n17];
            l4 = object5.a;
            Integer n18 = null;
            for (n7 = 0; n7 < (n10 = object5.b); n7 += n4) {
                ((RandomAccessFile)object).seek(l4);
                ((RandomAccessFile)object).readFully((byte[])object4);
                n8 = cc.b(object4, 0);
                n10 = 1347092738;
                if (n8 == n10) {
                    l7 = (long)28 + l4;
                    ((RandomAccessFile)object).seek(l7);
                    n10 = cc.a(object4, 28);
                    n8 = string3.length();
                    if (n10 == n8) {
                        long l18 = (long)46 + l4;
                        ((RandomAccessFile)object).seek(l18);
                        ((RandomAccessFile)object).read((byte[])object7);
                        n8 = (int)(Arrays.equals(object7, object6) ? 1 : 0);
                        if (n8 != 0) {
                            int n19 = 42;
                            l2 = cc.c(object4, n19);
                            object2 = l2;
                            break block15;
                        }
                    }
                    n8 = cc.a(object4, 30);
                    n4 = cc.a(object4, 32);
                    n14 = 46;
                    n10 = n10 + n14 + n8 + n4;
                    l7 = n10;
                    l4 += l7;
                    n4 = 1;
                    continue;
                }
                object6 = new ZipException;
                object7 = n7;
                object4 = object5.b;
                n18 = n8;
                object3 = n10;
                Object[] objectArray = new Object[n3];
                objectArray[0] = object2;
                objectArray[1] = string4;
                objectArray[2] = object7;
                objectArray[3] = object4;
                objectArray[4] = n18;
                objectArray[n15] = object3;
                object2 = String.format("Missing central directory file header signature when looking for file %s in APK %s. Read %d entries out of %d. Found %d instead of the header signature %d.", objectArray);
                object6((String)object2);
                throw object6;
            }
            boolean bl3 = false;
            object2 = null;
        }
        if (object2 == null) {
            return null;
        }
        l2 = (Long)object2;
        l3 = (long)22 + l2;
        object2 = new byte[8];
        ((RandomAccessFile)object).seek(l3);
        ((RandomAccessFile)object).readFully((byte[])object2);
        l3 = cc.c((byte[])object2, 0);
        l4 = cc.a((byte[])object2, 4);
        long l19 = cc.a((byte[])object2, n3);
        l2 += (long)30;
        l2 = l2 + l4 + l19;
        object2 = object;
        string4 = string2;
        object = new bq(string2, l2, l3);
        return object;
    }

    private static cd b(byte[] object) {
        int n3 = cc.a(object, 10);
        long l2 = cc.c(object, 12);
        long l3 = cc.c(object, 16);
        object = new cd;
        object(l3, l2, n3);
        return object;
    }
}

