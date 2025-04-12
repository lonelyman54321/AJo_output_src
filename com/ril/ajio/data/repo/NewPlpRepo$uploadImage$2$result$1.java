/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.NewPlpRepo;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class NewPlpRepo$uploadImage$2$result$1
extends qg3_2
implements Function2 {
    final /* synthetic */ pj2_2 $image;
    final /* synthetic */ String $uploadImageUrl;
    int label;
    final /* synthetic */ NewPlpRepo this$0;

    public NewPlpRepo$uploadImage$2$result$1(NewPlpRepo newPlpRepo, String string2, pj2_2 pj2_22, f80_0 f80_02) {
        this.this$0 = newPlpRepo;
        this.$uploadImageUrl = string2;
        this.$image = pj2_22;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        NewPlpRepo newPlpRepo = this.this$0;
        String string2 = this.$uploadImageUrl;
        pj2_2 pj2_22 = this.$image;
        object = new NewPlpRepo$uploadImage$2$result$1(newPlpRepo, string2, pj2_22, f80_02);
        return object;
    }

    public final Object invoke(i90_0 object, f80_0 object2) {
        object = (NewPlpRepo$uploadImage$2$result$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((NewPlpRepo$uploadImage$2$result$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 == 0) {
            vl2_2.b(object);
            object = NewPlpRepo.access$getPlpApiRepo$p(this.this$0);
            String string2 = this.$uploadImageUrl;
            pj2_2 pj2_22 = this.$image;
            this.label = n4;
            object = object.uploadImage(string2, pj2_22, this);
            if (object != j90_02) return object;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return object;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

