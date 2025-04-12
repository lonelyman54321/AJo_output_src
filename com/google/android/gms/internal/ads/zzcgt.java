/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzcgr;
import com.google.android.gms.internal.ads.zzcgs;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzhv;
import com.google.android.gms.internal.ads.zzhy;
import com.google.android.gms.internal.ads.zzhz;
import com.google.android.gms.internal.ads.zzie;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Queue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class zzcgt
extends zzgv
implements zzhz {
    private static final Pattern zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzhy zzf;
    private zzhh zzg;
    private HttpURLConnection zzh;
    private final Queue zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private final long zzr;
    private final long zzs;

    public zzcgt(String arrayDeque, zzie zzie2, int n3, int n4, long l2, long l3) {
        boolean bl2 = true;
        super(bl2);
        zzeq.zzc((String)((Object)arrayDeque));
        this.zze = arrayDeque;
        arrayDeque = new ArrayDeque();
        this.zzf = arrayDeque;
        this.zzc = n3;
        this.zzd = n4;
        this.zzi = arrayDeque = new ArrayDeque();
        this.zzr = l2;
        this.zzs = l3;
        if (zzie2 != null) {
            this.zzf(zzie2);
        }
    }

    private final void zzl() {
        Object object;
        boolean bl2;
        while (!(bl2 = (object = this.zzi).isEmpty())) {
            object = (HttpURLConnection)this.zzi.remove();
            try {
                ((HttpURLConnection)object).disconnect();
            }
            catch (Exception exception) {
                String string2 = "Unexpected error while disconnecting";
                com.google.android.gms.ads.internal.util.client.zzm.zzh(string2, exception);
            }
        }
        this.zzh = null;
    }

    /*
     * Exception decompiling
     */
    public final int zza(byte[] var1_1, int var2_2, int var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [11 : 242->247)] java.io.IOException
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

    public final long zzb(zzhh zzhh2) {
        long l2;
        this.zzg = zzhh2;
        this.zzn = 0L;
        long l3 = zzhh2.zze;
        long l4 = zzhh2.zzf;
        long l7 = -1;
        long l8 = l4 - l7;
        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object == false) {
            l4 = this.zzr;
        } else {
            l2 = this.zzr;
            l4 = Math.min(l2, l4);
        }
        l2 = (l4 += l3) + l7;
        this.zzo = l3;
        int n3 = 1;
        Object object2 = this;
        Object object3 = this.zzk(l3, l2, n3);
        this.zzh = object3;
        Object object4 = "Content-Range";
        object3 = ((URLConnection)object3).getHeaderField((String)object4);
        boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
        if (!bl2 && (object = (Object)((Matcher)(object4 = zzb.matcher((CharSequence)object3))).find()) != false) {
            object = 1;
            String string2 = ((Matcher)object4).group((int)object);
            Long.parseLong(string2);
            int n4 = 2;
            string2 = ((Matcher)object4).group(n4);
            l3 = Long.parseLong(string2);
            int n7 = 3;
            object4 = ((Matcher)object4).group(n7);
            try {
                l4 = Long.parseLong((String)object4);
            }
            catch (NumberFormatException numberFormatException) {
                object4 = new StringBuilder("Unexpected Content-Range [");
                ((StringBuilder)object4).append((String)object3);
                object2 = "]";
                ((StringBuilder)object4).append((String)object2);
                object4 = ((StringBuilder)object4).toString();
                com.google.android.gms.ads.internal.util.client.zzm.zzg((String)object4);
            }
            l2 = zzhh2.zzf;
            n3 = (int)(l2 == l7 ? 0 : (l2 < l7 ? -1 : 1));
            if (n3 != 0) {
                this.zzm = l2;
                l4 = this.zzo + l2 + l7;
                this.zzp = l4 = Math.max(l3, l4);
            } else {
                l2 = this.zzo;
                this.zzm = l2 = l4 - l2;
                this.zzp = l4 += l7;
            }
            this.zzq = l3;
            this.zzk = object;
            this.zzj(zzhh2);
            return this.zzm;
        }
        object4 = new zzcgr((String)object3, zzhh2);
        throw object4;
    }

    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzh;
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
        block7: {
            block6: {
                bl2 = false;
                try {
                    InputStream inputStream = this.zzj;
                    if (inputStream == null) break block6;
                    try {
                        inputStream.close();
                    }
                    catch (IOException iOException) {
                        zzhh zzhh2 = this.zzg;
                        int n3 = 2000;
                        int n4 = 3;
                        zzhv zzhv2 = new zzhv(iOException, zzhh2, n3, n4);
                        throw zzhv2;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
            }
            this.zzj = null;
            this.zzl();
            bl2 = this.zzk;
            if (bl2) {
                this.zzk = false;
                this.zzh();
            }
            return;
        }
        this.zzj = null;
        this.zzl();
        bl2 = this.zzk;
        if (bl2) {
            this.zzk = false;
            this.zzh();
        }
        throw throwable2;
    }

    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzh;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final HttpURLConnection zzk(long l2, long l3, int n3) {
        zzhv zzhv2;
        IOException iOException;
        Object object;
        String string2;
        block7: {
            Object object2;
            Object object3;
            Object object4;
            block8: {
                IOException iOException22;
                block10: {
                    block9: {
                        Object object5;
                        Object object6;
                        string2 = "Unable to connect to ";
                        object = this.zzg.zza.toString();
                        try {
                            boolean bl2;
                            object4 = new URL((String)object);
                            object4 = ((URL)object4).openConnection();
                            object4 = (HttpURLConnection)object4;
                            int n4 = this.zzc;
                            ((URLConnection)object4).setConnectTimeout(n4);
                            n4 = this.zzd;
                            ((URLConnection)object4).setReadTimeout(n4);
                            object6 = this.zzf;
                            object6 = ((zzhy)object6).zza();
                            object6 = object6.entrySet();
                            object6 = object6.iterator();
                            while (bl2 = object6.hasNext()) {
                                object5 = object6.next();
                                object5 = (Map.Entry)object5;
                                Object object7 = object5.getKey();
                                object7 = (String)object7;
                                object5 = object5.getValue();
                                object5 = (String)object5;
                                ((URLConnection)object4).setRequestProperty((String)object7, (String)object5);
                            }
                        }
                        catch (IOException iOException3) {
                            iOException = iOException3;
                            break block7;
                        }
                        object6 = new StringBuilder();
                        object5 = "bytes=";
                        ((StringBuilder)object6).append((String)object5);
                        ((StringBuilder)object6).append(l2);
                        object3 = "-";
                        ((StringBuilder)object6).append((String)object3);
                        ((StringBuilder)object6).append(l3);
                        object3 = ((StringBuilder)object6).toString();
                        object2 = "Range";
                        ((URLConnection)object4).setRequestProperty((String)object2, (String)object3);
                        object3 = "User-Agent";
                        object2 = this.zze;
                        ((URLConnection)object4).setRequestProperty((String)object3, (String)object2);
                        object3 = "Accept-Encoding";
                        object2 = "identity";
                        ((URLConnection)object4).setRequestProperty((String)object3, (String)object2);
                        object3 = "GET";
                        ((HttpURLConnection)object4).setRequestMethod((String)object3);
                        ((URLConnection)object4).connect();
                        object3 = this.zzi;
                        object3.add(object4);
                        object3 = this.zzg.zza.toString();
                        try {
                            int n7;
                            this.zzl = n7 = ((HttpURLConnection)object4).getResponseCode();
                            int n8 = 200;
                            if (n7 < n8 || n7 > (n8 = 299)) break block8;
                        }
                        catch (IOException iOException4) {
                            this.zzl();
                            object3 = String.valueOf(object3);
                            object5 = this.zzg;
                            object4 = string2.concat((String)object3);
                            object = object2;
                            object2 = new zzhv((String)object4, iOException4, (zzhh)object5, 2000, n3);
                            throw object2;
                        }
                        try {
                            object3 = ((URLConnection)object4).getInputStream();
                            object2 = this.zzj;
                            if (object2 == null) break block9;
                            InputStream inputStream = this.zzj;
                            object3 = object2 = new SequenceInputStream(inputStream, (InputStream)object3);
                        }
                        catch (IOException iOException22) {
                            break block10;
                        }
                    }
                    this.zzj = object3;
                    return object4;
                }
                this.zzl();
                zzhh zzhh2 = this.zzg;
                object2 = new zzhv(iOException22, zzhh2, 2000, n3);
                throw object2;
            }
            object3 = ((URLConnection)object4).getHeaderFields();
            this.zzl();
            int n10 = this.zzl;
            zzhh zzhh3 = this.zzg;
            object2 = new zzcgs(n10, (Map)object3, zzhh3, n3);
            throw object2;
        }
        String string3 = String.valueOf(object);
        zzhh zzhh4 = this.zzg;
        String string4 = string2.concat(string3);
        zzhv zzhv3 = zzhv2;
        zzhv2 = new zzhv(string4, iOException, zzhh4, 2000, n3);
        throw zzhv2;
    }
}

