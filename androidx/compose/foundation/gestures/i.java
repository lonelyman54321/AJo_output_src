/*
 * Decompiled with CFR 0.152.
 */
package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ScrollableElement;
import androidx.compose.foundation.gestures.i$a;
import androidx.compose.foundation.gestures.i$b;
import androidx.compose.foundation.gestures.i$c;
import androidx.compose.foundation.gestures.i$d;
import kotlin.jvm.internal.Ref$FloatRef;

public final class i {
    public static final i$a a = i$a.c;
    public static final i$c b;
    public static final i$b c;
    public static final i$d d;

    static {
        Object object = new Object();
        b = object;
        c = object = new Object();
        d = object = new Object();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object a(ku2_0 var0, long var1_1, f80_0 var3_2) {
        block8: {
            block7: {
                block5: {
                    block6: {
                        var4_3 = var3_2 instanceof vt2_2;
                        if (!var4_3) ** GOTO lbl-1000
                        var5_4 = var3_2;
                        var5_4 = (vt2_2)var3_2;
                        var6_5 = var5_4.d;
                        var7_6 = -1 << -1;
                        var8_7 = var6_5 & var7_6;
                        if (var8_7 != 0) {
                            var5_4.d = var6_5 -= var7_6;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var5_4 = new h80_0((f80_0)var3_2);
                        }
                        var3_2 = var5_4.c;
                        var9_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var7_6 = var5_4.d;
                        var8_7 = 1;
                        if (var7_6 == 0) break block5;
                        if (var7_6 != var8_7) break block6;
                        var0 = var5_4.b;
                        var10_9 = var5_4.a;
                        vl2_2.b(var3_2);
                        var3_2 = var0;
                        var0 = var10_9;
                        break block7;
                    }
                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var0;
                }
                vl2_2.b(var3_2);
                var3_2 = new Ref$FloatRef();
                var11_11 = aS1.Default;
                var12_12 = new wt2_2((ku2_0)var0, var1_1, (Ref$FloatRef)var3_2, null);
                var5_4.a = var0;
                var5_4.b = var3_2;
                var5_4.d = var8_7;
                var10_10 = var0.e(var11_11, var12_12, var5_4);
                if (var10_10 == var9_8 /* !! */ ) break block8;
            }
            var13_13 = var3_2.element;
            var14_14 = var0.g(var13_13);
            var9_8 /* !! */  = new e72(var14_14);
        }
        return var9_8 /* !! */ ;
    }

    public static final LP1 b(LP1 lP1, dU2 dU22, pg2_0 pg2_02, Pg2 pg2, boolean bl2, boolean bl3, TR0 tR0, wr1_1 wr1_12, UD uD) {
        ScrollableElement scrollableElement = new ScrollableElement(uD, tR0, wr1_12, pg2_02, pg2, dU22, bl2, bl3);
        return lP1.then(scrollableElement);
    }
}

