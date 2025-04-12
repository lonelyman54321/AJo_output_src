/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.rto.entity.RtoFirebaseData;
import com.ril.ajio.services.data.Order.RTORequestData;
import com.ril.ajio.services.data.Order.RtoResponseData;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.g;

/*
 * Renamed from LQ2
 */
public final class lq2_0
extends jD3 {
    public final DQ2 a;
    public String b;
    public String c;
    public RtoResponseData d;
    public final zr1_1 e;
    public final zr1_1 f;
    public final hh3_2 g;
    public final R53 h;
    public final R53 i;
    public final R53 j;
    public final R53 k;
    public RtoFirebaseData l;

    public lq2_0(DQ2 object) {
        Intrinsics.checkNotNullParameter(object, "rtoRepo");
        this.a = object;
        this.e = object = new zr1_1();
        this.f = object;
        object = new Object();
        this.g = object = yr1_2.b((Function0)object);
        this.h = object = new R53();
        this.i = object;
        this.j = object = new R53();
        this.k = object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static final Object b(lq2_0 var0, RTORequestData var1_1, f80_0 var2_2) {
        block13: {
            block10: {
                block14: {
                    block12: {
                        block11: {
                            block7: {
                                block8: {
                                    block9: {
                                        var0.getClass();
                                        var3_3 = var2_2 instanceof JQ2;
                                        if (!var3_3) ** GOTO lbl-1000
                                        var4_4 = var2_2;
                                        var4_4 = (JQ2)var2_2;
                                        var5_5 = var4_4.d;
                                        var6_6 = -1 << -1;
                                        var7_7 = var5_5 & var6_6;
                                        if (var7_7 != 0) {
                                            var4_4.d = var5_5 -= var6_6;
                                        } else lbl-1000:
                                        // 2 sources

                                        {
                                            var4_4 = new JQ2((lq2_0)var0, (f80_0)var2_2);
                                        }
                                        var2_2 = var4_4.b;
                                        var8_8 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                        var6_6 = var4_4.d;
                                        var7_7 = 2;
                                        var9_9 = 1;
                                        if (var6_6 == 0) break block7;
                                        if (var6_6 == var9_9) break block8;
                                        if (var6_6 != var7_7) break block9;
                                        vl2_2.b(var2_2);
                                        break block10;
                                    }
                                    var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    throw var0;
                                }
                                var0 = var4_4.a;
                                vl2_2.b(var2_2);
                                break block11;
                            }
                            vl2_2.b(var2_2);
                            var2_2 = UrlHelper.Companion.getInstance();
                            var10_10 = new Object[]{};
                            var11_11 = "order";
                            var12_12 = "rto_data";
                            var2_2 = var2_2.getApiUrl(var11_11, var12_12, (Object[])var10_10);
                            var10_10 = var0.d();
                            var6_6 = (int)var10_10.isUserOnline();
                            if (var6_6 != 0) {
                                var10_10 = ServiceUtil.getToken(var0.d());
                                var11_11 = "Bearer ";
                                var10_10 = kp1_0.c(var11_11, (String)var10_10);
                            } else {
                                var6_6 = 0;
                                var10_10 = null;
                            }
                            if (var10_10 == null) break block12;
                            var4_4.a = var0;
                            var4_4.d = var9_9;
                            var13_13 = var0.a.a;
                            if ((var2_2 = var13_13.submitFeedback((String)var2_2, (String)var10_10, (RTORequestData)var1_1, var4_4)) == var8_8 /* !! */ ) break block13;
                        }
                        var2_2 = (dl2_2)var2_2;
                        break block14;
                    }
                    var2_2 = null;
                }
                var1_1 = ir0_2.a;
                var1_1 = bg1_1.a;
                var10_10 = new kq2_0((lq2_0)var0, (dl2_2)var2_2, null);
                var4_4.a = null;
                var4_4.d = var7_7;
                var0 = Ae3.g(var4_4, (CoroutineContext)var1_1, (Function2)var10_10);
                if (var0 == var8_8 /* !! */ ) break block13;
            }
            var8_8 /* !! */  = Unit.a;
        }
        return var8_8 /* !! */ ;
    }

    public final void c() {
        boolean bl2 = EQ2.a;
        if (!bl2) {
            aW aW2 = md3_0.c(this);
            gq2_1 gq2_12 = new gq2_1(this, null);
            int n3 = 3;
            Ae3.d(aW2, null, null, gq2_12, n3);
        }
    }

    public final UserInformation d() {
        Object object = this.g.getValue();
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (UserInformation)object;
    }

    public final void e(boolean bl2) {
        Object object;
        if (bl2) {
            object = this.l;
            if (object != null) {
                object = ((RtoFirebaseData)object).getDefaultReason();
            } else {
                bl2 = false;
                object = null;
            }
        } else {
            object = this.b;
        }
        aW aW2 = md3_0.c(this);
        g g3 = ir0_2.a;
        g3 = em0_2.b;
        LQ2$a lQ2$a = new LQ2$a(this, (String)object, null);
        Ae3.d(aW2, g3, null, lQ2$a, 2);
    }
}

