/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 */
package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$u;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public abstract class RecyclerView$B {
    static final int FLAG_ADAPTER_FULLUPDATE = 1024;
    static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
    static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
    static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
    static final int FLAG_BOUND = 1;
    static final int FLAG_IGNORE = 128;
    static final int FLAG_INVALID = 4;
    static final int FLAG_MOVED = 2048;
    static final int FLAG_NOT_RECYCLABLE = 16;
    static final int FLAG_REMOVED = 8;
    static final int FLAG_RETURNED_FROM_SCRAP = 32;
    static final int FLAG_TMP_DETACHED = 256;
    static final int FLAG_UPDATE = 2;
    private static final List FULLUPDATE_PAYLOADS = Collections.emptyList();
    static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = 255;
    public final View itemView;
    RecyclerView$f mBindingAdapter;
    int mFlags;
    boolean mInChangeScrap;
    private int mIsRecyclableCount;
    long mItemId;
    int mItemViewType;
    WeakReference mNestedRecyclerView;
    int mOldPosition;
    RecyclerView mOwnerRecyclerView;
    List mPayloads;
    int mPendingAccessibilityState;
    int mPosition;
    int mPreLayoutPosition;
    RecyclerView$u mScrapContainer;
    RecyclerView$B mShadowedHolder;
    RecyclerView$B mShadowingHolder;
    List mUnmodifiedPayloads;
    private int mWasImportantForAccessibilityBeforeHidden;

    public RecyclerView$B(View object) {
        long l2;
        int n3;
        this.mPosition = n3 = -1;
        this.mOldPosition = n3;
        this.mItemId = l2 = (long)-1;
        this.mItemViewType = n3;
        this.mPreLayoutPosition = n3;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        this.mPayloads = null;
        this.mUnmodifiedPayloads = null;
        this.mIsRecyclableCount = 0;
        this.mScrapContainer = null;
        this.mInChangeScrap = false;
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = n3;
        if (object != null) {
            this.itemView = object;
            return;
        }
        super("itemView may not be null");
        throw object;
    }

    private void createPayloadsIfNeeded() {
        List list = this.mPayloads;
        if (list == null) {
            this.mPayloads = list = new List();
            this.mUnmodifiedPayloads = list = Collections.unmodifiableList(list);
        }
    }

    public void addChangePayload(Object object) {
        int n3 = 1024;
        if (object == null) {
            this.addFlags(n3);
        } else {
            int n4 = this.mFlags;
            if ((n3 &= n4) == 0) {
                this.createPayloadsIfNeeded();
                List list = this.mPayloads;
                list.add(object);
            }
        }
    }

    public void addFlags(int n3) {
        int n4 = this.mFlags;
        this.mFlags = n3 |= n4;
    }

    public void clearOldPosition() {
        int n3;
        this.mOldPosition = n3 = -1;
        this.mPreLayoutPosition = n3;
    }

    public void clearPayload() {
        int n3;
        List list = this.mPayloads;
        if (list != null) {
            list.clear();
        }
        this.mFlags = n3 = this.mFlags & 0xFFFFFBFF;
    }

    public void clearReturnedFromScrapFlag() {
        int n3;
        this.mFlags = n3 = this.mFlags & 0xFFFFFFDF;
    }

    public void clearTmpDetachFlag() {
        int n3;
        this.mFlags = n3 = this.mFlags & 0xFFFFFEFF;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean doesTransientStatePreventRecycling() {
        int n3 = this.mFlags & 0x10;
        if (n3 != 0) return 0 != 0;
        View view = this.itemView;
        n3 = view.hasTransientState();
        if (n3 == 0) return 0 != 0;
        return 1 != 0;
    }

    public void flagRemovedAndOffsetPosition(int n3, int n4, boolean bl2) {
        this.addFlags(8);
        this.offsetPosition(n4, bl2);
        this.mPosition = n3;
    }

    public final int getAbsoluteAdapterPosition() {
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.getAdapterPositionInRecyclerView(this);
    }

    public final int getAdapterPosition() {
        return this.getBindingAdapterPosition();
    }

    public final RecyclerView$f getBindingAdapter() {
        return this.mBindingAdapter;
    }

    public final int getBindingAdapterPosition() {
        Object object = this.mBindingAdapter;
        int n3 = -1;
        if (object == null) {
            return n3;
        }
        object = this.mOwnerRecyclerView;
        if (object == null) {
            return n3;
        }
        if ((object = ((RecyclerView)object).getAdapter()) == null) {
            return n3;
        }
        RecyclerView recyclerView = this.mOwnerRecyclerView;
        int n4 = recyclerView.getAdapterPositionInRecyclerView(this);
        if (n4 == n3) {
            return n3;
        }
        RecyclerView$f recyclerView$f = this.mBindingAdapter;
        return ((RecyclerView$f)object).findRelativeAdapterPositionIn(recyclerView$f, this, n4);
    }

    public final long getItemId() {
        return this.mItemId;
    }

    public final int getItemViewType() {
        return this.mItemViewType;
    }

    public final int getLayoutPosition() {
        int n3 = this.mPreLayoutPosition;
        int n4 = -1;
        if (n3 == n4) {
            n3 = this.mPosition;
        }
        return n3;
    }

    public final int getOldPosition() {
        return this.mOldPosition;
    }

    public final int getPosition() {
        int n3 = this.mPreLayoutPosition;
        int n4 = -1;
        if (n3 == n4) {
            n3 = this.mPosition;
        }
        return n3;
    }

    public List getUnmodifiedPayloads() {
        int n3 = this.mFlags & 0x400;
        if (n3 == 0) {
            List list = this.mPayloads;
            if (list != null && (n3 = list.size()) != 0) {
                return this.mUnmodifiedPayloads;
            }
            return FULLUPDATE_PAYLOADS;
        }
        return FULLUPDATE_PAYLOADS;
    }

    public boolean hasAnyOfTheFlags(int n3) {
        int n4 = this.mFlags;
        n3 = (n3 &= n4) != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isAdapterPositionUnknown() {
        int n3 = this.mFlags & 0x200;
        n3 = !n3 && !(n3 = (int)(this.isInvalid() ? 1 : 0)) ? 0 : 1;
        return n3 != 0;
    }

    public boolean isAttachedToTransitionOverlay() {
        boolean bl2;
        RecyclerView recyclerView;
        ViewParent viewParent = this.itemView.getParent();
        if (viewParent != null && (viewParent = this.itemView.getParent()) != (recyclerView = this.mOwnerRecyclerView)) {
            bl2 = true;
        } else {
            bl2 = false;
            viewParent = null;
        }
        return bl2;
    }

    public boolean isBound() {
        int n3 = this.mFlags;
        int n4 = 1;
        if ((n3 &= n4) == 0) {
            n4 = 0;
        }
        return n4 != 0;
    }

    public boolean isInvalid() {
        int n3 = this.mFlags & 4;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isRecyclable() {
        int n3 = this.mFlags & 0x10;
        if (n3 != 0) return 0 != 0;
        View view = this.itemView;
        n3 = view.hasTransientState();
        if (n3 != 0) return 0 != 0;
        return 1 != 0;
    }

    public boolean isRemoved() {
        int n3 = this.mFlags & 8;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isScrap() {
        boolean bl2;
        RecyclerView$u recyclerView$u = this.mScrapContainer;
        if (recyclerView$u != null) {
            bl2 = true;
        } else {
            bl2 = false;
            recyclerView$u = null;
        }
        return bl2;
    }

    public boolean isTmpDetached() {
        int n3 = this.mFlags & 0x100;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean isUpdated() {
        int n3 = this.mFlags & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean needsUpdate() {
        int n3 = this.mFlags & 2;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public void offsetPosition(int n3, boolean bl2) {
        int n4;
        int n7 = this.mOldPosition;
        int n8 = -1;
        if (n7 == n8) {
            this.mOldPosition = n7 = this.mPosition;
        }
        if ((n7 = this.mPreLayoutPosition) == n8) {
            this.mPreLayoutPosition = n7 = this.mPosition;
        }
        if (bl2) {
            int n10;
            this.mPreLayoutPosition = n10 = this.mPreLayoutPosition + n3;
        }
        this.mPosition = n4 = this.mPosition + n3;
        Object object = this.itemView.getLayoutParams();
        if (object != null) {
            boolean bl3;
            object = (RecyclerView$LayoutParams)this.itemView.getLayoutParams();
            object.mInsetsDirty = bl3 = true;
        }
    }

    public void onEnteredHiddenState(RecyclerView recyclerView) {
        int n3 = this.mPendingAccessibilityState;
        int n4 = -1;
        if (n3 != n4) {
            this.mWasImportantForAccessibilityBeforeHidden = n3;
        } else {
            View view = this.itemView;
            this.mWasImportantForAccessibilityBeforeHidden = n3 = view.getImportantForAccessibility();
        }
        recyclerView.setChildImportantForAccessibilityInternal(this, 4);
    }

    public void onLeftHiddenState(RecyclerView recyclerView) {
        int n3 = this.mWasImportantForAccessibilityBeforeHidden;
        recyclerView.setChildImportantForAccessibilityInternal(this, n3);
        this.mWasImportantForAccessibilityBeforeHidden = 0;
    }

    public void resetInternal() {
        int n3;
        boolean bl2 = RecyclerView.sDebugAssertionsEnabled;
        if (bl2 && (bl2 = this.isTmpDetached())) {
            CharSequence charSequence = new StringBuilder("Attempting to reset temp-detached ViewHolder: ");
            charSequence.append(this);
            charSequence.append(". ViewHolders should be fully detached before resetting.");
            charSequence = charSequence.toString();
            IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
            throw illegalStateException;
        }
        this.mFlags = 0;
        this.mPosition = n3 = -1;
        this.mOldPosition = n3;
        this.mItemId = -1;
        this.mPreLayoutPosition = n3;
        this.mIsRecyclableCount = 0;
        this.mShadowedHolder = null;
        this.mShadowingHolder = null;
        this.clearPayload();
        this.mWasImportantForAccessibilityBeforeHidden = 0;
        this.mPendingAccessibilityState = n3;
        RecyclerView.clearNestedRecyclerViewIfNotNested(this);
    }

    public void saveOldPosition() {
        int n3 = this.mOldPosition;
        int n4 = -1;
        if (n3 == n4) {
            this.mOldPosition = n3 = this.mPosition;
        }
    }

    public void setFlags(int n3, int n4) {
        int n7 = this.mFlags;
        int n8 = ~n4;
        this.mFlags = n3 = n3 & n4 | (n7 &= n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void setIsRecyclable(boolean bl2) {
        int n3 = 1;
        int n4 = this.mIsRecyclableCount;
        n4 = bl2 ? (n4 -= n3) : (n4 += n3);
        this.mIsRecyclableCount = n4;
        if (n4 < 0) {
            RuntimeException runtimeException = null;
            this.mIsRecyclableCount = 0;
            boolean bl3 = RecyclerView.sDebugAssertionsEnabled;
            if (bl3) {
                StringBuilder stringBuilder = new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                stringBuilder.append(this);
                String string2 = stringBuilder.toString();
                runtimeException = new RuntimeException(string2);
                throw runtimeException;
            }
            this.toString();
        } else if (!bl2 && n4 == n3) {
            int n7;
            this.mFlags = n7 = this.mFlags | 0x10;
        } else if (bl2 && n4 == 0) {
            int n8;
            this.mFlags = n8 = this.mFlags & 0xFFFFFFEF;
        }
        boolean bl4 = RecyclerView.sVerboseLoggingEnabled;
        if (bl4) {
            this.toString();
        }
    }

    public void setScrapContainer(RecyclerView$u recyclerView$u, boolean bl2) {
        this.mScrapContainer = recyclerView$u;
        this.mInChangeScrap = bl2;
    }

    public boolean shouldBeKeptAsChild() {
        int n3 = this.mFlags & 0x10;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public boolean shouldIgnore() {
        int n3 = this.mFlags & 0x80;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }

    public void stopIgnoring() {
        int n3;
        this.mFlags = n3 = this.mFlags & 0xFFFFFF7F;
    }

    public String toString() {
        Class clazz = this.getClass();
        boolean bl2 = clazz.isAnonymousClass();
        clazz = bl2 ? "ViewHolder" : this.getClass().getSimpleName();
        clazz = nn_2.a((String)((Object)clazz), "{");
        String string2 = Integer.toHexString(this.hashCode());
        ((StringBuilder)((Object)clazz)).append(string2);
        ((StringBuilder)((Object)clazz)).append(" position=");
        int n3 = this.mPosition;
        ((StringBuilder)((Object)clazz)).append(n3);
        ((StringBuilder)((Object)clazz)).append(" id=");
        long l2 = this.mItemId;
        ((StringBuilder)((Object)clazz)).append(l2);
        ((StringBuilder)((Object)clazz)).append(", oldPos=");
        n3 = this.mOldPosition;
        ((StringBuilder)((Object)clazz)).append(n3);
        string2 = ", pLpos:";
        ((StringBuilder)((Object)clazz)).append(string2);
        n3 = this.mPreLayoutPosition;
        ((StringBuilder)((Object)clazz)).append(n3);
        clazz = ((StringBuilder)((Object)clazz)).toString();
        StringBuilder stringBuilder = new StringBuilder((String)((Object)clazz));
        bl2 = this.isScrap();
        if (bl2) {
            clazz = " scrap ";
            stringBuilder.append((String)((Object)clazz));
            bl2 = this.mInChangeScrap;
            clazz = bl2 ? "[changeScrap]" : "[attachedScrap]";
            stringBuilder.append((String)((Object)clazz));
        }
        if (bl2 = this.isInvalid()) {
            clazz = " invalid";
            stringBuilder.append((String)((Object)clazz));
        }
        if (!(bl2 = this.isBound())) {
            clazz = " unbound";
            stringBuilder.append((String)((Object)clazz));
        }
        if (bl2 = this.needsUpdate()) {
            clazz = " update";
            stringBuilder.append((String)((Object)clazz));
        }
        if (bl2 = this.isRemoved()) {
            clazz = " removed";
            stringBuilder.append((String)((Object)clazz));
        }
        if (bl2 = this.shouldIgnore()) {
            clazz = " ignored";
            stringBuilder.append((String)((Object)clazz));
        }
        if (bl2 = this.isTmpDetached()) {
            clazz = " tmpDetached";
            stringBuilder.append((String)((Object)clazz));
        }
        if (!(bl2 = this.isRecyclable())) {
            clazz = new StringBuilder(" not recyclable(");
            n3 = this.mIsRecyclableCount;
            ((StringBuilder)((Object)clazz)).append(n3);
            string2 = ")";
            ((StringBuilder)((Object)clazz)).append(string2);
            clazz = ((StringBuilder)((Object)clazz)).toString();
            stringBuilder.append((String)((Object)clazz));
        }
        if (bl2 = this.isAdapterPositionUnknown()) {
            clazz = " undefined adapter position";
            stringBuilder.append((String)((Object)clazz));
        }
        if ((clazz = this.itemView.getParent()) == null) {
            clazz = " no parent";
            stringBuilder.append((String)((Object)clazz));
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public void unScrap() {
        this.mScrapContainer.n(this);
    }

    public boolean wasReturnedFromScrap() {
        int n3 = this.mFlags & 0x20;
        n3 = n3 != 0 ? 1 : 0;
        return n3 != 0;
    }
}

