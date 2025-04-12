/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.images.zah;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.io.Serializable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class WebImage
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    final int zaa;
    private final Uri zab;
    private final int zac;
    private final int zad;

    static {
        zah zah2 = new zah();
        CREATOR = zah2;
    }

    public WebImage(int n3, Uri uri, int n4, int n7) {
        this.zaa = n3;
        this.zab = uri;
        this.zac = n4;
        this.zad = n7;
    }

    public WebImage(Uri uri) {
        this(uri, 0, 0);
    }

    public WebImage(Uri object, int n3, int n4) {
        int n7 = 1;
        this(n7, (Uri)object, n3, n4);
        if (object != null) {
            if (n3 >= 0 && n4 >= 0) {
                return;
            }
            super("width and height must not be negative");
            throw object;
        }
        super("url cannot be null");
        throw object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public WebImage(JSONObject jSONObject) {
        Uri uri = Uri.EMPTY;
        String string2 = "url";
        boolean bl2 = jSONObject.has(string2);
        if (bl2) {
            try {
                string2 = jSONObject.getString(string2);
                uri = Uri.parse((String)string2);
            }
            catch (JSONException jSONException) {}
        }
        int n3 = jSONObject.optInt("width", 0);
        int n4 = jSONObject.optInt("height", 0);
        this(uri, n3, n4);
    }

    public boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (n3 = object instanceof WebImage) != 0) {
            int n4;
            int n7;
            object = (WebImage)object;
            Uri uri = this.zab;
            Uri uri2 = ((WebImage)object).zab;
            n3 = Objects.equal(uri, uri2);
            if (n3 != 0 && (n3 = this.zac) == (n7 = ((WebImage)object).zac) && (n3 = this.zad) == (n4 = ((WebImage)object).zad)) {
                return bl2;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.zad;
    }

    public Uri getUrl() {
        return this.zab;
    }

    public int getWidth() {
        return this.zac;
    }

    public int hashCode() {
        Uri uri = this.zab;
        Integer n3 = this.zac;
        Integer n4 = this.zad;
        Object[] objectArray = new Object[]{uri, n3, n4};
        return Objects.hashCode(objectArray);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JSONObject toJson() {
        Uri uri;
        JSONObject jSONObject = new JSONObject();
        String string2 = "url";
        try {
            uri = this.zab;
        }
        catch (JSONException jSONException) {
            return jSONObject;
        }
        String string3 = uri.toString();
        jSONObject.put(string2, (Object)string3);
        string2 = "width";
        int n3 = this.zac;
        jSONObject.put(string2, n3);
        string2 = "height";
        n3 = this.zad;
        jSONObject.put(string2, n3);
        return jSONObject;
    }

    public String toString() {
        Serializable serializable = Locale.US;
        int n3 = this.zac;
        int n4 = this.zad;
        String string2 = this.zab.toString();
        serializable = fQ2.a("Image ", "x", " ", n3, n4);
        ((StringBuilder)serializable).append(string2);
        return ((StringBuilder)serializable).toString();
    }

    public void writeToParcel(Parcel parcel, int n3) {
        int n4 = this.zaa;
        int n7 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n4);
        Uri uri = this.getUrl();
        SafeParcelWriter.writeParcelable(parcel, 2, (Parcelable)uri, n3, false);
        n4 = this.getWidth();
        SafeParcelWriter.writeInt(parcel, 3, n4);
        n4 = this.getHeight();
        SafeParcelWriter.writeInt(parcel, 4, n4);
        SafeParcelWriter.finishObjectHeader(parcel, n7);
    }
}

