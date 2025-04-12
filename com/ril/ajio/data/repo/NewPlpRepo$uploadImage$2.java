/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.data.repo.NewPlpRepo$uploadImage$2$result$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class NewPlpRepo$uploadImage$2
extends qg3_2
implements Function2 {
    final /* synthetic */ pj2_2 $image;
    final /* synthetic */ String $uploadImageUrl;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ NewPlpRepo this$0;

    public NewPlpRepo$uploadImage$2(NewPlpRepo newPlpRepo, String string2, pj2_2 pj2_22, f80_0 f80_02) {
        this.this$0 = newPlpRepo;
        this.$uploadImageUrl = string2;
        this.$image = pj2_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        NewPlpRepo newPlpRepo = this.this$0;
        String string2 = this.$uploadImageUrl;
        pj2_2 pj2_22 = this.$image;
        NewPlpRepo$uploadImage$2 newPlpRepo$uploadImage$2 = new NewPlpRepo$uploadImage$2(newPlpRepo, string2, pj2_22, f80_02);
        newPlpRepo$uploadImage$2.L$0 = object;
        return newPlpRepo$uploadImage$2;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (NewPlpRepo$uploadImage$2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((NewPlpRepo$uploadImage$2)object).invokeSuspend(object2);
    }

    /*
     * Unable to fully structure code
     */
    public final Object invokeSuspend(Object var1_1) {
        block7: {
            block8: {
                block4: {
                    block5: {
                        block6: {
                            var2_2 = j90_0.COROUTINE_SUSPENDED;
                            var3_3 = this.label;
                            var4_4 = 2;
                            var5_5 = 1;
                            if (var3_3 == 0) break block4;
                            if (var3_3 == var5_5) break block5;
                            if (var3_3 != var4_4) break block6;
                            var2_2 = (zr1_1)this.L$0;
                            vl2_2.b(var1_1);
                            break block7;
                        }
                        var1_1 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw var1_1;
                    }
                    var6_6 = (zr1_1)this.L$1;
                    var7_7 = (vn0_2)this.L$0;
                    vl2_2.b(var1_1);
                    break block8;
                }
                vl2_2.b(var1_1);
                var1_1 = (i90_0)this.L$0;
                var7_7 = this.this$0;
                var8_8 = this.$uploadImageUrl;
                var9_9 = this.$image;
                var6_6 = new NewPlpRepo$uploadImage$2$result$1((NewPlpRepo)var7_7, var8_8, var9_9, null);
                var10_10 = 3;
                var7_7 = Ae3.a((i90_0)var1_1, null, (Function2)var6_6, var10_10);
                var1_1 = NewPlpRepo.access$getUploadImageStatusObserver$p(this.this$0);
                this.L$0 = var7_7;
                this.L$1 = var1_1;
                this.label = var5_5;
                var6_6 = var7_7.D(this);
                if (var6_6 == var2_2) {
                    return var2_2;
                }
                var11_11 = var6_6;
                var6_6 = var1_1;
                var1_1 = var11_11;
            }
            var1_1 = ((dl2_2)var1_1).a;
            var12_12 = (int)var1_1.d();
            if (var12_12 != 0) ** GOTO lbl57
            this.L$0 = var6_6;
            this.L$1 = null;
            this.label = var4_4;
            var1_1 = var7_7.y0(this);
            if (var1_1 == var2_2) {
                return var2_2;
            }
            var2_2 = var6_6;
        }
        var1_1 = ((dl2_2)var1_1).a;
        var12_12 = var1_1.d;
        var3_3 = 20000;
        if (var12_12 != var3_3) {
            var5_5 = 0;
        } else {
            var6_6 = var2_2;
lbl57:
            // 2 sources

            var2_2 = var6_6;
        }
        var1_1 = (boolean)var5_5;
        var2_2.k(var1_1);
        return Unit.a;
    }
}

