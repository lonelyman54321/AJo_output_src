/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.ConnectivityManager
 *  android.os.Build
 *  android.os.Build$VERSION
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Build;
import com.google.android.gms.tagmanager.zzbb;
import com.google.android.gms.tagmanager.zzbf;
import com.google.android.gms.tagmanager.zzbv;
import com.google.android.gms.tagmanager.zzdc;
import com.google.android.gms.tagmanager.zzdf;
import com.google.android.gms.tagmanager.zzdp;
import com.google.android.gms.tagmanager.zzdr;
import com.google.android.gms.tagmanager.zzfc;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Locale;

final class zzfd
implements zzbf {
    private final String zza;
    private final Context zzb;
    private final zzfc zzc;

    public zzfd(Context object, zzfc object2) {
        int n3;
        String string2;
        this.zzb = object = object.getApplicationContext();
        this.zzc = object2;
        object = Build.VERSION.RELEASE;
        object2 = Locale.getDefault();
        CharSequence charSequence = null;
        if (object2 != null && (string2 = ((Locale)object2).getLanguage()) != null && (n3 = (string2 = ((Locale)object2).getLanguage()).length()) != 0) {
            charSequence = new StringBuilder();
            string2 = ((Locale)object2).getLanguage().toLowerCase();
            ((StringBuilder)charSequence).append(string2);
            string2 = ((Locale)object2).getCountry();
            if (string2 != null && (n3 = (string2 = ((Locale)object2).getCountry()).length()) != 0) {
                string2 = "-";
                ((StringBuilder)charSequence).append(string2);
                object2 = ((Locale)object2).getCountry().toLowerCase();
                ((StringBuilder)charSequence).append((String)object2);
            }
            charSequence = ((StringBuilder)charSequence).toString();
        }
        object2 = Build.MODEL;
        string2 = Build.ID;
        String string3 = "; ";
        object = ko_0.a(og_1.a("GoogleTagManager/4.00 (Linux; U; Android ", (String)object, string3, charSequence, string3), (String)object2, " Build/", string2, ")");
        this.zza = object;
    }

    public static final URL zzc(zzbv object) {
        object = ((zzbv)object).zzc();
        try {
            URL uRL = new URL((String)object);
            return uRL;
        }
        catch (MalformedURLException malformedURLException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(List list) {
        int n3 = Math.min(list.size(), 40);
        boolean bl2 = true;
        int n4 = 0;
        int n7 = 1;
        float f5 = Float.MIN_VALUE;
        while (true) {
            block23: {
                String string2;
                Object object;
                float f6;
                int n8;
                Object object2;
                Object object3;
                block17: {
                    void var16_19;
                    block18: {
                        Object object4;
                        block21: {
                            block22: {
                                if (n4 >= n3) {
                                    return;
                                }
                                object3 = (zzbv)list.get(n4);
                                object2 = zzfd.zzc((zzbv)object3);
                                if (object2 == null) {
                                    object2 = this.zzc;
                                    long l2 = ((zzbv)object3).zzb();
                                    zzdr.zzh(((zzdp)object2).zza, l2);
                                    long l3 = ((zzbv)object3).zzb();
                                    object4 = "Permanent failure dispatching hitId: ";
                                    object3 = Wm2.a(l3, (String)object4);
                                    object2 = zzdc.zzb;
                                    ((zzbb)object2).zzd((String)object3);
                                } else {
                                    block20: {
                                        block19: {
                                            int n10;
                                            block16: {
                                                try {
                                                    object2 = ((URL)object2).openConnection();
                                                    object2 = (HttpURLConnection)object2;
                                                    n8 = 0;
                                                    f6 = 0.0f;
                                                    object4 = null;
                                                    if (n7 == 0) break block16;
                                                }
                                                catch (IOException iOException) {
                                                    n8 = n7;
                                                    f6 = f5;
                                                    object = iOException;
                                                    break block17;
                                                }
                                                try {
                                                    object = this.zzb;
                                                    String string3 = "com.google.analytics.RADIO_POWERED";
                                                    string2 = new Intent(string3);
                                                    string3 = object.getPackageName();
                                                    string2.addCategory(string3);
                                                    string3 = zzdf.zza;
                                                    string2.putExtra(string3, bl2);
                                                    object.sendBroadcast((Intent)string2);
                                                }
                                                catch (Throwable throwable) {
                                                    n10 = 0;
                                                    string2 = null;
                                                    n8 = 1;
                                                    f6 = Float.MIN_VALUE;
                                                    break block18;
                                                }
                                            }
                                            object = "User-Agent";
                                            try {
                                                string2 = this.zza;
                                                ((URLConnection)object2).setRequestProperty((String)object, string2);
                                                n7 = ((HttpURLConnection)object2).getResponseCode();
                                                object4 = ((URLConnection)object2).getInputStream();
                                                n10 = 200;
                                                if (n7 == n10) break block19;
                                                object = this.zzc;
                                                object.zza((zzbv)object3);
                                                break block20;
                                            }
                                            catch (Throwable throwable) {
                                                break block21;
                                            }
                                        }
                                        object = this.zzc;
                                        object = (zzdp)object;
                                        object = ((zzdp)object).zza;
                                        long l4 = ((zzbv)object3).zzb();
                                        zzdr.zzh((zzdr)object, l4);
                                    }
                                    if (object4 != null) {
                                        try {
                                            ((InputStream)object4).close();
                                        }
                                        catch (IOException iOException) {
                                            break block22;
                                        }
                                    }
                                    ((HttpURLConnection)object2).disconnect();
                                    n7 = 0;
                                    f5 = 0.0f;
                                    object = null;
                                }
                                break block23;
                            }
                            n8 = 0;
                            f6 = 0.0f;
                            object4 = null;
                            break block17;
                        }
                        string2 = object4;
                        n8 = 0;
                        f6 = 0.0f;
                        object4 = null;
                    }
                    if (string2 != null) {
                        try {
                            ((InputStream)((Object)string2)).close();
                        }
                        catch (IOException iOException) {
                            break block17;
                        }
                    }
                    ((HttpURLConnection)object2).disconnect();
                    throw var16_19;
                }
                object2 = object.getClass().getSimpleName();
                string2 = "Exception sending hit: ";
                string2.concat((String)object2);
                ((Throwable)object).getMessage();
                object = this.zzc;
                object.zza((zzbv)object3);
                n7 = n8;
                f5 = f6;
            }
            ++n4;
        }
    }

    public final boolean zzb() {
        boolean bl2;
        Context context = this.zzb;
        String string2 = "connectivity";
        if ((context = ((ConnectivityManager)context.getSystemService(string2)).getActiveNetworkInfo()) != null && (bl2 = context.isConnected())) {
            return true;
        }
        zzdc.zzb.zzd("...no network connectivity");
        return false;
    }
}

