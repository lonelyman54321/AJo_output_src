/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.Uri$Builder
 */
package com.google.android.gms.internal.icing;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi;
import com.google.android.gms.appindexing.AppIndexApi$ActionResult;
import com.google.android.gms.appindexing.AppIndexApi$AppIndexingLink;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.internal.icing.zzaf;
import com.google.android.gms.internal.icing.zzag;
import com.google.android.gms.internal.icing.zzah;
import com.google.android.gms.internal.icing.zzi;
import com.google.android.gms.internal.icing.zzw;
import com.google.android.gms.internal.icing.zzx;
import com.google.android.gms.internal.icing.zzz;
import java.util.List;

public final class zzal
implements AppIndexApi,
zzz {
    private static final String zza = "zzal";

    public static Intent zzb(String object, Uri object2) {
        int n3;
        zzal.zzc((String)object, (Uri)object2);
        object = "android.intent.action.VIEW";
        if (object2 != null && (n3 = zzal.zzd((Uri)object2)) != 0) {
            Intent intent = new Intent((String)object, (Uri)object2);
            return intent;
        }
        if (object2 != null && (n3 = zzal.zze((Uri)object2)) != 0) {
            Object object3 = object2.getPathSegments();
            CharSequence charSequence = (String)object3.get(0);
            Uri.Builder builder = new Uri.Builder();
            builder.scheme(charSequence);
            int n4 = object3.size();
            int n7 = 1;
            if (n4 > n7) {
                charSequence = (String)object3.get(n7);
                builder.authority(charSequence);
                for (n4 = 2; n4 < (n7 = object3.size()); ++n4) {
                    String string2 = (String)object3.get(n4);
                    builder.appendPath(string2);
                }
            } else {
                object3 = String.valueOf(object2);
                int n8 = ((String)object3).length();
                charSequence = new StringBuilder(n8 += 88);
            }
            object3 = object2.getEncodedQuery();
            builder.encodedQuery((String)object3);
            object2 = object2.getEncodedFragment();
            builder.encodedFragment((String)object2);
            object2 = builder.build();
            Intent intent = new Intent((String)object, (Uri)object2);
            return intent;
        }
        object2 = String.valueOf(object2);
        n3 = ((String)object2).length();
        StringBuilder stringBuilder = new StringBuilder(n3 += 70);
        object2 = h30_0.a(stringBuilder, "appIndexingUri is neither an HTTP(S) URL nor an \"android-app://\" URL: ", (String)object2);
        object = new RuntimeException((String)object2);
        throw object;
    }

    private static void zzc(String object, Uri object2) {
        int n3;
        if (object2 != null && (n3 = zzal.zzd((Uri)object2)) != 0) {
            boolean bl2;
            object = object2.getHost();
            if (object != null && (bl2 = ((String)object).isEmpty())) {
                object2 = String.valueOf(object2);
                n3 = ((String)object2).length();
                StringBuilder stringBuilder = new StringBuilder(n3 += 98);
                object2 = h30_0.a(stringBuilder, "AppIndex: The web URL must have a host (follow the format http(s)://<host>/<path>). Provided URI: ", (String)object2);
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            return;
        }
        if (object2 != null && (n3 = zzal.zze((Uri)object2)) != 0) {
            String string2;
            boolean bl3;
            if (object != null && !(bl3 = ((String)object).equals(string2 = object2.getHost()))) {
                object2 = String.valueOf(object2);
                n3 = ((String)object2).length();
                StringBuilder stringBuilder = new StringBuilder(n3 += 150);
                object2 = h30_0.a(stringBuilder, "AppIndex: The android-app URI host must match the package name and follow the format android-app://<package_name>/<scheme>/<host_path>. Provided URI: ", (String)object2);
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            object = object2.getPathSegments();
            n3 = (int)(object.isEmpty() ? 1 : 0);
            if (n3 == 0) {
                n3 = 0;
                string2 = null;
                bl3 = ((String)(object = (String)object.get(0))).isEmpty();
                if (!bl3) {
                    return;
                }
            }
            object2 = String.valueOf(object2);
            n3 = ((String)object2).length();
            StringBuilder stringBuilder = new StringBuilder(n3 += 128);
            object2 = h30_0.a(stringBuilder, "AppIndex: The app URI scheme must exist and follow the format android-app://<package_name>/<scheme>/<host_path>). Provided URI: ", (String)object2);
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = String.valueOf(object2);
        n3 = ((String)object2).length();
        StringBuilder stringBuilder = new StringBuilder(n3 += 176);
        object2 = h30_0.a(stringBuilder, "AppIndex: The URI scheme must either be 'http(s)' or 'android-app'. If the latter, it must follow the format 'android-app://<package_name>/<scheme>/<host_path>'. Provided URI: ", (String)object2);
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    private static boolean zzd(Uri object) {
        boolean bl2;
        String string2 = "http";
        boolean bl3 = string2.equals(object = object.getScheme());
        return bl3 || (bl2 = (string2 = "https").equals(object));
        {
        }
    }

    private static boolean zze(Uri object) {
        object = object.getScheme();
        return "android-app".equals(object);
    }

    private final PendingResult zzf(GoogleApiClient googleApiClient, Action object, int n3) {
        String string2 = googleApiClient.getContext().getPackageName();
        long l2 = System.currentTimeMillis();
        object = zzaf.zza((Action)object, l2, string2, n3);
        zzx[] zzxArray = new zzx[]{object};
        return this.zza(googleApiClient, zzxArray);
    }

    public final AppIndexApi$ActionResult action(GoogleApiClient object, Action action) {
        object = this.zzf((GoogleApiClient)object, action, 1);
        zzah zzah2 = new zzah(this, (PendingResult)object, action);
        return zzah2;
    }

    public final PendingResult end(GoogleApiClient googleApiClient, Action action) {
        return this.zzf(googleApiClient, action, 2);
    }

    public final PendingResult start(GoogleApiClient googleApiClient, Action action) {
        return this.zzf(googleApiClient, action, 1);
    }

    public final PendingResult view(GoogleApiClient googleApiClient, Activity object, Intent zzxArray, String string2, Uri uri, List list) {
        Object object2;
        object = googleApiClient.getContext();
        String string3 = object.getPackageName();
        if (list != null) {
            boolean bl2;
            object = list.iterator();
            while (bl2 = object.hasNext()) {
                object2 = ((AppIndexApi$AppIndexingLink)object.next()).appIndexingUrl;
                zzal.zzc(null, (Uri)object2);
            }
        }
        object2 = object;
        object = new zzx(string3, (Intent)zzxArray, string2, uri, null, list, 1);
        zzxArray = new zzx[]{object};
        return this.zza(googleApiClient, zzxArray);
    }

    public final PendingResult view(GoogleApiClient googleApiClient, Activity object, Uri zzxArray, String string2, Uri uri, List list) {
        object = googleApiClient.getContext().getPackageName();
        zzal.zzc((String)object, (Uri)zzxArray);
        Intent intent = zzal.zzb((String)object, (Uri)zzxArray);
        object = googleApiClient.getContext();
        String string3 = object.getPackageName();
        if (list != null) {
            boolean bl2;
            object = list.iterator();
            while (bl2 = object.hasNext()) {
                zzxArray = ((AppIndexApi$AppIndexingLink)object.next()).appIndexingUrl;
                zzal.zzc(null, (Uri)zzxArray);
            }
        }
        object = new zzx(string3, intent, string2, uri, null, list, 1);
        zzxArray = new zzx[]{object};
        return this.zza(googleApiClient, zzxArray);
    }

    public final PendingResult viewEnd(GoogleApiClient googleApiClient, Activity object, Intent object2) {
        object = googleApiClient.getContext().getPackageName();
        zzx[] zzxArray = new zzw();
        object = zzx.zza((String)object, object2);
        zzxArray.zza((zzi)object);
        long l2 = System.currentTimeMillis();
        zzxArray.zzb(l2);
        zzxArray.zzc(0);
        zzxArray.zzf(2);
        object2 = zzxArray.zzg();
        zzxArray = new zzx[]{object2};
        return this.zza(googleApiClient, zzxArray);
    }

    public final PendingResult viewEnd(GoogleApiClient googleApiClient, Activity object, Uri object2) {
        object = zzal.zzb(googleApiClient.getContext().getPackageName(), object2);
        object2 = googleApiClient.getContext().getPackageName();
        zzx[] zzxArray = new zzw();
        object = zzx.zza((String)object2, (Intent)object);
        zzxArray.zza((zzi)object);
        long l2 = System.currentTimeMillis();
        zzxArray.zzb(l2);
        zzxArray.zzc(0);
        zzxArray.zzf(2);
        object2 = zzxArray.zzg();
        zzxArray = new zzx[]{object2};
        return this.zza(googleApiClient, zzxArray);
    }

    public final PendingResult zza(GoogleApiClient googleApiClient, zzx ... zzxArray) {
        zzag zzag2 = new zzag(this, googleApiClient, zzxArray);
        return googleApiClient.enqueue(zzag2);
    }
}

