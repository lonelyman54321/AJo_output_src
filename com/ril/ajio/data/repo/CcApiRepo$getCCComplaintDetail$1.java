/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.CcApiRepo;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.CcApi;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

final class CcApiRepo$getCCComplaintDetail$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Map $bodyParams;
    final /* synthetic */ Ref$ObjectRef $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CcApiRepo this$0;

    public CcApiRepo$getCCComplaintDetail$1(CcApiRepo ccApiRepo, Ref$ObjectRef ref$ObjectRef, Map map2, f80_0 f80_02) {
        this.this$0 = ccApiRepo;
        this.$url = ref$ObjectRef;
        this.$bodyParams = map2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        CcApiRepo ccApiRepo = this.this$0;
        Ref$ObjectRef ref$ObjectRef = this.$url;
        Map map2 = this.$bodyParams;
        CcApiRepo$getCCComplaintDetail$1 ccApiRepo$getCCComplaintDetail$1 = new CcApiRepo$getCCComplaintDetail$1(ccApiRepo, ref$ObjectRef, map2, f80_02);
        ccApiRepo$getCCComplaintDetail$1.L$0 = object;
        return ccApiRepo$getCCComplaintDetail$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (CcApiRepo$getCCComplaintDetail$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((CcApiRepo$getCCComplaintDetail$1)object).invokeSuspend(object2);
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
                CcApi ccApi = CcApiRepo.access$getCcApi$p(this.this$0);
                Object object3 = object = this.$url.element;
                object3 = (String)object;
                object = CcApiRepo.access$getUserInformation$p(this.this$0);
                Intrinsics.checkNotNullExpressionValue(object, "access$getUserInformation$p(...)");
                object = ServiceUtil.getToken((UserInformation)object);
                String string2 = kp1_0.c("Bearer ", (String)object);
                String string3 = CcApiRepo.access$getClientType$cp();
                Intrinsics.checkNotNullExpressionValue(string3, "access$getClientType$cp(...)");
                String string4 = CcApiRepo.access$getClientVersion$cp();
                Map map2 = this.$bodyParams;
                this.L$0 = object2;
                this.label = n3;
                String string5 = "CC_COMPLAINT_DETAIL";
                object = ccApi.getCCComplaintDetail((String)object3, string2, string3, string4, string5, map2, this);
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

