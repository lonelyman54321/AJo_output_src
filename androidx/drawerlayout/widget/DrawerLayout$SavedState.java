/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package androidx.drawerlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout$SavedState$a;

public class DrawerLayout$SavedState
extends AbsSavedState {
    public static final Parcelable.Creator CREATOR;
    public int a = 0;
    public int b;
    public int c;
    public int d;
    public int e;

    static {
        DrawerLayout$SavedState$a drawerLayout$SavedState$a = new Object();
        CREATOR = drawerLayout$SavedState$a;
    }

    public DrawerLayout$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int n3;
        int n4;
        this.a = n4 = parcel.readInt();
        this.b = n4 = parcel.readInt();
        this.c = n4 = parcel.readInt();
        this.d = n4 = parcel.readInt();
        this.e = n3 = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        super.writeToParcel(parcel, n3);
        n3 = this.a;
        parcel.writeInt(n3);
        n3 = this.b;
        parcel.writeInt(n3);
        n3 = this.c;
        parcel.writeInt(n3);
        n3 = this.d;
        parcel.writeInt(n3);
        n3 = this.e;
        parcel.writeInt(n3);
    }
}

