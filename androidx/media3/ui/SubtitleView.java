/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Typeface
 *  android.text.Spannable
 *  android.text.SpannableString
 *  android.text.Spanned
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.accessibility.CaptioningManager
 *  android.widget.FrameLayout
 */
package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import androidx.media3.ui.CanvasSubtitleOutput;
import androidx.media3.ui.SubtitleView$a;
import androidx.media3.ui.WebViewSubtitleOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class SubtitleView
extends FrameLayout {
    public List a;
    public FL b;
    public int c;
    public float d;
    public float e;
    public boolean f;
    public boolean g;
    public int h;
    public SubtitleView$a i;
    public View j;

    public SubtitleView(Context context) {
        this(context, null);
    }

    public SubtitleView(Context context, AttributeSet object) {
        super(context, object);
        boolean bl2;
        object = Collections.emptyList();
        this.a = object;
        object = FL.g;
        this.b = object;
        this.c = 0;
        this.d = 0.0533f;
        this.e = 0.08f;
        this.f = bl2 = true;
        this.g = bl2;
        CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, null);
        this.i = canvasSubtitleOutput;
        this.j = canvasSubtitleOutput;
        this.addView(canvasSubtitleOutput);
        this.h = (int)(bl2 ? 1 : 0);
    }

    private List getCuesWithStylingPreferencesApplied() {
        Object object;
        int n3;
        boolean bl2 = this.f;
        if (bl2 && (bl2 = this.g)) {
            return this.a;
        }
        int n4 = this.a.size();
        ArrayList<Object> arrayList = new ArrayList<Object>(n4);
        n4 = 0;
        for (int i3 = 0; i3 < (n3 = (object = this.a).size()); ++i3) {
            object = ((Pe0)this.a.get(i3)).a();
            boolean bl3 = this.f;
            if (!bl3) {
                ((Pe0$a)object).n = false;
                CharSequence charSequence = ((Pe0$a)object).a;
                int n7 = charSequence instanceof Spanned;
                if (n7 != 0) {
                    n7 = charSequence instanceof Spannable;
                    if (n7 == 0) {
                        ((Pe0$a)object).a = charSequence = SpannableString.valueOf((CharSequence)charSequence);
                    }
                    charSequence = ((Pe0$a)object).a;
                    charSequence.getClass();
                    charSequence = (Spannable)charSequence;
                    n7 = charSequence.length();
                    Class<Object> clazz = Object.class;
                    for (Object object2 : charSequence.getSpans(0, n7, clazz)) {
                        boolean bl4 = object2 instanceof jp1_2 ^ true;
                        if (!bl4) continue;
                        charSequence.removeSpan(object2);
                    }
                }
                zf3_0.a((Pe0$a)object);
            } else {
                bl3 = this.g;
                if (!bl3) {
                    zf3_0.a((Pe0$a)object);
                }
            }
            object = ((Pe0$a)object).a();
            arrayList.add(object);
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        boolean bl2;
        boolean bl3 = this.isInEditMode();
        float f5 = 1.0f;
        if (bl3) {
            return f5;
        }
        Context context = this.getContext();
        String string2 = "captioning";
        if ((context = (CaptioningManager)context.getSystemService(string2)) != null && (bl2 = context.isEnabled())) {
            f5 = context.getFontScale();
        }
        return f5;
    }

    private FL getUserCaptionStyle() {
        int n3;
        boolean bl2 = this.isInEditMode();
        FL fL = FL.g;
        if (bl2) {
            return fL;
        }
        Context context = this.getContext();
        String string2 = "captioning";
        if ((context = (CaptioningManager)context.getSystemService(string2)) != null && (n3 = context.isEnabled()) != 0) {
            FL fL2;
            int n4;
            context = context.getUserStyle();
            int n7 = context.hasForegroundColor();
            n3 = -1;
            int n8 = n7 != 0 ? (n7 = context.foregroundColor) : -1;
            n7 = (int)(context.hasBackgroundColor() ? 1 : 0);
            if (n7 != 0) {
                n4 = n7 = context.backgroundColor;
            } else {
                n7 = -16777216;
                n4 = -16777216;
            }
            n7 = (int)(context.hasWindowColor() ? 1 : 0);
            int n10 = 0;
            int n14 = n7 != 0 ? (n7 = context.windowColor) : 0;
            n7 = (int)(context.hasEdgeType() ? 1 : 0);
            if (n7 != 0) {
                n10 = n7 = context.edgeType;
            }
            int n15 = (n7 = (int)(context.hasEdgeColor() ? 1 : 0)) != 0 ? (n7 = context.edgeColor) : -1;
            context = context.getTypeface();
            fL = fL2;
            n3 = n8;
            n8 = n4;
            n4 = n14;
            n14 = n15;
            fL2 = new FL(n3, n8, n4, n10, n15, (Typeface)context);
        }
        return fL;
    }

    private void setView(View view) {
        Object object = this.j;
        this.removeView((View)object);
        object = this.j;
        boolean bl2 = object instanceof WebViewSubtitleOutput;
        if (bl2) {
            object = ((WebViewSubtitleOutput)object).b;
            object.destroy();
        }
        this.j = view;
        object = view;
        object = (SubtitleView$a)view;
        this.i = object;
        this.addView(view);
    }

    public final void a() {
        SubtitleView$a subtitleView$a = this.i;
        List list = this.getCuesWithStylingPreferencesApplied();
        FL fL = this.b;
        float f5 = this.d;
        int n3 = this.c;
        float f6 = this.e;
        subtitleView$a.a(list, fL, f5, n3, f6);
    }

    public void setApplyEmbeddedFontSizes(boolean bl2) {
        this.g = bl2;
        this.a();
    }

    public void setApplyEmbeddedStyles(boolean bl2) {
        this.f = bl2;
        this.a();
    }

    public void setBottomPaddingFraction(float f5) {
        this.e = f5;
        this.a();
    }

    public void setCues(List list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.a = list;
        this.a();
    }

    public void setFixedTextSize(int n3, float f5) {
        Context context = this.getContext();
        context = context == null ? Resources.getSystem() : context.getResources();
        context = context.getDisplayMetrics();
        float f6 = TypedValue.applyDimension((int)n3, (float)f5, (DisplayMetrics)context);
        this.c = 2;
        this.d = f6;
        this.a();
    }

    public void setFractionalTextSize(float f5) {
        this.setFractionalTextSize(f5, false);
    }

    public void setFractionalTextSize(float f5, boolean bl2) {
        this.c = (int)(bl2 ? 1 : 0);
        this.d = f5;
        this.a();
    }

    public void setStyle(FL fL) {
        this.b = fL;
        this.a();
    }

    public void setUserDefaultStyle() {
        FL fL = this.getUserCaptionStyle();
        this.setStyle(fL);
    }

    public void setUserDefaultTextSize() {
        float f5 = this.getUserCaptionFontScale() * 0.0533f;
        this.setFractionalTextSize(f5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void setViewType(int n3) {
        int n4 = this.h;
        if (n4 == n3) {
            return;
        }
        n4 = 1;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
                throw illegalArgumentException;
            }
            Context context = this.getContext();
            WebViewSubtitleOutput webViewSubtitleOutput = new WebViewSubtitleOutput(context, null);
            this.setView((View)webViewSubtitleOutput);
        } else {
            Context context = this.getContext();
            CanvasSubtitleOutput canvasSubtitleOutput = new CanvasSubtitleOutput(context, null);
            this.setView(canvasSubtitleOutput);
        }
        this.h = n3;
    }
}

