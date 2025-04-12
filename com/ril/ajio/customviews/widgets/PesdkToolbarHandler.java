/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.customviews.widgets;

import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.AppBarLayout$OnOffsetChangedListener;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.PesdkOnNavigationClickListener;
import kotlin.jvm.internal.Intrinsics;

public final class PesdkToolbarHandler
implements AppBarLayout$OnOffsetChangedListener,
View.OnClickListener {
    public static final int $stable = 8;
    private AppBarLayout appBarLayout;
    private TextView floatTitleTv;
    private TextView headerTitleTv;
    private LinearLayout headerView;
    private boolean isHideToolbarView;
    private PesdkOnNavigationClickListener navigationClickListener;
    private Toolbar toolbar;

    public PesdkToolbarHandler(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.pesdk_float_header_view;
        Object object2 = (LinearLayout)object.findViewById(n3);
        int bl2 = R$id.pesdk_toolbar_title_tv;
        object2 = (TextView)object2.findViewById(bl2);
        this.floatTitleTv = object2;
        n3 = R$id.pesdk_toolbar;
        object2 = (Toolbar)object.findViewById(n3);
        this.toolbar = object2;
        n3 = R$id.pesdk_toolbar_header_view;
        object2 = (LinearLayout)object.findViewById(n3);
        this.headerView = object2;
        if (object2 != null) {
            int n4 = R$id.pesdk_toolbar_title_tv;
            object2 = (TextView)object2.findViewById(n4);
        } else {
            n3 = 0;
            object2 = null;
        }
        this.headerTitleTv = object2;
        n3 = (int)(og1_1.b() ? 1 : 0);
        if (n3 != 0) {
            object2 = this.headerTitleTv;
            String string2 = "#121212";
            if (object2 != null) {
                int n7 = Color.parseColor((String)string2);
                object2.setTextColor(n7);
            }
            if ((object2 = this.floatTitleTv) != null) {
                int n8 = Color.parseColor((String)string2);
                object2.setTextColor(n8);
            }
            object2 = this.headerTitleTv;
            boolean bl3 = true;
            if (object2 != null) {
                object2.setAllCaps(bl3);
            }
            if ((object2 = this.floatTitleTv) != null) {
                object2.setAllCaps(bl3);
            }
        }
        n3 = R$id.pesdk_app_bar_layout;
        object2 = (AppBarLayout)object.findViewById(n3);
        this.appBarLayout = object2;
        if (object2 != null) {
            ((AppBarLayout)object2).addOnOffsetChangedListener(this);
        }
        if ((object = (CollapsingToolbarLayout)object.findViewById(n3 = R$id.pesdk_collapsing_toolbar)) != null) {
            object2 = "";
            ((CollapsingToolbarLayout)((Object)object)).setTitle((CharSequence)object2);
        }
        n3 = R$drawable.nav_back;
        this.setNavigationIcon(n3);
        object.setImportantForAccessibility(2);
    }

    private final void setNavigationIcon(int n3) {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            toolbar.setNavigationIcon(n3);
        }
    }

    public final Toolbar getToolbar() {
        return this.toolbar;
    }

    public void onClick(View object) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(object, string2);
        object = this.navigationClickListener;
        if (object != null) {
            object.onNavigationClick();
        }
    }

    public void onOffsetChanged(AppBarLayout appBarLayout, int n3) {
        String string2 = "appBarLayout";
        Intrinsics.checkNotNullParameter(appBarLayout, string2);
        int n4 = appBarLayout.getTotalScrollRange();
        n3 = Math.abs(n3);
        float f5 = n3;
        float f6 = n4;
        f5 /= f6;
        f6 = 1.0f;
        n4 = (int)(f5 == f6 ? 0 : (f5 < f6 ? -1 : 1));
        if (n4 == 0 && (n3 = (int)(this.isHideToolbarView ? 1 : 0)) != 0) {
            appBarLayout = this.headerView;
            if (appBarLayout != null) {
                n3 = 0;
                f5 = 0.0f;
                appBarLayout.setVisibility(0);
            }
            n4 = this.isHideToolbarView ^ 1;
            this.isHideToolbarView = n4;
        } else if (n4 < 0 && (n4 = (int)(this.isHideToolbarView ? 1 : 0)) == 0) {
            appBarLayout = this.headerView;
            if (appBarLayout != null) {
                n3 = 8;
                f5 = 1.1E-44f;
                appBarLayout.setVisibility(n3);
            }
            n4 = this.isHideToolbarView ^ 1;
            this.isHideToolbarView = n4;
        }
    }

    public final void setNavigationClick() {
        Toolbar toolbar = this.toolbar;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(this);
        }
    }

    public final void setNavigationClickListener(PesdkOnNavigationClickListener pesdkOnNavigationClickListener) {
        Intrinsics.checkNotNullParameter(pesdkOnNavigationClickListener, "navigationClickListener");
        this.navigationClickListener = pesdkOnNavigationClickListener;
    }

    public final void setTitleText(String string2) {
        int n3;
        String string3 = "text";
        Intrinsics.checkNotNullParameter(string2, string3);
        boolean bl2 = og1_1.b();
        if (bl2) {
            string3 = this.headerTitleTv;
            n3 = 1;
            if (string3 != null) {
                string3.setAllCaps(n3 != 0);
            }
            if ((string3 = this.floatTitleTv) != null) {
                string3.setAllCaps(n3 != 0);
            }
        }
        if ((string3 = this.headerTitleTv) != null) {
            string3.setText((CharSequence)string2);
        }
        if ((string3 = this.floatTitleTv) != null) {
            string3.setText((CharSequence)string2);
        }
        if ((string3 = this.headerTitleTv) != null) {
            n3 = 2;
            string3.setImportantForAccessibility(n3);
        }
        if ((string3 = this.floatTitleTv) != null) {
            string3.setContentDescription((CharSequence)string2);
        }
    }
}

