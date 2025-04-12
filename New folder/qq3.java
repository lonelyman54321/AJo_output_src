/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.widget.Toast
 */
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.chuckerteam.chucker.R$string;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class qq3
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ rq3 b;

    public qq3(rq3 rq32, f80_0 f80_02) {
        this.b = rq32;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        rq3 rq32 = this.b;
        object = new qq3(rq32, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (qq3)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((qq3)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final Object invokeSuspend(Object var1_1) {
        block10: {
            block11: {
                block8: {
                    block9: {
                        block5: {
                            block6: {
                                block7: {
                                    var2_2 /* !! */  = j90_0.COROUTINE_SUSPENDED;
                                    var3_3 = this.a;
                                    var4_4 = 2;
                                    var5_5 = 1;
                                    var6_6 = this.b;
                                    if (var3_3 == 0) break block5;
                                    if (var3_3 == var5_5) break block6;
                                    if (var3_3 != var4_4) break block7;
                                    vl2_2.b(var1_1);
                                    break block8;
                                }
                                var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                throw var1_1;
                            }
                            vl2_2.b(var1_1);
                            break block9;
                        }
                        vl2_2.b(var1_1);
                        var1_1 = (gg1_0)var6_6.a.getValue();
                        this.a = var5_5;
                        var1_1.getClass();
                        var1_1 = bf0_0.a;
                        if (var1_1 != null) {
                            var1_1 = var1_1.a.b().g(this);
                            if (var1_1 == var2_2 /* !! */ ) {
                                return var2_2 /* !! */ ;
                            } else {
                                ** GOTO lbl29
                            }
                        }
                        break block10;
                    }
                    var7_7 = var1_1 = (List)var1_1;
                    var7_7 = (Collection)var1_1;
                    if (var7_7 != null && (var3_3 = (int)var7_7.isEmpty()) == 0) {
                        var8_8 = new oq3_0((List)var1_1);
                        var9_9 = var6_6.requireActivity();
                        Intrinsics.checkNotNullExpressionValue(var9_9, "requireActivity()");
                        var10_10 = R$string.chucker_share_all_transactions_title;
                        var11_11 = var6_6.getString(var10_10);
                        Intrinsics.checkNotNullExpressionValue(var11_11, "getString(R.string.chucker_share_all_transactions_title)");
                        var10_10 = R$string.chucker_share_all_transactions_subject;
                        var12_12 = var6_6.getString(var10_10);
                        Intrinsics.checkNotNullExpressionValue(var12_12, "getString(R.string.chucker_share_all_transactions_subject)");
                        this.a = var4_4;
                        var13_13 = "transactions.txt";
                        var14_14 = "transactions";
                        var1_1 = D13.a(var8_8, var9_9, var13_13, var11_11, var12_12, var14_14, this);
                        if (var1_1 == var2_2 /* !! */ ) {
                            return var2_2 /* !! */ ;
                        } else {
                            ** GOTO lbl49
                        }
                    }
                    break block11;
                }
                var1_1 = (Intent)var1_1;
                if (var1_1 != null) {
                    var6_6.startActivity((Intent)var1_1);
                }
                return Unit.a;
            }
            var1_1 = var6_6.requireContext();
            var15_15 = R$string.chucker_export_empty_text;
            Toast.makeText((Context)var1_1, (int)var15_15, (int)0).show();
            return Unit.a;
        }
        var2_2 /* !! */  = "You can't access the transaction repository if you don't initialize it!".toString();
        var1_1 = new IllegalStateException((String)var2_2 /* !! */ );
        throw var1_1;
    }
}

