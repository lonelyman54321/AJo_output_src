/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.a;
import androidx.core.view.a$a;
import androidx.recyclerview.widget.B;
import androidx.recyclerview.widget.GapWorker$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$LayoutParams;
import androidx.recyclerview.widget.RecyclerView$d;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$l;
import androidx.recyclerview.widget.RecyclerView$l$c;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.RecyclerView$t;
import androidx.recyclerview.widget.RecyclerView$t$a;
import androidx.recyclerview.widget.RecyclerView$v;
import androidx.recyclerview.widget.RecyclerView$y;
import androidx.recyclerview.widget.v;
import androidx.recyclerview.widget.v$a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;

public final class RecyclerView$u {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public RecyclerView$t g;
    public final /* synthetic */ RecyclerView h;

    public RecyclerView$u(RecyclerView list) {
        int n3;
        ArrayList arrayList;
        this.h = list;
        this.a = list = new List();
        this.b = null;
        this.c = arrayList = new ArrayList();
        this.d = list = Collections.unmodifiableList(list);
        this.e = n3 = 2;
        this.f = n3;
    }

    public static void e(ViewGroup viewGroup, boolean n3) {
        int n4 = viewGroup.getChildCount();
        int n7 = 1;
        n4 -= n7;
        while (n4 >= 0) {
            View view = viewGroup.getChildAt(n4);
            boolean bl2 = view instanceof ViewGroup;
            if (bl2) {
                view = (ViewGroup)view;
                RecyclerView$u.e((ViewGroup)view, n7 != 0);
            }
            n4 += -1;
        }
        if (n3 == 0) {
            return;
        }
        n3 = viewGroup.getVisibility();
        if (n3 == (n4 = 4)) {
            n3 = 0;
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(n4);
        } else {
            n3 = viewGroup.getVisibility();
            viewGroup.setVisibility(n4);
            viewGroup.setVisibility(n3);
        }
    }

    public final void a(RecyclerView$B object, boolean n3) {
        int n4;
        Object object2;
        RecyclerView.clearNestedRecyclerViewIfNotNested((RecyclerView$B)object);
        View view = ((RecyclerView$B)object).itemView;
        Object object3 = this.h;
        Object object4 = ((RecyclerView)object3).mAccessibilityDelegate;
        if (object4 != null) {
            boolean bl2 = (object4 = ((v)object4).getItemDelegate()) instanceof v$a;
            object4 = bl2 ? (a)((v$a)object4).b.remove(view) : null;
            ViewCompat.s(view, (a)object4);
        }
        if (n3 != 0) {
            object2 = ((RecyclerView)object3).mRecyclerListener;
            if (object2 != null) {
                object2.a();
            }
            object2 = ((RecyclerView)object3).mRecyclerListeners;
            n3 = object2.size();
            view = null;
            for (n4 = 0; n4 < n3; ++n4) {
                object4 = (RecyclerView$v)((RecyclerView)object3).mRecyclerListeners.get(n4);
                object4.a();
            }
            object2 = ((RecyclerView)object3).mAdapter;
            if (object2 != null) {
                ((RecyclerView$f)object2).onViewRecycled((RecyclerView$B)object);
            }
            if ((object2 = ((RecyclerView)object3).mState) != null) {
                object2 = ((RecyclerView)object3).mViewInfoStore;
                ((B)object2).d((RecyclerView$B)object);
            }
            if ((n3 = (int)(RecyclerView.sVerboseLoggingEnabled ? 1 : 0)) != 0) {
                Objects.toString(object);
            }
        }
        ((RecyclerView$B)object).mBindingAdapter = null;
        ((RecyclerView$B)object).mOwnerRecyclerView = null;
        object2 = this.d();
        object2.getClass();
        n4 = ((RecyclerView$B)object).getItemViewType();
        object3 = ((RecyclerView$t)object2).a((int)n4).a;
        object2 = (RecyclerView$t$a)((RecyclerView$t)object2).a.get(n4);
        n3 = ((RecyclerView$t$a)object2).b;
        n4 = ((ArrayList)object3).size();
        if (n3 <= n4) {
            object = ((RecyclerView$B)object).itemView;
            vw2.a((View)object);
        } else {
            n3 = (int)(RecyclerView.sDebugAssertionsEnabled ? 1 : 0);
            if (n3 != 0 && (n3 = (int)(((ArrayList)object3).contains(object) ? 1 : 0)) != 0) {
                object = new IllegalArgumentException("this scrap item already exists");
                throw object;
            }
            ((RecyclerView$B)object).resetInternal();
            ((ArrayList)object3).add(object);
        }
    }

    public final void b() {
        this.a.clear();
        this.h();
    }

    public final int c(int n3) {
        Object object;
        int n4;
        Object object2 = this.h;
        if (n3 >= 0 && n3 < (n4 = ((RecyclerView$y)(object = ((RecyclerView)object2).mState)).b())) {
            object = ((RecyclerView)object2).mState;
            n4 = (int)(((RecyclerView$y)object).g ? 1 : 0);
            if (n4 == 0) {
                return n3;
            }
            return ((RecyclerView)object2).mAdapterHelper.f(n3, 0);
        }
        CharSequence charSequence = wk0_0.a(n3, "invalid position ", ". State item count is ");
        int n7 = ((RecyclerView)object2).mState.b();
        charSequence.append(n7);
        object2 = ((RecyclerView)object2).exceptionLabel();
        charSequence.append((String)object2);
        charSequence = charSequence.toString();
        object = new IndexOutOfBoundsException((String)charSequence);
        throw object;
    }

