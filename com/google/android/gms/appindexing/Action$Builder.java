/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 */
package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.appindexing.Thing$Builder;
import com.google.android.gms.common.internal.Preconditions;

public final class Action$Builder
extends Thing$Builder {
    public Action$Builder(String string2) {
        Preconditions.checkNotNull(string2);
        super.put("type", string2);
    }

    public Action build() {
        Object object = this.zza;
        Object object2 = "object";
        Preconditions.checkNotNull(object.get((String)object2), "setObject is required before calling build().");
        object = this.zza.get("type");
        String string2 = "setType is required before calling build().";
        Preconditions.checkNotNull(object, string2);
        object = (Bundle)this.zza.getParcelable((String)object2);
        if (object != null) {
            object2 = object.get("name");
            string2 = "Must call setObject() with a valid name. Example: setObject(new Thing.Builder().setName(name).setUrl(url))";
            Preconditions.checkNotNull(object2, string2);
            object = object.get("url");
            object2 = "Must call setObject() with a valid app URI. Example: setObject(new Thing.Builder().setName(name).setUrl(url))";
            Preconditions.checkNotNull(object, object2);
        }
        object2 = this.zza;
        object = new Action((Bundle)object2, null);
        return object;
    }

    public Action$Builder put(String string2, Thing thing) {
        super.put(string2, thing);
        return this;
    }

    public Action$Builder put(String string2, String string3) {
        super.put(string2, string3);
        return this;
    }

    public Action$Builder put(String string2, boolean bl2) {
        super.put(string2, bl2);
        return this;
    }

    public Action$Builder put(String string2, Thing[] thingArray) {
        super.put(string2, thingArray);
        return this;
    }

    public Action$Builder put(String string2, String[] stringArray) {
        super.put(string2, stringArray);
        return this;
    }

    public Action$Builder setActionStatus(String string2) {
        Preconditions.checkNotNull(string2);
        super.put("actionStatus", string2);
        return this;
    }

    public Action$Builder setName(String string2) {
        super.put("name", string2);
        return this;
    }

    public Action$Builder setObject(Thing thing) {
        Preconditions.checkNotNull(thing);
        super.put("object", thing);
        return this;
    }

    public Action$Builder setUrl(Uri object) {
        if (object != null) {
            String string2 = "url";
            object = object.toString();
            super.put(string2, (String)object);
        }
        return this;
    }
}

