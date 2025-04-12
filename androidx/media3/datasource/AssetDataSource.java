/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.net.Uri
 */
package androidx.media3.datasource;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.media3.datasource.AssetDataSource$AssetDataSourceException;
import androidx.media3.datasource.DataSourceException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class AssetDataSource
extends Yv {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long h;
    public boolean i;

    public AssetDataSource(Context context) {
        super(false);
        context = context.getAssets();
        this.e = context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(ti0_1 object) {
        Object object2;
        try {
            object2 = ((ti0_1)object).a;
            long l2 = ((ti0_1)object).f;
            this.f = object2;
            object2 = object2.getPath();
            object2.getClass();
            String string2 = "/android_asset/";
            int n3 = ((String)object2).startsWith(string2);
            int n4 = 1;
            if (n3 != 0) {
                n3 = 15;
                object2 = ((String)object2).substring(n3);
            } else {
                string2 = "/";
                n3 = (int)(((String)object2).startsWith(string2) ? 1 : 0);
                if (n3 != 0) {
                    object2 = ((String)object2).substring(n4);
                }
            }
            this.n((ti0_1)object);
            string2 = this.e;
            this.g = object2 = string2.open((String)object2, n4);
            long l3 = ((InputStream)object2).skip(l2);
            long l4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
            if (l4 >= 0) {
                long l7 = ((ti0_1)object).g;
                long l8 = -1;
                long l12 = l7 - l8;
                Object object3 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                if (object3 != false) {
                    this.h = l7;
                } else {
                    object2 = this.g;
                    l4 = ((InputStream)object2).available();
                    this.h = l7 = (long)l4;
                    l3 = Integer.MAX_VALUE;
                    long l14 = l7 - l3;
                    Object object4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
                    if (object4 == false) {
                        this.h = l8;
                    }
                }
                this.i = n4;
                this.o((ti0_1)object);
                return this.h;
            }
            l4 = 0;
            object2 = null;
            int n7 = 2008;
            object = new DataSourceException(null, n7);
            throw object;
        }
        catch (IOException iOException) {
        }
        catch (AssetDataSource$AssetDataSourceException assetDataSource$AssetDataSourceException) {
            throw assetDataSource$AssetDataSourceException;
        }
        int n8 = iOException instanceof FileNotFoundException;
        n8 = n8 != 0 ? 2005 : 2000;
        object2 = new DataSourceException(iOException, n8);
        throw object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void close() {
        Throwable throwable2;
        boolean bl2;
        block7: {
            bl2 = false;
            this.f = null;
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
            }
            catch (Throwable throwable2) {
                break block7;
            }
            catch (IOException iOException) {}
            bl2 = this.i;
            if (bl2) {
                this.i = false;
                this.m();
            }
            return;
            {
                int n3 = 2000;
                AssetDataSource$AssetDataSourceException assetDataSource$AssetDataSourceException = new DataSourceException(iOException, n3);
                throw assetDataSource$AssetDataSourceException;
            }
        }
        this.g = null;
        bl2 = this.i;
        if (bl2) {
            this.i = false;
            this.m();
        }
        throw throwable2;
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
            var4_5 = this.h;
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
                var12_10 = this.g;
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
            var14_12 = this.h;
            cfr_temp_1 = var14_12 - var6_6;
            var16_13 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
            if (var16_13 /* !! */  == false) break block9;
            var4_5 = var13_11;
            this.h = var14_12 -= var4_5;
        }
        this.l(var13_11);
        return var13_11;
    }
}

