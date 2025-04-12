/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.abt;

import android.content.Context;
import com.google.firebase.abt.AbtException;
import com.google.firebase.abt.AbtExperimentInfo;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnector$ConditionalUserProperty;
import com.google.firebase.inject.Provider;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class FirebaseABTesting {
    static final String ABT_PREFERENCES = "com.google.firebase.abt";
    static final String ORIGIN_LAST_KNOWN_START_TIME_KEY_FORMAT = "%s_lastKnownExperimentStartTime";
    private final Provider analyticsConnector;
    private Integer maxUserProperties;
    private final String originService;

    public FirebaseABTesting(Context context, Provider provider, String string2) {
        this.analyticsConnector = provider;
        this.originService = string2;
        this.maxUserProperties = null;
    }

    private void addExperimentToAnalytics(AnalyticsConnector$ConditionalUserProperty analyticsConnector$ConditionalUserProperty) {
        ((AnalyticsConnector)this.analyticsConnector.get()).setConditionalUserProperty(analyticsConnector$ConditionalUserProperty);
    }

    private void addExperiments(List object) {
        boolean bl2;
        List list = this.getAllExperimentsInAnalytics();
        ArrayDeque<Object> arrayDeque = new ArrayDeque<Object>(list);
        int n3 = this.getMaxUserPropertiesInAnalytics();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2;
            int n4;
            Object object2 = (AbtExperimentInfo)object.next();
            while ((n4 = arrayDeque.size()) >= n3) {
                string2 = ((AnalyticsConnector$ConditionalUserProperty)arrayDeque.pollFirst()).name;
                this.removeExperimentFromAnalytics(string2);
            }
            string2 = this.originService;
            object2 = ((AbtExperimentInfo)object2).toConditionalUserProperty(string2);
            this.addExperimentToAnalytics((AnalyticsConnector$ConditionalUserProperty)object2);
            arrayDeque.offer(object2);
        }
    }

    private static List convertMapsToExperimentInfos(List object) {
        boolean bl2;
        ArrayList<AbtExperimentInfo> arrayList = new ArrayList<AbtExperimentInfo>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = AbtExperimentInfo.fromMap((Map)object.next());
            arrayList.add(abtExperimentInfo);
        }
        return arrayList;
    }

    private boolean experimentsListContainsExperiment(List object, AbtExperimentInfo object2) {
        boolean bl2;
        String string2 = ((AbtExperimentInfo)object2).getExperimentId();
        object2 = ((AbtExperimentInfo)object2).getVariantId();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object3 = (AbtExperimentInfo)object.next();
            String string3 = ((AbtExperimentInfo)object3).getExperimentId();
            boolean bl3 = string3.equals(string2);
            if (!bl3 || !(bl2 = ((String)(object3 = ((AbtExperimentInfo)object3).getVariantId())).equals(object2))) continue;
            return true;
        }
        return false;
    }

    private List getAllExperimentsInAnalytics() {
        AnalyticsConnector analyticsConnector = (AnalyticsConnector)this.analyticsConnector.get();
        String string2 = this.originService;
        return analyticsConnector.getConditionalUserProperties(string2, "");
    }

    private ArrayList getExperimentsToAdd(List object, List list) {
        boolean bl2;
        ArrayList<AbtExperimentInfo> arrayList = new ArrayList<AbtExperimentInfo>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo)object.next();
            boolean bl3 = this.experimentsListContainsExperiment(list, abtExperimentInfo);
            if (bl3) continue;
            arrayList.add(abtExperimentInfo);
        }
        return arrayList;
    }

    private ArrayList getExperimentsToRemove(List object, List list) {
        boolean bl2;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            Object object2 = (AbtExperimentInfo)object.next();
            boolean bl3 = this.experimentsListContainsExperiment(list, (AbtExperimentInfo)object2);
            if (bl3) continue;
            String string2 = this.originService;
            object2 = ((AbtExperimentInfo)object2).toConditionalUserProperty(string2);
            arrayList.add(object2);
        }
        return arrayList;
    }

    private int getMaxUserPropertiesInAnalytics() {
        Object object = this.maxUserProperties;
        if (object == null) {
            object = (AnalyticsConnector)this.analyticsConnector.get();
            String string2 = this.originService;
            int n3 = object.getMaxUserProperties(string2);
            this.maxUserProperties = object = Integer.valueOf(n3);
        }
        return this.maxUserProperties;
    }

    private void removeExperimentFromAnalytics(String string2) {
        ((AnalyticsConnector)this.analyticsConnector.get()).clearConditionalUserProperty(string2, null, null);
    }

    private void removeExperiments(Collection object) {
        boolean bl2;
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            String string2 = ((AnalyticsConnector$ConditionalUserProperty)object.next()).name;
            this.removeExperimentFromAnalytics(string2);
        }
    }

    private void replaceAllExperimentsWith(List list) {
        boolean bl2 = list.isEmpty();
        if (bl2) {
            this.removeAllExperiments();
            return;
        }
        List list2 = this.getAllExperiments();
        ArrayList arrayList = this.getExperimentsToRemove(list2, list);
        this.removeExperiments(arrayList);
        list = this.getExperimentsToAdd(list, list2);
        this.addExperiments(list);
    }

    private void throwAbtExceptionIfAnalyticsIsNull() {
        Object object = this.analyticsConnector.get();
        if (object != null) {
            return;
        }
        object = new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        throw object;
    }

    public List getAllExperiments() {
        boolean bl2;
        this.throwAbtExceptionIfAnalyticsIsNull();
        Object object = this.getAllExperimentsInAnalytics();
        ArrayList<AbtExperimentInfo> arrayList = new ArrayList<AbtExperimentInfo>();
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = AbtExperimentInfo.fromConditionalUserProperty((AnalyticsConnector$ConditionalUserProperty)object.next());
            arrayList.add(abtExperimentInfo);
        }
        return arrayList;
    }

    public void removeAllExperiments() {
        this.throwAbtExceptionIfAnalyticsIsNull();
        List list = this.getAllExperimentsInAnalytics();
        this.removeExperiments(list);
    }

    public void replaceAllExperiments(List object) {
        this.throwAbtExceptionIfAnalyticsIsNull();
        if (object != null) {
            object = FirebaseABTesting.convertMapsToExperimentInfos((List)object);
            this.replaceAllExperimentsWith((List)object);
            return;
        }
        object = new IllegalArgumentException("The replacementExperiments list is null.");
        throw object;
    }

    public void reportActiveExperiment(AbtExperimentInfo object) {
        this.throwAbtExceptionIfAnalyticsIsNull();
        AbtExperimentInfo.validateAbtExperimentInfo((AbtExperimentInfo)object);
        ArrayList<Object> arrayList = new ArrayList<Object>();
        object = ((AbtExperimentInfo)object).toStringMap();
        object.remove("triggerEvent");
        object = AbtExperimentInfo.fromMap((Map)object);
        arrayList.add(object);
        this.addExperiments(arrayList);
    }

    public void validateRunningExperiments(List list) {
        this.throwAbtExceptionIfAnalyticsIsNull();
        List list2 = this.getAllExperiments();
        list = this.getExperimentsToRemove(list2, list);
        this.removeExperiments(list);
    }
}

