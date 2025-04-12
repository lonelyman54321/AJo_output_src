/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.CheckableGroup$1;
import com.google.android.material.internal.CheckableGroup$OnCheckedStateChangeListener;
import com.google.android.material.internal.MaterialCheckable;
import com.google.android.material.internal.MaterialCheckable$OnCheckedChangeListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CheckableGroup {
    private final Map checkables;
    private final Set checkedIds;
    private CheckableGroup$OnCheckedStateChangeListener onCheckedStateChangeListener;
    private boolean selectionRequired;
    private boolean singleSelection;

    public CheckableGroup() {
        Cloneable cloneable;
        this.checkables = cloneable = new Cloneable();
        this.checkedIds = cloneable;
    }

    public static /* synthetic */ boolean access$000(CheckableGroup checkableGroup, MaterialCheckable materialCheckable) {
        return checkableGroup.checkInternal(materialCheckable);
    }

    public static /* synthetic */ boolean access$100(CheckableGroup checkableGroup) {
        return checkableGroup.selectionRequired;
    }

    public static /* synthetic */ boolean access$200(CheckableGroup checkableGroup, MaterialCheckable materialCheckable, boolean bl2) {
        return checkableGroup.uncheckInternal(materialCheckable, bl2);
    }

    public static /* synthetic */ void access$300(CheckableGroup checkableGroup) {
        checkableGroup.onCheckedStateChanged();
    }

    private boolean checkInternal(MaterialCheckable materialCheckable) {
        int bl2 = materialCheckable.getId();
        Object object = this.checkedIds;
        Integer n3 = bl2;
        boolean bl3 = object.contains(n3);
        n3 = null;
        if (bl3) {
            return false;
        }
        object = this.checkables;
        int n4 = this.getSingleCheckedId();
        Integer n7 = n4;
        if ((object = (MaterialCheckable)object.get(n7)) != null) {
            this.uncheckInternal((MaterialCheckable)object, false);
        }
        object = this.checkedIds;
        Integer n8 = bl2;
        boolean bl4 = object.add(n8);
        bl3 = materialCheckable.isChecked();
        if (!bl3) {
            bl3 = true;
            materialCheckable.setChecked(bl3);
        }
        return bl4;
    }

    private void onCheckedStateChanged() {
        CheckableGroup$OnCheckedStateChangeListener checkableGroup$OnCheckedStateChangeListener = this.onCheckedStateChangeListener;
        if (checkableGroup$OnCheckedStateChangeListener != null) {
            Set set = this.getCheckedIds();
            checkableGroup$OnCheckedStateChangeListener.onCheckedStateChanged(set);
        }
    }

    private boolean uncheckInternal(MaterialCheckable materialCheckable, boolean bl2) {
        Integer n3;
        Set set;
        int n4 = materialCheckable.getId();
        Set set2 = this.checkedIds;
        Integer n7 = n4;
        boolean bl3 = set2.contains(n7);
        n7 = null;
        if (!bl3) {
            return false;
        }
        if (bl2 && (bl2 = (set = this.checkedIds).size()) == (bl3 = true) && (bl2 = (set = this.checkedIds).contains(n3 = Integer.valueOf(n4)))) {
            materialCheckable.setChecked(bl3);
            return false;
        }
        set = this.checkedIds;
        Integer n8 = n4;
        bl2 = set.remove(n8);
        n4 = (int)(materialCheckable.isChecked() ? 1 : 0);
        if (n4 != 0) {
            materialCheckable.setChecked(false);
        }
        return bl2;
    }

    public void addCheckable(MaterialCheckable materialCheckable) {
        Object object = this.checkables;
        int n3 = materialCheckable.getId();
        Integer n4 = n3;
        object.put(n4, materialCheckable);
        boolean bl2 = materialCheckable.isChecked();
        if (bl2) {
            this.checkInternal(materialCheckable);
        }
        object = new CheckableGroup$1(this);
        materialCheckable.setInternalOnCheckedChangeListener((MaterialCheckable$OnCheckedChangeListener)object);
    }

    public void check(int n3) {
        Map map2 = this.checkables;
        Object object = n3;
        if ((object = (MaterialCheckable)map2.get(object)) == null) {
            return;
        }
        n3 = (int)(this.checkInternal((MaterialCheckable)object) ? 1 : 0);
        if (n3 != 0) {
            this.onCheckedStateChanged();
        }
    }

    public void clearCheck() {
        boolean bl2;
        Set set = this.checkedIds;
        boolean bl3 = set.isEmpty() ^ true;
        Iterator iterator = this.checkables.values().iterator();
        while (bl2 = iterator.hasNext()) {
            MaterialCheckable materialCheckable = (MaterialCheckable)iterator.next();
            this.uncheckInternal(materialCheckable, false);
        }
        if (bl3) {
            this.onCheckedStateChanged();
        }
    }

    public Set getCheckedIds() {
        Set set = this.checkedIds;
        HashSet hashSet = new HashSet(set);
        return hashSet;
    }

    public List getCheckedIdsSortedByChildOrder(ViewGroup viewGroup) {
        int n3;
        Set set = this.getCheckedIds();
        ArrayList<View> arrayList = new ArrayList<View>();
        for (int i3 = 0; i3 < (n3 = viewGroup.getChildCount()); ++i3) {
            Integer n4;
            Object object = viewGroup.getChildAt(i3);
            boolean bl2 = object instanceof MaterialCheckable;
            if (!bl2 || !(bl2 = set.contains(n4 = Integer.valueOf(object.getId())))) continue;
            n3 = object.getId();
            object = n3;
            arrayList.add((View)object);
        }
        return arrayList;
    }

    public int getSingleCheckedId() {
        Object object;
        int n3 = this.singleSelection;
        if (n3 != 0 && (n3 = (int)((object = this.checkedIds).isEmpty() ? 1 : 0)) == 0) {
            object = (Integer)this.checkedIds.iterator().next();
            n3 = (Integer)object;
        } else {
            n3 = -1;
        }
        return n3;
    }

    public boolean isSelectionRequired() {
        return this.selectionRequired;
    }

    public boolean isSingleSelection() {
        return this.singleSelection;
    }

    public void removeCheckable(MaterialCheckable object) {
        object.setInternalOnCheckedChangeListener(null);
        Object object2 = this.checkables;
        Integer n3 = object.getId();
        object2.remove(n3);
        object2 = this.checkedIds;
        object = object.getId();
        object2.remove(object);
    }

    public void setOnCheckedStateChangeListener(CheckableGroup$OnCheckedStateChangeListener checkableGroup$OnCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = checkableGroup$OnCheckedStateChangeListener;
    }

    public void setSelectionRequired(boolean bl2) {
        this.selectionRequired = bl2;
    }

    public void setSingleSelection(boolean bl2) {
        boolean bl3 = this.singleSelection;
        if (bl3 != bl2) {
            this.singleSelection = bl2;
            this.clearCheck();
        }
    }

    public void uncheck(int n3) {
        Map map2 = this.checkables;
        Object object = n3;
        if ((object = (MaterialCheckable)map2.get(object)) == null) {
            return;
        }
        boolean bl2 = this.selectionRequired;
        n3 = (int)(this.uncheckInternal((MaterialCheckable)object, bl2) ? 1 : 0);
        if (n3 != 0) {
            this.onCheckedStateChanged();
        }
    }
}

