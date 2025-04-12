/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.analytics;

import android.content.Context;
import com.google.android.gms.analytics.ExceptionParser;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.HitBuilders$ExceptionBuilder;
import com.google.android.gms.analytics.StandardExceptionParser;
import com.google.android.gms.analytics.Tracker;
import com.google.android.gms.analytics.zza;
import com.google.android.gms.internal.gtm.zzen;
import java.util.ArrayList;
import java.util.Map;

public class ExceptionReporter
implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler zza;
    private final Tracker zzb;
    private final Context zzc;
    private ExceptionParser zzd;
    private GoogleAnalytics zze;

    public ExceptionReporter(Tracker object, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Context context) {
        if (object != null) {
            if (context != null) {
                this.zza = uncaughtExceptionHandler;
                this.zzb = object;
                ArrayList arrayList = new ArrayList();
                this.zzd = object = new StandardExceptionParser(context, arrayList);
                object = context.getApplicationContext();
                this.zzc = object;
                object = uncaughtExceptionHandler == null ? "null" : uncaughtExceptionHandler.getClass().getName();
                zzen.zzd("ExceptionReporter created, original handler is ".concat((String)object));
                return;
            }
            object = new NullPointerException("context cannot be null");
            throw object;
        }
        object = new NullPointerException("tracker cannot be null");
        throw object;
    }

    public ExceptionParser getExceptionParser() {
        return this.zzd;
    }

    public void setExceptionParser(ExceptionParser exceptionParser) {
        this.zzd = exceptionParser;
    }

    public void uncaughtException(Thread thread2, Throwable throwable) {
        Object object;
        boolean bl2;
        Object object2 = this.zzd;
        if (object2 != null) {
            if (thread2 != null) {
                object2 = thread2.getName();
            } else {
                bl2 = false;
                object2 = null;
            }
            object = this.zzd;
            object2 = object.getDescription((String)object2, throwable);
        } else {
            object2 = "UncaughtException";
        }
        object = String.valueOf(object2);
        zzen.zzd("Reporting uncaught exception: ".concat((String)object));
        object = this.zzb;
        HitBuilders$ExceptionBuilder hitBuilders$ExceptionBuilder = new HitBuilders$ExceptionBuilder();
        hitBuilders$ExceptionBuilder.setDescription((String)object2);
        bl2 = true;
        hitBuilders$ExceptionBuilder.setFatal(bl2);
        object2 = hitBuilders$ExceptionBuilder.build();
        ((Tracker)object).send((Map)object2);
        object2 = this.zze;
        if (object2 == null) {
            this.zze = object2 = GoogleAnalytics.getInstance(this.zzc);
        }
        object2 = this.zze;
        ((GoogleAnalytics)object2).dispatchLocalHits();
        ((zza)object2).zzb().zzf().zzn();
        object2 = this.zza;
        if (object2 != null) {
            zzen.zzd("Passing exception to the original handler");
            object2 = this.zza;
            object2.uncaughtException(thread2, throwable);
        }
    }

    public final Thread.UncaughtExceptionHandler zza() {
        return this.zza;
    }
}

