/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout$LayoutParams
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.a;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.R$layout;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/*
 * Renamed from GH
 */
public final class gh_1
extends Uk2 {
    public final ArrayList c;
    public final Context d;
    public final CTInboxMessage e;
    public final LinearLayout.LayoutParams f;
    public final WeakReference g;
    public final int h;
    public View i;

    public gh_1(Context object, CTInboxListViewFragment object2, CTInboxMessage cTInboxMessage, LinearLayout.LayoutParams layoutParams, int n3) {
        boolean bl2;
        this.d = object;
        super(object2);
        this.g = object;
        cTInboxMessage.getClass();
        super();
        object2 = cTInboxMessage.j.iterator();
        while (bl2 = object2.hasNext()) {
            String string2 = ((CTInboxMessageContent)object2.next()).g;
            ((ArrayList)object).add(string2);
        }
        this.c = object;
        this.f = layoutParams;
        this.e = cTInboxMessage;
        this.h = n3;
    }

    public final void a(ViewGroup viewGroup, int n3, Object object) {
        object = (View)object;
        viewGroup.removeView((View)object);
    }

    public final int c() {
        return this.c.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object f(int n3, ViewGroup viewGroup) {
        Object object = this.e;
        Object object2 = this.d;
        String string2 = "layout_inflater";
        object2 = (LayoutInflater)object2.getSystemService(string2);
        int n4 = R$layout.inbox_carousel_image_layout;
        object2 = object2.inflate(n4, viewGroup, false);
        this.i = object2;
        try {
            object2 = ((CTInboxMessage)object).m;
            string2 = "l";
            int n7 = ((String)object2).equalsIgnoreCase(string2);
            if (n7 != 0) {
                object = this.i;
                n7 = R$id.imageView;
                object = object.findViewById(n7);
                object = (ImageView)object;
                object2 = this.i;
                this.n((ImageView)object, (View)object2, n3, viewGroup);
                return this.i;
            }
            object = ((CTInboxMessage)object).m;
            object2 = "p";
            boolean bl2 = ((String)object).equalsIgnoreCase((String)object2);
            if (!bl2) return this.i;
            object = this.i;
            n7 = R$id.squareImageView;
            object = object.findViewById(n7);
            object = (ImageView)object;
            object2 = this.i;
            this.n((ImageView)object, (View)object2, n3, viewGroup);
            return this.i;
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            com.clevertap.android.sdk.b.c();
        }
        return this.i;
    }

    public final boolean g(View view, Object object) {
        boolean bl2;
        if (view == object) {
            bl2 = true;
        } else {
            bl2 = false;
            view = null;
        }
        return bl2;
    }

    public final void n(ImageView object, View view, int n3, ViewGroup viewGroup) {
        Object object2 = "ct_image";
        Object object3 = this.d;
        ArrayList arrayList = this.c;
        Object object4 = null;
        object.setVisibility(0);
        object4 = object.getContext();
        object4 = com.bumptech.glide.a.e((Context)object4);
        Object object5 = arrayList.get(n3);
        object5 = (String)object5;
        object4 = ((RequestManager)object4).p((String)object5);
        object5 = new fk2_0();
        int n4 = yz3_0.h(object3, (String)object2);
        object5 = ((uw_0)object5).x(n4);
        object5 = (fk2_0)object5;
        int n7 = yz3_0.h(object3, (String)object2);
        object2 = ((uw_0)object5).m(n7);
        object2 = ((rj2_0)object4).M((uw_0)object2);
        try {
            ((rj2_0)object2).Q((ImageView)object);
        }
        catch (NoSuchMethodError noSuchMethodError) {
            com.clevertap.android.sdk.b.c();
            object2 = com.bumptech.glide.a.e(object.getContext());
            object3 = (String)arrayList.get(n3);
            object2 = ((RequestManager)object2).p((String)object3);
            ((rj2_0)object2).Q((ImageView)object);
        }
        object = this.f;
        viewGroup.addView(view, (ViewGroup.LayoutParams)object);
        object = new GH$a(this, n3);
        view.setOnClickListener((View.OnClickListener)object);
    }
}

