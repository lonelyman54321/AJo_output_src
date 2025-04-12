/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.LoginRepository;
import com.ril.ajio.services.data.Login.LoginSignupBenefitsBannerData;
import com.ril.ajio.services.network.api.LoginApi;
import com.ril.ajio.services.network.api.LoginApi$DefaultImpls;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

final class LoginRepository$getLoginSignupBenefitsBanner$1
extends qg3_2
implements Function2 {
    final /* synthetic */ String $requestID;
    final /* synthetic */ String $screenName;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoginRepository this$0;

    public LoginRepository$getLoginSignupBenefitsBanner$1(LoginRepository loginRepository, String string2, String string3, String string4, f80_0 f80_02) {
        this.this$0 = loginRepository;
        this.$url = string2;
        this.$requestID = string3;
        this.$screenName = string4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        LoginRepository loginRepository = this.this$0;
        String string2 = this.$url;
        String string3 = this.$requestID;
        String string4 = this.$screenName;
        LoginRepository$getLoginSignupBenefitsBanner$1 loginRepository$getLoginSignupBenefitsBanner$1 = new LoginRepository$getLoginSignupBenefitsBanner$1(loginRepository, string2, string3, string4, f80_02);
        loginRepository$getLoginSignupBenefitsBanner$1.L$0 = object;
        return loginRepository$getLoginSignupBenefitsBanner$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (LoginRepository$getLoginSignupBenefitsBanner$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((LoginRepository$getLoginSignupBenefitsBanner$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2;
        boolean bl2;
        int n3;
        String string2;
        Object object3;
        Object object4;
        Object object5;
        j90_0 j90_02 = j90_0.COROUTINE_SUSPENDED;
        int n4 = this.label;
        int n7 = 3;
        int n8 = 2;
        int n10 = 1;
        if (n4 != 0) {
            if (n4 != n10) {
                if (n4 != n8 && n4 != n7) {
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
            string2 = this.$requestID;
            this.L$0 = object5;
            this.label = n10;
            n3 = 4;
            bl2 = false;
            object2 = this;
            object = LoginApi$DefaultImpls.getLoginSignupBanner$default((LoginApi)object4, (String)object3, string2, null, this, n3, null);
            if (object == j90_02) {
                return j90_02;
            }
        }
        object3 = object;
        object3 = (dl2_2)object;
        object = (LoginSignupBenefitsBannerData)((dl2_2)object3).b;
        Object object6 = ((dl2_2)object3).a;
        boolean bl3 = ((cl2_2)object6).d();
        n3 = 0;
        if (bl3 && object != null) {
            DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
            object = dataCallback$Companion.onSuccess(object);
            this.L$0 = null;
            this.label = n8;
            if ((object = object5.emit(object, this)) != j90_02) return Unit.a;
            return j90_02;
        }
        int n14 = ((cl2_2)object6).d();
        n8 = 0;
        Object[] objectArray = null;
        object6 = "LoginRepository";
        if (n14 != 0) {
            n14 = R$string.something_wrong_msg;
            object = hv3_0.K(n14);
            object4 = yn3_0.a;
            ((yn3$a)object4).l((String)object6);
            object6 = "Data not present";
            objectArray = new Object[]{};
            ((yn3$a)object4).a((String)object6, objectArray);
        } else {
            object = ((dl2_2)object3).c;
            if (object != null) {
                object = ((il2_2)object).k();
            } else {
                n14 = 0;
                object = null;
            }
            object4 = yn3_0.a;
            string2 = "ErrorBody: ";
            object6 = U4.a((yn3$a)object4, (String)object6, string2, (String)object);
            objectArray = new Object[]{};
            ((yn3$a)object4).d((String)object6, objectArray);
        }
        object4 = object;
        object6 = this.this$0;
        string2 = this.$requestID;
        bl2 = true;
        object2 = this.$screenName;
        object = LoginRepository.access$handleApiError((LoginRepository)object6, (String)object, (dl2_2)object3, string2, bl2, (String)object2);
        this.L$0 = null;
        this.label = n7;
        object = object5.emit(object, this);
        if (object != j90_02) return Unit.a;
        return j90_02;
    }
}

