/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.LoginRepository;
import kotlin.Unit;

final class LoginRepository$resetPasswordWithToken$2
extends qg3_2
implements gx0_2 {
    final /* synthetic */ String $requestID;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ LoginRepository this$0;

    public LoginRepository$resetPasswordWithToken$2(LoginRepository loginRepository, String string2, f80_0 f80_02) {
        this.this$0 = loginRepository;
        this.$requestID = string2;
        super(3, f80_02);
    }

    public final Object invoke(fs0_2 object, Throwable throwable, f80_0 f80_02) {
        LoginRepository loginRepository = this.this$0;
        String string2 = this.$requestID;
        LoginRepository$resetPasswordWithToken$2 loginRepository$resetPasswordWithToken$2 = new LoginRepository$resetPasswordWithToken$2(loginRepository, string2, f80_02);
        loginRepository$resetPasswordWithToken$2.L$0 = object;
        loginRepository$resetPasswordWithToken$2.L$1 = throwable;
        object = Unit.a;
        return loginRepository$resetPasswordWithToken$2.invokeSuspend(object);
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
            object = (fs0_2)this.L$0;
            Object object2 = (Throwable)this.L$1;
            LoginRepository loginRepository = this.this$0;
            String string2 = this.$requestID;
            String string3 = "";
            object2 = loginRepository.handleApiException((Throwable)object2, string2, n4 != 0, string3);
            loginRepository = null;
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

