/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.events;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$LogLevel;
import com.jio.retargeting.data.CustomerDetails;
import com.jio.retargeting.datastore.RetargetPref;
import com.jio.retargeting.events.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

public class AppLaunchEvent
extends a {
    private CopyOnWriteArrayList customerDetailsList;

    public AppLaunchEvent() {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.customerDetailsList = copyOnWriteArrayList = new CopyOnWriteArrayList();
    }

    public AppLaunchEvent(AppLaunchEvent object) {
        super((a)object);
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.customerDetailsList = copyOnWriteArrayList = new CopyOnWriteArrayList();
        object = ((AppLaunchEvent)object).getCustomerDetailsList();
        this.setCustomerDetailsList((Iterable)object);
    }

    public AppLaunchEvent(Iterable iterable) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        this.customerDetailsList = copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.setCustomerDetailsList(iterable);
    }

    public AppLaunchEvent(CustomerDetails ... object) {
        List list;
        this.customerDetailsList = list = new List();
        object = Arrays.asList(object);
        super(object);
        this.setCustomerDetailsList(list);
    }

    private CopyOnWriteArrayList makeCartProducts(Iterable object) {
        boolean bl2;
        CopyOnWriteArrayList<CustomerDetails> copyOnWriteArrayList = new CopyOnWriteArrayList<CustomerDetails>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (CustomerDetails)object.next();
            int n3 = ((CustomerDetails)object2).getType();
            String string2 = ((CustomerDetails)object2).getIdValue();
            object2 = ((CustomerDetails)object2).getHashMethod();
            CustomerDetails customerDetails = new CustomerDetails(n3, string2, (String)object2);
            copyOnWriteArrayList.add(customerDetails);
        }
        return copyOnWriteArrayList;
    }

    public CopyOnWriteArrayList getCustomerDetailsList() {
        return this.customerDetailsList;
    }

    public boolean isFirstLaunch() {
        RetargetPref retargetPref = RetargetPref.INSTANCE;
        int n3 = retargetPref.isFirstLaunch();
        if (n3 == 0) {
            return retargetPref.editSharedPref("firstLaunch", 1);
        }
        return false;
    }

    public void setCustomerDetailsList(Iterable object) {
        if (object == null) {
            Intrinsics.checkNotNullParameter("Argument customerDetailsList must not be null", "message");
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
            object = JioAds$LogLevel.NONE;
            return;
        }
        object = this.makeCartProducts((Iterable)object);
        this.customerDetailsList = object;
    }

    public void setCustomerDetailsList(CustomerDetails ... object) {
        object = Arrays.asList(object);
        ArrayList arrayList = new ArrayList(object);
        this.setCustomerDetailsList(arrayList);
    }
}

