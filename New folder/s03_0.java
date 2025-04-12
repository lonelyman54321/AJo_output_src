/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
import android.content.Context;
import com.facebook.GraphRequest;
import com.facebook.appevents.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Renamed from s03
 */
public final class s03_0 {
    public final zq_0 a;
    public final String b;
    public ArrayList c;
    public final ArrayList d;
    public int e;

    public s03_0(zq_0 arrayList, String string2) {
        Intrinsics.checkNotNullParameter(arrayList, "attributionIdentifiers");
        Intrinsics.checkNotNullParameter(string2, "anonymousAppDeviceGUID");
        this.a = arrayList;
        this.b = string2;
        this.c = arrayList = new ArrayList();
        this.d = arrayList = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(c c2) {
        synchronized (this) {
            Throwable throwable2;
            block8: {
                block7: {
                    Object object;
                    block6: {
                        int n3 = td0.b(this);
                        if (n3 != 0) {
                            return;
                        }
                        object = "event";
                        try {
                            int n4;
                            Intrinsics.checkNotNullParameter(c2, (String)object);
                            object = this.c;
                            n3 = ((ArrayList)object).size();
                            ArrayList arrayList = this.d;
                            int n7 = arrayList.size();
                            n3 += n7;
                            n7 = 1000;
                            if (n3 < n7) break block6;
                            this.e = n4 = this.e + 1;
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    object = this.c;
                    ((ArrayList)object).add(c2);
                }
                return;
            }
            td0.a(this, throwable2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(boolean bl2) {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                ArrayList arrayList;
                boolean bl3 = td0.b(this);
                if (bl3) {
                    return;
                }
                if (bl2) {
                    try {
                        arrayList = this.c;
                        ArrayList arrayList2 = this.d;
                        arrayList.addAll(arrayList2);
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                arrayList = this.d;
                arrayList.clear();
                bl2 = false;
                arrayList = null;
                this.e = 0;
                return;
            }
            td0.a(this, throwable2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int c() {
        synchronized (this) {
            int n3 = td0.b(this);
            if (n3 != 0) {
                return 0;
            }
            try {
                ArrayList arrayList = this.c;
                return arrayList.size();
            }
            catch (Throwable throwable) {
                td0.a(this, throwable);
                return 0;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List d() {
        synchronized (this) {
            boolean bl2 = td0.b(this);
            if (bl2) {
                return null;
            }
            try {
                ArrayList arrayList;
                ArrayList arrayList2 = this.c;
                this.c = arrayList = new ArrayList();
                return arrayList2;
            }
            catch (Throwable throwable) {
                td0.a(this, throwable);
                return null;
            }
        }
    }

    /*
     * Exception decompiling
     */
    public final int e(GraphRequest var1_1, Context var2_4, boolean var3_5, boolean var4_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 34[TRYBLOCK] [64 : 385->394)] java.lang.Throwable
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(GraphRequest var1_1, Context var2_3, int var3_4, JSONArray var4_5, JSONArray var5_6, boolean var6_7) {
        var7_8 = td0.b(this);
        if (var7_8) {
            return;
        }
        var8_9 = eo$a.CUSTOM_APP_EVENTS;
        var9_10 = this.a;
        var10_11 = this.b;
        var2_3 = eo.a(var8_9, var9_10, var10_11, (boolean)var6_7, var2_3);
        var6_7 = this.e;
        if (var6_7 > 0) {
            var11_12 = "num_skipped_events";
            var2_3.put(var11_12, var3_4);
        }
        ** GOTO lbl19
        {
            catch (Throwable var1_2) {
            }
            catch (JSONException v0) {}
            {
                var2_3 = new JSONObject();
lbl19:
                // 2 sources

                var1_1.c = var2_3;
                var2_3 = var1_1.d;
                var12_13 = var4_5 /* !! */ .toString();
                var4_5 /* !! */  = "events.toString()";
                Intrinsics.checkNotNullExpressionValue(var12_13, (String)var4_5 /* !! */ );
                var4_5 /* !! */  = "custom_events";
                var2_3.putString((String)var4_5 /* !! */ , var12_13);
                var4_5 /* !! */  = kJ0$b.IapLoggingLib5To7;
                var13_14 = kj0_0.b((kJ0$b)var4_5 /* !! */ );
                if (var13_14) {
                    var4_5 /* !! */  = "operational_parameters";
                    var5_6 /* !! */  = var5_6 /* !! */ .toString();
                    var2_3.putString((String)var4_5 /* !! */ , (String)var5_6 /* !! */ );
                }
                var1_1.e = var12_13;
                var12_13 = "<set-?>";
                Intrinsics.checkNotNullParameter(var2_3, var12_13);
                var1_1.d = var2_3;
                return;
            }
        }
        td0.a(this, var1_2);
    }
}

