/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Looper
 */
package com.jio.jioads.utils;

import android.content.Context;
import android.os.Looper;
import com.jio.jioads.adinterfaces.JioAds$MediaType;
import com.jio.jioads.utils.f;
import com.jio.jioads.utils.j;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

public final class l {
    public final Context a;
    public final Map b;
    public final String c;
    public final JioAds$MediaType d;
    public final boolean e;
    public final String f;
    public final String g;
    public final f h;
    public final Integer i;
    public boolean j;
    public ExecutorService k;

    public l(Context context, HashMap hashMap, String string2, JioAds$MediaType jioAds$MediaType, boolean bl2, String string3, String string4, f f5, Integer n3) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        Intrinsics.checkNotNullParameter(hashMap, "mFileUrls");
        Intrinsics.checkNotNullParameter((Object)jioAds$MediaType, "mMediaType");
        this.a = context;
        this.b = hashMap;
        this.c = string2;
        this.d = jioAds$MediaType;
        this.e = bl2;
        this.f = string3;
        this.g = string4;
        this.h = f5;
        this.i = n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] b(InputStream object) {
        ByteArrayOutputStream byteArrayOutputStream;
        block11: {
            void var0_3;
            ByteArrayOutputStream byteArrayOutputStream2;
            block9: {
                block10: {
                    int n3;
                    byteArrayOutputStream2 = null;
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        n3 = 1024;
                    }
                    catch (Throwable throwable) {
                        break block9;
                    }
                    catch (Exception exception) {
                        return null;
                    }
                    try {
                        byte[] byArray = new byte[n3];
                        Ref$IntRef ref$IntRef = new Ref$IntRef();
                        while (true) {
                            int n4;
                            ref$IntRef.element = n4 = ((InputStream)object).read(byArray);
                            int n7 = -1;
                            if (n4 != n7) {
                                n7 = 0;
                                byteArrayOutputStream.write(byArray, 0, n4);
                                continue;
                            }
                            break;
                        }
                    }
                    catch (Throwable throwable) {
                        break block10;
                    }
                    catch (Exception exception) {
                        break block11;
                    }
                    {
                        object = byteArrayOutputStream.toByteArray();
                    }
                    byteArrayOutputStream.close();
                    return object;
                }
                byteArrayOutputStream2 = byteArrayOutputStream;
            }
            if (byteArrayOutputStream2 == null) throw var0_3;
            byteArrayOutputStream2.close();
            throw var0_3;
        }
        if (byteArrayOutputStream == null) return null;
        byteArrayOutputStream.close();
        return null;
    }

    public final void a() {
        block5: {
            Object object;
            Object object2;
            block7: {
                block6: {
                    block4: {
                        object2 = Looper.myLooper();
                        boolean bl2 = Intrinsics.areEqual(object2, object = Looper.getMainLooper());
                        if (bl2) break block4;
                        this.c();
                        break block5;
                    }
                    object2 = new j(this);
                    object = this.k;
                    if (object == null) break block6;
                    Intrinsics.checkNotNull(object);
                    boolean bl3 = object.isShutdown();
                    if (bl3) break block6;
                    object = this.k;
                    Intrinsics.checkNotNull(object);
                    bl3 = object.isTerminated();
                    if (!bl3) break block7;
                }
                this.k = object = Executors.newSingleThreadExecutor();
            }
            if ((object = this.k) != null) {
                object.submit((Runnable)object2);
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final void c() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 2[TRYBLOCK] [2 : 116->121)] java.io.IOException
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
}

