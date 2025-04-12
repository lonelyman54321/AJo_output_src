/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.LoginRepository;
import com.ril.ajio.services.data.user.User;
import com.ril.ajio.services.data.user.UserInformationModel;
import com.ril.ajio.services.network.api.LoginApi;
import com.ril.ajio.services.network.api.LoginApi$DefaultImpls;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class LoginRepository$loginAnonymousUser$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Map $fieldMap;
    final /* synthetic */ String $requestID;
    final /* synthetic */ String $screenName;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoginRepository this$0;

    public LoginRepository$loginAnonymousUser$1(LoginRepository loginRepository, String string2, Map map2, String string3, String string4, f80_0 f80_02) {
        this.this$0 = loginRepository;
        this.$url = string2;
        this.$fieldMap = map2;
        this.$requestID = string3;
        this.$screenName = string4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        LoginRepository loginRepository = this.this$0;
        String string2 = this.$url;
        Map map2 = this.$fieldMap;
        String string3 = this.$requestID;
        String string4 = this.$screenName;
        LoginRepository$loginAnonymousUser$1 loginRepository$loginAnonymousUser$1 = new LoginRepository$loginAnonymousUser$1(loginRepository, string2, map2, string3, string4, f80_02);
        loginRepository$loginAnonymousUser$1.L$0 = object;
        return loginRepository$loginAnonymousUser$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (LoginRepository$loginAnonymousUser$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((LoginRepository$loginAnonymousUser$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        boolean bl2;
        String string2;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 3;
        int n7 = 2;
        int n8 = 1;
        if (n3 != 0) {
            if (n3 != n8) {
                if (n3 != n7 && n3 != n4) {
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                vl2_2.b(object);
                return Unit.a;
            }
            object5 = (fs0_2)this.L$0;
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object5 = object = this.L$0;
            object5 = (fs0_2)object;
            object4 = LoginRepository.access$getLoginApi$p(this.this$0);
            object3 = this.$url;
            object2 = this.$fieldMap;
            String string3 = this.$requestID;
            this.L$0 = object5;
            this.label = n8;
            int n10 = 8;
            string2 = null;
            object = LoginApi$DefaultImpls.loginAnonymous$default((LoginApi)object4, (String)object3, (Map)object2, string3, null, this, n10, null);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object3 = object;
        object3 = (dl2_2)object;
        object = (UserInformationModel)((dl2_2)object3).b;
        Object object6 = ((dl2_2)object3).a;
        if (object != null && (bl2 = ((cl2_2)object6).d())) {
            LoginRepository.access$saveAnonymousUserInformation(this.this$0, (UserInformationModel)object);
            object = new User();
            ((User)object).setUid("anonymous");
            DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
            object = dataCallback$Companion.onSuccess(object);
            this.L$0 = null;
            this.label = n7;
            object = object5.emit(object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        int n14 = ((cl2_2)object6).d();
        n7 = 0;
        Object object7 = null;
        object6 = "LoginRepository";
        if (n14 != 0) {
            n14 = R$string.something_wrong_msg;
            object = hv3_0.K(n14);
            object4 = yn3_0.a;
            ((yn3$a)object4).l((String)object6);
            object6 = "Data not present";
            object7 = new Object[]{};
            ((yn3$a)object4).a((String)object6, (Object[])object7);
        } else {
            object = ((dl2_2)object3).c;
            if (object != null) {
                object = ((il2_2)object).k();
            } else {
                n14 = 0;
                object = null;
            }
            object4 = yn3_0.a;
            object2 = "ErrorBody: ";
            object6 = U4.a((yn3$a)object4, (String)object6, (String)object2, (String)object);
            object7 = new Object[]{};
            ((yn3$a)object4).d((String)object6, (Object[])object7);
        }
        object4 = object;
        object6 = this.this$0;
        object2 = this.$requestID;
        boolean bl3 = true;
        string2 = this.$screenName;
        object = LoginRepository.access$logApiError((LoginRepository)object6, (String)object, (dl2_2)object3, (String)object2, bl3, string2);
        object7 = DataCallback.Companion;
        object = ((DataCallback$Companion)object7).onFailed((DataError)object);
        this.L$0 = null;
        this.label = n4;
        object = object5.emit(object, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

