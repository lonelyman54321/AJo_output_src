/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ActivityNotFoundException
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.SparseArray
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.KeyCharacterMap$KeyData
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  android.view.ViewConfiguration
 */
package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.d$a;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class d
implements ug3_2 {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder;
    private ArrayList mActionItems;
    private d$a mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction = 0;
    private f mExpandedItem;
    private boolean mGroupDividerEnabled;
    Drawable mHeaderIcon;
    CharSequence mHeaderTitle;
    View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing = false;
    private boolean mIsVisibleItemsStale;
    private ArrayList mItems;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private ArrayList mNonActionItems;
    private boolean mOptionalIconsVisible = false;
    private boolean mOverrideVisibleItems;
    private CopyOnWriteArrayList mPresenters;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private ArrayList mTempShortcutItemList;
    private ArrayList mVisibleItems;

    static {
        int[] nArray;
        int[] nArray2 = nArray = new int[6];
        int[] nArray3 = nArray;
        nArray2[0] = 1;
        nArray3[1] = 4;
        nArray2[2] = 5;
        nArray3[3] = 3;
        nArray2[4] = 2;
        nArray3[5] = 0;
        sCategoryToOrder = nArray;
    }

    public d(Context object) {
        ArrayList arrayList;
        boolean bl2;
        List list;
        this.mTempShortcutItemList = list = new List();
        this.mPresenters = list;
        this.mGroupDividerEnabled = false;
        this.mContext = object;
        object = object.getResources();
        this.mResources = object;
        super();
        this.mItems = object;
        super();
        this.mVisibleItems = object;
        this.mIsVisibleItemsStale = bl2 = true;
        this.mActionItems = arrayList = new ArrayList();
        this.mNonActionItems = arrayList = new ArrayList();
        this.mIsActionItemsStale = bl2;
        this.setShortcutsVisibleInner(bl2);
    }

    private f createNewMenuItem(int n3, int n4, int n7, int n8, CharSequence charSequence, int n10) {
        f f5 = new f(this, n3, n4, n7, n8, charSequence, n10);
        return f5;
    }

    private void dispatchPresenterUpdate(boolean bl2) {
        boolean bl3;
        Object object = this.mPresenters;
        boolean bl4 = ((CopyOnWriteArrayList)object).isEmpty();
        if (bl4) {
            return;
        }
        this.stopDispatchingItemsChanged();
        object = this.mPresenters.iterator();
        while (bl3 = object.hasNext()) {
            WeakReference weakReference = (WeakReference)object.next();
            Object object2 = (h)weakReference.get();
            if (object2 == null) {
                object2 = this.mPresenters;
                ((CopyOnWriteArrayList)object2).remove(weakReference);
                continue;
            }
            object2.updateMenuView(bl2);
        }
        this.startDispatchingItemsChanged();
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        boolean bl2;
        Object object = PRESENTER_KEY;
        if ((bundle = bundle.getSparseParcelableArray((String)object)) != null && !(bl2 = ((CopyOnWriteArrayList)(object = this.mPresenters)).isEmpty())) {
            int n3;
            object = this.mPresenters.iterator();
            while ((n3 = object.hasNext()) != 0) {
                WeakReference weakReference = (WeakReference)object.next();
                Object object2 = (h)weakReference.get();
                if (object2 == null) {
                    object2 = this.mPresenters;
                    ((CopyOnWriteArrayList)object2).remove(weakReference);
                    continue;
                }
                n3 = object2.getId();
                if (n3 <= 0 || (weakReference = (Parcelable)bundle.get(n3)) == null) continue;
                object2.onRestoreInstanceState((Parcelable)weakReference);
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        int n3;
        CopyOnWriteArrayList copyOnWriteArrayList = this.mPresenters;
        boolean bl2 = copyOnWriteArrayList.isEmpty();
        if (bl2) {
            return;
        }
        copyOnWriteArrayList = new SparseArray();
        Iterator iterator = this.mPresenters.iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            WeakReference weakReference = (WeakReference)iterator.next();
            Object object = (h)weakReference.get();
            if (object == null) {
                object = this.mPresenters;
                ((CopyOnWriteArrayList)object).remove(weakReference);
                continue;
            }
            n3 = object.getId();
            if (n3 <= 0 || (object = object.onSaveInstanceState()) == null) continue;
            copyOnWriteArrayList.put(n3, object);
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, (SparseArray)copyOnWriteArrayList);
    }

    private boolean dispatchSubMenuSelected(j j3, h object) {
        Object object2 = this.mPresenters;
        boolean bl2 = ((CopyOnWriteArrayList)object2).isEmpty();
        boolean bl3 = false;
        if (bl2) {
            return false;
        }
        if (object != null) {
            bl3 = object.onSubMenuSelected(j3);
        }
        object = this.mPresenters.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (WeakReference)object.next();
            Object object3 = (h)((Reference)object2).get();
            if (object3 == null) {
                object3 = this.mPresenters;
                ((CopyOnWriteArrayList)object3).remove(object2);
                continue;
            }
            if (bl3) continue;
            bl3 = bl2 = object3.onSubMenuSelected(j3);
        }
        return bl3;
    }

    private static int findInsertIndex(ArrayList arrayList, int n3) {
        for (int i3 = arrayList.size() + -1; i3 >= 0; i3 += -1) {
            f f5 = (f)arrayList.get(i3);
            int n4 = f5.d;
            if (n4 > n3) continue;
            return i3 + 1;
        }
        return 0;
    }

    private static int getOrdering(int n3) {
        int[] nArray;
        int n4;
        int n7 = (0xFFFF0000 & n3) >> 16;
        if (n7 >= 0 && n7 < (n4 = (nArray = sCategoryToOrder).length)) {
            n7 = nArray[n7] << 16;
            return n3 & (char)-1 | n7;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("order does not contain a valid category.");
        throw illegalArgumentException;
    }

    private void removeItemAtInt(int n3, boolean bl2) {
        ArrayList arrayList;
        int n4;
        if (n3 >= 0 && n3 < (n4 = (arrayList = this.mItems).size())) {
            arrayList = this.mItems;
            arrayList.remove(n3);
            if (bl2) {
                n3 = 1;
                this.onItemsChanged(n3 != 0);
            }
        }
    }

    private void setHeaderInternal(int n3, CharSequence charSequence, int n4, Drawable drawable2, View view) {
        Resources resources = this.getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            CharSequence charSequence2;
            if (n3 > 0) {
                this.mHeaderTitle = charSequence2 = resources.getText(n3);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (n4 > 0) {
                charSequence2 = t70.getDrawable(this.getContext(), n4);
                this.mHeaderIcon = charSequence2;
            } else if (drawable2 != null) {
                this.mHeaderIcon = drawable2;
            }
            this.mHeaderView = null;
        }
        this.onItemsChanged(false);
    }

    /*
     * WARNING - void declaration
     */
    private void setShortcutsVisibleInner(boolean bl2) {
        boolean bl3 = false;
        if (bl2) {
            Configuration configuration = this.mResources.getConfiguration();
            int n3 = configuration.keyboard;
            int n4 = 1;
            if (n3 != n4) {
                void var1_7;
                configuration = ViewConfiguration.get((Context)this.mContext);
                Object object = this.mContext;
                Object object2 = OC3.a;
                int n7 = Build.VERSION.SDK_INT;
                int n8 = 28;
                if (n7 >= n8) {
                    boolean bl4 = OC3$b.b((ViewConfiguration)configuration);
                } else {
                    boolean bl5;
                    String string2;
                    configuration = object.getResources();
                    int n10 = configuration.getIdentifier((String)(object = "config_showMenuShortcutsWhenKeyboardPresent"), (String)(object2 = "bool"), string2 = "android");
                    if (n10 != 0 && (bl5 = configuration.getBoolean(n10))) {
                        boolean bl6 = true;
                    } else {
                        boolean bl7 = false;
                        configuration = null;
                    }
                }
                if (var1_7 != false) {
                    bl3 = true;
                }
            }
        }
        this.mShortcutsVisible = bl3;
    }

    public MenuItem add(int n3) {
        String string2 = this.mResources.getString(n3);
        return this.addInternal(0, 0, 0, string2);
    }

    public MenuItem add(int n3, int n4, int n7, int n8) {
        String string2 = this.mResources.getString(n8);
        return this.addInternal(n3, n4, n7, string2);
    }

    public MenuItem add(int n3, int n4, int n7, CharSequence charSequence) {
        return this.addInternal(n3, n4, n7, charSequence);
    }

    public MenuItem add(CharSequence charSequence) {
        return this.addInternal(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int n3, int n4, int n7, ComponentName object, Intent[] intentArray, Intent intent, int n8, MenuItem[] menuItemArray) {
        PackageManager packageManager = this.mContext.getPackageManager();
        int n10 = 0;
        int n14 = (object = packageManager.queryIntentActivityOptions((ComponentName)object, intentArray, intent, 0)) != null ? object.size() : 0;
        if ((n8 &= 1) == 0) {
            this.removeGroup(n3);
        }
        while (n10 < n14) {
            ResolveInfo resolveInfo = (ResolveInfo)object.get(n10);
            int n15 = resolveInfo.specificIndex;
            Object object2 = n15 < 0 ? intent : intentArray[n15];
            Intent intent2 = new Intent(object2);
            Object object3 = resolveInfo.activityInfo;
            String string2 = object3.applicationInfo.packageName;
            object3 = object3.name;
            object2 = new ComponentName(string2, (String)object3);
            intent2.setComponent((ComponentName)object2);
            object2 = resolveInfo.loadLabel(packageManager);
            object2 = this.add(n3, n4, n7, (CharSequence)object2);
            object3 = resolveInfo.loadIcon(packageManager);
            object2 = object2.setIcon((Drawable)object3);
            intent2 = object2.setIntent(intent2);
            if (menuItemArray != null && (n8 = resolveInfo.specificIndex) >= 0) {
                menuItemArray[n8] = intent2;
            }
            ++n10;
        }
        return n14;
    }

    public MenuItem addInternal(int n3, int n4, int n7, CharSequence charSequence) {
        int n8 = d.getOrdering(n7);
        int n10 = this.mDefaultShowAsAction;
        f f5 = this.createNewMenuItem(n3, n4, n7, n8, charSequence, n10);
        Object object = this.mCurrentMenuInfo;
        if (object != null) {
            f5.D = object;
        }
        object = this.mItems;
        n7 = d.findInsertIndex((ArrayList)object, n8);
        ((ArrayList)object).add(n7, f5);
        this.onItemsChanged(true);
        return f5;
    }

    public void addMenuPresenter(h h3) {
        Context context = this.mContext;
        this.addMenuPresenter(h3, context);
    }

    public void addMenuPresenter(h h3, Context context) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.mPresenters;
        WeakReference<h> weakReference = new WeakReference<h>(h3);
        copyOnWriteArrayList.add(weakReference);
        h3.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    public SubMenu addSubMenu(int n3) {
        String string2 = this.mResources.getString(n3);
        return this.addSubMenu(0, 0, 0, string2);
    }

    public SubMenu addSubMenu(int n3, int n4, int n7, int n8) {
        String string2 = this.mResources.getString(n8);
        return this.addSubMenu(n3, n4, n7, string2);
    }

    public SubMenu addSubMenu(int n3, int n4, int n7, CharSequence charSequence) {
        j j3;
        Object object = (f)this.addInternal(n3, n4, n7, charSequence);
        Context context = this.mContext;
        ((f)object).o = j3 = new j(context, this, (f)object);
        object = ((f)object).e;
        j3.setHeaderTitle((CharSequence)object);
        return j3;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return this.addSubMenu(0, 0, 0, charSequence);
    }

    public void changeMenuMode() {
        d$a d$a = this.mCallback;
        if (d$a != null) {
            d$a.onMenuModeChange(this);
        }
    }

    public void clear() {
        f f5 = this.mExpandedItem;
        if (f5 != null) {
            this.collapseItemActionView(f5);
        }
        this.mItems.clear();
        this.onItemsChanged(true);
    }

    public void clearAll() {
        boolean bl2;
        this.mPreventDispatchingItemsChanged = bl2 = true;
        this.clear();
        this.clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        this.onItemsChanged(bl2);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        this.onItemsChanged(false);
    }

    public void close() {
        this.close(true);
    }

    public final void close(boolean bl2) {
        boolean bl3;
        boolean bl4 = this.mIsClosing;
        if (bl4) {
            return;
        }
        this.mIsClosing = bl4 = true;
        Iterator iterator = this.mPresenters.iterator();
        while (bl3 = iterator.hasNext()) {
            WeakReference weakReference = (WeakReference)iterator.next();
            Object object = (h)weakReference.get();
            if (object == null) {
                object = this.mPresenters;
                ((CopyOnWriteArrayList)object).remove(weakReference);
                continue;
            }
            object.onCloseMenu(this, bl2);
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(f f5) {
        Iterator iterator = this.mPresenters;
        boolean bl2 = ((CopyOnWriteArrayList)((Object)iterator)).isEmpty();
        boolean bl3 = false;
        if (!bl2 && (iterator = this.mExpandedItem) == f5) {
            boolean bl4;
            this.stopDispatchingItemsChanged();
            iterator = this.mPresenters.iterator();
            while (bl4 = iterator.hasNext()) {
                WeakReference weakReference = (WeakReference)iterator.next();
                Object object = (h)weakReference.get();
                if (object == null) {
                    object = this.mPresenters;
                    ((CopyOnWriteArrayList)object).remove(weakReference);
                    continue;
                }
                bl3 = object.collapseItemActionView(this, f5);
                if (!bl3) continue;
            }
            this.startDispatchingItemsChanged();
            if (bl3) {
                f5 = null;
                this.mExpandedItem = null;
            }
        }
        return bl3;
    }

    public boolean dispatchMenuItemSelected(d d2, MenuItem menuItem) {
        boolean bl2;
        d$a d$a = this.mCallback;
        if (d$a != null && (bl2 = d$a.onMenuItemSelected(d2, menuItem))) {
            bl2 = true;
        } else {
            bl2 = false;
            d2 = null;
        }
        return bl2;
    }

    public boolean expandItemActionView(f f5) {
        boolean bl2;
        Object object = this.mPresenters;
        boolean bl3 = ((CopyOnWriteArrayList)object).isEmpty();
        boolean bl4 = false;
        if (bl3) {
            return false;
        }
        this.stopDispatchingItemsChanged();
        object = this.mPresenters.iterator();
        while (bl2 = object.hasNext()) {
            WeakReference weakReference = (WeakReference)object.next();
            Object object2 = (h)weakReference.get();
            if (object2 == null) {
                object2 = this.mPresenters;
                ((CopyOnWriteArrayList)object2).remove(weakReference);
                continue;
            }
            bl4 = object2.expandItemActionView(this, f5);
            if (!bl4) continue;
        }
        this.startDispatchingItemsChanged();
        if (bl4) {
            this.mExpandedItem = f5;
        }
        return bl4;
    }

    public int findGroupIndex(int n3) {
        return this.findGroupIndex(n3, 0);
    }

    public int findGroupIndex(int n3, int n4) {
        int n7 = this.size();
        if (n4 < 0) {
            n4 = 0;
        }
        while (n4 < n7) {
            f f5 = (f)this.mItems.get(n4);
            int n8 = f5.b;
            if (n8 == n3) {
                return n4;
            }
            ++n4;
        }
        return -1;
    }

    public MenuItem findItem(int n3) {
        int n4 = this.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            f f5 = (f)this.mItems.get(i3);
            int n7 = f5.a;
            if (n7 == n3) {
                return f5;
            }
            n7 = (int)(f5.hasSubMenu() ? 1 : 0);
            if (n7 == 0 || (f5 = f5.o.findItem(n3)) == null) continue;
            return f5;
        }
        return null;
    }

    public int findItemIndex(int n3) {
        int n4 = this.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            f f5 = (f)this.mItems.get(i3);
            int n7 = f5.a;
            if (n7 != n3) continue;
            return i3;
        }
        return -1;
    }

    public f findItemWithShortcutForKey(int n3, KeyEvent keyEvent) {
        ArrayList arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        this.findItemsWithShortcutForKey(arrayList, n3, keyEvent);
        int n4 = arrayList.isEmpty();
        if (n4 != 0) {
            return null;
        }
        n4 = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int n7 = arrayList.size();
        int n8 = 1;
        if (n7 == n8) {
            return (f)arrayList.get(0);
        }
        n8 = (int)(this.isQwertyMode() ? 1 : 0);
        for (int i3 = 0; i3 < n7; ++i3) {
            int n10;
            f f5 = (f)arrayList.get(i3);
            int n14 = n8 != 0 ? f5.j : f5.h;
            char[] cArray = keyData.meta;
            int n15 = cArray[0];
            if (!(n14 == n15 && (n15 = n4 & 2) == 0 || n14 == (n10 = cArray[n15 = 2]) && (n10 = n4 & 2) != 0) && (n8 == 0 || n14 != (n10 = 8) || n3 != (n14 = 67))) continue;
            return f5;
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List list, int n3, KeyEvent keyEvent) {
        boolean bl2 = this.isQwertyMode();
        int n4 = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        int n7 = keyEvent.getKeyData(keyData);
        int n8 = 67;
        if (n7 == 0 && n3 != n8) {
            return;
        }
        ArrayList arrayList = this.mItems;
        n7 = arrayList.size();
        for (int i3 = 0; i3 < n7; ++i3) {
            char[] cArray;
            f f5 = (f)this.mItems.get(i3);
            int n10 = f5.hasSubMenu();
            if (n10 != 0) {
                j j3 = f5.o;
                j3.findItemsWithShortcutForKey(list, n3, keyEvent);
            }
            n10 = bl2 ? f5.j : f5.h;
            int n14 = bl2 ? f5.k : f5.i;
            int n15 = 69647;
            int n16 = n4 & n15;
            if (n16 != (n14 &= n15) || n10 == 0 || n10 != (n15 = (cArray = keyData.meta)[0]) && n10 != (n14 = cArray[n15 = 2]) && (!bl2 || n10 != (n14 = 8) || n3 != n8) || (n10 = (int)(f5.isEnabled() ? 1 : 0)) == 0) continue;
            list.add(f5);
        }
    }

    public void flagActionItems() {
        Object object;
        Object object2;
        int n3;
        ArrayList arrayList = this.getVisibleItems();
        int n4 = this.mIsActionItemsStale;
        if (n4 == 0) {
            return;
        }
        Object object3 = this.mPresenters.iterator();
        int n7 = 0;
        while ((n3 = object3.hasNext()) != 0) {
            object2 = (WeakReference)object3.next();
            object = (h)((Reference)object2).get();
            if (object == null) {
                object = this.mPresenters;
                ((CopyOnWriteArrayList)object).remove(object2);
                continue;
            }
            n3 = object.flagActionItems();
            n7 |= n3;
        }
        if (n7 != 0) {
            this.mActionItems.clear();
            object3 = this.mNonActionItems;
            ((ArrayList)object3).clear();
            n4 = arrayList.size();
            for (n7 = 0; n7 < n4; ++n7) {
                object2 = (f)arrayList.get(n7);
                boolean bl2 = ((f)object2).f();
                if (bl2) {
                    object = this.mActionItems;
                    ((ArrayList)object).add(object2);
                    continue;
                }
                object = this.mNonActionItems;
                ((ArrayList)object).add(object2);
            }
        } else {
            this.mActionItems.clear();
            this.mNonActionItems.clear();
            arrayList = this.mNonActionItems;
            object3 = this.getVisibleItems();
            arrayList.addAll(object3);
        }
        this.mIsActionItemsStale = false;
    }

    public ArrayList getActionItems() {
        this.flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public f getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    public MenuItem getItem(int n3) {
        return (MenuItem)this.mItems.get(n3);
    }

    public ArrayList getNonActionItems() {
        this.flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public d getRootMenu() {
        return this;
    }

    public ArrayList getVisibleItems() {
        int n3 = this.mIsVisibleItemsStale;
        if (n3 == 0) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        ArrayList arrayList = this.mItems;
        n3 = arrayList.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            f f5 = (f)this.mItems.get(i3);
            boolean bl2 = f5.isVisible();
            if (!bl2) continue;
            ArrayList arrayList2 = this.mVisibleItems;
            arrayList2.add(f5);
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    public boolean hasVisibleItems() {
        int n3 = this.mOverrideVisibleItems;
        boolean bl2 = true;
        if (n3 != 0) {
            return bl2;
        }
        n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            f f5 = (f)this.mItems.get(i3);
            boolean bl3 = f5.isVisible();
            if (!bl3) continue;
            return bl2;
        }
        return false;
    }

    public boolean isDispatchingItemsChanged() {
        return this.mPreventDispatchingItemsChanged ^ true;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    public boolean isShortcutKey(int n3, KeyEvent keyEvent) {
        f f5 = this.findItemWithShortcutForKey(n3, keyEvent);
        if (f5 != null) {
            n3 = 1;
        } else {
            n3 = 0;
            f5 = null;
        }
        return n3 != 0;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void onItemActionRequestChanged(f f5) {
        boolean bl2;
        this.mIsActionItemsStale = bl2 = true;
        this.onItemsChanged(bl2);
    }

    public void onItemVisibleChanged(f f5) {
        boolean bl2;
        this.mIsVisibleItemsStale = bl2 = true;
        this.onItemsChanged(bl2);
    }

    public void onItemsChanged(boolean bl2) {
        boolean bl3 = this.mPreventDispatchingItemsChanged;
        boolean bl4 = true;
        if (!bl3) {
            if (bl2) {
                this.mIsVisibleItemsStale = bl4;
                this.mIsActionItemsStale = bl4;
            }
            this.dispatchPresenterUpdate(bl2);
        } else {
            this.mItemsChangedWhileDispatchPrevented = bl4;
            if (bl2) {
                this.mStructureChangedWhileDispatchPrevented = bl4;
            }
        }
    }

    public boolean performIdentifierAction(int n3, int n4) {
        MenuItem menuItem = this.findItem(n3);
        return this.performItemAction(menuItem, n4);
    }

    public boolean performItemAction(MenuItem menuItem, int n3) {
        return this.performItemAction(menuItem, null, n3);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean performItemAction(MenuItem var1_1, h var2_2, int var3_3) {
        block17: {
            block16: {
                block18: {
                    var1_1 /* !! */  = (f)var1_1 /* !! */ ;
                    var4_4 /* !! */  = null;
                    if (var1_1 /* !! */  == null || !(var5_5 = var1_1 /* !! */ .isEnabled())) break block17;
                    var6_6 = var1_1 /* !! */ .p;
                    var7_7 = true;
                    if (var6_6 != null && (var5_5 = var6_6.onMenuItemClick(var1_1 /* !! */ ))) lbl-1000:
                    // 4 sources

                    {
                        while (true) {
                            var5_5 = true;
                            break block16;
                            break;
                        }
                    }
                    var6_6 = var1_1 /* !! */ .n;
                    var8_9 = var6_6.dispatchMenuItemSelected((d)var6_6, var1_1 /* !! */ );
                    if (var8_9) ** GOTO lbl-1000
                    var9_8 = var1_1 /* !! */ .g;
                    if (var9_8 == null) break block18;
                    try {
                        var6_6 = var6_6.getContext();
                    }
                    catch (ActivityNotFoundException v0) {}
                    var9_8 = var1_1 /* !! */ .g;
                    var6_6.startActivity((Intent)var9_8);
                    ** GOTO lbl-1000
                }
                if ((var6_6 = var1_1 /* !! */ .A) == null || !(var5_5 = var6_6.e())) ** break;
                ** while (true)
                var5_5 = false;
                var6_6 = null;
            }
            var9_8 = var1_1 /* !! */ .A;
            var10_10 = var9_8 != null && (var10_10 = var9_8.a()) != false;
            var11_11 = var1_1 /* !! */ .e();
            if (var11_11) {
                var12_12 = var1_1 /* !! */ .expandActionView();
                if (var5_5 |= var12_12) {
                    this.close(var7_7);
                }
            } else {
                var11_11 = var1_1 /* !! */ .hasSubMenu();
                if (!var11_11 && !var10_10) {
                    var12_13 = var3_3 & 1;
                    if (var12_13 == 0) {
                        this.close(var7_7);
                    }
                } else {
                    if ((var3_3 &= 4) == 0) {
                        this.close(false);
                    }
                    if ((var3_3 = (int)var1_1 /* !! */ .hasSubMenu()) == 0) {
                        var4_4 /* !! */  = this.getContext();
                        var1_1 /* !! */ .o = var13_15 = new j(var4_4 /* !! */ , this, (f)var1_1 /* !! */ );
                        var4_4 /* !! */  = var1_1 /* !! */ .e;
                        var13_15.setHeaderTitle((CharSequence)var4_4 /* !! */ );
                    }
                    var1_1 /* !! */  = var1_1 /* !! */ .o;
                    if (var10_10) {
                        var9_8.f((j)var1_1 /* !! */ );
                    }
                    if (!(var5_5 |= (var12_14 = this.dispatchSubMenuSelected((j)var1_1 /* !! */ , var2_2)))) {
                        this.close(var7_7);
                    }
                }
            }
            return var5_5;
        }
        return false;
    }

    public boolean performShortcut(int n3, KeyEvent keyEvent, int n4) {
        f f5 = this.findItemWithShortcutForKey(n3, keyEvent);
        if (f5 != null) {
            n3 = (int)(this.performItemAction(f5, n4) ? 1 : 0);
        } else {
            n3 = 0;
            f5 = null;
        }
        int bl2 = n4 & 2;
        if (bl2 != 0) {
            boolean bl3 = true;
            this.close(bl3);
        }
        return n3 != 0;
    }

    public void removeGroup(int n3) {
        int n4 = this.findGroupIndex(n3);
        if (n4 >= 0) {
            ArrayList arrayList = this.mItems;
            int n7 = arrayList.size() - n4;
            int n8 = 0;
            f f5 = null;
            while (true) {
                int n10 = n8 + 1;
                if (n8 >= n7) break;
                f5 = (f)this.mItems.get(n4);
                n8 = f5.b;
                if (n8 != n3) break;
                this.removeItemAtInt(n4, false);
                n8 = n10;
            }
            n3 = 1;
            this.onItemsChanged(n3 != 0);
        }
    }

    public void removeItem(int n3) {
        n3 = this.findItemIndex(n3);
        this.removeItemAtInt(n3, true);
    }

    public void removeItemAt(int n3) {
        this.removeItemAtInt(n3, true);
    }

    public void removeMenuPresenter(h h3) {
        boolean bl2;
        Iterator iterator = this.mPresenters.iterator();
        while (bl2 = iterator.hasNext()) {
            WeakReference weakReference = (WeakReference)iterator.next();
            Object object = (h)weakReference.get();
            if (object != null && object != h3) continue;
            object = this.mPresenters;
            ((CopyOnWriteArrayList)object).remove(weakReference);
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        String string2 = this.getActionViewStatesKey();
        string2 = bundle.getSparseParcelableArray(string2);
        int n3 = this.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            int n4;
            int n7;
            Object object = this.getItem(i3);
            View view = object.getActionView();
            if (view != null && (n7 = view.getId()) != (n4 = -1)) {
                view.restoreHierarchyState((SparseArray)string2);
            }
            if (!(bl2 = object.hasSubMenu())) continue;
            object = (j)object.getSubMenu();
            ((d)object).restoreActionViewStates(bundle);
        }
        string2 = EXPANDED_ACTION_VIEW_ID;
        int n8 = bundle.getInt(string2);
        if (n8 > 0 && (bundle = this.findItem(n8)) != null) {
            bundle.expandActionView();
        }
    }

    public void restorePresenterStates(Bundle bundle) {
        this.dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int n3 = this.size();
        SparseArray sparseArray = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            boolean bl2;
            int n4;
            int n7;
            Object object = this.getItem(i3);
            Object object2 = object.getActionView();
            if (object2 != null && (n7 = object2.getId()) != (n4 = -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                object2.saveHierarchyState(sparseArray);
                bl2 = object.isActionViewExpanded();
                if (bl2) {
                    object2 = EXPANDED_ACTION_VIEW_ID;
                    n7 = object.getItemId();
                    bundle.putInt((String)object2, n7);
                }
            }
            if (!(bl2 = object.hasSubMenu())) continue;
            object = (j)object.getSubMenu();
            ((d)object).saveActionViewStates(bundle);
        }
        if (sparseArray != null) {
            String string2 = this.getActionViewStatesKey();
            bundle.putSparseParcelableArray(string2, sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        this.dispatchSaveInstanceState(bundle);
    }

    public void setCallback(d$a d$a) {
        this.mCallback = d$a;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public d setDefaultShowAsAction(int n3) {
        this.mDefaultShowAsAction = n3;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int n3 = menuItem.getGroupId();
        ArrayList arrayList = this.mItems;
        int n4 = arrayList.size();
        this.stopDispatchingItemsChanged();
        for (int i3 = 0; i3 < n4; ++i3) {
            Object object = (f)this.mItems.get(i3);
            int n7 = ((f)object).b;
            if (n7 != n3 || (n7 = ((f)object).x & 4) == 0 || (n7 = (int)(((f)object).isCheckable() ? 1 : 0)) == 0) continue;
            n7 = object == menuItem ? 1 : 0;
            int n8 = ((f)object).x;
            int n10 = n8 & 0xFFFFFFFD;
            n7 = n7 != 0 ? 2 : 0;
            ((f)object).x = n7 |= n10;
            if (n8 == n7) continue;
            object = ((f)object).n;
            ((d)object).onItemsChanged(false);
        }
        this.startDispatchingItemsChanged();
    }

    public void setGroupCheckable(int n3, boolean bl2, boolean bl3) {
        ArrayList arrayList = this.mItems;
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            f f5 = (f)this.mItems.get(i3);
            int n7 = f5.b;
            if (n7 != n3) continue;
            f5.g(bl3);
            f5.setCheckable(bl2);
        }
    }

    public void setGroupDividerEnabled(boolean bl2) {
        this.mGroupDividerEnabled = bl2;
    }

    public void setGroupEnabled(int n3, boolean bl2) {
        ArrayList arrayList = this.mItems;
        int n4 = arrayList.size();
        for (int i3 = 0; i3 < n4; ++i3) {
            f f5 = (f)this.mItems.get(i3);
            int n7 = f5.b;
            if (n7 != n3) continue;
            f5.setEnabled(bl2);
        }
    }

    public void setGroupVisible(int n3, boolean bl2) {
        boolean bl3;
        ArrayList arrayList = this.mItems;
        int n4 = arrayList.size();
        int n7 = 0;
        boolean bl4 = false;
        while (true) {
            bl3 = true;
            if (n7 >= n4) break;
            f f5 = (f)this.mItems.get(n7);
            int n8 = f5.b;
            if (n8 == n3) {
                n8 = f5.x;
                int n10 = n8 & 0xFFFFFFF7;
                int n14 = bl2 ? 0 : 8;
                f5.x = n10 |= n14;
                if (n8 != n10) {
                    bl4 = true;
                }
            }
            ++n7;
        }
        if (bl4) {
            this.onItemsChanged(bl3);
        }
    }

    public d setHeaderIconInt(int n3) {
        this.setHeaderInternal(0, null, n3, null, null);
        return this;
    }

    public d setHeaderIconInt(Drawable drawable2) {
        this.setHeaderInternal(0, null, 0, drawable2, null);
        return this;
    }

    public d setHeaderTitleInt(int n3) {
        this.setHeaderInternal(n3, null, 0, null, null);
        return this;
    }

    public d setHeaderTitleInt(CharSequence charSequence) {
        this.setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    public d setHeaderViewInt(View view) {
        this.setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean bl2) {
        this.mOptionalIconsVisible = bl2;
    }

    public void setOverrideVisibleItems(boolean bl2) {
        this.mOverrideVisibleItems = bl2;
    }

    public void setQwertyMode(boolean bl2) {
        this.mQwertyMode = bl2;
        this.onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean bl2) {
        boolean bl3 = this.mShortcutsVisible;
        if (bl3 == bl2) {
            return;
        }
        this.setShortcutsVisibleInner(bl2);
        this.onItemsChanged(false);
    }

    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        boolean bl2 = false;
        this.mPreventDispatchingItemsChanged = false;
        boolean bl3 = this.mItemsChangedWhileDispatchPrevented;
        if (bl3) {
            this.mItemsChangedWhileDispatchPrevented = false;
            bl2 = this.mStructureChangedWhileDispatchPrevented;
            this.onItemsChanged(bl2);
        }
    }

    public void stopDispatchingItemsChanged() {
        boolean bl2 = this.mPreventDispatchingItemsChanged;
        if (!bl2) {
            this.mPreventDispatchingItemsChanged = true;
            bl2 = false;
            this.mItemsChangedWhileDispatchPrevented = false;
            this.mStructureChangedWhileDispatchPrevented = false;
        }
    }
}

