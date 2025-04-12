/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.AJIOApplication;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.LoginRepository;
import com.ril.ajio.services.data.Status;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.network.api.LoginApi;
import com.ril.ajio.services.network.api.LoginApi$DefaultImpls;
import com.ril.ajio.services.utils.ServiceUtil;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

final class LoginRepository$sendOtp$1
extends qg3_2
implements Function2 {
    final /* synthetic */ Map $fieldMap;
    final /* synthetic */ String $requestID;
    final /* synthetic */ String $screenName;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoginRepository this$0;

    public LoginRepository$sendOtp$1(LoginRepository loginRepository, String string2, Map map2, String string3, String string4, f80_0 f80_02) {
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
        LoginRepository$sendOtp$1 loginRepository$sendOtp$1 = new LoginRepository$sendOtp$1(loginRepository, string2, map2, string3, string4, f80_02);
        loginRepository$sendOtp$1.L$0 = object;
        return loginRepository$sendOtp$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (LoginRepository$sendOtp$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((LoginRepository$sendOtp$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object[] objectArray;
        String string2;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        LoginRepository$sendOtp$1 loginRepository$sendOtp$1 = this;
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
            object7 = (fs0_2)this.L$0;
            vl2_2.b(object);
            object6 = object7;
            object7 = object;
        } else {
            vl2_2.b(object);
            object6 = object7 = this.L$0;
            object6 = (fs0_2)object7;
            object7 = LoginRepository.access$getLoginApi$p(this.this$0);
            object5 = this.$url;
            object4 = LoginRepository.access$getUserInformation$p(this.this$0);
            Intrinsics.checkNotNullExpressionValue(object4, "access$getUserInformation$p(...)");
            object4 = ServiceUtil.getToken((UserInformation)object4);
            object4 = kp1_0.c("Bearer ", (String)object4);
            object3 = em_1.a(AJIOApplication.Companion);
            object2 = this.$fieldMap;
            string2 = this.$requestID;
            this.L$0 = object6;
            this.label = n8;
            int n10 = 64;
            objectArray = object5;
            object5 = object4;
            object4 = "Android";
            object7 = LoginApi$DefaultImpls.sendOtp$default((LoginApi)object7, (String)objectArray, (String)object5, (String)object4, (String)object3, (Map)object2, string2, null, this, n10, null);
            if (object7 == j90_02) {
                return j90_02;
            }
        }
        object4 = object7;
        object4 = (dl2_2)object7;
        object7 = (Status)((dl2_2)object4).b;
        objectArray = ((dl2_2)object4).a;
        boolean bl2 = objectArray.d();
        if (bl2 && object7 != null) {
            objectArray = DataCallback.Companion;
            object7 = objectArray.onSuccess(object7);
            loginRepository$sendOtp$1.L$0 = null;
            loginRepository$sendOtp$1.label = n7;
            if ((object7 = object6.emit(object7, loginRepository$sendOtp$1)) != j90_02) return Unit.a;
            return j90_02;
        }
        n3 = (int)(objectArray.d() ? 1 : 0);
        n8 = 0;
        objectArray = null;
        object5 = "LoginRepository";
        if (n3 != 0) {
            n3 = R$string.something_wrong_msg;
            object7 = hv3_0.K(n3);
            object3 = yn3_0.a;
            ((yn3$a)object3).l((String)object5);
            object5 = "Data not present";
            objectArray = new Object[]{};
            ((yn3$a)object3).a((String)object5, objectArray);
        } else {
            object7 = ((dl2_2)object4).c;
            if (object7 != null) {
                object7 = ((il2_2)object7).k();
            } else {
                n3 = 0;
                object7 = null;
            }
            object3 = yn3_0.a;
            object2 = "ErrorBody: ";
            object5 = U4.a((yn3$a)object3, (String)object5, (String)object2, (String)object7);
            objectArray = new Object[]{};
            ((yn3$a)object3).d((String)object5, objectArray);
        }
        object5 = object7;
        objectArray = loginRepository$sendOtp$1.this$0;
        object3 = loginRepository$sendOtp$1.$requestID;
        boolean bl3 = true;
        string2 = loginRepository$sendOtp$1.$screenName;
        object7 = LoginRepository.access$handleApiError((LoginRepository)objectArray, (String)object7, (dl2_2)object4, (String)object3, bl3, string2);
        loginRepository$sendOtp$1.L$0 = null;
        loginRepository$sendOtp$1.label = n4;
        object7 = object6.emit(object7, loginRepository$sendOtp$1);
        if (object7 != j90_02) return Unit.a;
        return j90_02;
    }
}

