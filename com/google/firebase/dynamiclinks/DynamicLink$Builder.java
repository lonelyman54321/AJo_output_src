/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.firebase.dynamiclinks;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.DynamicLink$AndroidParameters;
import com.google.firebase.dynamiclinks.DynamicLink$GoogleAnalyticsParameters;
import com.google.firebase.dynamiclinks.DynamicLink$IosParameters;
import com.google.firebase.dynamiclinks.DynamicLink$ItunesConnectAnalyticsParameters;
import com.google.firebase.dynamiclinks.DynamicLink$NavigationInfoParameters;
import com.google.firebase.dynamiclinks.DynamicLink$SocialMetaTagParameters;
import com.google.firebase.dynamiclinks.internal.FirebaseDynamicLinksImpl;

public final class DynamicLink$Builder {
    private static final String APP_GOO_GL_PATTERN = "(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$";
    public static final String KEY_API_KEY = "apiKey";
    public static final String KEY_DOMAIN = "domain";
    public static final String KEY_DOMAIN_URI_PREFIX = "domainUriPrefix";
    public static final String KEY_DYNAMIC_LINK = "dynamicLink";
    public static final String KEY_DYNAMIC_LINK_PARAMETERS = "parameters";
    public static final String KEY_LINK = "link";
    public static final String KEY_SUFFIX = "suffix";
    private static final String PAGE_LINK_PATTERN = "(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$";
    private static final String SCHEME_PREFIX = "https://";
    private final Bundle builderParameters;
    private final Bundle fdlParameters;
    private final FirebaseDynamicLinksImpl firebaseDynamicLinksImpl;

    public DynamicLink$Builder(FirebaseDynamicLinksImpl object) {
        Bundle bundle;
        this.firebaseDynamicLinksImpl = object;
        this.builderParameters = bundle = new Bundle();
        object = ((FirebaseDynamicLinksImpl)object).getFirebaseApp().getOptions().getApiKey();
        bundle.putString(KEY_API_KEY, (String)object);
        object = new Bundle();
        this.fdlParameters = object;
        bundle.putBundle(KEY_DYNAMIC_LINK_PARAMETERS, (Bundle)object);
    }

    private void verifyApiKey() {
        Object object = this.builderParameters;
        String string2 = KEY_API_KEY;
        if ((object = object.getString(string2)) != null) {
            return;
        }
        object = new IllegalArgumentException("Missing API key. Set with setApiKey().");
        throw object;
    }

    public DynamicLink buildDynamicLink() {
        FirebaseDynamicLinksImpl.verifyDomainUriPrefix(this.builderParameters);
        Bundle bundle = this.builderParameters;
        DynamicLink dynamicLink = new DynamicLink(bundle);
        return dynamicLink;
    }

    public Task buildShortDynamicLink() {
        this.verifyApiKey();
        FirebaseDynamicLinksImpl firebaseDynamicLinksImpl = this.firebaseDynamicLinksImpl;
        Bundle bundle = this.builderParameters;
        return firebaseDynamicLinksImpl.createShortDynamicLink(bundle);
    }

    public Task buildShortDynamicLink(int n3) {
        this.verifyApiKey();
        this.builderParameters.putInt(KEY_SUFFIX, n3);
        FirebaseDynamicLinksImpl firebaseDynamicLinksImpl = this.firebaseDynamicLinksImpl;
        Bundle bundle = this.builderParameters;
        return firebaseDynamicLinksImpl.createShortDynamicLink(bundle);
    }

    public String getDomainUriPrefix() {
        return this.builderParameters.getString(KEY_DOMAIN_URI_PREFIX, "");
    }

    public Uri getLink() {
        Bundle bundle = this.fdlParameters;
        String string2 = KEY_LINK;
        if ((bundle = (Uri)bundle.getParcelable(string2)) == null) {
            bundle = Uri.EMPTY;
        }
        return bundle;
    }

    public Uri getLongLink() {
        Bundle bundle = this.fdlParameters;
        String string2 = KEY_DYNAMIC_LINK;
        if ((bundle = (Uri)bundle.getParcelable(string2)) == null) {
            bundle = Uri.EMPTY;
        }
        return bundle;
    }

