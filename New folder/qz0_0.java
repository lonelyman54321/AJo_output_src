/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.drawable.BitmapDrawable
 */
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/*
 * Renamed from Qz0
 */
public final class qz0_0
extends qg3_2
implements Function2 {
    public List a;
    public ba2 b;
    public int c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ kz0_0 g;
    public final /* synthetic */ Kz0$a h;
    public final /* synthetic */ ba2 i;
    public final /* synthetic */ List j;
    public final /* synthetic */ GB0 k;
    public final /* synthetic */ pe1_0 l;

    public qz0_0(kz0_0 kz0_02, Kz0$a kz0$a, ba2 ba22, List list, GB0 gB0, pe1_0 pe1_02, f80_0 f80_02) {
        this.g = kz0_02;
        this.h = kz0$a;
        this.i = ba22;
        this.j = list;
        this.k = gB0;
        this.l = pe1_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        GB0 gB0 = this.k;
        pe1_0 pe1_02 = this.l;
        kz0_0 kz0_02 = this.g;
        Kz0$a kz0$a = this.h;
        ba2 ba22 = this.i;
        List list = this.j;
        qz0_0 qz0_02 = new qz0_0(kz0_02, kz0$a, ba22, list, gB0, pe1_02, f80_02);
        qz0_02.f = object;
        return qz0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (qz0_0)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qz0_0)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block9: {
            block8: {
                block6: {
                    block7: {
                        var2_2 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                        var3_3 = this.e;
                        var4_4 /* !! */  = this.k;
                        var5_5 = this.h;
                        var6_6 = 1;
                        if (var3_3 == 0) break block6;
                        if (var3_3 != var6_6) break block7;
                        var3_3 = this.d;
                        var7_7 = this.c;
                        var8_8 = this.b;
                        var9_9 = this.a;
                        var10_10 /* !! */  = (i90_0)this.f;
                        vl2_2.b(var1_1);
                        ** GOTO lbl63
                    }
                    var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw var1_1;
                }
                vl2_2.b(var1_1);
                var1_1 = (i90_0)this.f;
                var11_11 /* !! */  = var5_5.a;
                var12_12 = this.g;
                var12_12.getClass();
                var7_7 = var11_11 /* !! */  instanceof BitmapDrawable;
                var8_8 = this.i;
                if (var7_7 == 0) break block8;
                var12_12 = var11_11 /* !! */ ;
                var12_12 = ((BitmapDrawable)var11_11 /* !! */ ).getBitmap();
                var9_9 = var12_12.getConfig();
                if (var9_9 == null) {
                    var9_9 = Bitmap.Config.ARGB_8888;
                }
                if ((var13_13 = tp_2.w(var10_10 /* !! */  = m.a, var9_9)) != 0) break block9;
            }
            var12_12 = var8_8.b;
            var9_9 = var8_8.d;
            var10_10 /* !! */  = var8_8.e;
            var14_14 = var8_8.f;
            var12_12 = vu0_0.a(var11_11 /* !! */ , (Bitmap.Config)var12_12, (B63)var9_9, (WS2)var10_10 /* !! */ , var14_14);
        }
        var4_4 /* !! */ .getClass();
        var11_11 /* !! */  = this.j;
        var9_9 = var11_11 /* !! */ ;
        var13_13 = ((Collection)var11_11 /* !! */ ).size();
        var10_10 /* !! */  = var1_1;
        var1_1 = var12_12;
        var12_12 = null;
        var9_9 = var11_11 /* !! */ ;
        var3_3 = var13_13;
        for (var7_7 = 0; var7_7 < var3_3; var7_7 += var6_6) {
            var1_1 = (Yq3)var9_9.get(var7_7);
            var15_15 = var8_8.d;
            this.f = var10_10 /* !! */ ;
            var15_15 = var9_9;
            this.a = var15_15 = (List)var9_9;
            this.b = var8_8;
            this.c = var7_7;
            this.d = var3_3;
            this.e = var6_6;
            if ((var1_1 = var1_1.b()) == var2_2 /* !! */ ) {
                return var2_2 /* !! */ ;
            }
lbl63:
            // 3 sources

            var1_1 = (Bitmap)var1_1;
            var15_15 = var10_10 /* !! */ .getCoroutineContext();
            mm0.c((CoroutineContext)var15_15);
        }
        var4_4 /* !! */ .getClass();
        var2_2 /* !! */  = this.l.a.getResources();
        var11_11 /* !! */  = new BitmapDrawable((Resources)var2_2 /* !! */ , (Bitmap)var1_1);
        var16_16 = var5_5.b;
        var4_4 /* !! */  = var5_5.c;
        var5_5 = var5_5.d;
        var2_2 /* !! */  = new Kz0$a(var11_11 /* !! */ , var16_16, (ri0)var4_4 /* !! */ , (String)var5_5);
        return var2_2 /* !! */ ;
    }
}

