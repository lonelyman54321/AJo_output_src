/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyCharacterMap
 *  android.view.KeyEvent
 */
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import java.util.List;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;

/*
 * Renamed from Ck3
 */
public final class ck3_0
extends FunctionReferenceImpl
implements Function1 {
    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        var1_1 = ((Yn1)var1_1).a;
        var2_2 = (Bk3)this.receiver;
        var2_2.getClass();
        var3_3 = var1_1.getAction();
        var4_4 = 0;
        var5_5 = null;
        var6_6 = 1;
        if (var3_3 != 0 || (var3_3 = (int)Character.isISOControl(var1_1.getUnicodeChar())) != 0) ** GOTO lbl-1000
        var7_7 = var2_2.i;
        var7_7.getClass();
        var8_8 = var1_1.getUnicodeChar();
        var9_9 = -1 << -1 & var8_8;
        if (var9_9 != 0) {
            var10_10 = var8_8 &= -1 >>> 1;
            var7_7.a = var10_10;
            var9_9 = 0;
            var11_11 = null;
        } else {
            var11_11 = var7_7.a;
            if (var11_11 != null) {
                var7_7.a = null;
                var3_3 = KeyCharacterMap.getDeadChar((int)var11_11.intValue(), (int)var8_8);
                var11_11 = var3_3;
                if (var3_3 == 0) {
                    var9_9 = 0;
                    var11_11 = null;
                }
                if (var11_11 == null) {
                    var11_11 = var8_8;
                }
            } else {
                var11_11 = var8_8;
            }
        }
        if (var11_11 != null) {
            var3_3 = var11_11.intValue();
            var10_10 = new StringBuilder();
            var7_7 = var10_10.appendCodePoint(var3_3).toString();
            var10_10 = new bz_0((String)var7_7, var6_6);
        } else lbl-1000:
        // 2 sources

        {
            var8_8 = 0;
            var10_10 = null;
        }
        var7_7 = var2_2.f;
        var9_9 = var2_2.d;
        var12_12 = 0;
        var13_13 = null;
        if (var10_10 != null) {
            if (var9_9 != 0) {
                var1_1 = a.b(var10_10);
                var2_2.a((List)var1_1);
                var7_7.a = null;
            } else {
                var6_6 = 0;
            }
            var12_12 = var6_6;
        } else {
            var4_4 = bo1_1.d((KeyEvent)var1_1);
            var8_8 = 2;
            if ((var4_4 = (int)ao1_2.a(var4_4, var8_8)) != 0 && (var1_1 = (var5_5 = var2_2.j).a((KeyEvent)var1_1)) != null && ((var4_4 = (int)var1_1.getEditsText()) == 0 || var9_9 != 0)) {
                var5_5 = new Ref$BooleanRef();
                var5_5.element = var6_6;
                var10_10 = new Ak3((Un1)var1_1, var2_2, (Ref$BooleanRef)var5_5);
                var11_11 = var2_2.a.d();
                var13_13 = var2_2.c;
                var14_14 = var2_2.g;
                var1_1 = new hk3_0(var13_13, var14_14, (Ul3)var11_11, (lm3)var7_7);
                var10_10.invoke(var1_1);
                var15_15 = var1_1.f;
                var17_16 = var13_13.b;
                var3_3 = (int)mm3.a(var15_15, var17_16);
                if (var3_3 == 0 || (var3_3 = (int)Intrinsics.areEqual(var7_7 = var1_1.g, var10_10 = var13_13.a)) == 0) {
                    var15_15 = var1_1.f;
                    var1_1 = var1_1.g;
                    var3_3 = 4;
                    var1_1 = ql3_0.a(var13_13, (Sl)var1_1, var15_15, var3_3);
                    var7_7 = var2_2.k;
                    var7_7.invoke(var1_1);
                }
                if ((var1_1 = var2_2.h) != null) {
                    var1_1.f = var6_6;
                }
                var12_12 = (int)var5_5.element;
            }
        }
        return (boolean)var12_12;
    }
}

