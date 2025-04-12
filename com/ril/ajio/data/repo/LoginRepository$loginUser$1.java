/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ajio.ril.core.network.AnonymousToken;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.LoginRepository;
import com.ril.ajio.services.data.user.User;
import com.ril.ajio.services.data.user.UserInformationModel;
import com.ril.ajio.services.network.api.LoginApi;
import com.ril.ajio.services.network.api.LoginApi$DefaultImpls;
import com.ril.ajio.services.query.QueryCustomer;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

final class LoginRepository$loginUser$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Map $fieldMap;
    final /* synthetic */ Map $headerMap;
    final /* synthetic */ QueryCustomer $queryCustomer;
    final /* synthetic */ Ref$ObjectRef $requestID;
    final /* synthetic */ String $screenName;
    final /* synthetic */ Ref$ObjectRef $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoginRepository this$0;

    public LoginRepository$loginUser$1(LoginRepository loginRepository, Ref$ObjectRef ref$ObjectRef, Map map2, Map map3, Ref$ObjectRef ref$ObjectRef2, QueryCustomer queryCustomer, String string2, f80_0 f80_02) {
        this.this$0 = loginRepository;
        this.$url = ref$ObjectRef;
        this.$headerMap = map2;
        this.$fieldMap = map3;
        this.$requestID = ref$ObjectRef2;
        this.$queryCustomer = queryCustomer;
        this.$screenName = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        LoginRepository loginRepository = this.this$0;
        Ref$ObjectRef ref$ObjectRef = this.$url;
        Map map2 = this.$headerMap;
        Map map3 = this.$fieldMap;
        Ref$ObjectRef ref$ObjectRef2 = this.$requestID;
        QueryCustomer queryCustomer = this.$queryCustomer;
        String string2 = this.$screenName;
        LoginRepository$loginUser$1 loginRepository$loginUser$1 = new LoginRepository$loginUser$1(loginRepository, ref$ObjectRef, map2, map3, ref$ObjectRef2, queryCustomer, string2, f80_02);
        loginRepository$loginUser$1.L$0 = object;
        return loginRepository$loginUser$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (LoginRepository$loginUser$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((LoginRepository$loginUser$1)object).invokeSuspend(object2);
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
            LoginApi loginApi = LoginRepository.access$getLoginApi$p(this.this$0);
            object4 = object = this.$url.element;
            object4 = (String)object;
            object3 = this.$headerMap;
            object2 = this.$fieldMap;
            Object object6 = object = this.$requestID.element;
            object6 = (String)object;
            this.L$0 = object5;
            this.label = n8;
            int n10 = 16;
            string2 = null;
            object = LoginApi$DefaultImpls.loginUser$default(loginApi, (String)object4, (Map)object3, (Map)object2, (String)object6, null, this, n10, null);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object3 = object;
        object3 = (dl2_2)object;
        object = (UserInformationModel)((dl2_2)object3).b;
        Object var8_9 = null;
        object4 = ((dl2_2)object3).a;
        if (object != null && (bl2 = ((cl2_2)object4).d())) {
            User user = new User();
            object4 = this.$queryCustomer.getLogin();
            user.setUid((String)object4);
            object4 = z40_0.Companion;
            object4 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object4).a;
            object3 = "otp_intervention_enabled";
            boolean bl3 = ((ao0_0)object4).a((String)object3);
            boolean bl4 = ((UserInformationModel)object).getRedirectToOTP();
            if (bl4 && bl3) {
                user.setSuspiciousUserAskForLogin(n8 != 0);
            } else {
                user.setSuspiciousUserAskForLogin(false);
                LoginRepository loginRepository = this.this$0;
                String string3 = this.$queryCustomer.getLogin();
                object4 = this.$queryCustomer.getLoginvia();
                LoginRepository.access$saveUserInformation(loginRepository, (UserInformationModel)object, string3, (String)object4);
                AnonymousToken.setAccessToken(null);
            }
            object = DataCallback.Companion.onSuccess(user);
            this.L$0 = null;
            this.label = n7;
            object = object5.emit(object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        int n14 = ((cl2_2)object4).d();
        Object object7 = "LoginRepository";
        if (n14 != 0) {
            n14 = R$string.something_wrong_msg;
            object = hv3_0.K(n14);
            yn3$a yn3$a = yn3_0.a;
            yn3$a.l((String)object7);
            object7 = "Data not present";
            Object[] objectArray = new Object[]{};
            yn3$a.a((String)object7, objectArray);
        } else {
            object = ((dl2_2)object3).c;
            if (object != null) {
                object = ((il2_2)object).k();
            } else {
                n14 = 0;
                object = null;
            }
            yn3$a yn3$a = yn3_0.a;
            object4 = "ErrorBody: ";
            object7 = U4.a(yn3$a, (String)object7, (String)object4, (String)object);
            Object[] objectArray = new Object[]{};
            yn3$a.d((String)object7, objectArray);
        }
        object4 = object;
        LoginRepository loginRepository = this.this$0;
        object2 = object = this.$requestID.element;
        object2 = (String)object;
        boolean bl5 = true;
        string2 = this.$screenName;
        object = LoginRepository.access$logApiError(loginRepository, (String)object4, (dl2_2)object3, (String)object2, bl5, string2);
        object7 = DataCallback.Companion;
        object = ((DataCallback$Companion)object7).onFailed((DataError)object);
        this.L$0 = null;
        this.label = n4;
        object = object5.emit(object, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

