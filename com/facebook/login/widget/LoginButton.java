/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.IntentFilter
 *  android.graphics.Canvas
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.GradientDrawable
 *  android.graphics.drawable.StateListDrawable
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.facebook.login.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookSdk;
import com.facebook.common.R$color;
import com.facebook.common.R$drawable;
import com.facebook.login.R$string;
import com.facebook.login.R$style;
import com.facebook.login.R$styleable;
import com.facebook.login.j;
import com.facebook.login.j$c;
import com.facebook.login.widget.LoginButton$a;
import com.facebook.login.widget.LoginButton$b;
import com.facebook.login.widget.LoginButton$c;
import com.facebook.login.widget.LoginButton$d;
import com.facebook.login.widget.LoginButton$e;
import com.facebook.login.widget.a;
import com.facebook.login.widget.a$b;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public class LoginButton
extends FacebookButtonBase {
    public static final /* synthetic */ int y;
    public boolean j;
    public String k;
    public String l;
    public final LoginButton$a m;
    public boolean n;
    public a$b o;
    public LoginButton$c p;
    public long q;
    public a r;
    public LoginButton$e s;
    public rq1_2 t;
    public Float u;
    public int v;
    public final String w;
    public N3 x;

    public LoginButton(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, null, 0, 0);
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, 0, 0);
    }

    public LoginButton(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, n3, 0);
    }

    public LoginButton(Context object, AttributeSet object2, int n3, int n4) {
        Intrinsics.checkNotNullParameter(object, "context");
        String string2 = "fb_login_button_create";
        Intrinsics.checkNotNullParameter(string2, "analyticsButtonCreatedEventName");
        String string3 = "fb_login_button_did_tap";
        Intrinsics.checkNotNullParameter(string3, "analyticsButtonTappedEventName");
        super((Context)object, (AttributeSet)object2, n3, string2, string3);
        super();
        object2 = dk0_0.FRIENDS;
        object.a = object2;
        object2 = mz0_2.a;
        object.b = object2;
        object2 = uy1.NATIVE_WITH_FALLBACK;
        object.c = object2;
        object.d = "rerequest";
        object2 = LA1.FACEBOOK;
        object.e = object2;
        this.m = object;
        object = a$b.BLUE;
        this.o = object;
        LoginButton$c.Companion.getClass();
        object = LoginButton$c.access$getDEFAULT$cp();
        this.p = object;
        this.q = 6000L;
        object = yr1_2.b(xy1.c);
        this.t = object;
        this.v = 255;
        object = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(object, "randomUUID().toString()");
        this.w = object;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Context object, AttributeSet attributeSet, int n3, int n4) {
        Throwable throwable222;
        block8: {
            block9: {
                int n7;
                boolean bl2 = td0.b((Object)this);
                if (bl2) {
                    return;
                }
                Object object2 = "context";
                Intrinsics.checkNotNullParameter(object, (String)object2);
                super.a((Context)object, attributeSet, n3, n4);
                object2 = this.getNewLoginClickListener();
                this.setInternalOnClickListener((View.OnClickListener)object2);
                this.j((Context)object, attributeSet, n3, n4);
                int n8 = this.isInEditMode();
                if (n8 != 0) {
                    object = this.getResources();
                    n7 = R$color.com_facebook_blue;
                    n8 = object.getColor(n7);
                    this.setBackgroundColor(n8);
                    object = "Continue with Facebook";
                    this.setLoginText((String)object);
                } else {
                    object = new LoginButton$e(this);
                    this.s = object;
                }
                this.m();
                this.l();
                n8 = (int)(td0.b((Object)this) ? 1 : 0);
                if (n8 != 0) break block9;
                {
                    catch (Throwable throwable222) {
                        break block8;
                    }
                }
                try {
                    object = this.getBackground();
                    n7 = this.v;
                    object.setAlpha(n7);
                }
                catch (Throwable throwable3) {
                    td0.a((Object)this, throwable3);
                }
            }
            this.k();
            return;
        }
        td0.a((Object)this, throwable222);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        int n3 = td0.b((Object)this);
        if (n3 != 0) {
            return;
        }
        try {
            Object object = this.p;
            Object object2 = LoginButton$d.$EnumSwitchMapping$0;
            n3 = object.ordinal();
            n3 = object2[n3];
            int n4 = 1;
            if (n3 == n4) {
                object = this.getContext();
                object2 = lz3_0.a;
                object2 = "context";
                Xz3.f(object, (String)object2);
                object = FacebookSdk.b();
                object2 = FacebookSdk.d();
                vy1 vy12 = new vy1((String)object, (Object)this, 0);
                object2.execute(vy12);
                return;
            }
            n4 = 2;
            if (n3 != n4) {
                return;
            }
            object = this.getResources();
            n4 = R$string.com_facebook_tooltip_default;
            object = object.getString(n4);
            object2 = "resources.getString(R.st\u2026facebook_tooltip_default)";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            this.h((String)object);
            return;
        }
        catch (Throwable throwable) {}
        td0.a((Object)this, throwable);
    }

    public final String getAuthType() {
        return this.m.d;
    }

    public final bk_1 getCallbackManager() {
        return null;
    }

    public final dk0_0 getDefaultAudience() {
        return this.m.a;
    }

    public int getDefaultRequestCode() {
        dK$c dK$c;
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return 0;
        }
        try {
            dK$c = dK$c.Login;
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return 0;
        }
        return dK$c.toRequestCode();
    }

    public int getDefaultStyleResource() {
        return R$style.com_facebook_loginview_default_style;
    }

    public final String getLoggerID() {
        return this.w;
    }

    public final uy1 getLoginBehavior() {
        return this.m.c;
    }

    public final int getLoginButtonContinueLabel() {
        return R$string.com_facebook_loginview_log_in_button_continue;
    }

    public final rq1_2 getLoginManagerLazy() {
        return this.t;
    }

    public final LA1 getLoginTargetApp() {
        return this.m.e;
    }

    public final String getLoginText() {
        return this.k;
    }

    public final String getLogoutText() {
        return this.l;
    }

    public final String getMessengerPageId() {
        return this.m.f;
    }

    public LoginButton$b getNewLoginClickListener() {
        LoginButton$b loginButton$b = new LoginButton$b(this);
        return loginButton$b;
    }

    public final List getPermissions() {
        return this.m.b;
    }

    public final LoginButton$a getProperties() {
        return this.m;
    }

    public final boolean getResetMessengerState() {
        return this.m.g;
    }

    public final boolean getShouldSkipAccountDeduplication() {
        this.m.getClass();
        return false;
    }

    public final long getToolTipDisplayTime() {
        return this.q;
    }

    public final LoginButton$c getToolTipMode() {
        return this.p;
    }

    public final a$b getToolTipStyle() {
        return this.o;
    }

    /*
     * Exception decompiling
     */
    public final void h(String var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Started 2 blocks at once
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.getStartingBlocks(Op04StructuredStatement.java:412)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:487)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public final int i(String string2) {
        int n3;
        int n4 = td0.b((Object)this);
        if (n4 != 0) {
            return 0;
        }
        try {
            n3 = this.b(string2);
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return 0;
        }
        n4 = this.getCompoundPaddingLeft();
        int n7 = this.getCompoundDrawablePadding();
        n4 = n4 + n7 + n3;
        n3 = this.getCompoundPaddingRight();
        return n4 + n3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(Context context, AttributeSet object, int n3, int n4) {
        Throwable throwable3;
        block9: {
            Throwable throwable22;
            block12: {
                LoginButton$c loginButton$c;
                LoginButton$c[] loginButton$cArray;
                int n7;
                block11: {
                    Object object2;
                    boolean bl2 = td0.b((Object)this);
                    if (bl2) {
                        return;
                    }
                    Object object3 = "context";
                    try {
                        Intrinsics.checkNotNullParameter(context, (String)object3);
                        object3 = LoginButton$c.Companion;
                        object3.getClass();
                        this.p = object2 = LoginButton$c.access$getDEFAULT$cp();
                        context = context.getTheme();
                        object2 = R$styleable.com_facebook_login_view;
                        context = context.obtainStyledAttributes((AttributeSet)object, (int[])object2, n3, n4);
                        object = "context\n            .the\u2026efStyleAttr, defStyleRes)";
                        Intrinsics.checkNotNullExpressionValue(context, (String)object);
                    }
                    catch (Throwable throwable3) {
                        break block9;
                    }
                    try {
                        block10: {
                            n7 = R$styleable.com_facebook_login_view_com_facebook_confirm_logout;
                            n3 = 1;
                            n7 = (int)(context.getBoolean(n7, n3 != 0) ? 1 : 0);
                            this.j = n7;
                            n7 = R$styleable.com_facebook_login_view_com_facebook_login_text;
                            object = context.getString(n7);
                            this.setLoginText((String)object);
                            n7 = R$styleable.com_facebook_login_view_com_facebook_logout_text;
                            object = context.getString(n7);
                            this.setLogoutText((String)object);
                            n7 = R$styleable.com_facebook_login_view_com_facebook_tooltip_mode;
                            object3.getClass();
                            loginButton$cArray = LoginButton$c.access$getDEFAULT$cp();
                            n3 = loginButton$cArray.getIntValue();
                            n7 = context.getInt(n7, n3);
                            object3.getClass();
                            loginButton$cArray = LoginButton$c.values();
                            n4 = loginButton$cArray.length;
                            bl2 = false;
                            object3 = null;
                            object2 = null;
                            for (int i3 = 0; i3 < n4; ++i3) {
                                loginButton$c = loginButton$cArray[i3];
                                int n8 = loginButton$c.getIntValue();
                                if (n8 != n7) {
                                    continue;
                                }
                                break block10;
                            }
                            loginButton$c = null;
                        }
                        if (loginButton$c != null) break block11;
                        object = LoginButton$c.Companion;
                        object.getClass();
                        loginButton$c = LoginButton$c.access$getDEFAULT$cp();
                    }
                    catch (Throwable throwable22) {
                        break block12;
                    }
                }
                this.p = loginButton$c;
                n7 = R$styleable.com_facebook_login_view_com_facebook_login_button_radius;
                if ((n7 = (int)(context.hasValue(n7) ? 1 : 0)) != 0) {
                    n7 = R$styleable.com_facebook_login_view_com_facebook_login_button_radius;
                    n3 = 0;
                    loginButton$cArray = null;
                    float f5 = context.getDimension(n7, 0.0f);
                    this.u = object = Float.valueOf(f5);
                }
                n7 = R$styleable.com_facebook_login_view_com_facebook_login_button_transparency;
                n3 = 255;
                this.v = n7 = context.getInteger(n7, n3);
                this.v = n7 = Math.max(0, n7);
                this.v = n7 = Math.min(n3, n7);
                context.recycle();
                return;
            }
            context.recycle();
            throw throwable22;
        }
        td0.a((Object)this, throwable3);
    }

    public final void k() {
        Context context;
        boolean bl2 = td0.b((Object)this);
        if (bl2) {
            return;
        }
        try {
            context = this.getContext();
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return;
        }
        int n3 = R$drawable.com_facebook_button_icon;
        context = xn.a(context, n3);
        n3 = 0;
        this.setCompoundDrawablesWithIntrinsicBounds((Drawable)context, null, null, null);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void l() {
        block7: {
            var1_1 = td0.b((Object)this);
            if (var1_1) {
                return;
            }
            var2_2 = this.u;
            if (var2_2 == null) return;
            var3_4 = var2_2.floatValue();
            var4_5 = this.getBackground();
            var5_6 = Build.VERSION.SDK_INT;
            var6_7 = 29;
            if (var5_6 < var6_7 || (var5_6 = var4_5 instanceof StateListDrawable) == 0) break block7;
            var7_8 = var4_5;
            try {
                var7_8 = (StateListDrawable)var4_5;
                var5_6 = uf_0.a((StateListDrawable)var7_8);
                for (var6_7 = 0; var6_7 < var5_6; ++var6_7) {
                    var8_9 = var4_5;
                    var8_9 = (StateListDrawable)var4_5;
                }
            }
            catch (Throwable var2_3) {}
            {
                block8: {
                    var9_10 = (var8_9 = vf.b((StateListDrawable)var8_9, var6_7)) instanceof GradientDrawable;
                    if (!var9_10) ** GOTO lbl25
                    var8_9 = (GradientDrawable)var8_9;
                    break block8;
lbl25:
                    // 1 sources

                    var8_9 = null;
                }
                if (var8_9 == null) continue;
                var8_9.setCornerRadius(var3_4);
                continue;
            }
        }
        if ((var5_6 = var4_5 instanceof GradientDrawable) == 0) return;
        var4_5 = (GradientDrawable)var4_5;
        var4_5.setCornerRadius(var3_4);
        return;
        td0.a((Object)this, var2_3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void m() {
        Throwable throwable2;
        block8: {
            int n3;
            Object object;
            int n4;
            Object object2;
            block7: {
                boolean bl2 = td0.b((Object)this);
                if (bl2) {
                    return;
                }
                try {
                    object2 = this.getResources();
                    n4 = this.isInEditMode();
                    if (n4 != 0) break block7;
                    object = AccessToken.l;
                    n4 = AccessToken$b.c();
                    if (n4 != 0) {
                        object = this.l;
                        if (object == null) {
                            n4 = R$string.com_facebook_loginview_log_out_button;
                            object = object2.getString(n4);
                        }
                        this.setText((CharSequence)object);
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block8;
                }
            }
            if ((object = this.k) != null) {
                this.setText((CharSequence)object);
                return;
            }
            n4 = this.getLoginButtonContinueLabel();
            object = object2.getString(n4);
            String string2 = "resources.getString(loginButtonContinueLabel)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            int n7 = this.getWidth();
            if (n7 != 0 && (n3 = this.i((String)object)) > n7) {
                n4 = R$string.com_facebook_loginview_log_in_button;
                object = object2.getString(n4);
                object2 = "resources.getString(R.st\u2026_loginview_log_in_button)";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            }
            this.setText((CharSequence)object);
            return;
        }
        td0.a((Object)this, throwable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAttachedToWindow() {
        Throwable throwable2;
        block7: {
            boolean bl2;
            Object object;
            Object object2;
            String string2;
            Object object3;
            boolean bl3 = td0.b((Object)this);
            if (bl3) {
                return;
            }
            try {
                super.onAttachedToWindow();
                object3 = this.getContext();
            }
            catch (Throwable throwable2) {
                break block7;
            }
            bl3 = object3 instanceof O3;
            if (bl3) {
                object3 = this.getContext();
                string2 = "null cannot be cast to non-null type androidx.activity.result.ActivityResultRegistryOwner";
                Intrinsics.checkNotNull(object3, string2);
                object3 = (O3)object3;
                object3 = object3.getActivityResultRegistry();
                string2 = "facebook-login";
                object2 = this.t;
                object2 = object2.getValue();
                object2 = (j)object2;
                object = this.w;
                object2.getClass();
                j$c j$c = new j$c((j)object2, (String)object);
                object2 = new Object();
                this.x = object3 = ((K3)object3).d(string2, j$c, (w3)object2);
            }
            if ((object3 = this.s) != null && (bl2 = ((G1)object3).c)) {
                if (!bl2) {
                    string2 = new IntentFilter();
                    object2 = "com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED";
                    string2.addAction((String)object2);
                    object2 = ((G1)object3).b;
                    object = ((G1)object3).a;
                    ((Xv1)object2).b((BroadcastReceiver)object, (IntentFilter)string2);
                    ((G1)object3).c = bl2 = true;
                }
                this.m();
            }
            return;
        }
        td0.a((Object)this, throwable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onDetachedFromWindow() {
        Throwable throwable2;
        block6: {
            boolean bl2;
            Object object;
            boolean bl3;
            block5: {
                bl3 = td0.b((Object)this);
                if (bl3) {
                    return;
                }
                try {
                    super.onDetachedFromWindow();
                    object = this.x;
                    if (object == null) break block5;
                    ((N3)object).b();
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            if ((object = this.s) != null && (bl2 = ((G1)object).c)) {
                G1$a g1$a = ((G1)object).a;
                Xv1 xv1 = ((G1)object).b;
                xv1.d(g1$a);
                bl2 = false;
                g1$a = null;
                ((G1)object).c = false;
            }
            if ((object = this.r) != null) {
                ((a)object).a();
            }
            bl3 = false;
            object = null;
            this.r = null;
            return;
        }
        td0.a((Object)this, throwable2);
    }

    public final void onDraw(Canvas canvas) {
        Throwable throwable2;
        block7: {
            block6: {
                boolean bl2 = td0.b((Object)this);
                if (bl2) {
                    return;
                }
                String string2 = "canvas";
                try {
                    Intrinsics.checkNotNullParameter(canvas, string2);
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                super.onDraw(canvas);
                boolean bl3 = this.n;
                if (bl3) break block6;
                bl3 = this.isInEditMode();
                if (bl3) break block6;
                bl3 = true;
                this.n = bl3;
                this.g();
            }
            return;
        }
        td0.a((Object)this, throwable2);
    }

    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        boolean bl3 = td0.b((Object)this);
        if (bl3) {
            return;
        }
        try {
            super.onLayout(bl2, n3, n4, n7, n8);
            this.m();
            return;
        }
        catch (Throwable throwable) {
            td0.a((Object)this, throwable);
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onMeasure(int n3, int n4) {
        Throwable throwable3;
        block9: {
            String string2;
            int n7;
            int n8;
            int n10;
            Object object;
            block10: {
                Throwable throwable22;
                block12: {
                    String string3;
                    block11: {
                        float f5;
                        n4 = (int)(td0.b((Object)this) ? 1 : 0);
                        if (n4 != 0) {
                            return;
                        }
                        try {
                            object = this.getPaint();
                            object = object.getFontMetrics();
                            n10 = this.getCompoundPaddingTop();
                            float f6 = object.top;
                            f6 = Math.abs(f6);
                            f5 = object.bottom;
                            f5 = Math.abs(f5);
                        }
                        catch (Throwable throwable3) {
                            break block9;
                        }
                        double d2 = f6 += f5;
                        {
                            d2 = Math.ceil(d2);
                        }
                        n4 = (int)d2;
                        n10 += n4;
                        {
                            n4 = this.getCompoundPaddingBottom();
                            n10 += n4;
                            object = this.getResources();
                            n8 = td0.b((Object)this);
                            n7 = 0;
                            if (n8 != 0) break block10;
                        }
                        try {
                            int n14;
                            int n15;
                            int n16;
                            string2 = this.getResources();
                            string3 = this.k;
                            if (string3 != null || (n16 = View.resolveSize((int)(n15 = this.i(string3 = string2.getString(n14 = R$string.com_facebook_loginview_log_in_button_continue))), (int)n3)) >= n15) break block11;
                            n14 = R$string.com_facebook_loginview_log_in_button;
                            string3 = string2.getString(n14);
                        }
                        catch (Throwable throwable22) {
                            break block12;
                        }
                    }
                    n7 = this.i(string3);
                    break block10;
                }
                td0.a((Object)this, throwable22);
            }
            string2 = this.l;
            if (string2 == null) {
                n8 = R$string.com_facebook_loginview_log_out_button;
                string2 = object.getString(n8);
                object = "resources.getString(R.st\u2026loginview_log_out_button)";
                Intrinsics.checkNotNullExpressionValue(string2, (String)object);
            }
            n4 = this.i(string2);
            n4 = Math.max(n7, n4);
            n3 = View.resolveSize((int)n4, (int)n3);
            this.setMeasuredDimension(n3, n10);
            return;
        }
        td0.a((Object)this, throwable3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onVisibilityChanged(View object, int n3) {
        block7: {
            boolean bl2 = td0.b((Object)this);
            if (bl2) {
                return;
            }
            String string2 = "changedView";
            try {
                Intrinsics.checkNotNullParameter(object, string2);
            }
            catch (Throwable throwable) {
                td0.a((Object)this, throwable);
                return;
            }
            super.onVisibilityChanged((View)object, n3);
            if (n3 == 0) return;
            object = this.r;
            if (object == null) break block7;
            ((a)object).a();
        }
        object = null;
        this.r = null;
    }

    public final void setAuthType(String string2) {
        Intrinsics.checkNotNullParameter(string2, "value");
        LoginButton$a loginButton$a = this.m;
        loginButton$a.getClass();
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        loginButton$a.d = string2;
    }

    public final void setDefaultAudience(dk0_0 dk0_02) {
        Intrinsics.checkNotNullParameter((Object)dk0_02, "value");
        LoginButton$a loginButton$a = this.m;
        loginButton$a.getClass();
        Intrinsics.checkNotNullParameter((Object)dk0_02, "<set-?>");
        loginButton$a.a = dk0_02;
    }

    public final void setLoginBehavior(uy1 uy12) {
        Intrinsics.checkNotNullParameter((Object)uy12, "value");
        LoginButton$a loginButton$a = this.m;
        loginButton$a.getClass();
        Intrinsics.checkNotNullParameter((Object)uy12, "<set-?>");
        loginButton$a.c = uy12;
    }

    public final void setLoginManagerLazy(rq1_2 rq1_22) {
        Intrinsics.checkNotNullParameter(rq1_22, "<set-?>");
        this.t = rq1_22;
    }

    public final void setLoginTargetApp(LA1 lA1) {
        Intrinsics.checkNotNullParameter((Object)lA1, "value");
        LoginButton$a loginButton$a = this.m;
        loginButton$a.getClass();
        Intrinsics.checkNotNullParameter((Object)lA1, "<set-?>");
        loginButton$a.e = lA1;
    }

    public final void setLoginText(String string2) {
        this.k = string2;
        this.m();
    }

    public final void setLogoutText(String string2) {
        this.l = string2;
        this.m();
    }

    public final void setMessengerPageId(String string2) {
        this.m.f = string2;
    }

    public final void setPermissions(List list) {
        Intrinsics.checkNotNullParameter(list, "value");
        LoginButton$a loginButton$a = this.m;
        loginButton$a.getClass();
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        loginButton$a.b = list;
    }

    public final void setPermissions(String ... object) {
        Intrinsics.checkNotNullParameter(object, "permissions");
        int n3 = ((String[])object).length;
        object = Arrays.copyOf(object, n3);
        Intrinsics.checkNotNullParameter(object, "elements");
        object = tp_2.y(object);
        LoginButton$a loginButton$a = this.m;
        loginButton$a.getClass();
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        loginButton$a.b = object;
    }

    public final void setPublishPermissions(List list) {
        Intrinsics.checkNotNullParameter(list, "permissions");
        LoginButton$a loginButton$a = this.m;
        loginButton$a.getClass();
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        loginButton$a.b = list;
    }

    public final void setPublishPermissions(String ... object) {
        Intrinsics.checkNotNullParameter(object, "permissions");
        int n3 = ((String[])object).length;
        object = Arrays.copyOf(object, n3);
        Intrinsics.checkNotNullParameter(object, "elements");
        object = tp_2.y(object);
        LoginButton$a loginButton$a = this.m;
        loginButton$a.getClass();
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        loginButton$a.b = object;
    }

    public final void setReadPermissions(List list) {
        Intrinsics.checkNotNullParameter(list, "permissions");
        LoginButton$a loginButton$a = this.m;
        loginButton$a.getClass();
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        loginButton$a.b = list;
    }

    public final void setReadPermissions(String ... object) {
        Intrinsics.checkNotNullParameter(object, "permissions");
        int n3 = ((String[])object).length;
        object = Arrays.copyOf(object, n3);
        Intrinsics.checkNotNullParameter(object, "elements");
        object = tp_2.y(object);
        LoginButton$a loginButton$a = this.m;
        loginButton$a.getClass();
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        loginButton$a.b = object;
    }

    public final void setResetMessengerState(boolean bl2) {
        this.m.g = bl2;
    }

    public final void setToolTipDisplayTime(long l2) {
        this.q = l2;
    }

    public final void setToolTipMode(LoginButton$c loginButton$c) {
        Intrinsics.checkNotNullParameter((Object)loginButton$c, "<set-?>");
        this.p = loginButton$c;
    }

    public final void setToolTipStyle(a$b a$b) {
        Intrinsics.checkNotNullParameter((Object)a$b, "<set-?>");
        this.o = a$b;
    }
}

