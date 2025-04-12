/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Trace
 *  android.view.View
 */
package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.View;
import androidx.recyclerview.widget.GapWorker$a;
import androidx.recyclerview.widget.GapWorker$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$u;
import androidx.recyclerview.widget.c_0;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

final class GapWorker
implements Runnable {
    public static final ThreadLocal e;
    public static final GapWorker$a f;
    public final ArrayList a;
    public long b;
    public long c;
    public final ArrayList d;

    static {
        Object object = new ThreadLocal();
        e = object;
        f = object = new Object();
    }

    public GapWorker() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
        this.d = arrayList = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static RecyclerView$B c(RecyclerView recyclerView, int n3, long l2) {
        Throwable throwable2;
        block8: {
            Object object;
            block7: {
                int n4;
                int n7;
                object = recyclerView.mChildHelper;
                int n8 = ((c_0)object).h();
                String string2 = null;
                for (n7 = 0; n7 < n8; ++n7) {
                    boolean bl2;
                    RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.g(n7));
                    n4 = recyclerView$B.mPosition;
                    if (n4 != n3 || (bl2 = recyclerView$B.isInvalid())) continue;
                    return null;
                }
                object = recyclerView.mRecycler;
                long l3 = Long.MAX_VALUE;
                long l4 = l2 - l3;
                n4 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
                if (n4 == 0) {
                    try {
                        n7 = (int)(ip3.a() ? 1 : 0);
                        if (n7 == 0) break block7;
                        string2 = "RV Prefetch forced - needed next frame";
                        Trace.beginSection((String)string2);
                    }
                    catch (Throwable throwable2) {
                        break block8;
                    }
                }
            }
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView$B recyclerView$B = ((RecyclerView$u)object).m(n3, l2);
            if (recyclerView$B != null) {
                boolean bl3 = recyclerView$B.isBound();
                if (bl3 && !(bl3 = recyclerView$B.isInvalid())) {
                    View view = recyclerView$B.itemView;
                    ((RecyclerView$u)object).j(view);
                } else {
                    ((RecyclerView$u)object).a(recyclerView$B, false);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            Trace.endSection();
            return recyclerView$B;
        }
        recyclerView.onExitLayoutOrScroll(false);
        Trace.endSection();
        throw throwable2;
    }

    public final void a(RecyclerView object, int n3, int n4) {
        boolean bl2 = ((RecyclerView)object).isAttachedToWindow();
        if (bl2) {
            ArrayList arrayList;
            bl2 = RecyclerView.sDebugAssertionsEnabled;
            if (bl2 && !(bl2 = (arrayList = this.a).contains(object))) {
                object = new IllegalStateException("attempting to post unregistered view!");
                throw object;
            }
            long l2 = this.b;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 == false) {
                this.b = l2 = ((RecyclerView)object).getNanoTime();
                object.post((Runnable)this);
            }
        }
        object = ((RecyclerView)object).mPrefetchRegistry;
        ((GapWorker$b)object).a = n3;
        ((GapWorker$b)object).b = n4;
    }

    /*
     * Exception decompiling
     */
    public final void b(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 0[TRYBLOCK] [0 : 642->652)] java.lang.Throwable
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
    public final void run() {
        Throwable throwable2;
        long l2;
        block7: {
            long l3;
            Object object;
            block9: {
                block8: {
                    int n3;
                    l2 = 0L;
                    object = "RV Prefetch";
                    try {
                        Trace.beginSection((String)object);
                        object = this.a;
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                    {
                        n3 = ((ArrayList)object).isEmpty();
                        if (n3 != 0) break block8;
                    }
                    n3 = ((ArrayList)object).size();
                    l3 = l2;
                    for (int i3 = 0; i3 < n3; ++i3) {
                        Object object2 = ((ArrayList)object).get(i3);
                        int n4 = (object2 = (RecyclerView)object2).getWindowVisibility();
                        if (n4 != 0) continue;
                        long l4 = object2.getDrawingTime();
                        l3 = Math.max(l4, l3);
                    }
                    Object object3 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
                    if (object3 != false) break block9;
                }
                this.b = l2;
                Trace.endSection();
                return;
            }
            object = TimeUnit.MILLISECONDS;
            long l7 = ((TimeUnit)((Object)object)).toNanos(l3);
            long l8 = this.c;
            this.b(l7 += l8);
            this.b = l2;
            Trace.endSection();
            return;
        }
        this.b = l2;
        Trace.endSection();
        throw throwable2;
    }
}

