/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.IObjectWrapper$Stub;
import com.google.android.gms.internal.measurement.zzbw;
import com.google.android.gms.internal.measurement.zzbx;
import com.google.android.gms.internal.measurement.zzdl;
import com.google.android.gms.internal.measurement.zzdn;
import com.google.android.gms.internal.measurement.zzdq;
import com.google.android.gms.internal.measurement.zzdr;
import com.google.android.gms.internal.measurement.zzds;
import com.google.android.gms.internal.measurement.zzdt;
import com.google.android.gms.internal.measurement.zzdw;
import com.google.android.gms.internal.measurement.zzdx;
import com.google.android.gms.internal.measurement.zzdy;
import com.google.android.gms.internal.measurement.zzdz;
import com.google.android.gms.internal.measurement.zzea;
import com.google.android.gms.internal.measurement.zzeb;
import java.util.Map;

public abstract class zzdo
extends zzbx
implements zzdl {
    public zzdo() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static zzdl asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        boolean bl2 = iInterface instanceof zzdl;
        if (bl2) {
            return (zzdl)iInterface;
        }
        iInterface = new zzdn(iBinder);
        return iInterface;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final boolean zza(int n3, Parcel parcel, Parcel parcel2, int n4) {
        Object object = "com.google.android.gms.measurement.api.internal.IEventHandlerProxy";
        Object object2 = "com.google.android.gms.measurement.api.internal.IBundleReceiver";
        boolean bl2 = false;
        Object var8_8 = null;
        switch (n3) {
            default: {
                return false;
            }
            case 58: {
                void var8_12;
                object = parcel.readStrongBinder();
                if (object != null) {
                    object2 = object.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    bl2 = object2 instanceof zzdr;
                    if (bl2) {
                        Object object3 = object2;
                        zzdr zzdr2 = (zzdr)object2;
                    } else {
                        zzdt zzdt2 = new zzdt((IBinder)object);
                    }
                }
                zzbw.zzb(parcel);
                this.retrieveAndUploadBatches((zzdr)var8_12);
                break;
            }
            case 57: {
                void var8_16;
                object = zzeb.CREATOR;
                object = (zzeb)zzbw.zza(parcel, (Parcelable.Creator)object);
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (object2 = iBinder.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object4 = object2;
                        zzdq zzdq2 = (zzdq)object2;
                    } else {
                        zzds zzds2 = new zzds(iBinder);
                    }
                }
                long l2 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivitySaveInstanceStateByScionActivityInfo((zzeb)object, (zzdq)var8_16, l2);
                break;
            }
            case 56: {
                object = zzeb.CREATOR;
                object = (zzeb)zzbw.zza(parcel, (Parcelable.Creator)object);
                long l3 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityResumedByScionActivityInfo((zzeb)object, l3);
                break;
            }
            case 55: {
                object = zzeb.CREATOR;
                object = (zzeb)zzbw.zza(parcel, (Parcelable.Creator)object);
                long l4 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityPausedByScionActivityInfo((zzeb)object, l4);
                break;
            }
            case 54: {
                object = zzeb.CREATOR;
                object = (zzeb)zzbw.zza(parcel, (Parcelable.Creator)object);
                long l7 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityDestroyedByScionActivityInfo((zzeb)object, l7);
                break;
            }
            case 53: {
                object = zzeb.CREATOR;
                object = (zzeb)zzbw.zza(parcel, (Parcelable.Creator)object);
                object2 = Bundle.CREATOR;
                object2 = (Bundle)zzbw.zza(parcel, (Parcelable.Creator)object2);
                long l8 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityCreatedByScionActivityInfo((zzeb)object, (Bundle)object2, l8);
                break;
            }
            case 52: {
                object = zzeb.CREATOR;
                object = (zzeb)zzbw.zza(parcel, (Parcelable.Creator)object);
                long l12 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityStoppedByScionActivityInfo((zzeb)object, l12);
                break;
            }
            case 51: {
                object = zzeb.CREATOR;
                object = (zzeb)zzbw.zza(parcel, (Parcelable.Creator)object);
                long l14 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityStartedByScionActivityInfo((zzeb)object, l14);
                break;
            }
            case 50: {
                object = zzeb.CREATOR;
                object = (zzeb)zzbw.zza(parcel, (Parcelable.Creator)object);
                object2 = parcel.readString();
                String string2 = parcel.readString();
                long l15 = parcel.readLong();
                zzbw.zzb(parcel);
                this.setCurrentScreenByScionActivityInfo((zzeb)object, (String)object2, string2, l15);
                break;
            }
            case 48: {
                object = Intent.CREATOR;
                object = (Intent)zzbw.zza(parcel, (Parcelable.Creator)object);
                zzbw.zzb(parcel);
                this.setSgtmDebugInfo((Intent)object);
                break;
            }
            case 46: {
                void var8_21;
                object = parcel.readStrongBinder();
                if (object != null) {
                    bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object5 = object2;
                        zzdq zzdq3 = (zzdq)object2;
                    } else {
                        zzds zzds3 = new zzds((IBinder)object);
                    }
                }
                zzbw.zzb(parcel);
                this.getSessionId((zzdq)var8_21);
                break;
            }
            case 45: {
                object = Bundle.CREATOR;
                object = (Bundle)zzbw.zza(parcel, (Parcelable.Creator)object);
                long l16 = parcel.readLong();
                zzbw.zzb(parcel);
                this.setConsentThirdParty((Bundle)object, l16);
                break;
            }
            case 44: {
                object = Bundle.CREATOR;
                object = (Bundle)zzbw.zza(parcel, (Parcelable.Creator)object);
                long l17 = parcel.readLong();
                zzbw.zzb(parcel);
                this.setConsent((Bundle)object, l17);
                break;
            }
            case 43: {
                long l18 = parcel.readLong();
                zzbw.zzb(parcel);
                this.clearMeasurementEnabled(l18);
                break;
            }
            case 42: {
                object = Bundle.CREATOR;
                object = (Bundle)zzbw.zza(parcel, (Parcelable.Creator)object);
                zzbw.zzb(parcel);
                this.setDefaultEventParameters((Bundle)object);
                break;
            }
            case 40: {
                void var8_25;
                object = parcel.readStrongBinder();
                if (object != null) {
                    bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object6 = object2;
                        zzdq zzdq4 = (zzdq)object2;
                    } else {
                        zzds zzds4 = new zzds((IBinder)object);
                    }
                }
                zzbw.zzb(parcel);
                this.isDataCollectionEnabled((zzdq)var8_25);
                break;
            }
            case 39: {
                boolean bl3 = zzbw.zzc(parcel);
                zzbw.zzb(parcel);
                this.setDataCollectionEnabled(bl3);
                break;
            }
            case 38: {
                void var8_29;
                object = parcel.readStrongBinder();
                if (object != null) {
                    bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object7 = object2;
                        zzdq zzdq5 = (zzdq)object2;
                    } else {
                        zzds zzds5 = new zzds((IBinder)object);
                    }
                }
                int n7 = parcel.readInt();
                zzbw.zzb(parcel);
                this.getTestFlag((zzdq)var8_29, n7);
                break;
            }
            case 37: {
                object = zzbw.zza(parcel);
                zzbw.zzb(parcel);
                this.initForTests((Map)object);
                break;
            }
            case 36: {
                void var8_33;
                object2 = parcel.readStrongBinder();
                if (object2 != null) {
                    bl2 = (object = object2.queryLocalInterface((String)object)) instanceof zzdw;
                    if (bl2) {
                        Object object8 = object;
                        zzdw zzdw2 = (zzdw)object;
                    } else {
                        zzdy zzdy2 = new zzdy((IBinder)object2);
                    }
                }
                zzbw.zzb(parcel);
                this.unregisterOnMeasurementEventListener((zzdw)var8_33);
                break;
            }
            case 35: {
                void var8_37;
                object2 = parcel.readStrongBinder();
                if (object2 != null) {
                    bl2 = (object = object2.queryLocalInterface((String)object)) instanceof zzdw;
                    if (bl2) {
                        Object object9 = object;
                        zzdw zzdw3 = (zzdw)object;
                    } else {
                        zzdy zzdy3 = new zzdy((IBinder)object2);
                    }
                }
                zzbw.zzb(parcel);
                this.registerOnMeasurementEventListener((zzdw)var8_37);
                break;
            }
            case 34: {
                void var8_41;
                object2 = parcel.readStrongBinder();
                if (object2 != null) {
                    bl2 = (object = object2.queryLocalInterface((String)object)) instanceof zzdw;
                    if (bl2) {
                        Object object10 = object;
                        zzdw zzdw4 = (zzdw)object;
                    } else {
                        zzdy zzdy4 = new zzdy((IBinder)object2);
                    }
                }
                zzbw.zzb(parcel);
                this.setEventInterceptor((zzdw)var8_41);
                break;
            }
            case 33: {
                int n8 = parcel.readInt();
                object2 = parcel.readString();
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapper2 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapper3 = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                zzbw.zzb(parcel);
                this.logHealthData(n8, (String)object2, iObjectWrapper, iObjectWrapper2, iObjectWrapper3);
                break;
            }
            case 32: {
                void var8_46;
                object = Bundle.CREATOR;
                object = (Bundle)zzbw.zza(parcel, (Parcelable.Creator)object);
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (object2 = iBinder.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object11 = object2;
                        zzdq zzdq6 = (zzdq)object2;
                    } else {
                        zzds zzds6 = new zzds(iBinder);
                    }
                }
                long l19 = parcel.readLong();
                zzbw.zzb(parcel);
                this.performAction((Bundle)object, (zzdq)var8_46, l19);
                break;
            }
            case 31: {
                void var8_50;
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (object2 = iBinder.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object12 = object2;
                        zzdq zzdq7 = (zzdq)object2;
                    } else {
                        zzds zzds7 = new zzds(iBinder);
                    }
                }
                long l20 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivitySaveInstanceState((IObjectWrapper)object, (zzdq)var8_50, l20);
                break;
            }
            case 30: {
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                long l21 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityResumed((IObjectWrapper)object, l21);
                break;
            }
            case 29: {
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                long l22 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityPaused((IObjectWrapper)object, l22);
                break;
            }
            case 28: {
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                long l23 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityDestroyed((IObjectWrapper)object, l23);
                break;
            }
            case 27: {
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object2 = Bundle.CREATOR;
                object2 = (Bundle)zzbw.zza(parcel, (Parcelable.Creator)object2);
                long l24 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityCreated((IObjectWrapper)object, (Bundle)object2, l24);
                break;
            }
            case 26: {
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                long l25 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityStopped((IObjectWrapper)object, l25);
                break;
            }
            case 25: {
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                long l26 = parcel.readLong();
                zzbw.zzb(parcel);
                this.onActivityStarted((IObjectWrapper)object, l26);
                break;
            }
            case 24: {
                object = parcel.readString();
                long l27 = parcel.readLong();
                zzbw.zzb(parcel);
                this.endAdUnitExposure((String)object, l27);
                break;
            }
            case 23: {
                object = parcel.readString();
                long l28 = parcel.readLong();
                zzbw.zzb(parcel);
                this.beginAdUnitExposure((String)object, l28);
                break;
            }
            case 22: {
                void var8_54;
                object = parcel.readStrongBinder();
                if (object != null) {
                    bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object13 = object2;
                        zzdq zzdq8 = (zzdq)object2;
                    } else {
                        zzds zzds8 = new zzds((IBinder)object);
                    }
                }
                zzbw.zzb(parcel);
                this.generateEventId((zzdq)var8_54);
                break;
            }
            case 21: {
                void var8_58;
                object = parcel.readStrongBinder();
                if (object != null) {
                    bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object14 = object2;
                        zzdq zzdq9 = (zzdq)object2;
                    } else {
                        zzds zzds9 = new zzds((IBinder)object);
                    }
                }
                zzbw.zzb(parcel);
                this.getGmpAppId((zzdq)var8_58);
                break;
            }
            case 20: {
                void var8_62;
                object = parcel.readStrongBinder();
                if (object != null) {
                    bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object15 = object2;
                        zzdq zzdq10 = (zzdq)object2;
                    } else {
                        zzds zzds10 = new zzds((IBinder)object);
                    }
                }
                zzbw.zzb(parcel);
                this.getAppInstanceId((zzdq)var8_62);
                break;
            }
            case 19: {
                void var8_66;
                object = parcel.readStrongBinder();
                if (object != null) {
                    bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object16 = object2;
                        zzdq zzdq11 = (zzdq)object2;
                    } else {
                        zzds zzds11 = new zzds((IBinder)object);
                    }
                }
                zzbw.zzb(parcel);
                this.getCachedAppInstanceId((zzdq)var8_66);
                break;
            }
            case 18: {
                void var8_70;
                object = parcel.readStrongBinder();
                if (object != null) {
                    object2 = object.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    bl2 = object2 instanceof zzdx;
                    if (bl2) {
                        Object object17 = object2;
                        zzdx zzdx2 = (zzdx)object2;
                    } else {
                        zzea zzea2 = new zzea((IBinder)object);
                    }
                }
                zzbw.zzb(parcel);
                this.setInstanceIdProvider((zzdx)var8_70);
                break;
            }
            case 17: {
                void var8_74;
                object = parcel.readStrongBinder();
                if (object != null) {
                    bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object18 = object2;
                        zzdq zzdq12 = (zzdq)object2;
                    } else {
                        zzds zzds12 = new zzds((IBinder)object);
                    }
                }
                zzbw.zzb(parcel);
                this.getCurrentScreenClass((zzdq)var8_74);
                break;
            }
            case 16: {
                void var8_78;
                object = parcel.readStrongBinder();
                if (object != null) {
                    bl2 = (object2 = object.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object19 = object2;
                        zzdq zzdq13 = (zzdq)object2;
                    } else {
                        zzds zzds13 = new zzds((IBinder)object);
                    }
                }
                zzbw.zzb(parcel);
                this.getCurrentScreenName((zzdq)var8_78);
                break;
            }
            case 15: {
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object2 = parcel.readString();
                String string3 = parcel.readString();
                long l29 = parcel.readLong();
                zzbw.zzb(parcel);
                this.setCurrentScreen((IObjectWrapper)object, (String)object2, string3, l29);
                break;
            }
            case 14: {
                long l30 = parcel.readLong();
                zzbw.zzb(parcel);
                this.setSessionTimeoutDuration(l30);
                break;
            }
            case 13: {
                long l31 = parcel.readLong();
                zzbw.zzb(parcel);
                this.setMinimumSessionDuration(l31);
                break;
            }
            case 12: {
                long l34 = parcel.readLong();
                zzbw.zzb(parcel);
                this.resetAnalyticsData(l34);
                break;
            }
            case 11: {
                boolean bl4 = zzbw.zzc(parcel);
                long l35 = parcel.readLong();
                zzbw.zzb(parcel);
                this.setMeasurementEnabled(bl4, l35);
                break;
            }
            case 10: {
                void var8_83;
                object = parcel.readString();
                String string4 = parcel.readString();
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (object2 = iBinder.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object20 = object2;
                        zzdq zzdq14 = (zzdq)object2;
                    } else {
                        zzds zzds14 = new zzds(iBinder);
                    }
                }
                zzbw.zzb(parcel);
                this.getConditionalUserProperties((String)object, string4, (zzdq)var8_83);
                break;
            }
            case 9: {
                object = parcel.readString();
                object2 = parcel.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle)zzbw.zza(parcel, creator);
                zzbw.zzb(parcel);
                this.clearConditionalUserProperty((String)object, (String)object2, bundle);
                break;
            }
            case 8: {
                object = Bundle.CREATOR;
                object = (Bundle)zzbw.zza(parcel, (Parcelable.Creator)object);
                long l36 = parcel.readLong();
                zzbw.zzb(parcel);
                this.setConditionalUserProperty((Bundle)object, l36);
                break;
            }
            case 7: {
                object = parcel.readString();
                long l37 = parcel.readLong();
                zzbw.zzb(parcel);
                this.setUserId((String)object, l37);
                break;
            }
            case 6: {
                void var8_89;
                object = parcel.readString();
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (object2 = iBinder.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object21 = object2;
                        zzdq zzdq15 = (zzdq)object2;
                    } else {
                        zzds zzds15 = new zzds(iBinder);
                    }
                }
                zzbw.zzb(parcel);
                this.getMaxUserProperties((String)object, (zzdq)var8_89);
                break;
            }
            case 5: {
                void var8_93;
                object = parcel.readString();
                String string5 = parcel.readString();
                boolean bl5 = zzbw.zzc(parcel);
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder != null) {
                    bl2 = (object2 = iBinder.queryLocalInterface((String)object2)) instanceof zzdq;
                    if (bl2) {
                        Object object22 = object2;
                        zzdq zzdq16 = (zzdq)object2;
                    } else {
                        zzds zzds16 = new zzds(iBinder);
                    }
                }
                zzbw.zzb(parcel);
                this.getUserProperties((String)object, string5, bl5, (zzdq)var8_93);
                break;
            }
            case 4: {
                object = parcel.readString();
                object2 = parcel.readString();
                IObjectWrapper iObjectWrapper = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                boolean bl6 = zzbw.zzc(parcel);
                long l38 = parcel.readLong();
                zzbw.zzb(parcel);
                this.setUserProperty((String)object, (String)object2, iObjectWrapper, bl6, l38);
                break;
            }
            case 3: {
                void var21_148;
                object = parcel.readString();
                String string6 = parcel.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                creator = (Bundle)zzbw.zza(parcel, creator);
                IBinder iBinder = parcel.readStrongBinder();
                if (iBinder == null) {
                    Object var21_146 = null;
                } else {
                    bl2 = (object2 = iBinder.queryLocalInterface((String)object2)) instanceof zzdq;
                    object2 = bl2 ? (zzdq)object2 : new zzds(iBinder);
                    Object object23 = object2;
                }
                long l39 = parcel.readLong();
                zzbw.zzb(parcel);
                object2 = string6;
                Parcelable.Creator creator2 = creator;
                string6 = var21_148;
                long l41 = l39;
                this.logEventAndBundle((String)object, (String)object2, (Bundle)creator, (zzdq)var21_148, l39);
                break;
            }
            case 2: {
                object = parcel.readString();
                object2 = parcel.readString();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle)zzbw.zza(parcel, creator);
                boolean bl7 = zzbw.zzc(parcel);
                boolean bl8 = zzbw.zzc(parcel);
                long l42 = parcel.readLong();
                zzbw.zzb(parcel);
                this.logEvent((String)object, (String)object2, bundle, bl7, bl8, l42);
                break;
            }
            case 1: {
                object = IObjectWrapper$Stub.asInterface(parcel.readStrongBinder());
                object2 = zzdz.CREATOR;
                object2 = (zzdz)zzbw.zza(parcel, (Parcelable.Creator)object2);
                long l43 = parcel.readLong();
                zzbw.zzb(parcel);
                this.initialize((IObjectWrapper)object, (zzdz)object2, l43);
            }
        }
        parcel2.writeNoException();
        return true;
    }
}

