/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class G12
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ F12 c;
    public final /* synthetic */ String d;

    public G12(int n3, F12 f12, String string2, f80_0 f80_02) {
        this.b = n3;
        this.c = f12;
        this.d = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        F12 f12 = this.c;
        String string2 = this.d;
        int n3 = this.b;
        object = new G12(n3, f12, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (G12)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((G12)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block12: {
            block13: {
                block10: {
                    block11: {
                        var2_2 = j90_0.COROUTINE_SUSPENDED;
                        var3_3 = this.a;
                        var4_4 = 1;
                        if (var3_3 == 0) break block10;
                        if (var3_3 != var4_4) break block11;
                        vl2_2.b(var1_1);
                        break block12;
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var1_1);
                var5_5 = 101;
                var3_3 = this.b;
                if (var3_3 == var5_5) break block13;
                var5_5 = 103;
                if (var3_3 != var5_5) {
                    var1_1 = "ajio";
lbl19:
                    // 3 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var1_1 = "ajiogram";
                ** GOTO lbl19
            }
            var1_1 = "luxe";
            ** while (true)
            var6_6 = var1_1;
            var1_1 = od3_2.a;
            var3_3 = var1_1.length();
            if (var3_3 == 0) {
                var1_1 = od3_2.a();
            }
            var3_3 = (int)s20.a;
            var7_7 = null;
            if (var3_3 == 0 && (var3_3 = (int)Intrinsics.areEqual(var8_8 = od3_2.a(), var10_10 = (var9_9 /* !! */  = ld3_2.STORE_AJIOGRAM).getStoreId())) == 0 && (var5_5 = (int)Intrinsics.areEqual(var1_1, var8_8 = var9_9 /* !! */ .getStoreId())) == 0) {
                var5_5 = 0;
                var1_1 = null;
            } else {
                var5_5 = 1;
            }
            var8_8 = this.c;
            if (var5_5 == 0) ** GOTO lbl-1000
            var1_1 = var8_8.d.M;
            if (var1_1 != null && (var1_1 = var1_1.getBrandDetails()) != null) {
                var1_1 = var1_1.getMetaData();
            } else {
                var5_5 = 0;
                var1_1 = null;
            }
            if (var1_1 != null) {
                var11_11 = true;
            } else lbl-1000:
            // 2 sources

            {
                var11_11 = false;
            }
            var7_7 = var8_8.e;
            this.a = var4_4;
            var12_12 = 8;
            var9_9 /* !! */  = this.d;
            var10_10 = "plp screen";
            var1_1 = BH3.b(var7_7, (String)var9_9 /* !! */ , (String)var6_6, var10_10, null, var11_11, this, var12_12);
            if (var1_1 == var2_2) {
                return var2_2;
            }
        }
        return Unit.a;
    }
}

