/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$a;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$c;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

public final class DefaultImageHeaderParser
implements ImageHeaderParser {
    public static final byte[] a;
    public static final int[] b;

    static {
        Object object = Charset.forName("UTF-8");
        a = "Exif\u0000\u0000".getBytes((Charset)object);
        Object object2 = object = (Object)new int[13];
        object2[0] = false;
        object2[1] = true;
        object2[2] = true;
        object2[3] = 2;
        object2[4] = 4;
        object2[5] = 8;
        object2[6] = true;
        object2[7] = true;
        object2[8] = 2;
        object2[9] = 4;
        object2[10] = 8;
        object2[11] = 4;
        object2[12] = 8;
        b = (int[])object;
    }

    /*
     * Unable to fully structure code
     */
    public static int e(DefaultImageHeaderParser$Reader var0, Kp var1_2) {
        block24: {
            var2_3 = -1;
            var3_4 = var0.a();
            var4_5 = -40;
            var5_6 = var3_4 & var4_5;
            if (var5_6 != var4_5 && var3_4 != (var4_5 = 19789) && var3_4 != (var4_5 = 18761)) {
                var3_4 = 0;
                var6_7 = null;
            } else {
                var3_4 = 1;
            }
            var4_5 = 3;
            var7_8 = "DfltImageHeaderParser";
            if (var3_4 == 0) {
                Log.isLoggable((String)var7_8, (int)var4_5);
                return var2_3;
            }
            do {
                block23: {
                    var3_4 = var0.c();
                    var8_9 = 255;
                    if (var3_4 == var8_9) break block23;
                    Log.isLoggable((String)var7_8, (int)var4_5);
lbl26:
                    // 4 sources

                    while (true) {
                        var8_9 = -1;
                        break block24;
                        break;
                    }
                }
                var3_4 = var0.c();
                if (var3_4 == (var8_9 = 218)) ** GOTO lbl26
                var8_9 = 217;
                if (var3_4 != var8_9) ** GOTO lbl39
                Log.isLoggable((String)var7_8, (int)var4_5);
                ** GOTO lbl26
lbl39:
                // 1 sources

                var8_9 = var0.a() + -2;
                var9_10 = 225;
                if (var3_4 == var9_10) break block24;
                var10_11 = var8_9;
                ** try [egrp 6[TRYBLOCK] [7 : 186->193)] { 
lbl44:
                // 1 sources

            } while ((var3_4 = (int)((cfr_temp_0 = (var12_12 = var0.skip(var10_11)) - var10_11) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) == 0);
            Log.isLoggable((String)var7_8, (int)var4_5);
            ** continue;
lbl-1000:
            // 13 sources

            {
                catch (DefaultImageHeaderParser$Reader$EndOfFileException v0) {
                    ** continue;
                }
            }
        }
        if (var8_9 == var2_3) {
            Log.isLoggable((String)var7_8, (int)var4_5);
            return var2_3;
        }
        var6_7 = byte[].class;
        var6_7 = var1_2.c((Class)var6_7, var8_9);
        var6_7 = (byte[])var6_7;
        var14_13 = DefaultImageHeaderParser.g(var0, (byte[])var6_7, var8_9);
        var1_2.put(var6_7);
        return var14_13;
        catch (Throwable var0_1) {
            var1_2.put(var6_7);
            throw var0_1;
        }
lbl71:
        // 1 sources

        return var2_3;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static ImageHeaderParser$ImageType f(DefaultImageHeaderParser$Reader var0) {
        block55: {
            block52: {
                block51: {
                    block44: {
                        block45: {
                            block43: {
                                var1_1 = var0.a();
                                var2_2 = -40;
                                if (var1_1 == var2_2) {
                                    return ImageHeaderParser$ImageType.JPEG;
                                }
                                var1_1 <<= 8;
                                var2_2 = var0.c();
                                var1_1 |= var2_2;
                                var2_2 = 4671814;
                                if (var1_1 != var2_2) break block43;
                                return ImageHeaderParser$ImageType.GIF;
                            }
                            var1_1 <<= 8;
                            var2_2 = var0.c();
                            var1_1 |= var2_2;
                            var2_2 = -1991225785;
                            if (var1_1 != var2_2) break block44;
                            var3_3 = 21;
                            var0.skip(var3_3);
                            var5_4 = var0.c();
                            var1_1 = 3;
                            if (var5_4 < var1_1) break block45;
                            var0 = ImageHeaderParser$ImageType.PNG_A;
                        }
                        try {
                            var0 = ImageHeaderParser$ImageType.PNG;
                        }
                        catch (DefaultImageHeaderParser$Reader$EndOfFileException v0) {
                            return ImageHeaderParser$ImageType.PNG;
                        }
                        return var0;
                    }
                    var2_2 = 1380533830;
                    var6_7 = 4;
                    if (var1_1 != var2_2) {
                        block47: {
                            block49: {
                                block48: {
                                    block46: {
                                        var2_2 = var0.a() << 16;
                                        var8_8 = var0.a();
                                        var2_2 |= var8_8;
                                        var8_8 = 1718909296;
                                        if (var2_2 == var8_8) break block46;
                                        var0 = ImageHeaderParser$ImageType.UNKNOWN;
                                        break block47;
                                    }
                                    var2_2 = var0.a() << 16;
                                    var8_8 = var0.a();
                                    var2_2 |= var8_8;
                                    var8_8 = 1635150195;
                                    if (var2_2 != var8_8) break block48;
                                    var0 = ImageHeaderParser$ImageType.ANIMATED_AVIF;
                                    break block47;
                                }
                                var10_11 = 1635150182;
                                var2_2 = var2_2 == var10_11 ? 1 : 0;
                                var0.skip(var6_7);
                                var1_1 += -16;
                                var11_12 = var1_1 % 4;
                                if (var11_12 != 0) break block49;
                                for (var9_10 = 0; var9_10 < (var11_12 = 5) && var1_1 > 0; ++var9_10, var1_1 += -4) {
                                    block50: {
                                        var11_12 = var0.a() << 16;
                                        var12_13 = var0.a();
                                        if ((var11_12 |= var12_13) != var8_8) break block50;
                                        var0 = ImageHeaderParser$ImageType.ANIMATED_AVIF;
                                        break block47;
                                    }
                                    if (var11_12 != var10_11) continue;
                                    var2_2 = 1;
                                }
                            }
                            if (var2_2 != 0) {
                                var0 = ImageHeaderParser$ImageType.AVIF;
                            } else {
                                var0 = ImageHeaderParser$ImageType.UNKNOWN;
                            }
                        }
                        return var0;
                    }
                    var0.skip(var6_7);
                    var1_1 = var0.a() << 16;
                    {
                        catch (DefaultImageHeaderParser$Reader$EndOfFileException v1) {
                            return ImageHeaderParser$ImageType.UNKNOWN;
                        }
                    }
                    var2_2 = var0.a();
                    var1_1 |= var2_2;
                    var2_2 = 1464156752;
                    if (var1_1 == var2_2) ** GOTO lbl110
                    return ImageHeaderParser$ImageType.UNKNOWN;
lbl110:
                    // 1 sources

                    var1_1 = var0.a() << 16;
                    var2_2 = var0.a();
                    var1_1 |= var2_2;
                    var2_2 = var1_1 & -256;
                    var8_9 = 1448097792;
                    if (var2_2 == var8_9) break block51;
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                var2_2 = 88;
                if ((var1_1 &= 255) != var2_2) break block55;
                var0.skip(var6_7);
                var5_5 = var0.c();
                var1_1 = var5_5 & 2;
                if (var1_1 == 0) break block52;
                return ImageHeaderParser$ImageType.ANIMATED_WEBP;
            }
            if ((var5_5 &= 16) == 0) ** GOTO lbl134
            return ImageHeaderParser$ImageType.WEBP_A;
lbl134:
            // 1 sources

            return ImageHeaderParser$ImageType.WEBP;
        }
        var2_2 = 76;
        if (var1_1 == var2_2) {
            block54: {
                block53: {
                    var0.skip(var6_7);
                    var5_6 = var0.c() & 8;
                    if (var5_6 == 0) break block53;
                    var0 = ImageHeaderParser$ImageType.WEBP_A;
                    break block54;
                }
                var0 = ImageHeaderParser$ImageType.WEBP;
            }
            return var0;
        }
        return ImageHeaderParser$ImageType.WEBP;
    }

    public static int g(DefaultImageHeaderParser$Reader defaultImageHeaderParser$Reader, byte[] object, int n3) {
        Object object2;
        Object object3;
        int n4;
        int n7;
        int n8 = defaultImageHeaderParser$Reader.b(n3, (byte[])object);
        int n10 = -1;
        int n14 = 3;
        String string2 = "DfltImageHeaderParser";
        if (n8 != n3) {
            Log.isLoggable((String)string2, (int)n14);
            return n10;
        }
        n8 = 1;
        int n15 = 0;
        Object object4 = a;
        n7 = object != null && n3 > (n7 = ((byte[])object4).length) ? 1 : 0;
        if (n7 != 0) {
            for (n4 = 0; n4 < (object3 = ((byte[])object4).length); ++n4) {
                object3 = object[n4];
                object2 = object4[n4];
                if (object3 == object2) continue;
                n7 = 0;
                break;
            }
        }
        if (n7 != 0) {
            object4 = new DefaultImageHeaderParser$b;
            ((DefaultImageHeaderParser$b)object4)((byte[])object, n3);
            int n16 = ((DefaultImageHeaderParser$b)object4).a(6);
            n3 = 18761;
            if (n16 != n3) {
                n3 = 19789;
                if (n16 != n3) {
                    Log.isLoggable((String)string2, (int)n14);
                    object = ByteOrder.BIG_ENDIAN;
                } else {
                    object = ByteOrder.BIG_ENDIAN;
                }
            } else {
                object = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = ((DefaultImageHeaderParser$b)object4).a;
            byteBuffer.order((ByteOrder)object);
            n16 = byteBuffer.remaining();
            n7 = 10;
            n4 = 4;
            n16 = (n16 -= n7) >= n4 ? byteBuffer.getInt(n7) : -1;
            n7 = n16 + 6;
            n7 = ((DefaultImageHeaderParser$b)object4).a(n7);
            while (n15 < n7) {
                Object object5;
                object3 = n16 + 8;
                object2 = n15 * 12 + object3;
                if ((object3 = (Object)((DefaultImageHeaderParser$b)object4).a((int)object2)) == (object5 = 274)) {
                    object3 = object2 + 2;
                    if ((object3 = (Object)((DefaultImageHeaderParser$b)object4).a((int)object3)) >= n8 && object3 <= (object5 = 12)) {
                        object5 = object2 + 4;
                        int n17 = byteBuffer.remaining() - object5;
                        object5 = n17 >= n4 ? byteBuffer.getInt((int)object5) : -1;
                        if (object5 < 0) {
                            Log.isLoggable((String)string2, (int)n14);
                        } else {
                            Log.isLoggable((String)string2, (int)n14);
                            int[] nArray = b;
                            object3 = nArray[object3];
                            if ((object5 += object3) > n4) {
                                Log.isLoggable((String)string2, (int)n14);
                            } else if ((object2 += 8) >= 0 && object2 <= (object3 = byteBuffer.remaining())) {
                                if (object5 >= 0 && (object5 += object2) <= (object3 = byteBuffer.remaining())) {
                                    n10 = ((DefaultImageHeaderParser$b)object4).a((int)object2);
                                    break;
                                }
                                Log.isLoggable((String)string2, (int)n14);
                            } else {
                                Log.isLoggable((String)string2, (int)n14);
                            }
                        }
                    } else {
                        Log.isLoggable((String)string2, (int)n14);
                    }
                }
                ++n15;
            }
            return n10;
        }
        Log.isLoggable((String)string2, (int)n14);
        return n10;
    }

    public final int a(InputStream inputStream, Kp kp) {
        String string2 = "Argument must not be null";
        dV0.c(inputStream, string2);
        DefaultImageHeaderParser$c defaultImageHeaderParser$c = new DefaultImageHeaderParser$c(inputStream);
        dV0.c(kp, string2);
        return DefaultImageHeaderParser.e(defaultImageHeaderParser$c, kp);
    }

    public final ImageHeaderParser$ImageType b(ByteBuffer byteBuffer) {
        dV0.c(byteBuffer, "Argument must not be null");
        DefaultImageHeaderParser$a defaultImageHeaderParser$a = new DefaultImageHeaderParser$a(byteBuffer);
        return DefaultImageHeaderParser.f(defaultImageHeaderParser$a);
    }

    public final ImageHeaderParser$ImageType c(InputStream inputStream) {
        dV0.c(inputStream, "Argument must not be null");
        DefaultImageHeaderParser$c defaultImageHeaderParser$c = new DefaultImageHeaderParser$c(inputStream);
        return DefaultImageHeaderParser.f(defaultImageHeaderParser$c);
    }

    public final int d(ByteBuffer byteBuffer, Kp kp) {
        String string2 = "Argument must not be null";
        dV0.c(byteBuffer, string2);
        DefaultImageHeaderParser$a defaultImageHeaderParser$a = new DefaultImageHeaderParser$a(byteBuffer);
        dV0.c(kp, string2);
        return DefaultImageHeaderParser.e(defaultImageHeaderParser$a, kp);
    }
}

