/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ClipData
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.View
 *  android.view.View$OnCreateContextMenuListener
 *  android.widget.Toast
 */
package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.R$string;

public final class Preference$c
implements View.OnCreateContextMenuListener,
MenuItem.OnMenuItemClickListener {
    public final Preference a;

    public Preference$c(Preference preference) {
        this.a = preference;
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View object, ContextMenu.ContextMenuInfo object2) {
        object = this.a;
        object2 = ((Preference)object).b();
        int n3 = ((Preference)object).s;
        if (n3 != 0 && (n3 = TextUtils.isEmpty((CharSequence)object2)) == 0) {
            contextMenu.setHeaderTitle((CharSequence)object2);
            n3 = R$string.copy;
            object2 = null;
            contextMenu = contextMenu.add(0, 0, 0, n3);
            contextMenu.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)this);
        }
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        boolean bl2 = true;
        Preference preference = this.a;
        Object object = (ClipboardManager)preference.a.getSystemService("clipboard");
        CharSequence charSequence = preference.b();
        Object[] objectArray = ClipData.newPlainText((CharSequence)"Preference", (CharSequence)charSequence);
        object.setPrimaryClip((ClipData)objectArray);
        preference = preference.a;
        int n3 = R$string.preference_copied;
        objectArray = new Object[bl2];
        objectArray[0] = charSequence;
        object = preference.getString(n3, objectArray);
        Toast.makeText((Context)preference, (CharSequence)object, (int)0).show();
        return bl2;
    }
}

