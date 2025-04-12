/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.InAppController;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/*
 * Renamed from qg1
 */
public final class qg1_1
extends zV {
    public final CleverTapInstanceConfig b;
    public final l80_0 c;
    public final boolean d;
    public final b e;
    public final kd3_0 f;
    public final xj3_0 g;
    public final rs3_0 h;
    public final E80 i;

    public qg1_1(CleverTapInstanceConfig object, l80_0 l80_02, boolean bl2, kd3_0 kd3_02, rs3_0 rs3_02, xj3_0 xj3_02, E80 e80) {
        this.b = object;
        this.e = object = ((CleverTapInstanceConfig)object).b();
        this.c = l80_02;
        this.d = bl2;
        this.f = kd3_02;
        this.h = rs3_02;
        this.i = e80;
        this.g = xj3_02;
    }

    public static void b(JSONArray jSONArray, ef1_1 ef1_12, rs3_0 rs3_02) {
        int n3;
        for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            String string2 = jSONArray.optString(i3);
            ef1_12.getClass();
            String string3 = "campaignId";
            Intrinsics.checkNotNullParameter(string2, string3);
            String string4 = kp1_0.c("__impressions_", string2);
            vi_2 vi_22 = ef1_12.a;
            vi_22.e(string4);
            rs3_02.getClass();
            Intrinsics.checkNotNullParameter(string2, string3);
            string3 = rs3_02.c();
            if (string3 == null) continue;
            string3 = string3.edit();
            string2 = rs3_0.b(string2);
            string2 = string3.remove(string2);
            string2.apply();
        }
    }

    /*
     * Exception decompiling
     */
    public final void a(Context var1_1, JSONObject var2_2, String var3_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 136[TRYBLOCK] [154 : 1550->1553)] java.lang.Throwable
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

    public final void c(JSONArray jSONArray) {
        Object object = this.c;
        object = ((l80_0)object).l;
        Object object2 = this.i;
        object2.getClass();
        try {
            ((InAppController)object).k(jSONArray);
        }
        catch (Throwable throwable) {
            object = this.b.a;
            object2 = "InAppManager: Malformed AppLaunched ServerSide inApps";
            b b2 = this.e;
            b2.b((String)object, (String)object2);
            throwable.getMessage();
            com.clevertap.android.sdk.b.m();
        }
    }
}

