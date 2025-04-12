/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzfyh;
import com.google.android.gms.internal.ads.zzgbf;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzhn;
import com.google.android.gms.internal.ads.zzho;
import com.google.android.gms.internal.ads.zzhv;
import com.google.android.gms.internal.ads.zzhy;
import com.google.android.gms.internal.ads.zzhz;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public final class zzhp
extends zzgv
implements zzhz {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhy zzf;
    private final zzhy zzg;
    private zzhh zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    public zzhp() {
        int n3 = 8000;
        this(null, n3, n3, false, null, null, false);
    }

    private zzhp(String object, int n3, int n4, boolean bl2, zzhy zzhy2, zzfyh zzfyh2, boolean bl3) {
        super(true);
        this.zze = object;
        this.zzc = n3;
        this.zzd = n4;
        this.zzb = bl2;
        this.zzf = zzhy2;
        this.zzg = object = new zzhy();
    }

    public /* synthetic */ zzhp(String string2, int n3, int n4, boolean bl2, zzhy zzhy2, zzfyh zzfyh2, boolean bl3, zzho zzho2) {
        this(string2, n3, n4, bl2, zzhy2, null, false);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private final HttpURLConnection zzk(URL var1_1, int var2_2, byte[] var3_3, long var4_4, long var6_5, boolean var8_6, boolean var9_7, Map var10_8) {
        var1_1 = (HttpURLConnection)var1_1.openConnection();
        var2_2 = this.zzc;
        var1_1.setConnectTimeout(var2_2);
        var2_2 = this.zzd;
        var1_1.setReadTimeout(var2_2);
        var11_9 = new HashMap();
        var3_3 = this.zzf;
        if (var3_3 != null) {
            var3_3 = var3_3.zza();
            var11_9.putAll(var3_3);
        }
        var3_3 = this.zzg.zza();
        var11_9.putAll(var3_3);
        var11_9.putAll(var10_8);
        var11_9 = var11_9.entrySet().iterator();
        while (var12_10 /* !! */  = var11_9.hasNext()) {
            var3_3 = (Map.Entry)var11_9.next();
            var10_8 = (String)var3_3.getKey();
            var3_3 = (String)var3_3.getValue();
            var1_1.setRequestProperty((String)var10_8, (String)var3_3);
        }
        var13_11 = 0L;
        var15_12 = -1;
        var17_13 /* !! */  = (long)(var4_4 == var13_11 ? 0 : (var4_4 < var13_11 ? -1 : 1));
        if (var17_13 /* !! */  != false) ** GOTO lbl31
        var18_14 /* !! */  = (long)(var6_5 == var15_12 ? 0 : (var6_5 < var15_12 ? -1 : 1));
        if (var18_14 /* !! */  == false) {
            var2_2 = 0;
            var11_9 = null;
        } else {
            var4_4 = var13_11;
lbl31:
            // 2 sources

            var3_3 = "-";
            var11_9 = D70.c(var4_4, "bytes=", (String)var3_3);
            var12_10 /* !! */  = var6_5 == var15_12 ? 0 : (var6_5 < var15_12 ? -1 : 1);
            if (var12_10 /* !! */ ) {
                var4_4 = var4_4 + var6_5 + var15_12;
                var11_9.append(var4_4);
            }
            var11_9 = var11_9.toString();
        }
        if (var11_9 != null) {
            var3_3 = "Range";
            var1_1.setRequestProperty((String)var3_3, (String)var11_9);
        }
        if ((var11_9 = this.zze) != null) {
            var3_3 = "User-Agent";
            var1_1.setRequestProperty((String)var3_3, (String)var11_9);
        }
        var11_9 = (var2_2 = 1) != var8_6 ? "identity" : "gzip";
        var1_1.setRequestProperty("Accept-Encoding", (String)var11_9);
        var1_1.setInstanceFollowRedirects(var9_7);
        var1_1.setDoOutput(false);
        var2_2 = zzhh.zzh;
        var1_1.setRequestMethod("GET");
        var1_1.connect();
        return var1_1;
    }

    private final URL zzl(URL object, String object2, zzhh zzhh2) {
        int n3 = 1;
        int n4 = 2001;
        if (object2 != null) {
            boolean bl2;
            String string2;
            Serializable serializable;
            block5: {
                try {
                    serializable = new URL((URL)object, (String)object2);
                    object2 = serializable.getProtocol();
                    string2 = "https";
                    bl2 = string2.equals(object2);
                    if (bl2 || (bl2 = (string2 = "http").equals(object2))) break block5;
                }
                catch (MalformedURLException malformedURLException) {
                    object2 = new zzhv(malformedURLException, zzhh2, n4, n3);
                    throw object2;
                }
                object = String.valueOf(object2);
                object = "Unsupported protocol redirect: ".concat((String)object);
                object2 = new zzhv((String)object, zzhh2, n4, n3);
                throw object2;
            }
            bl2 = this.zzb;
            if (!bl2 && !(bl2 = ((String)object2).equals(string2 = ((URL)object).getProtocol()))) {
                object = ((URL)object).getProtocol();
                object = uc0_0.a("Disallowed cross-protocol redirect (", (String)object, " to ", (String)object2, ")");
                serializable = new zzhv((String)object, zzhh2, n4, n3);
                throw serializable;
            }
            return serializable;
        }
        object = new zzhv("Null location redirect", zzhh2, n4, n3);
        throw object;
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            }
            catch (Exception exception) {
                String string2 = "DefaultHttpDataSource";
                String string3 = "Unexpected error while disconnecting";
                zzfk.zzd(string2, string3, exception);
            }
            httpURLConnection = null;
            this.zzi = null;
        }
    }

    /*
     * Exception decompiling
     */
    public final int zza(byte[] var1_1, int var2_3, int var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 3[TRYBLOCK] [3 : 95->99)] java.io.IOException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public final long zzb(zzhh var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [10 : 208->212)] java.io.IOException
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse((String)httpURLConnection.getURL().toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd() {
        Throwable throwable2;
        boolean bl2;
        block9: {
            block7: {
                Object object;
                InputStream inputStream;
                block8: {
                    bl2 = false;
                    try {
                        inputStream = this.zzj;
                        if (inputStream == null) break block7;
                        object = this.zzi;
                        if (object == null) break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                }
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {
                    zzhh zzhh2 = this.zzh;
                    int n3 = zzgd.zza;
                    n3 = 2000;
                    int n4 = 3;
                    object = new zzhv(iOException, zzhh2, n3, n4);
                    throw object;
                }
            }
            this.zzj = null;
            this.zzm();
            bl2 = this.zzk;
            if (bl2) {
                this.zzk = false;
                this.zzh();
            }
            return;
        }
        this.zzj = null;
        this.zzm();
        bl2 = this.zzk;
        if (bl2) {
            this.zzk = false;
            this.zzh();
        }
        throw throwable2;
    }

    public final Map zze() {
        Object object = this.zzi;
        if (object == null) {
            return zzgbf.zzd();
        }
        object = ((URLConnection)object).getHeaderFields();
        zzhn zzhn2 = new zzhn((Map)object);
        return zzhn2;
    }
}

