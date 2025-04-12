/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/*
 * Renamed from bK2
 */
public final class bk2_1
implements Future,
ki3_1,
ck2_0 {
    public final int a;
    public final int b;
    public Object c;
    public LJ2 d;
    public boolean e;
    public boolean f;
    public boolean g;
    public GlideException h;

    public bk2_1() {
        int n3;
        this.a = n3 = -1 << -1;
        this.b = n3;
    }

    public final void a(K63 k63) {
        int n3 = this.a;
        int n4 = this.b;
        k63.b(n3, n4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(GlideException glideException, ki3_1 ki3_12) {
        synchronized (this) {
            boolean bl2;
            this.g = bl2 = true;
            this.h = glideException;
            this.notifyAll();
            return;
        }
    }

    public final void c(Drawable drawable2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean cancel(boolean bl2) {
        synchronized (this) {
            try {
                boolean bl3 = this.isDone();
                if (bl3) {
                    return false;
                }
                this.e = bl3 = true;
                this.notifyAll();
                LJ2 lJ2 = null;
                if (bl2) {
                    LJ2 lJ22 = this.d;
                    this.d = null;
                    lJ2 = lJ22;
                }
                // MONITOREXIT @DISABLED, blocks:[0, 2] lbl14 : MonitorExitStatement: MONITOREXIT : this
                if (lJ2 != null) {
                    lJ2.clear();
                }
                return bl3;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d(Object object, qr3 qr32) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final void e(Drawable drawable2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(Object object, Object object2, ki3_1 ki3_12, pi0_0 pi0_02) {
        synchronized (this) {
            boolean bl2;
            this.f = bl2 = true;
            this.c = object;
            this.notifyAll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(LJ2 lJ2) {
        synchronized (this) {
            this.d = lJ2;
            return;
        }
    }

    public final Object get() {
        Object var1_1 = null;
        try {
            return this.j(null);
        }
        catch (TimeoutException timeoutException) {
            AssertionError assertionError = new AssertionError((Object)timeoutException);
            throw assertionError;
        }
    }

    public final Object get(long l2, TimeUnit timeUnit) {
        Long l3 = timeUnit.toMillis(l2);
        return this.j(l3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final LJ2 getRequest() {
        synchronized (this) {
            return this.d;
        }
    }

    public final void h(K63 k63) {
    }

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void i(Drawable drawable2) {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isCancelled() {
        synchronized (this) {
            return this.e;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean isDone() {
        synchronized (this) {
            try {
                boolean bl2 = this.e;
                if (bl2) return true;
                bl2 = this.f;
                if (bl2) return true;
                bl2 = this.g;
                if (!bl2) return false;
                return true;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Exception decompiling
     */
    public final Object j(Long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 9[TRYBLOCK] [11 : 116->128)] java.lang.Throwable
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

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final String toString() {
        Object object;
        String string2;
        CharSequence charSequence;
        block9: {
            boolean bl2;
            block8: {
                charSequence = new StringBuilder();
                string2 = super.toString();
                object = "[status=";
                charSequence = h30_0.a(charSequence, string2, (String)object);
                // MONITORENTER : this
                bl2 = this.e;
                object = null;
                if (!bl2) break block8;
                string2 = "CANCELLED";
                break block9;
            }
            bl2 = this.g;
            if (bl2) {
                string2 = "FAILURE";
            } else {
                bl2 = this.f;
                if (bl2) {
                    string2 = "SUCCESS";
                } else {
                    string2 = "PENDING";
                    object = this.d;
                }
            }
        }
        // MONITOREXIT : this
        if (object == null) return n1.a((String)charSequence, string2, "]");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)charSequence);
        stringBuilder.append(string2);
        stringBuilder.append(", request=[");
        stringBuilder.append(object);
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}

