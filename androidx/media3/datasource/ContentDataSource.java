/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.AssetFileDescriptor
 *  android.net.Uri
 *  android.os.Bundle
 */
package androidx.media3.datasource;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.media3.datasource.ContentDataSource$ContentDataSourceException;
import androidx.media3.datasource.DataSourceException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class ContentDataSource
extends Yv {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public ContentDataSource(Context context) {
        super(false);
        context = context.getContentResolver();
        this.e = context;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(ti0_1 var1_1) {
        block14: {
            block16: {
                block15: {
                    block17: {
                        block13: {
                            var2_2 = this;
                            var3_3 = var1_1;
                            var4_6 = "Could not open file descriptor for: ";
                            var5_7 = 2000;
                            try {
                                var6_8 /* !! */  = var1_1.a;
                                this.f = var6_8 /* !! */  = var6_8 /* !! */ .normalizeScheme();
                                this.n(var1_1);
                                var7_9 = "content";
                                var8_10 = var6_8 /* !! */ .getScheme();
                                var9_11 = var7_9.equals(var8_10);
                                var8_10 = this.e;
                                var10_12 = true;
                                if (!var9_11) break block13;
                            }
                            catch (IOException var3_4) {
                                break block14;
                            }
                            catch (ContentDataSource$ContentDataSourceException var3_5) {
                                throw var3_5;
                            }
                            var7_9 = new Bundle();
                            var11_13 = "android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT";
                            var7_9.putBoolean(var11_13, var10_12);
                            var11_13 = "*/*";
                            var7_9 = var8_10.openTypedAssetFileDescriptor(var6_8 /* !! */ , var11_13, (Bundle)var7_9);
                            break block17;
                        }
                        var7_9 = "r";
                        var7_9 = var8_10.openAssetFileDescriptor(var6_8 /* !! */ , (String)var7_9);
                    }
                    var2_2.g = var7_9;
                    if (var7_9 == null) ** GOTO lbl88
                    var12_15 = var7_9.getLength();
                    var6_8 /* !! */  = var7_9.getFileDescriptor();
                    var2_2.h = var4_6 = new FileInputStream((FileDescriptor)var6_8 /* !! */ );
                    var14_14 = 2008;
                    var8_10 = null;
                    var15_16 = -1;
                    var17_17 = var3_3.f;
                    var19_18 /* !! */  = (long)(var12_15 == var15_16 ? 0 : (var12_15 < var15_16 ? -1 : 1));
                    if (var19_18 /* !! */  == false || (var20_19 = var17_17 == var12_15 ? 0 : (var17_17 < var12_15 ? -1 : 1)) <= 0) ** GOTO lbl43
                    {
                        var3_3 = new DataSourceException(null, var14_14);
                        throw var3_3;
lbl43:
                        // 1 sources

                        var21_20 = var7_9.getStartOffset();
                        var23_21 = var12_15;
                        var25_22 = var21_20 + var17_17;
                        cfr_temp_0 = (var25_22 = var4_6.skip(var25_22) - var21_20) - var17_17;
                        var27_23 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var27_23 /* !! */  != false) ** GOTO lbl86
                        var17_17 = 0L;
                        if (var19_18 /* !! */  != false) break block15;
                    }
                    {
                        var25_22 = (var4_6 = var4_6.getChannel()).size();
                        cfr_temp_1 = var25_22 - var17_17;
                        var27_23 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                        if (var27_23 /* !! */  == false) {
                            var2_2.i = var15_16;
                            break block16;
                        }
                        var28_24 = var4_6.position();
                    }
                    {
                        var2_2.i = var25_22 -= var28_24;
                        var30_25 /* !! */  = (long)(var25_22 == var17_17 ? 0 : (var25_22 < var17_17 ? -1 : 1));
                        if (var30_25 /* !! */  < 0) {
                            var3_3 = new DataSourceException(null, var14_14);
                            throw var3_3;
                        }
                        break block16;
                    }
                }
                var12_15 = var23_21 - var25_22;
                {
                    var2_2.i = var12_15;
                    var30_26 /* !! */  = (long)(var12_15 == var17_17 ? 0 : (var12_15 < var17_17 ? -1 : 1));
                    if (var30_26 /* !! */  < 0) ** GOTO lbl-1000
                }
            }
            var31_27 = var3_3.g;
            var14_14 = (int)(var31_27 == var15_16 ? 0 : (var31_27 < var15_16 ? -1 : 1));
            if (var14_14 != 0) {
                var33_28 = var2_2.i;
                cfr_temp_2 = var33_28 - var15_16;
                var14_14 = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                var33_28 = var14_14 == 0 ? var31_27 : Math.min(var33_28, var31_27);
                var2_2.i = var33_28;
            }
            var14_14 = 1;
            var2_2.j = var14_14;
            this.o(var1_1);
            var35_29 = var31_27 == var15_16 ? 0 : (var31_27 < var15_16 ? -1 : 1);
            if (var35_29 == false) return var2_2.i;
            return var31_27;
lbl-1000:
            // 1 sources

            {
                var3_3 = new DataSourceException(null, var14_14);
                throw var3_3;
lbl86:
                // 1 sources

                var3_3 = new DataSourceException(null, var14_14);
                throw var3_3;
lbl88:
                // 1 sources

                var8_10 = new StringBuilder((String)var4_6);
                var8_10.append(var6_8 /* !! */ );
                var4_6 = var8_10.toString();
                var7_9 = new IOException((String)var4_6);
                var3_3 = new DataSourceException((Throwable)var7_9, var5_7);
                throw var3_3;
            }
        }
        var14_14 = var3_4 instanceof FileNotFoundException;
        if (var14_14 != 0) {
            var5_7 = 2005;
        }
        var4_6 = new DataSourceException(var3_4, var5_7);
        throw var4_6;
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
                        fileInputStream.close();
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
                        ContentDataSource$ContentDataSourceException contentDataSource$ContentDataSourceException = new DataSourceException(iOException2, n3);
                        throw contentDataSource$ContentDataSourceException;
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
                    ContentDataSource$ContentDataSourceException contentDataSource$ContentDataSourceException = new DataSourceException(iOException4, n3);
                    throw contentDataSource$ContentDataSourceException;
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
                ContentDataSource$ContentDataSourceException contentDataSource$ContentDataSourceException = new DataSourceException(iOException322222, n3);
                throw contentDataSource$ContentDataSourceException;
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
        return this.f;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int read(byte[] var1_1, int var2_3, int var3_4) {
        block9: {
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
            var6_6 = -1;
            cfr_temp_0 = var4_5 - var6_6;
            var9_8 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
            if (var9_8 /* !! */  != false) {
                var10_9 = var3_4;
                var4_5 = Math.min(var4_5, var10_9);
                var3_4 = (int)var4_5;
            }
            try {
                var12_10 = this.h;
            }
lbl19:
            // 4 sources

            catch (IOException var1_2) {
                var17_14 = new DataSourceException(var1_2, 2000);
                throw var17_14;
            }
            ** try [egrp 2[TRYBLOCK] [2 : 75->78)] { 
lbl23:
            // 1 sources

            var13_11 = var12_10.read(var1_1, var2_3, var3_4);
            if (var13_11 == var8_7) {
                return var8_7;
            }
            var14_12 = this.i;
            cfr_temp_1 = var14_12 - var6_6;
            var16_13 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var16_13 /* !! */  == false) break block9;
            var4_5 = var13_11;
            this.i = var14_12 -= var4_5;
        }
        this.l(var13_11);
        return var13_11;
    }
}

