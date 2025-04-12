/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 */
package com.google.android.gms.appindexing;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

public class Thing$Builder {
    final Bundle zza;

    public Thing$Builder() {
        Bundle bundle;
        this.zza = bundle = new Bundle();
    }

    public Thing build() {
        Bundle bundle = this.zza;
        Thing thing = new Thing(bundle);
        return thing;
    }

    public Thing$Builder put(String string2, Thing thing) {
        Preconditions.checkNotNull(string2);
        if (thing != null) {
            Bundle bundle = this.zza;
            thing = thing.zza;
            bundle.putParcelable(string2, (Parcelable)thing);
        }
        return this;
    }

    public Thing$Builder put(String string2, String string3) {
        Preconditions.checkNotNull(string2);
        if (string3 != null) {
            Bundle bundle = this.zza;
            bundle.putString(string2, string3);
        }
        return this;
    }

    public Thing$Builder put(String string2, boolean bl2) {
        Preconditions.checkNotNull(string2);
        this.zza.putBoolean(string2, bl2);
        return this;
    }

    public Thing$Builder put(String string2, Thing[] bundle) {
        Preconditions.checkNotNull(string2);
        if (bundle != null) {
            Parcelable[] parcelableArray = new ArrayList();
            for (Thing thing : bundle) {
                if (thing == null) continue;
                thing = thing.zza;
                parcelableArray.add(thing);
            }
            bundle = this.zza;
            int n3 = parcelableArray.size();
            Bundle[] bundleArray = new Bundle[n3];
            parcelableArray = (Parcelable[])parcelableArray.toArray(bundleArray);
            bundle.putParcelableArray(string2, parcelableArray);
        }
        return this;
    }

    public Thing$Builder put(String string2, String[] stringArray) {
        Preconditions.checkNotNull(string2);
        if (stringArray != null) {
            Bundle bundle = this.zza;
            bundle.putStringArray(string2, stringArray);
        }
        return this;
    }

    public Thing$Builder setDescription(String string2) {
        this.put("description", string2);
        return this;
    }

    public Thing$Builder setId(String string2) {
        if (string2 != null) {
            String string3 = "id";
            this.put(string3, string2);
        }
        return this;
    }

    public Thing$Builder setName(String string2) {
        Preconditions.checkNotNull(string2);
        this.put("name", string2);
        return this;
    }

    public Thing$Builder setType(String string2) {
        this.put("type", string2);
        return this;
    }

    public Thing$Builder setUrl(Uri object) {
        Preconditions.checkNotNull(object);
        object = object.toString();
        this.put("url", (String)object);
        return this;
    }
}

