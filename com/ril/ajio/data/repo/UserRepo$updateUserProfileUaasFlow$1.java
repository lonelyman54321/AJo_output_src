/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.AJIOApplication;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.Login.ResetPasswordUpdateUaas;
import com.ril.ajio.services.data.Login.ValidateOTPData;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.UserApi;
import com.ril.ajio.services.network.api.UserApi$DefaultImpls;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class UserRepo$updateUserProfileUaasFlow$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Map $fieldMap;
    final /* synthetic */ String $requestId;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UserRepo this$0;

    public UserRepo$updateUserProfileUaasFlow$1(UserRepo userRepo, String string2, Map map2, String string3, f80_0 f80_02) {
        this.this$0 = userRepo;
        this.$url = string2;
        this.$fieldMap = map2;
        this.$requestId = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        UserRepo userRepo = this.this$0;
        String string2 = this.$url;
        Map map2 = this.$fieldMap;
        String string3 = this.$requestId;
        UserRepo$updateUserProfileUaasFlow$1 userRepo$updateUserProfileUaasFlow$1 = new UserRepo$updateUserProfileUaasFlow$1(userRepo, string2, map2, string3, f80_02);
        userRepo$updateUserProfileUaasFlow$1.L$0 = object;
        return userRepo$updateUserProfileUaasFlow$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (UserRepo$updateUserProfileUaasFlow$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((UserRepo$updateUserProfileUaasFlow$1)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block8: {
            int n3;
            Object object2;
            int n4;
            String string2;
            Map map2;
            String string3;
            Object object3;
            Object object4;
            Object object5;
            Object object6;
            int n7;
            int n8;
            int n10;
            j90_0 j90_02;
            UserRepo$updateUserProfileUaasFlow$1 userRepo$updateUserProfileUaasFlow$1;
            block9: {
                block6: {
                    block7: {
                        userRepo$updateUserProfileUaasFlow$1 = this;
                        j90_02 = j90_0.COROUTINE_SUSPENDED;
                        int n14 = this.label;
                        n10 = 3;
                        n8 = 2;
                        n7 = 1;
                        if (n14 == 0) break block6;
                        if (n14 == n7) break block7;
                        if (n14 != n8 && n14 != n10) {
                            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            throw illegalStateException;
                        }
                        vl2_2.b(object);
                        break block8;
                    }
                    object6 = (fs0_2)this.L$0;
                    vl2_2.b(object);
                    object5 = object6;
                    object6 = object;
                    break block9;
                }
                vl2_2.b(object);
                object5 = object6 = this.L$0;
                object5 = (fs0_2)object6;
                object6 = UserRepo.access$getUserApi$p(this.this$0);
                object4 = this.$url;
                object3 = UserRepo.access$getUserInformation$p(this.this$0);
                Intrinsics.checkNotNullExpressionValue(object3, "access$getUserInformation$p(...)");
                object3 = ServiceUtil.getToken((UserInformation)object3);
                object3 = kp1_0.c("Bearer ", (String)object3);
                string3 = em_1.a(AJIOApplication.Companion);
                map2 = this.$fieldMap;
                string2 = this.$requestId;
                this.L$0 = object5;
                this.label = n7;
                n4 = 64;
                object2 = object4;
                object4 = object3;
                object3 = "Android";
                n3 = 0;
                object6 = UserApi$DefaultImpls.updateUserProfileUaasFlowResetPassword$default((UserApi)object6, (String)object2, (String)object4, (String)object3, string3, map2, string2, null, this, n4, null);
                if (object6 == j90_02) {
                    return j90_02;
                }
            }
            object4 = object6;
            object4 = (dl2_2)object6;
            object6 = (ResetPasswordUpdateUaas)((dl2_2)object4).b;
            n4 = 0;
            if (object6 != null && (n7 = (int)(((cl2_2)(object2 = ((dl2_2)object4).a)).d() ? 1 : 0)) != 0) {
                object2 = ((ResetPasswordUpdateUaas)object6).getMessage();
                ((ValidateOTPData)object6).setDesc((String)object2);
                ((ValidateOTPData)object6).setStatus("success");
                object2 = DataCallback.Companion;
                object6 = ((DataCallback$Companion)object2).onSuccess(object6);
                userRepo$updateUserProfileUaasFlow$1.L$0 = null;
                userRepo$updateUserProfileUaasFlow$1.label = n8;
                object6 = object5.emit(object6, userRepo$updateUserProfileUaasFlow$1);
                if (object6 == j90_02) {
                    return j90_02;
                }
            } else {
                object2 = ApiErrorRepo.INSTANCE;
                object3 = userRepo$updateUserProfileUaasFlow$1.$requestId;
                map2 = null;
                string2 = null;
                string3 = null;
                n3 = 28;
                object6 = ApiErrorRepo.handleApiError$default((ApiErrorRepo)object2, (dl2_2)object4, (String)object3, false, null, null, n3, null);
                userRepo$updateUserProfileUaasFlow$1.L$0 = null;
                userRepo$updateUserProfileUaasFlow$1.label = n10;
                if ((object6 = object5.emit(object6, userRepo$updateUserProfileUaasFlow$1)) == j90_02) {
                    return j90_02;
                }
            }
        }
        return Unit.a;
    }
}

