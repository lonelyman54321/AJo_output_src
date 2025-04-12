/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.internal;

import com.google.android.play.core.assetpacks.internal.al;
import com.google.android.play.core.assetpacks.internal.an;
import com.google.android.play.core.assetpacks.internal.ao;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class am {
    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static long a(an var0, InputStream var1_1, OutputStream var2_2, long var3_3) {
        block21: {
            var5_4 = 16384;
            var6_5 /* !! */  = new byte[var5_4];
            var7_7 = new BufferedInputStream(var1_1, 4096);
            var8_8 = new DataInputStream((InputStream)var7_7);
            var9_9 = var8_8.readInt();
            if (var9_9 != (var10_10 = -771763713)) {
                var6_5 /* !! */  = (byte[])new al;
                var7_7 = var9_9;
                var18_16 = new Object[]{var7_7};
                var7_7 = String.format("%x", var18_16);
                var7_7 = "Unexpected magic=".concat((String)var7_7);
                var6_5 /* !! */ ((String)var7_7);
                throw var6_5 /* !! */ ;
            }
            var9_9 = var8_8.read();
            if (var9_9 != (var10_10 = 4)) {
                var6_5 /* !! */  = (byte[])new al;
                var7_7 = hj0_0.a(var9_9, "Unexpected version=");
                var6_5 /* !! */ ((String)var7_7);
                throw var6_5 /* !! */ ;
            }
            var13_12 = var11_11 = 0L;
            while (true) {
                var15_13 = var3_3 - var13_12;
                try {
                    var17_14 = var8_8.read();
                    var9_9 = -1;
                    if (var17_14 != var9_9) {
                        if (var17_14 == 0) break;
                        var18_15 = "Unexpected end of patch";
                    }
                    ** GOTO lbl-1000
                }
                catch (Throwable var6_6) {
                    break block21;
                }
                switch (var17_14) {
                    default: {
                        var7_7 = var6_5 /* !! */ ;
                        var18_15 = var8_8;
                        am.c(var6_5 /* !! */ , var8_8, var2_2, var17_14, var15_13);
                        break;
                    }
                    case 255: {
                        var19_17 = var8_8.readLong();
                        var17_14 = var8_8.readInt();
                        var7_7 = var6_5 /* !! */ ;
                        var18_15 = var0;
                        am.b(var6_5 /* !! */ , var0, var2_2, var19_17, var17_14, var15_13);
                        break;
                    }
                    case 254: {
                        var9_9 = var8_8.readInt();
                        var19_17 = var9_9;
                        var17_14 = var8_8.readInt();
                        var7_7 = var6_5 /* !! */ ;
                        var18_15 = var0;
                        am.b(var6_5 /* !! */ , var0, var2_2, var19_17, var17_14, var15_13);
                        break;
                    }
                    case 253: {
                        var9_9 = var8_8.readInt();
                        var19_17 = var9_9;
                        var17_14 = var8_8.readUnsignedShort();
                        var7_7 = var6_5 /* !! */ ;
                        var18_15 = var0;
                        am.b(var6_5 /* !! */ , var0, var2_2, var19_17, var17_14, var15_13);
                        break;
                    }
                    case 252: {
                        var21_18 = var8_8.readInt();
                        var19_17 = var21_18;
                        var17_14 = var8_8.read();
                        if (var17_14 == var9_9) {
                            var6_5 /* !! */  = (byte[])new IOException;
                            var6_5 /* !! */ ((String)var18_15);
                            throw var6_5 /* !! */ ;
                        }
                        var7_7 = var6_5 /* !! */ ;
                        var18_15 = var0;
                        am.b(var6_5 /* !! */ , var0, var2_2, var19_17, var17_14, var15_13);
                        break;
                    }
                    case 251: {
                        var9_9 = var8_8.readUnsignedShort();
                        var19_17 = var9_9;
                        var17_14 = var8_8.readInt();
                        var7_7 = var6_5 /* !! */ ;
                        var18_15 = var0;
                        am.b(var6_5 /* !! */ , var0, var2_2, var19_17, var17_14, var15_13);
                        break;
                    }
                    case 250: {
                        var9_9 = var8_8.readUnsignedShort();
                        var19_17 = var9_9;
                        var17_14 = var8_8.readUnsignedShort();
                        var7_7 = var6_5 /* !! */ ;
                        var18_15 = var0;
                        am.b(var6_5 /* !! */ , var0, var2_2, var19_17, var17_14, var15_13);
                        break;
                    }
                    case 249: {
                        var21_18 = var8_8.readUnsignedShort();
                        var19_17 = var21_18;
                        var17_14 = var8_8.read();
                        if (var17_14 == var9_9) {
                            var6_5 /* !! */  = (byte[])new IOException;
                            var6_5 /* !! */ ((String)var18_15);
                            throw var6_5 /* !! */ ;
                        }
                        var7_7 = var6_5 /* !! */ ;
                        var18_15 = var0;
                        am.b(var6_5 /* !! */ , var0, var2_2, var19_17, var17_14, var15_13);
                        break;
                    }
                    case 248: {
                        var17_14 = var8_8.readInt();
                        var7_7 = var6_5 /* !! */ ;
                        var18_15 = var8_8;
                        am.c(var6_5 /* !! */ , var8_8, var2_2, var17_14, var15_13);
                        break;
                    }
                    case 247: {
                        var17_14 = var8_8.readUnsignedShort();
                        var7_7 = var6_5 /* !! */ ;
                        var18_15 = var8_8;
                        am.c(var6_5 /* !! */ , var8_8, var2_2, var17_14, var15_13);
                    }
                }
                var11_11 = var17_14;
                var13_12 += var11_11;
            }
            var2_2.flush();
            return var13_12;
lbl-1000:
            // 1 sources

            {
                var6_5 /* !! */  = (byte[])new IOException;
                var7_7 = "Patch file overrun";
                var6_5 /* !! */ ((String)var7_7);
                throw var6_5 /* !! */ ;
            }
        }
        var2_2.flush();
        throw var6_6;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void b(byte[] byArray, an an2, OutputStream outputStream, long l2, int n3, long l3) {
        Throwable throwable;
        EOFException eOFException2;
        block13: {
            Object object = byArray;
            if (n3 < 0) {
                object = new IOException;
                object("copyLength negative");
                throw object;
            }
            long l4 = 0L;
            long l7 = l2 - l4;
            Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
            if (object2 < 0) {
                object = new IOException;
                object("inputOffset negative");
                throw object;
            }
            long l8 = n3;
            long l12 = l8 - l3;
            Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object3 > 0) {
                object = new IOException;
                object("Output length overrun");
                throw object;
            }
            Object object4 = new ao(an2, l2, l8);
            object4 = ((an)object4).c();
            {
                int n4;
                catch (EOFException eOFException2) {
                    break block13;
                }
                for (int i3 = n3; i3 > 0; i3 -= n4) {
                    block14: {
                        int n7;
                        n4 = 16384;
                        try {
                            n4 = Math.min(i3, n4);
                        }
                        catch (Throwable throwable2) {
                            throwable = throwable2;
                            break block14;
                        }
                        object2 = 0;
                        for (int i8 = 0; i8 < n4; i8 += n7) {
                            int n8;
                            n7 = n4 - i8;
                            if ((n7 = ((InputStream)object4).read(byArray, i8, n7)) != (n8 = -1)) continue;
                            object = new IOException;
                            String string2 = "truncated input stream";
                            object(string2);
                            throw object;
                        }
                        outputStream.write(byArray, 0, n4);
                        continue;
                    }
                    try {
                        ((InputStream)object4).close();
                        throw throwable;
                    }
                    catch (Throwable throwable3) {}
                    object4 = throwable3;
                    throwable.addSuppressed(throwable3);
                    throw throwable;
                }
            }
            ((InputStream)object4).close();
            return;
        }
        throwable = new IOException("patch underrun", eOFException2);
        throw throwable;
    }

    private static void c(byte[] object, DataInputStream dataInputStream, OutputStream outputStream, int n3, long l2) {
        if (n3 >= 0) {
            long l3 = n3;
            long l4 = l3 - l2;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 <= 0) {
                while (n3 > 0) {
                    int n4 = 16384;
                    try {
                        n4 = Math.min(n3, n4);
                    }
                    catch (EOFException eOFException) {
                        object = new IOException;
                        object("patch underrun");
                        throw object;
                    }
                    dataInputStream.readFully((byte[])object, 0, n4);
                    outputStream.write((byte[])object, 0, n4);
                    n3 -= n4;
                }
                return;
            }
            object = new IOException;
            object("Output length overrun");
            throw object;
        }
        object = new IOException;
        object("copyLength negative");
        throw object;
    }
}

