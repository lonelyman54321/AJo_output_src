/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 *  android.os.Looper
 */
package com.appsflyer.internal;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import com.appsflyer.internal.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public final class AFj1nSDK
implements SensorEventListener {
    private double AFAdRevenueData;
    private long areAllFieldsValid;
    private final Executor component1;
    private final float[][] component2;
    private final long[] component4;
    private final String getCurrencyIso4217Code;
    private final int getMediationNetwork;
    private final String getMonetizationNetwork;
    private final int getRevenue;

    public AFj1nSDK(Sensor object, ExecutorService executorService) {
        int n3 = 2;
        Object object2 = new float[n3][];
        this.component2 = (float[][])object2;
        long[] lArray = new long[n3];
        this.component4 = lArray;
        this.getMediationNetwork = n3 = object.getType();
        object2 = object.getName();
        String string2 = "";
        if (object2 == null) {
            object2 = string2;
        }
        this.getCurrencyIso4217Code = object2;
        if ((object = object.getVendor()) != null) {
            string2 = object;
        }
        this.getMonetizationNetwork = string2;
        n3 = (n3 + 31) * 31;
        int n4 = (object2.hashCode() + n3) * 31;
        this.getRevenue = n3 = string2.hashCode() + n4;
        this.component1 = executorService;
    }

    private static List AFAdRevenueData(float[] fArray) {
        int n3 = fArray.length;
        ArrayList<Float> arrayList = new ArrayList<Float>(n3);
        for (float f5 : fArray) {
            Float f6 = Float.valueOf(f5);
            arrayList.add(f6);
        }
        return arrayList;
    }

    private boolean AFAdRevenueData() {
        float[] fArray = this.component2[0];
        return fArray != null;
    }

    private void H_(SensorEvent object) {
        long l2 = object.timestamp;
        object = object.values;
        long l3 = System.currentTimeMillis();
        Object object2 = this.component2;
        int n3 = 0;
        float[] fArray = object2[0];
        if (fArray == null) {
            int n4 = ((SensorEvent)object).length;
            object = Arrays.copyOf((float[])object, n4);
            object2[0] = (float[])object;
            this.component4[0] = l3;
            return;
        }
        n3 = 1;
        if ((object2 = (Object)object2[n3]) == null) {
            double d2;
            int n7 = ((SensorEvent)object).length;
            object = Arrays.copyOf((float[])object, n7);
            this.component2[n3] = (float[])object;
            this.component4[n3] = l3;
            this.AFAdRevenueData = d2 = AFj1nSDK.getMediationNetwork(fArray, (float[])object);
            return;
        }
        long l4 = this.areAllFieldsValid;
        long l7 = 50000000L;
        long l8 = l7 - (l4 = l2 - l4);
        Object object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object3 <= 0) {
            double d5;
            this.areAllFieldsValid = l2;
            boolean bl2 = Arrays.equals((float[])object2, (float[])object);
            if (bl2) {
                this.component4[n3] = l3;
                return;
            }
            double d7 = AFj1nSDK.getMediationNetwork(fArray, (float[])object);
            double d9 = d7 - (d5 = this.AFAdRevenueData);
            Object object4 = d9 == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1);
            if (object4 > 0) {
                object2 = this.component2;
                int n8 = ((SensorEvent)object).length;
                object = Arrays.copyOf((float[])object, n8);
                object2[n3] = (float[])object;
                object = this.component4;
                object[n3] = (SensorEvent)l3;
                this.AFAdRevenueData = d7;
            }
        }
    }

    private /* synthetic */ void I_(SensorEvent sensorEvent) {
        this.H_(sensorEvent);
    }

    public static /* synthetic */ void a(AFj1nSDK aFj1nSDK, SensorEvent sensorEvent) {
        aFj1nSDK.I_(sensorEvent);
    }

    private static double getMediationNetwork(float[] fArray, float[] fArray2) {
        int n3 = fArray.length;
        int n4 = fArray2.length;
        n3 = Math.min(n3, n4);
        double d2 = 0.0;
        for (int i3 = 0; i3 < n3; ++i3) {
            float f5 = fArray[i3];
            float f6 = fArray2[i3];
            double d5 = f5 -= f6;
            double d7 = 2.0;
            d5 = StrictMath.pow(d5, d7);
            d2 += d5;
        }
        return Math.sqrt(d2);
    }

    private Map getRevenue() {
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<String, Object>(7);
        int n3 = this.getMediationNetwork;
        Object object = n3;
        concurrentHashMap.put("sT", object);
        String string2 = this.getCurrencyIso4217Code;
        concurrentHashMap.put("sN", string2);
        string2 = this.getMonetizationNetwork;
        concurrentHashMap.put("sV", string2);
        object = this.component2;
        int n4 = 0;
        string2 = null;
        object = object[0];
        if (object != null) {
            string2 = "sVS";
            object = AFj1nSDK.AFAdRevenueData((float[])object);
            concurrentHashMap.put(string2, object);
        }
        object = this.component2;
        n4 = 1;
        if ((object = object[n4]) != null) {
            string2 = "sVE";
            object = AFj1nSDK.AFAdRevenueData((float[])object);
            concurrentHashMap.put(string2, object);
        }
        return concurrentHashMap;
    }

    private boolean getRevenue(int n3, String string2, String string3) {
        String string4;
        int n4 = this.getMediationNetwork;
        return n4 == n3 && (n3 = (int)((string4 = this.getCurrencyIso4217Code).equals(string2) ? 1 : 0)) != 0 && (n3 = (int)((string4 = this.getMonetizationNetwork).equals(string3) ? 1 : 0)) != 0;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        int n3 = object instanceof AFj1nSDK;
        if (n3 != 0) {
            object = (AFj1nSDK)object;
            n3 = ((AFj1nSDK)object).getMediationNetwork;
            String string2 = ((AFj1nSDK)object).getCurrencyIso4217Code;
            object = ((AFj1nSDK)object).getMonetizationNetwork;
            return this.getRevenue(n3, string2, (String)object);
        }
        return false;
    }

    public final void getMediationNetwork(Map object, boolean n3) {
        int n4 = this.AFAdRevenueData();
        if (n4 != 0) {
            Map map2 = this.getRevenue();
            object.put(this, map2);
            if (n3 != 0) {
                long l2;
                long[] lArray;
                object = this.component2;
                int n7 = ((Object)object).length;
                n3 = 0;
                Object var6_6 = null;
                map2 = null;
                for (n4 = 0; n4 < n7; ++n4) {
                    float[][] fArray = this.component2;
                    lArray = null;
                    fArray[n4] = null;
                }
                object = this.component4;
                n7 = ((Object)object).length;
                while (true) {
                    l2 = 0L;
                    if (n3 >= n7) break;
                    lArray = this.component4;
                    lArray[n3] = l2;
                    ++n3;
                }
                this.AFAdRevenueData = 0.0;
                this.areAllFieldsValid = l2;
                return;
            }
        } else {
            n3 = object.containsKey(this);
            if (n3 == 0) {
                Map map3 = this.getRevenue();
                object.put(this, map3);
            }
        }
    }

    public final int hashCode() {
        return this.getRevenue;
    }

    public final void onAccuracyChanged(Sensor sensor, int n3) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        Object object;
        Object object2 = Looper.myLooper();
        if (object2 == (object = Looper.getMainLooper())) {
            object2 = this.component1;
            object = new z(this, sensorEvent);
            object2.execute((Runnable)object);
            return;
        }
        this.H_(sensorEvent);
    }
}

