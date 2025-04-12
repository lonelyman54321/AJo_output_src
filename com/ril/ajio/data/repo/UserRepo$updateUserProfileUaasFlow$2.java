/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.ApiErrorRepo;
import kotlin.Unit;

final class UserRepo$updateUserProfileUaasFlow$2
extends qg3_2
implements gx0_2 {
    final /* synthetic */ String $requestId;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public UserRepo$updateUserProfileUaasFlow$2(String string2, f80_0 f80_02) {
        this.$requestId = string2;
        super(3, f80_02);
    }

    public final Object invoke(fs0_2 object, Throwable throwable, f80_0 f80_02) {
        String string2 = this.$requestId;
        UserRepo$updateUserProfileUaasFlow$2 userRepo$updateUserProfileUaasFlow$2 = new UserRepo$updateUserProfileUaasFlow$2(string2, f80_02);
        userRepo$updateUserProfileUaasFlow$2.L$0 = object;
        userRepo$updateUserProfileUaasFlow$2.L$1 = throwable;
        object = Unit.a;
        return userRepo$updateUserProfileUaasFlow$2.invokeSuspend(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 1;
        if (n3 == 0) {
            Object object2;
            vl2_2.b(object);
            object = (fs0_2)this.L$0;
            Object object3 = object2 = this.L$1;
            object3 = (Throwable)object2;
            ApiErrorRepo apiErrorRepo = ApiErrorRepo.INSTANCE;
            String string2 = this.$requestId;
            int n7 = 28;
            object2 = ApiErrorRepo.handleApiException$default(apiErrorRepo, (Throwable)object3, string2, false, null, null, n7, null);
            apiErrorRepo = null;
            this.L$0 = null;
            this.label = n4;
            object = object.emit(object2, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        if (n3 == n4) {
            vl2_2.b(object);
            return Unit.a;
        }
        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        throw object;
    }
}

