/*
 * Decompiled with CFR 0.152.
 */
package com.google.accompanist.systemuicontroller;

import kotlin.jvm.functions.Function1;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public interface SystemUiController {
    public boolean getNavigationBarDarkContentEnabled();

    public boolean getStatusBarDarkContentEnabled();

    public int getSystemBarsBehavior();

    public boolean getSystemBarsDarkContentEnabled();

    public boolean isNavigationBarContrastEnforced();

    public boolean isNavigationBarVisible();

    public boolean isStatusBarVisible();

    public boolean isSystemBarsVisible();

    public void setNavigationBarColor-Iv8Zu3U(long var1, boolean var3, boolean var4, Function1 var5);

    public void setNavigationBarContrastEnforced(boolean var1);

    public void setNavigationBarDarkContentEnabled(boolean var1);

    public void setNavigationBarVisible(boolean var1);

    public void setStatusBarColor-ek8zF_U(long var1, boolean var3, Function1 var4);

    public void setStatusBarDarkContentEnabled(boolean var1);

    public void setStatusBarVisible(boolean var1);

    public void setSystemBarsBehavior(int var1);

    public void setSystemBarsColor-Iv8Zu3U(long var1, boolean var3, boolean var4, Function1 var5);

    public void setSystemBarsDarkContentEnabled(boolean var1);

    public void setSystemBarsVisible(boolean var1);
}

