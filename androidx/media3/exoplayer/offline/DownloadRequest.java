/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.media3.exoplayer.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.StreamKey;
import androidx.media3.exoplayer.offline.DownloadRequest$a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class DownloadRequest
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final Uri b;
    public final String c;
    public final List d;
    public final byte[] e;
    public final String f;
    public final byte[] g;

    static {
        DownloadRequest$a downloadRequest$a = new Object();
        CREATOR = downloadRequest$a;
    }

    public DownloadRequest(Parcel object) {
        Object object2 = object.readString();
        this.a = object2;
        object2 = Uri.parse((String)object.readString());
        this.b = object2;
        object2 = object.readString();
        this.c = object2;
        int n3 = object.readInt();
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object3 = StreamKey.class.getClassLoader();
            object3 = (StreamKey)object.readParcelable((ClassLoader)object3);
            arrayList.add(object3);
        }
        this.d = object2 = Collections.unmodifiableList(arrayList);
        object2 = object.createByteArray();
        this.e = (byte[])object2;
        this.f = object2 = object.readString();
        object = object.createByteArray();
        this.g = (byte[])object;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean n3 = object instanceof DownloadRequest;
        boolean bl3 = false;
        if (!n3) {
            return false;
        }
        object = (DownloadRequest)object;
        Object object2 = this.a;
        Object object3 = ((DownloadRequest)object).a;
        boolean bl4 = ((String)object2).equals(object3);
        if (bl4 && (bl2 = (object3 = this.b).equals(object2 = ((DownloadRequest)object).b))) {
            boolean bl5;
            boolean bl6;
            boolean bl7;
            boolean bl8;
            int n4 = gz3.a;
            object3 = this.c;
            object2 = ((DownloadRequest)object).c;
            boolean bl9 = Objects.equals(object3, object2);
            if (bl9 && (bl8 = (object3 = this.d).equals(object2 = ((DownloadRequest)object).d)) && (bl7 = Arrays.equals((byte[])(object3 = (Object)this.e), (byte[])(object2 = (Object)((DownloadRequest)object).e))) && (bl6 = Objects.equals(object3 = this.f, object2 = ((DownloadRequest)object).f)) && (bl5 = Arrays.equals((byte[])(object3 = (Object)this.g), (byte[])(object = (Object)((DownloadRequest)object).g)))) {
                bl3 = true;
            }
        }
        return bl3;
    }

    public final int hashCode() {
        int n3;
        int n4 = this.a.hashCode() * 961;
        Object object = this.b;
        int n7 = (object.hashCode() + n4) * 31;
        n4 = 0;
        String string2 = this.c;
        if (string2 != null) {
            n3 = string2.hashCode();
        } else {
            n3 = 0;
            string2 = null;
        }
        n7 = (n7 + n3) * 31;
        n3 = (this.d.hashCode() + n7) * 31;
        object = this.e;
        n7 = (Arrays.hashCode((byte[])object) + n3) * 31;
        string2 = this.f;
        if (string2 != null) {
            n4 = string2.hashCode();
        }
        n7 = (n7 + n4) * 31;
        return Arrays.hashCode(this.g) + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.c;
        stringBuilder.append(string2);
        stringBuilder.append(":");
        string2 = this.a;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        int n4;
        Object object = this.a;
        parcel.writeString((String)object);
        object = this.b.toString();
        parcel.writeString((String)object);
        object = this.c;
        parcel.writeString((String)object);
        object = this.d;
        int n7 = object.size();
        parcel.writeInt(n7);
        n7 = 0;
        for (int i3 = 0; i3 < (n4 = object.size()); ++i3) {
            Parcelable parcelable = (Parcelable)object.get(i3);
            parcel.writeParcelable(parcelable, 0);
        }
        object = this.e;
        parcel.writeByteArray((byte[])object);
        object = this.f;
        parcel.writeString((String)object);
        object = this.g;
        parcel.writeByteArray((byte[])object);
    }
}

