/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.AssetFileDescriptor
 *  android.content.res.Resources$NotFoundException
 *  android.net.Uri
 *  android.text.TextUtils
 */
package androidx.media3.datasource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.RawResourceDataSource$RawResourceDataSourceException;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class RawResourceDataSource
extends Yv {
    public final Context e;
    public ti0_1 f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public RawResourceDataSource(Context context) {
        super(false);
        this.e = context = context.getApplicationContext();
    }

    public static Uri buildRawResourceUri(int n3) {
        StringBuilder stringBuilder = new StringBuilder("rawresource:///");
        stringBuilder.append(n3);
        return Uri.parse((String)stringBuilder.toString());
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(ti0_1 var1_1) {
        block27: {
            block28: {
                block29: {
                    block26: {
                        var2_2 = this;
                        var3_3 = var1_1;
                        this.f = var1_1;
                        this.n(var1_1);
                        var4_7 = var1_1.a.normalizeScheme();
                        var5_9 = var4_7.getScheme();
                        var6_10 = TextUtils.equals((CharSequence)"rawresource", (CharSequence)var5_9);
                        var7_11 = "Resource identifier must be an integer.";
                        var8_12 = 1004;
                        var9_13 = 1;
                        var10_14 = 2000;
                        var11_15 = this.e;
                        var12_16 = 2005;
                        if (var6_10 != 0) {
                            var5_9 = var11_15.getResources();
                            var11_15 = var4_7.getPathSegments();
                            var13_17 = var11_15.size();
                            if (var13_17 != var9_13) {
                                var4_7 = new StringBuilder("rawresource:// URI must have exactly one path element, found ");
                                var6_10 = var11_15.size();
                                var4_7.append(var6_10);
                                var4_7 = var4_7.toString();
                                var3_3 = new DataSourceException((String)var4_7, null, var10_14);
                                throw var3_3;
                            }
                            var13_17 = 0;
                            var14_19 = null;
                            var11_15 = (String)var11_15.get(0);
                            try {
                                var15_21 = Integer.parseInt((String)var11_15);
                            }
                            catch (NumberFormatException v0) {
                                var3_3 = new DataSourceException((String)var7_11, null, var8_12);
                                throw var3_3;
                            }
                        }
                        var5_9 = "android.resource";
                        var14_20 = var4_7.getScheme();
                        var6_10 = TextUtils.equals((CharSequence)var5_9, (CharSequence)var14_20);
                        if (var6_10 == 0) {
                            var5_9 = new StringBuilder("Unsupported URI scheme (");
                            var4_7 = var4_7.getScheme();
                            var5_9.append((String)var4_7);
                            var5_9.append("). Only android.resource is supported.");
                            var4_7 = var5_9.toString();
                            var3_3 = new DataSourceException((String)var4_7, null, var8_12);
                            throw var3_3;
                        }
                        var5_9 = var4_7.getPath();
                        var5_9.getClass();
                        var14_20 = "/";
                        var13_18 = var5_9.startsWith(var14_20);
                        if (var13_18) {
                            var5_9 = var5_9.substring(var9_13);
                        }
                        if (var17_23 = (var14_20 = (var13_18 = TextUtils.isEmpty((CharSequence)(var14_20 = var4_7.getHost()))) != false ? var11_15.getPackageName() : var4_7.getHost()).equals(var16_22 = var11_15.getPackageName())) {
                            var11_15 = var11_15.getResources();
                        } else {
                            try {
                                var11_15 = var11_15.getPackageManager();
                                var11_15 = var11_15.getResourcesForApplication(var14_20);
                            }
                            catch (PackageManager.NameNotFoundException var3_6) {
                                var4_7 = new DataSourceException("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", var3_6, var12_16);
                                throw var4_7;
                            }
                        }
                        var16_22 = "\\d+";
                        var17_23 = var5_9.matches(var16_22);
                        if (var17_23) {
                            try {
                                var6_10 = Integer.parseInt((String)var5_9);
                            }
                            catch (NumberFormatException v1) {
                                var3_3 = new DataSourceException((String)var7_11, null, var8_12);
                                throw var3_3;
                            }
lbl70:
                            // 2 sources

                            while (true) {
                                var15_21 = var6_10;
                                var5_9 = var11_15;
                                break block26;
                                break;
                            }
                        }
                        ** while ((var6_10 = var11_15.getIdentifier((String)(var5_9 = n1.a((String)var14_20, (String)":", (String)var5_9)), (String)(var7_11 = "raw"), null)) != 0)
lbl78:
                        // 1 sources

                        var3_3 = new DataSourceException("Resource not found.", null, var12_16);
                        throw var3_3;
                    }
                    try {
                        var5_9 = var5_9.openRawResourceFd(var15_21);
                        if (var5_9 == null) break block27;
                        var2_2.g = var5_9;
                    }
                    catch (Resources.NotFoundException var4_8) {
                        var3_3 = new DataSourceException(null, var4_8, var12_16);
                        throw var3_3;
                    }
                    var18_24 = var5_9.getLength();
                    var20_25 = var2_2.g.getFileDescriptor();
                    var2_2.h = var7_11 = new FileInputStream(var20_25);
                    var8_12 = 2008;
                    var21_26 = -1;
                    var23_27 = var3_3.f;
                    var25_28 /* !! */  = (long)(var18_24 == var21_26 ? 0 : (var18_24 < var21_26 ? -1 : 1));
                    if (var25_28 /* !! */  != false && (var26_29 /* !! */  = var23_27 == var18_24 ? 0 : (var23_27 < var18_24 ? -1 : 1)) > 0) {
                        try {
                            var3_3 = new DataSourceException(null, null, var8_12);
                            throw var3_3;
                        }
                        catch (IOException var3_4) {
                        }
                        catch (RawResourceDataSource$RawResourceDataSourceException var3_5) {
                            throw var3_5;
                        }
                    }
                    var27_30 = var2_2.g;
                    var28_31 = var27_30.getStartOffset();
                    var30_32 = var28_31 + var23_27;
                    cfr_temp_0 = (var30_32 = var7_11.skip(var30_32) - var28_31) - var23_27;
                    var26_29 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                    if (var26_29 /* !! */  != false) ** GOTO lbl147
                    var23_27 = 0L;
                    if (var25_28 /* !! */  != false) ** GOTO lbl-1000
                    var4_7 = var7_11.getChannel();
                    var32_33 = var4_7.size();
                    cfr_temp_1 = var32_33 - var23_27;
                    var9_13 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var9_13 != 0) break block29;
                    var2_2.i = var21_26;
                    break block28;
                }
                var32_33 = var4_7.size();
                var30_32 = var4_7.position();
                {
                    var2_2.i = var32_33 -= var30_32;
                    var34_34 /* !! */  = (long)(var32_33 == var23_27 ? 0 : (var32_33 < var23_27 ? -1 : 1));
                    if (var34_34 /* !! */  < 0) {
                        var3_3 = new DataSourceException(null, null, var8_12);
                        throw var3_3;
                    }
                    break block28;
                }
lbl-1000:
                // 1 sources

                {
                    var2_2.i = var18_24 -= var30_32;
                }
                var15_21 = (int)(var18_24 == var23_27 ? 0 : (var18_24 < var23_27 ? -1 : 1));
                if (var15_21 < 0) ** GOTO lbl-1000
            }
            var18_24 = var3_3.g;
            var15_21 = (int)(var18_24 == var21_26 ? 0 : (var18_24 < var21_26 ? -1 : 1));
            if (var15_21 != 0) {
                var35_35 = var2_2.i;
                cfr_temp_2 = var35_35 - var21_26;
                var9_13 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                var35_35 = var9_13 == 0 ? var18_24 : Math.min(var35_35, var18_24);
                var2_2.i = var35_35;
            }
            var8_12 = 1;
            var2_2.j = var8_12;
            this.o(var1_1);
            if (var15_21 == 0) return var2_2.i;
            return var18_24;
lbl-1000:
            // 1 sources

            {
                var3_3 = new DataSourceException(var8_12);
                throw var3_3;
lbl147:
                // 1 sources

                var3_3 = new DataSourceException(null, null, var8_12);
                throw var3_3;
            }
            var4_7 = new DataSourceException(null, var3_4, 2000);
            throw var4_7;
        }
        var4_7 = og3_1.a((Uri)var4_7, "Resource is compressed: ");
        var3_3 = new DataSourceException((String)var4_7, null, 2000);
        throw var3_3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        Throwable throwable422222;
        boolean bl2;
        block21: {
            Throwable throwable2222222;
            IOException iOException322222;
            int n3;
            block20: {
                Throwable throwable3222222;
                block19: {
                    bl2 = false;
                    this.f = null;
                    n3 = 2000;
                    FileInputStream fileInputStream = this.h;
                    if (fileInputStream != null) {
                        ((InputStream)fileInputStream).close();
                    }
                    this.h = null;
                    fileInputStream = this.g;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    this.g = null;
                    bl2 = this.j;
                    if (bl2) {
                        this.j = false;
                        this.m();
                    }
                    return;
                    catch (Throwable throwable3222222) {
                        break block19;
                    }
                    catch (IOException iOException2) {}
                    {
                        RawResourceDataSource$RawResourceDataSourceException rawResourceDataSource$RawResourceDataSourceException = new DataSourceException(null, iOException2, n3);
                        throw rawResourceDataSource$RawResourceDataSourceException;
                    }
                }
                this.h = null;
                try {
                    AssetFileDescriptor assetFileDescriptor = this.g;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.g = null;
                }
                catch (Throwable throwable422222) {
                    break block21;
                }
                catch (IOException iOException322222) {}
                bl2 = this.j;
                if (bl2) {
                    this.j = false;
                    this.m();
                }
                throw throwable3222222;
                catch (Throwable throwable2222222) {
                    break block20;
                }
                catch (IOException iOException4) {}
                {
                    RawResourceDataSource$RawResourceDataSourceException rawResourceDataSource$RawResourceDataSourceException = new DataSourceException(null, iOException4, n3);
                    throw rawResourceDataSource$RawResourceDataSourceException;
                }
            }
            this.g = null;
            bl2 = this.j;
            if (bl2) {
                this.j = false;
                this.m();
            }
            throw throwable2222222;
            {
                RawResourceDataSource$RawResourceDataSourceException rawResourceDataSource$RawResourceDataSourceException = new DataSourceException(null, iOException322222, n3);
                throw rawResourceDataSource$RawResourceDataSourceException;
            }
        }
        this.g = null;
        bl2 = this.j;
        if (bl2) {
            this.j = false;
            this.m();
        }
        throw throwable422222;
    }

    public final Uri k() {
        ti0_1 ti0_12 = this.f;
        ti0_12 = ti0_12 != null ? ti0_12.a : null;
        return ti0_12;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int read(byte[] var1_1, int var2_3, int var3_4) {
        block10: {
            if (var3_4 == 0) {
                return 0;
            }
            var4_5 = this.i;
            var6_6 = 0L;
            var8_7 = -1;
            var9_8 /* !! */  = (long)(var4_5 == var6_6 ? 0 : (var4_5 < var6_6 ? -1 : 1));
            if (var9_8 /* !! */  == false) {
                return var8_7;
            }
            var10_9 = 2000;
            var11_10 = -1;
            cfr_temp_0 = var4_5 - var11_10;
            var13_11 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
            if (var13_11 /* !! */  != false) {
                var14_12 = var3_4;
                var4_5 = Math.min(var4_5, var14_12);
                var3_4 = (int)var4_5;
            }
            try {
                var16_13 = this.h;
            }
lbl20:
            // 4 sources

            catch (IOException var1_2) {
                var20_17 = new DataSourceException(null, var1_2, var10_9);
                throw var20_17;
            }
            ** try [egrp 2[TRYBLOCK] [2 : 80->83)] { 
lbl24:
            // 1 sources

            var17_14 = var16_13.read(var1_1 /* !! */ , var2_3, var3_4);
            if (var17_14 != var8_7) break block10;
            var18_15 = this.i;
            cfr_temp_1 = var18_15 - var11_10;
            var3_4 = (int)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var3_4 == 0) {
                return var8_7;
            }
            var1_1 /* !! */  = (byte[])new RawResourceDataSource$RawResourceDataSourceException;
            var20_16 = new EOFException();
            var1_1 /* !! */ ("End of stream reached having not read sufficient data.", var20_16, var10_9);
            throw var1_1 /* !! */ ;
        }
        var21_18 = this.i;
        cfr_temp_2 = var21_18 - var11_10;
        var23_19 /* !! */  = (long)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
        if (var23_19 /* !! */  != false) {
            var4_5 = var17_14;
            this.i = var21_18 -= var4_5;
        }
        this.l(var17_14);
        return var17_14;
    }
}

