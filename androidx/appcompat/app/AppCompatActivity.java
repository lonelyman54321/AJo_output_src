/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.DisplayMetrics
 *  android.view.KeyEvent
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 */
package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity$a;
import androidx.appcompat.app.AppCompatActivity$b;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.app.a$a;
import androidx.appcompat.app.g;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;

public class AppCompatActivity
extends FragmentActivity
implements Rm,
Ui3$a {
    private static final String DELEGATE_TAG = "androidx:appcompat";
    private g mDelegate;
    private Resources mResources;

    public AppCompatActivity() {
        this.initDelegate();
    }

    public AppCompatActivity(int n3) {
        super(n3);
        this.initDelegate();
    }

    private void initDelegate() {
        Object object = this.getSavedStateRegistry();
        AppCompatActivity$a appCompatActivity$a = new AppCompatActivity$a(this);
        ((xs2_1)object).c(DELEGATE_TAG, appCompatActivity$a);
        object = new AppCompatActivity$b(this);
        this.addOnContextAvailableListener((u82_0)object);
    }

    private void initViewTreeOwners() {
        VD3.b(this.getWindow().getDecorView(), this);
        ae3_0.b(this.getWindow().getDecorView(), this);
        ZD3.b(this.getWindow().getDecorView(), this);
        YD3.a(this.getWindow().getDecorView(), this);
    }

    private boolean performMenuItemShortcut(KeyEvent keyEvent) {
        boolean bl2;
        View view;
        Window window;
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 26;
        return n3 < n4 && (n3 = (int)(keyEvent.isCtrlPressed() ? 1 : 0)) == 0 && (n3 = (int)(KeyEvent.metaStateHasNoModifiers((int)keyEvent.getMetaState()) ? 1 : 0)) == 0 && (n3 = keyEvent.getRepeatCount()) == 0 && (n3 = (int)(KeyEvent.isModifierKey((int)keyEvent.getKeyCode()) ? 1 : 0)) == 0 && (window = this.getWindow()) != null && (view = window.getDecorView()) != null && (bl2 = (window = window.getDecorView()).dispatchKeyShortcutEvent(keyEvent));
    }

    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.initViewTreeOwners();
        this.getDelegate().a(view, layoutParams);
    }

    public void attachBaseContext(Context context) {
        context = this.getDelegate().b(context);
        super.attachBaseContext(context);
    }

    public void closeOptionsMenu() {
        boolean bl2;
        ActionBar actionBar = this.getSupportActionBar();
        Window window = this.getWindow();
        boolean bl3 = window.hasFeature(0);
        if (bl3 && (actionBar == null || !(bl2 = actionBar.a()))) {
            super.closeOptionsMenu();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int n3 = keyEvent.getKeyCode();
        ActionBar actionBar = this.getSupportActionBar();
        int n4 = 82;
        if (n3 == n4 && actionBar != null && (n3 = (int)(actionBar.k(keyEvent) ? 1 : 0)) != 0) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public View findViewById(int n3) {
        return this.getDelegate().c(n3);
    }

    public g getDelegate() {
        Object object = this.mDelegate;
        if (object == null) {
            object = g.a;
            this.mDelegate = object = new AppCompatDelegateImpl((Context)this, null, this, this);
        }
        return this.mDelegate;
    }

    public a$a getDrawerToggleDelegate() {
        return this.getDelegate().e();
    }

    public MenuInflater getMenuInflater() {
        return this.getDelegate().g();
    }

    public Resources getResources() {
        Resources resources = this.mResources;
        if (resources == null) {
        }
        if (resources == null) {
            resources = super.getResources();
        }
        return resources;
    }

    public ActionBar getSupportActionBar() {
        return this.getDelegate().h();
    }

    public Intent getSupportParentActivityIntent() {
        return dU1.a(this);
    }

    public void invalidateOptionsMenu() {
        this.getDelegate().j();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        g g3 = this.getDelegate();
        g3.l(configuration);
        configuration = this.mResources;
        if (configuration != null) {
            configuration = super.getResources().getConfiguration();
            g3 = super.getResources().getDisplayMetrics();
            Resources resources = this.mResources;
            resources.updateConfiguration(configuration, (DisplayMetrics)g3);
        }
    }

    public void onContentChanged() {
        this.onSupportContentChanged();
    }

    public void onCreateSupportNavigateUpTaskStack(Ui3 iterable) {
        iterable.getClass();
        Intent intent = this.getSupportParentActivityIntent();
        if (intent == null) {
            intent = dU1.a(this);
        }
        if (intent != null) {
            ComponentName componentName = intent.getComponent();
            if (componentName == null) {
                componentName = ((Ui3)iterable).b.getPackageManager();
                componentName = intent.resolveActivity((PackageManager)componentName);
            }
            ((Ui3)iterable).a(componentName);
            iterable = ((Ui3)iterable).a;
            ((ArrayList)iterable).add(intent);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.getDelegate().n();
    }

    public boolean onKeyDown(int n3, KeyEvent keyEvent) {
        boolean bl2 = this.performMenuItemShortcut(keyEvent);
        if (bl2) {
            return true;
        }
        return super.onKeyDown(n3, keyEvent);
    }

    public void onLocalesChanged(jw1 jw12) {
    }

    public final boolean onMenuItemSelected(int n3, MenuItem menuItem) {
        int n4;
        if ((n3 = (int)(super.onMenuItemSelected(n3, menuItem) ? 1 : 0)) != 0) {
            return true;
        }
        ActionBar actionBar = this.getSupportActionBar();
        int n7 = menuItem.getItemId();
        if (n7 == (n4 = 16908332) && actionBar != null && (n3 = actionBar.d() & 4) != 0) {
            return this.onSupportNavigateUp();
        }
        return false;
    }

    public boolean onMenuOpened(int n3, Menu menu2) {
        return super.onMenuOpened(n3, menu2);
    }

    public void onNightModeChanged(int n3) {
    }

    public void onPanelClosed(int n3, Menu menu2) {
        super.onPanelClosed(n3, menu2);
    }

    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        this.getDelegate().o();
    }

    public void onPostResume() {
        super.onPostResume();
        this.getDelegate().p();
    }

    public void onPrepareSupportNavigateUpTaskStack(Ui3 ui3) {
    }

    public void onStart() {
        super.onStart();
        this.getDelegate().q();
    }

    public void onStop() {
        super.onStop();
        this.getDelegate().r();
    }

    public void onSupportActionModeFinished(P2 p2) {
    }

    public void onSupportActionModeStarted(P2 p2) {
    }

    public void onSupportContentChanged() {
    }

    public boolean onSupportNavigateUp() {
        Object object = this.getSupportParentActivityIntent();
        if (object != null) {
            boolean bl2 = this.supportShouldUpRecreateTask((Intent)object);
            if (bl2) {
                object = new Ui3((Context)this);
                this.onCreateSupportNavigateUpTaskStack((Ui3)object);
                this.onPrepareSupportNavigateUpTaskStack((Ui3)object);
                ((Ui3)object).d();
                try {
                    this.finishAffinity();
                }
                catch (IllegalStateException illegalStateException) {
                    this.finish();
                }
            } else {
                this.supportNavigateUpTo((Intent)object);
            }
            return true;
        }
        return false;
    }

    public void onTitleChanged(CharSequence charSequence, int n3) {
        super.onTitleChanged(charSequence, n3);
        this.getDelegate().z(charSequence);
    }

    public P2 onWindowStartingSupportActionMode(P2$a p2$a) {
        return null;
    }

    public void openOptionsMenu() {
        boolean bl2;
        ActionBar actionBar = this.getSupportActionBar();
        Window window = this.getWindow();
        boolean bl3 = window.hasFeature(0);
        if (bl3 && (actionBar == null || !(bl2 = actionBar.l()))) {
            super.openOptionsMenu();
        }
    }

    public void setContentView(int n3) {
        this.initViewTreeOwners();
        this.getDelegate().u(n3);
    }

    public void setContentView(View view) {
        this.initViewTreeOwners();
        this.getDelegate().v(view);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.initViewTreeOwners();
        this.getDelegate().w(view, layoutParams);
    }

    public void setSupportActionBar(Toolbar toolbar) {
        this.getDelegate().x(toolbar);
    }

    public void setSupportProgress(int n3) {
    }

    public void setSupportProgressBarIndeterminate(boolean bl2) {
    }

    public void setSupportProgressBarIndeterminateVisibility(boolean bl2) {
    }

    public void setSupportProgressBarVisibility(boolean bl2) {
    }

    public void setTheme(int n3) {
        super.setTheme(n3);
        this.getDelegate().y(n3);
    }

    public P2 startSupportActionMode(P2$a p2$a) {
        return this.getDelegate().A(p2$a);
    }

    public void supportInvalidateOptionsMenu() {
        this.getDelegate().j();
    }

    public void supportNavigateUpTo(Intent intent) {
        this.navigateUpTo(intent);
    }

    public boolean supportRequestWindowFeature(int n3) {
        return this.getDelegate().t(n3);
    }

    public boolean supportShouldUpRecreateTask(Intent intent) {
        return this.shouldUpRecreateTask(intent);
    }
}

