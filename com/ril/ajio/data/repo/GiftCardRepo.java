/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.AJIOApplication;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.GiftCardRepo$fetchGiftCardData$$inlined$map$1;
import com.ril.ajio.data.repo.GiftCardRepo$fetchGiftCardData$1;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.network.api.AjioGiftCardApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import java.util.HashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

public class GiftCardRepo
implements BaseRepo {
    public static final int $stable = 8;
    private final AjioGiftCardApi ajioGiftCardApi;
    private final UserInformation userInformation;

    public GiftCardRepo() {
        Object object = AjioApiConnector.INSTANCE.getGiftCardAPI();
        this.ajioGiftCardApi = object;
        this.userInformation = object = VX0.a(AJIOApplication.Companion);
    }

    public static final /* synthetic */ AjioGiftCardApi access$getAjioGiftCardApi$p(GiftCardRepo giftCardRepo) {
        return giftCardRepo.ajioGiftCardApi;
    }

    public static final /* synthetic */ UserInformation access$getUserInformation$p(GiftCardRepo giftCardRepo) {
        return giftCardRepo.userInformation;
    }

    public final es0_2 fetchGiftCardData(boolean bl2, HashMap object) {
        Object object2;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object[] objectArray = null;
        String string2 = "giftcard";
        if (bl2) {
            object2 = UrlHelper.Companion.getInstance();
            String string3 = "redeem";
            objectArray = new Object[]{};
            object2 = ((UrlHelper)object2).getApiUrl(string2, string3, objectArray);
        } else {
            object2 = UrlHelper.Companion.getInstance();
            String string4 = "check_balance";
            objectArray = new Object[]{};
            object2 = ((UrlHelper)object2).getApiUrl(string2, string4, objectArray);
        }
        ref$ObjectRef.element = object2;
        object2 = new GiftCardRepo$fetchGiftCardData$1(this, ref$ObjectRef, (HashMap)object, null);
        object = new br2_2((Function2)object2);
        object2 = ir0_2.a;
        object2 = em0_2.b;
        object2 = ms0_1.m((es0_2)object, (CoroutineContext)object2);
        object = new GiftCardRepo$fetchGiftCardData$$inlined$map$1((es0_2)object2);
        object2 = ir0_2.a;
        return ms0_1.m((es0_2)object, (CoroutineContext)object2);
    }
}

