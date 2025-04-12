/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.graphics.Color
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.R$styleable;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$1;
import com.ril.ajio.customviews.widgets.AjioCustomToolbar$DisplayMode;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.customviews.widgets.commonimpl.CustomTextViewImpl;
import com.ril.ajio.customviews.widgets.managers.FontsManager;
import com.ril.ajio.customviews.widgets.managers.MainWidgetManager;

public class AjioCustomToolbar
extends Toolbar
implements CustomTextViewImpl {
    private AjioCustomToolbar$DisplayMode displayMode;
    private ImageView ivSISImage;
    private AjioTextView product_detail;
    private LinearLayout product_info;
    private AjioTextView product_name_title;
    private LinearLayout product_top_header;
    private AjioTextView product_top_header_brand;
    private ImageView product_top_header_img;
    private LinearLayout sisLogoLayout;
    private ImageView storeCatBtn;
    private ImageView title_image_view;
    private LinearLayout title_linear_layout;
    private Toolbar toolbar;
    private View toolbarParent;
    private View toolbarSIS;
    private AjioTextView toolbar_title;
    private AjioTextView tvSISSubTitle1;
    private AjioTextView tvSISSubTitle2;

    public AjioCustomToolbar(Context context) {
        super(context);
        this.initField(context, null);
    }

    public AjioCustomToolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.initField(context, attributeSet);
    }

    public AjioCustomToolbar(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        this.initField(context, attributeSet);
    }

    private void setDisplayMode(int n3) {
        block6: {
            int n4;
            block0: {
                block1: {
                    boolean bl2;
                    block2: {
                        block3: {
                            View view;
                            block5: {
                                block4: {
                                    n4 = 8;
                                    if (n3 == 0) break block0;
                                    bl2 = true;
                                    if (n3 == bl2) break block1;
                                    int n7 = 2;
                                    if (n3 == n7) break block2;
                                    int n8 = 3;
                                    if (n3 == n8) break block3;
                                    int n10 = 4;
                                    if (n3 == n10) break block4;
                                    int n14 = 5;
                                    if (n3 == n14) break block5;
                                    break block6;
                                }
                                this.product_top_header.setVisibility(n4);
                                this.title_linear_layout.setVisibility(n4);
                                this.title_image_view.setVisibility(n4);
                                this.toolbar_title.setVisibility(n4);
                                this.product_info.setVisibility(n4);
                                view = this.toolbarSIS;
                                view.setVisibility(0);
                            }
                            this.product_top_header.setVisibility(0);
                            this.title_linear_layout.setVisibility(n4);
                            this.title_image_view.setVisibility(n4);
                            this.toolbar_title.setVisibility(n4);
                            this.product_info.setVisibility(n4);
                            this.product_name_title.setVisibility(n4);
                            this.product_detail.setVisibility(n4);
                            view = this.toolbarSIS;
                            view.setVisibility(n4);
                            break block6;
                        }
                        this.product_top_header.setVisibility(n4);
                        this.title_linear_layout.setVisibility(n4);
                        this.title_image_view.setVisibility(n4);
                        this.toolbar_title.setVisibility(n4);
                        View view = this.toolbarSIS;
                        view.setVisibility(n4);
                        break block6;
                    }
                    this.product_top_header.setVisibility(n4);
                    this.title_linear_layout.setVisibility(n4);
                    this.title_image_view.setVisibility(n4);
                    this.toolbar_title.setVisibility(n4);
                    this.product_info.setVisibility(0);
                    this.product_name_title.setVisibility(0);
                    this.product_detail.setVisibility(0);
                    this.product_name_title.setFocusable(bl2);
                    this.product_name_title.requestFocus();
                    this.product_detail.setFocusable(bl2);
                    this.product_detail.requestFocus();
                    View view = this.toolbarSIS;
                    view.setVisibility(n4);
                    break block6;
                }
                this.product_top_header.setVisibility(n4);
                this.title_linear_layout.setVisibility(0);
                this.title_image_view.setVisibility(n4);
                this.toolbar_title.setVisibility(0);
                this.product_info.setVisibility(n4);
                this.product_name_title.setVisibility(n4);
                this.product_detail.setVisibility(n4);
                View view = this.toolbarSIS;
                view.setVisibility(n4);
                break block6;
            }
            this.product_top_header.setVisibility(n4);
            this.title_linear_layout.setVisibility(0);
            this.title_image_view.setVisibility(0);
            this.toolbar_title.setVisibility(n4);
            this.product_info.setVisibility(n4);
            this.product_name_title.setVisibility(n4);
            this.product_detail.setVisibility(n4);
            View view = this.toolbarSIS;
            view.setVisibility(n4);
        }
    }

    private void setNavigationButtonToBackspace() {
        Toolbar toolbar = this.toolbar;
        int n3 = R$drawable.ic_keyboard_backspace;
        toolbar.setNavigationIcon(n3);
        toolbar = this.toolbar;
        String string2 = hv3_0.K(R$string.back_button_text);
        toolbar.setNavigationContentDescription(string2);
        this.setNavigationIconDarkCyan();
    }

    private void setNavigationButtonToHamburgerMenuIcon() {
        Toolbar toolbar = this.toolbar;
        int n3 = R$drawable.ic_drawer;
        toolbar.setNavigationIcon(n3);
        toolbar = this.toolbar;
        String string2 = hv3_0.K(R$string.hamburger_button);
        toolbar.setNavigationContentDescription(string2);
        this.setNavigationIconLightBrown();
    }

    private void setNavigationIconDarkCyan() {
        FontsManager fontsManager = MainWidgetManager.getInstance().getFontsManager();
        Context context = this.getContext();
        int n3 = R$color.toolbar_text_color;
        int n4 = fontsManager.getColor(context, n3);
        context = this.toolbar.getNavigationIcon();
        if (context != null) {
            context = this.toolbar.getNavigationIcon();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            context.setColorFilter(n4, mode);
        }
    }

    private void setNavigationIconLightBrown() {
        FontsManager fontsManager = MainWidgetManager.getInstance().getFontsManager();
        Context context = this.getContext();
        int n3 = R$color.light_brown;
        int n4 = fontsManager.getColor(context, n3);
        context = this.toolbar.getNavigationIcon();
        if (context != null) {
            context = this.toolbar.getNavigationIcon();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            context.setColorFilter(n4, mode);
        }
    }

    public AjioCustomToolbar$DisplayMode getDisplayMode() {
        return this.displayMode;
    }

    public ImageView getLogoImageView() {
        return this.title_image_view;
    }

    public LinearLayout getSisLogoLayout() {
        return this.sisLogoLayout;
    }

    public ImageView getStoreCatBtn() {
        return this.storeCatBtn;
    }

    public CharSequence getTitle() {
        AjioTextView ajioTextView = this.toolbar_title;
        if (ajioTextView != null) {
            return ajioTextView.getText();
        }
        return super.getTitle();
    }

    public AjioTextView getTitleTextView() {
        return this.toolbar_title;
    }

    public void initField(Context object, AttributeSet attributeSet) {
        Resources.Theme theme = object.getTheme();
        int[] nArray = R$styleable.ajioToolbar;
        attributeSet = theme.obtainStyledAttributes(attributeSet, nArray, 0, 0);
        int n3 = R$styleable.ajioToolbar_titleDisplayMode;
        n3 = attributeSet.getInt(n3, 12);
        int n4 = R$styleable.ajioToolbar_startingToolbarNavigationSetup;
        n4 = attributeSet.getInt(n4, 0);
        int n7 = R$styleable.ajioToolbar_fontSize;
        float f5 = attributeSet.getDimension(n7, 0.0f);
        int n8 = R$styleable.ajioToolbar_fontText;
        String string2 = attributeSet.getString(n8);
        FontsManager fontsManager = MainWidgetManager.getInstance().getFontsManager();
        Context context = this.getContext();
        int n10 = fontsManager.getColor(context, 17170444);
        int n14 = R$styleable.ajioToolbar_fontColor;
        n10 = attributeSet.getColor(n14, n10);
        object = LayoutInflater.from((Context)object);
        n14 = R$layout.ajio_custom_toolbar;
        int n15 = 1;
        object = (Toolbar)object.inflate(n14, (ViewGroup)this, n15 != 0);
        this.toolbar = object;
        n14 = R$id.title_linear_layout;
        object = (LinearLayout)object.findViewById(n14);
        this.title_linear_layout = object;
        object = this.toolbar;
        n14 = R$id.product_top_header;
        object = (LinearLayout)object.findViewById(n14);
        this.product_top_header = object;
        object = this.title_linear_layout;
        n14 = R$id.title_image_view;
        object = (ImageView)object.findViewById(n14);
        this.title_image_view = object;
        object = this.title_linear_layout;
        n14 = R$id.toolbar_title;
        object = (AjioTextView)object.findViewById(n14);
        this.toolbar_title = object;
        object = this.product_top_header;
        n14 = R$id.product_top_header_brand;
        object = (AjioTextView)object.findViewById(n14);
        this.product_top_header_brand = object;
        object = this.product_top_header;
        n14 = R$id.product_top_header_img;
        object = (ImageView)object.findViewById(n14);
        this.product_top_header_img = object;
        object = this.toolbar;
        n14 = R$id.product_info;
        object = (LinearLayout)object.findViewById(n14);
        this.product_info = object;
        n14 = R$id.product_name_title;
        object = (AjioTextView)object.findViewById(n14);
        this.product_name_title = object;
        object = this.product_info;
        n14 = R$id.product_detail;
        object = (AjioTextView)object.findViewById(n14);
        this.product_detail = object;
        object = this.toolbar;
        n14 = R$id.act_toolbar_sis;
        object = object.findViewById(n14);
        this.toolbarSIS = object;
        n14 = R$id.act_sis_logo_layout;
        object = (LinearLayout)object.findViewById(n14);
        this.sisLogoLayout = object;
        object = this.toolbarSIS;
        n14 = R$id.act_iv_store_image;
        object = (ImageView)object.findViewById(n14);
        this.ivSISImage = object;
        object = this.toolbarSIS;
        n14 = R$id.act_iv_store_category_image;
        object = (ImageView)object.findViewById(n14);
        this.storeCatBtn = object;
        object = this.toolbarSIS;
        n14 = R$id.act_tv_store_subtitle_2;
        object = (AjioTextView)object.findViewById(n14);
        this.tvSISSubTitle2 = object;
        object = this.toolbarSIS;
        n14 = R$id.act_tv_store_subtitle_1;
        object = (AjioTextView)object.findViewById(n14);
        this.tvSISSubTitle1 = object;
        object = this.toolbar;
        n14 = R$id.act_layout_parent;
        object = object.findViewById(n14);
        this.toolbarParent = object;
        int n16 = og1_1.c();
        if (n16 == 0) {
            object = this.product_name_title;
            n14 = R$style.stmt_header_small;
            Hm3.f((TextView)object, n14);
            object = this.product_name_title;
            n14 = hv3_0.m(R$color.accent_color_10);
            object.setTextColor(n14);
            object = this.product_detail;
            n14 = R$style.txt_body_large_reg;
            Hm3.f((TextView)object, n14);
            object = this.product_detail;
            n14 = hv3_0.m(R$color.accent_color_10);
            object.setTextColor(n14);
        }
        this.setDisplayMode(n3);
        if (n4 != 0) {
            if (n4 == n15) {
                this.setNavigationButtonToHamburgerMenuIcon();
            }
        } else {
            this.setNavigationButtonToBackspace();
        }
        object = this.toolbar_title;
        object.setTextColor(n10);
        float f6 = f5 - 0.0f;
        n16 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (n16 > 0) {
            object = this.toolbar_title;
            object.setTextSize(0, f5);
        }
        if (string2 != null) {
            object = this.toolbar_title;
            object.setText((CharSequence)string2);
        }
        attributeSet.recycle();
    }

    public void resetSISToolbar() {
        int n3;
        Resources resources;
        Object object;
        int n4 = Build.VERSION.SDK_INT;
        int n7 = 23;
        if (n4 >= n7) {
            object = this.toolbarParent;
            resources = this.getContext().getResources();
            n3 = R$color.ajioColorPrimary;
            n7 = M42.a(resources, n3);
            object.setBackgroundColor(n7);
            object = this.toolbar;
            resources = this.getContext().getResources();
            n3 = R$color.ajioColorPrimary;
            n7 = M42.a(resources, n3);
            object.setBackgroundColor(n7);
        } else {
            object = this.toolbarParent;
            resources = this.getContext().getResources();
            n3 = R$color.ajioColorPrimary;
            n7 = resources.getColor(n3);
            object.setBackgroundColor(n7);
            object = this.toolbar;
            resources = this.getContext().getResources();
            n3 = R$color.ajioColorPrimary;
            n7 = resources.getColor(n3);
            object.setBackgroundColor(n7);
        }
        object = this.toolbar.getNavigationIcon();
        if (object != null) {
            object = MainWidgetManager.getInstance().getFontsManager();
            resources = this.getContext();
            n3 = R$color.light_brown;
            n4 = ((FontsManager)object).getColor((Context)resources, n3);
            resources = this.toolbar.getNavigationIcon();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            resources.setColorFilter(n4, mode);
        }
    }

    public void setBgColor(String string2) {
        int n3 = Color.parseColor((String)string2);
        this.toolbar.setBackgroundColor(n3);
        this.toolbarParent.setBackgroundColor(n3);
    }

    public void setBrandLogo(String string2) {
        boolean bl2 = string2.isEmpty();
        if (!bl2) {
            boolean bl3;
            da$a da$a = new da$a();
            da$a.k = bl3 = true;
            ImageView imageView = this.product_top_header_img;
            da$a.n = string2;
            da$a.u = imageView;
            da$a.v = bl3;
            da$a.a();
        }
    }

    public void setBrandName(String string2) {
        boolean bl2 = string2.isEmpty();
        if (!bl2) {
            AjioTextView ajioTextView = this.product_top_header_brand;
            ajioTextView.setText(string2);
        }
    }

    public void setDisplayMode(AjioCustomToolbar$DisplayMode ajioCustomToolbar$DisplayMode) {
        this.displayMode = ajioCustomToolbar$DisplayMode;
        int[] nArray = AjioCustomToolbar$1.$SwitchMap$com$ril$ajio$customviews$widgets$AjioCustomToolbar$DisplayMode;
        int n3 = ajioCustomToolbar$DisplayMode.ordinal();
        n3 = nArray[n3];
        switch (n3) {
            default: {
                break;
            }
            case 6: {
                n3 = 5;
                this.setDisplayMode(n3);
                break;
            }
            case 5: {
                n3 = 4;
                this.setDisplayMode(n3);
                break;
            }
            case 4: {
                n3 = 3;
                this.setDisplayMode(n3);
                break;
            }
            case 3: {
                n3 = 2;
                this.setDisplayMode(n3);
                break;
            }
            case 2: {
                n3 = 1;
                this.setDisplayMode(n3);
                break;
            }
            case 1: {
                n3 = 0;
                ajioCustomToolbar$DisplayMode = null;
                this.setDisplayMode(0);
            }
        }
    }

    public void setProductListDetailText(String string2) {
        this.product_detail.setText(string2);
    }

    public void setProductListTitleText(String string2) {
        this.product_name_title.setText(string2);
    }

    public void setTintDrawerIcon(String string2) {
        int n3 = Color.parseColor((String)string2);
        Drawable drawable2 = this.toolbar.getNavigationIcon();
        if (drawable2 != null) {
            drawable2 = this.toolbar.getNavigationIcon();
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawable2.setColorFilter(n3, mode);
        }
        this.tvSISSubTitle1.setTextColor(n3);
    }

    public void setTitle(CharSequence charSequence) {
        AjioTextView ajioTextView = this.toolbar_title;
        if (ajioTextView != null) {
            ajioTextView.setText(charSequence);
        } else {
            super.setTitle(charSequence);
        }
    }

    public void setToolbarBgColor(int n3) {
        this.toolbar.setBackgroundColor(n3);
        this.toolbarParent.setBackgroundColor(n3);
    }
}

