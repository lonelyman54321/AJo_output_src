/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.foundation.a;
import androidx.compose.foundation.d;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.ratings.PopUpImageModel;
import com.ril.ajio.services.data.ratings.UserReviewModel;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from IA2
 */
public final class ia2_2
extends Lambda
implements Function2 {
    public final /* synthetic */ tr1_0 c;
    public final /* synthetic */ C50 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ PopUpImageModel f;
    public final /* synthetic */ int g;
    public final /* synthetic */ UserReviewModel h;
    public final /* synthetic */ i90_0 i;
    public final /* synthetic */ tr1_0 j;
    public final /* synthetic */ tr1_0 k;

    public ia2_2(tr1_0 tr1_02, C50 c50, Function0 function0, PopUpImageModel popUpImageModel, int n3, UserReviewModel userReviewModel, i90_0 i90_02, tr1_0 tr1_03, tr1_0 tr1_04) {
        this.c = tr1_02;
        this.d = c50;
        this.e = function0;
        this.f = popUpImageModel;
        this.g = n3;
        this.h = userReviewModel;
        this.i = i90_02;
        this.j = tr1_03;
        this.k = tr1_04;
        super(2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1, Object var2_2) {
        block5: {
            block4: {
                var3_3 = this;
                var4_4 = var1_1;
                var4_4 = (b30_0)var1_1;
                var5_5 = var2_2;
                var5_5 = (Number)var2_2;
                var6_6 = var5_5.intValue();
                var7_7 = 3;
                var8_8 = 2;
                if ((var6_6 &= var7_7) != var8_8 || (var6_6 = (int)var4_4.h()) == 0) break block4;
                var4_4.D();
                break block5;
            }
            var5_5 = var3_3.c;
            var9_9 = Unit.a;
            var5_5.setValue(var9_9);
            var5_5 = var3_3.d;
            var5_5.getClass();
            var5_5.f();
            var4_4.K(-2065565525);
            var5_5 = var5_5.e().a;
            var9_9 = var5_5.d();
            var10_10 = var5_5.d();
            var11_11 = LP1$a.b;
            var5_5 = androidx.compose.foundation.layout.j.c;
            var12_12 = OX.k;
            var14_13 = fg2_1.a;
            var5_5 = a.b((LP1)var5_5, var12_12, var14_13);
            var16_15 = var3_3.j;
            var17_16 = var3_3.k;
            var18_17 = var3_3.i;
            var19_18 = var3_3.g;
            var15_14 = new ea2_2((i90_0)var18_17, var19_18, var16_15, (tr1_0)var17_16);
            var20_19 = 0.0f;
            var5_5 = androidx.compose.foundation.d.b((LP1)var5_5, false, null, (Function0)var15_14, 7);
            var15_14 = fa2_2.a;
            var15_14 = C50.c((LP1)var5_5, (t50)var9_9, (Function1)var15_14);
            var18_17 = var3_3.f;
            var5_5 = var18_17.getImageUrl();
            var21_20 = 3.105402E33f;
            var4_4.u(1998134191);
            var22_21 = 8;
            var5_5 = u63.a(var5_5, (b30_0)var4_4, var22_21);
            var4_4.I();
            var23_22 = R$string.product_image;
            var9_9 = hv3_0.K(var23_22);
            var9_9 = LO1.a(var19_18, (String)var9_9, " ");
            var24_23 = i70$a.a;
            var25_24 = 24576;
            var26_25 = 104;
            var16_15 = null;
            var27_26 = 8;
            var17_16 = var24_23;
            var28_27 = var18_17;
            var18_17 = null;
            var19_18 = 0;
            var24_23 = null;
            var29_28 = 0.0f;
            var30_29 = var4_4;
            var7_7 = 0;
            var31_30 = var14_13;
            Pd1.a((im2)var5_5, (String)var9_9, (LP1)var15_14, null, (i70_0)var17_16, 0.0f, null, (b30_0)var4_4, var25_24, var26_25);
            var4_4.K(-2144802161);
            var5_5 = OD2.a(var3_3.h);
            var9_9 = "REJECTED";
            var6_6 = (int)Intrinsics.areEqual(var5_5, var9_9);
            if (var6_6 != 0) ** GOTO lbl-1000
            var5_5 = var28_27.getImageStatus();
            if (var5_5 != null) {
                var15_14 = Locale.ROOT;
                var30_29 = var5_5.toUpperCase((Locale)var15_14);
                var5_5 = "toUpperCase(...)";
                Intrinsics.checkNotNullExpressionValue(var30_29, (String)var5_5);
            } else {
                var30_29 = null;
                var20_19 = 0.0f;
            }
            var6_6 = (int)Intrinsics.areEqual(var30_29, var9_9);
            if (var6_6 != 0) {
                var6_6 = R$string.rejected;
                var5_5 = nk_0.f((b30_0)var4_4, var6_6);
                var12_12 = xx_1.E;
                var32_31 = Em3.f(var27_26);
                var23_22 = 54;
                var21_20 = var23_22;
                var9_9 = androidx.compose.foundation.layout.j.k(var11_11, var21_20);
                var34_32 = xx_1.R;
                var9_9 = a.b((LP1)var9_9, var34_32, var31_30);
                var29_28 = var8_8;
                var20_19 = (float)false;
                var9_9 = androidx.compose.foundation.layout.h.h((LP1)var9_9, var29_28, var20_19, var29_28, var29_28);
                var24_23 = ca2_2.a;
                var9_9 = C50.c((LP1)var9_9, (t50)var10_10, (Function1)var24_23);
                var10_10 = new Cj3(3);
                var36_33 = 130544;
                var19_18 = 0;
                var29_28 = 0.0f;
                var24_23 = null;
                var20_19 = 0.0f;
                var30_29 = null;
                var37_34 = 0L;
                var8_8 = 0;
                var39_35 = 0L;
                var25_24 = 0;
                var26_25 = 0;
                var27_26 = 0;
                var28_27 = null;
                var41_36 = 3456;
                var42_37 = var4_4;
                var4_4 = var10_10;
                Ll3.b((String)var5_5, (LP1)var9_9, var12_12, var32_31, null, null, null, var37_34, null, (Cj3)var10_10, var39_35, 0, false, 0, 0, null, null, (b30_0)var42_37, var41_36, 0, var36_33);
            } else lbl-1000:
            // 2 sources

            {
                var42_37 = var4_4;
            }
            var42_37.E();
            var42_37.E();
        }
        return Unit.a;
    }
}

