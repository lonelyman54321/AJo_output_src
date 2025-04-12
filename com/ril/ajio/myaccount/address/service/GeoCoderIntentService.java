/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.IntentService
 *  android.content.Context
 *  android.content.Intent
 *  android.location.Address
 *  android.location.Geocoder
 *  android.location.Location
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.ResultReceiver
 */
package com.ril.ajio.myaccount.address.service;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import java.io.IOException;
import java.util.Locale;

public class GeoCoderIntentService
extends IntentService {
    public final Geocoder a;
    public ResultReceiver b;

    public GeoCoderIntentService() {
        super("GeoCoderIntentService");
        Geocoder geocoder = this.a;
        if (geocoder == null) {
            AJIOApplication.Companion.getClass();
            AJIOApplication aJIOApplication = AJIOApplication$a.a();
            Locale locale = Locale.getDefault();
            this.a = geocoder = new Geocoder((Context)aJIOApplication, locale);
        }
    }

    public final void onHandleIntent(Intent object) {
        int n3;
        Object object2;
        if (object == null) {
            return;
        }
        Object object3 = (Location)object.getParcelableExtra("com.ril.ajio.view.myaccount.address.LOCATION_DATA_EXTRA");
        this.b = object2 = (ResultReceiver)object.getParcelableExtra("com.ril.ajio.view.myaccount.address.RECEIVER");
        object2 = "SCREEN_NAME";
        object = object.getStringExtra((String)object2);
        object2 = this.a;
        double d2 = object3.getLatitude();
        double d5 = object3.getLongitude();
        int n4 = 1;
        try {
            object3 = object2.getFromLocation(d2, d5, n4);
        }
        catch (IOException | IllegalArgumentException exception) {
            object3 = null;
        }
        if (object3 != null && (n3 = object3.size()) != 0) {
            object = null;
            if ((object3 = (Address)object3.get(0)) != null) {
                object2 = new Bundle();
                String string2 = "com.ril.ajio.view.myaccount.addressRESULT_DATA_KEY";
                object2.putParcelable(string2, (Parcelable)object3);
                object3 = this.b;
                object3.send(0, (Bundle)object2);
            }
        } else {
            object3 = AnalyticsManager.getInstance().getGtmEvents();
            object2 = "Auto_fill_location_API_error";
            ((GTMEvents)object3).pushButtonTapEvent((String)object2, object2, (String)object);
        }
    }
}

