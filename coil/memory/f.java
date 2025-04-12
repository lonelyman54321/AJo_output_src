/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package coil.memory;

import android.graphics.Bitmap;
import coil.memory.MemoryCache$Key;
import coil.memory.MemoryCache$b;
import coil.memory.f$a;
import coil.memory.h;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;

public final class f
implements h {
    public final LinkedHashMap a;
    public int b;

    public f() {
        LinkedHashMap linkedHashMap;
        this.a = linkedHashMap = new LinkedHashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(int n3) {
        synchronized (this) {
            int n4 = 10;
            if (n3 >= n4 && n3 != (n4 = 20)) {
                this.d();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final MemoryCache$b b(MemoryCache$Key object) {
        synchronized (this) {
            Throwable throwable2;
            block9: {
                Object object2;
                block8: {
                    try {
                        object2 = this.a;
                        object = ((LinkedHashMap)object2).get(object);
                        object = (ArrayList)object;
                        object2 = null;
                        if (object != null) break block8;
                    }
                    catch (Throwable throwable2) {
                        break block9;
                    }
                    return null;
                }
                int n3 = object.size();
                for (int i3 = 0; i3 < n3; ++i3) {
                    MemoryCache$b memoryCache$b;
                    Object object3 = object.get(i3);
                    object3 = (f$a)object3;
                    WeakReference weakReference = ((f$a)object3).b;
                    weakReference = weakReference.get();
                    if ((weakReference = (Bitmap)weakReference) != null) {
                        object3 = ((f$a)object3).c;
                        memoryCache$b = new MemoryCache$b((Bitmap)weakReference, (Map)object3);
                    } else {
                        memoryCache$b = null;
                    }
                    if (memoryCache$b == null) continue;
                    object2 = memoryCache$b;
                    break;
                }
                int n4 = this.b;
                this.b = n3 = n4 + 1;
                n3 = 10;
                if (n4 >= n3) {
                    this.d();
                }
                return object2;
            }
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void c(MemoryCache$Key var1_1, Bitmap var2_3, Map var3_4, int var4_5) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 49->54)] java.lang.Throwable
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

    public final void d() {
        boolean bl2;
        this.b = 0;
        Iterator iterator = this.a.values().iterator();
        while (bl2 = iterator.hasNext()) {
            int n3;
            Object object = (ArrayList)iterator.next();
            int n4 = object.size();
            if (n4 <= (n3 = 1)) {
                if ((object = (f$a)CollectionsKt.firstOrNull((List)object)) != null && (object = ((f$a)object).b) != null) {
                    object = (Bitmap)((Reference)object).get();
                } else {
                    bl2 = false;
                    object = null;
                }
                if (object != null) continue;
                iterator.remove();
                continue;
            }
            n4 = object.size();
            int n7 = 0;
            for (n3 = 0; n3 < n4; ++n3) {
                int n8 = n3 - n7;
                Object t3 = ((f$a)object.get((int)n8)).b.get();
                if (t3 != null) continue;
                object.remove(n8);
                ++n7;
            }
            bl2 = ((ArrayList)object).isEmpty();
            if (!bl2) continue;
            iterator.remove();
        }
    }
}

