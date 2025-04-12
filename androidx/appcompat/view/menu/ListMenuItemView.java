/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewConfiguration
 *  android.view.ViewGroup
 *  android.widget.AbsListView$SelectionBoundsAdjuster
 *  android.widget.CheckBox
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RadioButton
 *  android.widget.TextView
 */
package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$layout;
import androidx.appcompat.R$string;
import androidx.appcompat.R$styleable;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.i$a;

public class ListMenuItemView
extends LinearLayout
implements i$a,
AbsListView.SelectionBoundsAdjuster {
    public f a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView g;
    public ImageView h;
    public LinearLayout i;
    public final Drawable j;
    public final int k;
    public final Context l;
    public boolean m;
    public final Drawable n;
    public final boolean o;
    public LayoutInflater p;
    public boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        int n3 = R$attr.listMenuViewStyle;
        this(context, attributeSet, n3);
    }

    public ListMenuItemView(Context context, AttributeSet object, int n3) {
        super(context, (AttributeSet)object);
        Object object2;
        Context context2 = this.getContext();
        int[] nArray = R$styleable.MenuView;
        object = Tn3.f(context2, (AttributeSet)object, nArray, n3, 0);
        n3 = R$styleable.MenuView_android_itemBackground;
        this.j = object2 = ((Tn3)object).b(n3);
        n3 = R$styleable.MenuView_android_itemTextAppearance;
        context2 = ((Tn3)object).b;
        this.k = n3 = context2.getResourceId(n3, -1);
        n3 = R$styleable.MenuView_preserveIconSpacing;
        n3 = (int)(context2.getBoolean(n3, false) ? 1 : 0);
        this.m = n3;
        this.l = context;
        n3 = R$styleable.MenuView_subMenuArrow;
        this.n = object2 = ((Tn3)object).b(n3);
        context = context.getTheme();
        object2 = new int[]{16843049};
        int n4 = R$attr.dropDownListViewStyle;
        context = context.obtainStyledAttributes(null, (int[])object2, n4, 0);
        n3 = (int)(context.hasValue(0) ? 1 : 0);
        this.o = n3;
        ((Tn3)object).g();
        context.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.p;
        if (layoutInflater == null) {
            this.p = layoutInflater = LayoutInflater.from((Context)this.getContext());
        }
        return this.p;
    }

    private void setSubMenuArrowVisible(boolean n3) {
        ImageView imageView = this.g;
        if (imageView != null) {
            n3 = n3 != 0 ? 0 : 8;
            imageView.setVisibility(n3);
        }
    }

    public final void adjustListItemSelectionBounds(Rect rect) {
        int n3;
        ImageView imageView = this.h;
        if (imageView != null && (n3 = imageView.getVisibility()) == 0) {
            imageView = (LinearLayout.LayoutParams)this.h.getLayoutParams();
            int n4 = rect.top;
            ImageView imageView2 = this.h;
            int n7 = imageView2.getHeight();
            int n8 = imageView.topMargin;
            n7 += n8;
            n3 = imageView.bottomMargin;
            rect.top = n7 = n7 + n3 + n4;
        }
    }

    public f getItemData() {
        return this.a;
    }

    public final void initialize(f object, int n3) {
        Object object2;
        this.a = object;
        n3 = (int)(((f)object).isVisible() ? 1 : 0);
        boolean bl2 = false;
        if (n3 != 0) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = 8;
        }
        this.setVisibility(n3);
        object2 = ((f)object).e;
        this.setTitle((CharSequence)object2);
        n3 = (int)(((f)object).isCheckable() ? 1 : 0);
        this.setCheckable(n3 != 0);
        object2 = ((f)object).n;
        n3 = (int)(((d)object2).isShortcutsVisible() ? 1 : 0);
        if (n3 != 0 && (n3 = (n3 = (int)(((d)(object2 = ((f)object).n)).isQwertyMode() ? 1 : 0)) != 0 ? (int)((f)object).j : (int)((f)object).h) != 0) {
            bl2 = true;
        }
        n3 = (n3 = (int)(((d)(object2 = ((f)object).n)).isQwertyMode() ? 1 : 0)) != 0 ? (int)((f)object).j : (int)((f)object).h;
        this.setShortcut(bl2, (char)n3);
        object2 = ((f)object).getIcon();
        this.setIcon((Drawable)object2);
        n3 = (int)(((f)object).isEnabled() ? 1 : 0);
        this.setEnabled(n3 != 0);
        n3 = (int)(((f)object).hasSubMenu() ? 1 : 0);
        this.setSubMenuArrowVisible(n3 != 0);
        object = ((f)object).q;
        this.setContentDescription((CharSequence)object);
    }

    public final void onFinishInflate() {
        Context context;
        super.onFinishInflate();
        Drawable drawable2 = this.j;
        this.setBackground(drawable2);
        int n3 = R$id.title;
        drawable2 = (TextView)this.findViewById(n3);
        this.d = drawable2;
        int n4 = -1;
        int n7 = this.k;
        if (n7 != n4) {
            context = this.l;
            drawable2.setTextAppearance(context, n7);
        }
        n3 = R$id.shortcut;
        drawable2 = (TextView)this.findViewById(n3);
        this.f = drawable2;
        n3 = R$id.submenuarrow;
        drawable2 = (ImageView)this.findViewById(n3);
        this.g = drawable2;
        if (drawable2 != null) {
            context = this.n;
            drawable2.setImageDrawable((Drawable)context);
        }
        n3 = R$id.group_divider;
        drawable2 = (ImageView)this.findViewById(n3);
        this.h = drawable2;
        n3 = R$id.content;
        drawable2 = (LinearLayout)this.findViewById(n3);
        this.i = drawable2;
    }

    public final void onMeasure(int n3, int n4) {
        int n7;
        ImageView imageView = this.b;
        if (imageView != null && (n7 = this.m) != 0) {
            int n8;
            imageView = this.getLayoutParams();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)this.b.getLayoutParams();
            n7 = imageView.height;
            if (n7 > 0 && (n8 = layoutParams.width) <= 0) {
                layoutParams.width = n7;
            }
        }
        super.onMeasure(n3, n4);
    }

    public void setCheckable(boolean n3) {
        CheckBox checkBox;
        int n4;
        Object object;
        if (n3 == 0 && (object = this.c) == null && (object = this.e) == null) {
            return;
        }
        object = this.a;
        int n7 = object.x & 4;
        int n8 = -1;
        if (n7 != 0) {
            object = this.c;
            if (object == null) {
                object = this.getInflater();
                n4 = R$layout.abc_list_menu_item_radio;
                this.c = object = (RadioButton)object.inflate(n4, (ViewGroup)this, false);
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView((View)object, n8);
                } else {
                    this.addView((View)object, n8);
                }
            }
            object = this.c;
            checkBox = this.e;
        } else {
            object = this.e;
            if (object == null) {
                object = this.getInflater();
                n4 = R$layout.abc_list_menu_item_checkbox;
                object = (CheckBox)object.inflate(n4, (ViewGroup)this, false);
                this.e = object;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView((View)object, n8);
                } else {
                    this.addView((View)object, n8);
                }
            }
            object = this.e;
            checkBox = this.c;
        }
        n4 = 8;
        if (n3 != 0) {
            f f5 = this.a;
            n3 = f5.isChecked();
            object.setChecked(n3 != 0);
            n3 = object.getVisibility();
            if (n3 != 0) {
                object.setVisibility(0);
            }
            if (checkBox != null && (n3 = checkBox.getVisibility()) != n4) {
                checkBox.setVisibility(n4);
            }
        } else {
            CheckBox checkBox2 = this.e;
            if (checkBox2 != null) {
                checkBox2.setVisibility(n4);
            }
            if ((checkBox2 = this.c) != null) {
                checkBox2.setVisibility(n4);
            }
        }
    }

    public void setChecked(boolean bl2) {
        f f5 = this.a;
        int n3 = f5.x & 4;
        int n4 = -1;
        LinearLayout linearLayout = null;
        if (n3 != 0) {
            f5 = this.c;
            if (f5 == null) {
                f5 = this.getInflater();
                int n7 = R$layout.abc_list_menu_item_radio;
                f5 = (RadioButton)f5.inflate(n7, (ViewGroup)this, false);
                this.c = f5;
                linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView((View)f5, n4);
                } else {
                    this.addView((View)f5, n4);
                }
            }
            f5 = this.c;
        } else {
            f5 = this.e;
            if (f5 == null) {
                f5 = this.getInflater();
                int n8 = R$layout.abc_list_menu_item_checkbox;
                f5 = (CheckBox)f5.inflate(n8, (ViewGroup)this, false);
                this.e = f5;
                linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView((View)f5, n4);
                } else {
                    this.addView((View)f5, n4);
                }
            }
            f5 = this.e;
        }
        f5.setChecked(bl2);
    }

    public void setForceShowIcon(boolean bl2) {
        this.q = bl2;
        this.m = bl2;
    }

    public void setGroupDividerEnabled(boolean n3) {
        ImageView imageView = this.h;
        if (imageView != null) {
            boolean bl2 = this.o;
            n3 = !bl2 && n3 != 0 ? 0 : 8;
            imageView.setVisibility(n3);
        }
    }

    public void setIcon(Drawable drawable2) {
        int n3;
        boolean bl2;
        d d2 = this.a.n;
        int n4 = d2.getOptionalIconsVisible();
        if (n4 == 0 && (n4 = this.q) == 0) {
            n4 = 0;
            d2 = null;
        } else {
            n4 = 1;
        }
        if (n4 == 0 && !(bl2 = this.m)) {
            return;
        }
        ImageView imageView = this.b;
        if (imageView == null && drawable2 == null && (n3 = this.m) == 0) {
            return;
        }
        if (imageView == null) {
            imageView = this.getInflater();
            n3 = R$layout.abc_list_menu_item_icon;
            this.b = imageView = (ImageView)imageView.inflate(n3, (ViewGroup)this, false);
            LinearLayout linearLayout = this.i;
            if (linearLayout != null) {
                linearLayout.addView((View)imageView, 0);
            } else {
                this.addView((View)imageView, 0);
            }
        }
        if (drawable2 == null && !(bl2 = this.m)) {
            drawable2 = this.b;
            n4 = 8;
            drawable2.setVisibility(n4);
        } else {
            int n7;
            imageView = this.b;
            if (n4 == 0) {
                n7 = 0;
                drawable2 = null;
            }
            imageView.setImageDrawable(drawable2);
            drawable2 = this.b;
            n7 = drawable2.getVisibility();
            if (n7 != 0) {
                drawable2 = this.b;
                drawable2.setVisibility(0);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public void setShortcut(boolean n3, char c2) {
        int n4;
        Object object;
        f f5;
        char c3;
        block19: {
            block18: {
                boolean bl2;
                c2 = '\u0001';
                c3 = '\b';
                if (n3 == 0) break block18;
                f5 = this.a;
                object = f5.n;
                boolean n7 = ((d)object).isShortcutsVisible();
                n4 = 0;
                if (n7 && (n3 = (bl2 = ((d)(object = f5.n)).isQwertyMode()) ? (int)f5.j : (int)f5.h) != 0) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    f5 = null;
                }
                if (n3 != 0) break block19;
            }
            n4 = 8;
        }
        if (n4 == 0) {
            String string2;
            f5 = this.f;
            object = this.a;
            d d2 = ((f)object).n;
            char c5 = d2.isQwertyMode();
            c5 = c5 != '\u0000' ? ((f)object).j : ((f)object).h;
            if (c5 == '\u0000') {
                string2 = "";
            } else {
                void var6_10;
                int n7;
                Object object2 = ((f)object).n;
                Resources resources = ((d)object2).getContext().getResources();
                StringBuilder stringBuilder = new StringBuilder();
                Object object3 = ViewConfiguration.get((Context)((d)object2).getContext());
                int n8 = object3.hasPermanentMenuKey();
                if (n8 != 0) {
                    n8 = R$string.abc_prepend_shortcut_label;
                    object3 = resources.getString(n8);
                    stringBuilder.append((String)object3);
                }
                if ((n7 = ((d)object2).isQwertyMode()) != 0) {
                    int n10 = ((f)object).k;
                } else {
                    int n14 = ((f)object).i;
                }
                n7 = R$string.abc_menu_meta_shortcut_label;
                androidx.appcompat.view.menu.f.c(resources.getString(n7), (int)var6_10, 65536, stringBuilder);
                n7 = R$string.abc_menu_ctrl_shortcut_label;
                androidx.appcompat.view.menu.f.c(resources.getString(n7), (int)var6_10, 4096, stringBuilder);
                n7 = R$string.abc_menu_alt_shortcut_label;
                object2 = resources.getString(n7);
                n8 = 2;
                androidx.appcompat.view.menu.f.c((String)object2, (int)var6_10, n8, stringBuilder);
                n7 = R$string.abc_menu_shift_shortcut_label;
                object2 = resources.getString(n7);
                androidx.appcompat.view.menu.f.c((String)object2, (int)var6_10, c2, stringBuilder);
                c2 = (char)R$string.abc_menu_sym_shortcut_label;
                string2 = resources.getString((int)c2);
                n7 = 4;
                androidx.appcompat.view.menu.f.c(string2, (int)var6_10, n7, stringBuilder);
                c2 = (char)R$string.abc_menu_function_shortcut_label;
                string2 = resources.getString((int)c2);
                androidx.appcompat.view.menu.f.c(string2, (int)var6_10, c3, stringBuilder);
                if (c5 != c3) {
                    c2 = (char)10;
                    if (c5 != c2) {
                        c2 = (char)32;
                        if (c5 != c2) {
                            stringBuilder.append(c5);
                        } else {
                            c2 = (char)R$string.abc_menu_space_shortcut_label;
                            string2 = resources.getString((int)c2);
                            stringBuilder.append(string2);
                        }
                    } else {
                        c2 = (char)R$string.abc_menu_enter_shortcut_label;
                        string2 = resources.getString((int)c2);
                        stringBuilder.append(string2);
                    }
                } else {
                    c2 = (char)R$string.abc_menu_delete_shortcut_label;
                    string2 = resources.getString((int)c2);
                    stringBuilder.append(string2);
                }
                string2 = stringBuilder.toString();
            }
            f5.setText(string2);
        }
        if ((n3 = (f5 = this.f).getVisibility()) != n4) {
            f5 = this.f;
            f5.setVisibility(n4);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            TextView textView = this.d;
            textView.setText(charSequence);
            charSequence = this.d;
            int n3 = charSequence.getVisibility();
            if (n3 != 0) {
                charSequence = this.d;
                boolean bl2 = false;
                textView = null;
                charSequence.setVisibility(0);
            }
        } else {
            int n4;
            charSequence = this.d;
            int n7 = charSequence.getVisibility();
            if (n7 != (n4 = 8)) {
                charSequence = this.d;
                charSequence.setVisibility(n4);
            }
        }
    }
}

