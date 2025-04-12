/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnClickListener
 *  android.graphics.drawable.Drawable
 *  android.os.Message
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.ViewStub
 *  android.view.Window
 *  android.widget.Button
 *  android.widget.ImageView
 *  android.widget.ListAdapter
 *  android.widget.TextView
 */
package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$styleable;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.app.AlertController$a;
import androidx.appcompat.app.AlertController$c;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public final class AlertController {
    public NestedScrollView A;
    public int B = 0;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public int I = -1;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;
    public final AlertController$c P;
    public final AlertController$a Q;
    public final Context a;
    public final on b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public AlertController$RecycleListView g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public boolean n = false;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;

    public AlertController(Context context, on on3, Window object) {
        WeakReference<on> weakReference = new WeakReference<on>(this);
        this.Q = weakReference;
        this.a = context;
        this.b = on3;
        this.c = object;
        object.a = weakReference = new WeakReference<on>(on3);
        this.P = object;
        object = R$styleable.AlertDialog;
        int n3 = R$attr.alertDialogStyle;
        context = context.obtainStyledAttributes(null, (int[])object, n3, 0);
        int n4 = R$styleable.AlertDialog_android_layout;
        this.J = n4 = context.getResourceId(n4, 0);
        n4 = R$styleable.AlertDialog_buttonPanelSideLayout;
        context.getResourceId(n4, 0);
        n4 = R$styleable.AlertDialog_listLayout;
        this.K = n4 = context.getResourceId(n4, 0);
        n4 = R$styleable.AlertDialog_multiChoiceItemLayout;
        this.L = n4 = context.getResourceId(n4, 0);
        n4 = R$styleable.AlertDialog_singleChoiceItemLayout;
        this.M = n4 = context.getResourceId(n4, 0);
        n4 = R$styleable.AlertDialog_listItemLayout;
        this.N = n4 = context.getResourceId(n4, 0);
        n4 = R$styleable.AlertDialog_showTitle;
        n3 = 1;
        n4 = (int)(context.getBoolean(n4, n3 != 0) ? 1 : 0);
        this.O = n4;
        n4 = R$styleable.AlertDialog_buttonIconDimen;
        this.d = n4 = context.getDimensionPixelSize(n4, 0);
        context.recycle();
        on3.supportRequestWindowFeature(n3);
    }

    public static boolean a(View view) {
        int n3 = view.onCheckIsTextEditor();
        boolean bl2 = true;
        if (n3 != 0) {
            return bl2;
        }
        n3 = view instanceof ViewGroup;
        if (n3 == 0) {
            return false;
        }
        view = (ViewGroup)view;
        n3 = view.getChildCount();
        while (n3 > 0) {
            View view2 = view.getChildAt(n3 += -1);
            boolean bl3 = AlertController.a(view2);
            if (!bl3) continue;
            return bl2;
        }
        return false;
    }

    public static void b(View view, View view2, View view3) {
        int n3 = 4;
        if (view2 != null) {
            int n4 = view.canScrollVertically(-1);
            n4 = n4 != 0 ? 0 : 4;
            view2.setVisibility(n4);
        }
        if (view3 != null) {
            int n7 = 1;
            boolean bl2 = view.canScrollVertically(n7);
            if (bl2) {
                n3 = 0;
            }
            view3.setVisibility(n3);
        }
    }

    public static ViewGroup c(View view, View view2) {
        boolean bl2;
        ViewParent viewParent;
        boolean bl3;
        if (view == null) {
            boolean bl4 = view2 instanceof ViewStub;
            if (bl4) {
                view2 = ((ViewStub)view2).inflate();
            }
            return (ViewGroup)view2;
        }
        if (view2 != null && (bl3 = (viewParent = view2.getParent()) instanceof ViewGroup)) {
            viewParent = (ViewGroup)viewParent;
            viewParent.removeView(view2);
        }
        if (bl2 = view instanceof ViewStub) {
            view = ((ViewStub)view).inflate();
        }
        return (ViewGroup)view;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d(int n3, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable2) {
        if (onClickListener != null) {
            AlertController$c alertController$c = this.P;
            onClickListener = alertController$c.obtainMessage(n3, onClickListener);
        } else {
            onClickListener = null;
        }
        int n4 = -3;
        if (n3 == n4) {
            this.x = charSequence;
            this.y = onClickListener;
            this.z = drawable2;
            return;
        }
        n4 = -2;
        if (n3 == n4) {
            this.t = charSequence;
            this.u = onClickListener;
            this.v = drawable2;
            return;
        }
        n4 = -1;
        if (n3 == n4) {
            this.p = charSequence;
            this.q = onClickListener;
            this.r = drawable2;
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Button does not exist");
        throw illegalArgumentException;
    }
}

