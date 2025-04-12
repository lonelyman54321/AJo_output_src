/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Point
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 */
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from o70
 */
public final class o70_0
implements el0_0 {
    public final Uri a;
    public final ba2 b;

    public o70_0(Uri uri, ba2 ba22) {
        this.a = uri;
        this.b = ba22;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object a(f80_0 var1_1) {
        block17: {
            block15: {
                block16: {
                    block14: {
                        var1_1 = this.b;
                        var2_2 /* !! */  = var1_1.a.getContentResolver();
                        var3_3 = this.a;
                        var4_4 = var3_3.getAuthority();
                        var5_5 = Intrinsics.areEqual(var4_4, "com.android.contacts");
                        var6_6 = "'.";
                        var7_7 = null;
                        if (var5_5 == 0 || (var5_5 = (int)Intrinsics.areEqual(var4_4 = var3_3.getLastPathSegment(), var8_8 = "display_photo")) == 0) break block14;
                        var4_4 = var2_2 /* !! */ .openAssetFileDescriptor(var3_3, "r");
                        if (var4_4 != null) {
                            var7_7 = var4_4.createInputStream();
                        }
                        if (var7_7 == null) {
                            var1_1 = new StringBuilder("Unable to find a contact photo associated with '");
                            var1_1.append(var3_3);
                            var1_1.append((String)var6_6);
                            var1_1 = var1_1.toString();
                            var1_1 = var1_1.toString();
                            var2_2 /* !! */  = new IllegalStateException((String)var1_1);
                            throw var2_2 /* !! */ ;
                        }
                        break block15;
                    }
                    var5_5 = Build.VERSION.SDK_INT;
                    var9_9 = 29;
                    if (var5_5 < var9_9 || (var5_5 = (int)Intrinsics.areEqual(var4_4 = var3_3.getAuthority(), var8_8 = "media")) == 0 || (var9_9 = (var4_4 = var3_3.getPathSegments()).size()) < (var10_10 = 3)) break block16;
                    var10_10 = var9_9 + -3;
                    var11_11 /* !! */  = var4_4.get(var10_10);
                    if ((var10_10 = (int)Intrinsics.areEqual(var11_11 /* !! */ , var12_12 = "audio")) == 0 || (var5_5 = (int)Intrinsics.areEqual(var4_4 = var4_4.get(var9_9 += -2), var8_8 = "albums")) == 0) break block16;
                    var4_4 = var1_1.d;
                    var8_8 = var4_4.a;
                    var10_10 = var8_8 instanceof wq0$a;
                    if (var10_10 != 0) {
                        var8_8 = (wq0$a)var8_8;
                    } else {
                        var9_9 = 0;
                        var8_8 = null;
                    }
                    if (var8_8 == null) ** GOTO lbl-1000
                    var4_4 = var4_4.b;
                    var10_10 = var4_4 instanceof wq0$a;
                    if (var10_10 != 0) {
                        var4_4 = (wq0$a)var4_4;
                    } else {
                        var5_5 = 0;
                        var4_4 = null;
                    }
                    if (var4_4 != null) {
                        var13_13 = 1;
                        var11_11 /* !! */  = new Bundle(var13_13);
                        var9_9 = var8_8.a;
                        var5_5 = var4_4.a;
                        var12_12 = new Point(var9_9, var5_5);
                        var4_4 = "android.content.extra.SIZE";
                        var11_11 /* !! */ .putParcelable((String)var4_4, (Parcelable)var12_12);
                    } else lbl-1000:
                    // 2 sources

                    {
                        var10_10 = 0;
                        var11_11 /* !! */  = null;
                    }
                    var4_4 = n70.a(var2_2 /* !! */ , var3_3, (Bundle)var11_11 /* !! */ );
                    if (var4_4 != null) {
                        var7_7 = var4_4.createInputStream();
                    }
                    if (var7_7 == null) {
                        var1_1 = new StringBuilder("Unable to find a music thumbnail associated with '");
                        var1_1.append(var3_3);
                        var1_1.append((String)var6_6);
                        var1_1 = var1_1.toString();
                        var1_1 = var1_1.toString();
                        var2_2 /* !! */  = new IllegalStateException((String)var1_1);
                        throw var2_2 /* !! */ ;
                    }
                    break block15;
                }
                if ((var7_7 = var2_2 /* !! */ .openInputStream(var3_3)) == null) break block17;
            }
            var6_6 = o72_0.b(o72_0.h((InputStream)var7_7));
            var7_7 = new v60_0(var3_3);
            var1_1 = var1_1.a;
            var11_11 /* !! */  = new zz_1(var1_1, 2);
            var8_8 = new f93_0((se_1)var6_6, var11_11 /* !! */ , (Fe1$a)var7_7);
            var1_1 = var2_2 /* !! */ .getType(var3_3);
            var2_2 /* !! */  = ri0.DISK;
            var4_4 = new N93((Fe1)var8_8, (String)var1_1, (ri0)var2_2 /* !! */ );
            return var4_4;
        }
        var1_1 = new StringBuilder("Unable to open '");
        var1_1.append(var3_3);
        var1_1.append((String)var6_6);
        var1_1 = var1_1.toString();
        var1_1 = var1_1.toString();
        var2_2 /* !! */  = new IllegalStateException((String)var1_1);
        throw var2_2 /* !! */ ;
    }
}

