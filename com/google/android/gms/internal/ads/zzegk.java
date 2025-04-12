/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog
 *  android.app.Notification
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteException
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 *  org.xmlpull.v1.XmlPullParser
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.ads.impl.R$id;
import com.google.android.gms.ads.impl.R$layout;
import com.google.android.gms.ads.impl.R$string;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.offline.buffering.zza;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzr;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbuy;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzdlt;
import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzefn;
import com.google.android.gms.internal.ads.zzefr;
import com.google.android.gms.internal.ads.zzefs;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzegb;
import com.google.android.gms.internal.ads.zzegc;
import com.google.android.gms.internal.ads.zzegd;
import com.google.android.gms.internal.ads.zzege;
import com.google.android.gms.internal.ads.zzegf;
import com.google.android.gms.internal.ads.zzegg;
import com.google.android.gms.internal.ads.zzegh;
import com.google.android.gms.internal.ads.zzegi;
import com.google.android.gms.internal.ads.zzegj;
import com.google.android.gms.internal.ads.zzegm;
import com.google.android.gms.internal.ads.zzfvl;
import com.google.android.gms.internal.ads.zzgbf;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.xmlpull.v1.XmlPullParser;

public final class zzegk
extends zzbuy {
    final Map zza;
    private final Context zzb;
    private final zzdvc zzc;
    private final zzr zzd;
    private final zzefz zze;
    private String zzf;
    private String zzg;

    public zzegk(Context context, zzefz zzefz2, zzr zzr2, zzdvc zzdvc2) {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
        this.zzb = context;
        this.zzc = zzdvc2;
        this.zzd = zzr2;
        this.zze = zzefz2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void zzc(Context object, zzdvc object2, zzefz zzefz2, String string2, String object3, Map object4) {
        boolean bl2 = true;
        Object object5 = zzu.zzo();
        boolean bl3 = ((zzcby)object5).zzA((Context)object);
        object = bl2 != bl3 ? "offline" : "online";
        if (object2 != null) {
            boolean bl4;
            object2 = ((zzdvc)object2).zza();
            ((zzdvb)object2).zzb("gqi", string2);
            object5 = "action";
            ((zzdvb)object2).zzb((String)object5, (String)object3);
            ((zzdvb)object2).zzb("device_connectivity", (String)object);
            long l2 = zzu.zzB().currentTimeMillis();
            object = String.valueOf(l2);
            object3 = "event_timestamp";
            ((zzdvb)object2).zzb((String)object3, (String)object);
            object = object4.entrySet().iterator();
            while (bl4 = object.hasNext()) {
                object3 = (Map.Entry)object.next();
                object4 = (String)object3.getKey();
                object3 = (String)object3.getValue();
                ((zzdvb)object2).zzb((String)object4, (String)object3);
            }
            object = ((zzdvb)object2).zze();
        } else {
            object = "";
        }
        Object object6 = object;
        long l3 = zzu.zzB().currentTimeMillis();
        object5 = object;
        object = new zzegb(l3, string2, (String)object6, 2);
        zzefz2.zzd((zzegb)object);
    }

    public static final PendingIntent zzq(Context context, String string2, String string3, String string4) {
        int n3;
        Intent intent = new Intent();
        intent.setAction(string2);
        intent.putExtra("offline_notification_action", string2);
        intent.putExtra("gws_query_id", string3);
        string3 = "uri";
        intent.putExtra(string3, string4);
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 29;
        if (n4 >= n7 && (n3 = string2.equals(string3 = "offline_notification_clicked")) != 0) {
            intent.setClassName(context, "com.google.android.gms.ads.NotificationHandlerActivity");
            return zzfvl.zza(context, 0, intent, 0xC000000);
        }
        intent.setClassName(context, "com.google.android.gms.ads.AdService");
        n3 = zzfvl.zza | 0x40000000;
        return zzfvl.zzb(context, 0, intent, n3, 0);
    }

    private final String zzr() {
        Object object = this.zza;
        String string2 = this.zzf;
        if ((object = (zzefr)object.get(string2)) == null) {
            return "";
        }
        return ((zzefr)object).zzb();
    }

    private static String zzs(int n3, String string2) {
        Resources resources = zzu.zzo().zze();
        if (resources == null) {
            return string2;
        }
        return resources.getString(n3);
    }

    private final void zzt(String string2, String string3, Map map2) {
        Context context = this.zzb;
        zzdvc zzdvc2 = this.zzc;
        zzefz zzefz2 = this.zze;
        zzegk.zzc(context, zzdvc2, zzefz2, string2, string3, map2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzu() {
        boolean bl2;
        Object object;
        Object object2;
        Object object3;
        block7: {
            block8: {
                block6: {
                    Object object4;
                    String string2;
                    String string3;
                    try {
                        zzu.zzp();
                        object3 = this.zzb;
                        object3 = zzt.zzz((Context)object3);
                        object2 = this.zzb;
                        object2 = ObjectWrapper.wrap(object2);
                        string3 = this.zzg;
                        string2 = this.zzf;
                        object4 = this.zza;
                        object4 = object4.get(string2);
                        object4 = (zzefr)object4;
                        object4 = object4 == null ? "" : ((zzefr)object4).zzc();
                    }
                    catch (RemoteException remoteException) {
                        break block6;
                    }
                    object = new zza(string3, string2, (String)object4);
                    bl2 = object3.zzg((IObjectWrapper)object2, (zza)object);
                    if (!bl2) {
                        try {
                            object = this.zzb;
                            object = ObjectWrapper.wrap(object);
                            string3 = this.zzg;
                            string2 = this.zzf;
                            bl2 = object3.zzf((IObjectWrapper)object, string3, string2);
                            break block7;
                        }
                        catch (RemoteException remoteException) {
                            break block8;
                        }
                    }
                    break block7;
                }
                bl2 = false;
                object2 = null;
            }
            object = "Failed to schedule offline notification poster.";
            com.google.android.gms.ads.internal.util.client.zzm.zzh((String)object, (Throwable)object3);
        }
        if (!bl2) {
            object3 = this.zze;
            object2 = this.zzf;
            ((zzefz)((Object)object3)).zzc((String)object2);
            object3 = this.zzf;
            object2 = "offline_notification_worker_not_scheduled";
            object = zzgbf.zzd();
            this.zzt((String)object3, (String)object2, (Map)object);
        }
    }

    private final void zzv(Activity object, zzm stringArray) {
        zzu.zzp();
        Object object2 = new s52((Context)object);
        boolean n3 = ((s52)object2).a();
        if (!n3) {
            int n4 = Build.VERSION.SDK_INT;
            int n7 = 33;
            if (n4 < n7) {
                zzu.zzp();
                object2 = zzt.zzK((Context)object);
                Object object3 = zzegk.zzs(R$string.notifications_permission_title, "Allow app to send you notifications?");
                object3 = object2.setTitle((CharSequence)object3);
                Object object4 = zzegk.zzs(R$string.notifications_permission_confirm, "Allow");
                zzegd zzegd2 = new zzegd(this, (Activity)object, (zzm)stringArray);
                object = object3.setPositiveButton((CharSequence)object4, (DialogInterface.OnClickListener)zzegd2);
                object3 = zzegk.zzs(R$string.notifications_permission_decline, "Don't allow");
                object4 = new zzege(this, (zzm)stringArray);
                object = object.setNegativeButton((CharSequence)object3, (DialogInterface.OnClickListener)object4);
                object3 = new zzegf(this, (zzm)stringArray);
                object.setOnCancelListener((DialogInterface.OnCancelListener)object3);
                object2.create().show();
                object = this.zzf;
                object2 = zzgbf.zzd();
                this.zzt((String)object, "rtsdi", (Map)object2);
                return;
            }
            stringArray = new String[]{"android.permission.POST_NOTIFICATIONS"};
            je0_2.a((Activity)object, stringArray);
            object = this.zzf;
            object2 = zzgbf.zzd();
            this.zzt((String)object, "asnpdi", (Map)object2);
            return;
        }
        this.zzu();
        this.zzw((Activity)object, (zzm)stringArray);
    }

    private final void zzw(Activity object, zzm zzm2) {
        zzu.zzp();
        Object object2 = zzt.zzK((Context)object);
        Object object3 = new zzegc(zzm2);
        object2 = object2.setOnCancelListener((DialogInterface.OnCancelListener)object3);
        int n3 = R$layout.offline_ads_dialog;
        Object object4 = zzu.zzo().zze();
        Drawable drawable2 = null;
        if (object4 == null) {
            n3 = 0;
            object3 = null;
        } else {
            object3 = object4.getLayout(n3);
        }
        if (object3 == null) {
            int n4 = R$string.offline_dialog_text;
            object3 = "Thanks for your interest.\nWe will share more once you're back online.";
            object = zzegk.zzs(n4, (String)object3);
            object2.setMessage((CharSequence)object);
            object = object2.create();
        } else {
            object = object.getLayoutInflater().inflate((XmlPullParser)object3, null);
            object2.setView((View)object);
            object3 = this.zzr();
            boolean n7 = ((String)object3).isEmpty();
            if (!n7) {
                int n4 = R$id.offline_dialog_advertiser_name;
                object4 = (TextView)object.findViewById(n4);
                object4.setVisibility(0);
                object4.setText((CharSequence)object3);
            }
            object3 = this.zza;
            object4 = this.zzf;
            if ((object3 = (zzefr)object3.get(object4)) != null) {
                drawable2 = ((zzefr)object3).zza();
            }
            if (drawable2 != null) {
                n3 = R$id.offline_dialog_image;
                object = (ImageView)object.findViewById(n3);
                object.setImageDrawable(drawable2);
            }
            object = object2.create();
            object2 = object.getWindow();
            object3 = new ColorDrawable(0);
            object2.setBackgroundDrawable((Drawable)object3);
        }
        object.show();
        object2 = new Timer();
        object3 = new zzegj(this, (AlertDialog)object, (Timer)object2, zzm2);
        ((Timer)object2).schedule((TimerTask)object3, 3000L);
    }

    public final /* synthetic */ void zzd(Activity activity, zzm zzm2, DialogInterface object, int n3) {
        object = p3.a("dialog_action", "confirm");
        String string2 = this.zzf;
        String string3 = "rtsdc";
        this.zzt(string2, string3, (Map)object);
        object = zzu.zzq().zzf(activity);
        activity.startActivity((Intent)object);
        this.zzu();
        if (zzm2 != null) {
            zzm2.zzb();
        }
    }

    public final void zze(Intent object) {
        String string2;
        block18: {
            Object object2 = "olaa";
            Object object3 = "offline_notification_action";
            String string3 = object.getStringExtra((String)object3);
            String string4 = "offline_notification_clicked";
            boolean bl2 = string3.equals(string4);
            String string5 = "offline_notification_dismissed";
            if (!bl2 && !(bl2 = string3.equals(string5))) {
                return;
            }
            string2 = object.getStringExtra("gws_query_id");
            object = object.getStringExtra("uri");
            Context context = this.zzb;
            int n3 = zzu.zzo().zzA(context);
            HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
            boolean bl3 = string3.equals(string4);
            int n4 = 2;
            int n7 = 1;
            if (bl3) {
                block17: {
                    hashMap.put(object3, string4);
                    if (n7 == n3) {
                        n4 = 1;
                    }
                    string3 = String.valueOf(Build.VERSION.SDK_INT);
                    hashMap.put("obvs", string3);
                    bl3 = ((String)object).startsWith("http");
                    string3 = String.valueOf(bl3);
                    string4 = "olaih";
                    hashMap.put(string4, string3);
                    string3 = this.zzb;
                    string3 = string3.getPackageManager();
                    string3 = string3.getLaunchIntentForPackage((String)object);
                    if (string3 != null) break block17;
                    string4 = "android.intent.action.VIEW";
                    string3 = new Intent(string4);
                    object = Uri.parse((String)object);
                    string3.setData((Uri)object);
                }
                int n8 = 0x10000000;
                string3.addFlags(n8);
                object = this.zzb;
                object.startActivity((Intent)string3);
                object = "olas";
                try {
                    hashMap.put(object2, object);
                }
                catch (ActivityNotFoundException activityNotFoundException) {
                    object = "olaf";
                    hashMap.put(object2, object);
                }
            } else {
                hashMap.put(object3, string5);
            }
            this.zzt(string2, (String)object3, hashMap);
            try {
                object = this.zze;
            }
            catch (SQLiteException sQLiteException) {
                object = ((Object)((Object)sQLiteException)).toString();
                com.google.android.gms.ads.internal.util.client.zzm.zzg("Failed to get writable offline buffering database: ".concat((String)object));
                return;
            }
            object = object.getWritableDatabase();
            if (n4 != n7) break block18;
            object2 = this.zze;
            object3 = this.zzd;
            ((zzefz)((Object)object2)).zzg((SQLiteDatabase)object, (zzr)object3, string2);
            return;
        }
        zzefz.zzi((SQLiteDatabase)object, string2);
    }

    public final void zzf(String[] object, int[] object2, IObjectWrapper iObjectWrapper) {
        int n3;
        String string2 = null;
        for (int i3 = 0; i3 < (n3 = ((String[])object).length); ++i3) {
            Object object3 = object[i3];
            String string3 = "android.permission.POST_NOTIFICATIONS";
            n3 = (int)(((String)object3).equals(string3) ? 1 : 0);
            if (n3 == 0) {
                continue;
            }
            object = (zzegm)ObjectWrapper.unwrap(iObjectWrapper);
            iObjectWrapper = ((zzegm)object).zza();
            object = ((zzegm)object).zzb();
            object3 = new Object();
            int n4 = object2[i3];
            string2 = "dialog_action";
            if (n4 == 0) {
                object2 = "confirm";
                ((HashMap)object3).put(string2, object2);
                this.zzu();
                this.zzw((Activity)iObjectWrapper, (zzm)object);
            } else {
                object2 = "dismiss";
                ((HashMap)object3).put(string2, object2);
                if (object != null) {
                    ((zzm)object).zzb();
                }
            }
            object = this.zzf;
            object2 = "asnpdc";
            this.zzt((String)object, (String)object2, (Map)object3);
            break;
        }
    }

    public final void zzg(IObjectWrapper object) {
        object = (zzegm)ObjectWrapper.unwrap((IObjectWrapper)object);
        Activity activity = ((zzegm)object).zza();
        zzm zzm2 = ((zzegm)object).zzb();
        Object object2 = ((zzegm)object).zzc();
        this.zzf = object2;
        this.zzg = object = ((zzegm)object).zzd();
        object = zzbep.zziA;
        object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (!bl2) {
            object = this.zzf;
            Object object3 = zzgbf.zzd();
            this.zzt((String)object, "dialog_impression", (Map)object3);
            zzu.zzp();
            object = zzt.zzK((Context)activity);
            object2 = zzegk.zzs(R$string.offline_opt_in_title, "Open ad when you're back online.");
            object2 = object.setTitle((CharSequence)object2);
            object3 = zzegk.zzs(R$string.offline_opt_in_message, "We'll send you a notification with a link to the advertiser site.");
            object2 = object2.setMessage((CharSequence)object3);
            object3 = zzegk.zzs(R$string.offline_opt_in_confirm, "OK");
            zzegg zzegg2 = new zzegg(this, activity, zzm2);
            activity = object2.setPositiveButton((CharSequence)object3, (DialogInterface.OnClickListener)zzegg2);
            object2 = zzegk.zzs(R$string.offline_opt_in_decline, "No thanks");
            object3 = new zzegh(this, zzm2);
            activity = activity.setNegativeButton((CharSequence)object2, (DialogInterface.OnClickListener)object3);
            object2 = new zzegi(this, zzm2);
            activity.setOnCancelListener((DialogInterface.OnCancelListener)object2);
            object.create().show();
            return;
        }
        this.zzv(activity, zzm2);
    }

    public final void zzh() {
        zzr zzr2 = this.zzd;
        zzefs zzefs2 = new zzefs(zzr2);
        this.zze.zze(zzefs2);
    }

    public final void zzi(IObjectWrapper iObjectWrapper, String string2, String string3) {
        zza zza2 = new zza(string2, string3, "");
        this.zzj(iObjectWrapper, zza2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj(IObjectWrapper object, zza object2) {
        int n3;
        int n4;
        boolean bl2 = true;
        object = (Context)ObjectWrapper.unwrap((IObjectWrapper)object);
        Object object3 = ((zza)object2).zza;
        String string2 = ((zza)object2).zzb;
        object2 = ((zza)object2).zzc;
        String string3 = this.zzr();
        zzab zzab2 = zzu.zzq();
        String string4 = "offline_notification_channel";
        zzab2.zzh((Context)object, string4, "AdMob Offline Notifications");
        zzab2 = zzegk.zzq((Context)object, "offline_notification_clicked", string2, (String)object3);
        object3 = zzegk.zzq((Context)object, "offline_notification_dismissed", string2, (String)object3);
        J42 j42 = new J42((Context)object, string4);
        string4 = j42.P;
        int n7 = string3.isEmpty();
        if (n7 == 0) {
            CharSequence charSequence;
            n7 = R$string.offline_notification_title_with_advertiser;
            String string5 = zzegk.zzs(n7, "You are back online! Continue learning about %s");
            Object[] objectArray = new Object[bl2];
            objectArray[0] = string3;
            j42.e = charSequence = J42.b(String.format(string5, objectArray));
        } else {
            CharSequence charSequence;
            n4 = R$string.offline_notification_title;
            String string6 = "You are back online! Let's pick up where we left off";
            j42.e = charSequence = J42.b(zzegk.zzs(n4, string6));
        }
        j42.d(16, bl2);
        ((Notification)string4).deleteIntent = object3;
        j42.g = zzab2;
        ((Notification)string4).icon = n3 = object.getApplicationInfo().icon;
        object3 = zzbep.zziB;
        j42.l = n3 = ((Integer)zzba.zzc().zza((zzbeg)object3)).intValue();
        object3 = zzbep.zziD;
        object3 = (Boolean)zzba.zzc().zza((zzbeg)object3);
        n3 = (int)(((Boolean)object3).booleanValue() ? 1 : 0);
        n4 = 0;
        Object var6_10 = null;
        if (n3 != 0 && (n3 = (int)(((String)object2).isEmpty() ? 1 : 0)) == 0) {
            try {
                object3 = new URL((String)object2);
                object2 = ((URL)object3).openConnection();
                object2 = ((URLConnection)object2).getInputStream();
                object2 = BitmapFactory.decodeStream((InputStream)object2);
            }
            catch (IOException iOException) {}
        }
        object2 = null;
        if (object2 != null) {
            try {
                j42.e((Bitmap)object2);
                object3 = new U42();
                ((F42)object3).m((Bitmap)object2);
                ((F42)object3).f = null;
                ((F42)object3).g = bl2;
                j42.g((U42)object3);
            }
            catch (Resources.NotFoundException notFoundException) {}
        }
        object = (NotificationManager)object.getSystemService("notification");
        object2 = new HashMap();
        try {
            Notification notification = j42.a();
            n3 = 54321;
            object.notify(string2, n3, notification);
            object = "offline_notification_impression";
        }
        catch (IllegalArgumentException illegalArgumentException) {
            String string7 = "notification_not_shown_reason";
            object = illegalArgumentException.getMessage();
            ((HashMap)object2).put(string7, object);
            object = "offline_notification_failed";
        }
        this.zzt(string2, (String)object, (Map)object2);
    }

    public final /* synthetic */ void zzk(zzm zzm2, DialogInterface object, int n3) {
        object = this.zze;
        String string2 = this.zzf;
        ((zzefz)((Object)object)).zzc(string2);
        object = new HashMap();
        ((HashMap)object).put("dialog_action", "dismiss");
        string2 = this.zzf;
        String string3 = "rtsdc";
        this.zzt(string2, string3, (Map)object);
        if (zzm2 != null) {
            zzm2.zzb();
        }
    }

    public final /* synthetic */ void zzl(zzm zzm2, DialogInterface object) {
        object = this.zze;
        String string2 = this.zzf;
        ((zzefz)((Object)object)).zzc(string2);
        object = new HashMap();
        ((HashMap)object).put("dialog_action", "dismiss");
        string2 = this.zzf;
        String string3 = "rtsdc";
        this.zzt(string2, string3, (Map)object);
        if (zzm2 != null) {
            zzm2.zzb();
        }
    }

    public final /* synthetic */ void zzm(Activity activity, zzm zzm2, DialogInterface object, int n3) {
        object = p3.a("dialog_action", "confirm");
        String string2 = this.zzf;
        this.zzt(string2, "dialog_click", (Map)object);
        this.zzv(activity, zzm2);
    }

    public final /* synthetic */ void zzn(zzm zzm2, DialogInterface object, int n3) {
        object = this.zze;
        String string2 = this.zzf;
        ((zzefz)((Object)object)).zzc(string2);
        object = new HashMap();
        ((HashMap)object).put("dialog_action", "dismiss");
        string2 = this.zzf;
        String string3 = "dialog_click";
        this.zzt(string2, string3, (Map)object);
        if (zzm2 != null) {
            zzm2.zzb();
        }
    }

    public final /* synthetic */ void zzo(zzm zzm2, DialogInterface object) {
        object = this.zze;
        String string2 = this.zzf;
        ((zzefz)((Object)object)).zzc(string2);
        object = new HashMap();
        ((HashMap)object).put("dialog_action", "dismiss");
        string2 = this.zzf;
        String string3 = "dialog_click";
        this.zzt(string2, string3, (Map)object);
        if (zzm2 != null) {
            zzm2.zzb();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzp(String string2, zzdlt object) {
        String string3 = ((zzdlt)object).zzx();
        boolean bl2 = TextUtils.isEmpty((CharSequence)string3);
        String string4 = "";
        string3 = !bl2 ? ((zzdlt)object).zzx() : ((string3 = ((zzdlt)object).zzB()) != null ? ((zzdlt)object).zzB() : string4);
        Object object2 = ((zzdlt)object).zzm();
        if (object2 != null) {
            try {
                object2 = object2.zze();
                string4 = object2.toString();
            }
            catch (RemoteException remoteException) {}
        }
        object = ((zzdlt)object).zzn();
        object2 = null;
        if (object != null) {
            try {
                object = object.zzf();
                if (object != null) {
                    object = ObjectWrapper.unwrap((IObjectWrapper)object);
                    object2 = object = (Drawable)object;
                }
            }
            catch (RemoteException remoteException) {}
        }
        object = new zzefn(string3, string4, (Drawable)object2);
        this.zza.put(string2, object);
    }
}

