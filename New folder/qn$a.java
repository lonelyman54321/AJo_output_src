/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.PorterDuffColorFilter
 *  android.graphics.Shader$TileMode
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.LayerDrawable
 */
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$color;
import androidx.appcompat.R$drawable;

public final class qn$a
implements OK2$f {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int[] d;
    public final int[] e;
    public final int[] f;

    public qn$a() {
        int n3 = R$drawable.abc_textfield_search_default_mtrl_alpha;
        int n4 = R$drawable.abc_textfield_default_mtrl_alpha;
        int n7 = R$drawable.abc_ab_share_pack_mtrl_alpha;
        int[] nArray = new int[]{n3, n4, n7};
        this.a = nArray;
        n4 = R$drawable.abc_ic_commit_search_api_mtrl_alpha;
        n7 = R$drawable.abc_seekbar_tick_mark_material;
        int n8 = R$drawable.abc_ic_menu_share_mtrl_alpha;
        int n10 = R$drawable.abc_ic_menu_copy_mtrl_am_alpha;
        int n14 = R$drawable.abc_ic_menu_cut_mtrl_alpha;
        int n15 = R$drawable.abc_ic_menu_selectall_mtrl_alpha;
        int n16 = R$drawable.abc_ic_menu_paste_mtrl_am_alpha;
        nArray = new int[]{n4, n7, n8, n10, n14, n15, n16};
        this.b = nArray;
        n4 = R$drawable.abc_textfield_activated_mtrl_alpha;
        n7 = R$drawable.abc_textfield_search_activated_mtrl_alpha;
        n8 = R$drawable.abc_cab_background_top_mtrl_alpha;
        n10 = R$drawable.abc_text_cursor_material;
        n14 = R$drawable.abc_text_select_handle_left_mtrl;
        n15 = R$drawable.abc_text_select_handle_middle_mtrl;
        n16 = R$drawable.abc_text_select_handle_right_mtrl;
        nArray = new int[]{n4, n7, n8, n10, n14, n15, n16};
        this.c = nArray;
        n3 = R$drawable.abc_popup_background_mtrl_mult;
        n4 = R$drawable.abc_cab_background_internal_bg;
        n7 = R$drawable.abc_menu_hardkey_panel_mtrl_mult;
        nArray = new int[]{n3, n4, n7};
        this.d = nArray;
        n3 = R$drawable.abc_tab_indicator_material;
        n4 = R$drawable.abc_textfield_search_material;
        nArray = new int[]{n3, n4};
        this.e = nArray;
        n3 = R$drawable.abc_btn_check_material;
        n4 = R$drawable.abc_btn_radio_material;
        n7 = R$drawable.abc_btn_check_material_anim;
        n8 = R$drawable.abc_btn_radio_material_anim;
        nArray = new int[]{n3, n4, n7, n8};
        this.f = nArray;
    }

    public static boolean a(int[] nArray, int n3) {
        for (int n4 : nArray) {
            if (n4 != n3) continue;
            return true;
        }
        return false;
    }

    public static ColorStateList b(int n3, Context context) {
        int n4 = Um3.c(R$attr.colorControlHighlight, context);
        int n7 = Um3.b(R$attr.colorButtonNormal, context);
        int n8 = hZ.g(n4, n3);
        n4 = hZ.g(n4, n3);
        int[][] nArrayArray = new int[4][];
        int[] nArray = Um3.b;
        nArrayArray[0] = nArray;
        nArray = Um3.d;
        nArrayArray[1] = nArray;
        nArray = Um3.c;
        nArrayArray[2] = nArray;
        nArray = Um3.f;
        nArrayArray[3] = nArray;
        int[] nArray2 = new int[]{n7, n8, n4, n3};
        context = new ColorStateList((int[][])nArrayArray, nArray2);
        return context;
    }

    public static LayerDrawable c(OK2 oK2, Context context, int n3) {
        Drawable[] drawableArray;
        int n4 = 2;
        int n7 = 1;
        n3 = context.getResources().getDimensionPixelSize(n3);
        int n8 = R$drawable.abc_star_black_48dp;
        Drawable drawable2 = oK2.f(context, n8);
        int n10 = R$drawable.abc_star_half_black_48dp;
        oK2 = oK2.f(context, n10);
        int n14 = drawable2 instanceof BitmapDrawable;
        n10 = 0;
        if (n14 != 0 && (n14 = drawable2.getIntrinsicWidth()) == n3 && (n14 = drawable2.getIntrinsicHeight()) == n3) {
            drawable2 = (BitmapDrawable)drawable2;
            drawableArray = drawable2.getBitmap();
            context = new BitmapDrawable((Bitmap)drawableArray);
        } else {
            context = Bitmap.Config.ARGB_8888;
            context = Bitmap.createBitmap((int)n3, (int)n3, (Bitmap.Config)context);
            drawableArray = new Canvas((Bitmap)context);
            drawable2.setBounds(0, 0, n3, n3);
            drawable2.draw((Canvas)drawableArray);
            drawable2 = new BitmapDrawable((Bitmap)context);
            drawableArray = new BitmapDrawable((Bitmap)context);
            context = drawableArray;
        }
        drawableArray = Shader.TileMode.REPEAT;
        context.setTileModeX((Shader.TileMode)drawableArray);
        int n15 = oK2 instanceof BitmapDrawable;
        if (n15 != 0 && (n15 = ((Drawable)oK2).getIntrinsicWidth()) == n3 && (n15 = ((Drawable)oK2).getIntrinsicHeight()) == n3) {
            oK2 = (BitmapDrawable)oK2;
        } else {
            drawableArray = Bitmap.Config.ARGB_8888;
            drawableArray = Bitmap.createBitmap((int)n3, (int)n3, (Bitmap.Config)drawableArray);
            Canvas canvas = new Canvas((Bitmap)drawableArray);
            ((Drawable)oK2).setBounds(0, 0, n3, n3);
            ((Drawable)oK2).draw(canvas);
            oK2 = new BitmapDrawable((Bitmap)drawableArray);
        }
        drawableArray = new Drawable[3];
        drawableArray[0] = drawable2;
        drawableArray[n7] = oK2;
        drawableArray[n4] = context;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArray);
        layerDrawable.setId(0, 0x1020000);
        layerDrawable.setId(n7, 16908303);
        layerDrawable.setId(n4, 16908301);
        return layerDrawable;
    }

    public static void e(Drawable drawable2, int n3) {
        PorterDuff.Mode mode = qn.b;
        drawable2 = drawable2.mutate();
        PorterDuffColorFilter porterDuffColorFilter = qn.c(n3, mode);
        drawable2.setColorFilter((ColorFilter)porterDuffColorFilter);
    }

    public final ColorStateList d(int n3, Context object) {
        int n4 = R$drawable.abc_edit_text_material;
        if (n3 == n4) {
            n3 = R$color.abc_tint_edittext;
            return t70.getColorStateList(object, n3);
        }
        n4 = R$drawable.abc_switch_track_mtrl_alpha;
        if (n3 == n4) {
            n3 = R$color.abc_tint_switch_track;
            return t70.getColorStateList(object, n3);
        }
        n4 = R$drawable.abc_switch_thumb_material;
        int n7 = 0;
        int[] nArray = null;
        if (n3 == n4) {
            int n8;
            n3 = 3;
            int[][] nArrayArray = new int[n3][];
            int[] nArray2 = new int[n3];
            int n10 = R$attr.colorSwitchThumbNormal;
            Object object2 = Um3.d(n10, object);
            int n14 = 2;
            int n15 = 1;
            if (object2 != null && (n8 = object2.isStateful()) != 0) {
                int n16;
                int[] nArray3 = Um3.b;
                nArrayArray[0] = nArray3;
                nArray2[0] = n8 = object2.getColorForState(nArray3, 0);
                nArray = Um3.e;
                nArrayArray[n15] = nArray;
                n7 = R$attr.colorControlActivated;
                nArray2[n15] = n16 = Um3.c(n7, object);
                object = Um3.f;
                nArrayArray[n14] = (int[])object;
                nArray2[n14] = n16 = object2.getDefaultColor();
            } else {
                int n17;
                object2 = Um3.b;
                nArrayArray[0] = (int[])object2;
                nArray2[0] = n10 = Um3.b(R$attr.colorSwitchThumbNormal, object);
                nArray = Um3.e;
                nArrayArray[n15] = nArray;
                nArray2[n15] = n7 = Um3.c(R$attr.colorControlActivated, object);
                nArray = Um3.f;
                nArrayArray[n14] = nArray;
                n7 = R$attr.colorSwitchThumbNormal;
                nArray2[n14] = n17 = Um3.c(n7, object);
            }
            object = new ColorStateList((int[][])nArrayArray, nArray2);
            return object;
        }
        n4 = R$drawable.abc_btn_default_mtrl_shape;
        if (n3 == n4) {
            return qn$a.b(Um3.c(R$attr.colorButtonNormal, object), object);
        }
        n4 = R$drawable.abc_btn_borderless_material;
        if (n3 == n4) {
            return qn$a.b(0, object);
        }
        n4 = R$drawable.abc_btn_colored_material;
        if (n3 == n4) {
            return qn$a.b(Um3.c(R$attr.colorAccent, object), object);
        }
        n4 = R$drawable.abc_spinner_mtrl_am_alpha;
        if (n3 != n4 && n3 != (n4 = R$drawable.abc_spinner_textfield_background_material)) {
            int[] nArray4 = this.b;
            n4 = (int)(qn$a.a(nArray4, n3) ? 1 : 0);
            if (n4 != 0) {
                return Um3.d(R$attr.colorControlNormal, object);
            }
            nArray4 = this.e;
            n4 = (int)(qn$a.a(nArray4, n3) ? 1 : 0);
            if (n4 != 0) {
                n3 = R$color.abc_tint_default;
                return t70.getColorStateList(object, n3);
            }
            nArray4 = this.f;
            n4 = (int)(qn$a.a(nArray4, n3) ? 1 : 0);
            if (n4 != 0) {
                n3 = R$color.abc_tint_btn_checkable;
                return t70.getColorStateList(object, n3);
            }
            n4 = R$drawable.abc_seekbar_thumb_material;
            if (n3 == n4) {
                n3 = R$color.abc_tint_seek_thumb;
                return t70.getColorStateList(object, n3);
            }
            return null;
        }
        n3 = R$color.abc_tint_spinner;
        return t70.getColorStateList(object, n3);
    }
}

