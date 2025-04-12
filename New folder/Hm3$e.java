/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.text.Editable
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.widget.TextView
 */
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public final class Hm3$e
implements ActionMode.Callback {
    public final ActionMode.Callback a;
    public final TextView b;
    public Class c;
    public Method d;
    public boolean e;
    public boolean f;

    public Hm3$e(ActionMode.Callback callback2, TextView textView) {
        this.a = callback2;
        this.b = textView;
        this.f = false;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.a.onActionItemClicked(actionMode, menuItem);
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu2) {
        return this.a.onCreateActionMode(actionMode, menu2);
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
        this.a.onDestroyActionMode(actionMode);
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu2) {
        boolean bl2;
        String string2;
        CharSequence charSequence;
        int n3;
        Intent intent;
        int n4;
        Object[] objectArray;
        Object object;
        ArrayList<Intent> arrayList;
        Object object2;
        PackageManager packageManager;
        Context context;
        TextView textView;
        int n7;
        block37: {
            block36: {
                n7 = 1;
                textView = this.b;
                context = textView.getContext();
                packageManager = context.getPackageManager();
                boolean bl3 = this.f;
                object2 = "removeItemAt";
                if (!bl3) {
                    this.f = n7;
                    arrayList = "com.android.internal.view.menu.MenuBuilder";
                    arrayList = Class.forName((String)((Object)arrayList));
                    this.c = arrayList;
                    object = new Class[n7];
                    objectArray = Integer.TYPE;
                    object[0] = objectArray;
                    arrayList = ((Class)((Object)arrayList)).getDeclaredMethod((String)object2, (Class<?>)object);
                    this.d = arrayList;
                    try {
                        this.e = n7;
                    }
                    catch (ClassNotFoundException | NoSuchMethodException reflectiveOperationException) {
                        bl3 = false;
                        arrayList = null;
                        this.c = null;
                        this.d = null;
                        this.e = false;
                    }
                }
                bl3 = this.e;
                if (!bl3) break block36;
                arrayList = this.c;
                bl3 = ((Class)((Object)arrayList)).isInstance(menu2);
                if (!bl3) break block36;
                arrayList = this.d;
                break block37;
            }
            arrayList = menu2.getClass();
            object = new Class[n7];
            objectArray = Integer.TYPE;
            object[0] = objectArray;
            arrayList = ((Class)((Object)arrayList)).getDeclaredMethod((String)object2, (Class<?>)object);
        }
        try {
            n4 = menu2.size() - n7;
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {}
        while (true) {
            block38: {
                object = "android.intent.action.PROCESS_TEXT";
                if (n4 < 0) break;
                objectArray = menu2.getItem(n4);
                intent = objectArray.getIntent();
                if (intent == null) break block38;
                objectArray = objectArray.getIntent();
                objectArray = objectArray.getAction();
                boolean bl4 = ((String)object).equals(objectArray);
                if (!bl4) break block38;
                object = n4;
                objectArray = new Object[n7];
                objectArray[0] = object;
                ((Method)((Object)arrayList)).invoke(menu2, objectArray);
            }
            n4 += -1;
        }
        arrayList = new ArrayList<Intent>();
        n4 = context instanceof Activity;
        objectArray = "text/plain";
        if (n4 != 0) {
            object2 = new Intent();
            object2 = object2.setAction((String)object).setType((String)objectArray);
            object2 = packageManager.queryIntentActivities((Intent)object2, 0).iterator();
            while ((n3 = object2.hasNext()) != 0) {
                intent = (ResolveInfo)object2.next();
                charSequence = context.getPackageName();
                int n8 = ((String)charSequence).equals(string2 = intent.activityInfo.packageName);
                if (n8 == 0) {
                    charSequence = intent.activityInfo;
                    bl2 = ((ActivityInfo)charSequence).exported;
                    if (!bl2 || (charSequence = ((ActivityInfo)charSequence).permission) != null && (n8 = Im3.a(context, (String)charSequence)) != 0) continue;
                }
                arrayList.add(intent);
            }
        }
        context = null;
        for (int i3 = 0; i3 < (n4 = arrayList.size()); i3 += n7) {
            object2 = (ResolveInfo)arrayList.get(i3);
            n3 = i3 + 100;
            charSequence = object2.loadLabel(packageManager);
            intent = menu2.add(0, 0, n3, charSequence);
            charSequence = new Intent();
            charSequence = charSequence.setAction((String)object).setType((String)objectArray);
            bl2 = textView instanceof Editable;
            if (bl2 && (bl2 = textView.onCheckIsTextEditor()) && (bl2 = (boolean)((View)textView).isEnabled())) {
                bl2 = true;
            } else {
                bl2 = false;
                string2 = null;
            }
            String string3 = "android.intent.extra.PROCESS_TEXT_READONLY";
            charSequence = charSequence.putExtra(string3, bl2 ^= n7);
            object2 = ((ResolveInfo)object2).activityInfo;
            string2 = ((ActivityInfo)object2).packageName;
            object2 = ((ActivityInfo)object2).name;
            object2 = charSequence.setClassName(string2, (String)object2);
            object2 = intent.setIntent((Intent)object2);
            object2.setShowAsAction(n7);
        }
        return this.a.onPrepareActionMode(actionMode, menu2);
    }
}

