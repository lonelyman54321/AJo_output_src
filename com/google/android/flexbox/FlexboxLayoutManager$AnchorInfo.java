/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.flexbox;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.t;
import com.google.android.flexbox.FlexLine;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.google.android.flexbox.FlexboxLayoutManager$1;

class FlexboxLayoutManager$AnchorInfo {
    static final /* synthetic */ boolean $assertionsDisabled;
    private boolean mAssignedFromSavedState;
    private int mCoordinate;
    private int mFlexLinePosition;
    private boolean mLayoutFromEnd;
    private int mPerpendicularCoordinate = 0;
    private int mPosition;
    private boolean mValid;
    final /* synthetic */ FlexboxLayoutManager this$0;

    private FlexboxLayoutManager$AnchorInfo(FlexboxLayoutManager flexboxLayoutManager) {
        this.this$0 = flexboxLayoutManager;
    }

    public /* synthetic */ FlexboxLayoutManager$AnchorInfo(FlexboxLayoutManager flexboxLayoutManager, FlexboxLayoutManager$1 flexboxLayoutManager$1) {
        this(flexboxLayoutManager);
    }

    public static /* synthetic */ int access$1300(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo) {
        return flexboxLayoutManager$AnchorInfo.mPosition;
    }

    public static /* synthetic */ int access$1302(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo, int n3) {
        flexboxLayoutManager$AnchorInfo.mPosition = n3;
        return n3;
    }

    public static /* synthetic */ int access$1400(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo) {
        return flexboxLayoutManager$AnchorInfo.mFlexLinePosition;
    }

    public static /* synthetic */ int access$1402(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo, int n3) {
        flexboxLayoutManager$AnchorInfo.mFlexLinePosition = n3;
        return n3;
    }

    public static /* synthetic */ void access$1600(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo) {
        flexboxLayoutManager$AnchorInfo.assignCoordinateFromPadding();
    }

    public static /* synthetic */ int access$1700(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo) {
        return flexboxLayoutManager$AnchorInfo.mCoordinate;
    }

    public static /* synthetic */ int access$1702(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo, int n3) {
        flexboxLayoutManager$AnchorInfo.mCoordinate = n3;
        return n3;
    }

    public static /* synthetic */ boolean access$1802(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo, boolean bl2) {
        flexboxLayoutManager$AnchorInfo.mAssignedFromSavedState = bl2;
        return bl2;
    }

    public static /* synthetic */ void access$1900(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo, View view) {
        flexboxLayoutManager$AnchorInfo.assignFromView(view);
    }

    public static /* synthetic */ int access$2400(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo) {
        return flexboxLayoutManager$AnchorInfo.mPerpendicularCoordinate;
    }

    public static /* synthetic */ int access$2402(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo, int n3) {
        flexboxLayoutManager$AnchorInfo.mPerpendicularCoordinate = n3;
        return n3;
    }

    public static /* synthetic */ int access$2412(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo, int n3) {
        int n4;
        flexboxLayoutManager$AnchorInfo.mPerpendicularCoordinate = n4 = flexboxLayoutManager$AnchorInfo.mPerpendicularCoordinate + n3;
        return n4;
    }

    public static /* synthetic */ boolean access$700(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo) {
        return flexboxLayoutManager$AnchorInfo.mValid;
    }

    public static /* synthetic */ boolean access$702(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo, boolean bl2) {
        flexboxLayoutManager$AnchorInfo.mValid = bl2;
        return bl2;
    }

    public static /* synthetic */ void access$800(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo) {
        flexboxLayoutManager$AnchorInfo.reset();
    }

    public static /* synthetic */ boolean access$900(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo) {
        return flexboxLayoutManager$AnchorInfo.mLayoutFromEnd;
    }

    public static /* synthetic */ boolean access$902(FlexboxLayoutManager$AnchorInfo flexboxLayoutManager$AnchorInfo, boolean bl2) {
        flexboxLayoutManager$AnchorInfo.mLayoutFromEnd = bl2;
        return bl2;
    }

    /*
     * WARNING - void declaration
     */
    private void assignCoordinateFromPadding() {
        boolean bl2;
        Object object = this.this$0;
        boolean n3 = ((FlexboxLayoutManager)object).isMainAxisDirectionHorizontal();
        if (!n3 && (bl2 = FlexboxLayoutManager.access$3000((FlexboxLayoutManager)(object = this.this$0)))) {
            void var2_8;
            boolean bl3 = this.mLayoutFromEnd;
            if (bl3) {
                object = FlexboxLayoutManager.access$3100(this.this$0);
                int n4 = ((t)object).g();
            } else {
                object = this.this$0;
                int n7 = ((RecyclerView$o)object).getWidth();
                t t3 = FlexboxLayoutManager.access$3100(this.this$0);
                int n8 = t3.k();
                int n10 = n7 - n8;
            }
            this.mCoordinate = var2_8;
        } else {
            void var2_12;
            boolean bl4 = this.mLayoutFromEnd;
            if (bl4) {
                object = FlexboxLayoutManager.access$3100(this.this$0);
                int n14 = ((t)object).g();
            } else {
                object = FlexboxLayoutManager.access$3100(this.this$0);
                int n15 = ((t)object).k();
            }
            this.mCoordinate = var2_12;
        }
    }

