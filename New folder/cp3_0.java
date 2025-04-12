/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.adservices.topics.GetTopicsRequest
 *  android.adservices.topics.GetTopicsRequest$Builder
 *  android.adservices.topics.GetTopicsResponse
 *  android.adservices.topics.Topic
 *  android.adservices.topics.TopicsManager
 */
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

/*
 * Renamed from cp3
 */
public class cp3_0
extends i0_0 {
    public final TopicsManager a;

    public cp3_0(TopicsManager topicsManager) {
        Intrinsics.checkNotNullParameter(topicsManager, "mTopicsManager");
        this.a = topicsManager;
    }

    /*
     * Unable to fully structure code
     */
    public static Object R(cp3_0 var0, mZ0 var1_1, f80_0 var2_2) {
        var3_3 = var2_2 instanceof cp3$a;
        if (!var3_3) ** GOTO lbl-1000
        var4_4 = var2_2;
        var4_4 = (cp3$a)var2_2;
        var5_5 = var4_4.d;
        var6_6 = -1 << -1;
        var7_7 = var5_5 & var6_6;
        if (var7_7 != 0) {
            var4_4.d = var5_5 -= var6_6;
        } else lbl-1000:
        // 2 sources

        {
            var4_4 = new cp3$a((cp3_0)var0, (f80_0)var2_2);
        }
        var2_2 = var4_4.b;
        var8_8 = j90_0.COROUTINE_SUSPENDED;
        var6_6 = var4_4.d;
        var7_7 = 1;
        if (var6_6 == 0) ** GOTO lbl23
        if (var6_6 == var7_7) {
            var0 = var4_4.a;
            vl2_2.b(var2_2);
        } else {
            var0 = new ArrayList<Lo3>("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl23:
            // 1 sources

            vl2_2.b(var2_2);
            var1_1 = var0.Q((mZ0)var1_1);
            var4_4.a = var0;
            var4_4.d = var7_7;
            var9_9 = zj1_2.b((f80_0)var4_4);
            var2_2 = new CancellableContinuationImpl(var7_7, var9_9);
            var2_2.r();
            var9_9 = var0.a;
            var10_10 = new Object();
            var11_11 = new i80((CancellableContinuationImpl)var2_2);
            bp3_0.a((TopicsManager)var9_9, (GetTopicsRequest)var1_1, var10_10, var11_11);
            var2_2 = var2_2.q();
            if (var2_2 == var8_8) {
                var1_1 = "frame";
                Intrinsics.checkNotNullParameter(var4_4, (String)var1_1);
            }
            if (var2_2 == var8_8) {
                return var8_8;
            }
        }
        var1_1 = Vo3.a(var2_2);
        var0.getClass();
        Intrinsics.checkNotNullParameter(var1_1, "response");
        var0 = new ArrayList<Lo3>();
        var1_1 = Wo3.a((GetTopicsResponse)var1_1).iterator();
        while (var12_12 = var1_1.hasNext()) {
            var2_2 = Xo3.a(var1_1.next());
            var14_14 = Yo3.a((Topic)var2_2);
            var16_15 = Zo3.a((Topic)var2_2);
            var18_16 = ap3.a((Topic)var2_2);
            var4_4 = var13_13;
            var13_13 = new Lo3(var14_14, var16_15, var18_16);
            var0.add(var13_13);
        }
        var1_1 = new nz0_0(var0);
        return var1_1;
    }

    public Object P(mZ0 mZ02, f80_0 f80_02) {
        return cp3_0.R(this, mZ02, f80_02);
    }

    public GetTopicsRequest Q(mZ0 object) {
        Intrinsics.checkNotNullParameter(object, "request");
        GetTopicsRequest.Builder builder = So3.a();
        object = ((mZ0)object).a;
        object = Ro3.a(Po3.a(builder, (String)object));
        Intrinsics.checkNotNullExpressionValue(object, "Builder()\n            .s\u2026ame)\n            .build()");
        return object;
    }
}

