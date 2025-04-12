/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.location.Location
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.SystemClock
 */
package com.google.android.gms.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.location.zzeo;
import java.io.Serializable;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class zzak {
    public static final /* synthetic */ int zza;
    private static final DecimalFormat zzb;
    private static final DecimalFormat zzc;
    private static final StringBuilder zzd;

    static {
        Serializable serializable;
        Object object = Locale.ROOT;
        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance(object);
        zzb = serializable = new DecimalFormat(".000000", decimalFormatSymbols);
        object = DecimalFormatSymbols.getInstance(object);
        zzc = serializable = new DecimalFormat(".##", (DecimalFormatSymbols)object);
        object = RoundingMode.DOWN;
        serializable.setRoundingMode((RoundingMode)((Object)object));
        serializable = new StringBuilder();
        zzd = serializable;
    }

    public static StringBuilder zza(Location object, StringBuilder stringBuilder) {
        float f5;
        boolean bl2;
        float f6;
        String string2;
        double d2;
        float f7;
        Object object2;
        stringBuilder.ensureCapacity(100);
        String string3 = null;
        if (object == null) {
            stringBuilder.append((String)null);
            return stringBuilder;
        }
        stringBuilder.append("{");
        String string4 = object.getProvider();
        stringBuilder.append(string4);
        string4 = ", ";
        stringBuilder.append(string4);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 31;
        n4 = n3 >= n4 ? (int)(tw1.a(object) ? 1 : 0) : (int)(object.isFromMockProvider() ? 1 : 0);
        if (n4 != 0) {
            object2 = "mock, ";
            stringBuilder.append((String)object2);
        }
        object2 = zzb;
        double d5 = object.getLatitude();
        String string5 = ((NumberFormat)object2).format(d5);
        stringBuilder.append(string5);
        stringBuilder.append(",");
        d5 = object.getLongitude();
        object2 = ((NumberFormat)object2).format(d5);
        stringBuilder.append((String)object2);
        n4 = (int)(object.hasAccuracy() ? 1 : 0);
        string5 = "m";
        String string6 = "\u00b1";
        if (n4 != 0) {
            stringBuilder.append(string6);
            object2 = zzc;
            f7 = object.getAccuracy();
            double d7 = f7;
            object2 = ((NumberFormat)object2).format(d7);
            stringBuilder.append((String)object2);
            stringBuilder.append(string5);
        }
        n4 = (int)(object.hasAltitude() ? 1 : 0);
        boolean bl3 = false;
        f7 = 0.0f;
        float f8 = 0.0f;
        int n7 = 26;
        if (n4 != 0) {
            Bundle bundle;
            boolean bl4;
            stringBuilder.append(", alt=");
            object2 = zzc;
            d2 = object.getAltitude();
            string2 = ((NumberFormat)object2).format(d2);
            stringBuilder.append(string2);
            string2 = "verticalAccuracy";
            if (n3 >= n7) {
                bl4 = sw1.f(object);
            } else {
                bundle = object.getExtras();
                if (bundle != null && (bl4 = bundle.containsKey(string2))) {
                    bl4 = true;
                } else {
                    bl4 = false;
                    bundle = null;
                }
            }
            if (bl4) {
                stringBuilder.append(string6);
                if (n3 >= n7) {
                    f6 = sw1.c(object);
                } else {
                    bundle = object.getExtras();
                    if (bundle == null) {
                        bl2 = false;
                        f6 = 0.0f;
                        string2 = null;
                    } else {
                        f6 = bundle.getFloat(string2, 0.0f);
                    }
                }
                d2 = f6;
                object2 = ((NumberFormat)object2).format(d2);
                stringBuilder.append((String)object2);
            }
            stringBuilder.append(string5);
        }
        if ((n4 = (int)(object.hasSpeed() ? 1 : 0)) != 0) {
            stringBuilder.append(", spd=");
            object2 = zzc;
            f5 = object.getSpeed();
            d2 = f5;
            string5 = ((NumberFormat)object2).format(d2);
            stringBuilder.append(string5);
            string5 = "speedAccuracy";
            if (n3 >= n7) {
                bl2 = sw1.e(object);
            } else {
                string2 = object.getExtras();
                if (string2 != null && (bl2 = string2.containsKey(string5))) {
                    bl2 = true;
                    f6 = Float.MIN_VALUE;
                } else {
                    bl2 = false;
                    f6 = 0.0f;
                    string2 = null;
                }
            }
            if (bl2) {
                stringBuilder.append(string6);
                if (n3 >= n7) {
                    f5 = sw1.b(object);
                } else {
                    string2 = object.getExtras();
                    if (string2 == null) {
                        f5 = 0.0f;
                        string5 = null;
                    } else {
                        f5 = string2.getFloat(string5, 0.0f);
                    }
                }
                d2 = f5;
                object2 = ((NumberFormat)object2).format(d2);
                stringBuilder.append((String)object2);
            }
            object2 = "m/s";
            stringBuilder.append((String)object2);
        }
        if ((n4 = (int)(object.hasBearing() ? 1 : 0)) != 0) {
            stringBuilder.append(", brg=");
            object2 = zzc;
            f5 = object.getBearing();
            d2 = f5;
            string5 = ((NumberFormat)object2).format(d2);
            stringBuilder.append(string5);
            string5 = "bearingAccuracy";
            if (n3 >= n7) {
                bl3 = sw1.d(object);
            } else {
                string2 = object.getExtras();
                if (string2 != null && (bl2 = string2.containsKey(string5))) {
                    bl3 = true;
                    f7 = Float.MIN_VALUE;
                }
            }
            if (bl3) {
                stringBuilder.append(string6);
                if (n3 >= n7) {
                    f8 = sw1.a(object);
                } else {
                    string4 = object.getExtras();
                    if (string4 != null) {
                        f8 = string4.getFloat(string5, 0.0f);
                    }
                }
                d5 = f8;
                string4 = ((NumberFormat)object2).format(d5);
                stringBuilder.append(string4);
            }
            string4 = "\u00b0";
            stringBuilder.append(string4);
        }
        if ((string4 = object.getExtras()) != null) {
            object2 = "floorLabel";
            string4 = string4.getString((String)object2);
        } else {
            n3 = 0;
            string4 = null;
        }
        if (string4 != null) {
            object2 = ", fl=";
            stringBuilder.append((String)object2);
            stringBuilder.append(string4);
        }
        if ((string4 = object.getExtras()) != null) {
            string3 = string4.getString("levelId");
        }
        if (string3 != null) {
            string4 = ", lv=";
            stringBuilder.append(string4);
            stringBuilder.append(string3);
        }
        long l2 = System.currentTimeMillis();
        long l3 = SystemClock.elapsedRealtime();
        stringBuilder.append(", ert=");
        object2 = TimeUnit.NANOSECONDS;
        long l4 = object.getElapsedRealtimeNanos();
        object = zzeo.zza(((TimeUnit)((Object)object2)).toMillis(l4) + (l2 -= l3));
        stringBuilder.append((String)object);
        stringBuilder.append('}');
        return stringBuilder;
    }
}