    private void assignFromView(View object) {
        int n3;
        Object object2 = this.this$0;
        Object object3 = FlexboxLayoutManager.access$2800((FlexboxLayoutManager)object2);
        object2 = object3 == 0 ? FlexboxLayoutManager.access$3200(this.this$0) : FlexboxLayoutManager.access$3100(this.this$0);
        FlexboxLayoutManager flexboxLayoutManager = this.this$0;
        int n4 = flexboxLayoutManager.isMainAxisDirectionHorizontal();
        if (n4 == 0 && (n4 = FlexboxLayoutManager.access$3000(flexboxLayoutManager = this.this$0)) != 0) {
            n4 = (int)(this.mLayoutFromEnd ? 1 : 0);
            if (n4 != 0) {
                n4 = ((t)object2).e((View)object);
                this.mCoordinate = object3 = ((t)object2).m() + n4;
            } else {
                this.mCoordinate = object3 = ((t)object2).b((View)object);
            }
        } else {
            n4 = this.mLayoutFromEnd;
            if (n4 != 0) {
                n4 = ((t)object2).b((View)object);
                this.mCoordinate = object3 = ((t)object2).m() + n4;
            } else {
                this.mCoordinate = object3 = ((t)object2).e((View)object);
            }
        }
        this.mPosition = n3 = this.this$0.getPosition((View)object);
        n3 = 0;
        object = null;
        this.mAssignedFromSavedState = false;
        object2 = FlexboxLayoutManager.access$3300((FlexboxLayoutManager)this.this$0).mIndexToFlexLine;
        n4 = this.mPosition;
        int n7 = -1;
        if (n4 == n7) {
            n4 = 0;
            flexboxLayoutManager = null;
        }
        object3 = object2[n4];
        if (object3 != n7) {
            n3 = object3;
        }
        this.mFlexLinePosition = n3;
        object = FlexboxLayoutManager.access$3400(this.this$0);
        n3 = object.size();
        if (n3 > (object3 = this.mFlexLinePosition)) {
            object = FlexboxLayoutManager.access$3400(this.this$0);
            object3 = this.mFlexLinePosition;
            object = (FlexLine)object.get((int)object3);
            this.mPosition = n3 = ((FlexLine)object).mFirstIndex;
        }
    }

    private void reset() {
        int n3;
        this.mPosition = n3 = -1;
        this.mFlexLinePosition = n3;
        this.mCoordinate = -1 << -1;
        n3 = 0;
        this.mValid = false;
        this.mAssignedFromSavedState = false;
        FlexboxLayoutManager flexboxLayoutManager = this.this$0;
        int n4 = flexboxLayoutManager.isMainAxisDirectionHorizontal();
        int n7 = 2;
        int n8 = 1;
        if (n4 != 0) {
            flexboxLayoutManager = this.this$0;
            n4 = FlexboxLayoutManager.access$2800(flexboxLayoutManager);
            if (n4 == 0) {
                flexboxLayoutManager = this.this$0;
                n4 = FlexboxLayoutManager.access$2900(flexboxLayoutManager);
                if (n4 == n8) {
                    n3 = 1;
                }
                this.mLayoutFromEnd = n3;
            } else {
                flexboxLayoutManager = this.this$0;
                n4 = FlexboxLayoutManager.access$2800(flexboxLayoutManager);
                if (n4 == n7) {
                    n3 = 1;
                }
                this.mLayoutFromEnd = n3;
            }
        } else {
            flexboxLayoutManager = this.this$0;
            n4 = FlexboxLayoutManager.access$2800(flexboxLayoutManager);
            if (n4 == 0) {
                flexboxLayoutManager = this.this$0;
                n4 = FlexboxLayoutManager.access$2900(flexboxLayoutManager);
                if (n4 == (n7 = 3)) {
                    n3 = 1;
                }
                this.mLayoutFromEnd = n3;
            } else {
                flexboxLayoutManager = this.this$0;
                n4 = FlexboxLayoutManager.access$2800(flexboxLayoutManager);
                if (n4 == n7) {
                    n3 = 1;
                }
                this.mLayoutFromEnd = n3;
            }
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AnchorInfo{mPosition=");
        int bl2 = this.mPosition;
        stringBuilder.append(bl2);
        stringBuilder.append(", mFlexLinePosition=");
        int n3 = this.mFlexLinePosition;
        stringBuilder.append(n3);
        stringBuilder.append(", mCoordinate=");
        int n4 = this.mCoordinate;
        stringBuilder.append(n4);
        stringBuilder.append(", mPerpendicularCoordinate=");
        int n7 = this.mPerpendicularCoordinate;
        stringBuilder.append(n7);
        stringBuilder.append(", mLayoutFromEnd=");
        boolean bl3 = this.mLayoutFromEnd;
        stringBuilder.append(bl3);
        stringBuilder.append(", mValid=");
        boolean bl4 = this.mValid;
        stringBuilder.append(bl4);
        stringBuilder.append(", mAssignedFromSavedState=");
        boolean bl5 = this.mAssignedFromSavedState;
        return AR.a(stringBuilder, bl5, '}');
    }
}

