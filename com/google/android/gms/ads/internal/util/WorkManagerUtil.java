/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build$VERSION
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.Build;
import androidx.work.a;
import androidx.work.a$a;
import androidx.work.b;
import androidx.work.b$b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzbs;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public class WorkManagerUtil
extends zzbs {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void zzb(Context context) {
        try {
            context = context.getApplicationContext();
        }
        catch (IllegalStateException illegalStateException) {
            return;
        }
        Object object = new Object();
        a a2 = new a((a$a)object);
        object = "context";
        Intrinsics.checkNotNullParameter(context, (String)object);
        object = "configuration";
        Intrinsics.checkNotNullParameter(a2, (String)object);
        ni3_1.j(context, a2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(IObjectWrapper iObjectWrapper) {
        Object object = (Context)ObjectWrapper.unwrap(iObjectWrapper);
        WorkManagerUtil.zzb((Context)object);
        Object object2 = "context";
        try {
            Intrinsics.checkNotNullParameter(object, (String)object2);
            object = ni3_1.i((Context)object);
            object2 = "getInstance(context)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        }
        catch (IllegalStateException illegalStateException) {
            zzm.zzk("Failed to instantiate WorkManager.", illegalStateException);
            return;
        }
        object.getClass();
        object2 = "offline_ping_sender_work";
        String string2 = "tag";
        Intrinsics.checkNotNullParameter(object2, string2);
        Intrinsics.checkNotNullParameter(object, "workManagerImpl");
        Object object3 = ((ni3_1)object).b.m;
        Object object4 = ((ni3_1)object).d.c();
        Intrinsics.checkNotNullExpressionValue(object4, "workManagerImpl.workTask\u2026ecutor.serialTaskExecutor");
        int n3 = 1;
        Class<OfflinePingSender> clazz = new Class<OfflinePingSender>(object, n3);
        O92.a((S40)object3, "CancelWorkByTag_offline_ping_sender_work", (VZ2)object4, (Function0)((Object)clazz));
        object3 = lV1.NOT_REQUIRED;
        object3 = new LinkedHashSet();
        lV1 lV12 = lV1.CONNECTED;
        Intrinsics.checkNotNullParameter((Object)lV12, "networkType");
        object4 = null;
        clazz = new Class<OfflinePingSender>(null);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 24;
        object3 = n4 >= n7 ? CollectionsKt.o0((Iterable)object3) : vz0_2.a;
        Object object5 = object3;
        long l2 = -1;
        object4 = object3;
        object3 = new b60((dv1_0)((Object)clazz), lV12, false, false, false, false, l2, l2, (Set)object5);
        clazz = OfflinePingSender.class;
        Intrinsics.checkNotNullParameter(clazz, "workerClass");
        object4 = new CI3$a(clazz);
        object3 = (y92$a)((CI3$a)object4).d((b60)object3);
        Intrinsics.checkNotNullParameter(object2, string2);
        ((CI3$a)object3).c.add(object2);
        object2 = (y92)((CI3$a)object3).a();
        ((li3_1)object).c((y92)object2);
    }

    public final boolean zzf(IObjectWrapper iObjectWrapper, String string2, String string3) {
        zza zza2 = new zza(string2, string3, "");
        return this.zzg(iObjectWrapper, zza2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzg(IObjectWrapper object, zza object2) {
        b60 b602;
        void var3_8;
        object = (Context)ObjectWrapper.unwrap((IObjectWrapper)object);
        WorkManagerUtil.zzb((Context)object);
        lV1 lV12 = lV1.NOT_REQUIRED;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        lV1 lV13 = lV1.CONNECTED;
        Intrinsics.checkNotNullParameter((Object)lV13, "networkType");
        Object object3 = null;
        Class<OfflineNotificationPoster> clazz = new Class<OfflineNotificationPoster>(null);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 24;
        if (n3 >= n4) {
            Set set = CollectionsKt.o0(linkedHashSet);
        } else {
            vz0_2 vz0_22 = vz0_2.a;
        }
        void var9_21 = var3_8;
        long l2 = -1;
        n4 = 0;
        object3 = b602;
        b602 = new b60((dv1_0)((Object)clazz), lV13, false, false, false, false, l2, l2, (Set)var9_21);
        object3 = new LinkedHashMap();
        clazz = ((zza)object2).zza;
        String string2 = "uri";
        String string3 = "key";
        Intrinsics.checkNotNullParameter(string2, string3);
        object3.put(string2, clazz);
        clazz = ((zza)object2).zzb;
        String string4 = "gws_query_id";
        Intrinsics.checkNotNullParameter(string4, string3);
        object3.put(string4, clazz);
        object2 = ((zza)object2).zzc;
        clazz = "image_url";
        Intrinsics.checkNotNullParameter(clazz, string3);
        object3.put(clazz, object2);
        object2 = new b((Map)object3);
        b$b.b((b)object2);
        clazz = OfflineNotificationPoster.class;
        String string5 = "workerClass";
        Intrinsics.checkNotNullParameter(clazz, string5);
        object3 = new CI3$a(clazz);
        object2 = (y92$a)((y92$a)((CI3$a)object3).d(b602)).e((b)object2);
        object3 = "offline_notification_work";
        Intrinsics.checkNotNullParameter(object3, "tag");
        ((CI3$a)object2).c.add(object3);
        object2 = (y92)((CI3$a)object2).a();
        String string6 = "context";
        try {
            Intrinsics.checkNotNullParameter(object, string6);
            object = ni3_1.i((Context)object);
            String string7 = "getInstance(context)";
            Intrinsics.checkNotNullExpressionValue(object, string7);
        }
        catch (IllegalStateException illegalStateException) {
            zzm.zzk("Failed to instantiate WorkManager.", illegalStateException);
            return false;
        }
        ((li3_1)object).c((y92)object2);
        return true;
    }
}

