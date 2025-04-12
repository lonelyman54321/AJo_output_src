/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.data.repo;

import com.ril.ajio.data.repo.AddressRepo$checkPostalCodeNew$$inlined$map$1;
import com.ril.ajio.data.repo.AddressRepo$checkPostalCodeNew$1;
import com.ril.ajio.data.repo.AddressRepo$createAddressNew$$inlined$map$1;
import com.ril.ajio.data.repo.AddressRepo$createAddressNew$1;
import com.ril.ajio.data.repo.AddressRepo$deleteAddressNew$$inlined$map$1;
import com.ril.ajio.data.repo.AddressRepo$deleteAddressNew$1;
import com.ril.ajio.data.repo.AddressRepo$getAddressesNew$$inlined$map$1;
import com.ril.ajio.data.repo.AddressRepo$getAddressesNew$1;
import com.ril.ajio.data.repo.AddressRepo$getDropAtStoreListNew$$inlined$map$1;
import com.ril.ajio.data.repo.AddressRepo$getDropAtStoreListNew$1;
import com.ril.ajio.data.repo.AddressRepo$getExchangeReturnAddressNew$$inlined$map$1;
import com.ril.ajio.data.repo.AddressRepo$getExchangeReturnAddressNew$1;
import com.ril.ajio.data.repo.AddressRepo$setDefaultAddressNew$$inlined$map$1;
import com.ril.ajio.data.repo.AddressRepo$setDefaultAddressNew$1;
import com.ril.ajio.data.repo.AddressRepo$updateAddressNew$$inlined$map$1;
import com.ril.ajio.data.repo.AddressRepo$updateAddressNew$1;
import com.ril.ajio.data.repo.AddressRepo$updateAddressNewPD$$inlined$map$1;
import com.ril.ajio.data.repo.AddressRepo$updateAddressNewPD$1;
import com.ril.ajio.data.repo.ApiErrorRepo;
import com.ril.ajio.data.repo.BaseRepo;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import com.ril.ajio.services.network.api.AddressApi;
import com.ril.ajio.services.network.connector.AjioApiConnector;
import java.util.HashMap;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

