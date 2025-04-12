/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tA3
 */
public final class ta3_1 {
    public final HashMap a;
    public final ConcurrentHashMap b;
    public Runnable c;
    public Map d;
    public Object e;
    public final Context f;
    public final wl0_1 g;
    public final CleverTapInstanceConfig h;

    public ta3_1(CleverTapInstanceConfig cleverTapInstanceConfig, Context context, wl0_1 wl0_12, ol0_1 hashMap) {
        hashMap = new HashMap();
        this.a = hashMap;
        this.b = hashMap;
        new HashMap();
        this.c = null;
        this.d = hashMap = new HashMap();
        this.f = context;
        this.h = cleverTapInstanceConfig;
        this.g = wl0_12;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(HashMap iterator, HashMap object) {
        Objects.toString(iterator);
        com.clevertap.android.sdk.b.d();
        if (iterator != null) {
            boolean bl2;
            this.d = iterator;
            AbstractMap abstractMap = this.a;
            iterator = gi_1.a(abstractMap, iterator);
            this.e = iterator;
            Objects.toString(iterator);
            com.clevertap.android.sdk.b.d();
            iterator = ((HashMap)object).entrySet().iterator();
            while (bl2 = iterator.hasNext()) {
                object = (String)iterator.next().getKey();
                abstractMap = this.b;
                if ((object = (ra3_1)((ConcurrentHashMap)abstractMap).get(object)) == null) continue;
                synchronized (object) {
                    iterator = null;
                    throw null;
                }
            }
        }
    }

    public final String b() {
        String string2 = gc3_0.l(this.h, "variablesKey");
        string2 = gc3_0.g(this.f, string2, "{}");
        com.clevertap.android.sdk.b.d();
        return string2;
    }

    /*
     * Exception decompiling
     */
    public final void c(Function0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 8[TRYBLOCK] [23 : 76->79)] java.lang.Throwable
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

    public final void d(HashMap object, Function0 object2) {
        Serializable serializable;
        Object object3;
        boolean bl2;
        boolean bl3 = ((HashMap)object).isEmpty();
        if (bl3) {
            com.clevertap.android.sdk.b.d();
            return;
        }
        ArrayList arrayList = new ArrayList();
        object = ((HashMap)object).entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object3 = (String)((Map.Entry)object.next()).getKey();
            serializable = this.b;
            if ((object3 = (ra3_1)serializable.get(object3)) == null) continue;
            throw null;
        }
        com.clevertap.android.sdk.b.d();
        com.clevertap.android.sdk.b.d();
        boolean bl4 = arrayList.isEmpty();
        if (bl4) {
            object2.invoke();
            return;
        }
        object = new O7(object2, 2);
        object2 = this.g;
        object2.getClass();
        Intrinsics.checkNotNullParameter(arrayList, "urlMeta");
        Intrinsics.checkNotNullParameter(object, "completionCallback");
        object3 = UL0.c;
        serializable = tl0_0.c;
        ((wl0_1)object2).c(arrayList, (Function1)object, (Function1)((Object)serializable), (Function1)object3);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                block4: {
                    try {
                        Runnable runnable2 = this.c;
                        if (runnable2 == null) break block4;
                        runnable2.run();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }
}

