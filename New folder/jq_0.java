/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContext$a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.k;

/*
 * Renamed from jq
 */
public final class jq_0
implements ib3_0 {
    public final List a;
    public final ut3 b;
    public final Fq c;
    public final Function1 d;
    public final ct2_1 e;
    public final ParcelableSnapshotMutableState f;
    public boolean g;

    public jq_0(List object, Object object2, ut3 ut32, Fq fq, Function1 function1, ct2_1 ct2_12) {
        this.a = object;
        this.b = ut32;
        this.c = fq;
        this.d = function1;
        this.e = ct2_12;
        this.f = object = J83.g(object2);
        this.g = true;
    }

    /*
     * Exception decompiling
     */
    public final Object d(f80_0 var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 279->286)] java.lang.Throwable
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
    public final Object g(LU0 var1_1, f80_0 var2_3) {
        block9: {
            block8: {
                var3_5 = var2_3 instanceof jq$c;
                if (!var3_5) ** GOTO lbl-1000
                var4_6 = var2_3;
                var4_6 = (jq$c)var2_3;
                var5_7 = var4_6.d;
                var6_8 = -1 << -1;
                var7_9 = var5_7 & var6_8;
                if (var7_9 != 0) {
                    var4_6.d = var5_7 -= var6_8;
                } else lbl-1000:
                // 2 sources

                {
                    var4_6 = new jq$c(this, (f80_0)var2_3);
                }
                var2_3 = var4_6.b;
                var8_10 = j90_0.COROUTINE_SUSPENDED;
                var6_8 = var4_6.d;
                var7_9 = 1;
                var9_11 = null;
                if (var6_8 != 0) {
                    if (var6_8 != var7_9) {
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var1_1 = var4_6.a;
                    try {
                        vl2_2.b(var2_3);
                        return var2_3;
                    }
                    catch (Exception var2_4) {
                        break block8;
                    }
                    catch (CancellationException var1_2) {
                        break block9;
                    }
                }
                vl2_2.b(var2_3);
                {
                    var2_3 = new jq$d(this, (LU0)var1_1, null);
                    var4_6.a = var1_1;
                    var4_6.d = var7_9;
                    var10_12 = 15000L;
                    var2_3 = k.b(var10_12, (Function2)var2_3, (f80_0)var4_6);
                    if (var2_3 != var8_10) return var2_3;
                    return var8_10;
                }
            }
            var8_10 = var4_6.getContext();
            var12_13 = C90$a.a;
            var8_10 = (c90_0)var8_10.get((CoroutineContext$a)var12_13);
            if (var8_10 == null) return var9_11;
            var4_6 = var4_6.getContext();
            var14_15 = "Unable to load font ";
            var13_14 = new StringBuilder(var14_15);
            var13_14.append(var1_1);
            var1_1 = var13_14.toString();
            var12_13 = new IllegalStateException((String)var1_1, var2_4);
            var8_10.handleException((CoroutineContext)var4_6, (Throwable)var12_13);
            return var9_11;
        }
        var2_3 = var4_6.getContext();
        var15_16 = mm0.g((CoroutineContext)var2_3);
        if (var15_16 == false) throw var1_2;
        return var9_11;
    }

    public final Object getValue() {
        return this.f.getValue();
    }
}