    public final RecyclerView$t d() {
        RecyclerView$t recyclerView$t = this.g;
        if (recyclerView$t == null) {
            Object object;
            recyclerView$t = new Object();
            recyclerView$t.a = object = new SparseArray();
            recyclerView$t.b = 0;
            object = new IdentityHashMap();
            object = Collections.newSetFromMap(object);
            recyclerView$t.c = object;
            this.g = recyclerView$t;
            this.f();
        }
        return this.g;
    }

    public final void f() {
        Object object = this.g;
        if (object != null) {
            boolean bl2;
            object = this.h;
            Object object2 = ((RecyclerView)object).mAdapter;
            if (object2 != null && (bl2 = ((RecyclerView)object).isAttachedToWindow())) {
                object2 = this.g;
                object = ((RecyclerView)object).mAdapter;
                object2 = ((RecyclerView$t)object2).c;
                object2.add(object);
            }
        }
    }

    public final void g(RecyclerView$f recyclerView$f, boolean n3) {
        RecyclerView$t recyclerView$t = this.g;
        if (recyclerView$t != null) {
            Collection collection = recyclerView$t.c;
            collection.remove(recyclerView$f);
            int n4 = collection.size();
            if (n4 == 0 && n3 == 0) {
                int n7;
                n4 = 0;
                recyclerView$f = null;
                for (n3 = 0; n3 < (n7 = (collection = recyclerView$t.a).size()); ++n3) {
                    int n8;
                    n7 = collection.keyAt(n3);
                    collection = ((RecyclerView$t$a)collection.get((int)n7)).a;
                    for (n7 = 0; n7 < (n8 = ((ArrayList)collection).size()); ++n7) {
                        View view = ((RecyclerView$B)((ArrayList)collection).get((int)n7)).itemView;
                        vw2.a(view);
                    }
                }
            }
        }
    }

    public final void h() {
        int n3;
        Object object = this.c;
        for (n3 = ((ArrayList)object).size() + -1; n3 >= 0; n3 += -1) {
            this.i(n3);
        }
        ((ArrayList)object).clear();
        boolean bl2 = RecyclerView.ALLOW_THREAD_GAP_WORK;
        if (bl2) {
            object = this.h.mPrefetchRegistry;
            int[] nArray = ((GapWorker$b)object).c;
            if (nArray != null) {
                int n4 = -1;
                Arrays.fill(nArray, n4);
            }
            n3 = 0;
            nArray = null;
            ((GapWorker$b)object).d = 0;
        }
    }

    public final void i(int n3) {
        ArrayList arrayList = this.c;
        RecyclerView$B recyclerView$B = (RecyclerView$B)arrayList.get(n3);
        boolean bl2 = RecyclerView.sVerboseLoggingEnabled;
        if (bl2) {
            Objects.toString(recyclerView$B);
        }
        this.a(recyclerView$B, true);
        arrayList.remove(n3);
    }

    public final void j(View object) {
        boolean bl2;
        RecyclerView$B recyclerView$B = RecyclerView.getChildViewHolderInt((View)object);
        boolean bl3 = recyclerView$B.isTmpDetached();
        RecyclerView recyclerView = this.h;
        if (bl3) {
            bl3 = false;
            recyclerView.removeDetachedView((View)object, false);
        }
        if (bl2 = recyclerView$B.isScrap()) {
            recyclerView$B.unScrap();
        } else {
            bl2 = recyclerView$B.wasReturnedFromScrap();
            if (bl2) {
                recyclerView$B.clearReturnedFromScrapFlag();
            }
        }
        this.k(recyclerView$B);
        object = recyclerView.mItemAnimator;
        if (object != null && !(bl2 = recyclerView$B.isRecyclable())) {
            object = recyclerView.mItemAnimator;
            ((RecyclerView$l)object).d(recyclerView$B);
        }
    }

