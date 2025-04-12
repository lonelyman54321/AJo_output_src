/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks
 *  android.content.ComponentCallbacks2
 *  android.content.Context
 *  android.content.res.Configuration
 */
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import coil.memory.MemoryCache;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/*
 * Renamed from oh3
 */
public final class oh3_0
implements ComponentCallbacks2,
WU1$a {
    public final WeakReference a;
    public Context b;
    public WU1 c;
    public boolean d;
    public boolean e;

    public oh3_0(OE2 oE2) {
        WeakReference<OE2> weakReference;
        this.a = weakReference = new WeakReference<OE2>(oE2);
        this.e = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            Object object = this.a;
                            object = ((Reference)object).get();
                            object = (OE2)object;
                            if (object == null) break block3;
                            this.e = bl2;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    this.c();
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void b() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 18[TRYBLOCK] [23 : 154->163)] java.lang.Throwable
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl2;
                block6: {
                    try {
                        bl2 = this.d;
                        if (!bl2) break block6;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    return;
                }
                bl2 = true;
                this.d = bl2;
                Object object = this.b;
                if (object != null) {
                    object.unregisterComponentCallbacks((ComponentCallbacks)this);
                }
                if ((object = this.c) != null) {
                    object.shutdown();
                }
                object = this.a;
                ((Reference)object).clear();
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onConfigurationChanged(Configuration object) {
        synchronized (this) {
            object = this.a;
            object = object.get();
            object = (OE2)object;
            if (object == null) {
                this.c();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onLowMemory() {
        synchronized (this) {
            int n3 = 80;
            this.onTrimMemory(n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onTrimMemory(int n3) {
        synchronized (this) {
            block5: {
                block4: {
                    Object object = this.a;
                    object = ((Reference)object).get();
                    object = (OE2)object;
                    if (object == null) break block4;
                    object = ((OE2)object).c;
                    if (object != null) {
                        object = object.getValue();
                        if ((object = (MemoryCache)object) != null) {
                            object.a(n3);
                        }
                    }
                    break block5;
                }
                this.c();
            }
            return;
        }
    }
}

