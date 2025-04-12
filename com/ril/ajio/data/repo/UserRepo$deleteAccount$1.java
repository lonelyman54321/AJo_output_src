/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.AJIOApplication;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.services.data.DeleteAccountRequest;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.UserApi;
import com.ril.ajio.services.network.api.UserApi$DefaultImpls;
import com.ril.ajio.services.utils.ServiceUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class UserRepo$deleteAccount$1
extends qg3_2
implements Function2 {
    final /* synthetic */ DeleteAccountRequest $deleteAccountRequest;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UserRepo this$0;

    public UserRepo$deleteAccount$1(UserRepo userRepo, String string2, DeleteAccountRequest deleteAccountRequest, f80_0 f80_02) {
        this.this$0 = userRepo;
        this.$url = string2;
        this.$deleteAccountRequest = deleteAccountRequest;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        UserRepo userRepo = this.this$0;
        String string2 = this.$url;
        DeleteAccountRequest deleteAccountRequest = this.$deleteAccountRequest;
        UserRepo$deleteAccount$1 userRepo$deleteAccount$1 = new UserRepo$deleteAccount$1(userRepo, string2, deleteAccountRequest, f80_02);
        userRepo$deleteAccount$1.L$0 = object;
        return userRepo$deleteAccount$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (UserRepo$deleteAccount$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((UserRepo$deleteAccount$1)object).invokeSuspend(object2);
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
                UserApi userApi = UserRepo.access$getUserApi$p(this.this$0);
                String string2 = this.$url;
                object = UserRepo.access$getUserInformation$p(this.this$0);
                Intrinsics.checkNotNullExpressionValue(object, "access$getUserInformation$p(...)");
                object = ServiceUtil.getToken((UserInformation)object);
                String string3 = kp1_0.c("Bearer ", (String)object);
                String string4 = em_1.a(AJIOApplication.Companion);
                DeleteAccountRequest deleteAccountRequest = this.$deleteAccountRequest;
                this.L$0 = object2;
                this.label = n3;
                int n8 = 32;
                String string5 = "Android";
                object = UserApi$DefaultImpls.deleteAccount$default(userApi, string2, string3, string5, string4, deleteAccountRequest, null, this, n8, null);
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

