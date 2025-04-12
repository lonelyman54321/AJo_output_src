/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.window.layout.SidecarCompat;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class B43
implements YF3 {
    public static volatile B43 c;
    public static final ReentrantLock d;
    public final JH0 a;
    public final CopyOnWriteArrayList b;

    static {
        ReentrantLock reentrantLock;
        d = reentrantLock = new ReentrantLock();
    }

    public B43(SidecarCompat sidecarCompat) {
        this.a = sidecarCompat;
        Object object = new CopyOnWriteArrayList();
        this.b = object;
        if (sidecarCompat != null) {
            object = new B43$a(this);
            sidecarCompat.i((B43$a)object);
        }
    }

    /*
     * Exception decompiling
     */
    public final void a(p60_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 10[TRYBLOCK] [11 : 113->117)] java.lang.Throwable
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
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(Activity object, jl1_0 object2, gg3_0 object3) {
        Throwable throwable2;
        ReentrantLock reentrantLock;
        block9: {
            Object object4;
            Intrinsics.checkNotNullParameter(object, "activity");
            Intrinsics.checkNotNullParameter(object2, "executor");
            Intrinsics.checkNotNullParameter(object3, "callback");
            reentrantLock = d;
            reentrantLock.lock();
            try {
                object4 = this.a;
                if (object4 == null) {
                    object2 = mz0_2.a;
                    object = new gH3((List)object2);
                    ((gg3_0)object3).accept(object);
                    reentrantLock.unlock();
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block9;
            }
            Object object5 = this.b;
            boolean bl2 = object5 instanceof Collection;
            boolean bl3 = false;
            {
                block12: {
                    Object object6;
                    block13: {
                        boolean bl4;
                        block10: {
                            boolean bl5;
                            block11: {
                                if (!bl2 || !(bl2 = ((CopyOnWriteArrayList)object5).isEmpty())) {
                                    boolean bl6;
                                    object6 = ((CopyOnWriteArrayList)object5).iterator();
                                    while (bl6 = object6.hasNext()) {
                                        Object object7 = object6.next();
                                        object7 = (B43$b)object7;
                                        object7 = ((B43$b)object7).a;
                                        bl6 = Intrinsics.areEqual(object7, object);
                                        if (!bl6) continue;
                                        bl3 = true;
                                        break;
                                    }
                                }
                                object6 = new B43$b((Activity)object, (jl1_0)object2, (gg3_0)object3);
                                ((CopyOnWriteArrayList)object5).add(object6);
                                if (bl3) break block11;
                                object4.a((Activity)object);
                                break block12;
                            }
                            object2 = ((CopyOnWriteArrayList)object5).iterator();
                            do {
                                bl4 = object2.hasNext();
                                object4 = null;
                                if (!bl4) break block10;
                                object5 = object3 = object2.next();
                                object5 = (B43$b)object3;
                            } while (!(bl5 = Intrinsics.areEqual(object, object5 = ((B43$b)object5).a)));
                            break block13;
                        }
                        bl4 = false;
                        object3 = null;
                    }
                    object3 = (B43$b)object3;
                    if (object3 != null) {
                        object4 = ((B43$b)object3).d;
                    }
                    if (object4 != null) {
                        object = "newLayoutInfo";
                        Intrinsics.checkNotNullParameter(object4, (String)object);
                        ((B43$b)object6).d = object4;
                        object = new C43((B43$b)object6, (gH3)object4);
                        object2 = ((B43$b)object6).b;
                        object2.execute((Runnable)object);
                    }
                }
                object = Unit.a;
                reentrantLock.unlock();
                return;
            }
        }
        reentrantLock.unlock();
        throw throwable2;
    }
}

