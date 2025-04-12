/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgv;
import com.google.android.gms.internal.ads.zzhh;
import com.google.android.gms.internal.ads.zzhv;
import com.google.android.gms.internal.ads.zzhy;
import com.google.android.gms.internal.ads.zzhz;
import com.google.android.gms.internal.ads.zzie;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

final class zzcga
extends zzgv
implements zzhz {
    private static final Pattern zzb;
    private static final AtomicReference zzc;
    private final SSLSocketFactory zzd;
    private final int zze;
    private final int zzf;
    private final String zzg;
    private final zzhy zzh;
    private zzhh zzi;
    private HttpURLConnection zzj;
    private InputStream zzk;
    private boolean zzl;
    private int zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private final Set zzs;

    static {
        AtomicReference atomicReference;
        zzb = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
        zzc = atomicReference = new AtomicReference();
    }

    public zzcga(String object, zzie zzie2, int n3, int n4, int n7) {
        boolean bl2 = true;
        super(bl2);
        HashSet hashSet = new HashSet(this);
        this.zzd = hashSet;
        this.zzs = hashSet = new HashSet();
        zzeq.zzc((String)object);
        this.zzg = object;
        this.zzh = object = new zzhy();
        this.zze = n3;
        this.zzf = n4;
        this.zzr = n7;
        if (zzie2 != null) {
            this.zzf(zzie2);
        }
    }

    public static /* bridge */ /* synthetic */ int zzk(zzcga zzcga2) {
        return zzcga2.zzr;
    }

    public static /* bridge */ /* synthetic */ void zzl(zzcga zzcga2, Socket socket) {
        zzcga2.zzs.add(socket);
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            }
            catch (Exception exception) {
                String string2 = "Unexpected error while disconnecting";
                com.google.android.gms.ads.internal.util.client.zzm.zzh(string2, exception);
            }
            httpURLConnection = null;
            this.zzj = null;
        }
    }

    /*
     * Exception decompiling
     */
    public final int zza(byte[] var1_1, int var2_3, int var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [6 : 82->86)] java.io.IOException
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
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 11[TRYBLOCK] [12 : 161->165)] java.io.IOException
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
        HttpURLConnection httpURLConnection = this.zzj;
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
        Throwable throwable22;
        boolean bl2;
        block7: {
            InputStream inputStream;
            bl2 = false;
            try {
                inputStream = this.zzk;
                if (inputStream == null) break block7;
            }
            catch (Throwable throwable22) {}
            try {
                inputStream.close();
            }
            catch (IOException iOException) {
                zzhh zzhh2 = this.zzi;
                int n3 = 2000;
                int n4 = 3;
                zzhv zzhv2 = new zzhv(iOException, zzhh2, n3, n4);
                throw zzhv2;
            }
        }
        this.zzk = null;
        this.zzn();
        bl2 = this.zzl;
        if (bl2) {
            this.zzl = false;
            this.zzh();
        }
        this.zzs.clear();
        return;
        this.zzk = null;
        this.zzn();
        bl2 = this.zzl;
        if (bl2) {
            this.zzl = false;
            this.zzh();
        }
        this.zzs.clear();
        throw throwable22;
    }

    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzj;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int n3) {
        boolean bl2;
        this.zzr = n3;
        Iterator iterator = this.zzs.iterator();
        while (bl2 = iterator.hasNext()) {
            Socket socket = (Socket)iterator.next();
            int n4 = socket.isClosed();
            if (n4 != 0) continue;
            n4 = this.zzr;
            try {
                socket.setReceiveBufferSize(n4);
            }
            catch (SocketException socketException) {
                String string2 = "Failed to update receive buffer size.";
                com.google.android.gms.ads.internal.util.client.zzm.zzk(string2, socketException);
            }
        }
    }
}

