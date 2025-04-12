/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.AccountManager
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.RemoteException
 *  android.os.SystemClock
 *  android.text.TextUtils
 *  android.util.Log
 */
package com.google.android.gms.auth;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GooglePlayServicesAvailabilityException;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.auth.zzd;
import com.google.android.gms.auth.zzf;
import com.google.android.gms.auth.zzg;
import com.google.android.gms.auth.zzh;
import com.google.android.gms.auth.zzi;
import com.google.android.gms.auth.zzj;
import com.google.android.gms.auth.zzk;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.internal.GmsClientSupervisor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.internal.auth.zzbw;
import com.google.android.gms.internal.auth.zzby;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zze;
import com.google.android.gms.internal.auth.zzhs;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;

public class zzl {
    public static final int CHANGE_TYPE_ACCOUNT_ADDED = 1;
    public static final int CHANGE_TYPE_ACCOUNT_REMOVED = 2;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_FROM = 3;
    public static final int CHANGE_TYPE_ACCOUNT_RENAMED_TO = 4;
    public static final String GOOGLE_ACCOUNT_TYPE = "com.google";
    public static final String KEY_SUPPRESS_PROGRESS_SCREEN = "suppressProgressScreen";
    public static final String WORK_ACCOUNT_TYPE = "com.google.work";
    public static final String[] zza;
    public static final String zzb;
    private static final ComponentName zzc;
    private static final Logger zzd;

    static {
        ComponentName componentName;
        zza = new String[]{GOOGLE_ACCOUNT_TYPE, WORK_ACCOUNT_TYPE, "cn.google"};
        zzb = "androidPackageName";
        zzc = componentName = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");
        zzd = com.google.android.gms.auth.zzd.zza("GoogleAuthUtil");
    }

    public static void clearToken(Context context, String string2) {
        zzl.zze(context, string2, 0L);
    }

    public static List getAccountChangeEvents(Context context, int n3, String string2) {
        Preconditions.checkNotEmpty(string2, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        int n4 = 8400000;
        zzl.zzk(context, n4);
        AccountChangeEventsRequest accountChangeEventsRequest = new AccountChangeEventsRequest();
        accountChangeEventsRequest.setAccountName(string2);
        accountChangeEventsRequest.setEventIndex(n3);
        zzdc.zze(context);
        n3 = (int)(zzhs.zzd() ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(zzl.zzo(context) ? 1 : 0)) != 0) {
            Object object = com.google.android.gms.internal.auth.zzh.zza(context).zzb(accountChangeEventsRequest);
            string2 = "account change events retrieval";
            object = zzl.zzi((Task)object, string2);
            object = (AccountChangeEventsResponse)object;
            try {
                zzl.zzj(object);
                return ((AccountChangeEventsResponse)object).getEvents();
            }
            catch (ApiException apiException) {
                zzl.zzl(apiException, string2);
            }
        }
        zzi zzi2 = new zzi(accountChangeEventsRequest);
        string2 = zzc;
        return (List)zzl.zzh(context, (ComponentName)string2, zzi2, 0L);
    }

    public static String getAccountId(Context context, String string2) {
        Preconditions.checkNotEmpty(string2, "accountName must be provided");
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        zzl.zzk(context, 8400000);
        Bundle bundle = new Bundle();
        return zzl.getToken(context, string2, "^^_account_id_^^", bundle);
    }

    public static String getToken(Context context, Account account, String string2) {
        Bundle bundle = new Bundle();
        return zzl.getToken(context, account, string2, bundle);
    }

    public static String getToken(Context context, Account account, String string2, Bundle bundle) {
        zzl.zzn(account);
        return zzl.zza(context, account, string2, bundle).zza();
    }

    public static String getToken(Context context, String string2, String string3) {
        Account account = new Account(string2, GOOGLE_ACCOUNT_TYPE);
        return zzl.getToken(context, account, string3);
    }

    public static String getToken(Context context, String string2, String string3, Bundle bundle) {
        Account account = new Account(string2, GOOGLE_ACCOUNT_TYPE);
        return zzl.getToken(context, account, string3, bundle);
    }

    public static void invalidateToken(Context context, String string2) {
        AccountManager.get((Context)context).invalidateAuthToken(GOOGLE_ACCOUNT_TYPE, string2);
    }

