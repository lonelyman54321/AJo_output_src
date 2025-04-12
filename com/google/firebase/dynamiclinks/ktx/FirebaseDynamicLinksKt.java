/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.firebase.dynamiclinks.ktx;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.DynamicLink$AndroidParameters;
import com.google.firebase.dynamiclinks.DynamicLink$AndroidParameters$Builder;
import com.google.firebase.dynamiclinks.DynamicLink$Builder;
import com.google.firebase.dynamiclinks.DynamicLink$GoogleAnalyticsParameters;
import com.google.firebase.dynamiclinks.DynamicLink$GoogleAnalyticsParameters$Builder;
import com.google.firebase.dynamiclinks.DynamicLink$IosParameters;
import com.google.firebase.dynamiclinks.DynamicLink$IosParameters$Builder;
import com.google.firebase.dynamiclinks.DynamicLink$ItunesConnectAnalyticsParameters;
import com.google.firebase.dynamiclinks.DynamicLink$ItunesConnectAnalyticsParameters$Builder;
import com.google.firebase.dynamiclinks.DynamicLink$NavigationInfoParameters;
import com.google.firebase.dynamiclinks.DynamicLink$NavigationInfoParameters$Builder;
import com.google.firebase.dynamiclinks.DynamicLink$SocialMetaTagParameters;
import com.google.firebase.dynamiclinks.DynamicLink$SocialMetaTagParameters$Builder;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.PendingDynamicLinkData;
import com.google.firebase.dynamiclinks.ShortDynamicLink;
import com.google.firebase.ktx.Firebase;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class FirebaseDynamicLinksKt {
    public static final void androidParameters(DynamicLink$Builder dynamicLink$Builder, String object, Function1 function1) {
        Intrinsics.checkNotNullParameter(dynamicLink$Builder, "<this>");
        Intrinsics.checkNotNullParameter(object, "packageName");
        Intrinsics.checkNotNullParameter(function1, "init");
        DynamicLink$AndroidParameters$Builder dynamicLink$AndroidParameters$Builder = new DynamicLink$AndroidParameters$Builder((String)object);
        function1.invoke(dynamicLink$AndroidParameters$Builder);
        object = dynamicLink$AndroidParameters$Builder.build();
        dynamicLink$Builder.setAndroidParameters((DynamicLink$AndroidParameters)object);
    }

    public static final void androidParameters(DynamicLink$Builder dynamicLink$Builder, Function1 object) {
        Intrinsics.checkNotNullParameter(dynamicLink$Builder, "<this>");
        Intrinsics.checkNotNullParameter(object, "init");
        DynamicLink$AndroidParameters$Builder dynamicLink$AndroidParameters$Builder = new DynamicLink$AndroidParameters$Builder();
        object.invoke(dynamicLink$AndroidParameters$Builder);
        object = dynamicLink$AndroidParameters$Builder.build();
        dynamicLink$Builder.setAndroidParameters((DynamicLink$AndroidParameters)object);
    }

    public static final Uri component1(PendingDynamicLinkData pendingDynamicLinkData) {
        Intrinsics.checkNotNullParameter(pendingDynamicLinkData, "<this>");
        return pendingDynamicLinkData.getLink();
    }

    public static final Uri component1(ShortDynamicLink shortDynamicLink) {
        Intrinsics.checkNotNullParameter(shortDynamicLink, "<this>");
        return shortDynamicLink.getShortLink();
    }

    public static final int component2(PendingDynamicLinkData pendingDynamicLinkData) {
        Intrinsics.checkNotNullParameter(pendingDynamicLinkData, "<this>");
        return pendingDynamicLinkData.getMinimumAppVersion();
    }

    public static final Uri component2(ShortDynamicLink shortDynamicLink) {
        Intrinsics.checkNotNullParameter(shortDynamicLink, "<this>");
        return shortDynamicLink.getPreviewLink();
    }

    public static final long component3(PendingDynamicLinkData pendingDynamicLinkData) {
        Intrinsics.checkNotNullParameter(pendingDynamicLinkData, "<this>");
        return pendingDynamicLinkData.getClickTimestamp();
    }

    public static final List component3(ShortDynamicLink object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = object.getWarnings();
        Intrinsics.checkNotNullExpressionValue(object, "warnings");
        return object;
    }

    public static final DynamicLink dynamicLink(FirebaseDynamicLinks object, Function1 function1) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(function1, "init");
        object = FirebaseDynamicLinks.getInstance().createDynamicLink();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance().createDynamicLink()");
        function1.invoke(object);
        object = ((DynamicLink$Builder)object).buildDynamicLink();
        Intrinsics.checkNotNullExpressionValue(object, "builder.buildDynamicLink()");
        return object;
    }

    public static final FirebaseDynamicLinks dynamicLinks(Firebase object, FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(firebaseApp, "app");
        object = FirebaseDynamicLinks.getInstance(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(object, "getInstance(app)");
        return object;
    }

    public static final FirebaseDynamicLinks getDynamicLinks(Firebase object) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        object = FirebaseDynamicLinks.getInstance();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance()");
        return object;
    }

    public static final void googleAnalyticsParameters(DynamicLink$Builder dynamicLink$Builder, String object, String string2, String string3, Function1 function1) {
        Intrinsics.checkNotNullParameter(dynamicLink$Builder, "<this>");
        Intrinsics.checkNotNullParameter(object, "source");
        Intrinsics.checkNotNullParameter(string2, "medium");
        Intrinsics.checkNotNullParameter(string3, "campaign");
        Intrinsics.checkNotNullParameter(function1, "init");
        DynamicLink$GoogleAnalyticsParameters$Builder dynamicLink$GoogleAnalyticsParameters$Builder = new DynamicLink$GoogleAnalyticsParameters$Builder((String)object, string2, string3);
        function1.invoke(dynamicLink$GoogleAnalyticsParameters$Builder);
        object = dynamicLink$GoogleAnalyticsParameters$Builder.build();
        dynamicLink$Builder.setGoogleAnalyticsParameters((DynamicLink$GoogleAnalyticsParameters)object);
    }

    public static final void googleAnalyticsParameters(DynamicLink$Builder dynamicLink$Builder, Function1 object) {
        Intrinsics.checkNotNullParameter(dynamicLink$Builder, "<this>");
        Intrinsics.checkNotNullParameter(object, "init");
        DynamicLink$GoogleAnalyticsParameters$Builder dynamicLink$GoogleAnalyticsParameters$Builder = new DynamicLink$GoogleAnalyticsParameters$Builder();
        object.invoke(dynamicLink$GoogleAnalyticsParameters$Builder);
        object = dynamicLink$GoogleAnalyticsParameters$Builder.build();
        dynamicLink$Builder.setGoogleAnalyticsParameters((DynamicLink$GoogleAnalyticsParameters)object);
    }

    public static final void iosParameters(DynamicLink$Builder dynamicLink$Builder, String object, Function1 function1) {
        Intrinsics.checkNotNullParameter(dynamicLink$Builder, "<this>");
        Intrinsics.checkNotNullParameter(object, "bundleId");
        Intrinsics.checkNotNullParameter(function1, "init");
        DynamicLink$IosParameters$Builder dynamicLink$IosParameters$Builder = new DynamicLink$IosParameters$Builder((String)object);
        function1.invoke(dynamicLink$IosParameters$Builder);
        object = dynamicLink$IosParameters$Builder.build();
        dynamicLink$Builder.setIosParameters((DynamicLink$IosParameters)object);
    }

    public static final void itunesConnectAnalyticsParameters(DynamicLink$Builder dynamicLink$Builder, Function1 object) {
        Intrinsics.checkNotNullParameter(dynamicLink$Builder, "<this>");
        Intrinsics.checkNotNullParameter(object, "init");
        DynamicLink$ItunesConnectAnalyticsParameters$Builder dynamicLink$ItunesConnectAnalyticsParameters$Builder = new DynamicLink$ItunesConnectAnalyticsParameters$Builder();
        object.invoke(dynamicLink$ItunesConnectAnalyticsParameters$Builder);
        object = dynamicLink$ItunesConnectAnalyticsParameters$Builder.build();
        dynamicLink$Builder.setItunesConnectAnalyticsParameters((DynamicLink$ItunesConnectAnalyticsParameters)object);
    }

    public static final void navigationInfoParameters(DynamicLink$Builder dynamicLink$Builder, Function1 object) {
        Intrinsics.checkNotNullParameter(dynamicLink$Builder, "<this>");
        Intrinsics.checkNotNullParameter(object, "init");
        DynamicLink$NavigationInfoParameters$Builder dynamicLink$NavigationInfoParameters$Builder = new DynamicLink$NavigationInfoParameters$Builder();
        object.invoke(dynamicLink$NavigationInfoParameters$Builder);
        object = dynamicLink$NavigationInfoParameters$Builder.build();
        dynamicLink$Builder.setNavigationInfoParameters((DynamicLink$NavigationInfoParameters)object);
    }

    public static final Task shortLinkAsync(FirebaseDynamicLinks object, int n3, Function1 function1) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(function1, "init");
        object = FirebaseDynamicLinks.getInstance().createDynamicLink();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance().createDynamicLink()");
        function1.invoke(object);
        object = ((DynamicLink$Builder)object).buildShortDynamicLink(n3);
        Intrinsics.checkNotNullExpressionValue(object, "builder.buildShortDynamicLink(suffix)");
        return object;
    }

    public static final Task shortLinkAsync(FirebaseDynamicLinks object, Function1 function1) {
        Intrinsics.checkNotNullParameter(object, "<this>");
        Intrinsics.checkNotNullParameter(function1, "init");
        object = FirebaseDynamicLinks.getInstance().createDynamicLink();
        Intrinsics.checkNotNullExpressionValue(object, "getInstance().createDynamicLink()");
        function1.invoke(object);
        object = ((DynamicLink$Builder)object).buildShortDynamicLink();
        Intrinsics.checkNotNullExpressionValue(object, "builder.buildShortDynamicLink()");
        return object;
    }

    public static final void socialMetaTagParameters(DynamicLink$Builder dynamicLink$Builder, Function1 object) {
        Intrinsics.checkNotNullParameter(dynamicLink$Builder, "<this>");
        Intrinsics.checkNotNullParameter(object, "init");
        DynamicLink$SocialMetaTagParameters$Builder dynamicLink$SocialMetaTagParameters$Builder = new DynamicLink$SocialMetaTagParameters$Builder();
        object.invoke(dynamicLink$SocialMetaTagParameters$Builder);
        object = dynamicLink$SocialMetaTagParameters$Builder.build();
        dynamicLink$Builder.setSocialMetaTagParameters((DynamicLink$SocialMetaTagParameters)object);
    }
}

