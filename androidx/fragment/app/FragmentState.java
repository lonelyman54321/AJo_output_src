/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentState$a;

final class FragmentState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final int l;
    public final String m;
    public final int n;
    public final boolean o;

    static {
        FragmentState$a fragmentState$a = new Object();
        CREATOR = fragmentState$a;
    }

    public FragmentState(Parcel parcel) {
        String string2;
        this.a = string2 = parcel.readString();
        this.b = string2 = parcel.readString();
        int n3 = parcel.readInt();
        boolean bl2 = false;
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        this.c = n3;
        n3 = parcel.readInt();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        this.d = n3;
        this.e = n3 = parcel.readInt();
        this.f = n3 = parcel.readInt();
        this.g = string2 = parcel.readString();
        n3 = parcel.readInt();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        this.h = n3;
        n3 = parcel.readInt();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        this.i = n3;
        n3 = parcel.readInt();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        this.j = n3;
        n3 = parcel.readInt();
        if (n3 != 0) {
            n3 = 1;
        } else {
            n3 = 0;
            string2 = null;
        }
        this.k = n3;
        this.l = n3 = parcel.readInt();
        this.m = string2 = parcel.readString();
        this.n = n3 = parcel.readInt();
        int n4 = parcel.readInt();
        if (n4 != 0) {
            bl2 = true;
        }
        this.o = bl2;
    }

    public FragmentState(Fragment fragment) {
        boolean bl2;
        int n3;
        String string2;
        this.a = string2 = fragment.getClass().getName();
        this.b = string2 = fragment.mWho;
        this.c = n3 = fragment.mFromLayout;
        this.d = n3 = fragment.mInDynamicContainer;
        this.e = n3 = fragment.mFragmentId;
        this.f = n3 = fragment.mContainerId;
        this.g = string2 = fragment.mTag;
        n3 = (int)(fragment.mRetainInstance ? 1 : 0);
        this.h = n3;
        n3 = (int)(fragment.mRemoving ? 1 : 0);
        this.i = n3;
        n3 = (int)(fragment.mDetached ? 1 : 0);
        this.j = n3;
        n3 = (int)(fragment.mHidden ? 1 : 0);
        this.k = n3;
        this.l = n3 = fragment.mMaxState.ordinal();
        this.m = string2 = fragment.mTargetWho;
        this.n = n3 = fragment.mTargetRequestCode;
        this.o = bl2 = fragment.mUserVisibleHint;
    }

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        boolean bl2;
        String string2;
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentState{");
        String string3 = this.a;
        stringBuilder.append(string3);
        stringBuilder.append(" (");
        string3 = this.b;
        stringBuilder.append(string3);
        string3 = ")}:";
        stringBuilder.append(string3);
        int n3 = this.c;
        if (n3 != 0) {
            string3 = " fromLayout";
            stringBuilder.append(string3);
        }
        if ((n3 = this.d) != 0) {
            string3 = " dynamicContainer";
            stringBuilder.append(string3);
        }
        if ((n3 = this.f) != 0) {
            string2 = " id=0x";
            stringBuilder.append(string2);
            string3 = Integer.toHexString(n3);
            stringBuilder.append(string3);
        }
        if ((string3 = this.g) != null && !(bl2 = string3.isEmpty())) {
            string2 = " tag=";
            stringBuilder.append(string2);
            stringBuilder.append(string3);
        }
        if ((n3 = (int)(this.h ? 1 : 0)) != 0) {
            string3 = " retainInstance";
            stringBuilder.append(string3);
        }
        if ((n3 = (int)(this.i ? 1 : 0)) != 0) {
            string3 = " removing";
            stringBuilder.append(string3);
        }
        if ((n3 = (int)(this.j ? 1 : 0)) != 0) {
            string3 = " detached";
            stringBuilder.append(string3);
        }
        if ((n3 = (int)(this.k ? 1 : 0)) != 0) {
            string3 = " hidden";
            stringBuilder.append(string3);
        }
        if ((string3 = this.m) != null) {
            string2 = " targetWho=";
            stringBuilder.append(string2);
            stringBuilder.append(string3);
            string3 = " targetRequestCode=";
            stringBuilder.append(string3);
            n3 = this.n;
            stringBuilder.append(n3);
        }
        if ((n3 = (int)(this.o ? 1 : 0)) != 0) {
            string3 = " userVisibleHint";
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        String string2 = this.a;
        parcel.writeString(string2);
        string2 = this.b;
        parcel.writeString(string2);
        n3 = (int)(this.c ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.d ? 1 : 0);
        parcel.writeInt(n3);
        n3 = this.e;
        parcel.writeInt(n3);
        n3 = this.f;
        parcel.writeInt(n3);
        string2 = this.g;
        parcel.writeString(string2);
        n3 = (int)(this.h ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.i ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.j ? 1 : 0);
        parcel.writeInt(n3);
        n3 = (int)(this.k ? 1 : 0);
        parcel.writeInt(n3);
        n3 = this.l;
        parcel.writeInt(n3);
        string2 = this.m;
        parcel.writeString(string2);
        n3 = this.n;
        parcel.writeInt(n3);
        n3 = (int)(this.o ? 1 : 0);
        parcel.writeInt(n3);
    }
}

