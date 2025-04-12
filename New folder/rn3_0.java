/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Objects;

/*
 * Renamed from rn3
 */
public final class rn3_0
implements ei0_0 {
    public final Uri a;
    public final un3_0 b;
    public InputStream c;

    public rn3_0(Uri uri, un3_0 un3_02) {
        this.a = uri;
        this.b = un3_02;
    }

    public static rn3_0 c(Context object, Uri uri, sn3 sn32) {
        Kp kp = com.bumptech.glide.a.a((Context)object).e;
        ArrayList arrayList = com.bumptech.glide.a.a((Context)object).d.b().f();
        object = object.getContentResolver();
        kp = (SC1)kp;
        un3_0 un3_02 = new un3_0(arrayList, sn32, (SC1)kp, (ContentResolver)object);
        object = new rn3_0(uri, un3_02);
        return object;
    }

    public final Class a() {
        return InputStream.class;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b() {
        InputStream inputStream = this.c;
        if (inputStream == null) return;
        try {
            inputStream.close();
            return;
        }
        catch (IOException iOException) {
            return;
        }
    }

    public final void cancel() {
    }

    public final void d(Az2 object, ei0$a ei0$a) {
        object = this.f();
        this.c = object;
        try {
            ei0$a.f(object);
        }
        catch (FileNotFoundException fileNotFoundException) {
            String string2 = "MediaStoreThumbFetcher";
            int n3 = 3;
            Log.isLoggable((String)string2, (int)n3);
            ei0$a.c(fileNotFoundException);
        }
    }

    public final pi0_0 e() {
        return pi0_0.LOCAL;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final InputStream f() {
        var1_1 = "ThumbStreamOpener";
        var2_7 /* !! */  = this.a;
        var3_8 = this.b;
        var3_8.getClass();
        var4_9 = 3;
        var5_10 = null;
        var6_11 = var3_8.a;
        var6_11 = var6_11.a(var2_7 /* !! */ );
        if (var6_11 == null) ** GOTO lbl85
        ** try [egrp 1[TRYBLOCK] [5, 4 : 45->73)] { 
lbl13:
        // 1 sources

        ** GOTO lbl17
lbl-1000:
        // 1 sources

        {
            block31: {
                catch (Throwable var1_2) {
                    var5_10 = var6_11;
                }
lbl17:
                // 1 sources

                var7_12 = var6_11.moveToFirst();
                if (var7_12 == 0) break block31;
                var7_12 = 0;
                var8_13 = null;
                var8_13 = var6_11.getString(0);
                var6_11.close();
lbl23:
                // 2 sources

                while (true) {
                    block28: {
                        block30: {
                            block29: {
                                var9_14 = TextUtils.isEmpty(var8_13);
                                var10_15 /* !! */  = var3_8.c;
                                if (!var9_14 && (var7_12 = (int)(var6_11 = new File(var8_13)).exists()) != 0 && (var7_12 = (int)((cfr_temp_0 = (var13_17 = 0L) - (var11_16 = var6_11.length())) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) < 0) {
                                    var6_11 = Uri.fromFile((File)var6_11);
                                    try {
                                        var6_11 = var10_15 /* !! */ .openInputStream((Uri)var6_11);
                                    }
                                    catch (NullPointerException var1_4) {
                                        var15_18 = new StringBuilder("NPE opening uri: ");
                                        var15_18.append(var2_7 /* !! */ );
                                        var15_18.append(" -> ");
                                        var15_18.append(var6_11);
                                        var2_7 /* !! */  = var15_18.toString();
                                        var3_8 = new FileNotFoundException((String)var2_7 /* !! */ );
                                        throw (FileNotFoundException)var3_8.initCause(var1_4);
                                    }
                                } else {
                                    var9_14 = false;
                                    var6_11 = null;
                                }
                                var7_12 = -1;
                                if (var6_11 == null) break block30;
                                var5_10 = var10_15 /* !! */ .openInputStream(var2_7 /* !! */ );
                                var10_15 /* !! */  = var3_8.d;
                                var3_8 = var3_8.b;
                                var10_15 /* !! */  = (ArrayList)var10_15 /* !! */ ;
                                var16_19 = com.bumptech.glide.load.a.a((ArrayList)var10_15 /* !! */ , (InputStream)var5_10, (Kp)var3_8);
                                if (var5_10 == null) break block28;
                                {
                                    catch (Throwable var1_5) {
                                        break block29;
                                    }
                                    catch (IOException | NullPointerException v0) {}
                                    {
                                        var16_19 = (int)Log.isLoggable((String)var1_1, (int)var4_9);
                                        if (var16_19 != 0) {
                                            Objects.toString(var2_7 /* !! */ );
                                        }
                                        ** if (var5_10 == null) goto lbl-1000
                                    }
lbl-1000:
                                    // 1 sources

                                    {
                                        try {
                                            var5_10.close();
                                        }
                                        catch (IOException v1) {}
                                    }
lbl-1000:
                                    // 2 sources

                                    {
                                        break block30;
                                    }
                                }
                                try {
                                    var5_10.close();
                                }
                                catch (IOException v2) {}
                                break block28;
                            }
                            if (var5_10 == null) throw var1_5;
                            try {
                                var5_10.close();
                                throw var1_5;
                            }
                            catch (IOException v3) {
                                throw var1_5;
                            }
                        }
                        var16_19 = -1;
                    }
                    if (var16_19 == var7_12) return var6_11;
                    var2_7 /* !! */  = new zE0((InputStream)var6_11, var16_19);
                    return var2_7 /* !! */ ;
                }
            }
            if (var6_11 == null) ** GOTO lbl89
lbl87:
            // 2 sources

            while (true) {
                var6_11.close();
lbl89:
                // 3 sources

                while (true) {
                    var7_12 = 0;
                    var8_13 = null;
                    ** continue;
                    break;
                }
                break;
            }
            catch (Throwable var1_3) {
            }
            catch (SecurityException v4) {}
            var9_14 = false;
            var6_11 = null;
lbl-1000:
            // 2 sources

            {
                while (true) {
                    var7_12 = Log.isLoggable((String)var1_1, (int)var4_9);
                    if (var7_12 != 0) {
                        Objects.toString(var2_7 /* !! */ );
                    }
                    if (var6_11 == null) ** continue;
                    ** continue;
                    break;
                }
            }
        }
lbl105:
        // 1 sources

        catch (SecurityException v5) {
            ** continue;
        }
        if (var5_10 == null) throw var1_6;
        var5_10.close();
        throw var1_6;
    }
}

