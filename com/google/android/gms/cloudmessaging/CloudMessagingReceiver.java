/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.app.PendingIntent$CanceledException
 *  android.content.BroadcastReceiver
 *  android.content.BroadcastReceiver$PendingResult
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzh;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.internal.cloudmessaging.zze;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public abstract class CloudMessagingReceiver
extends BroadcastReceiver {
    private static SoftReference zza;
    private static SoftReference zzb;

    private final int zzb(Context context, Intent object) {
        String string2 = "pending_intent";
        PendingIntent pendingIntent = (PendingIntent)object.getParcelableExtra(string2);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            }
            catch (PendingIntent.CanceledException canceledException) {}
        }
        if ((pendingIntent = object.getExtras()) != null) {
            pendingIntent.remove(string2);
        } else {
            pendingIntent = new Bundle();
        }
        object = object.getAction();
        string2 = "com.google.firebase.messaging.NOTIFICATION_DISMISS";
        boolean bl2 = Objects.equals(object, string2);
        if (bl2) {
            this.onNotificationDismissed(context, (Bundle)pendingIntent);
            return -1;
        }
        return 500;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Executor getBroadcastExecutor() {
        Class<CloudMessagingReceiver> clazz = CloudMessagingReceiver.class;
        synchronized (clazz) {
            Throwable throwable2;
            block6: {
                Object object;
                block5: {
                    block4: {
                        try {
                            object = zza;
                            if (object == null) break block4;
                            object = ((SoftReference)object).get();
                            object = (ExecutorService)object;
                            break block5;
                        }
                        catch (Throwable throwable2) {
                            break block6;
                        }
                    }
                    object = null;
                }
                if (object == null) {
                    zze.zza();
                    SoftReference<Object> softReference = "firebase-iid-executor";
                    object = new NamedThreadFactory((String)((Object)softReference));
                    object = Executors.newCachedThreadPool((ThreadFactory)object);
                    object = Executors.unconfigurableExecutorService((ExecutorService)object);
                    zza = softReference = new SoftReference<Object>(object);
                }
                return object;
            }
            throw throwable2;
        }
    }

    public abstract int onMessageReceive(Context var1, CloudMessage var2);

    public void onNotificationDismissed(Context context, Bundle bundle) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        boolean bl2 = this.isOrderedBroadcast();
        BroadcastReceiver.PendingResult pendingResult = this.goAsync();
        Executor executor = this.getBroadcastExecutor();
        zzh zzh2 = new zzh(this, intent, context, bl2, pendingResult);
        executor.execute(zzh2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zza(Intent var1_1, Context var2_2, boolean var3_3, BroadcastReceiver.PendingResult var4_4) {
        block15: {
            block18: {
                block17: {
                    block16: {
                        var5_5 = this;
                        var6_6 = var1_1;
                        var7_11 = var2_2;
                        var8_12 = var4_4;
                        var9_13 = "wrapped_intent";
                        try {
                            var9_13 = var1_1.getParcelableExtra((String)var9_13);
                        }
                        catch (Throwable var6_7) {}
                        var10_14 = var9_13 instanceof Intent;
                        var11_15 = null;
                        if (!var10_14) ** GOTO lbl15
                        var9_13 = (Intent)var9_13;
                        break block16;
lbl15:
                        // 1 sources

                        var9_13 = null;
                    }
                    if (var9_13 == null) break block17;
                    var12_16 = var5_5.zzb(var7_11, (Intent)var9_13);
                    ** GOTO lbl69
                }
                var9_13 = var1_1.getExtras();
                if (var9_13 != null) break block18;
                var12_16 = 500;
                ** GOTO lbl69
            }
            var9_13 = new CloudMessage((Intent)var6_6);
            var10_14 = true;
            var6_6 = new CountDownLatch((int)var10_14);
            var13_17 = CloudMessagingReceiver.class;
            ** synchronized (var13_17)
lbl-1000:
            // 1 sources

            {
                var14_18 = CloudMessagingReceiver.zzb;
                if (var14_18 != null) {
                    var11_15 = var14_18.get();
                    var11_15 = (Executor)var11_15;
                }
                if (var11_15 == null) {
                    zze.zza();
                    var11_15 = "pscm-ack-executor";
                    var15_19 = new NamedThreadFactory((String)var11_15);
                    var16_20 = TimeUnit.SECONDS;
                    var17_21 = new LinkedBlockingQueue<Runnable>();
                    var18_22 = 1;
                    var19_23 = 1;
                    var20_24 = 60;
                    var14_18 = var11_15;
                    var11_15 = new ThreadPoolExecutor(var18_22, var19_23, var20_24, var16_20, var17_21, var15_19);
                    var11_15.allowCoreThreadTimeOut(var10_14);
                    var11_15 = Executors.unconfigurableExecutorService((ExecutorService)var11_15);
                    CloudMessagingReceiver.zzb = var22_25 = new SoftReference<Object>(var11_15);
                }
            }
            var22_25 = new SoftReference<Object>(var7_11, (CloudMessage)var9_13, (CountDownLatch)var6_6);
            var11_15.execute((Runnable)var22_25);
            var23_26 = var5_5.onMessageReceive(var7_11, (CloudMessage)var9_13);
            try {
                var9_13 = TimeUnit.SECONDS;
                var24_27 = 1L;
                var26_28 = var9_13.toMillis(var24_27);
                var11_15 = TimeUnit.MILLISECONDS;
                var6_6.await(var26_28, (TimeUnit)var11_15);
            }
            catch (InterruptedException var6_9) {
                var6_10 = var6_9.toString();
                var9_13 = "Message ack failed: ";
                var9_13.concat(var6_10);
            }
            var12_16 = var23_26;
lbl69:
            // 3 sources

            if (var3_3 && var8_12 != null) {
                var8_12.setResultCode(var12_16);
            }
            if (var8_12 == null) break block15;
            var4_4.finish();
        }
        return;
        if (var8_12 != null) {
            var4_4.finish();
        }
        throw var6_7;
        {
            catch (Throwable var6_8) {}
            {
                throw var6_8;
            }
        }
    }
}

