/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package androidx.appcompat.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.a$a;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout$e;

public class a
implements DrawerLayout$e {
    public final a$a a;
    public final DrawerLayout b;
    public final yu0_2 c;
    public final boolean d;
    public boolean e;
    public final int f;
    public final int g;
    public View.OnClickListener h;
    public boolean i;

    public a(Activity object, DrawerLayout object2, Toolbar toolbar, int n3, int n4) {
        boolean bl2;
        this.d = bl2 = true;
        this.e = bl2;
        this.i = false;
        super(toolbar);
        this.a = object;
        L2 l2 = new L2(this);
        toolbar.setNavigationOnClickListener(l2);
        this.b = object2;
        this.f = n3;
        this.g = n4;
        object = object.a();
        super((Context)object);
        this.c = object2;
    }

    public final void a(Drawable drawable2, int n3) {
        boolean bl2 = this.i;
        a$a a$a = this.a;
        if (!bl2 && !(bl2 = a$a.b())) {
            this.i = bl2 = true;
        }
        a$a.c(drawable2, n3);
    }

    public final void b() {
        int n3 = 1;
        int n4 = this.e;
        if (n3 != n4) {
            DrawerLayout drawerLayout = this.b;
            int n7 = 0x800003;
            n4 = drawerLayout.isDrawerOpen(n7);
            n4 = n4 != 0 ? this.g : this.f;
            yu0_2 yu0_22 = this.c;
            this.a(yu0_22, n4);
            this.e = n3;
        }
    }

    public final void c(float f5) {
        yu0_2 yu0_22 = this.c;
        float f6 = 1.0f;
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object == false) {
            object = yu0_22.i;
            boolean bl2 = true;
            if (object != bl2) {
                yu0_22.i = bl2;
                yu0_22.invalidateSelf();
            }
        } else {
            f6 = 0.0f;
            float f8 = f5 - 0.0f;
            object = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
            if (object == false && (object = (Object)yu0_22.i) != false) {
                object = false;
                f6 = 0.0f;
                yu0_22.i = false;
                yu0_22.invalidateSelf();
            }
        }
        yu0_22.b(f5);
    }

    public void onDrawerClosed(View object) {
        object = null;
        this.c(0.0f);
        boolean bl2 = this.e;
        if (bl2) {
            object = this.a;
            int n3 = this.f;
            object.e(n3);
        }
    }

    public void onDrawerOpened(View object) {
        float f5 = 1.0f;
        this.c(f5);
        boolean bl2 = this.e;
        if (bl2) {
            object = this.a;
            int n3 = this.g;
            object.e(n3);
        }
    }

    public final void onDrawerSlide(View view, float f5) {
        int n3 = this.d;
        if (n3 != 0) {
            n3 = 1065353216;
            f5 = Math.max(0.0f, f5);
            float f6 = Math.min(1.0f, f5);
            this.c(f6);
        } else {
            this.c(0.0f);
        }
    }

    public final void onDrawerStateChanged(int n3) {
    }
}

