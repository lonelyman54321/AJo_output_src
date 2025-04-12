/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.google.android.material.internal;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.f;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.material.internal.ForegroundLinearLayout;
import com.google.android.material.internal.NavigationMenuItemView;
import com.google.android.material.internal.NavigationMenuPresenter;
import com.google.android.material.internal.NavigationMenuPresenter$HeaderViewHolder;
import com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuAdapter$1;
import com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuHeaderItem;
import com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuItem;
import com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuSeparatorItem;
import com.google.android.material.internal.NavigationMenuPresenter$NavigationMenuTextItem;
import com.google.android.material.internal.NavigationMenuPresenter$NormalViewHolder;
import com.google.android.material.internal.NavigationMenuPresenter$SeparatorViewHolder;
import com.google.android.material.internal.NavigationMenuPresenter$SubheaderViewHolder;
import com.google.android.material.internal.NavigationMenuPresenter$ViewHolder;
import com.google.android.material.internal.ParcelableSparseArray;
import java.util.ArrayList;

class NavigationMenuPresenter$NavigationMenuAdapter
extends RecyclerView$f {
    private static final String STATE_ACTION_VIEWS = "android:menu:action_views";
    private static final String STATE_CHECKED_ITEM = "android:menu:checked";
    private static final int VIEW_TYPE_HEADER = 3;
    private static final int VIEW_TYPE_NORMAL = 0;
    private static final int VIEW_TYPE_SEPARATOR = 2;
    private static final int VIEW_TYPE_SUBHEADER = 1;
    private f checkedItem;
    private final ArrayList items;
    final /* synthetic */ NavigationMenuPresenter this$0;
    private boolean updateSuspended;

    public NavigationMenuPresenter$NavigationMenuAdapter(NavigationMenuPresenter arrayList) {
        this.this$0 = arrayList;
        this.items = arrayList = new ArrayList();
        this.prepareMenuItems();
    }

    public static /* synthetic */ int access$100(NavigationMenuPresenter$NavigationMenuAdapter navigationMenuPresenter$NavigationMenuAdapter, int n3) {
        return navigationMenuPresenter$NavigationMenuAdapter.adjustItemPositionForA11yDelegate(n3);
    }

    private int adjustItemPositionForA11yDelegate(int n3) {
        int n4 = n3;
        for (int i3 = 0; i3 < n3; ++i3) {
            int n7;
            NavigationMenuPresenter$NavigationMenuAdapter navigationMenuPresenter$NavigationMenuAdapter = this.this$0.adapter;
            int n8 = navigationMenuPresenter$NavigationMenuAdapter.getItemViewType(i3);
            if (n8 != (n7 = 2) && (n8 = (navigationMenuPresenter$NavigationMenuAdapter = this.this$0.adapter).getItemViewType(i3)) != (n7 = 3)) continue;
            n4 += -1;
        }
        return n4;
    }

    private void appendTransparentIconIfMissing(int n3, int n4) {
        while (n3 < n4) {
            boolean bl2;
            NavigationMenuPresenter$NavigationMenuTextItem navigationMenuPresenter$NavigationMenuTextItem = (NavigationMenuPresenter$NavigationMenuTextItem)this.items.get(n3);
            navigationMenuPresenter$NavigationMenuTextItem.needsEmptyIcon = bl2 = true;
            ++n3;
        }
    }

    private void prepareMenuItems() {
        NavigationMenuPresenter$NavigationMenuAdapter navigationMenuPresenter$NavigationMenuAdapter = this;
        int n3 = this.updateSuspended;
        if (n3 != 0) {
            return;
        }
        this.updateSuspended = n3 = 1;
        this.items.clear();
        ArrayList arrayList = this.items;
        NavigationMenuPresenter$NavigationMenuHeaderItem navigationMenuPresenter$NavigationMenuHeaderItem = new NavigationMenuPresenter$NavigationMenuHeaderItem();
        arrayList.add(navigationMenuPresenter$NavigationMenuHeaderItem);
        arrayList = this.this$0.menu.getVisibleItems();
        int n4 = arrayList.size();
        navigationMenuPresenter$NavigationMenuHeaderItem = null;
        int n7 = -1;
        boolean bl2 = false;
        int n8 = 0;
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object;
            int n10;
            Object object2;
            Object object3 = (f)navigationMenuPresenter$NavigationMenuAdapter.this$0.menu.getVisibleItems().get(i3);
            boolean bl3 = ((f)object3).isChecked();
            if (bl3) {
                navigationMenuPresenter$NavigationMenuAdapter.setCheckedItem((f)object3);
            }
            if (bl3 = ((f)object3).isCheckable()) {
                ((f)object3).g(false);
            }
            if (bl3 = ((f)object3).hasSubMenu()) {
                object2 = ((f)object3).o;
                n10 = object2.hasVisibleItems();
                if (n10 != 0) {
                    Object object4;
                    NavigationMenuPresenter$NavigationMenuItem navigationMenuPresenter$NavigationMenuItem;
                    int n14;
                    NavigationMenuPresenter navigationMenuPresenter;
                    if (i3 != 0) {
                        object = navigationMenuPresenter$NavigationMenuAdapter.items;
                        navigationMenuPresenter = navigationMenuPresenter$NavigationMenuAdapter.this$0;
                        n14 = navigationMenuPresenter.paddingSeparator;
                        navigationMenuPresenter$NavigationMenuItem = new NavigationMenuPresenter$NavigationMenuSeparatorItem(n14, 0);
                        ((ArrayList)object).add(navigationMenuPresenter$NavigationMenuItem);
                    }
                    object = navigationMenuPresenter$NavigationMenuAdapter.items;
                    navigationMenuPresenter$NavigationMenuItem = new NavigationMenuPresenter$NavigationMenuTextItem((f)object3);
                    ((ArrayList)object).add(navigationMenuPresenter$NavigationMenuItem);
                    object = navigationMenuPresenter$NavigationMenuAdapter.items;
                    n10 = ((ArrayList)object).size();
                    int n15 = object2.size();
                    navigationMenuPresenter = null;
                    boolean bl4 = false;
                    for (n14 = 0; n14 < n15; ++n14) {
                        f f5 = (f)object2.getItem(n14);
                        boolean bl5 = f5.isVisible();
                        if (bl5) {
                            Object object5;
                            if (!bl4 && (object5 = f5.getIcon()) != null) {
                                bl4 = true;
                            }
                            if (bl5 = f5.isCheckable()) {
                                f5.g(false);
                            }
                            if (bl5 = ((f)object3).isChecked()) {
                                navigationMenuPresenter$NavigationMenuAdapter.setCheckedItem((f)object3);
                            }
                            object5 = navigationMenuPresenter$NavigationMenuAdapter.items;
                            object4 = new NavigationMenuPresenter$NavigationMenuTextItem(f5);
                            ((ArrayList)object5).add(object4);
                        }
                        n3 = 1;
                    }
                    if (bl4) {
                        object4 = navigationMenuPresenter$NavigationMenuAdapter.items;
                        n3 = ((ArrayList)object4).size();
                        navigationMenuPresenter$NavigationMenuAdapter.appendTransparentIconIfMissing(n10, n3);
                    }
                }
            } else {
                Object object6;
                n3 = ((f)object3).b;
                if (n3 != n7) {
                    n8 = navigationMenuPresenter$NavigationMenuAdapter.items.size();
                    object6 = ((f)object3).getIcon();
                    bl2 = object6 != null;
                    if (i3 != 0) {
                        ++n8;
                        object6 = navigationMenuPresenter$NavigationMenuAdapter.items;
                        object = navigationMenuPresenter$NavigationMenuAdapter.this$0;
                        n10 = ((NavigationMenuPresenter)object).paddingSeparator;
                        object2 = new NavigationMenuPresenter$NavigationMenuSeparatorItem(n10, n10);
                        ((ArrayList)object6).add(object2);
                    }
                } else if (!bl2 && (object6 = ((f)object3).getIcon()) != null) {
                    object6 = navigationMenuPresenter$NavigationMenuAdapter.items;
                    n7 = ((ArrayList)object6).size();
                    navigationMenuPresenter$NavigationMenuAdapter.appendTransparentIconIfMissing(n8, n7);
                    bl2 = true;
                }
                object6 = new NavigationMenuPresenter$NavigationMenuTextItem((f)object3);
                ((NavigationMenuPresenter$NavigationMenuTextItem)object6).needsEmptyIcon = bl2;
                object3 = navigationMenuPresenter$NavigationMenuAdapter.items;
                ((ArrayList)object3).add(object6);
                n7 = n3;
            }
            n3 = 1;
        }
        navigationMenuPresenter$NavigationMenuAdapter.updateSuspended = false;
    }

    private void setAccessibilityDelegate(View view, int n3, boolean bl2) {
        NavigationMenuPresenter$NavigationMenuAdapter$1 navigationMenuPresenter$NavigationMenuAdapter$1 = new NavigationMenuPresenter$NavigationMenuAdapter$1(this, n3, bl2);
        ViewCompat.s(view, navigationMenuPresenter$NavigationMenuAdapter$1);
    }

    public Bundle createInstanceState() {
        Object object;
        Bundle bundle = new Bundle();
        f f5 = this.checkedItem;
        if (f5 != null) {
            int n3 = f5.a;
            object = STATE_CHECKED_ITEM;
            bundle.putInt((String)object, n3);
        }
        f5 = new SparseArray();
        object = this.items;
        int n4 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n4; ++i3) {
            View view;
            Object object2 = (NavigationMenuPresenter$NavigationMenuItem)this.items.get(i3);
            boolean bl2 = object2 instanceof NavigationMenuPresenter$NavigationMenuTextItem;
            if (!bl2) continue;
            if ((object2 = ((NavigationMenuPresenter$NavigationMenuTextItem)object2).getMenuItem()) != null) {
                view = ((f)object2).getActionView();
            } else {
                bl2 = false;
                view = null;
            }
            if (view == null) continue;
            ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
            view.saveHierarchyState((SparseArray)parcelableSparseArray);
            int n7 = ((f)object2).a;
            f5.put(n7, (Object)parcelableSparseArray);
        }
        bundle.putSparseParcelableArray(STATE_ACTION_VIEWS, (SparseArray)f5);
        return bundle;
    }

    public f getCheckedItem() {
        return this.checkedItem;
    }

    public int getItemCount() {
        return this.items.size();
    }

    public long getItemId(int n3) {
        return n3;
    }

    public int getItemViewType(int n3) {
        ArrayList arrayList = this.items;
        Object object = (NavigationMenuPresenter$NavigationMenuItem)arrayList.get(n3);
        boolean bl2 = object instanceof NavigationMenuPresenter$NavigationMenuSeparatorItem;
        if (bl2) {
            return 2;
        }
        bl2 = object instanceof NavigationMenuPresenter$NavigationMenuHeaderItem;
        if (bl2) {
            return 3;
        }
        bl2 = object instanceof NavigationMenuPresenter$NavigationMenuTextItem;
        if (bl2) {
            n3 = (int)(((f)(object = ((NavigationMenuPresenter$NavigationMenuTextItem)object).getMenuItem())).hasSubMenu() ? 1 : 0);
            if (n3 != 0) {
                return 1;
            }
            return 0;
        }
        object = new RuntimeException("Unknown item type.");
        throw object;
    }

    public int getRowCount() {
        NavigationMenuPresenter$NavigationMenuAdapter navigationMenuPresenter$NavigationMenuAdapter;
        int n3;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = (navigationMenuPresenter$NavigationMenuAdapter = this.this$0.adapter).getItemCount()); ++i3) {
            int n7;
            navigationMenuPresenter$NavigationMenuAdapter = this.this$0.adapter;
            n3 = navigationMenuPresenter$NavigationMenuAdapter.getItemViewType(i3);
            if (n3 != 0 && n3 != (n7 = 1)) continue;
            ++n4;
        }
        return n4;
    }

    public void onBindViewHolder(NavigationMenuPresenter$ViewHolder object, int n3) {
        int n4 = this.getItemViewType(n3);
        if (n4) {
            int n7 = 1;
            if (n4 != n7) {
                int bl2 = 2;
                if (n4 == bl2) {
                    NavigationMenuPresenter$NavigationMenuSeparatorItem navigationMenuPresenter$NavigationMenuSeparatorItem = (NavigationMenuPresenter$NavigationMenuSeparatorItem)this.items.get(n3);
                    object = ((RecyclerView$B)object).itemView;
                    NavigationMenuPresenter navigationMenuPresenter = this.this$0;
                    n4 = navigationMenuPresenter.dividerInsetStart;
                    int n8 = navigationMenuPresenter$NavigationMenuSeparatorItem.getPaddingTop();
                    NavigationMenuPresenter navigationMenuPresenter2 = this.this$0;
                    int n10 = navigationMenuPresenter2.dividerInsetEnd;
                    n3 = navigationMenuPresenter$NavigationMenuSeparatorItem.getPaddingBottom();
                    object.setPadding(n4, n8, n10, n3);
                }
            } else {
                object = (TextView)((RecyclerView$B)object).itemView;
                CharSequence charSequence = ((NavigationMenuPresenter$NavigationMenuTextItem)this.items.get((int)n3)).getMenuItem().e;
                object.setText(charSequence);
                n4 = this.this$0.subheaderTextAppearance;
                Hm3.f((TextView)object, n4);
                n4 = this.this$0.subheaderInsetStart;
                int n14 = object.getPaddingTop();
                NavigationMenuPresenter navigationMenuPresenter = this.this$0;
                int n15 = navigationMenuPresenter.subheaderInsetEnd;
                int n16 = object.getPaddingBottom();
                object.setPadding(n4, n14, n15, n16);
                charSequence = this.this$0.subheaderColor;
                if (charSequence != null) {
                    object.setTextColor((ColorStateList)charSequence);
                }
                this.setAccessibilityDelegate((View)object, n3, n7 != 0);
            }
        } else {
            object = (NavigationMenuItemView)((RecyclerView$B)object).itemView;
            Object object2 = this.this$0.iconTintList;
            ((NavigationMenuItemView)object).setIconTintList((ColorStateList)object2);
            n4 = this.this$0.textAppearance;
            ((NavigationMenuItemView)object).setTextAppearance(n4);
            object2 = this.this$0.textColor;
            if (object2 != null) {
                ((NavigationMenuItemView)object).setTextColor((ColorStateList)object2);
            }
            if ((object2 = this.this$0.itemBackground) != null) {
                object2 = object2.getConstantState().newDrawable();
            } else {
                n4 = 0;
                object2 = null;
            }
            Object object3 = ViewCompat.a;
            object.setBackground((Drawable)object2);
            object2 = this.this$0.itemForeground;
            if (object2 != null) {
                object2 = object2.getConstantState().newDrawable();
                ((ForegroundLinearLayout)((Object)object)).setForeground((Drawable)object2);
            }
            object2 = (NavigationMenuPresenter$NavigationMenuTextItem)this.items.get(n3);
            boolean bl2 = ((NavigationMenuPresenter$NavigationMenuTextItem)object2).needsEmptyIcon;
            ((NavigationMenuItemView)object).setNeedsEmptyIcon(bl2);
            object3 = this.this$0;
            int n17 = ((NavigationMenuPresenter)object3).itemHorizontalPadding;
            int n18 = ((NavigationMenuPresenter)object3).itemVerticalPadding;
            object.setPadding(n17, n18, n17, n18);
            int n19 = this.this$0.itemIconPadding;
            ((NavigationMenuItemView)object).setIconPadding(n19);
            object3 = this.this$0;
            n17 = (int)(((NavigationMenuPresenter)object3).hasCustomItemIconSize ? 1 : 0);
            if (n17 != 0) {
                int n20 = ((NavigationMenuPresenter)object3).itemIconSize;
                ((NavigationMenuItemView)object).setIconSize(n20);
            }
            int n21 = NavigationMenuPresenter.access$000(this.this$0);
            ((NavigationMenuItemView)object).setMaxLines(n21);
            object2 = ((NavigationMenuPresenter$NavigationMenuTextItem)object2).getMenuItem();
            object3 = this.this$0;
            boolean bl3 = ((NavigationMenuPresenter)object3).textAppearanceActiveBoldEnabled;
            ((NavigationMenuItemView)object).initialize((f)object2, bl3);
            n4 = 0;
            object2 = null;
            this.setAccessibilityDelegate((View)object, n3, false);
        }
    }

    public NavigationMenuPresenter$ViewHolder onCreateViewHolder(ViewGroup object, int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n4 = 2;
                if (n3 != n4) {
                    int n7 = 3;
                    if (n3 != n7) {
                        return null;
                    }
                    LinearLayout linearLayout = this.this$0.headerLayout;
                    object = new NavigationMenuPresenter$HeaderViewHolder((View)linearLayout);
                    return object;
                }
                LayoutInflater layoutInflater = this.this$0.layoutInflater;
                NavigationMenuPresenter$SeparatorViewHolder navigationMenuPresenter$SeparatorViewHolder = new NavigationMenuPresenter$SeparatorViewHolder(layoutInflater, (ViewGroup)object);
                return navigationMenuPresenter$SeparatorViewHolder;
            }
            LayoutInflater layoutInflater = this.this$0.layoutInflater;
            NavigationMenuPresenter$SubheaderViewHolder navigationMenuPresenter$SubheaderViewHolder = new NavigationMenuPresenter$SubheaderViewHolder(layoutInflater, (ViewGroup)object);
            return navigationMenuPresenter$SubheaderViewHolder;
        }
        NavigationMenuPresenter navigationMenuPresenter = this.this$0;
        LayoutInflater layoutInflater = navigationMenuPresenter.layoutInflater;
        navigationMenuPresenter = navigationMenuPresenter.onClickListener;
        NavigationMenuPresenter$NormalViewHolder navigationMenuPresenter$NormalViewHolder = new NavigationMenuPresenter$NormalViewHolder(layoutInflater, (ViewGroup)object, (View.OnClickListener)navigationMenuPresenter);
        return navigationMenuPresenter$NormalViewHolder;
    }

    public void onViewRecycled(NavigationMenuPresenter$ViewHolder object) {
        boolean bl2 = object instanceof NavigationMenuPresenter$NormalViewHolder;
        if (bl2) {
            object = (NavigationMenuItemView)((RecyclerView$B)object).itemView;
            ((NavigationMenuItemView)object).recycle();
        }
    }

    public void restoreInstanceState(Bundle bundle) {
        int n3;
        View view;
        int n4;
        Object object;
        Object object2 = STATE_CHECKED_ITEM;
        int n7 = 0;
        int n8 = bundle.getInt((String)object2, 0);
        if (n8 != 0) {
            this.updateSuspended = true;
            object = this.items;
            n4 = ((ArrayList)object).size();
            view = null;
            for (n3 = 0; n3 < n4; ++n3) {
                Object object3 = (NavigationMenuPresenter$NavigationMenuItem)this.items.get(n3);
                int n10 = object3 instanceof NavigationMenuPresenter$NavigationMenuTextItem;
                if (n10 == 0 || (object3 = ((NavigationMenuPresenter$NavigationMenuTextItem)object3).getMenuItem()) == null || (n10 = ((f)object3).a) != n8) continue;
                this.setCheckedItem((f)object3);
                break;
            }
            this.updateSuspended = false;
            this.prepareMenuItems();
        }
        if ((bundle = bundle.getSparseParcelableArray((String)(object2 = STATE_ACTION_VIEWS))) != null) {
            object2 = this.items;
            n8 = ((ArrayList)object2).size();
            while (n7 < n8) {
                object = (NavigationMenuPresenter$NavigationMenuItem)this.items.get(n7);
                n3 = object instanceof NavigationMenuPresenter$NavigationMenuTextItem;
                if (n3 != 0 && (object = ((NavigationMenuPresenter$NavigationMenuTextItem)object).getMenuItem()) != null && (view = ((f)object).getActionView()) != null && (object = (ParcelableSparseArray)((Object)bundle.get(n4 = ((f)object).a))) != null) {
                    view.restoreHierarchyState((SparseArray)object);
                }
                ++n7;
            }
        }
    }

    public void setCheckedItem(f f5) {
        boolean bl2;
        f f6 = this.checkedItem;
        if (f6 != f5 && (bl2 = f5.isCheckable())) {
            f6 = this.checkedItem;
            if (f6 != null) {
                f6.setChecked(false);
            }
            this.checkedItem = f5;
            bl2 = true;
            f5.setChecked(bl2);
        }
    }

    public void setUpdateSuspended(boolean bl2) {
        this.updateSuspended = bl2;
    }

    public void update() {
        this.prepareMenuItems();
        this.notifyDataSetChanged();
    }
}

