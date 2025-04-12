/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff$Mode
 *  android.view.MenuItem
 */
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/*
 * Renamed from wg3
 */
public interface wg3_1
extends MenuItem {
    public wg3_1 a(Q2 var1);

    public Q2 b();

    public int getAlphabeticModifiers();

    public CharSequence getContentDescription();

    public ColorStateList getIconTintList();

    public PorterDuff.Mode getIconTintMode();

    public int getNumericModifiers();

    public CharSequence getTooltipText();

    public MenuItem setAlphabeticShortcut(char var1, int var2);

    public wg3_1 setContentDescription(CharSequence var1);

    public MenuItem setIconTintList(ColorStateList var1);

    public MenuItem setIconTintMode(PorterDuff.Mode var1);

    public MenuItem setNumericShortcut(char var1, int var2);

    public MenuItem setShortcut(char var1, char var2, int var3, int var4);

    public wg3_1 setTooltipText(CharSequence var1);
}

