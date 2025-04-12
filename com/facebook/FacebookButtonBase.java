/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.ColorStateList
 *  android.content.res.Resources$Theme
 *  android.graphics.Canvas
 *  android.graphics.Typeface
 *  android.text.TextPaint
 *  android.util.AttributeSet
 *  android.view.View$OnClickListener
 *  android.widget.Button
 */
package com.facebook;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.facebook.FacebookException;
import com.facebook.appevents.g;
import com.facebook.common.R$color;
import com.facebook.common.R$style;
import com.facebook.j;
import kotlin.jvm.internal.Intrinsics;

public abstract class FacebookButtonBase
extends Button {
    public static final /* synthetic */ int i;
    public final String a;
    public final String b;
    public View.OnClickListener c;
    public View.OnClickListener d;
    public boolean e;
    public int f;
    public int g;
    public mw0_0 h;

    public FacebookButtonBase(Context context, AttributeSet attributeSet, int n3, String string2, String string3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(string2, "analyticsButtonCreatedEventName");
        Intrinsics.checkNotNullParameter(string3, "analyticsButtonTappedEventName");
        super(context, attributeSet, 0);
        int n4 = this.getDefaultStyleResource();
        if (n4 == 0) {
            n4 = R$style.com_facebook_button;
        }
        this.a(context, attributeSet, n3, n4);
        this.a = string2;
        this.b = string3;
        boolean bl2 = true;
        this.setClickable(bl2);
        this.setFocusable(bl2);
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Context object, AttributeSet attributeSet, int n3, int n4) {
        oi0_2 oi0_22;
        void var4_9;
        void var3_8;
        Object var2_7;
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return;
        }
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        this.c((Context)object, var2_7, (int)var3_8, (int)var4_9);
        this.d((Context)object, var2_7, (int)var3_8, (int)var4_9);
        this.e((Context)object, var2_7, (int)var3_8, (int)var4_9);
        this.f((Context)object, var2_7, (int)var3_8, (int)var4_9);
        boolean bl3 = td0.b((Object)this);
        if (bl3) return;
        var2_7 = null;
        try {
            oi0_22 = new oi0_2((Object)this, 0);
        }
        catch (Throwable throwable) {
            try {
                td0.a((Object)this, throwable);
                return;
            }
            catch (Throwable throwable2) {
                td0.a((Object)this, throwable2);
                return;
            }
        }
        super.setOnClickListener((View.OnClickListener)oi0_22);
    }

    public final int b(String string2) {
        TextPaint textPaint;
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return 0;
        }
        try {
            textPaint = this.getPaint();
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return 0;
        }
        float f5 = textPaint.measureText(string2);
        double d2 = f5;
        return (int)Math.ceil(d2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c(Context context, AttributeSet attributeSet, int n3, int n4) {
        Throwable throwable3;
        block7: {
            Throwable throwable22;
            block11: {
                block10: {
                    block8: {
                        int n7;
                        block9: {
                            int n8 = td0.b((Object)this);
                            if (n8 != 0) {
                                return;
                            }
                            try {
                                n8 = this.isInEditMode();
                                if (n8 != 0) {
                                    return;
                                }
                                n8 = 16842964;
                                int[] nArray = new int[]{n8};
                                Resources.Theme theme = context.getTheme();
                                attributeSet = theme.obtainStyledAttributes(attributeSet, nArray, n3, n4);
                                String string2 = "context.theme.obtainStyl\u2026efStyleAttr, defStyleRes)";
                                Intrinsics.checkNotNullExpressionValue(attributeSet, string2);
                                n3 = 0;
                                string2 = null;
                            }
                            catch (Throwable throwable3) {
                                break block7;
                            }
                            try {
                                n4 = (int)(attributeSet.hasValue(0) ? 1 : 0);
                                if (n4 == 0) break block8;
                                n7 = attributeSet.getResourceId(0, 0);
                                if (n7 == 0) break block9;
                                this.setBackgroundResource(n7);
                                break block10;
                            }
                            catch (Throwable throwable22) {
                                break block11;
                            }
                        }
                        n7 = attributeSet.getColor(0, 0);
                        this.setBackgroundColor(n7);
                        break block10;
                    }
                    n3 = R$color.com_facebook_blue;
                    int n10 = t70.getColor(context, n3);
                    this.setBackgroundColor(n10);
                }
                attributeSet.recycle();
                return;
            }
            attributeSet.recycle();
            throw throwable22;
        }
        td0.a((Object)this, throwable3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(Context context, AttributeSet object, int n3, int n4) {
        int n7;
        int n8 = td0.b((Object)this);
        if (n8 != 0) {
            return;
        }
        n8 = 0x1010171;
        int n10 = 16843119;
        int n14 = 16843117;
        int n15 = 0x1010170;
        int n16 = 16843118;
        try {
            int[] nArray = new int[]{n10, n14, n15, n16, n8};
            context = context.getTheme();
            context = context.obtainStyledAttributes(object, nArray, n3, n4);
            object = "context.theme.obtainStyl\u2026efStyleAttr, defStyleRes)";
            Intrinsics.checkNotNullExpressionValue(context, (String)object);
            n7 = 0;
            object = null;
        }
        catch (Throwable throwable) {}
        try {
            n3 = context.getResourceId(0, 0);
            n4 = 1;
            n4 = context.getResourceId(n4, 0);
            n8 = 2;
            n8 = context.getResourceId(n8, 0);
            n10 = 3;
            n10 = context.getResourceId(n10, 0);
            this.setCompoundDrawablesWithIntrinsicBounds(n3, n4, n8, n10);
            n3 = 4;
            n7 = context.getDimensionPixelSize(n3, 0);
        }
        catch (Throwable throwable) {
            context.recycle();
            throw throwable;
        }
        context.recycle();
        this.setCompoundDrawablePadding(n7);
        return;
        td0.a((Object)this, throwable);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(Context context, AttributeSet object, int n3, int n4) {
        int n7;
        int n8 = td0.b((Object)this);
        if (n8 != 0) {
            return;
        }
        n8 = 16842969;
        int n10 = 16842966;
        int n14 = 16842967;
        int n15 = 16842968;
        try {
            int[] nArray = new int[]{n10, n14, n15, n8};
            context = context.getTheme();
            context = context.obtainStyledAttributes(object, nArray, n3, n4);
            object = "context.theme.obtainStyl\u2026efStyleAttr, defStyleRes)";
            Intrinsics.checkNotNullExpressionValue(context, (String)object);
            n7 = 0;
            object = null;
        }
        catch (Throwable throwable) {}
        try {
            n3 = context.getDimensionPixelSize(0, 0);
            n4 = 1;
            n4 = context.getDimensionPixelSize(n4, 0);
            n8 = 2;
            n8 = context.getDimensionPixelSize(n8, 0);
            n10 = 3;
            n7 = context.getDimensionPixelSize(n10, 0);
            this.setPadding(n3, n4, n8, n7);
        }
        catch (Throwable throwable) {
            context.recycle();
            throw throwable;
        }
        context.recycle();
        return;
        td0.a((Object)this, throwable);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(Context context, AttributeSet object, int n3, int n4) {
        Throwable throwable3222;
        block13: {
            int n7;
            String string2 = "context.theme.obtainStyl\u2026efStyleAttr, defStyleRes)";
            int n8 = td0.b((Object)this);
            if (n8 != 0) {
                return;
            }
            n8 = 16842904;
            Object object2 = new int[]{n8};
            Resources.Theme theme = context.getTheme();
            object2 = theme.obtainStyledAttributes(object, object2, n3, n4);
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            theme = null;
            ColorStateList colorStateList = object2.getColorStateList(0);
            this.setTextColor(colorStateList);
            object2.recycle();
            n8 = 16842927;
            object2 = new int[]{n8};
            colorStateList = context.getTheme();
            object2 = colorStateList.obtainStyledAttributes(object, object2, n3, n4);
            Intrinsics.checkNotNullExpressionValue(object2, string2);
            int n10 = 17;
            n10 = object2.getInt(0, n10);
            object2.recycle();
            this.setGravity(n10);
            n8 = 16843087;
            n10 = 16842901;
            int n14 = 16842903;
            object2 = new int[]{n10, n14, n8};
            context = context.getTheme();
            context = context.obtainStyledAttributes(object, object2, n3, n4);
            Intrinsics.checkNotNullExpressionValue(context, string2);
            try {
                n7 = context.getDimensionPixelSize(0, 0);
            }
            catch (Throwable throwable2) {
                context.recycle();
                throw throwable2;
            }
            float f5 = n7;
            this.setTextSize(0, f5);
            object = this.getTypeface();
            n3 = 1;
            object = Typeface.create((Typeface)object, (int)n3);
            this.setTypeface((Typeface)object);
            n7 = 2;
            f5 = 2.8E-45f;
            object = context.getString(n7);
            try {
                context.recycle();
                this.setText((CharSequence)object);
                return;
            }
            catch (Throwable throwable3222) {}
            break block13;
            catch (Throwable throwable4) {
                object2.recycle();
                throw throwable4;
            }
            catch (Throwable throwable5) {
                object2.recycle();
                throw throwable5;
            }
        }
        td0.a((Object)this, throwable3222);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Activity getActivity() {
        Object object;
        block7: {
            boolean bl2;
            boolean bl3 = td0.b((Object)this);
            if (bl3) {
                return null;
            }
            object = this.getContext();
            while (!(bl2 = object instanceof Activity) && (bl2 = object instanceof ContextWrapper)) {
                try {
                    object = (ContextWrapper)object;
                    object = object.getBaseContext();
                    return object;
                }
                finally {
                }
            }
            bl2 = object instanceof Activity;
            if (!bl2) break block7;
            try {
                return (Activity)object;
            }
            catch (Throwable throwable) {}
        }
        String string2 = "Unable to get Activity.";
        object = new FacebookException(string2);
        throw object;
    }

    public final String getAnalyticsButtonCreatedEventName() {
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return null;
        }
        try {
            return this.a;
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return null;
        }
    }

    public final String getAnalyticsButtonTappedEventName() {
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return null;
        }
        try {
            return this.b;
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return null;
        }
    }

    public final O3 getAndroidxActivityResultRegistryOwner() {
        Throwable throwable2;
        block4: {
            Object object;
            block5: {
                Object object2;
                boolean bl2 = td0.b((Object)this);
                object = null;
                if (bl2) {
                    return null;
                }
                try {
                    object2 = this.getActivity();
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                boolean bl3 = object2 instanceof O3;
                if (!bl3) break block5;
                object = object2 = (O3)object2;
            }
            return object;
        }
        td0.a((Object)this, throwable2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int getCompoundPaddingLeft() {
        int n3 = td0.b((Object)this);
        if (n3 != 0) {
            return 0;
        }
        try {
            n3 = this.e;
            if (n3 == 0) return super.getCompoundPaddingLeft();
            return this.f;
        }
        catch (Throwable throwable) {}
        td0.a((Object)this, throwable);
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int getCompoundPaddingRight() {
        int n3 = td0.b((Object)this);
        if (n3 != 0) {
            return 0;
        }
        try {
            n3 = this.e;
            if (n3 == 0) return super.getCompoundPaddingRight();
            return this.g;
        }
        catch (Throwable throwable) {}
        td0.a((Object)this, throwable);
        return 0;
    }

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        td0.b((Object)this);
        return 0;
    }

    public final androidx.fragment.app.Fragment getFragment() {
        androidx.fragment.app.Fragment fragment;
        block4: {
            mw0_0 mw0_02;
            boolean bl2 = td0.b((Object)this);
            fragment = null;
            if (bl2) {
                return null;
            }
            try {
                mw0_02 = this.h;
                if (mw0_02 == null) break block4;
            }
            catch (Throwable throwable) {
                td0.a((Object)this, throwable);
                return null;
            }
            fragment = mw0_02.a;
        }
        return fragment;
    }

    public final Fragment getNativeFragment() {
        Fragment fragment;
        block4: {
            mw0_0 mw0_02;
            boolean bl2 = td0.b((Object)this);
            fragment = null;
            if (bl2) {
                return null;
            }
            try {
                mw0_02 = this.h;
                if (mw0_02 == null) break block4;
            }
            catch (Throwable throwable) {
                td0.a((Object)this, throwable);
                return null;
            }
            fragment = mw0_02.b;
        }
        return fragment;
    }

    public int getRequestCode() {
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return 0;
        }
        try {
            return this.getDefaultRequestCode();
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return 0;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onAttachedToWindow() {
        Throwable throwable22222222;
        block8: {
            boolean bl2 = td0.b((Object)this);
            if (bl2) {
                return;
            }
            super.onAttachedToWindow();
            bl2 = this.isInEditMode();
            if (bl2) return;
            Context context = this.getContext();
            boolean bl3 = td0.b((Object)this);
            if (bl3) {
                return;
            }
            {
                catch (Throwable throwable22222222) {
                    break block8;
                }
                g g3 = new g(context, null);
                String string2 = "loggerImpl";
                Intrinsics.checkNotNullParameter(g3, string2);
                String string3 = this.a;
                try {
                    boolean bl4 = j.c();
                    if (!bl4) return;
                    g3.h(null, string3);
                    return;
                }
                catch (Throwable throwable3) {}
                {
                    td0.a((Object)this, throwable3);
                    return;
                }
            }
        }
        td0.a((Object)this, throwable22222222);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDraw(Canvas canvas) {
        Throwable throwable2;
        block8: {
            block7: {
                int n3;
                int n4;
                int n7 = td0.b((Object)this);
                if (n7 != 0) {
                    return;
                }
                String string2 = "canvas";
                try {
                    Intrinsics.checkNotNullParameter(canvas, string2);
                    n7 = this.getGravity();
                    n4 = 1;
                    if ((n7 &= n4) == 0) break block7;
                    n7 = this.getCompoundPaddingLeft();
                    int n8 = this.getCompoundPaddingRight();
                    n3 = this.getCompoundDrawablePadding() + n7;
                    int n10 = this.getWidth() - n3 - n8;
                }
                catch (Throwable throwable2) {
                    break block8;
                }
                {
                    CharSequence charSequence = this.getText();
                    charSequence = ((Object)charSequence).toString();
                    n3 = this.b((String)charSequence);
                    n10 -= n3;
                }
                {
                    n3 = this.getPaddingLeft();
                    n3 = n7 - n3;
                }
                {
                    n3 /= 2;
                    n3 = Math.min(n10 /= 2, n3);
                }
                this.f = n7 -= n3;
                this.g = n8 += n3;
                this.e = n4;
            }
            super.onDraw(canvas);
            canvas = null;
            this.e = false;
            return;
        }
        td0.a((Object)this, throwable2);
    }

    public final void setFragment(Fragment fragment) {
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return;
        }
        Object object = "fragment";
        try {
            Intrinsics.checkNotNullParameter(fragment, (String)object);
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return;
        }
        object = new mw0_0(fragment);
        this.h = object;
    }

    public final void setFragment(androidx.fragment.app.Fragment fragment) {
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return;
        }
        Object object = "fragment";
        try {
            Intrinsics.checkNotNullParameter(fragment, (String)object);
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return;
        }
        object = new mw0_0(fragment);
        this.h = object;
    }

    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return;
        }
        try {
            this.d = onClickListener;
            return;
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return;
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return;
        }
        try {
            this.c = onClickListener;
            return;
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return;
        }
    }
}

