/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Bundle
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package com.google.firebase.dynamiclinks.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.dynamiclinks.DynamicLink$Builder;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.dynamiclinks.internal.DynamicLinkData;
import com.google.firebase.dynamiclinks.internal.DynamicLinksApi;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl$CreateShortDynamicLinkImpl;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl$GetDynamicLinkImpl;
import com.google.firebase.inject.Provider;

public class FirebaseDynamicLinksImpl
extends FirebaseDynamicLinks {
    private static final String ANALYTICS_FDL_ORIGIN = "fdl";
    public static final String EXTRA_DYNAMIC_LINK_DATA = "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA";
    public static final String KEY_SCION_DATA = "scionData";
    private static final String TAG = "FDL";
    private final Provider analytics;
    private final FirebaseApp firebaseApp;
    private final GoogleApi googleApi;

    public FirebaseDynamicLinksImpl(GoogleApi object, FirebaseApp firebaseApp, Provider provider) {
        this.googleApi = object;
        this.firebaseApp = object = (FirebaseApp)Preconditions.checkNotNull(firebaseApp);
        this.analytics = provider;
        provider.get();
    }

    public FirebaseDynamicLinksImpl(FirebaseApp firebaseApp, Provider provider) {
        Context context = firebaseApp.getApplicationContext();
        DynamicLinksApi dynamicLinksApi = new DynamicLinksApi(context);
        this(dynamicLinksApi, firebaseApp, provider);
    }

    public static Uri createDynamicLink(Bundle bundle) {
        FirebaseDynamicLinksImpl.verifyDomainUriPrefix(bundle);
        Uri uri = (Uri)bundle.getParcelable("dynamicLink");
        if (uri == null) {
            uri = new Uri.Builder();
            Object object = Uri.parse((String)((String)Preconditions.checkNotNull(bundle.getString("domainUriPrefix"))));
            String string2 = object.getScheme();
            uri.scheme(string2);
            string2 = object.getAuthority();
            uri.authority(string2);
            object = object.getPath();
            uri.path((String)object);
            object = "parameters";
            bundle = bundle.getBundle((String)object);
            if (bundle != null) {
                boolean bl2;
                object = bundle.keySet().iterator();
                while (bl2 = object.hasNext()) {
                    string2 = (String)object.next();
                    Object object2 = bundle.get(string2);
                    if (object2 == null) continue;
                    object2 = object2.toString();
                    uri.appendQueryParameter(string2, (String)object2);
                }
            }
            uri = uri.build();
        }
        return uri;
    }

    public static void verifyDomainUriPrefix(Bundle object) {
        Uri uri = (Uri)object.getParcelable("dynamicLink");
        String string2 = "domainUriPrefix";
        boolean bl2 = TextUtils.isEmpty((CharSequence)(object = object.getString(string2)));
        if (bl2 && uri == null) {
            object = new IllegalArgumentException("FDL domain is missing. Set with setDomainUriPrefix() or setDynamicLinkDomain().");
            throw object;
        }
    }

    public DynamicLink$Builder createDynamicLink() {
        DynamicLink$Builder dynamicLink$Builder = new DynamicLink$Builder(this);
        return dynamicLink$Builder;
    }

    public Task createShortDynamicLink(Bundle bundle) {
        FirebaseDynamicLinksImpl.verifyDomainUriPrefix(bundle);
        GoogleApi googleApi = this.googleApi;
        FirebaseDynamicLinksImpl$CreateShortDynamicLinkImpl firebaseDynamicLinksImpl$CreateShortDynamicLinkImpl = new FirebaseDynamicLinksImpl$CreateShortDynamicLinkImpl(bundle);
        return googleApi.doWrite(firebaseDynamicLinksImpl$CreateShortDynamicLinkImpl);
    }

    public Task getDynamicLink(Intent object) {
        Object object2 = object != null ? object.getDataString() : null;
        GoogleApi googleApi = this.googleApi;
        Provider provider = this.analytics;
        FirebaseDynamicLinksImpl$GetDynamicLinkImpl firebaseDynamicLinksImpl$GetDynamicLinkImpl = new FirebaseDynamicLinksImpl$GetDynamicLinkImpl(provider, (String)object2);
        object2 = googleApi.doWrite(firebaseDynamicLinksImpl$GetDynamicLinkImpl);
        if (object != null && (object = this.getPendingDynamicLinkData((Intent)object)) != null) {
            object2 = Tasks.forResult(object);
        }
        return object2;
    }

    public Task getDynamicLink(Uri object) {
        GoogleApi googleApi = this.googleApi;
        Provider provider = this.analytics;
        object = object.toString();
        FirebaseDynamicLinksImpl$GetDynamicLinkImpl firebaseDynamicLinksImpl$GetDynamicLinkImpl = new FirebaseDynamicLinksImpl$GetDynamicLinkImpl(provider, (String)object);
        return googleApi.doWrite(firebaseDynamicLinksImpl$GetDynamicLinkImpl);
    }

    public FirebaseApp getFirebaseApp() {
        return this.firebaseApp;
    }

    public PendingDynamicLinkData getPendingDynamicLinkData(Intent object) {
        Object object2 = EXTRA_DYNAMIC_LINK_DATA;
        Parcelable.Creator creator = DynamicLinkData.CREATOR;
        object2 = (object = (DynamicLinkData)SafeParcelableSerializer.deserializeFromIntentExtra(object, (String)object2, creator)) != null ? new PendingDynamicLinkData((DynamicLinkData)object) : null;
        return object2;
    }
}

