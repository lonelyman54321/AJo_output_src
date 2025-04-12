/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ajio.ril.core.network.AnonymousToken;
import com.ajio.ril.core.network.model.DataError;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.data.repo.DataCallback$Companion;
import com.ril.ajio.data.repo.LoginRepository;
import com.ril.ajio.services.data.Login.Data;
import com.ril.ajio.services.data.Login.UcpToken;
import com.ril.ajio.services.data.Login.UcpTokenRequest;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

final class LoginRepository$getLoginTokensUcp$1
extends qg3_2
implements Function2 {
    final /* synthetic */ UcpTokenRequest $ucpTokenRequest;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LoginRepository this$0;

    public LoginRepository$getLoginTokensUcp$1(LoginRepository loginRepository, String string2, UcpTokenRequest ucpTokenRequest, f80_0 f80_02) {
        this.this$0 = loginRepository;
        this.$url = string2;
        this.$ucpTokenRequest = ucpTokenRequest;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        LoginRepository loginRepository = this.this$0;
        String string2 = this.$url;
        UcpTokenRequest ucpTokenRequest = this.$ucpTokenRequest;
        LoginRepository$getLoginTokensUcp$1 loginRepository$getLoginTokensUcp$1 = new LoginRepository$getLoginTokensUcp$1(loginRepository, string2, ucpTokenRequest, f80_02);
        loginRepository$getLoginTokensUcp$1.L$0 = object;
        return loginRepository$getLoginTokensUcp$1;
    }

    public final Object invoke(fs0_2 object, f80_0 object2) {
        object = (LoginRepository$getLoginTokensUcp$1)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((LoginRepository$getLoginTokensUcp$1)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object object) {
        Exception exception2;
        Object object2;
        boolean bl2;
        boolean bl3;
        j90_0 j90_02;
        block20: {
            boolean bl4;
            block21: {
                Object object3;
                Object object4;
                boolean bl5;
                boolean bl6;
                block19: {
                    j90_02 = j90_0.COROUTINE_SUSPENDED;
                    boolean bl7 = this.label;
                    bl3 = 5 != 0;
                    bl2 = 4 != 0;
                    bl4 = 3 != 0;
                    bl6 = 2 != 0;
                    bl5 = true;
                    if (bl7) {
                        if (bl7 != bl5) {
                            if (bl7 != bl6) {
                                if (bl7 != bl4) {
                                    if (bl7 != bl2) {
                                        if (bl7 == bl3) {
                                            vl2_2.b(object);
                                            return Unit.a;
                                        }
                                        object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        throw object;
                                    }
                                    object2 = (fs0_2)this.L$0;
                                } else {
                                    object2 = (fs0_2)this.L$0;
                                }
                            } else {
                                object2 = (fs0_2)this.L$0;
                            }
                            vl2_2.b(object);
                            return Unit.a;
                        }
                        object2 = (fs0_2)this.L$0;
                        vl2_2.b(object);
                        break block19;
                    }
                    vl2_2.b(object);
                    object2 = object = this.L$0;
                    object2 = (fs0_2)object;
                    object = this.this$0;
                    object = LoginRepository.access$getLoginApi$p((LoginRepository)object);
                    object4 = this.$url;
                    object3 = this.$ucpTokenRequest;
                    this.L$0 = object2;
                    this.label = bl5;
                    object = object.getUcpTokens((String)object4, (UcpTokenRequest)object3, this);
                    if (object != j90_02) break block19;
                    return j90_02;
                }
                try {
                    object = (dl2_2)object;
                    object4 = ((dl2_2)object).a;
                    boolean bl8 = ((cl2_2)object4).d();
                    if (!bl8) break block20;
                    object = ((dl2_2)object).b;
                    if ((object = (UcpToken)object) == null) break block21;
                    Iterator iterator = this.this$0;
                    LoginRepository.access$saveUcpTokens((LoginRepository)((Object)iterator), (UcpToken)object);
                    AnonymousToken.setAccessToken(null);
                    iterator = ((UcpToken)object).getData();
                    if (iterator != null) {
                        iterator = (Iterable)((Object)iterator);
                        iterator = iterator.iterator();
                        while (bl4 = (boolean)iterator.hasNext()) {
                            Object object5 = iterator.next();
                            object4 = ((Data)(object5 = (Data)object5)).getTokenProvider();
                            if (object4 == null || (bl8 = StringsKt.F((CharSequence)object4, (CharSequence)(object3 = "ucp"), bl5)) != bl5) continue;
                            ((Data)object5).getAccessToken();
                            ((Data)object5).getRefreshToken();
                        }
                    }
                    iterator = DataCallback.Companion;
                    object = ((DataCallback$Companion)((Object)iterator)).onSuccess(object);
                    this.L$0 = object2;
                    this.label = bl6;
                    if ((object = object2.emit(object, this)) != j90_02) return Unit.a;
                    return j90_02;
                }
                catch (Exception exception2) {}
            }
            object = DataCallback.Companion;
            Object object6 = this.this$0;
            String string2 = "Response body is null";
            object6 = LoginRepository.access$createDataError((LoginRepository)object6, string2);
            object = ((DataCallback$Companion)object).onFailed((DataError)object6);
            this.L$0 = object2;
            this.label = bl4;
            object = object2.emit(object, this);
            if (object != j90_02) return Unit.a;
            return j90_02;
        }
        object = ((dl2_2)object).c;
        if (object == null || (object = ((il2_2)object).k()) == null) {
            object = "Unknown error";
        }
        Object object7 = this.this$0;
        object = LoginRepository.access$createDataError((LoginRepository)object7, (String)object);
        object7 = DataCallback.Companion;
        object = ((DataCallback$Companion)object7).onFailed((DataError)object);
        this.L$0 = object2;
        this.label = bl2;
        if ((object = object2.emit(object, this)) != j90_02) return Unit.a;
        return j90_02;
        DataCallback$Companion dataCallback$Companion = DataCallback.Companion;
        LoginRepository loginRepository = this.this$0;
        Object object8 = exception2.getMessage();
        String string3 = "An exception occurred: ";
        StringBuilder stringBuilder = new StringBuilder(string3);
        stringBuilder.append((String)object8);
        object8 = stringBuilder.toString();
        object8 = LoginRepository.access$createDataError(loginRepository, (String)object8);
        object8 = dataCallback$Companion.onFailed((DataError)object8);
        this.L$0 = null;
        this.label = bl3;
        object8 = object2.emit(object8, this);
        if (object8 != j90_02) return Unit.a;
        return j90_02;
    }
}

