/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjr;
import com.google.android.gms.measurement.internal.zzlx;
import com.google.common.collect.ImmutableCollection$Builder;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import com.google.common.collect.ImmutableSet;
import com.google.firebase.analytics.connector.AnalyticsConnector$ConditionalUserProperty;
import java.util.AbstractCollection;

public final class zzd {
    private static final ImmutableSet zza;
    private static final ImmutableList zzb;
    private static final ImmutableList zzc;
    private static final ImmutableList zzd;
    private static final ImmutableList zze;
    private static final ImmutableList zzf;

    static {
        Object[] objectArray = new String[]{"_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"};
        zza = ImmutableSet.of("_in", "_xa", "_xu", "_aq", "_aa", "_ai", objectArray);
        zzb = ImmutableList.of("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
        zzc = ImmutableList.of("auto", "app", "am");
        zzd = ImmutableList.of("_r", "_dbg");
        ImmutableCollection$Builder immutableCollection$Builder = new ImmutableList$Builder();
        Object[] objectArray2 = zzjr.zza;
        immutableCollection$Builder = ((ImmutableList$Builder)immutableCollection$Builder).add(objectArray2);
        objectArray2 = zzjr.zzb;
        zze = ((ImmutableList$Builder)((ImmutableList$Builder)immutableCollection$Builder).add(objectArray2)).build();
        zzf = ImmutableList.of("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }

    public static Bundle zza(AnalyticsConnector$ConditionalUserProperty analyticsConnector$ConditionalUserProperty) {
        String string2;
        Bundle bundle = new Bundle();
        Object object = analyticsConnector$ConditionalUserProperty.origin;
        if (object != null) {
            string2 = "origin";
            bundle.putString(string2, (String)object);
        }
        if ((object = analyticsConnector$ConditionalUserProperty.name) != null) {
            string2 = "name";
            bundle.putString(string2, (String)object);
        }
        if ((object = analyticsConnector$ConditionalUserProperty.value) != null) {
            zzjk.zza(bundle, object);
        }
        if ((object = analyticsConnector$ConditionalUserProperty.triggerEventName) != null) {
            string2 = "trigger_event_name";
            bundle.putString(string2, (String)object);
        }
        long l2 = analyticsConnector$ConditionalUserProperty.triggerTimeout;
        bundle.putLong("trigger_timeout", l2);
        object = analyticsConnector$ConditionalUserProperty.timedOutEventName;
        if (object != null) {
            string2 = "timed_out_event_name";
            bundle.putString(string2, (String)object);
        }
        if ((object = analyticsConnector$ConditionalUserProperty.timedOutEventParams) != null) {
            string2 = "timed_out_event_params";
            bundle.putBundle(string2, (Bundle)object);
        }
        if ((object = analyticsConnector$ConditionalUserProperty.triggeredEventName) != null) {
            string2 = "triggered_event_name";
            bundle.putString(string2, (String)object);
        }
        if ((object = analyticsConnector$ConditionalUserProperty.triggeredEventParams) != null) {
            string2 = "triggered_event_params";
            bundle.putBundle(string2, (Bundle)object);
        }
        l2 = analyticsConnector$ConditionalUserProperty.timeToLive;
        bundle.putLong("time_to_live", l2);
        object = analyticsConnector$ConditionalUserProperty.expiredEventName;
        if (object != null) {
            string2 = "expired_event_name";
            bundle.putString(string2, (String)object);
        }
        if ((object = analyticsConnector$ConditionalUserProperty.expiredEventParams) != null) {
            string2 = "expired_event_params";
            bundle.putBundle(string2, (Bundle)object);
        }
        l2 = analyticsConnector$ConditionalUserProperty.creationTimestamp;
        bundle.putLong("creation_timestamp", l2);
        boolean bl2 = analyticsConnector$ConditionalUserProperty.active;
        bundle.putBoolean("active", bl2);
        l2 = analyticsConnector$ConditionalUserProperty.triggeredTimestamp;
        bundle.putLong("triggered_timestamp", l2);
        return bundle;
    }

    public static AnalyticsConnector$ConditionalUserProperty zza(Bundle bundle) {
        long l2;
        long l3;
        boolean bl2;
        long l4;
        String string2;
        long l7;
        Preconditions.checkNotNull(bundle);
        AnalyticsConnector$ConditionalUserProperty analyticsConnector$ConditionalUserProperty = new AnalyticsConnector$ConditionalUserProperty();
        Object object = String.class;
        Object object2 = (String)Preconditions.checkNotNull((String)zzjk.zza(bundle, "origin", object, null));
        analyticsConnector$ConditionalUserProperty.origin = object2;
        object2 = (String)Preconditions.checkNotNull((String)zzjk.zza(bundle, "name", object, null));
        analyticsConnector$ConditionalUserProperty.name = object2;
        analyticsConnector$ConditionalUserProperty.value = object2 = zzjk.zza(bundle, "value", Object.class, null);
        analyticsConnector$ConditionalUserProperty.triggerEventName = object2 = (String)zzjk.zza(bundle, "trigger_event_name", object, null);
        object2 = 0L;
        Class<Long> clazz = Long.class;
        analyticsConnector$ConditionalUserProperty.triggerTimeout = l7 = ((Long)zzjk.zza(bundle, "trigger_timeout", clazz, object2)).longValue();
        analyticsConnector$ConditionalUserProperty.timedOutEventName = string2 = (String)zzjk.zza(bundle, "timed_out_event_name", object, null);
        Class<Bundle> clazz2 = Bundle.class;
        string2 = (Bundle)zzjk.zza(bundle, "timed_out_event_params", clazz2, null);
        analyticsConnector$ConditionalUserProperty.timedOutEventParams = string2;
        analyticsConnector$ConditionalUserProperty.triggeredEventName = string2 = (String)zzjk.zza(bundle, "triggered_event_name", object, null);
        string2 = (Bundle)zzjk.zza(bundle, "triggered_event_params", clazz2, null);
        analyticsConnector$ConditionalUserProperty.triggeredEventParams = string2;
        analyticsConnector$ConditionalUserProperty.timeToLive = l4 = ((Long)zzjk.zza(bundle, "time_to_live", clazz, object2)).longValue();
        analyticsConnector$ConditionalUserProperty.expiredEventName = object = (String)zzjk.zza(bundle, "expired_event_name", object, null);
        object = (Bundle)zzjk.zza(bundle, "expired_event_params", clazz2, null);
        analyticsConnector$ConditionalUserProperty.expiredEventParams = object;
        object = Boolean.FALSE;
        analyticsConnector$ConditionalUserProperty.active = bl2 = ((Boolean)zzjk.zza(bundle, "active", Boolean.class, object)).booleanValue();
        analyticsConnector$ConditionalUserProperty.creationTimestamp = l3 = ((Long)zzjk.zza(bundle, "creation_timestamp", clazz, object2)).longValue();
        analyticsConnector$ConditionalUserProperty.triggeredTimestamp = l2 = ((Long)zzjk.zza(bundle, "triggered_timestamp", clazz, object2)).longValue();
        return analyticsConnector$ConditionalUserProperty;
    }

    public static String zza(String string2) {
        String string3 = zzjp.zza(string2);
        if (string3 != null) {
            return string3;
        }
        return string2;
    }

    public static void zza(String string2, String string3, Bundle bundle) {
        String string4 = "clx";
        boolean bl2 = string4.equals(string2);
        if (bl2 && (bl2 = (string2 = "_ae").equals(string3))) {
            string2 = "_r";
            long l2 = 1L;
            bundle.putLong(string2, l2);
        }
    }

    public static boolean zza(String object, Bundle bundle) {
        boolean bl2 = zzb.contains(object);
        if (bl2) {
            return false;
        }
        if (bundle != null) {
            object = zzd;
            int n3 = ((AbstractCollection)object).size();
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = object.get(i3);
                boolean bl3 = bundle.containsKey(object2 = (String)object2);
                if (!bl3) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean zza(String object, String string2) {
        boolean bl2;
        String string3 = "_ce1";
        int n3 = string3.equals(string2);
        String string4 = "fcm";
        boolean bl3 = true;
        if (n3 == 0 && (n3 = (string3 = "_ce2").equals(string2)) == 0) {
            string3 = "_ln";
            n3 = string3.equals(string2);
            if (n3 != 0) {
                boolean bl4;
                boolean bl5 = ((String)object).equals(string4);
                if (!bl5 && !(bl4 = ((String)object).equals(string2 = "fiam"))) {
                    return false;
                }
                return bl3;
            }
            object = zze;
            boolean bl6 = ((ImmutableList)object).contains(string2);
            if (bl6) {
                return false;
            }
            object = zzf;
            n3 = ((AbstractCollection)object).size();
            string4 = null;
            for (int i3 = 0; i3 < n3; ++i3) {
                Object object2 = object.get(i3);
                boolean bl7 = string2.matches((String)(object2 = (String)object2));
                if (!bl7) continue;
                return false;
            }
            return bl3;
        }
        boolean bl8 = ((String)object).equals(string4);
        if (!bl8 && !(bl2 = ((String)object).equals(string2 = "frc"))) {
            return false;
        }
        return bl3;
    }

    public static String zzb(String string2) {
        String string3 = zzjp.zzb(string2);
        if (string3 != null) {
            return string3;
        }
        return string2;
    }

    public static boolean zzb(AnalyticsConnector$ConditionalUserProperty analyticsConnector$ConditionalUserProperty) {
        boolean bl2;
        if (analyticsConnector$ConditionalUserProperty == null) {
            return false;
        }
        String string2 = analyticsConnector$ConditionalUserProperty.origin;
        if (string2 != null && !(bl2 = string2.isEmpty())) {
            Bundle bundle;
            Object object = analyticsConnector$ConditionalUserProperty.value;
            if (object != null && (object = zzlx.zza(object)) == null) {
                return false;
            }
            bl2 = com.google.firebase.analytics.connector.internal.zzd.zzf(string2);
            if (!bl2) {
                return false;
            }
            object = analyticsConnector$ConditionalUserProperty.name;
            bl2 = com.google.firebase.analytics.connector.internal.zzd.zza(string2, (String)object);
            if (!bl2) {
                return false;
            }
            object = analyticsConnector$ConditionalUserProperty.expiredEventName;
            if (object != null) {
                bundle = analyticsConnector$ConditionalUserProperty.expiredEventParams;
                bl2 = com.google.firebase.analytics.connector.internal.zzd.zza((String)object, bundle);
                if (!bl2) {
                    return false;
                }
                object = analyticsConnector$ConditionalUserProperty.expiredEventName;
                bundle = analyticsConnector$ConditionalUserProperty.expiredEventParams;
                bl2 = com.google.firebase.analytics.connector.internal.zzd.zzb(string2, (String)object, bundle);
                if (!bl2) {
                    return false;
                }
            }
            if ((object = analyticsConnector$ConditionalUserProperty.triggeredEventName) != null) {
                bundle = analyticsConnector$ConditionalUserProperty.triggeredEventParams;
                bl2 = com.google.firebase.analytics.connector.internal.zzd.zza((String)object, bundle);
                if (!bl2) {
                    return false;
                }
                object = analyticsConnector$ConditionalUserProperty.triggeredEventName;
                bundle = analyticsConnector$ConditionalUserProperty.triggeredEventParams;
                bl2 = com.google.firebase.analytics.connector.internal.zzd.zzb(string2, (String)object, bundle);
                if (!bl2) {
                    return false;
                }
            }
            if ((object = analyticsConnector$ConditionalUserProperty.timedOutEventName) != null) {
                bundle = analyticsConnector$ConditionalUserProperty.timedOutEventParams;
                bl2 = com.google.firebase.analytics.connector.internal.zzd.zza((String)object, bundle);
                if (!bl2) {
                    return false;
                }
                object = analyticsConnector$ConditionalUserProperty.timedOutEventName;
                analyticsConnector$ConditionalUserProperty = analyticsConnector$ConditionalUserProperty.timedOutEventParams;
                boolean bl3 = com.google.firebase.analytics.connector.internal.zzd.zzb(string2, (String)object, (Bundle)analyticsConnector$ConditionalUserProperty);
                if (!bl3) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean zzb(String string2, String object, Bundle bundle) {
        int n3;
        String string3 = "_cmp";
        boolean bl2 = string3.equals(object);
        int n4 = 1;
        if (!bl2) {
            return n4 != 0;
        }
        bl2 = com.google.firebase.analytics.connector.internal.zzd.zzf(string2);
        if (!bl2) {
            return false;
        }
        if (bundle == null) {
            return false;
        }
        object = zzd;
        int n7 = ((AbstractCollection)object).size();
        String string4 = null;
        for (n3 = 0; n3 < n7; n3 += n4) {
            Object object2 = object.get(n3);
            boolean bl3 = bundle.containsKey(object2 = (String)object2);
            if (!bl3) continue;
            return false;
        }
        string2.getClass();
        object = "_cis";
        n7 = -1;
        n3 = string2.hashCode();
        switch (n3) {
            default: {
                break;
            }
            case 0x2FF42F: {
                string4 = "fiam";
                boolean bl4 = string2.equals(string4);
                if (!bl4) break;
                n7 = 2;
                break;
            }
            case 101230: {
                string4 = "fdl";
                boolean bl5 = string2.equals(string4);
                if (!bl5) break;
                n7 = 1;
                break;
            }
            case 101200: {
                string4 = "fcm";
                boolean bl6 = string2.equals(string4);
                if (!bl6) break;
                n7 = 0;
            }
        }
        switch (n7) {
            default: {
                return false;
            }
            case 2: {
                bundle.putString((String)object, "fiam_integration");
                return n4 != 0;
            }
            case 1: {
                bundle.putString((String)object, "fdl_integration");
                return n4 != 0;
            }
            case 0: 
        }
        bundle.putString((String)object, "fcm_integration");
        return n4 != 0;
    }

    public static boolean zzc(String string2) {
        int n3;
        if (string2 == null) {
            return false;
        }
        int n4 = string2.length();
        if (n4 == 0) {
            return false;
        }
        n4 = string2.codePointAt(0);
        int n7 = Character.isLetter(n4);
        int n8 = 95;
        if (n7 == 0 && n4 != n8) {
            return false;
        }
        n7 = string2.length();
        for (n4 = Character.charCount(n4); n4 < n7; n4 += n3) {
            boolean bl2;
            n3 = string2.codePointAt(n4);
            if (n3 != n8 && !(bl2 = Character.isLetterOrDigit(n3))) {
                return false;
            }
            n3 = Character.charCount(n3);
        }
        return true;
    }

    public static boolean zzd(String string2) {
        int n3;
        if (string2 == null) {
            return false;
        }
        int n4 = string2.length();
        if (n4 == 0) {
            return false;
        }
        n4 = string2.codePointAt(0);
        int n7 = Character.isLetter(n4);
        if (n7 == 0) {
            return false;
        }
        n7 = string2.length();
        for (n4 = Character.charCount(n4); n4 < n7; n4 += n3) {
            int n8;
            n3 = string2.codePointAt(n4);
            if (n3 != (n8 = 95) && (n8 = (int)(Character.isLetterOrDigit(n3) ? 1 : 0)) == 0) {
                return false;
            }
            n3 = Character.charCount(n3);
        }
        return true;
    }

    public static boolean zze(String string2) {
        ImmutableSet immutableSet = zza;
        boolean bl2 = immutableSet.contains(string2);
        return !bl2;
    }

    public static boolean zzf(String string2) {
        ImmutableList immutableList = zzc;
        boolean bl2 = immutableList.contains(string2);
        return !bl2;
    }
}

