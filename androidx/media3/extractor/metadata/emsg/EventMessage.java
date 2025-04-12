/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.media3.extractor.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata$Entry;
import androidx.media3.common.d;
import androidx.media3.common.d$a;
import androidx.media3.common.e$a;
import java.util.Arrays;
import java.util.Objects;

public final class EventMessage
implements Metadata$Entry {
    public static final Parcelable.Creator CREATOR;
    public static final d g;
    public static final d h;
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final byte[] e;
    public int f;

    static {
        String string2;
        Object object = new d$a();
        ((d$a)object).n = string2 = ip1_0.l("application/id3");
        g = ((d$a)object).a();
        object = new d$a();
        ((d$a)object).n = string2 = ip1_0.l("application/x-scte35");
        h = ((d$a)object).a();
        object = new Object();
        CREATOR = object;
    }

    public EventMessage(Parcel object) {
        long l2;
        String string2 = object.readString();
        this.a = string2;
        this.b = string2 = object.readString();
        this.c = l2 = object.readLong();
        this.d = l2 = object.readLong();
        object = object.createByteArray();
        this.e = (byte[])object;
    }

    public EventMessage(String string2, String string3, long l2, long l3, byte[] byArray) {
        this.a = string2;
        this.b = string3;
        this.c = l2;
        this.d = l3;
        this.e = byArray;
    }

    public final d d() {
        String string2 = this.a;
        string2.getClass();
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 1303648457: {
                String string3 = "https://developer.apple.com/streaming/emsg-id3";
                boolean bl2 = string2.equals(string3);
                if (!bl2) break;
                n3 = 2;
                break;
            }
            case -795945609: {
                String string4 = "https://aomedia.org/emsg/ID3";
                boolean bl3 = string2.equals(string4);
                if (!bl3) break;
                n3 = 1;
                break;
            }
            case -1468477611: {
                String string5 = "urn:scte:scte35:2014:bin";
                boolean bl4 = string2.equals(string5);
                if (!bl4) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return null;
            }
            case 1: 
            case 2: {
                return g;
            }
            case 0: 
        }
        return h;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    boolean bl3;
                    long l2;
                    Object object2;
                    Object object3;
                    bl2 = true;
                    if (this == object) {
                        return bl2;
                    }
                    if (object == null || (object3 = EventMessage.class) != (object2 = object.getClass())) break block4;
                    object = (EventMessage)object;
                    long l3 = this.c;
                    long l4 = ((EventMessage)object).c;
                    long l7 = l3 - l4;
                    Object object4 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    if (object4 != false || (object4 = (l2 = (l3 = this.d) - (l4 = ((EventMessage)object).d)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) break block5;
                    int n3 = gz3.a;
                    object2 = this.a;
                    object3 = ((EventMessage)object).a;
                    n3 = (int)(Objects.equals(object2, object3) ? 1 : 0);
                    if (n3 != 0 && (n3 = (int)(Objects.equals(object2 = this.b, object3 = ((EventMessage)object).b) ? 1 : 0)) != 0 && (bl3 = Arrays.equals((byte[])(object2 = (Object)this.e), (byte[])(object = (Object)((EventMessage)object).e)))) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.f;
        if (n3 == 0) {
            int n4;
            n3 = 0;
            byte[] byArray = null;
            String string2 = this.a;
            if (string2 != null) {
                n4 = string2.hashCode();
            } else {
                n4 = 0;
                string2 = null;
            }
            int n7 = (527 + n4) * 31;
            string2 = this.b;
            if (string2 != null) {
                n3 = string2.hashCode();
            }
            n7 = (n7 + n3) * 31;
            long l2 = this.c;
            int n8 = 32;
            long l3 = l2 >>> n8;
            n4 = (int)(l2 ^ l3);
            n7 = (n7 + n4) * 31;
            l2 = this.d;
            long l4 = l2 >>> n8;
            n4 = (int)(l2 ^= l4);
            n7 = (n7 + n4) * 31;
            byArray = this.e;
            this.f = n3 = Arrays.hashCode(byArray) + n7;
        }
        return this.f;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("EMSG: scheme=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", id=");
        long l2 = this.d;
        stringBuilder.append(l2);
        stringBuilder.append(", durationMs=");
        l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(", value=");
        string2 = this.b;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public final /* synthetic */ void u(e$a e$a) {
    }

    public final byte[] w() {
        Object object = this.d();
        object = object != null ? (Object)this.e : null;
        return object;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.a;
        parcel.writeString((String)object);
        object = this.b;
        parcel.writeString((String)object);
        long l2 = this.c;
        parcel.writeLong(l2);
        l2 = this.d;
        parcel.writeLong(l2);
        object = this.e;
        parcel.writeByteArray((byte[])object);
    }
}

