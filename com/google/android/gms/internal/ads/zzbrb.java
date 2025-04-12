/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.RemoteException
 */
package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.mediation.Adapter;
import com.google.android.gms.ads.mediation.MediationAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import com.google.android.gms.internal.ads.zzbre;
import com.google.android.gms.internal.ads.zzbri;
import com.google.android.gms.internal.ads.zzbsg;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbti;
import com.google.android.gms.internal.ads.zzbtr;
import java.lang.reflect.Constructor;

public final class zzbrb
extends zzbre {
    private static final zzbti zza;

    static {
        zzbti zzbti2;
        zza = zzbti2 = new zzbti();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzbri zzb(String object) {
        block9: {
            Throwable throwable3;
            String string2;
            block8: {
                boolean bl2;
                string2 = "Could not instantiate mediation adapter: ";
                Object object2 = zzbrb.class;
                try {
                    object2 = ((Class)object2).getClassLoader();
                    boolean bl3 = false;
                    Class<Adapter> clazz = null;
                    object2 = Class.forName(object, false, (ClassLoader)object2);
                    clazz = MediationAdapter.class;
                    bl3 = clazz.isAssignableFrom((Class<?>)object2);
                    if (bl3) {
                        object2 = ((Class)object2).getDeclaredConstructor(null);
                        object2 = ((Constructor)object2).newInstance(null);
                        object2 = (MediationAdapter)object2;
                        return new zzbsg(object2);
                    }
                    clazz = Adapter.class;
                    bl3 = clazz.isAssignableFrom((Class<?>)object2);
                    if (bl3) {
                        object2 = ((Class)object2).getDeclaredConstructor(null);
                        object2 = ((Constructor)object2).newInstance(null);
                        object2 = (Adapter)object2;
                        return new zzbsg((Adapter)object2);
                    }
                    object2 = new StringBuilder(string2);
                    ((StringBuilder)object2).append((String)object);
                    clazz = " (not a valid adapter).";
                    ((StringBuilder)object2).append((String)((Object)clazz));
                    object2 = ((StringBuilder)object2).toString();
                    zzm.zzj((String)object2);
                    object2 = new RemoteException();
                    throw object2;
                }
                catch (Throwable throwable2) {}
                object2 = "Reflection failed, retrying using direct instantiation";
                try {
                    zzm.zze((String)object2);
                    object2 = "com.google.ads.mediation.admob.AdMobAdapter";
                    bl2 = ((String)object2).equals(object);
                    if (bl2) {
                        object2 = new AdMobAdapter();
                        return new zzbsg(object2);
                    }
                }
                catch (Throwable throwable3) {
                    break block8;
                }
                object2 = "com.google.android.gms.ads.mediation.customevent.CustomEventAdapter";
                bl2 = ((String)object2).equals(object);
                if (bl2) {
                    object2 = new CustomEventAdapter();
                    return new zzbsg(object2);
                }
                break block9;
            }
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append((String)object);
            stringBuilder.append(". ");
            object = stringBuilder.toString();
            zzm.zzk(object, throwable3);
        }
        object = new RemoteException();
        throw object;
    }

    public final zzbte zzc(String object) {
        Object object2 = zzbti.class;
        try {
            object2 = ((Class)object2).getClassLoader();
        }
        catch (Throwable throwable) {
            object = new RemoteException();
            throw object;
        }
        object = Class.forName(object, false, (ClassLoader)object2);
        object2 = null;
        object = ((Class)object).getDeclaredConstructor(null);
        object = ((Constructor)object).newInstance(null);
        object = (RtbAdapter)object;
        object2 = new zzbtr((RtbAdapter)object);
        return object2;
    }

    public final boolean zzd(String string2) {
        Class clazz = zzbrb.class;
        try {
            clazz = clazz.getClassLoader();
        }
        catch (Throwable throwable) {
            clazz = new Class("Could not load custom event implementation class as Adapter: ");
            ((StringBuilder)((Object)clazz)).append(string2);
            ((StringBuilder)((Object)clazz)).append(", assuming old custom event implementation.");
            zzm.zzj(((StringBuilder)((Object)clazz)).toString());
            return false;
        }
        clazz = Class.forName(string2, false, (ClassLoader)((Object)clazz));
        Class<Adapter> clazz2 = Adapter.class;
        return clazz2.isAssignableFrom(clazz);
    }

    public final boolean zze(String string2) {
        Class clazz = zzbrb.class;
        try {
            clazz = clazz.getClassLoader();
        }
        catch (Throwable throwable) {
            clazz = new Class("Could not load custom event implementation class: ");
            ((StringBuilder)((Object)clazz)).append(string2);
            ((StringBuilder)((Object)clazz)).append(", trying Adapter implementation class.");
            zzm.zzj(((StringBuilder)((Object)clazz)).toString());
            return false;
        }
        clazz = Class.forName(string2, false, (ClassLoader)((Object)clazz));
        Class<CustomEvent> clazz2 = CustomEvent.class;
        return clazz2.isAssignableFrom(clazz);
    }
}

