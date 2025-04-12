/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 */
package com.facebook.login.widget;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.Profile;
import com.facebook.b;
import com.facebook.g;
import com.facebook.internal.ImageDownloader;
import com.facebook.internal.c;
import com.facebook.internal.c$b;
import com.facebook.login.R$dimen;
import com.facebook.login.R$drawable;
import com.facebook.login.R$styleable;
import com.facebook.login.widget.ProfilePictureView$a;
import com.facebook.login.widget.ProfilePictureView$b;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

public final class ProfilePictureView
extends FrameLayout {
    public static final String j;
    public final ImageView a;
    public int b;
    public int c;
    public c d;
    public Bitmap e;
    public ProfilePictureView$b f;
    public String g;
    public boolean h;
    public int i;

    static {
        String string2 = "ProfilePictureView";
        Intrinsics.checkNotNullExpressionValue(string2, "ProfilePictureView::class.java.simpleName");
        j = string2;
    }

    public ProfilePictureView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        Context context2 = this.getContext();
        super(context2);
        this.a = context;
        this.h = true;
        this.i = -1;
        this.d();
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        super(context, attributeSet);
        Context context2 = this.getContext();
        super(context2);
        this.a = context;
        this.h = true;
        this.i = -1;
        this.d();
        this.e(attributeSet);
    }

    public ProfilePictureView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attributeSet, "attrs");
        super(context, attributeSet, n3);
        Context context2 = this.getContext();
        super(context2);
        this.a = context;
        this.h = true;
        this.i = -1;
        this.d();
        this.e(attributeSet);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(ProfilePictureView profilePictureView, qe1_0 object) {
        Throwable throwable2;
        block5: {
            Object object2 = "this$0";
            Intrinsics.checkNotNullParameter((Object)profilePictureView, (String)object2);
            ((Object)((Object)profilePictureView)).getClass();
            boolean bl2 = td0.b((Object)profilePictureView);
            if (bl2) {
                return;
            }
            try {
                object2 = ((qe1_0)object).a;
                Object object3 = profilePictureView.d;
                bl2 = Intrinsics.areEqual(object2, object3);
                if (!bl2) {
                    return;
                }
                bl2 = false;
                object2 = null;
                profilePictureView.d = null;
                object2 = ((qe1_0)object).d;
                object3 = ((qe1_0)object).b;
                if (object3 != null) {
                    object = sx1.d;
                    object = Ax1.REQUESTS;
                    object2 = j;
                    object3 = object3.toString();
                    sx1$a.c((Ax1)((Object)object), (String)object2, (String)object3);
                    return;
                }
            }
            catch (Throwable throwable2) {
                break block5;
            }
            if (object2 == null) return;
            profilePictureView.setImageBitmap((Bitmap)object2);
            boolean bl3 = ((qe1_0)object).c;
            if (!bl3) return;
            bl3 = false;
            object = null;
            profilePictureView.g(false);
            return;
        }
        td0.a((Object)profilePictureView, throwable2);
    }

    private final void setImageBitmap(Bitmap bitmap) {
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return;
        }
        if (bitmap != null) {
            ImageView imageView = this.a;
            try {
                imageView.setImageBitmap(bitmap);
            }
            catch (Throwable throwable) {
                td0.a((Object)this, throwable);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int b(boolean n3) {
        Throwable throwable2;
        block9: {
            block8: {
                block5: {
                    block6: {
                        block7: {
                            int n4 = td0.b((Object)this);
                            if (n4 != 0) {
                                return 0;
                            }
                            try {
                                n4 = this.i;
                                int n7 = -1;
                                if (n4 == n7 && n3 == 0) {
                                    return 0;
                                }
                                n3 = -4;
                                if (n4 == n3) break block5;
                                n3 = -3;
                                if (n4 == n3) break block6;
                                n3 = -2;
                                if (n4 == n3) break block7;
                                if (n4 != n7) {
                                    return 0;
                                }
                                n3 = R$dimen.com_facebook_profilepictureview_preset_size_normal;
                                break block8;
                            }
                            catch (Throwable throwable2) {
                                break block9;
                            }
                        }
                        n3 = R$dimen.com_facebook_profilepictureview_preset_size_small;
                        break block8;
                    }
                    n3 = R$dimen.com_facebook_profilepictureview_preset_size_normal;
                    break block8;
                }
                n3 = R$dimen.com_facebook_profilepictureview_preset_size_large;
            }
            Resources resources = this.getResources();
            return resources.getDimensionPixelSize(n3);
        }
        td0.a((Object)this, throwable2);
        return 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Uri c(String string2) {
        int n3;
        int n4;
        Object object = com.facebook.g.d.a().c;
        if (object != null) {
            Date date;
            Object object2;
            Object object3 = AccessToken.l;
            object3 = com.facebook.b.f.a().c;
            if (object3 != null && (n4 = (int)(((Date)(object2 = new Date())).after(date = ((AccessToken)object3).a) ? 1 : 0)) == 0 && (object3 = ((AccessToken)object3).k) != null && (n3 = (int)(((String)object3).equals(object2 = "instagram") ? 1 : 0)) != 0) {
                int n7 = this.c;
                n3 = this.b;
                object2 = ((Profile)object).g;
                if (object2 != null) return object2;
                n4 = (int)(AccessToken$b.c() ? 1 : 0);
                if (n4 != 0) {
                    object2 = AccessToken$b.b();
                    if (object2 != null) {
                        object2 = ((AccessToken)object2).e;
                    } else {
                        n4 = 0;
                        object2 = null;
                    }
                } else {
                    object2 = "";
                }
                object = ((Profile)object).a;
                return c$b.a(n7, n3, (String)object, (String)object2);
            }
        }
        object = this.g;
        n3 = this.c;
        n4 = this.b;
        return c$b.a(n3, n4, (String)object, string2);
    }

    public final void d() {
        int n3;
        Object object = this.a;
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return;
        }
        try {
            this.removeAllViews();
            n3 = -1;
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(n3, n3);
        object.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        layoutParams = ImageView.ScaleType.CENTER_INSIDE;
        object.setScaleType((ImageView.ScaleType)layoutParams);
        this.addView((View)object);
        object = new ProfilePictureView$b(this);
        this.f = object;
    }

    public final void e(AttributeSet attributeSet) {
        Object object;
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return;
        }
        try {
            object = this.getContext();
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return;
        }
        int[] nArray = R$styleable.com_facebook_profile_picture_view;
        attributeSet = object.obtainStyledAttributes(attributeSet, nArray);
        object = "context.obtainStyledAttr\u2026ook_profile_picture_view)";
        Intrinsics.checkNotNullExpressionValue(attributeSet, (String)object);
        int n3 = R$styleable.com_facebook_profile_picture_view_com_facebook_preset_size;
        int n4 = -1;
        int n7 = attributeSet.getInt(n3, n4);
        this.setPresetSize(n7);
        int n8 = R$styleable.com_facebook_profile_picture_view_com_facebook_is_cropped;
        boolean bl3 = true;
        boolean bl4 = attributeSet.getBoolean(n8, bl3);
        this.setCropped(bl4);
        attributeSet.recycle();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(boolean bl2) {
        Throwable throwable2;
        block8: {
            block7: {
                boolean bl3 = td0.b((Object)this);
                if (bl3) {
                    return;
                }
                try {
                    int n3;
                    bl3 = this.i();
                    String string2 = this.g;
                    if (string2 == null || (n3 = string2.length()) == 0) break block7;
                    n3 = this.c;
                    boolean bl4 = true;
                    if (n3 == 0 && (n3 = this.b) == 0) {
                        n3 = 1;
                    } else {
                        n3 = 0;
                        string2 = null;
                    }
                    if (n3 == 0) {
                        if (!bl3) {
                            if (!bl2) return;
                        }
                        this.g(bl4);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
            }
            this.h();
            return;
        }
        td0.a((Object)this, throwable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g(boolean bl2) {
        Throwable throwable2;
        block5: {
            Object object;
            Object object2;
            Object object3;
            block4: {
                object3 = "context";
                boolean bl3 = td0.b((Object)this);
                if (bl3) {
                    return;
                }
                try {
                    object2 = AccessToken.l;
                    bl3 = AccessToken$b.c();
                    object = "";
                    if (!bl3 || (object2 = AccessToken$b.b()) == null || (object2 = ((AccessToken)object2).e) == null) break block4;
                    object = object2;
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            object2 = this.c((String)object);
            object = this.getContext();
            Intrinsics.checkNotNullExpressionValue(object, (String)object3);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object3 = "imageUri";
            Intrinsics.checkNotNullParameter(object2, (String)object3);
            object3 = new zz_0((Object)this);
            object = new c((Uri)object2, (zz_0)object3, bl2, (Object)this);
            c c2 = this.d;
            if (c2 != null) {
                ImageDownloader.c(c2);
            }
            this.d = object;
            ImageDownloader.d((c)object);
            return;
        }
        td0.a((Object)this, throwable2);
    }

    public final ProfilePictureView$a getOnErrorListener() {
        return null;
    }

    public final int getPresetSize() {
        return this.i;
    }

    public final String getProfileId() {
        return this.g;
    }

    public final boolean getShouldUpdateOnProfileChange() {
        boolean bl2;
        ProfilePictureView$b profilePictureView$b = this.f;
        if (profilePictureView$b != null) {
            bl2 = profilePictureView$b.c;
        } else {
            bl2 = false;
            profilePictureView$b = null;
        }
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        Throwable throwable2;
        block5: {
            c c2;
            int n3;
            block4: {
                n3 = td0.b((Object)this);
                if (n3 != 0) {
                    return;
                }
                try {
                    c2 = this.d;
                    if (c2 == null) break block4;
                    ImageDownloader.c(c2);
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            if ((c2 = this.e) != null) {
                this.i();
                int n4 = this.c;
                int n7 = this.b;
                c2 = Bitmap.createScaledBitmap((Bitmap)c2, (int)n4, (int)n7, (boolean)false);
                String string2 = "createScaledBitmap(custo\u2026idth, queryHeight, false)";
                Intrinsics.checkNotNullExpressionValue(c2, string2);
                this.setImageBitmap((Bitmap)c2);
                return;
            }
            n3 = this.h;
            n3 = n3 != 0 ? R$drawable.com_facebook_profile_picture_blank_square : R$drawable.com_facebook_profile_picture_blank_portrait;
            Resources resources = this.getResources();
            c2 = BitmapFactory.decodeResource((Resources)resources, (int)n3);
            this.setImageBitmap((Bitmap)c2);
            return;
        }
        td0.a((Object)this, throwable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean i() {
        Throwable throwable2;
        block10: {
            boolean bl2;
            boolean bl3;
            boolean bl4;
            boolean bl5;
            block9: {
                block8: {
                    bl5 = td0.b((Object)this);
                    if (bl5) {
                        return false;
                    }
                    try {
                        bl5 = this.getHeight();
                        bl4 = this.getWidth();
                        bl3 = true;
                        if (bl4 < bl3) return false;
                        if (bl5 < bl3) {
                            return false;
                        }
                        bl2 = this.b(false);
                        if (bl2) {
                            bl5 = bl2;
                            bl4 = bl2;
                        }
                        if (bl4 > bl5) break block8;
                        bl5 = this.h;
                        if (bl5) {
                            bl5 = bl4;
                            break block9;
                        } else {
                            bl5 = false;
                            Object var5_5 = null;
                        }
                        break block9;
                    }
                    catch (Throwable throwable2) {
                        break block10;
                    }
                }
                bl4 = this.h;
                bl4 = bl4 ? bl5 : false;
            }
            bl2 = this.c;
            if (bl4 == bl2 && bl5 == (bl2 = this.b)) {
                bl3 = false;
            }
            this.c = bl4;
            this.b = bl5;
            return bl3;
        }
        td0.a((Object)this, throwable2);
        return false;
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.d = null;
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        super.onLayout(bl2, n3, n4, n7, n8);
        this.f(false);
    }

    public final void onMeasure(int n3, int n4) {
        int n7;
        ViewGroup.LayoutParams layoutParams = this.getLayoutParams();
        int n8 = View.MeasureSpec.getSize((int)n4);
        int n10 = View.MeasureSpec.getSize((int)n3);
        int n14 = View.MeasureSpec.getMode((int)n4);
        int n15 = -2;
        int n16 = 1;
        int n17 = 0x40000000;
        if (n14 != n17 && (n14 = layoutParams.height) == n15) {
            n8 = this.b(n16 != 0);
            n4 = View.MeasureSpec.makeMeasureSpec((int)n8, (int)n17);
            n14 = 1;
        } else {
            n14 = 0;
        }
        int n18 = View.MeasureSpec.getMode((int)n3);
        if (n18 != n17 && (n7 = layoutParams.width) == n15) {
            n10 = this.b(n16 != 0);
            n3 = View.MeasureSpec.makeMeasureSpec((int)n10, (int)n17);
        } else {
            n16 = n14;
        }
        if (n16 != 0) {
            this.setMeasuredDimension(n10, n8);
            this.measureChildren(n3, n4);
        } else {
            super.onMeasure(n3, n4);
        }
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(parcelable, "state");
        Object object = parcelable.getClass();
        Class<Bundle> clazz = Bundle.class;
        int n3 = Intrinsics.areEqual(object, clazz);
        if (n3 == 0) {
            super.onRestoreInstanceState(parcelable);
        } else {
            int bl2;
            parcelable = (Bundle)parcelable;
            object = parcelable.getParcelable("ProfilePictureView_superState");
            super.onRestoreInstanceState(object);
            object = parcelable.getString("ProfilePictureView_profileId");
            this.setProfileId((String)object);
            n3 = parcelable.getInt("ProfilePictureView_presetSize");
            this.setPresetSize(n3);
            n3 = (int)(parcelable.getBoolean("ProfilePictureView_isCropped") ? 1 : 0);
            this.setCropped(n3 != 0);
            this.c = n3 = parcelable.getInt("ProfilePictureView_width");
            object = "ProfilePictureView_height";
            this.b = bl2 = parcelable.getInt((String)object);
            boolean bl3 = true;
            this.f(bl3);
        }
    }

    public final Parcelable onSaveInstanceState() {
        boolean bl2;
        Object object = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ProfilePictureView_superState", object);
        String string2 = this.g;
        bundle.putString("ProfilePictureView_profileId", string2);
        int n3 = this.i;
        bundle.putInt("ProfilePictureView_presetSize", n3);
        n3 = (int)(this.h ? 1 : 0);
        bundle.putBoolean("ProfilePictureView_isCropped", n3 != 0);
        n3 = this.c;
        bundle.putInt("ProfilePictureView_width", n3);
        n3 = this.b;
        bundle.putInt("ProfilePictureView_height", n3);
        object = this.d;
        if (object != null) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        bundle.putBoolean("ProfilePictureView_refresh", bl2);
        return bundle;
    }

    public final void setCropped(boolean bl2) {
        this.h = bl2;
        this.f(false);
    }

    public final void setDefaultProfilePicture(Bitmap bitmap) {
        this.e = bitmap;
    }

    public final void setOnErrorListener(ProfilePictureView$a profilePictureView$a) {
    }

    public final void setPresetSize(int n3) {
        int n4 = -4;
        if (n3 != n4 && n3 != (n4 = -3) && n3 != (n4 = -2) && n3 != (n4 = -1)) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Must use a predefined preset size");
            throw illegalArgumentException;
        }
        this.i = n3;
        this.requestLayout();
    }

    public final void setProfileId(String string2) {
        int n3;
        String string3 = this.g;
        boolean bl2 = true;
        if (string3 != null && (n3 = string3.length()) != 0 && (n3 = (int)(kotlin.text.b.i(string3 = this.g, string2, bl2) ? 1 : 0)) != 0) {
            bl2 = false;
        } else {
            this.h();
        }
        this.g = string2;
        this.f(bl2);
    }

    public final void setShouldUpdateOnProfileChange(boolean bl2) {
        if (bl2) {
            boolean bl3;
            ProfilePictureView$b profilePictureView$b = this.f;
            if (profilePictureView$b != null && !(bl3 = profilePictureView$b.c)) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.facebook.sdk.ACTION_CURRENT_PROFILE_CHANGED");
                Xv1 xv1 = profilePictureView$b.b;
                jb2$a_0 jb2$a_0 = profilePictureView$b.a;
                xv1.b(jb2$a_0, intentFilter);
                profilePictureView$b.c = bl3 = true;
            }
        } else {
            boolean bl4;
            ProfilePictureView$b profilePictureView$b = this.f;
            if (profilePictureView$b != null && (bl4 = profilePictureView$b.c)) {
                jb2$a_0 jb2$a_0 = profilePictureView$b.a;
                Xv1 xv1 = profilePictureView$b.b;
                xv1.d(jb2$a_0);
                bl4 = false;
                jb2$a_0 = null;
                profilePictureView$b.c = false;
            }
        }
    }
}