    public static Bundle removeAccount(Context context, Account account) {
        Preconditions.checkNotNull(context);
        zzl.zzn(account);
        zzl.zzk(context, 8400000);
        zzdc.zze(context);
        boolean bl2 = zzhs.zze();
        if (bl2 && (bl2 = zzl.zzo(context))) {
            Object object = com.google.android.gms.internal.auth.zzh.zza(context).zzd(account);
            String string2 = "account removal";
            object = zzl.zzi((Task)object, string2);
            object = (Bundle)object;
            try {
                zzl.zzj(object);
                return object;
            }
            catch (ApiException apiException) {
                zzl.zzl(apiException, string2);
            }
        }
        zzg zzg2 = new zzg(account);
        account = zzc;
        return (Bundle)zzl.zzh(context, (ComponentName)account, zzg2, 0L);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Boolean requestGoogleAccountsAccess(Context context) {
        Object object = "isUserRecoverableError status: ";
        Preconditions.checkNotNull(context);
        int n3 = 11400000;
        zzl.zzk(context, n3);
        String string2 = context.getApplicationInfo().packageName;
        zzdc.zze(context);
        boolean bl2 = zzhs.zze();
        if (bl2 && (bl2 = zzl.zzo(context))) {
            ApiException apiException2;
            String string3;
            block5: {
                boolean bl3;
                Object object2;
                Object[] objectArray;
                String string4;
                Object object3 = com.google.android.gms.internal.auth.zzh.zza(context).zze(string2);
                string3 = "google accounts access request";
                try {
                    object3 = zzl.zzi((Task)object3, string3);
                    object3 = (Bundle)object3;
                    string4 = "Error";
                    string4 = object3.getString(string4);
                    objectArray = "userRecoveryIntent";
                    object3 = object3.getParcelable((String)objectArray);
                    object3 = (Intent)object3;
                    objectArray = zzby.zza(string4);
                    object2 = zzby.zzc;
                    bl3 = object2.equals(objectArray);
                    if (bl3) {
                        return Boolean.TRUE;
                    }
                }
                catch (ApiException apiException2) {
                    break block5;
                }
                bl3 = zzby.zzb((zzby)objectArray);
                if (bl3) {
                    object2 = zzd;
                    objectArray = String.valueOf(objectArray);
                    object = ((String)object).concat((String)objectArray);
                    objectArray = null;
                    objectArray = new Object[]{};
                    ((Logger)object2).w((String)object, objectArray);
                    object = new UserRecoverableAuthException(string4, (Intent)object3);
                    throw object;
                }
                object = new GoogleAuthException(string4);
                throw object;
            }
            zzl.zzl(apiException2, string3);
        }
        object = new zzj(string2);
        string2 = zzc;
        return (Boolean)zzl.zzh(context, (ComponentName)string2, (zzk)object, 0L);
    }

    public static TokenData zza(Context context, Account account, String string2, Bundle object) {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        Object object2 = "Scope cannot be empty or null.";
        Preconditions.checkNotEmpty(string2, object2);
        zzl.zzn(account);
        int n3 = 8400000;
        zzl.zzk(context, n3);
        if (object == null) {
            object = new Bundle();
        } else {
            object2 = new Bundle(object);
            object = object2;
        }
        zzl.zzm(context, object);
        zzdc.zze(context);
        n3 = (int)(zzhs.zze() ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(zzl.zzo(context) ? 1 : 0)) != 0) {
            object2 = com.google.android.gms.internal.auth.zzh.zza(context).zzc(account, string2, (Bundle)object);
            String string3 = "token retrieval";
            object2 = zzl.zzi((Task)object2, string3);
            object2 = (Bundle)object2;
            try {
                zzl.zzj(object2);
                return zzl.zzg((Bundle)object2);
            }
            catch (ApiException apiException) {
                zzl.zzl(apiException, string3);
            }
        }
        object2 = new zzf(account, string2, (Bundle)object);
        account = zzc;
        return (TokenData)zzl.zzh(context, (ComponentName)account, (zzk)object2, 0L);
    }

    public static /* synthetic */ TokenData zzb(Account object, String string2, Bundle bundle, IBinder object2) {
        object = (object2 = zze.zzb((IBinder)object2)).zze((Account)object, string2, bundle);
        if (object != null) {
            return zzl.zzg((Bundle)object);
        }
        object = new IOException("Service call returned null");
        throw object;
    }

    public static /* bridge */ /* synthetic */ Logger zzc() {
        return zzd;
    }

    public static /* bridge */ /* synthetic */ Object zzd(Object object) {
        zzl.zzj(object);
        return object;
    }

