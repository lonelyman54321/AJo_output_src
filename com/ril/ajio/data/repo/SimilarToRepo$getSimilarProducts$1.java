/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.SimilarToRepo;
import com.ril.ajio.services.network.api.PDPApi;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class SimilarToRepo$getSimilarProducts$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $cohortIds;
    final /* synthetic */ HashMap $params;
    final /* synthetic */ String $similarUrl;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SimilarToRepo this$0;

    public SimilarToRepo$getSimilarProducts$1(SimilarToRepo similarToRepo, String string2, String string3, HashMap hashMap, f80_0 f80_02) {
        this.this$0 = similarToRepo;
        this.$similarUrl = string2;
        this.$cohortIds = string3;
        this.$params = hashMap;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        SimilarToRepo similarToRepo = this.this$0;
        String string2 = this.$similarUrl;
        String string3 = this.$cohortIds;
        HashMap hashMap = this.$params;
        SimilarToRepo$getSimilarProducts$1 similarToRepo$getSimilarProducts$1 = new SimilarToRepo$getSimilarProducts$1(similarToRepo, string2, string3, hashMap, f80_02);
        similarToRepo$getSimilarProducts$1.L$0 = object;
        return similarToRepo$getSimilarProducts$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (SimilarToRepo$getSimilarProducts$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((SimilarToRepo$getSimilarProducts$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block5: {
            Object object2;
            int n3;
            int n4;
            j90_0 j90_02;
            block6: {
                block2: {
                    block3: {
                        block4: {
                            j90_02 = j90_0.COROUTINE_SUSPENDED;
                            int n7 = this.label;
                            n4 = 2;
                            n3 = 1;
                            if (n7 == 0) break block2;
                            if (n7 == n3) break block3;
                            if (n7 != n4) break block4;
                            vl2_2.b(object);
                            break block5;
                        }
                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        throw object;
                    }
                    object2 = (fs0_2)this.L$0;
                    vl2_2.b(object);
                    break block6;
                }
                vl2_2.b(object);
                object2 = object = this.L$0;
                object2 = (fs0_2)object;
                PDPApi pDPApi = SimilarToRepo.access$getPdpApi$p(this.this$0);
                String string2 = this.$similarUrl;
                String string3 = SimilarToRepo.access$getClientType$cp();
                String string4 = SimilarToRepo.access$getClientVersion$cp();
                String string5 = this.$cohortIds;
                HashMap hashMap = this.$params;
                this.L$0 = object2;
                this.label = n3;
                String string6 = "BackGround_SimilarProductList";
                object = pDPApi.getSimilarProducts(string2, string3, string4, string5, hashMap, string6, this);
                if (object == j90_02) {
                    return j90_02;
                }
            }
            n3 = 0;
            this.L$0 = null;
            this.label = n4;
            object = object2.emit(object, this);
            if (object == j90_02) {
                return j90_02;
            }
        }
        return Unit.a;
    }
}