    public DynamicLink$Builder setAndroidParameters(DynamicLink$AndroidParameters dynamicLink$AndroidParameters) {
        Bundle bundle = this.fdlParameters;
        dynamicLink$AndroidParameters = dynamicLink$AndroidParameters.parameters;
        bundle.putAll((Bundle)dynamicLink$AndroidParameters);
        return this;
    }

    public DynamicLink$Builder setDomainUriPrefix(String string2) {
        String string3 = APP_GOO_GL_PATTERN;
        boolean bl2 = string2.matches(string3);
        if (bl2 || (bl2 = string2.matches(string3 = PAGE_LINK_PATTERN))) {
            string3 = this.builderParameters;
            String string4 = string2.replace(SCHEME_PREFIX, "");
            String string5 = KEY_DOMAIN;
            string3.putString(string5, string4);
        }
        this.builderParameters.putString(KEY_DOMAIN_URI_PREFIX, string2);
        return this;
    }

    public DynamicLink$Builder setDynamicLinkDomain(String object) {
        String string2 = APP_GOO_GL_PATTERN;
        boolean bl2 = ((String)object).matches(string2);
        if (!bl2 && !(bl2 = ((String)object).matches(string2 = PAGE_LINK_PATTERN))) {
            object = new IllegalArgumentException("Use setDomainUriPrefix() instead, setDynamicLinkDomain() is only applicable for *.page.link and *.app.goo.gl domains.");
            throw object;
        }
        this.builderParameters.putString(KEY_DOMAIN, (String)object);
        string2 = this.builderParameters;
        object = SCHEME_PREFIX.concat((String)object);
        string2.putString(KEY_DOMAIN_URI_PREFIX, (String)object);
        return this;
    }

    public DynamicLink$Builder setGoogleAnalyticsParameters(DynamicLink$GoogleAnalyticsParameters dynamicLink$GoogleAnalyticsParameters) {
        Bundle bundle = this.fdlParameters;
        dynamicLink$GoogleAnalyticsParameters = dynamicLink$GoogleAnalyticsParameters.parameters;
        bundle.putAll((Bundle)dynamicLink$GoogleAnalyticsParameters);
        return this;
    }

    public DynamicLink$Builder setIosParameters(DynamicLink$IosParameters dynamicLink$IosParameters) {
        Bundle bundle = this.fdlParameters;
        dynamicLink$IosParameters = dynamicLink$IosParameters.parameters;
        bundle.putAll((Bundle)dynamicLink$IosParameters);
        return this;
    }

    public DynamicLink$Builder setItunesConnectAnalyticsParameters(DynamicLink$ItunesConnectAnalyticsParameters dynamicLink$ItunesConnectAnalyticsParameters) {
        Bundle bundle = this.fdlParameters;
        dynamicLink$ItunesConnectAnalyticsParameters = dynamicLink$ItunesConnectAnalyticsParameters.parameters;
        bundle.putAll((Bundle)dynamicLink$ItunesConnectAnalyticsParameters);
        return this;
    }

    public DynamicLink$Builder setLink(Uri uri) {
        this.fdlParameters.putParcelable(KEY_LINK, (Parcelable)uri);
        return this;
    }

    public DynamicLink$Builder setLongLink(Uri uri) {
        this.builderParameters.putParcelable(KEY_DYNAMIC_LINK, (Parcelable)uri);
        return this;
    }

    public DynamicLink$Builder setNavigationInfoParameters(DynamicLink$NavigationInfoParameters dynamicLink$NavigationInfoParameters) {
        Bundle bundle = this.fdlParameters;
        dynamicLink$NavigationInfoParameters = dynamicLink$NavigationInfoParameters.parameters;
        bundle.putAll((Bundle)dynamicLink$NavigationInfoParameters);
        return this;
    }

    public DynamicLink$Builder setSocialMetaTagParameters(DynamicLink$SocialMetaTagParameters dynamicLink$SocialMetaTagParameters) {
        Bundle bundle = this.fdlParameters;
        dynamicLink$SocialMetaTagParameters = dynamicLink$SocialMetaTagParameters.parameters;
        bundle.putAll((Bundle)dynamicLink$SocialMetaTagParameters);
        return this;
    }
}