    /*
     * Unable to fully structure code
     */
    public final void k(RecyclerView$B var1_1) {
        var2_2 = var1_1.isScrap();
        var3_3 = 0;
        var4_4 = null;
        var5_5 = 1;
        var6_6 = this.h;
        if (!var2_2 && (var7_7 = var1_1.itemView.getParent()) == null) {
            var2_2 = var1_1.isTmpDetached();
            if (!var2_2) {
                var2_2 = var1_1.shouldIgnore();
                if (!var2_2) {
                    var2_2 = var1_1.doesTransientStatePreventRecycling();
                    var8_8 = var6_6.mAdapter;
                    if (var8_8 != null && var2_2 && (var9_10 = var8_8.onFailedToRecycleView((RecyclerView$B)var1_1)) != 0) {
                        var9_10 = 1;
                    } else {
                        var9_10 = 0;
                        var8_8 = null;
                    }
                    var10_11 = RecyclerView.sDebugAssertionsEnabled;
                    var11_13 = this.c;
                    if (var10_11 != 0 && (var10_11 = var11_13.contains(var1_1)) != 0) {
                        var4_4 = new StringBuilder("cached view received recycle internal? ");
                        var4_4.append(var1_1);
                        var1_1 = lu_0.a((RecyclerView)var6_6, var4_4);
                        var7_7 = new IllegalArgumentException((String)var1_1);
                        throw var7_7;
                    }
                    if (var9_10 == 0 && (var9_10 = var1_1.isRecyclable()) == 0) {
                        var5_5 = RecyclerView.sVerboseLoggingEnabled;
                        if (var5_5 != 0) {
                            var6_6.exceptionLabel();
                        }
lbl32:
                        // 4 sources

                        while (true) {
                            var5_5 = 0;
                            break;
                        }
                    } else {
                        var9_10 = this.f;
                        if (var9_10 > 0 && (var9_10 = (int)var1_1.hasAnyOfTheFlags(526)) == 0) {
                            var9_10 = var11_13.size();
                            if (var9_10 >= (var10_11 = this.f) && var9_10 > 0) {
                                this.i(0);
                                var9_10 += -1;
                            }
                            if ((var10_11 = (int)RecyclerView.ALLOW_THREAD_GAP_WORK) != 0 && var9_10 > 0) {
                                var12_14 = var6_6.mPrefetchRegistry;
                                var13_16 = var1_1.mPosition;
                                var14_17 = var12_14.c;
                                if (var14_17 != null) {
                                    var15_18 = var12_14.d * 2;
                                    for (var16_19 = 0; var16_19 < var15_18; var16_19 += 2) {
                                        var17_20 = var12_14.c;
                                        var18_21 = var17_20[var16_19];
                                        if (var18_21 != var13_16) {
                                            continue;
                                        }
                                        break;
                                    }
                                } else {
                                    var9_10 += -1;
                                    block2: while (var9_10 >= 0) {
                                        var12_14 = (RecyclerView$B)var11_13.get(var9_10);
                                        var10_11 = var12_14.mPosition;
                                        var19_22 = var6_6.mPrefetchRegistry;
                                        var14_17 = var19_22.c;
                                        if (var14_17 == null) break;
                                        var15_18 = var19_22.d * 2;
                                        for (var16_19 = 0; var16_19 < var15_18; var16_19 += 2) {
                                            var17_20 = var19_22.c;
                                            var18_21 = var17_20[var16_19];
                                            if (var18_21 != var10_11) continue;
                                            var9_10 += -1;
                                            continue block2;
                                        }
                                    }
                                    var9_10 += var5_5;
                                }
                            }
                            var11_13.add(var9_10, var1_1);
                            var9_10 = 1;
                        } else {
                            var9_10 = 0;
                            var8_8 = null;
                        }
                        if (var9_10 == 0) {
                            this.a((RecyclerView$B)var1_1, (boolean)var5_5);
                            var3_3 = var9_10;
                        } else {
                            var3_3 = var9_10;
                            ** continue;
                        }
                    }
                    var6_6 = var6_6.mViewInfoStore;
                    var6_6.d((RecyclerView$B)var1_1);
                    if (var3_3 == 0 && var5_5 == 0 && var2_2) {
                        vw2.a(var1_1.itemView);
                        var2_2 = false;
                        var7_7 = null;
                        var1_1.mBindingAdapter = null;
                        var1_1.mOwnerRecyclerView = null;
                    }
                    return;
                }
                var7_7 = new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                var7_7 = lu_0.a((RecyclerView)var6_6, (StringBuilder)var7_7);
                var1_1 = new IllegalArgumentException((String)var7_7);
                throw var1_1;
            }
            var4_4 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            var4_4.append(var1_1);
            var1_1 = lu_0.a((RecyclerView)var6_6, var4_4);
            var7_7 = new IllegalArgumentException((String)var1_1);
            throw var7_7;
        }
        var8_9 = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        var10_12 = var1_1.isScrap();
        var8_9.append(var10_12);
        var12_15 = " isAttached:";
        var8_9.append(var12_15);
        var1_1 = var1_1.itemView.getParent();
        if (var1_1 != null) {
            var3_3 = 1;
        }
        var8_9.append((boolean)var3_3);
        var1_1 = var6_6.exceptionLabel();
        var8_9.append((String)var1_1);
        var1_1 = var8_9.toString();
        var7_7 = new IllegalArgumentException((String)var1_1);
        throw var7_7;
    }

