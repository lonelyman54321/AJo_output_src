/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.firebase.abt;

import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import com.google.firebase.analytics.connector.AnalyticsConnector$ConditionalUserProperty;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class AbtExperimentInfo {
    private static final String[] ALL_REQUIRED_KEYS = new String[]{"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};
    static final String EXPERIMENT_ID_KEY = "experimentId";
    static final String EXPERIMENT_START_TIME_KEY = "experimentStartTime";
    static final String TIME_TO_LIVE_KEY = "timeToLiveMillis";
    static final String TRIGGER_EVENT_KEY = "triggerEvent";
    static final String TRIGGER_TIMEOUT_KEY = "triggerTimeoutMillis";
    static final String VARIANT_ID_KEY = "variantId";
    static final DateFormat protoTimestampStringParser;
    private final String experimentId;
    private final Date experimentStartTime;
    private final long timeToLiveInMillis;
    private final String triggerEventName;
    private final long triggerTimeoutInMillis;
    private final String variantId;

    static {
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", locale);
        protoTimestampStringParser = simpleDateFormat;
    }

    public AbtExperimentInfo(String string2, String string3, String string4, Date date, long l2, long l3) {
        this.experimentId = string2;
        this.variantId = string3;
        this.triggerEventName = string4;
        this.experimentStartTime = date;
        this.triggerTimeoutInMillis = l2;
        this.timeToLiveInMillis = l3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static AbtExperimentInfo fromConditionalUserProperty(AnalyticsConnector$ConditionalUserProperty analyticsConnector$ConditionalUserProperty) {
        Object object = analyticsConnector$ConditionalUserProperty.triggerEventName;
        if (object == null) {
            object = "";
        }
        String string2 = object;
        String string3 = analyticsConnector$ConditionalUserProperty.name;
        String string4 = String.valueOf(analyticsConnector$ConditionalUserProperty.value);
        long l2 = analyticsConnector$ConditionalUserProperty.creationTimestamp;
        Date date = new Date(l2);
        l2 = analyticsConnector$ConditionalUserProperty.triggerTimeout;
        long l3 = analyticsConnector$ConditionalUserProperty.timeToLive;
        return new AbtExperimentInfo(string3, string4, string2, date, l2, l3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static AbtExperimentInfo fromMap(Map object) {
        ParseException parseException2;
        Object object2;
        block5: {
            NumberFormatException numberFormatException2;
            block4: {
                String string2;
                String string3;
                long l2;
                long l3;
                Date date;
                block3: {
                    object2 = TRIGGER_EVENT_KEY;
                    AbtExperimentInfo.validateExperimentInfoMap((Map)object);
                    try {
                        Object object3 = protoTimestampStringParser;
                        String string4 = EXPERIMENT_START_TIME_KEY;
                        string4 = object.get(string4);
                        date = ((DateFormat)object3).parse(string4);
                        object3 = TRIGGER_TIMEOUT_KEY;
                        object3 = object.get(object3);
                        object3 = (String)object3;
                        l3 = Long.parseLong((String)object3);
                        object3 = TIME_TO_LIVE_KEY;
                        object3 = object.get(object3);
                        object3 = (String)object3;
                        l2 = Long.parseLong((String)object3);
                        string4 = EXPERIMENT_ID_KEY;
                        string3 = string4 = object.get(string4);
                        string3 = string4;
                        string4 = VARIANT_ID_KEY;
                        string2 = string4 = object.get(string4);
                        string2 = string4;
                        boolean bl2 = object.containsKey(object2);
                        if (!bl2) break block3;
                        object = object.get(object2);
                        object = (String)object;
                        return new AbtExperimentInfo(string3, string2, (String)object, date, l3, l2);
                    }
                    catch (NumberFormatException numberFormatException2) {
                        break block4;
                    }
                    catch (ParseException parseException2) {
                        break block5;
                    }
                }
                object = "";
                return new AbtExperimentInfo(string3, string2, (String)object, date, l3, l2);
            }
            object2 = new AbtException("Could not process experiment: one of the durations could not be converted into a long.", numberFormatException2);
            throw object2;
        }
        object2 = new AbtException("Could not process experiment: parsing experiment start time failed.", parseException2);
        throw object2;
    }

    public static void validateAbtExperimentInfo(AbtExperimentInfo abtExperimentInfo) {
        AbtExperimentInfo.validateExperimentInfoMap(abtExperimentInfo.toStringMap());
    }

    private static void validateExperimentInfoMap(Map object) {
        int n3 = 1;
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = ALL_REQUIRED_KEYS;
        int n4 = stringArray.length;
        for (int i3 = 0; i3 < n4; i3 += n3) {
            String string2 = stringArray[i3];
            boolean bl2 = object.containsKey(string2);
            if (bl2) continue;
            arrayList.add(string2);
        }
        boolean bl3 = arrayList.isEmpty();
        if (bl3) {
            return;
        }
        Object object2 = new Object[n3];
        object2[0] = arrayList;
        object2 = String.format("The following keys are missing from the experiment info map: %s", object2);
        object = new AbtException((String)object2);
        throw object;
    }

    public String getExperimentId() {
        return this.experimentId;
    }

    public long getStartTimeInMillisSinceEpoch() {
        return this.experimentStartTime.getTime();
    }

    public long getTimeToLiveInMillis() {
        return this.timeToLiveInMillis;
    }

    public String getTriggerEventName() {
        return this.triggerEventName;
    }

    public long getTriggerTimeoutInMillis() {
        return this.triggerTimeoutInMillis;
    }

    public String getVariantId() {
        return this.variantId;
    }

    public AnalyticsConnector$ConditionalUserProperty toConditionalUserProperty(String string2) {
        long l2;
        AnalyticsConnector$ConditionalUserProperty analyticsConnector$ConditionalUserProperty = new AnalyticsConnector$ConditionalUserProperty();
        analyticsConnector$ConditionalUserProperty.origin = string2;
        analyticsConnector$ConditionalUserProperty.creationTimestamp = l2 = this.getStartTimeInMillisSinceEpoch();
        analyticsConnector$ConditionalUserProperty.name = string2 = this.experimentId;
        string2 = this.variantId;
        analyticsConnector$ConditionalUserProperty.value = string2;
        string2 = this.triggerEventName;
        boolean bl2 = TextUtils.isEmpty((CharSequence)string2);
        if (bl2) {
            bl2 = false;
            string2 = null;
        } else {
            string2 = this.triggerEventName;
        }
        analyticsConnector$ConditionalUserProperty.triggerEventName = string2;
        analyticsConnector$ConditionalUserProperty.triggerTimeout = l2 = this.triggerTimeoutInMillis;
        analyticsConnector$ConditionalUserProperty.timeToLive = l2 = this.timeToLiveInMillis;
        return analyticsConnector$ConditionalUserProperty;
    }

    public Map toStringMap() {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        Object object = this.experimentId;
        hashMap.put(EXPERIMENT_ID_KEY, object);
        object = this.variantId;
        hashMap.put(VARIANT_ID_KEY, object);
        object = this.triggerEventName;
        hashMap.put(TRIGGER_EVENT_KEY, object);
        Object object2 = protoTimestampStringParser;
        object = this.experimentStartTime;
        object2 = ((DateFormat)object2).format((Date)object);
        hashMap.put(EXPERIMENT_START_TIME_KEY, object2);
        object2 = Long.toString(this.triggerTimeoutInMillis);
        hashMap.put(TRIGGER_TIMEOUT_KEY, object2);
        object2 = Long.toString(this.timeToLiveInMillis);
        hashMap.put(TIME_TO_LIVE_KEY, object2);
        return hashMap;
    }
}