    public static void zze(Context context, String string2, long l2) {
        Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
        int n3 = 8400000;
        zzl.zzk(context, n3);
        Bundle bundle = new Bundle();
        zzl.zzm(context, bundle);
        zzdc.zze(context);
        boolean bl2 = zzhs.zze();
        if (bl2 && (bl2 = zzl.zzo(context))) {
            Object object = com.google.android.gms.internal.auth.zzh.zza(context);
            Object object2 = new zzbw();
            ((zzbw)object2).zza(string2);
            object = object.zza((zzbw)object2);
            object2 = "clear token";
            try {
                zzl.zzi((Task)object, (String)object2);
                return;
            }
            catch (ApiException apiException) {
                zzl.zzl(apiException, (String)object2);
            }
        }
        zzh zzh2 = new zzh(string2, bundle);
        string2 = zzc;
        zzl.zzh(context, (ComponentName)string2, zzh2, 0L);
    }

    public static void zzf(Intent object) {
        if (object != null) {
            int n3 = 1;
            object = object.toUri(n3);
            try {
                Intent.parseUri((String)object, (int)n3);
                return;
            }
            catch (URISyntaxException uRISyntaxException) {
                object = new IllegalArgumentException("Parameter callback contains invalid data. It must be serializable using toUri() and parseUri().");
                throw object;
            }
        }
        object = new IllegalArgumentException("Callback cannot be null.");
        throw object;
    }

