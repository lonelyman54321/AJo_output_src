/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ajio.ril.core.network.AnonymousToken;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.LoginRepository;
import com.ril.ajio.services.data.user.User;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.data.user.UserInformationModel;
import com.ril.ajio.services.network.api.LoginApi;
import com.ril.ajio.services.network.api.LoginApi$DefaultImpls;
import com.ril.ajio.services.query.QueryCustomer;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class LoginRepository$newRegistrationAndLogin$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Map $fieldMap;
    final /* synthetic */ QueryCustomer $queryCustomer;
    final /* synthetic */ String $requestID;
    final /* synthetic */ String $screenName;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoginRepository this$0;

    public LoginRepository$newRegistrationAndLogin$1(LoginRepository loginRepository, String string2, Map map2, String string3, QueryCustomer queryCustomer, String string4, f80_0 f80_02) {
        this.this$0 = loginRepository;
        this.$url = string2;
        this.$fieldMap = map2;
        this.$requestID = string3;
        this.$queryCustomer = queryCustomer;
        this.$screenName = string4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        LoginRepository loginRepository = this.this$0;
        String string2 = this.$url;
        Map map2 = this.$fieldMap;
        String string3 = this.$requestID;
        QueryCustomer queryCustomer = this.$queryCustomer;
        String string4 = this.$screenName;
        LoginRepository$newRegistrationAndLogin$1 loginRepository$newRegistrationAndLogin$1 = new LoginRepository$newRegistrationAndLogin$1(loginRepository, string2, map2, string3, queryCustomer, string4, f80_02);
        loginRepository$newRegistrationAndLogin$1.L$0 = object;
        return loginRepository$newRegistrationAndLogin$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (LoginRepository$newRegistrationAndLogin$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((LoginRepository$newRegistrationAndLogin$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        boolean bl2;
        Object object2;
        String string2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        LoginRepository$newRegistrationAndLogin$1 loginRepository$newRegistrationAndLogin$1 = this;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.label;
        int n4 = 3;
        int n7 = 2;
        int n8 = 1;
        if (n3 != 0) {
            if (n3 != n8) {
                if (n3 != n7 && n3 != n4) {
                    IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw illegalStateException;
                }
                vl2_2.b(object);
                return Unit.a;
            }
            object8 = (fs0_2)this.L$0;
            vl2_2.b(object);
            object7 = object8;
            object8 = object;
        } else {
            vl2_2.b(object);
            object7 = object8 = this.L$0;
            object7 = (fs0_2)object8;
            object8 = LoginRepository.access$getLoginApi$p(this.this$0);
            object6 = this.$url;
            object5 = LoginRepository.access$getUserInformation$p(this.this$0);
            Intrinsics.checkNotNullExpressionValue(object5, "access$getUserInformation$p(...)");
            object5 = ServiceUtil.getToken((UserInformation)object5);
            object5 = kp1_0.c("Bearer ", (String)object5);
            object4 = em_1.a(AJIOApplication.Companion);
            object3 = this.$fieldMap;
            string2 = this.$requestID;
            this.L$0 = object7;
            this.label = n8;
            int n10 = 64;
            object2 = object6;
            object6 = object5;
            object5 = "Android";
            object8 = LoginApi$DefaultImpls.newRegisterAndLogin$default((LoginApi)object8, (String)object2, (String)object6, (String)object5, (String)object4, (Map)object3, string2, null, this, n10, null);
            if (object8 == j90_02) {
                return j90_02;
            }
        }
        object5 = object8;
        object5 = (dl2_2)object8;
        object8 = (UserInformationModel)((dl2_2)object5).b;
        n8 = 0;
        object2 = null;
        object6 = ((dl2_2)object5).a;
        if (object8 != null && (bl2 = ((cl2_2)object6).d())) {
            int n14;
            object6 = new User();
            object5 = ((UserInformationModel)object8).getAccess_token();
            if (object5 != null && (n14 = ((String)object5).length()) != 0 && (object5 = ((UserInformationModel)object8).getRefresh_token()) != null && (n14 = ((String)object5).length()) != 0) {
                object5 = loginRepository$newRegistrationAndLogin$1.$queryCustomer.getLogin();
                ((User)object6).setUid((String)object5);
                ((User)object6).setSuspiciousUserAskForLogin(false);
                object2 = loginRepository$newRegistrationAndLogin$1.this$0;
                object5 = loginRepository$newRegistrationAndLogin$1.$queryCustomer.getLogin();
                object4 = loginRepository$newRegistrationAndLogin$1.$queryCustomer.getLoginvia();
                LoginRepository.access$saveUserInformation((LoginRepository)object2, (UserInformationModel)object8, (String)object5, (String)object4);
                AnonymousToken.setAccessToken(null);
            } else {
                object2 = ((UserInformationModel)object8).getMessage();
                if (object2 != null && (n8 = ((String)object2).length()) != 0) {
                    object8 = ((UserInformationModel)object8).getMessage();
                    ((User)object6).setMessage((String)object8);
                } else {
                    object8 = "Please try after sometime";
                    ((User)object6).setMessage((String)object8);
                }
            }
            object8 = DataCallback.Companion.onSuccess(object6);
            loginRepository$newRegistrationAndLogin$1.L$0 = null;
            loginRepository$newRegistrationAndLogin$1.label = n7;
            object8 = object7.emit(object8, loginRepository$newRegistrationAndLogin$1);
            if (object8 != j90_02) return Unit.a;
            return j90_02;
        }
        n3 = (int)(((cl2_2)object6).d() ? 1 : 0);
        object6 = "LoginRepository";
        if (n3 != 0) {
            n3 = R$string.something_wrong_msg;
            object8 = hv3_0.K(n3);
            object4 = yn3_0.a;
            ((yn3$a)object4).l((String)object6);
            object6 = "Data not present";
            object2 = new Object[]{};
            ((yn3$a)object4).a((String)object6, (Object[])object2);
        } else {
            object8 = ((dl2_2)object5).c;
            if (object8 != null) {
                object8 = ((il2_2)object8).k();
            } else {
                n3 = 0;
                object8 = null;
            }
            object4 = yn3_0.a;
            object3 = "ErrorBody: ";
            object6 = U4.a((yn3$a)object4, (String)object6, (String)object3, (String)object8);
            object2 = new Object[]{};
            ((yn3$a)object4).d((String)object6, (Object[])object2);
        }
        object6 = object8;
        object2 = loginRepository$newRegistrationAndLogin$1.this$0;
        object4 = loginRepository$newRegistrationAndLogin$1.$requestID;
        boolean bl3 = true;
        string2 = loginRepository$newRegistrationAndLogin$1.$screenName;
        object8 = LoginRepository.access$logApiError((LoginRepository)object2, (String)object8, (dl2_2)object5, (String)object4, bl3, string2);
        object2 = DataCallback.Companion;
        object8 = ((DataCallback$Companion)object2).onFailed((DataError)object8);
        loginRepository$newRegistrationAndLogin$1.L$0 = null;
        loginRepository$newRegistrationAndLogin$1.label = n4;
        object8 = object7.emit(object8, loginRepository$newRegistrationAndLogin$1);
        if (object8 != j90_02) return Unit.a;
        return j90_02;
    }
}