    public final void l(View object) {
        object = RecyclerView.getChildViewHolderInt((View)object);
        boolean bl2 = ((RecyclerView$B)object).hasAnyOfTheFlags(12);
        RecyclerView recyclerView = this.h;
        if (!bl2 && (bl2 = ((RecyclerView$B)object).isUpdated()) && !(bl2 = recyclerView.canReuseUpdatedViewHolder((RecyclerView$B)object))) {
            ArrayList arrayList = this.b;
            if (arrayList == null) {
                this.b = arrayList = new ArrayList();
            }
            bl2 = true;
            ((RecyclerView$B)object).setScrapContainer(this, bl2);
            arrayList = this.b;
            arrayList.add(object);
        } else {
            Object object2;
            bl2 = ((RecyclerView$B)object).isInvalid();
            if (bl2 && !(bl2 = ((RecyclerView$B)object).isRemoved()) && !(bl2 = ((RecyclerView$f)(object2 = recyclerView.mAdapter)).hasStableIds())) {
                object2 = new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                object2 = lu_0.a(recyclerView, (StringBuilder)object2);
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
            bl2 = false;
            ((RecyclerView$B)object).setScrapContainer(this, false);
            object2 = this.a;
            ((ArrayList)object2).add(object);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final RecyclerView$B m(int var1_1, long var2_2) {
        block79: {
            block91: {
                block86: {
                    block87: {
                        block88: {
                            block78: {
                                block82: {
                                    block85: {
                                        block84: {
                                            block83: {
                                                block76: {
                                                    block77: {
                                                        block81: {
                                                            block80: {
                                                                block75: {
                                                                    var4_3 = this;
                                                                    var5_4 = var1_1;
                                                                    var6_5 = -1;
                                                                    var7_6 = 1;
                                                                    var8_7 = this.h;
                                                                    if (var1_1 < 0 || var1_1 >= (var10_9 = (var9_8 = var8_7.mState).b())) break block79;
                                                                    var9_8 = var8_7.mState;
                                                                    var10_9 = (int)var9_8.g;
                                                                    var11_10 = 32;
                                                                    if (var10_9 == 0) break block80;
                                                                    var9_8 = this.b;
                                                                    if (var9_8 == null || (var10_9 = var9_8.size()) == 0) ** GOTO lbl-1000
                                                                    var13_12 = null;
                                                                    for (var12_11 = 0; var12_11 < var10_9; var12_11 += var7_6) {
                                                                        var14_13 = (RecyclerView$B)var4_3.b.get(var12_11);
                                                                        var15_14 = var14_13.wasReturnedFromScrap();
                                                                        if (var15_14 != 0 || (var15_14 = var14_13.getLayoutPosition()) != var5_4) continue;
                                                                        var14_13.addFlags(var11_10);
                                                                        break block75;
                                                                    }
                                                                    var13_12 = var8_7.mAdapter;
                                                                    var12_11 = (int)var13_12.hasStableIds();
                                                                    if (var12_11 != 0 && (var12_11 = (var13_12 = var8_7.mAdapterHelper).f(var5_4, 0)) > 0 && var12_11 < (var16_15 = (var14_13 = var8_7.mAdapter).getItemCount())) {
                                                                        var14_13 = var8_7.mAdapter;
                                                                        var17_16 = var14_13.getItemId(var12_11);
                                                                        var19_17 /* !! */  = null;
                                                                        for (var15_14 = 0; var15_14 < var10_9; var15_14 += var7_6) {
                                                                            var20_18 = (RecyclerView$B)var4_3.b.get(var15_14);
                                                                            var21_19 = (int)var20_18.wasReturnedFromScrap();
                                                                            if (var21_19 != 0 || (var24_21 /* !! */  = (cfr_temp_0 = (var22_20 = var20_18.getItemId()) - var17_16) == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1)) != 0) continue;
                                                                            var20_18.addFlags(var11_10);
                                                                            var14_13 = var20_18;
                                                                            break;
                                                                        }
                                                                    } else lbl-1000:
                                                                    // 3 sources

                                                                    {
                                                                        var16_15 = 0;
                                                                        var14_13 = null;
                                                                    }
                                                                }
                                                                if (var14_13 != null) {
                                                                    var10_9 = 1;
                                                                } else {
                                                                    var10_9 = 0;
                                                                    var9_8 = null;
                                                                }
                                                                break block81;
                                                            }
                                                            var10_9 = 0;
                                                            var9_8 = null;
                                                            var16_15 = 0;
                                                            var14_13 = null;
                                                        }
                                                        var13_12 = var4_3.c;
                                                        var19_17 /* !! */  = var4_3.a;
                                                        if (var14_13 != null) break block82;
                                                        var16_15 = var19_17 /* !! */ .size();
                                                        var20_18 = null;
                                                        for (var25_22 = 0; var25_22 < var16_15; var25_22 += var7_6) {
                                                            var26_23 = (RecyclerView$B)var19_17 /* !! */ .get(var25_22);
                                                            var27_24 = var26_23.wasReturnedFromScrap();
                                                            if (var27_24 != 0 || (var27_24 = var26_23.getLayoutPosition()) != var5_4 || (var27_24 = (int)var26_23.isInvalid()) != 0) continue;
                                                            var28_25 = var8_7.mState;
                                                            var27_24 = (int)var28_25.g;
                                                            if (var27_24 == 0 && (var27_24 = (int)var26_23.isRemoved()) != 0) continue;
                                                            var26_23.addFlags(var11_10);
                                                            var14_13 = var26_23;
                                                            break block76;
                                                        }
                                                        var14_13 = var8_7.mChildHelper;
                                                        var20_18 = var14_13.c;
                                                        var21_19 = var20_18.size();
                                                        var28_25 = null;
                                                        for (var27_24 = 0; var27_24 < var21_19; var27_24 += var7_6) {
                                                            var29_26 = (View)var20_18.get(var27_24);
                                                            ((RecyclerView$d)var14_13.a).getClass();
                                                            var30_27 = RecyclerView.getChildViewHolderInt(var29_26);
                                                            var11_10 = var30_27.getLayoutPosition();
                                                            if (var11_10 != var5_4 || (var11_10 = (int)var30_27.isInvalid()) != 0 || (var31_28 = (int)var30_27.isRemoved()) != 0) {
                                                                var11_10 = 32;
                                                                continue;
                                                            }
                                                            break block77;
                                                        }
                                                        var24_21 /* !! */  = 0;
                                                        var29_26 = null;
                                                    }
                                                    if (var29_26 == null) ** GOTO lbl118
                                                    var30_27 = RecyclerView.getChildViewHolderInt(var29_26);
                                                    var32_29 = var8_7.mChildHelper;
                                                    var14_13 = ((RecyclerView$d)var32_29.a).a;
                                                    var16_15 = var14_13.indexOfChild(var29_26);
                                                    if (var16_15 < 0) ** GOTO lbl112
                                                    var20_18 = var32_29.b;
                                                    var21_19 = (int)var20_18.d(var16_15);
                                                    if (var21_19 == 0) ** GOTO lbl106
                                                    var20_18.a(var16_15);
                                                    var32_29.m(var29_26);
                                                    var32_29 = var8_7.mChildHelper;
                                                    var11_10 = var32_29.j(var29_26);
                                                    if (var11_10 != var6_5) {
                                                        var8_7.mChildHelper.c(var11_10);
                                                        var4_3.l(var29_26);
                                                        var11_10 = 8224;
                                                        var30_27.addFlags(var11_10);
                                                        var14_13 = var30_27;
                                                    } else {
                                                        var34_39 /* !! */  = new StringBuilder("layout index should not be -1 after unhiding a view:");
                                                        var34_39 /* !! */ .append(var30_27);
                                                        var34_39 /* !! */  = lu_0.a(var8_7, var34_39 /* !! */ );
                                                        var33_30 = new IllegalStateException((String)var34_39 /* !! */ );
                                                        throw var33_30;
lbl106:
                                                        // 1 sources

                                                        var34_40 /* !! */  = new StringBuilder("trying to unhide a view that was not hidden");
                                                        var34_40 /* !! */ .append(var29_26);
                                                        var34_40 /* !! */  = var34_40 /* !! */ .toString();
                                                        var33_31 = new RuntimeException((String)var34_40 /* !! */ );
                                                        throw var33_31;
lbl112:
                                                        // 1 sources

                                                        var34_41 /* !! */  = new StringBuilder("view is not a child, cannot hide ");
                                                        var34_41 /* !! */ .append(var29_26);
                                                        var34_41 /* !! */  = var34_41 /* !! */ .toString();
                                                        var33_32 = new IllegalArgumentException((String)var34_41 /* !! */ );
                                                        throw var33_32;
lbl118:
                                                        // 1 sources

                                                        var31_28 = var13_12.size();
                                                        var32_29 = null;
                                                        for (var11_10 = 0; var11_10 < var31_28; var11_10 += var7_6) {
                                                            var14_13 = (RecyclerView$B)var13_12.get(var11_10);
                                                            var25_22 = (int)var14_13.isInvalid();
                                                            if (var25_22 != 0 || (var25_22 = var14_13.getLayoutPosition()) != var5_4 || (var25_22 = (int)var14_13.isAttachedToTransitionOverlay()) != 0) continue;
                                                            var13_12.remove(var11_10);
                                                            var31_28 = (int)RecyclerView.sVerboseLoggingEnabled;
                                                            if (var31_28 != 0) {
                                                                var14_13.toString();
                                                            }
                                                            break block76;
                                                        }
                                                        var16_15 = 0;
                                                        var14_13 = null;
                                                    }
                                                }
                                                if (var14_13 == null) break block82;
                                                var31_28 = (int)var14_13.isRemoved();
                                                if (var31_28 == 0) break block83;
                                                var31_28 = (int)RecyclerView.sDebugAssertionsEnabled;
                                                if (var31_28 != 0) {
                                                    var30_27 = var8_7.mState;
                                                    var31_28 = (int)var30_27.g;
                                                    if (var31_28 == 0) {
                                                        var34_42 /* !! */  = new StringBuilder("should not receive a removed view unless it is pre layout");
                                                        var34_42 /* !! */  = lu_0.a(var8_7, var34_42 /* !! */ );
                                                        var33_33 = new IllegalStateException((String)var34_42 /* !! */ );
                                                        throw var33_33;
                                                    }
                                                }
                                                var30_27 = var8_7.mState;
                                                var31_28 = (int)var30_27.g;
                                                break block84;
                                            }
                                            var31_28 = var14_13.mPosition;
                                            if (var31_28 < 0 || var31_28 >= (var11_10 = (var32_29 = var8_7.mAdapter).getItemCount())) break block85;
                                            var30_27 = var8_7.mState;
                                            var31_28 = (int)var30_27.g;
                                            if (var31_28 != 0) ** GOTO lbl-1000
                                            var30_27 = var8_7.mAdapter;
                                            var11_10 = var14_13.mPosition;
                                            var31_28 = var30_27.getItemViewType(var11_10);
                                            if (var31_28 != (var11_10 = var14_13.getItemViewType())) {
                                                while (true) {
                                                    var31_28 = 0;
                                                    var30_27 = null;
                                                    break;
                                                }
                                            } else lbl-1000:
                                            // 2 sources

                                            {
                                                if ((var31_28 = (int)(var30_27 = var8_7.mAdapter).hasStableIds()) != 0 && (var27_24 = (int)((cfr_temp_1 = (var35_47 = var14_13.getItemId()) - (var37_48 = (var20_18 = var8_7.mAdapter).getItemId(var21_19 = var14_13.mPosition))) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1))) != 0) ** continue;
                                                var31_28 = 1;
                                            }
                                        }
                                        if (var31_28 == 0) {
                                            var14_13.addFlags(4);
                                            var31_28 = (int)var14_13.isScrap();
                                            if (var31_28 != 0) {
                                                var30_27 = var14_13.itemView;
                                                var8_7.removeDetachedView((View)var30_27, false);
                                                var14_13.unScrap();
                                            } else {
                                                var31_28 = (int)var14_13.wasReturnedFromScrap();
                                                if (var31_28 != 0) {
                                                    var14_13.clearReturnedFromScrapFlag();
                                                }
                                            }
                                            var4_3.k((RecyclerView$B)var14_13);
                                            var16_15 = 0;
                                            var14_13 = null;
                                        } else {
                                            var10_9 = 1;
                                        }
                                        break block82;
                                    }
                                    var34_43 /* !! */  = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                                    var34_43 /* !! */ .append(var14_13);
                                    var34_43 /* !! */  = lu_0.a(var8_7, var34_43 /* !! */ );
                                    var33_34 = new IndexOutOfBoundsException((String)var34_43 /* !! */ );
                                    throw var33_34;
                                }
                                var39_49 = 0x7FFFFFFFFFFFFFFFL;
                                if (var14_13 != null) break block86;
                                var30_27 = var8_7.mAdapterHelper;
                                var31_28 = var30_27.f(var5_4, 0);
                                if (var31_28 < 0 || var31_28 >= (var11_10 = (var32_29 = var8_7.mAdapter).getItemCount())) break block87;
                                var32_29 = var8_7.mAdapter;
                                var11_10 = var32_29.getItemViewType(var31_28);
                                var20_18 = var8_7.mAdapter;
                                var25_22 = (int)var20_18.hasStableIds();
                                if (var25_22 == 0) break block88;
                                var14_13 = var8_7.mAdapter;
                                var37_48 = var14_13.getItemId(var31_28);
                                for (var16_15 = var19_17 /* !! */ .size() - var7_6; var16_15 >= 0; var16_15 += var6_5) {
                                    var41_50 = var19_17 /* !! */ .get(var16_15);
                                    var28_25 = var41_50;
                                    var28_25 = (RecyclerView$B)var41_50;
                                    var42_51 = var28_25.getItemId();
                                    cfr_temp_2 = var42_51 - var37_48;
                                    var24_21 /* !! */  = (int)(cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1));
                                    if (var24_21 /* !! */  != 0 || (var24_21 /* !! */  = var28_25.wasReturnedFromScrap()) != 0) continue;
                                    var24_21 /* !! */  = var28_25.getItemViewType();
                                    if (var11_10 == var24_21 /* !! */ ) {
                                        var24_21 /* !! */  = 32;
                                        var28_25.addFlags(var24_21 /* !! */ );
                                        var12_11 = (int)var28_25.isRemoved();
                                        if (var12_11 != 0) {
                                            var13_12 = var8_7.mState;
                                            var12_11 = (int)var13_12.g;
                                            if (var12_11 == 0) {
                                                var12_11 = 2;
                                                var16_15 = 14;
                                                var28_25.setFlags(var12_11, var16_15);
                                            }
                                        }
                                        break block78;
                                    }
                                    var19_17 /* !! */ .remove(var16_15);
                                    var29_26 = var28_25.itemView;
                                    var8_7.removeDetachedView(var29_26, false);
                                    var28_25 = RecyclerView.getChildViewHolderInt(var28_25.itemView);
                                    var24_21 /* !! */  = 0;
                                    var29_26 = null;
                                    var28_25.mScrapContainer = null;
                                    var28_25.mInChangeScrap = false;
                                    var28_25.clearReturnedFromScrapFlag();
                                    var4_3.k((RecyclerView$B)var28_25);
                                }
                                var16_15 = var13_12.size() - var7_6;
                                while (true) {
                                    block90: {
                                        block89: {
                                            if (var16_15 < 0) break block89;
                                            var19_17 /* !! */  = (RecyclerView$B)var13_12.get(var16_15);
                                            var44_52 = var19_17 /* !! */ .getItemId();
                                            cfr_temp_3 = var44_52 - var37_48;
                                            var46_53 /* !! */  = (long)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                                            if (var46_53 /* !! */  != false || (var27_24 = (int)var19_17 /* !! */ .isAttachedToTransitionOverlay()) != 0) break block90;
                                            var25_22 = var19_17 /* !! */ .getItemViewType();
                                            if (var11_10 == var25_22) {
                                                var13_12.remove(var16_15);
                                                var28_25 = var19_17 /* !! */ ;
                                                break;
                                            }
                                            var4_3.i(var16_15);
                                        }
                                        var27_24 = 0;
                                        var28_25 = null;
                                        break;
                                    }
                                    var16_15 += var6_5;
                                }
                            }
                            if (var28_25 != null) {
                                var28_25.mPosition = var31_28;
                                var14_13 = var28_25;
                                var10_9 = 1;
                            } else {
                                var14_13 = var28_25;
                            }
                        }
                        if (var14_13 == null) {
                            var31_28 = RecyclerView.HORIZONTAL;
                            var30_27 = (RecyclerView$t$a)this.d().a.get(var11_10);
                            if (var30_27 != null && (var12_11 = (int)(var30_27 = var30_27.a).isEmpty()) == 0) {
                                for (var12_11 = var30_27.size() - var7_6; var12_11 >= 0; var12_11 += var6_5) {
                                    var14_13 = (RecyclerView$B)var30_27.get(var12_11);
                                    var16_15 = (int)var14_13.isAttachedToTransitionOverlay();
                                    if (var16_15 != 0) continue;
                                    var34_44 = (RecyclerView$B)var30_27.remove(var12_11);
                                    break;
                                }
                            } else {
                                var6_5 = 0;
                                var34_44 = null;
                            }
                            if (var34_44 != null) {
                                var34_44.resetInternal();
                                var31_28 = (int)RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST;
                                if (var31_28 != 0 && (var12_11 = (var30_27 = var34_44.itemView) instanceof ViewGroup) != 0) {
                                    var30_27 = (ViewGroup)var30_27;
                                    RecyclerView$u.e((ViewGroup)var30_27, false);
                                }
                            }
                            var14_13 = var34_44;
                        }
                        if (var14_13 == null) {
                            var17_16 = var8_7.getNanoTime();
                            var6_5 = (int)(var2_2 == var39_49 ? 0 : (var2_2 < var39_49 ? -1 : 1));
                            if (var6_5 != 0) {
                                var34_44 = var4_3.g.a(var11_10);
                                var47_54 = var34_44.c;
                                var22_20 = 0L;
                                cfr_temp_4 = var47_54 - var22_20;
                                var6_5 = (int)(cfr_temp_4 == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1));
                                if (var6_5 != 0 && (var6_5 = (int)((cfr_temp_5 = (var47_54 += var17_16) - var2_2) == 0L ? 0 : (cfr_temp_5 < 0L ? -1 : 1))) >= 0) {
                                    var6_5 = 0;
                                    var34_44 = null;
                                } else {
                                    var6_5 = 1;
                                }
                                if (var6_5 == 0) {
                                    return null;
                                }
                            }
                            var34_44 = var8_7.mAdapter.createViewHolder(var8_7, var11_10);
                            var31_28 = (int)RecyclerView.ALLOW_THREAD_GAP_WORK;
                            if (var31_28 != 0 && (var30_27 = RecyclerView.findNestedRecyclerView(var34_44.itemView)) != null) {
                                var34_44.mNestedRecyclerView = var19_17 /* !! */  = new WeakReference(var30_27);
                            }
                            var47_54 = var8_7.getNanoTime();
                            var30_27 = var4_3.g;
                            var47_54 -= var17_16;
                            var30_27 = var30_27.a(var11_10);
                            var49_55 = var30_27.c;
                            var22_20 = 0L;
                            cfr_temp_6 = var49_55 - var22_20;
                            var16_15 = (int)(cfr_temp_6 == 0L ? 0 : (cfr_temp_6 < 0L ? -1 : 1));
                            if (var16_15 != 0) {
                                var22_20 = 4;
                                var49_55 /= var22_20;
                                var51_56 = 3;
                                var47_54 = var47_54 / var22_20 + (var49_55 *= var51_56);
                            }
                            var30_27.c = var47_54;
                            var14_13 = var34_44;
                        }
                        break block86;
                    }
                    var33_35 /* !! */  = fQ2.a("Inconsistency detected. Invalid item position ", "(offset:", ").state:", var5_4, var31_28);
                    var7_6 = var8_7.mState.b();
                    var33_35 /* !! */ .append(var7_6);
                    var53_57 = var8_7.exceptionLabel();
                    var33_35 /* !! */ .append(var53_57);
                    var33_35 /* !! */  = var33_35 /* !! */ .toString();
                    var34_45 = new IndexOutOfBoundsException((String)var33_35 /* !! */ );
                    throw var34_45;
                }
                if (var10_9 != 0) {
                    var34_44 = var8_7.mState;
                    var6_5 = (int)var34_44.g;
                    if (var6_5 == 0 && (var31_28 = (int)var14_13.hasAnyOfTheFlags(var6_5 = 8192)) != 0) {
                        var14_13.setFlags(0, var6_5);
                        var34_44 = var8_7.mState;
                        var6_5 = (int)var34_44.j;
                        if (var6_5 != 0) {
                            RecyclerView$l.a((RecyclerView$B)var14_13);
                            var34_44 = var8_7.mItemAnimator;
                            var14_13.getUnmodifiedPayloads();
                            var34_44.getClass();
                            var34_44 = new Object();
                            var34_44.a((RecyclerView$B)var14_13);
                            var8_7.recordAnimationInfoIfBouncedHiddenView((RecyclerView$B)var14_13, (RecyclerView$l$c)var34_44);
                        }
                    }
                }
                var34_44 = var8_7.mState;
                var6_5 = (int)var34_44.g;
                if (var6_5 == 0 || (var6_5 = (int)var14_13.isBound()) == 0) break block91;
                var14_13.mPreLayoutPosition = var5_4;
                ** GOTO lbl-1000
            }
            var6_5 = (int)var14_13.isBound();
            if (var6_5 != 0 && (var6_5 = (int)var14_13.needsUpdate()) == 0 && (var6_5 = (int)var14_13.isInvalid()) == 0) lbl-1000:
            // 3 sources

            {
                while (true) {
                    var5_4 = 0;
                    var33_36 = null;
                    break;
                }
            } else {
                var6_5 = (int)RecyclerView.sDebugAssertionsEnabled;
                if (var6_5 != 0 && (var6_5 = (int)var14_13.isRemoved()) != 0) {
                    var34_44 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                    var34_44.append(var14_13);
                    var34_44 = lu_0.a(var8_7, (StringBuilder)var34_44);
                    var33_37 = new IllegalStateException((String)var34_44);
                    throw var33_37;
                }
                var34_44 = var8_7.mAdapterHelper;
                var6_5 = var34_44.f(var5_4, 0);
                var31_28 = 0;
                var30_27 = null;
                var14_13.mBindingAdapter = null;
                var14_13.mOwnerRecyclerView = var8_7;
                var11_10 = var14_13.getItemViewType();
                var47_54 = var8_7.getNanoTime();
                var12_11 = (int)(var2_2 == var39_49 ? 0 : (var2_2 < var39_49 ? -1 : 1));
                if (var12_11 != 0) {
                    var13_12 = var4_3.g;
                    var32_29 = var13_12.a(var11_10);
                    if ((var24_21 /* !! */  = (cfr_temp_7 = (var49_55 = var32_29.d) - (var22_20 = 0L)) == 0L ? 0 : (cfr_temp_7 < 0L ? -1 : 1)) != 0 && (var21_19 = (int)((cfr_temp_8 = (var49_55 += var47_54) - var2_2) == 0L ? 0 : (cfr_temp_8 < 0L ? -1 : 1))) >= 0) ** continue;
                }
                if ((var11_10 = (int)var14_13.isTmpDetached()) != 0) {
                    var32_29 = var14_13.itemView;
                    var12_11 = var8_7.getChildCount();
                    var26_23 = var14_13.itemView.getLayoutParams();
                    RecyclerView.access$300(var8_7, (View)var32_29, var12_11, (ViewGroup.LayoutParams)var26_23);
                    var11_10 = 1;
                } else {
                    var11_10 = 0;
                    var32_29 = null;
                }
                var13_12 = var8_7.mAdapter;
                var13_12.bindViewHolder((RecyclerView$B)var14_13, var6_5);
                if (var11_10 != 0) {
                    var34_44 = var14_13.itemView;
                    RecyclerView.access$400(var8_7, (View)var34_44);
                }
                var49_55 = var8_7.getNanoTime();
                var34_44 = var4_3.g;
                var21_19 = var14_13.getItemViewType();
                var49_55 -= var47_54;
                var34_44 = var34_44.a(var21_19);
                var47_54 = var34_44.d;
                var22_20 = 0L;
                cfr_temp_9 = var47_54 - var22_20;
                var24_21 /* !! */  = (int)(cfr_temp_9 == 0L ? 0 : (cfr_temp_9 < 0L ? -1 : 1));
                if (var24_21 /* !! */  != 0) {
                    var22_20 = 4;
                    var47_54 /= var22_20;
                    var54_60 = 3;
                    var49_55 = var49_55 / var22_20 + (var47_54 *= var54_60);
                }
                var34_44.d = var49_55;
                var6_5 = (int)var8_7.isAccessibilityEnabled();
                if (var6_5 != 0) {
                    var34_44 = var14_13.itemView;
                    var11_10 = var34_44.getImportantForAccessibility();
                    if (var11_10 == 0) {
                        var34_44.setImportantForAccessibility(var7_6);
                    }
                    if ((var32_29 = var8_7.mAccessibilityDelegate) != null) {
                        var12_11 = (var32_29 = var32_29.getItemDelegate()) instanceof v$a;
                        if (var12_11 != 0) {
                            var13_12 = var32_29;
                            var13_12 = (v$a)var32_29;
                            var13_12.getClass();
                            var19_17 /* !! */  = ViewCompat.d((View)var34_44);
                            if (var19_17 /* !! */  != null) {
                                var31_28 = var19_17 /* !! */  instanceof a$a;
                                if (var31_28 != 0) {
                                    var19_17 /* !! */  = (a$a)var19_17 /* !! */ ;
                                    var30_27 = var19_17 /* !! */ .a;
                                } else {
                                    var30_27 = new a(var19_17 /* !! */ );
                                }
                            }
                            if (var30_27 != null && var30_27 != var13_12) {
                                var13_12 = var13_12.b;
                                var13_12.put(var34_44, var30_27);
                            }
                        }
                        ViewCompat.s((View)var34_44, (a)var32_29);
                    }
                }
                var34_44 = var8_7.mState;
                var6_5 = (int)var34_44.g;
                if (var6_5 != 0) {
                    var14_13.mPreLayoutPosition = var5_4;
                }
                var5_4 = 1;
            }
            var34_44 = var14_13.itemView.getLayoutParams();
            if (var34_44 == null) {
                var34_44 = (RecyclerView$LayoutParams)var8_7.generateDefaultLayoutParams();
                var8_7 = var14_13.itemView;
                var8_7.setLayoutParams((ViewGroup.LayoutParams)var34_44);
            } else {
                var31_28 = (int)var8_7.checkLayoutParams((ViewGroup.LayoutParams)var34_44);
                if (var31_28 == 0) {
                    var34_44 = (RecyclerView$LayoutParams)var8_7.generateLayoutParams((ViewGroup.LayoutParams)var34_44);
                    var8_7 = var14_13.itemView;
                    var8_7.setLayoutParams((ViewGroup.LayoutParams)var34_44);
                } else {
                    var34_44 = (RecyclerView$LayoutParams)var34_44;
                }
            }
            var34_44.mViewHolder = var14_13;
            if (var10_9 == 0 || var5_4 == 0) {
                var7_6 = 0;
                var53_58 = null;
            }
            var34_44.mPendingInvalidate = var7_6;
            return var14_13;
        }
        var33_38 /* !! */  = fQ2.a("Invalid item position ", "(", "). Item count:", var5_4, var5_4);
        var7_6 = var8_7.mState.b();
        var33_38 /* !! */ .append(var7_6);
        var53_59 = var8_7.exceptionLabel();
        var33_38 /* !! */ .append(var53_59);
        var33_38 /* !! */  = var33_38 /* !! */ .toString();
        var34_46 = new IndexOutOfBoundsException((String)var33_38 /* !! */ );
        throw var34_46;
    }

    public final void n(RecyclerView$B recyclerView$B) {
        boolean bl2 = recyclerView$B.mInChangeScrap;
        if (bl2) {
            ArrayList arrayList = this.b;
            arrayList.remove(recyclerView$B);
        } else {
            ArrayList arrayList = this.a;
            arrayList.remove(recyclerView$B);
        }
        recyclerView$B.mScrapContainer = null;
        recyclerView$B.mInChangeScrap = false;
        recyclerView$B.clearReturnedFromScrapFlag();
    }

    public final void o() {
        int n3;
        int n4;
        int n7;
        int n8;
        Object object = this.h.mLayout;
        if (object != null) {
            n8 = ((RecyclerView$o)object).mPrefetchMaxCountObserved;
        } else {
            n8 = 0;
            object = null;
        }
        this.f = n7 = this.e + n8;
        object = this.c;
        for (n7 = ((ArrayList)object).size() + -1; n7 >= 0 && (n4 = ((ArrayList)object).size()) > (n3 = this.f); n7 += -1) {
            this.i(n7);
        }
    }
}

