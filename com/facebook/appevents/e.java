/*
 * Decompiled with CFR 0.152.
 */
package com.facebook.appevents;

import com.facebook.FacebookSdk;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import kotlin.jvm.internal.Intrinsics;

public final class e {
    static {
        new e();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final pq2_0 a() {
        var0 = e.class;
        synchronized (var0) {
            block22: {
                block24: {
                    block26: {
                        block25: {
                            block23: {
                                try {
                                    // empty try
                                }
                                catch (Throwable var1_2) {}
                                var1_1 = FacebookSdk.a();
                                var2_3 = null;
                                var3_5 = "AppEventsLogger.persistedevents";
                                var3_5 = var1_1.openFileInput((String)var3_5);
                                var4_7 = "context.openFileInput(PERSISTED_EVENTS_FILENAME)";
                                Intrinsics.checkNotNullExpressionValue(var3_5, (String)var4_7);
                                var5_8 = new BufferedInputStream((InputStream)var3_5);
                                var4_7 = new ObjectInputStream((InputStream)var5_8);
                                var3_5 = var4_7.readObject();
                                var5_8 = "null cannot be cast to non-null type com.facebook.appevents.PersistedEvents";
                                Intrinsics.checkNotNull(var3_5, (String)var5_8);
                                var3_5 = (pq2_0)var3_5;
                                lz3_0.e((Closeable)var4_7);
                                var2_3 = "AppEventsLogger.persistedevents";
                                try {
                                    var1_1 = var1_1.getFileStreamPath((String)var2_3);
                                    var1_1.delete();
                                }
                                catch (Exception v0) {}
                                var2_3 = var3_5;
                                break block22;
                                catch (Throwable var2_4) {
                                    break block23;
                                }
                                catch (Exception v1) {
                                    var4_7 = null;
                                    break block24;
                                }
                                catch (FileNotFoundException v2) {
                                    var4_7 = null;
                                    break block25;
                                }
                                catch (Throwable var3_6) {}
                                var4_7 = null;
                                var2_3 = var3_6;
                            }
                            lz3_0.e((Closeable)var4_7);
                            var3_5 = "AppEventsLogger.persistedevents";
                            var1_1 = var1_1.getFileStreamPath((String)var3_5);
                            var1_1.delete();
                            throw var2_3;
                            catch (FileNotFoundException v3) {}
                        }
                        lz3_0.e((Closeable)var4_7);
                        var3_5 = "AppEventsLogger.persistedevents";
                        ** try [egrp 10[TRYBLOCK] [46 : 197->201)] { 
lbl59:
                        // 1 sources

                        {
                            break block26;
                            var1_1 = var1_1.getFileStreamPath((String)var3_5);
                            ** GOTO lbl73
                        }
                    }
                    throw var1_2;
                    catch (Exception v4) {
                        throw var2_3;
                    }
                    catch (Exception v5) {}
                }
                lz3_0.e((Closeable)var4_7);
                var3_5 = "AppEventsLogger.persistedevents";
                try {
                    var1_1 = var1_1.getFileStreamPath((String)var3_5);
lbl73:
                    // 2 sources

                    var1_1.delete();
                }
lbl76:
                // 2 sources

                catch (Exception v6) {}
            }
            if (var2_3 != null) return var2_3;
            return new pq2_0();
        }
    }

    /*
     * Exception decompiling
     */
    public static final void b(pq2_0 var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [8[CATCHBLOCK]], but top level block is 12[UNCONDITIONALDOLOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