public class AddressRepo
implements BaseRepo {
    public static final int $stable = 8;
    private final AddressApi addressApi;

    public AddressRepo() {
        AddressApi addressApi;
        this.addressApi = addressApi = AjioApiConnector.INSTANCE.getAddressApi();
    }

    public static final /* synthetic */ AddressApi access$getAddressApi$p(AddressRepo addressRepo) {
        return addressRepo.addressApi;
    }

    public static final /* synthetic */ DataCallback access$handleApiError(AddressRepo addressRepo, String string2, dl2_2 dl2_22, String string3) {
        return addressRepo.handleApiError(string2, dl2_22, string3);
    }

    private final DataCallback handleApiError(String string2, dl2_2 dl2_22, String string3) {
        return ApiErrorRepo.handleApiError$default(ApiErrorRepo.INSTANCE, string2, dl2_22, string3, false, null, null, 56, null);
    }

    public es0_2 checkPostalCodeNew(String object, String object2, HashMap object3, String object4) {
        Intrinsics.checkNotNullParameter(object, "requestID");
        Intrinsics.checkNotNullParameter(object2, "accessToken");
        Intrinsics.checkNotNullParameter(object3, "query");
        Intrinsics.checkNotNullParameter(object4, "addressID");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object5 = UrlHelper.Companion;
        Object object6 = ((UrlHelper$Companion)object5).getInstance();
        Object object7 = new Object[]{object4};
        ref$ObjectRef.element = object4 = ((UrlHelper)object6).getApiUrl("address", "check_postalcode", object7);
        object4 = ((UrlHelper$Companion)object5).getInstance();
        object5 = (String)ref$ObjectRef.element;
        ref$ObjectRef.element = object3 = ((UrlHelper)object4).addParams((String)object5, (HashMap)object3);
        object6 = object3;
        object7 = this;
        object3 = new AddressRepo$checkPostalCodeNew$1(this, ref$ObjectRef, (String)object2, (String)object, null);
        object2 = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        object3 = new AddressRepo$checkPostalCodeNew$$inlined$map$1((es0_2)object2, this, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object);
    }

    public es0_2 createAddressNew(String object, String string2, String object2, HashMap hashMap, HashMap hashMap2) {
        Intrinsics.checkNotNullParameter(object, "userId");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        Intrinsics.checkNotNullParameter(object2, "accessToken");
        Intrinsics.checkNotNullParameter(hashMap, "query");
        Intrinsics.checkNotNullParameter(hashMap2, "postBody");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object3 = UrlHelper.Companion;
        Object object4 = ((UrlHelper$Companion)object3).getInstance();
        Object object5 = new Object[]{object};
        ref$ObjectRef.element = object = ((UrlHelper)object4).getApiUrl("address", "create_address", object5);
        object = ((UrlHelper$Companion)object3).getInstance();
        object3 = (String)ref$ObjectRef.element;
        ref$ObjectRef.element = object = ((UrlHelper)object).addParams((String)object3, hashMap);
        object4 = object;
        object5 = this;
        object = new AddressRepo$createAddressNew$1(this, ref$ObjectRef, (String)object2, string2, hashMap2, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new AddressRepo$createAddressNew$$inlined$map$1((es0_2)object, this, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public es0_2 deleteAddressNew(String object, String string2, String object2, HashMap hashMap, String string3) {
        Intrinsics.checkNotNullParameter(object, "id");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        Intrinsics.checkNotNullParameter(object2, "accessToken");
        Intrinsics.checkNotNullParameter(hashMap, "query");
        Intrinsics.checkNotNullParameter(string3, "userId");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        UrlHelper$Companion urlHelper$Companion = UrlHelper.Companion;
        Object object3 = urlHelper$Companion.getInstance();
        Object object4 = new Object[]{string3, object};
        ref$ObjectRef.element = object = ((UrlHelper)object3).getApiUrl("address", "delete_address", object4);
        object = urlHelper$Companion.getInstance();
        string3 = (String)ref$ObjectRef.element;
        ref$ObjectRef.element = object = ((UrlHelper)object).addParams(string3, hashMap);
        object3 = object;
        object4 = this;
        object = new AddressRepo$deleteAddressNew$1(this, ref$ObjectRef, (String)object2, string2, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new AddressRepo$deleteAddressNew$$inlined$map$1((es0_2)object, this, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public es0_2 getAddressesNew(String object, String object2, HashMap object3, String object4) {
        Intrinsics.checkNotNullParameter(object, "requestID");
        Intrinsics.checkNotNullParameter(object2, "accessToken");
        Intrinsics.checkNotNullParameter(object3, "query");
        Intrinsics.checkNotNullParameter(object4, "userId");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object object5 = UrlHelper.Companion;
        Object object6 = ((UrlHelper$Companion)object5).getInstance();
        Object object7 = new Object[]{object4};
        ref$ObjectRef.element = object4 = ((UrlHelper)object6).getApiUrl("address", "address_list", object7);
        object4 = ((UrlHelper$Companion)object5).getInstance();
        object5 = (String)ref$ObjectRef.element;
        ref$ObjectRef.element = object3 = ((UrlHelper)object4).addParams((String)object5, (HashMap)object3);
        object6 = object3;
        object7 = this;
        object3 = new AddressRepo$getAddressesNew$1(this, ref$ObjectRef, (String)object2, (String)object, null);
        object2 = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        object3 = new AddressRepo$getAddressesNew$$inlined$map$1((es0_2)object2, this, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object);
    }

    public es0_2 getDropAtStoreListNew(String object, String object2, HashMap object3, String object4, String string2) {
        Intrinsics.checkNotNullParameter(object, "requestID");
        Intrinsics.checkNotNullParameter(object2, "accessToken");
        Intrinsics.checkNotNullParameter(object3, "query");
        Intrinsics.checkNotNullParameter(object4, "userId");
        Intrinsics.checkNotNullParameter(string2, "pincode");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        UrlHelper$Companion urlHelper$Companion = UrlHelper.Companion;
        Object object5 = urlHelper$Companion.getInstance();
        Object object6 = new Object[]{object4, string2};
        ref$ObjectRef.element = object4 = ((UrlHelper)object5).getApiUrl("order", "drop_at_store_list", object6);
        object4 = urlHelper$Companion.getInstance();
        string2 = (String)ref$ObjectRef.element;
        ref$ObjectRef.element = object3 = ((UrlHelper)object4).addParams(string2, (HashMap)object3);
        object5 = object3;
        object6 = this;
        object3 = new AddressRepo$getDropAtStoreListNew$1(this, ref$ObjectRef, (String)object2, (String)object, null);
        object2 = new br2_2((Function2)object3);
        object3 = ir0_2.a;
        object3 = em0_2.b;
        object2 = ms0_1.m((es0_2)object2, (CoroutineContext)object3);
        object3 = new AddressRepo$getDropAtStoreListNew$$inlined$map$1((es0_2)object2, this, (String)object);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object3, (CoroutineContext)object);
    }

    public es0_2 getExchangeReturnAddressNew(String object, String string2, String object2, HashMap hashMap, String object3, String string3) {
        Intrinsics.checkNotNullParameter(object, "consignmentCode");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        Intrinsics.checkNotNullParameter(object2, "accessToken");
        Intrinsics.checkNotNullParameter(hashMap, "query");
        Intrinsics.checkNotNullParameter(object3, "userId");
        Intrinsics.checkNotNullParameter(string3, "addressId");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        object3 = UrlHelper.Companion;
        Object object4 = ((UrlHelper$Companion)object3).getInstance();
        Object object5 = new Object[]{object, string3};
        ref$ObjectRef.element = object = ((UrlHelper)object4).getApiUrl("address", "ex_return_selected_address", object5);
        object = ((UrlHelper$Companion)object3).getInstance();
        object3 = (String)ref$ObjectRef.element;
        ref$ObjectRef.element = object = ((UrlHelper)object).addParams((String)object3, hashMap);
        object4 = object;
        object5 = this;
        object = new AddressRepo$getExchangeReturnAddressNew$1(this, ref$ObjectRef, (String)object2, string2, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new AddressRepo$getExchangeReturnAddressNew$$inlined$map$1((es0_2)object, this, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public final DataCallback handleApiException(Throwable throwable, String string2) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        return ApiErrorRepo.handleApiException$default(ApiErrorRepo.INSTANCE, throwable, string2, false, null, null, 28, null);
    }

    public es0_2 setDefaultAddressNew(String object, String string2, String object2, String string3, HashMap hashMap, HashMap hashMap2) {
        Intrinsics.checkNotNullParameter(object, "userId");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        Intrinsics.checkNotNullParameter(object2, "accessToken");
        Intrinsics.checkNotNullParameter(string3, "addressID");
        Intrinsics.checkNotNullParameter(hashMap, "query");
        Intrinsics.checkNotNullParameter(hashMap2, "postBody");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        UrlHelper$Companion urlHelper$Companion = UrlHelper.Companion;
        Object object3 = urlHelper$Companion.getInstance();
        Object object4 = new Object[]{object, string3};
        ref$ObjectRef.element = object = ((UrlHelper)object3).getApiUrl("address", "update_address", object4);
        object = urlHelper$Companion.getInstance();
        string3 = (String)ref$ObjectRef.element;
        ref$ObjectRef.element = object = ((UrlHelper)object).addParams(string3, hashMap);
        object3 = object;
        object4 = this;
        object = new AddressRepo$setDefaultAddressNew$1(this, ref$ObjectRef, (String)object2, string2, hashMap2, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new AddressRepo$setDefaultAddressNew$$inlined$map$1((es0_2)object, this, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public es0_2 updateAddressNew(String object, String string2, String object2, String string3, HashMap hashMap, HashMap hashMap2) {
        Intrinsics.checkNotNullParameter(object, "userId");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        Intrinsics.checkNotNullParameter(object2, "accessToken");
        Intrinsics.checkNotNullParameter(string3, "addressID");
        Intrinsics.checkNotNullParameter(hashMap, "query");
        Intrinsics.checkNotNullParameter(hashMap2, "postBody");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        UrlHelper$Companion urlHelper$Companion = UrlHelper.Companion;
        Object object3 = urlHelper$Companion.getInstance();
        Object object4 = new Object[]{object, string3};
        ref$ObjectRef.element = object = ((UrlHelper)object3).getApiUrl("address", "update_address", object4);
        object = urlHelper$Companion.getInstance();
        string3 = (String)ref$ObjectRef.element;
        ref$ObjectRef.element = object = ((UrlHelper)object).addParams(string3, hashMap);
        object3 = object;
        object4 = this;
        object = new AddressRepo$updateAddressNew$1(this, ref$ObjectRef, (String)object2, string2, hashMap2, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new AddressRepo$updateAddressNew$$inlined$map$1((es0_2)object, this, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }

    public es0_2 updateAddressNewPD(String object, String string2, String object2, String string3, HashMap hashMap, HashMap hashMap2) {
        Intrinsics.checkNotNullParameter(object, "userId");
        Intrinsics.checkNotNullParameter(string2, "requestID");
        Intrinsics.checkNotNullParameter(object2, "accessToken");
        Intrinsics.checkNotNullParameter(string3, "addressID");
        Intrinsics.checkNotNullParameter(hashMap, "query");
        Intrinsics.checkNotNullParameter(hashMap2, "postBody");
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        UrlHelper$Companion urlHelper$Companion = UrlHelper.Companion;
        Object object3 = urlHelper$Companion.getInstance();
        Object object4 = new Object[]{object, string3};
        ref$ObjectRef.element = object = ((UrlHelper)object3).getApiUrl("address", "update_address", object4);
        object = urlHelper$Companion.getInstance();
        string3 = (String)ref$ObjectRef.element;
        ref$ObjectRef.element = object = ((UrlHelper)object).addParams(string3, hashMap);
        object3 = object;
        object4 = this;
        object = new AddressRepo$updateAddressNewPD$1(this, ref$ObjectRef, (String)object2, string2, hashMap2, null);
        object2 = new br2_2((Function2)object);
        object = ir0_2.a;
        object = em0_2.b;
        object = ms0_1.m((es0_2)object2, (CoroutineContext)object);
        object2 = new AddressRepo$updateAddressNewPD$$inlined$map$1((es0_2)object, this, string2);
        object = ir0_2.a;
        return ms0_1.m((es0_2)object2, (CoroutineContext)object);
    }
}

