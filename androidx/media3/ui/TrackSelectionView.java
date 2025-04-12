/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.CheckedTextView
 *  android.widget.LinearLayout
 */
package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.media3.common.d;
import androidx.media3.ui.R$layout;
import androidx.media3.ui.R$string;
import androidx.media3.ui.TrackSelectionView$a;
import androidx.media3.ui.TrackSelectionView$b;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TrackSelectionView
extends LinearLayout {
    public final int a;
    public final LayoutInflater b;
    public final CheckedTextView c;
    public final CheckedTextView d;
    public final TrackSelectionView$a e;
    public final ArrayList f;
    public final HashMap g;
    public boolean h;
    public boolean i;
    public tp3 j;
    public CheckedTextView[][] k;
    public boolean l;

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        int n4;
        boolean bl2 = true;
        this.setOrientation((int)(bl2 ? 1 : 0));
        this.setSaveFromParentEnabled(false);
        Object object = context.getTheme();
        int[] nArray = new int[]{16843534};
        object = object.obtainStyledAttributes(nArray);
        this.a = n4 = object.getResourceId(0, 0);
        object.recycle();
        context = LayoutInflater.from((Context)context);
        this.b = context;
        super(this);
        this.e = object;
        Resources resources = this.getResources();
        Cloneable cloneable = new Cloneable(resources);
        this.j = cloneable;
        this.f = cloneable = new Cloneable();
        super();
        this.g = cloneable;
        int n7 = 17367055;
        resources = (CheckedTextView)context.inflate(n7, (ViewGroup)this, false);
        this.c = resources;
        resources.setBackgroundResource(n4);
        int n8 = R$string.exo_track_selection_none;
        resources.setText(n8);
        resources.setEnabled(false);
        resources.setFocusable(bl2);
        resources.setOnClickListener((View.OnClickListener)object);
        resources.setVisibility(8);
        this.addView((View)resources);
        int n10 = R$layout.exo_list_divider;
        resources = context.inflate(n10, (ViewGroup)this, false);
        this.addView((View)resources);
        context = (CheckedTextView)context.inflate(n7, (ViewGroup)this, false);
        this.d = context;
        context.setBackgroundResource(n4);
        n4 = R$string.exo_track_selection_auto;
        context.setText(n4);
        context.setEnabled(false);
        context.setFocusable(bl2);
        context.setOnClickListener((View.OnClickListener)object);
        this.addView((View)context);
    }

    public final void a() {
        int n3;
        CheckedTextView checkedTextView = this.c;
        boolean bl2 = this.l;
        checkedTextView.setChecked(bl2);
        int n4 = this.l;
        HashMap hashMap = this.g;
        if (n4 == 0 && (n4 = hashMap.size()) == 0) {
            n4 = 1;
        } else {
            n4 = 0;
            checkedTextView = null;
        }
        Object object = this.d;
        object.setChecked(n4 != 0);
        checkedTextView = null;
        for (n4 = 0; n4 < (n3 = ((CheckedTextView[][])(object = this.k)).length); ++n4) {
            Object object2;
            int n7;
            object = ((bq3$a)this.f.get((int)n4)).b;
            object = (Ep3)hashMap.get(object);
            for (int i3 = 0; i3 < (n7 = ((CheckedTextView[])(object2 = this.k[n4])).length); ++i3) {
                if (object != null) {
                    object2 = object2[i3].getTag();
                    object2.getClass();
                    object2 = (TrackSelectionView$b)object2;
                    CheckedTextView checkedTextView2 = this.k[n4][i3];
                    object2 = ((TrackSelectionView$b)object2).b;
                    ImmutableList immutableList = object.b;
                    boolean bl3 = immutableList.contains(object2);
                    checkedTextView2.setChecked(bl3);
                    continue;
                }
                object2 = object2[i3];
                object2.setChecked(false);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    public final void b() {
        int n3;
        int n4;
        void var1_3;
        int bl3 = this.getChildCount();
        int n7 = 1;
        int n8 = bl3 - n7;
        while (var1_3 >= (n4 = 3)) {
            this.removeViewAt((int)var1_3);
            var1_3 += -1;
        }
        ArrayList arrayList = this.f;
        n4 = (int)(arrayList.isEmpty() ? 1 : 0);
        CheckedTextView checkedTextView = this.d;
        Object object = this.c;
        if (n4 != 0) {
            object.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        object.setEnabled(n7 != 0);
        checkedTextView.setEnabled(n7 != 0);
        CheckedTextView[][] checkedTextViewArrayArray = new CheckedTextView[arrayList.size()][];
        this.k = checkedTextViewArrayArray;
        n4 = (int)(this.i ? 1 : 0);
        if (n4 != 0 && (n4 = arrayList.size()) > n7) {
            n4 = 1;
        } else {
            n4 = 0;
            checkedTextViewArrayArray = null;
        }
        checkedTextView = null;
        for (int i3 = 0; i3 < (n3 = arrayList.size()); ++i3) {
            TrackSelectionView$b trackSelectionView$b;
            int n10;
            int n14;
            object = (bq3$a)arrayList.get(i3);
            boolean bl2 = this.h;
            bl2 = bl2 && (bl2 = ((bq3$a)object).c);
            CheckedTextView[][] checkedTextViewArray = this.k;
            int n15 = ((bq3$a)object).a;
            CheckedTextView[] checkedTextViewArray2 = new CheckedTextView[n15];
            checkedTextViewArray[i3] = checkedTextViewArray2;
            checkedTextViewArray = new TrackSelectionView$b[n15];
            checkedTextViewArray2 = null;
            for (n14 = 0; n14 < (n10 = ((bq3$a)object).a); ++n14) {
                trackSelectionView$b = new TrackSelectionView$b((bq3$a)object, n14);
                checkedTextViewArray[n14] = trackSelectionView$b;
            }
            checkedTextViewArray2 = null;
            for (n14 = 0; n14 < n15; ++n14) {
                Object object2;
                int n16;
                trackSelectionView$b = this.b;
                if (n14 == 0) {
                    n16 = R$layout.exo_list_divider;
                    object2 = trackSelectionView$b.inflate(n16, (ViewGroup)this, false);
                    this.addView((View)object2);
                }
                n16 = !bl2 && n4 == 0 ? 17367055 : 0x1090010;
                trackSelectionView$b = (CheckedTextView)trackSelectionView$b.inflate(n16, (ViewGroup)this, false);
                n16 = this.a;
                trackSelectionView$b.setBackgroundResource(n16);
                object2 = this.j;
                Object object3 = checkedTextViewArray[n14];
                d[] dArray = object3.a.b.d;
                int n17 = object3.b;
                object3 = dArray[n17];
                object2 = object2.a((d)object3);
                trackSelectionView$b.setText((CharSequence)object2);
                object2 = checkedTextViewArray[n14];
                trackSelectionView$b.setTag(object2);
                n16 = (int)(((bq3$a)object).d(n14) ? 1 : 0);
                if (n16 != 0) {
                    trackSelectionView$b.setFocusable(n7 != 0);
                    object2 = this.e;
                    trackSelectionView$b.setOnClickListener((View.OnClickListener)object2);
                } else {
                    trackSelectionView$b.setFocusable(false);
                    trackSelectionView$b.setEnabled(false);
                }
                object2 = this.k[i3];
                object2[n14] = trackSelectionView$b;
                this.addView((View)trackSelectionView$b);
            }
        }
        this.a();
    }

    public boolean getIsDisabled() {
        return this.l;
    }

    public Map getOverrides() {
        return this.g;
    }

    public void setAllowAdaptiveSelections(boolean bl2) {
        boolean bl3 = this.h;
        if (bl3 != bl2) {
            this.h = bl2;
            this.b();
        }
    }

    public void setAllowMultipleOverrides(boolean n3) {
        int n4 = this.i;
        if (n4 != n3) {
            int n7;
            HashMap hashMap;
            this.i = n3;
            if (!n3 && (n4 = (hashMap = this.g).size()) > (n7 = 1)) {
                int n8;
                ArrayList arrayList = this.f;
                HashMap<qp3, Object> hashMap2 = new HashMap<qp3, Object>();
                for (int i3 = 0; i3 < (n8 = arrayList.size()); ++i3) {
                    boolean bl2;
                    Object object = ((bq3$a)arrayList.get((int)i3)).b;
                    if ((object = (Ep3)hashMap.get(object)) == null || !(bl2 = hashMap2.isEmpty())) continue;
                    qp3 qp32 = ((Ep3)object).a;
                    hashMap2.put(qp32, object);
                }
                hashMap.clear();
                hashMap.putAll(hashMap2);
            }
            this.b();
        }
    }

    public void setShowDisableOption(boolean n3) {
        n3 = n3 != 0 ? 0 : 8;
        this.c.setVisibility(n3);
    }

    public void setTrackNameProvider(tp3 tp32) {
        tp32.getClass();
        this.j = tp32;
        this.b();
    }
}

