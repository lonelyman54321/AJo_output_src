/*
 * Decompiled with CFR 0.152.
 */
package com.appsflyer.internal;

import com.appsflyer.internal.AFe1aSDK$4;
import com.appsflyer.internal.AFe1dSDK;
import com.appsflyer.internal.AFe1eSDK;
import com.appsflyer.internal.AFf1dSDK;
import com.appsflyer.internal.AFf1zSDK;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.Intrinsics;

public final class AFe1aSDK {
    public Executor AFAdRevenueData;
    final Set areAllFieldsValid;
    final Set component1;
    final List component2;
    final NavigableSet component3;
    final NavigableSet component4;
    final ExecutorService getCurrencyIso4217Code;
    final Timer getMediationNetwork;
    final Set getMonetizationNetwork;
    public final List getRevenue;

    public AFe1aSDK(ExecutorService executorService) {
        Object object = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(object, "");
        this.AFAdRevenueData = object;
        this.getMediationNetwork = object = new Timer(true);
        object = new CopyOnWriteArrayList();
        this.getRevenue = object;
        this.getMonetizationNetwork = object;
        super();
        this.component1 = object = Collections.newSetFromMap(object);
        object = new ConcurrentSkipListSet();
        this.component3 = object;
        object = new ConcurrentSkipListSet();
        this.component4 = object;
        super();
        this.component2 = object;
        super();
        this.areAllFieldsValid = object = Collections.newSetFromMap(object);
        this.getCurrencyIso4217Code = executorService;
    }

    public static boolean getCurrencyIso4217Code(AFe1eSDK object) {
        AFf1zSDK aFf1zSDK;
        boolean bl2 = object instanceof AFf1dSDK;
        return !bl2 || (object = object.getMonetizationNetwork) != (aFf1zSDK = AFf1zSDK.AFInAppEventParameterName);
        {
        }
    }

    public final void getMediationNetwork(NavigableSet object) {
        boolean bl2;
        object = (AFe1eSDK)object.pollFirst();
        Object object2 = this.getMonetizationNetwork;
        Object object3 = ((AFe1eSDK)object).getMonetizationNetwork;
        object2.add(object3);
        object2 = this.getRevenue.iterator();
        while (bl2 = object2.hasNext()) {
            object3 = (AFe1dSDK)object2.next();
            object3.getMediationNetwork((AFe1eSDK)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void getMonetizationNetwork() {
        NavigableSet navigableSet = this.component3;
        synchronized (navigableSet) {
            Throwable throwable2;
            block5: {
                Object object;
                boolean bl2;
                Object object2;
                try {
                    boolean bl3;
                    object2 = this.component4;
                    object2 = object2.iterator();
                    bl2 = false;
                    object = null;
                    while (bl3 = object2.hasNext()) {
                        Object object3 = object2.next();
                        boolean bl4 = this.getRevenue((AFe1eSDK)(object3 = (AFe1eSDK)object3));
                        if (!bl4) continue;
                        object2.remove();
                        object = this.component3;
                        object.add(object3);
                        bl2 = true;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                if (bl2) {
                    object2 = this.getCurrencyIso4217Code;
                    object = new AFe1aSDK$4(this);
                    object2.submit((Runnable)object);
                }
                return;
            }
            throw throwable2;
        }
    }

    public final boolean getRevenue(AFe1eSDK object) {
        Set set = this.getMonetizationNetwork;
        object = ((AFe1eSDK)object).getRevenue;
        return set.containsAll((Collection<?>)object);
    }
}

