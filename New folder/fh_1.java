/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager$h;
import com.clevertap.android.sdk.R$drawable;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.inbox.CTCarouselViewPager;
import com.clevertap.android.sdk.inbox.CTInboxBaseMessageViewHolder;
import com.clevertap.android.sdk.inbox.CTInboxListViewFragment;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.clevertap.android.sdk.inbox.CTInboxMessageContent;
import java.util.ArrayList;

/*
 * Renamed from FH
 */
public final class fh_1
extends CTInboxBaseMessageViewHolder {
    public final RelativeLayout p;
    public final CTCarouselViewPager q;
    public final LinearLayout r;
    public final TextView s;
    public final TextView t;
    public final TextView u;

    public fh_1(View view) {
        super(view);
        CTCarouselViewPager cTCarouselViewPager;
        int n3 = R$id.image_carousel_viewpager;
        this.q = cTCarouselViewPager = (CTCarouselViewPager)view.findViewById(n3);
        n3 = R$id.sliderDots;
        cTCarouselViewPager = (LinearLayout)view.findViewById(n3);
        this.r = cTCarouselViewPager;
        n3 = R$id.messageTitle;
        cTCarouselViewPager = (TextView)view.findViewById(n3);
        this.s = cTCarouselViewPager;
        n3 = R$id.messageText;
        cTCarouselViewPager = (TextView)view.findViewById(n3);
        this.t = cTCarouselViewPager;
        n3 = R$id.timestamp;
        cTCarouselViewPager = (TextView)view.findViewById(n3);
        this.u = cTCarouselViewPager;
        n3 = R$id.body_linear_layout;
        view = (RelativeLayout)view.findViewById(n3);
        this.p = view;
    }

    public final void x(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int n3) {
        gh_1 gh_12;
        Object object;
        fh_1 fh_12 = this;
        CTInboxMessage cTInboxMessage2 = cTInboxMessage;
        int n4 = n3;
        super.x(cTInboxMessage, cTInboxListViewFragment, n3);
        Object object2 = object = this.m.get();
        object2 = (CTInboxListViewFragment)object;
        Context context = cTInboxListViewFragment.getActivity().getApplicationContext();
        ArrayList arrayList = cTInboxMessage.j;
        object = (CTInboxMessageContent)arrayList.get(0);
        Object object3 = this.s;
        object3.setVisibility(0);
        ImageView[] imageViewArray = this.t;
        imageViewArray.setVisibility(0);
        Object object4 = ((CTInboxMessageContent)object).k;
        object3.setText((CharSequence)object4);
        object4 = ((CTInboxMessageContent)object).l;
        int n7 = Color.parseColor((String)object4);
        object3.setTextColor(n7);
        object3 = ((CTInboxMessageContent)object).h;
        imageViewArray.setText((CharSequence)object3);
        object3 = ((CTInboxMessageContent)object).i;
        int n8 = Color.parseColor((String)object3);
        imageViewArray.setTextColor(n8);
        n8 = (int)(cTInboxMessage.k ? 1 : 0);
        imageViewArray = this.o;
        if (n8 != 0) {
            n8 = 8;
            imageViewArray.setVisibility(n8);
        } else {
            imageViewArray.setVisibility(0);
        }
        object3 = fh_12.u;
        object3.setVisibility(0);
        long l2 = cTInboxMessage2.g;
        imageViewArray = CTInboxBaseMessageViewHolder.w(l2);
        object3.setText((CharSequence)imageViewArray);
        int n10 = Color.parseColor((String)((CTInboxMessageContent)object).l);
        object3.setTextColor(n10);
        n10 = Color.parseColor((String)cTInboxMessage2.b);
        RelativeLayout relativeLayout = fh_12.p;
        relativeLayout.setBackgroundColor(n10);
        CTCarouselViewPager cTCarouselViewPager = fh_12.q;
        Object object5 = object = cTCarouselViewPager.getLayoutParams();
        object5 = (LinearLayout.LayoutParams)object;
        object = gh_12;
        object3 = context;
        imageViewArray = cTInboxListViewFragment;
        object4 = cTInboxMessage;
        gh_12 = new gh_1(context, cTInboxListViewFragment, cTInboxMessage, (LinearLayout.LayoutParams)object5, n3);
        cTCarouselViewPager.setAdapter(gh_12);
        n10 = arrayList.size();
        object3 = fh_12.r;
        int n14 = object3.getChildCount();
        if (n14 > 0) {
            object3.removeAllViews();
        }
        imageViewArray = new ImageView[n10];
        CTInboxBaseMessageViewHolder.B(imageViewArray, n10, context, (LinearLayout)object3);
        object = imageViewArray[0];
        object3 = context.getResources();
        n7 = R$drawable.ct_selected_dot;
        object5 = WK2.a;
        object3 = object3.getDrawable(n7, null);
        object.setImageDrawable((Drawable)object3);
        object3 = cTInboxListViewFragment.getActivity().getApplicationContext();
        object = new Object((Context)object3, fh_12, imageViewArray, cTInboxMessage2);
        cTCarouselViewPager.addOnPageChangeListener((ViewPager$h)object);
        object = new Object(n4, cTInboxMessage2, (CTInboxListViewFragment)object2, cTCarouselViewPager);
        relativeLayout.setOnClickListener(object);
        fh_12.A(cTInboxMessage2, n4);
    }
}