    private static TokenData zzg(Bundle object) {
        Object object2;
        Object object3 = TokenData.CREATOR;
        object3 = TokenData.class.getClassLoader();
        if (object3 != null) {
            object.setClassLoader((ClassLoader)object3);
        }
        if ((object2 = object.getBundle("tokenDetails")) == null) {
            object3 = null;
        } else {
            if (object3 != null) {
                object2.setClassLoader((ClassLoader)object3);
            }
            object3 = (TokenData)object2.getParcelable("TokenData");
        }
        if (object3 != null) {
            return object3;
        }
        object3 = object.getString("Error");
        Preconditions.checkNotNull(object3);
        object = (Intent)object.getParcelable("userRecoveryIntent");
        object2 = zzby.zza((String)object3);
        boolean bl2 = zzby.zzb((zzby)((Object)object2));
        if (!bl2) {
            object = zzby.zze;
            boolean bl3 = object.equals(object2);
            if (!(bl3 || (bl3 = (object = zzby.zzf).equals(object2)) || (bl3 = (object = zzby.zzg).equals(object2)) || (bl3 = (object = zzby.zzaf).equals(object2)) || (bl3 = (object = zzby.zzah).equals(object2)))) {
                object = new GoogleAuthException((String)object3);
                throw object;
            }
            object = new IOException((String)object3);
            throw object;
        }
        Logger logger = zzd;
        object2 = String.valueOf(object2);
        object2 = "isUserRecoverableError status: ".concat((String)object2);
        Object[] objectArray = new Object[]{};
        logger.w((String)object2, objectArray);
        object2 = new UserRecoverableAuthException((String)object3, (Intent)object);
        throw object2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Object zzh(Context object, ComponentName object2, zzk object3, long l2) {
        Throwable throwable2;
        BlockingServiceConnection blockingServiceConnection;
        String string2;
        block9: {
            block8: {
                string2 = "GoogleAuthUtil";
                blockingServiceConnection = new BlockingServiceConnection();
                object = GmsClientSupervisor.getInstance((Context)object);
                try {
                    boolean bl2 = ((GmsClientSupervisor)object).bindService((ComponentName)object2, (ServiceConnection)blockingServiceConnection, string2);
                    if (!bl2) break block8;
                }
                catch (SecurityException securityException) {
                    object2 = securityException.getMessage();
                    object3 = new StringBuilder("SecurityException while bind to auth service: ");
                    ((StringBuilder)object3).append((String)object2);
                    object2 = new IOException("SecurityException while binding to Auth service.", securityException);
                    throw object2;
                }
                try {
                    IBinder iBinder = blockingServiceConnection.getService();
                    object3 = object3.zza(iBinder);
                    ((GmsClientSupervisor)object).unbindService((ComponentName)object2, (ServiceConnection)blockingServiceConnection, string2);
                    return object3;
                }
                catch (Throwable throwable2) {
                    break block9;
                }
                catch (InterruptedException interruptedException) {
                }
                catch (RemoteException remoteException) {
                }
                catch (TimeoutException timeoutException) {
                    // empty catch block
                }
            }
            object = new IOException("Could not bind to service.");
            throw object;
            {
                String string3 = "Error on service connection.";
                IOException iOException = new IOException(string3, (Throwable)object3);
                throw iOException;
            }
        }
        ((GmsClientSupervisor)object).unbindService((ComponentName)object2, (ServiceConnection)blockingServiceConnection, string2);
        throw throwable2;
    }

    private static Object zzi(Task task2, String string2) {
        Object object = " to finish.";
        Object[] objectArray = null;
        try {
            return Tasks.await(task2);
        }
        catch (CancellationException cancellationException) {
            string2 = cP.a("Canceled while waiting for the task of ", string2, (String)object);
            object = zzd;
            objectArray = new Object[]{};
            ((Logger)object).w(string2, objectArray);
            object = new IOException(string2, cancellationException);
            throw object;
        }
        catch (InterruptedException interruptedException) {
            string2 = cP.a("Interrupted while waiting for the task of ", string2, (String)object);
            object = zzd;
            objectArray = new Object[]{};
            ((Logger)object).w(string2, objectArray);
            object = new IOException(string2, interruptedException);
            throw object;
        }
        catch (ExecutionException executionException) {
            object = executionException.getCause();
            boolean bl2 = object instanceof ApiException;
            if (bl2) {
                throw (ApiException)object;
            }
            string2 = cP.a("Unable to get a result for ", string2, " due to ExecutionException.");
            object = zzd;
            objectArray = new Object[]{};
            ((Logger)object).w(string2, objectArray);
            object = new IOException(string2, executionException);
            throw object;
        }
    }

    private static Object zzj(Object object) {
        if (object != null) {
            return object;
        }
        object = zzd;
        Object[] objectArray = new Object[]{};
        ((Logger)object).w("Service call returned null.", objectArray);
        object = new IOException("Service unavailable.");
        throw object;
    }

    /*
     * WARNING - void declaration
     */
    private static void zzk(Context context, int n3) {
        GooglePlayServicesRepairableException googlePlayServicesRepairableException2;
        block6: {
            void var0_4;
            context = context.getApplicationContext();
            try {
                GooglePlayServicesUtilLight.ensurePlayServicesAvailable(context, n3);
                return;
            }
            catch (GooglePlayServicesIncorrectManifestValueException googlePlayServicesIncorrectManifestValueException) {
            }
            catch (GooglePlayServicesNotAvailableException googlePlayServicesNotAvailableException) {
            }
            catch (GooglePlayServicesRepairableException googlePlayServicesRepairableException2) {
                break block6;
            }
            String string2 = var0_4.getMessage();
            GoogleAuthException googleAuthException = new GoogleAuthException(string2, (Throwable)var0_4);
            throw googleAuthException;
        }
        int n4 = googlePlayServicesRepairableException2.getConnectionStatusCode();
        String string3 = googlePlayServicesRepairableException2.getMessage();
        Intent intent = googlePlayServicesRepairableException2.getIntent();
        GooglePlayServicesAvailabilityException googlePlayServicesAvailabilityException = new GooglePlayServicesAvailabilityException(n4, string3, intent);
        throw googlePlayServicesAvailabilityException;
    }

    private static void zzl(ApiException object, String string2) {
        Logger logger = zzd;
        object = Log.getStackTraceString((Throwable)object);
        Object[] objectArray = new Object[]{string2, object};
        logger.w("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", objectArray);
    }

    private static void zzm(Context object, Bundle bundle) {
        object = object.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", (String)object);
        String string2 = zzb;
        String string3 = bundle.getString(string2);
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        if (bl2) {
            bundle.putString(string2, (String)object);
        }
        long l2 = SystemClock.elapsedRealtime();
        bundle.putLong("service_connection_start_time_millis", l2);
    }

    private static void zzn(Account object) {
        if (object != null) {
            String[] stringArray = object.name;
            boolean bl2 = TextUtils.isEmpty((CharSequence)stringArray);
            if (!bl2) {
                int n3;
                stringArray = zza;
                for (int i3 = 0; i3 < (n3 = 3); ++i3) {
                    String string2 = stringArray[i3];
                    String string3 = object.type;
                    n3 = (int)(string2.equals(string3) ? 1 : 0);
                    if (n3 == 0) continue;
                    return;
                }
                object = new IllegalArgumentException("Account type not supported");
                throw object;
            }
            object = new IllegalArgumentException("Account name cannot be empty!");
            throw object;
        }
        object = new IllegalArgumentException("Account cannot be null");
        throw object;
    }

    private static boolean zzo(Context object) {
        boolean bl2;
        block2: {
            boolean bl3;
            Iterator iterator = GoogleApiAvailability.getInstance();
            int n3 = ((GoogleApiAvailability)((Object)iterator)).isGooglePlayServicesAvailable((Context)object, 17895000);
            bl2 = false;
            if (n3 != 0) {
                return false;
            }
            iterator = zzhs.zzb().zzl();
            object = object.getApplicationInfo().packageName;
            iterator = iterator.iterator();
            while (bl3 = iterator.hasNext()) {
                String string2 = (String)iterator.next();
                bl3 = string2.equals(object);
                if (!bl3) continue;
                break block2;
            }
            bl2 = true;
        }
        return bl2;
    }
}

