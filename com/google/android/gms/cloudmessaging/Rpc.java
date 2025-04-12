/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Messenger
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.util.Log
 */
package com.google.android.gms.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzaa;
import com.google.android.gms.cloudmessaging.zzab;
import com.google.android.gms.cloudmessaging.zzac;
import com.google.android.gms.cloudmessaging.zzad;
import com.google.android.gms.cloudmessaging.zzae;
import com.google.android.gms.cloudmessaging.zzc;
import com.google.android.gms.cloudmessaging.zzd;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.cloudmessaging.zzw;
import com.google.android.gms.cloudmessaging.zzx;
import com.google.android.gms.cloudmessaging.zzy;
import com.google.android.gms.cloudmessaging.zzz;
import com.google.android.gms.internal.cloudmessaging.zza;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rpc {
    private static int zza;
    private static PendingIntent zzb;
    private static final Executor zzc;
    private static final Pattern zzd;
    private final a53 zze;
    private final Context zzf;
    private final zzw zzg;
    private final ScheduledExecutorService zzh;
    private final Messenger zzi;
    private Messenger zzj;
    private zzd zzk;

    static {
        zzc = zzy.zza;
        zzd = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    }

    public Rpc(Context object) {
        Object object2 = new a53();
        this.zze = object2;
        this.zzf = object;
        this.zzg = object2 = new zzw((Context)object);
        Looper looper = Looper.getMainLooper();
        object2 = new zzae(this, looper);
        super((Handler)object2);
        this.zzi = object;
        boolean bl2 = true;
        super((int)(bl2 ? 1 : 0));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        ((ThreadPoolExecutor)object).setKeepAliveTime(60, timeUnit);
        ((ThreadPoolExecutor)object).allowCoreThreadTimeOut(bl2);
        this.zzh = object;
    }

    public static /* synthetic */ Task zza(Bundle bundle) {
        boolean bl2 = Rpc.zzi(bundle);
        if (bl2) {
            return Tasks.forResult(null);
        }
        return Tasks.forResult(bundle);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzc(Rpc object, Message message) {
        Object object2;
        int n3;
        if (message == null || (n3 = (object2 = message.obj) instanceof Intent) == 0) return;
        object2 = (Intent)object2;
        Object object3 = new zzc();
        object2.setExtrasClassLoader((ClassLoader)object3);
        object3 = "google.messenger";
        n3 = object2.hasExtra((String)object3);
        if (n3 != 0) {
            object3 = "google.messenger";
            n3 = (object2 = object2.getParcelableExtra((String)object3)) instanceof zzd;
            if (n3 != 0) {
                object3 = object2;
                ((Rpc)object).zzk = object3 = (zzd)object2;
            }
            if ((n3 = object2 instanceof Messenger) != 0) {
                object2 = (Messenger)object2;
                ((Rpc)object).zzj = object2;
            }
        }
        message = (Intent)message.obj;
        object2 = message.getAction();
        object3 = "com.google.android.c2dm.intent.REGISTRATION";
        n3 = Objects.equals(object2, object3);
        int n4 = 3;
        if (n3 == 0) {
            object = "Rpc";
            boolean bl2 = Log.isLoggable((String)object, (int)n4);
            if (!bl2) return;
            object = String.valueOf(object2);
            "Unexpected response action: ".concat((String)object);
            return;
        } else {
            object2 = message.getStringExtra("registration_id");
            if (object2 == null) {
                object2 = message.getStringExtra("unregistered");
            }
            n3 = 2;
            int n7 = 1;
            if (object2 == null) {
                object2 = message.getStringExtra("error");
                if (object2 == null) {
                    object = String.valueOf(message.getExtras());
                    "Unexpected response, no error or registration id ".concat((String)object);
                    return;
                }
                Object object4 = "Rpc";
                boolean bl3 = Log.isLoggable((String)object4, (int)n4);
                if (bl3) {
                    object4 = "Received InstanceID error ";
                    object4.concat((String)object2);
                }
                if (bl3 = ((String)object2).startsWith((String)(object4 = "|"))) {
                    String string2;
                    String string3;
                    object4 = ((String)object2).split("\\|");
                    int n8 = ((String[])object4).length;
                    if (n8 > n3 && (n8 = (int)(Objects.equals(string3 = object4[n7], string2 = "ID") ? 1 : 0)) != 0) {
                        object2 = object4[n3];
                        object3 = object4[n4];
                        String string4 = ":";
                        if ((n4 = (int)(((String)object3).startsWith(string4) ? 1 : 0)) != 0) {
                            object3 = ((String)object3).substring(n7);
                        }
                        message = message.putExtra("error", (String)object3).getExtras();
                        super.zzh((String)object2, (Bundle)message);
                        return;
                    }
                    "Unexpected structured response ".concat((String)object2);
                    return;
                }
                object4 = ((Rpc)object).zze;
                synchronized (object4) {
                    int n10 = 0;
                    object2 = null;
                    try {
                        while (true) {
                            object3 = ((Rpc)object).zze;
                            n4 = ((a53)object3).c;
                            if (n10 >= n4) {
                                return;
                            }
                            object3 = ((a53)object3).h(n10);
                            object3 = (String)object3;
                            Bundle bundle = message.getExtras();
                            super.zzh((String)object3, bundle);
                            ++n10;
                        }
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
            }
            Matcher matcher = zzd.matcher((CharSequence)object2);
            boolean bl4 = matcher.matches();
            if (!bl4) {
                object = "Rpc";
                boolean bl5 = Log.isLoggable((String)object, (int)n4);
                if (!bl5) return;
                "Unexpected response string: ".concat((String)object2);
                return;
            } else {
                object2 = matcher.group(n7);
                object3 = matcher.group(n3);
                if (object2 == null) return;
                message = message.getExtras();
                String string5 = "registration_id";
                message.putString(string5, (String)object3);
                super.zzh((String)object2, (Bundle)message);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final Task zze(Bundle object) {
        Object object2;
        Object object3;
        Object object4;
        TaskCompletionSource taskCompletionSource;
        String string2;
        block13: {
            string2 = Rpc.zzf();
            taskCompletionSource = new TaskCompletionSource();
            object4 = this.zze;
            synchronized (object4) {
                object3 = this.zze;
                ((a53)object3).put(string2, taskCompletionSource);
            }
            object4 = new Intent();
            object4.setPackage("com.google.android.gms");
            object3 = this.zzg;
            int n3 = ((zzw)object3).zzb();
            int n4 = 2;
            if (n3 == n4) {
                object3 = "com.google.iid.TOKEN_REQUEST";
                object4.setAction((String)object3);
            } else {
                object3 = "com.google.android.c2dm.intent.REGISTER";
                object4.setAction((String)object3);
            }
            object4.putExtras((Bundle)object);
            Rpc.zzg(this.zzf, (Intent)object4);
            object = new StringBuilder("|ID|");
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append("|");
            object = ((StringBuilder)object).toString();
            object3 = "kid";
            object4.putExtra((String)object3, (String)object);
            object = "Rpc";
            n3 = 3;
            int n7 = Log.isLoggable((String)object, (int)n3);
            if (n7 != 0) {
                object = String.valueOf(object4.getExtras());
                object2 = "Sending ";
                ((String)object2).concat((String)object);
            }
            object = this.zzi;
            object2 = "google.messenger";
            object4.putExtra((String)object2, (Parcelable)object);
            object = this.zzj;
            if (object != null || (object = this.zzk) != null) {
                object = Message.obtain();
                ((Message)object).obj = object4;
                try {
                    object2 = this.zzj;
                    if (object2 != null) {
                        object2.send((Message)object);
                        break block13;
                    } else {
                        object2 = this.zzk;
                        ((zzd)object2).zzb((Message)object);
                    }
                    break block13;
                }
                catch (RemoteException remoteException) {
                    object = "Rpc";
                    Log.isLoggable((String)object, (int)n3);
                }
            }
            if ((n7 = ((zzw)(object = this.zzg)).zzb()) == n4) {
                object = this.zzf;
                object.sendBroadcast((Intent)object4);
            } else {
                object = this.zzf;
                object.startService((Intent)object4);
            }
        }
        object = this.zzh;
        object4 = new zzac(taskCompletionSource);
        object2 = TimeUnit.SECONDS;
        object = object.schedule((Runnable)object4, (long)30, (TimeUnit)((Object)object2));
        object4 = taskCompletionSource.getTask();
        object3 = zzc;
        zzad zzad2 = new zzad(this, string2, (ScheduledFuture)object);
        ((Task)object4).addOnCompleteListener((Executor)object3, (OnCompleteListener)zzad2);
        return taskCompletionSource.getTask();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static String zzf() {
        Class<Rpc> clazz = Rpc.class;
        synchronized (clazz) {
            int n3;
            int n4 = zza;
            zza = n3 = n4 + 1;
            return Integer.toString(n4);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void zzg(Context object, Intent intent) {
        Class<Rpc> clazz = Rpc.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                PendingIntent pendingIntent;
                block3: {
                    try {
                        pendingIntent = zzb;
                        if (pendingIntent != null) break block3;
                        pendingIntent = new Intent();
                        String string2 = "com.google.example.invalidpackage";
                        pendingIntent.setPackage(string2);
                        int n3 = com.google.android.gms.internal.cloudmessaging.zza.zza;
                        object = PendingIntent.getBroadcast((Context)object, (int)0, (Intent)pendingIntent, (int)n3);
                        zzb = object;
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                object = "app";
                pendingIntent = zzb;
                intent.putExtra((String)object, (Parcelable)pendingIntent);
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzh(String object, Bundle bundle) {
        a53 a532 = this.zze;
        synchronized (a532) {
            Throwable throwable2;
            block4: {
                try {
                    a53 a533 = this.zze;
                    object = a533.remove(object);
                    object = (TaskCompletionSource)object;
                    if (object == null) {
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                ((TaskCompletionSource)object).setResult(bundle);
                return;
            }
            throw throwable2;
        }
    }

    private static boolean zzi(Bundle bundle) {
        String string2;
        boolean bl2;
        return bundle != null && (bl2 = bundle.containsKey(string2 = "google.messenger"));
    }

    public Task getProxiedNotificationData() {
        int n3;
        Object object = this.zzg;
        int n4 = ((zzw)object).zza();
        if (n4 >= (n3 = 241100000)) {
            object = zzv.zzb(this.zzf);
            Object object2 = Bundle.EMPTY;
            object = ((zzv)object).zzd(5, (Bundle)object2);
            Executor executor = zzc;
            object2 = zzab.zza;
            return ((Task)object).continueWith(executor, (Continuation)object2);
        }
        object = new IOException("SERVICE_NOT_AVAILABLE");
        return Tasks.forException((Exception)object);
    }

    public Task messageHandled(CloudMessage object) {
        int n3;
        zzw zzw2 = this.zzg;
        int n4 = zzw2.zza();
        if (n4 >= (n3 = 233700000)) {
            zzw2 = new Bundle();
            String string2 = ((CloudMessage)object).getMessageId();
            String string3 = "google.message_id";
            zzw2.putString(string3, string2);
            object = ((CloudMessage)object).zza();
            if (object != null) {
                string2 = "google.product_id";
                int n7 = (Integer)object;
                zzw2.putInt(string2, n7);
            }
            return zzv.zzb(this.zzf).zzc(3, (Bundle)zzw2);
        }
        object = new IOException("SERVICE_NOT_AVAILABLE");
        return Tasks.forException((Exception)object);
    }

    public Task send(Bundle object) {
        int n3;
        Object object2 = this.zzg;
        int n4 = ((zzw)object2).zza();
        if (n4 < (n3 = 12000000)) {
            object2 = this.zzg;
            n4 = ((zzw)object2).zzb();
            if (n4 != 0) {
                object2 = this.zze((Bundle)object);
                Executor executor = zzc;
                zzz zzz2 = new zzz(this, (Bundle)object);
                object = ((Task)object2).continueWithTask(executor, zzz2);
            } else {
                object2 = "MISSING_INSTANCEID_SERVICE";
                object = new IOException((String)object2);
                object = Tasks.forException((Exception)object);
            }
            return object;
        }
        object = zzv.zzb(this.zzf).zzd(1, (Bundle)object);
        object2 = zzc;
        zzaa zzaa2 = zzaa.zza;
        return ((Task)object).continueWith((Executor)object2, zzaa2);
    }

    public Task setRetainProxiedNotifications(boolean bl2) {
        int n3;
        zzw zzw2 = this.zzg;
        int n4 = zzw2.zza();
        if (n4 >= (n3 = 241100000)) {
            zzw2 = new Bundle();
            zzw2.putBoolean("proxy_retention", bl2);
            return zzv.zzb(this.zzf).zzc(4, (Bundle)zzw2);
        }
        IOException iOException = new IOException("SERVICE_NOT_AVAILABLE");
        return Tasks.forException(iOException);
    }

    public final /* synthetic */ Task zzb(Bundle object, Task object2) {
        Object object3;
        boolean bl2 = ((Task)object2).isSuccessful();
        if (bl2 && (bl2 = Rpc.zzi(object3 = (Bundle)((Task)object2).getResult()))) {
            object = this.zze((Bundle)object);
            object2 = zzc;
            object3 = zzx.zza;
            return ((Task)object).onSuccessTask((Executor)object2, (SuccessContinuation)object3);
        }
        return object2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzd(String string2, ScheduledFuture scheduledFuture, Task object) {
        object = this.zze;
        synchronized (object) {
            a53 a532 = this.zze;
            a532.remove(string2);
        }
        scheduledFuture.cancel(false);
    }
}

