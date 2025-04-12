/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from tZ
 */
public final class tz_2
extends qg3_2
implements Function2 {
    public dr_2 a;
    public byte[] b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ es0_2[] g;
    public final /* synthetic */ Function0 h;
    public final /* synthetic */ gx0_2 i;
    public final /* synthetic */ fs0_2 j;

    public tz_2(es0_2[] es0_2Array, MH3$b$a mH3$b$a, MH3$b$b mH3$b$b, fs0_2 fs0_22, f80_0 f80_02) {
        this.g = es0_2Array;
        this.h = mH3$b$a;
        this.i = mH3$b$b;
        this.j = fs0_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        tz_2 tz_22;
        fx0_2 fx0_22;
        Function0 function0 = fx0_22 = this.h;
        function0 = (MH3$b$a)fx0_22;
        fx0_2 fx0_23 = fx0_22 = this.i;
        fx0_23 = (MH3$b$b)fx0_22;
        es0_2[] es0_2Array = this.g;
        fs0_2 fs0_22 = this.j;
        fx0_22 = tz_22;
        tz_22 = new tz_2(es0_2Array, (MH3$b$a)function0, (MH3$b$b)fx0_23, fs0_22, f80_02);
        tz_22.f = object;
        return tz_22;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (tz_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((tz_2)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block12: {
            block10: {
                block11: {
                    var2_2 = this;
                    var3_3 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                    var4_4 = this.e;
                    var5_5 = k52_0.b;
                    var6_6 = 1;
                    var7_7 = 3;
                    var8_8 = 0;
                    var9_9 = 2;
                    if (var4_4 == 0) break block10;
                    if (var4_4 == var6_6) break block11;
                    if (var4_4 == var9_9) ** GOTO lbl26
                    if (var4_4 == var7_7) {
                        var4_4 = this.d;
                        var10_10 = this.c;
                        var11_11 /* !! */  = this.b;
                        var12_12 = this.a;
                        var13_13 /* !! */  = (Object[])this.f;
                        vl2_2.b(var1_1);
                        var8_8 = var4_4;
                        var14_14 = var11_11 /* !! */ ;
                        var11_11 /* !! */  = (byte[])var13_13 /* !! */ ;
                        var15_15 = null;
                    } else {
                        var3_3 /* !! */  = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var3_3 /* !! */ ;
lbl26:
                        // 1 sources

                        var4_4 = this.d;
                        var10_10 = this.c;
                        var11_11 /* !! */  = this.b;
                        var12_12 = this.a;
                        var13_13 /* !! */  = (Object[])this.f;
                        vl2_2.b(var1_1);
                        var8_8 = var4_4;
                        var14_14 = var11_11 /* !! */ ;
                        var11_11 /* !! */  = (byte[])var13_13 /* !! */ ;
                    }
                    break block12;
                }
                var4_4 = this.d;
                var10_10 = this.c;
                var11_11 /* !! */  = this.b;
                var12_12 = this.a;
                var13_13 /* !! */  = (Object[])this.f;
                vl2_2.b(var1_1);
                var16_16 = var1_1;
                var16_16 = ((vr_2)var1_1).a;
                var8_8 = var4_4;
                var14_14 = var11_11 /* !! */ ;
                var11_11 /* !! */  = (byte[])var13_13 /* !! */ ;
                ** GOTO lbl87
            }
            vl2_2.b(var1_1);
            var14_14 = (i90_0)this.f;
            var17_17 = this.g;
            var10_10 = var17_17.length;
            if (var10_10 == 0) {
                return Unit.a;
            }
            var11_11 /* !! */  = (byte[])new Object[var10_10];
            rp_1.n(0, var10_10, var5_5, var11_11 /* !! */ );
            var18_18 = 6;
            var19_19 = false;
            var13_13 /* !! */  = null;
            var12_12 = sr_2.a(var10_10, var18_18, null);
            var15_15 = new AtomicInteger(var10_10);
            for (var20_20 = 0; var20_20 < var10_10; ++var20_20) {
                var22_22 /* !! */  = var2_2.g;
                var16_16 = var21_21;
                var21_21 = var22_22 /* !! */ ;
                var22_22 /* !! */  = var12_12;
                var16_16((es0_2[])var21_21, var20_20, var15_15, (le_2)var12_12, null);
                Ae3.d((i90_0)var14_14, null, null, (Function2)var16_16, var7_7);
                var8_8 = 0;
            }
            var14_14 = new byte[var10_10];
            var8_8 = 0;
        }
        while (true) {
            var8_8 = (byte)(var8_8 + var6_6);
            var2_2.f = var11_11 /* !! */ ;
            var2_2.a = var12_12;
            var2_2.b = (byte[])var14_14;
            var2_2.c = var10_10;
            var2_2.d = var8_8;
            var2_2.e = var6_6;
            var16_16 = var12_12.f(var2_2);
            if (var16_16 == var3_3 /* !! */ ) {
                return var3_3 /* !! */ ;
            }
lbl87:
            // 3 sources

            var13_13 /* !! */  = (IndexedValue)vr_2.a(var16_16);
            if (var13_13 /* !! */  == null) {
                return Unit.a;
            }
            do {
                var23_23 = var13_13 /* !! */ .a;
                var21_21 = var11_11 /* !! */ [var23_23];
                var13_13 /* !! */  = var13_13 /* !! */ .b;
                var11_11 /* !! */ [var23_23] = (byte)var13_13 /* !! */ ;
                if (var21_21 == var5_5) {
                    var10_10 += -1;
                }
                if ((var19_19 = var14_14[var23_23]) == var8_8) break;
                var19_19 = (byte)var8_8;
                var14_14[var23_23] = var19_19;
            } while ((var13_13 /* !! */  = (IndexedValue)vr_2.a(var12_12.m())) != null);
            if (var10_10 != 0) continue;
            var13_13 /* !! */  = (Object[])var2_2.h.invoke();
            var16_16 = var2_2.j;
            var21_21 = var2_2.i;
            if (var13_13 /* !! */  == null) {
                var2_2.f = var11_11 /* !! */ ;
                var2_2.a = var12_12;
                var2_2.b = (byte[])var14_14;
                var2_2.c = var10_10;
                var2_2.d = var8_8;
                var2_2.e = var9_9;
                var13_13 /* !! */  = var21_21.invoke(var16_16, var11_11 /* !! */ , var2_2);
                if (var13_13 /* !! */  != var3_3 /* !! */ ) continue;
                return var3_3 /* !! */ ;
            }
            var20_20 = 14;
            var15_15 = null;
            rp_1.k(var11_11 /* !! */ , 0, var13_13 /* !! */ , 0, var20_20);
            var2_2.f = var11_11 /* !! */ ;
            var2_2.a = var12_12;
            var2_2.b = (byte[])var14_14;
            var2_2.c = var10_10;
            var2_2.d = var8_8;
            var2_2.e = var7_7;
            if ((var13_13 /* !! */  = var21_21.invoke(var16_16, var13_13 /* !! */ , var2_2)) == var3_3 /* !! */ ) break;
        }
        return var3_3 /* !! */ ;
    }
}

