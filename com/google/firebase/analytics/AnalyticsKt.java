/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.analytics.ConsentBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ParametersBuilder;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class AnalyticsKt {
    private static volatile FirebaseAnalytics zza;
    private static final Object zzb;

    static {
        Object object;
        zzb = object = new Object();
    }

    public static final FirebaseAnalytics getANALYTICS() {
        return zza;
    }

    public static final FirebaseAnalytics getAnalytics(Firebase object) {
        block11: {
            Object object2 = "<this>";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = zza;
            if (object == null) {
                object = zzb;
                synchronized (object) {
                    Throwable throwable2;
                    block10: {
                        block9: {
                            try {
                                object2 = zza;
                                if (object2 != null) break block9;
                            }
                            catch (Throwable throwable2) {
                                break block10;
                            }
                            object2 = Firebase.INSTANCE;
                            object2 = FirebaseKt.getApp((Firebase)object2);
                            object2 = ((FirebaseApp)object2).getApplicationContext();
                            object2 = FirebaseAnalytics.getInstance((Context)object2);
                            zza = object2;
                        }
                        break block11;
                    }
                    throw throwable2;
                }
            }
        }
        object = zza;
        Intrinsics.checkNotNull(object);
        return object;
    }

    public static final Object getLOCK() {
        return zzb;
    }

    public static final void logEvent(FirebaseAnalytics firebaseAnalytics, String string2, Function1 function1) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(function1, "block");
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        function1.invoke(parametersBuilder);
        function1 = parametersBuilder.getBundle();
        firebaseAnalytics.logEvent(string2, (Bundle)function1);
    }

    public static final void setANALYTICS(FirebaseAnalytics firebaseAnalytics) {
        zza = firebaseAnalytics;
    }

    public static final void setConsent(FirebaseAnalytics firebaseAnalytics, Function1 object) {
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "<this>");
        Intrinsics.checkNotNullParameter(object, "block");
        ConsentBuilder consentBuilder = new ConsentBuilder();
        object.invoke(consentBuilder);
        object = consentBuilder.asMap();
        firebaseAnalytics.setConsent((Map)object);
    }
}

