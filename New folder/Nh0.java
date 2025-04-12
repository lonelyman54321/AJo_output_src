/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences$Editor
 *  org.json.JSONObject
 */
import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

public final class Nh0 {
    public final CleverTapInstanceConfig a;
    public final ti_0 b;
    public mh0_0 c;

    public Nh0(CleverTapInstanceConfig cleverTapInstanceConfig, ti_0 ti_02) {
        Intrinsics.checkNotNullParameter(cleverTapInstanceConfig, "config");
        Intrinsics.checkNotNullParameter(ti_02, "ctLockManager");
        this.a = cleverTapInstanceConfig;
        this.b = ti_02;
    }

    public final void a(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        Object object2 = this.b.a;
        Object object3 = "ctLockManager.eventLock";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        synchronized (object2) {
            object3 = this.c((Context)object);
            Object object4 = ci3_1.EVENTS;
            ((mh0_0)object3).j((ci3_1)((Object)object4));
            object4 = ci3_1.PROFILE_EVENTS;
            ((mh0_0)object3).j((ci3_1)((Object)object4));
            object3 = "IJ";
            object3 = gc3_0.f(object, (String)object3);
            object3 = object3.edit();
            object3.clear();
            gc3_0.i((SharedPreferences.Editor)object3);
            object3 = "comms_first_ts";
            object4 = this.a;
            object3 = gc3_0.l((CleverTapInstanceConfig)object4, (String)object3);
            gc3_0.j(object, 0, (String)object3);
            object3 = "comms_last_ts";
            object3 = gc3_0.l((CleverTapInstanceConfig)object4, (String)object3);
            gc3_0.j(object, 0, (String)object3);
            object = Unit.a;
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final tC2 b(Context var1_1, ci3_1 var2_3, tC2 var3_4) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 97->101)] java.lang.Throwable
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
    public final mh0_0 c(Context object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                Object object2;
                block4: {
                    object2 = "context";
                    try {
                        Intrinsics.checkNotNullParameter(object, (String)object2);
                        object2 = this.c;
                        if (object2 != null) break block4;
                        CleverTapInstanceConfig cleverTapInstanceConfig = this.a;
                        this.c = object2 = new mh0_0((Context)object, cleverTapInstanceConfig);
                        object = ci3_1.EVENTS;
                        ((mh0_0)object2).d((ci3_1)((Object)object));
                        object = ci3_1.PROFILE_EVENTS;
                        ((mh0_0)object2).d((ci3_1)((Object)object));
                        object = ci3_1.PUSH_NOTIFICATION_VIEWED;
                        ((mh0_0)object2).d((ci3_1)((Object)object));
                        ((mh0_0)object2).b();
                        object = ((mh0_0)object2).p();
                        ((ax3_0)object).a();
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                }
                return object2;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Context object, JSONObject object2, ci3_1 object3) {
        String string2 = "Queued event to DB table ";
        Object object4 = "Queued event: ";
        Object object5 = this.b.a;
        Object object6 = "ctLockManager.eventLock";
        Intrinsics.checkNotNullExpressionValue(object5, (String)object6);
        synchronized (object5) {
            Throwable throwable2;
            block4: {
                block3: {
                    try {
                        object = this.c((Context)object);
                        long l2 = ((mh0_0)object).k((JSONObject)object2, (ci3_1)((Object)object3));
                        long l3 = 0L;
                        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
                        if (l4 <= 0) break block3;
                        object = this.a;
                        object = ((CleverTapInstanceConfig)object).b();
                        object6 = this.a;
                        object6 = ((CleverTapInstanceConfig)object6).a;
                        object6 = new StringBuilder((String)object4);
                        ((StringBuilder)object6).append(object2);
                        object4 = ((StringBuilder)object6).toString();
                        object.getClass();
                        com.clevertap.android.sdk.b.f((String)object4);
                        object = this.a;
                        object = ((CleverTapInstanceConfig)object).b();
                        object4 = this.a;
                        object4 = ((CleverTapInstanceConfig)object4).a;
                        object6 = new StringBuilder(string2);
                        ((StringBuilder)object6).append(object3);
                        object3 = ": ";
                        ((StringBuilder)object6).append((String)object3);
                        ((StringBuilder)object6).append(object2);
                        object2 = ((StringBuilder)object6).toString();
                        ((b)object).b((String)object4, (String)object2);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = Unit.a;
                return;
            }
            throw throwable2;
        }
    }
}

