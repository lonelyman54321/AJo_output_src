/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.hardware.Sensor
 *  android.hardware.SensorEventListener
 *  android.hardware.SensorManager
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package com.appsflyer.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFj1mSDK$1;
import com.appsflyer.internal.AFj1mSDK$5;
import com.appsflyer.internal.AFj1nSDK;
import com.appsflyer.internal.AFj1oSDK;
import com.appsflyer.internal.x;
import com.appsflyer.internal.y;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

public final class AFj1mSDK
implements AFj1oSDK {
    private static final BitSet component1;
    final Object AFAdRevenueData;
    private final Map areAllFieldsValid;
    private final ExecutorService component2;
    private final SensorManager component3;
    private final Map component4;
    private final Runnable copydefault;
    final Handler getCurrencyIso4217Code;
    boolean getMediationNetwork;
    final Runnable getMonetizationNetwork;
    final Runnable getRevenue;
    private boolean hashCode;

    static {
        BitSet bitSet;
        component1 = bitSet = new BitSet(6);
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(4);
    }

    public AFj1mSDK(Context context, ExecutorService executorService) {
        context = (SensorManager)context.getApplicationContext().getSystemService("sensor");
        HandlerThread handlerThread = new HandlerThread("internal");
        handlerThread.start();
        handlerThread = handlerThread.getLooper();
        Handler handler = new Handler((Looper)handlerThread);
        this((SensorManager)context, handler, executorService);
    }

    private AFj1mSDK(SensorManager sensorManager, Handler handler, ExecutorService executorService) {
        Object object;
        this.AFAdRevenueData = object = new Object();
        BitSet bitSet = component1;
        int n3 = bitSet.size();
        object = new HashMap(n3);
        this.component4 = object;
        int n4 = bitSet.size();
        super(n4);
        this.areAllFieldsValid = object;
        this.getRevenue = object = new AFj1mSDK$5(this);
        this.getMonetizationNetwork = object = new x(this);
        this.copydefault = object = new AFj1mSDK$1(this);
        this.component3 = sensorManager;
        this.getCurrencyIso4217Code = handler;
        this.component2 = executorService;
    }

    private static boolean AFAdRevenueData(int n3) {
        BitSet bitSet;
        return n3 >= 0 && (n3 = (int)((bitSet = component1).get(n3) ? 1 : 0)) != 0;
    }

    public static /* synthetic */ void a(AFj1mSDK aFj1mSDK) {
        aFj1mSDK.component3();
    }

    private /* synthetic */ void areAllFieldsValid() {
        block13: {
            Object object;
            Iterator iterator = this.component4;
            boolean bl2 = iterator.isEmpty();
            if (bl2) break block13;
            iterator = this.component4;
            iterator = iterator.values();
            try {
                iterator = iterator.iterator();
            }
            catch (Throwable throwable) {
                object = "error while unregistering listeners";
                AFLogger.afErrorLogForExcManagerOnly((String)object, throwable);
            }
            while (true) {
                boolean bl3 = iterator.hasNext();
                if (!bl3) break;
                object = iterator.next();
                object = (AFj1nSDK)object;
                Object object2 = this.component3;
                object2.unregisterListener((SensorEventListener)object);
                object2 = this.areAllFieldsValid;
                boolean bl4 = true;
                ((AFj1nSDK)object).getMediationNetwork((Map)object2, bl4);
                continue;
                break;
            }
        }
        this.hashCode = false;
    }

    public static /* synthetic */ void b(AFj1mSDK aFj1mSDK) {
        aFj1mSDK.areAllFieldsValid();
    }

    public static /* synthetic */ void c(AFj1mSDK aFj1mSDK) {
        aFj1mSDK.component4();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List component1() {
        Object object = this.AFAdRevenueData;
        synchronized (object) {
            Throwable throwable2;
            block5: {
                Object object2;
                Object object3;
                try {
                    boolean bl2;
                    object3 = this.component4;
                    object3 = object3.values();
                    object3 = object3.iterator();
                    while (bl2 = object3.hasNext()) {
                        object2 = object3.next();
                        object2 = (AFj1nSDK)object2;
                        Map map2 = this.areAllFieldsValid;
                        boolean bl3 = true;
                        ((AFj1nSDK)object2).getMediationNetwork(map2, bl3);
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                object3 = this.areAllFieldsValid;
                boolean bl4 = object3.isEmpty();
                if (bl4) {
                    object2 = Collections.emptyList();
                    return new Object(object2);
                }
                object2 = this.areAllFieldsValid;
                object2 = object2.values();
                return new Object(object2);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private List component2() {
        Object object = this.AFAdRevenueData;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                Object object2;
                boolean bl2;
                CopyOnWriteArrayList copyOnWriteArrayList;
                block5: {
                    try {
                        boolean bl3;
                        copyOnWriteArrayList = this.component4;
                        bl2 = copyOnWriteArrayList.isEmpty();
                        if (bl2 || !(bl2 = this.hashCode)) break block5;
                        copyOnWriteArrayList = this.component4;
                        copyOnWriteArrayList = copyOnWriteArrayList.values();
                        copyOnWriteArrayList = copyOnWriteArrayList.iterator();
                        while (bl3 = copyOnWriteArrayList.hasNext()) {
                            object2 = copyOnWriteArrayList.next();
                            object2 = (AFj1nSDK)object2;
                            Map map2 = this.areAllFieldsValid;
                            ((AFj1nSDK)object2).getMediationNetwork(map2, false);
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (bl2 = (copyOnWriteArrayList = this.areAllFieldsValid).isEmpty()) {
                    object2 = Collections.emptyList();
                    return new CopyOnWriteArrayList(object2);
                }
                object2 = this.areAllFieldsValid;
                object2 = object2.values();
                return new CopyOnWriteArrayList(object2);
            }
            throw throwable2;
        }
    }

    private /* synthetic */ void component3() {
        Object object = this.AFAdRevenueData;
        synchronized (object) {
            Handler handler = this.getCurrencyIso4217Code;
            int n3 = 1;
            ci0_0 ci0_02 = new ci0_0(this, n3);
            handler.post((Runnable)ci0_02);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void component4() {
        int n3;
        block5: {
            int n4;
            Object object;
            block4: {
                n3 = 1;
                try {
                    object = this.component3;
                    n4 = -1;
                    object = object.getSensorList(n4);
                    object = object.iterator();
                    break block4;
                }
                catch (Throwable throwable) {}
                String string2 = "registerListeners error";
                AFLogger.afErrorLogForExcManagerOnly(string2, throwable);
                break block5;
            }
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                Object object2 = object.next();
                object2 = (Sensor)object2;
                int n7 = object2.getType();
                if ((n7 = (int)(AFj1mSDK.AFAdRevenueData(n7) ? 1 : 0)) == 0) continue;
                Object object3 = this.component2;
                object3 = this.component4;
                AFj1nSDK aFj1nSDK = new AFj1nSDK((Sensor)object2, (ExecutorService)object3);
                boolean bl2 = object3.containsKey(aFj1nSDK);
                if (!bl2) {
                    object3 = this.component4;
                    object3.put(aFj1nSDK, aFj1nSDK);
                }
                object3 = this.component4;
                aFj1nSDK = object3.get(aFj1nSDK);
                aFj1nSDK = aFj1nSDK;
                object3 = this.component3;
                Handler handler = this.getCurrencyIso4217Code;
                object3.registerListener((SensorEventListener)aFj1nSDK, object2, n3, handler);
            }
        }
        this.hashCode = n3;
    }

    public final void AFAdRevenueData() {
        Handler handler = this.getCurrencyIso4217Code;
        ci0_0 ci0_02 = new ci0_0(this, 1);
        handler.post((Runnable)ci0_02);
    }

    public final Map getCurrencyIso4217Code() {
        ConcurrentHashMap<String, List> concurrentHashMap = new ConcurrentHashMap<String, List>();
        List list = this.component2();
        boolean bl2 = list.isEmpty();
        String string2 = "sensors";
        if (!bl2) {
            concurrentHashMap.put(string2, list);
        } else {
            list = this.component1();
            bl2 = list.isEmpty();
            if (!bl2) {
                concurrentHashMap.put(string2, list);
            }
        }
        return concurrentHashMap;
    }

    public final void getMediationNetwork() {
        Handler handler = this.getCurrencyIso4217Code;
        Runnable runnable2 = this.copydefault;
        handler.post(runnable2);
        handler = this.getCurrencyIso4217Code;
        runnable2 = this.getRevenue;
        handler.post(runnable2);
    }

    public final void getMonetizationNetwork() {
        Handler handler = this.getCurrencyIso4217Code;
        y y5 = new y(this, 0);
        handler.post((Runnable)y5);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getRevenue() {
        synchronized (this) {
            Handler handler = this.getCurrencyIso4217Code;
            Runnable runnable2 = this.copydefault;
            handler.post(runnable2);
            return;
        }
    }
}

