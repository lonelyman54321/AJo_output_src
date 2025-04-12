/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.jio.jioads.network;

import android.os.Looper;
import com.jio.jioads.network.NetworkTaskListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

public final class i {
    public final int a;
    public final String b;
    public HashMap c;
    public boolean d;
    public HashMap e;
    public NetworkTaskListener f;
    public int g;
    public final int h;
    public String i;
    public String j;
    public ExecutorService k;

    public i(int n3, String string2, HashMap hashMap, Integer n4, NetworkTaskListener networkTaskListener) {
        this.a = n3;
        this.b = string2;
        this.c = hashMap;
        Object object = new HashMap();
        this.e = object;
        this.k = object = Executors.newSingleThreadExecutor();
        n3 = n4;
        n3 = n3 == 0 ? 20000 : n4 * 1000;
        this.h = n3;
        this.f = networkTaskListener;
    }

    public static String a(int n3) {
        String string2;
        switch (n3) {
            default: {
                IllegalStateException illegalStateException = new IllegalStateException("Unknown method type.");
                throw illegalStateException;
            }
            case 7: {
                string2 = "PATCH";
                break;
            }
            case 6: {
                string2 = "TRACE";
                break;
            }
            case 5: {
                string2 = "OPTIONS";
                break;
            }
            case 4: {
                string2 = "HEAD";
                break;
            }
            case 3: {
                string2 = "DELETE";
                break;
            }
            case 2: {
                string2 = "PUT";
                break;
            }
            case 0: {
                string2 = "GET";
                break;
            }
            case -1: 
            case 1: {
                string2 = "POST";
            }
        }
        return string2;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String b(InputStream object) {
        StringBuilder stringBuilder;
        block14: {
            Object object2;
            block15: {
                void var1_4;
                block16: {
                    BufferedReader bufferedReader;
                    block13: {
                        block12: {
                            stringBuilder = new StringBuilder();
                            object2 = null;
                            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)object);
                            bufferedReader = new BufferedReader(inputStreamReader);
                            try {
                                while ((object2 = bufferedReader.readLine()) != null) {
                                    stringBuilder.append((String)object2);
                                    object2 = "\n";
                                    stringBuilder.append((String)object2);
                                }
                            }
                            catch (Throwable throwable) {
                                break block12;
                            }
                            catch (IOException iOException) {
                                break block13;
                            }
                            try {
                                bufferedReader.close();
                                ((InputStream)object).close();
                                break block14;
                            }
                            catch (IOException iOException) {}
                        }
                        object2 = bufferedReader;
                        break block16;
                    }
                    object2 = bufferedReader;
                    break block15;
                    catch (Throwable throwable) {
                    }
                    catch (IOException iOException) {
                        break block15;
                    }
                }
                if (object2 == null) throw var1_4;
                try {
                    ((BufferedReader)object2).close();
                    ((InputStream)object).close();
                }
                catch (IOException iOException) {
                    throw var1_4;
                }
                throw var1_4;
            }
            if (object2 == null) break block14;
            ((BufferedReader)object2).close();
            ((InputStream)object).close();
        }
        object = stringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(object, "toString(...)");
        return object;
    }

    public static HashMap c(HashMap hashMap) {
        HashMap<Object, String> hashMap2 = new HashMap<Object, String>();
        if (hashMap != null) {
            boolean bl2;
            Iterator iterator = hashMap.keySet().iterator();
            while (bl2 = iterator.hasNext()) {
                Object object;
                String string2 = (String)iterator.next();
                Object object2 = hashMap.get(string2);
                if (object2 == null) continue;
                object2 = hashMap.get(string2);
                Intrinsics.checkNotNull(object2);
                boolean bl3 = (object2 = (Collection)object2).isEmpty() ^ true;
                if (!bl3) continue;
                bl3 = false;
                object2 = null;
                if (string2 != null) {
                    object = Locale.ROOT;
                    object = string2.toLowerCase((Locale)object);
                    String string3 = "this as java.lang.String).toLowerCase(Locale.ROOT)";
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    string2 = hashMap.get(string2);
                    Intrinsics.checkNotNull(string2);
                    string2 = ((List)((Object)string2)).get(0);
                    hashMap2.put(object, string2);
                    continue;
                }
                object = hashMap.get(string2);
                Intrinsics.checkNotNull(object);
                object = (List)object;
                object2 = object.get(0);
                hashMap2.put(string2, (String)object2);
            }
        }
        return hashMap2;
    }

    /*
     * Exception decompiling
     */
    public final void d(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [13, 12, 10, 9, 8, 11, 7 : 186->189)] java.lang.Throwable
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

    public final void e(String object) {
        block8: {
            block5: {
                Object object2;
                block7: {
                    block6: {
                        Looper looper;
                        object2 = Looper.myLooper();
                        boolean bl2 = Intrinsics.areEqual(object2, looper = Looper.getMainLooper());
                        if (!bl2) break block5;
                        this.d = bl2 = true;
                        int n3 = 1;
                        object2 = new wy2_0(n3, this, object);
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
                break block8;
            }
            this.d((String)object);
        }
    }
}

