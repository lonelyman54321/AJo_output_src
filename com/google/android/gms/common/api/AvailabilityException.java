/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public class AvailabilityException
extends Exception {
    private final Jp zaa;

    public AvailabilityException(Jp jp) {
        this.zaa = jp;
    }

    public ConnectionResult getConnectionResult(GoogleApi object) {
        boolean bl2;
        Object object2 = this.zaa;
        object = ((GoogleApi)object).getApiKey();
        object2 = ((a53)object2).get(object);
        String string2 = ((ApiKey)object).zaa();
        String string3 = "The given API (";
        String string4 = ") was not part of the availability request.";
        string2 = cP.a(string3, string2, string4);
        if (object2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        Preconditions.checkArgument(bl2, string2);
        return (ConnectionResult)Preconditions.checkNotNull((ConnectionResult)this.zaa.get(object));
    }

    public ConnectionResult getConnectionResult(HasApiKey object) {
        boolean bl2;
        Object object2 = this.zaa;
        object = object.getApiKey();
        object2 = ((a53)object2).get(object);
        String string2 = ((ApiKey)object).zaa();
        String string3 = "The given API (";
        String string4 = ") was not part of the availability request.";
        string2 = cP.a(string3, string2, string4);
        if (object2 != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object2 = null;
        }
        Preconditions.checkArgument(bl2, string2);
        return (ConnectionResult)Preconditions.checkNotNull((ConnectionResult)this.zaa.get(object));
    }

    public String getMessage() {
        boolean bl2;
        Object object = new ArrayList();
        Object object2 = ((Jp$c)this.zaa.keySet()).iterator();
        boolean bl3 = true;
        boolean bl4 = true;
        while (bl2 = object2.hasNext()) {
            Object object3 = (ApiKey)object2.next();
            Object object4 = (ConnectionResult)Preconditions.checkNotNull((ConnectionResult)this.zaa.get(object3));
            boolean bl5 = ((ConnectionResult)object4).isSuccess() ^ bl3;
            bl4 &= bl5;
            object3 = ((ApiKey)object3).zaa();
            object4 = String.valueOf(object4);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((String)object3);
            stringBuilder.append(": ");
            stringBuilder.append((String)object4);
            object3 = stringBuilder.toString();
            ((ArrayList)object).add(object3);
        }
        object2 = new StringBuilder();
        if (bl4) {
            String string2 = "None of the queried APIs are available. ";
            ((StringBuilder)object2).append(string2);
        } else {
            String string3 = "Some of the queried APIs are unavailable. ";
            ((StringBuilder)object2).append(string3);
        }
        object = TextUtils.join((CharSequence)"; ", object);
        ((StringBuilder)object2).append((String)object);
        return ((StringBuilder)object2).toString();
    }
}

