/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 */
package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.flexbox.FlexboxLayoutManager$1;
import com.google.android.flexbox.FlexboxLayoutManager$SavedState$1;

class FlexboxLayoutManager$SavedState
implements Parcelable {
    public static final Parcelable.Creator CREATOR;
    private int mAnchorOffset;
    private int mAnchorPosition;

    static {
        FlexboxLayoutManager$SavedState$1 flexboxLayoutManager$SavedState$1 = new FlexboxLayoutManager$SavedState$1();
        CREATOR = flexboxLayoutManager$SavedState$1;
    }

    public FlexboxLayoutManager$SavedState() {
    }

    private FlexboxLayoutManager$SavedState(Parcel parcel) {
        int n3;
        int n4;
        this.mAnchorPosition = n4 = parcel.readInt();
        this.mAnchorOffset = n3 = parcel.readInt();
    }

    public /* synthetic */ FlexboxLayoutManager$SavedState(Parcel parcel, FlexboxLayoutManager$1 flexboxLayoutManager$1) {
        this(parcel);
    }

    private FlexboxLayoutManager$SavedState(FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState) {
        int n3;
        int n4;
        this.mAnchorPosition = n4 = flexboxLayoutManager$SavedState.mAnchorPosition;
        this.mAnchorOffset = n3 = flexboxLayoutManager$SavedState.mAnchorOffset;
    }

    public /* synthetic */ FlexboxLayoutManager$SavedState(FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState, FlexboxLayoutManager$1 flexboxLayoutManager$1) {
        this(flexboxLayoutManager$SavedState);
    }

    public static /* synthetic */ int access$200(FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState) {
        return flexboxLayoutManager$SavedState.mAnchorPosition;
    }

    public static /* synthetic */ int access$202(FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState, int n3) {
        flexboxLayoutManager$SavedState.mAnchorPosition = n3;
        return n3;
    }

    public static /* synthetic */ int access$300(FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState) {
        return flexboxLayoutManager$SavedState.mAnchorOffset;
    }

    public static /* synthetic */ int access$302(FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState, int n3) {
        flexboxLayoutManager$SavedState.mAnchorOffset = n3;
        return n3;
    }

    public static /* synthetic */ void access$400(FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState) {
        flexboxLayoutManager$SavedState.invalidateAnchor();
    }

    public static /* synthetic */ boolean access$600(FlexboxLayoutManager$SavedState flexboxLayoutManager$SavedState, int n3) {
        return flexboxLayoutManager$SavedState.hasValidAnchor(n3);
    }

    private boolean hasValidAnchor(int n3) {
        int n4 = this.mAnchorPosition;
        n3 = n4 >= 0 && n4 < n3 ? 1 : 0;
        return n3 != 0;
    }

    private void invalidateAnchor() {
        this.mAnchorPosition = -1;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("SavedState{mAnchorPosition=");
        int n3 = this.mAnchorPosition;
        stringBuilder.append(n3);
        stringBuilder.append(", mAnchorOffset=");
        n3 = this.mAnchorOffset;
        return tu.a(stringBuilder, n3, '}');
    }

    public void writeToParcel(Parcel parcel, int n3) {
        n3 = this.mAnchorPosition;
        parcel.writeInt(n3);
        n3 = this.mAnchorOffset;
        parcel.writeInt(n3);
    }
}

