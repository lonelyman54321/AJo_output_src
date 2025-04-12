/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.text.TextUtils
 */
package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.BackStackRecordState$a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.k;
import androidx.fragment.app.k$a;
import androidx.lifecycle.i$b;
import java.util.ArrayList;
import java.util.List;

final class BackStackRecordState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final int[] a;
    public final ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final String f;
    public final int g;
    public final int h;
    public final CharSequence i;
    public final int j;
    public final CharSequence k;
    public final ArrayList l;
    public final ArrayList m;
    public final boolean n;

    static {
        BackStackRecordState$a backStackRecordState$a = new Object();
        CREATOR = backStackRecordState$a;
    }

    public BackStackRecordState(Parcel parcel) {
        int n3;
        CharSequence charSequence;
        int n4;
        Object object = parcel.createIntArray();
        this.a = object;
        object = parcel.createStringArrayList();
        this.b = object;
        object = parcel.createIntArray();
        this.c = object;
        object = parcel.createIntArray();
        this.d = object;
        this.e = n4 = parcel.readInt();
        object = parcel.readString();
        this.f = object;
        this.g = n4 = parcel.readInt();
        this.h = n4 = parcel.readInt();
        object = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.i = charSequence = (CharSequence)object.createFromParcel(parcel);
        this.j = n3 = parcel.readInt();
        object = (CharSequence)object.createFromParcel(parcel);
        this.k = object;
        object = parcel.createStringArrayList();
        this.l = object;
        object = parcel.createStringArrayList();
        this.m = object;
        int n7 = parcel.readInt();
        if (n7 != 0) {
            n7 = 1;
        } else {
            n7 = 0;
            parcel = null;
        }
        this.n = n7;
    }

    public BackStackRecordState(a object) {
        Object object2 = ((k)object).a;
        int n3 = ((ArrayList)object2).size();
        Object object3 = new int[n3 * 6];
        this.a = object3;
        int n4 = ((k)object).g;
        if (n4 != 0) {
            boolean bl2;
            object3 = new ArrayList;
            super(n3);
            this.b = object3;
            object3 = new int[n3];
            this.c = object3;
            object3 = new int[n3];
            this.d = object3;
            object3 = null;
            int n7 = 0;
            for (n4 = 0; n4 < n3; ++n4) {
                int n8;
                int n10;
                Object object4 = (k$a)((k)object).a.get(n4);
                Object object5 = this.a;
                int n14 = n7 + 1;
                object5[n7] = n10 = ((k$a)object4).a;
                object5 = this.b;
                Object object6 = ((k$a)object4).b;
                if (object6 != null) {
                    object6 = ((Fragment)object6).mWho;
                } else {
                    n10 = 0;
                    object6 = null;
                }
                object5.add(object6);
                object5 = this.a;
                n10 = n7 + 2;
                int n15 = ((k$a)object4).c;
                object5[n14] = n15;
                n14 = n7 + 3;
                object5[n10] = n15 = ((k$a)object4).d;
                n10 = n7 + 4;
                object5[n14] = n15 = ((k$a)object4).e;
                n14 = n7 + 5;
                object5[n10] = n15 = ((k$a)object4).f;
                n7 += 6;
                object5[n14] = n10 = ((k$a)object4).g;
                object5 = this.c;
                i$b i$b = ((k$a)object4).h;
                object5[n4] = n14 = i$b.ordinal();
                object5 = this.d;
                object4 = ((k$a)object4).i;
                object5[n4] = n8 = ((Enum)object4).ordinal();
            }
            this.e = n3 = ((k)object).f;
            this.f = object2 = ((k)object).i;
            this.g = n3 = ((a)object).t;
            this.h = n3 = ((k)object).j;
            this.i = object2 = ((k)object).k;
            this.j = n3 = ((k)object).l;
            this.k = object2 = ((k)object).m;
            this.l = object2 = ((k)object).n;
            this.m = object2 = ((k)object).o;
            this.n = bl2 = ((k)object).p;
            return;
        }
        object = new IllegalStateException("Not on back stack");
        throw object;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        Object object = this.a;
        parcel.writeIntArray(object);
        object = this.b;
        parcel.writeStringList((List)object);
        object = this.c;
        parcel.writeIntArray(object);
        object = this.d;
        parcel.writeIntArray(object);
        n3 = this.e;
        parcel.writeInt(n3);
        object = this.f;
        parcel.writeString((String)object);
        n3 = this.g;
        parcel.writeInt(n3);
        n3 = this.h;
        parcel.writeInt(n3);
        TextUtils.writeToParcel((CharSequence)this.i, (Parcel)parcel, (int)0);
        n3 = this.j;
        parcel.writeInt(n3);
        TextUtils.writeToParcel((CharSequence)this.k, (Parcel)parcel, (int)0);
        object = this.l;
        parcel.writeStringList((List)object);
        object = this.m;
        parcel.writeStringList((List)object);
        n3 = (int)(this.n ? 1 : 0);
        parcel.writeInt(n3);
    }
}

