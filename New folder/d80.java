/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.AssetManager
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.os.Build$VERSION
 *  android.view.LayoutInflater
 */
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.view.LayoutInflater;
import androidx.appcompat.R$style;

public final class d80
extends ContextWrapper {
    public static Configuration f;
    public int a;
    public Resources.Theme b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;

    public d80() {
        super(null);
    }

    public d80(Context context, int n3) {
        super(context);
        this.a = n3;
    }

    public final void a(Configuration object) {
        Resources resources = this.e;
        if (resources == null) {
            resources = this.d;
            if (resources == null) {
                resources = new Configuration(object);
                this.d = resources;
                return;
            }
            object = new IllegalStateException("Override configuration has already been set");
            throw object;
        }
        object = new IllegalStateException("getResources() or getAssets() has already been called");
        throw object;
    }

    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        Resources.Theme theme = this.b;
        if (theme == null) {
            this.b = theme = this.getResources().newTheme();
            theme = this.getBaseContext().getTheme();
            if (theme != null) {
                Resources.Theme theme2 = this.b;
                theme2.setTo(theme);
            }
        }
        theme = this.b;
        int n3 = this.a;
        theme.applyStyle(n3, true);
    }

    public final AssetManager getAssets() {
        return this.getResources().getAssets();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Resources getResources() {
        Resources resources;
        block4: {
            block5: {
                boolean bl2;
                resources = this.e;
                if (resources != null) return this.e;
                resources = this.d;
                if (resources == null) break block4;
                int n3 = Build.VERSION.SDK_INT;
                int n4 = 26;
                if (n3 < n4) break block5;
                Configuration configuration = f;
                if (configuration == null) {
                    configuration = new Configuration();
                    n4 = 0;
                    configuration.fontScale = 0.0f;
                    f = configuration;
                }
                if (bl2 = resources.equals(configuration = f)) break block4;
            }
            resources = this.d;
            this.e = resources = this.createConfigurationContext((Configuration)resources).getResources();
            return this.e;
        }
        this.e = resources = super.getResources();
        return this.e;
    }

    public final Object getSystemService(String string2) {
        String string3 = "layout_inflater";
        boolean bl2 = string3.equals(string2);
        if (bl2) {
            string2 = this.c;
            if (string2 == null) {
                string2 = LayoutInflater.from((Context)this.getBaseContext()).cloneInContext((Context)this);
                this.c = string2;
            }
            return this.c;
        }
        return this.getBaseContext().getSystemService(string2);
    }

    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        int n3 = this.a;
        if (n3 == 0) {
            this.a = n3 = R$style.Theme_AppCompat_Light;
        }
        this.b();
        return this.b;
    }

    public final void setTheme(int n3) {
        int n4 = this.a;
        if (n4 != n3) {
            this.a = n3;
            this.b();
        }
    }
}

