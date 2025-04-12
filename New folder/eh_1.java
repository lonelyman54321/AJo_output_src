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
 * Renamed from EH
 */
public final class eh_1
extends CTInboxBaseMessageViewHolder {
    public final TextView p;
    public final RelativeLayout q;
    public final CTCarouselViewPager r;
    public final LinearLayout s;

    public eh_1(View view) {
        super(view);
        CTCarouselViewPager cTCarouselViewPager;
        int n3 = R$id.image_carousel_viewpager;
        this.r = cTCarouselViewPager = (CTCarouselViewPager)view.findViewById(n3);
        n3 = R$id.sliderDots;
        cTCarouselViewPager = (LinearLayout)view.findViewById(n3);
        this.s = cTCarouselViewPager;
        n3 = R$id.carousel_timestamp;
        cTCarouselViewPager = (TextView)view.findViewById(n3);
        this.p = cTCarouselViewPager;
        n3 = R$id.body_linear_layout;
        view = (RelativeLayout)view.findViewById(n3);
        this.q = view;
    }

    public final void x(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int n3) {
        gh_1 gh_12;
        Object object;
        eh_1 eh_12 = this;
        CTInboxMessage cTInboxMessage2 = cTInboxMessage;
        int n4 = n3;
        super.x(cTInboxMessage, cTInboxListViewFragment, n3);
        Object object2 = object = this.m.get();
        object2 = (CTInboxListViewFragment)object;
        Context context = cTInboxListViewFragment.getActivity().getApplicationContext();
        ArrayList arrayList = cTInboxMessage.j;
        object = (CTInboxMessageContent)arrayList.get(0);
        TextView textView = this.p;
        textView.setVisibility(0);
        int n7 = cTInboxMessage.k;
        Object object3 = this.o;
        if (n7 != 0) {
            n7 = 8;
            object3.setVisibility(n7);
        } else {
            object3.setVisibility(0);
        }
        long l2 = cTInboxMessage2.g;
        ImageView[] imageViewArray = CTInboxBaseMessageViewHolder.w(l2);
        textView.setText((CharSequence)imageViewArray);
        int n8 = Color.parseColor((String)((CTInboxMessageContent)object).l);
        textView.setTextColor(n8);
        n8 = Color.parseColor((String)cTInboxMessage2.b);
        RelativeLayout relativeLayout = eh_12.q;
        relativeLayout.setBackgroundColor(n8);
        CTCarouselViewPager cTCarouselViewPager = eh_12.r;
        Object object4 = object = cTCarouselViewPager.getLayoutParams();
        object4 = (LinearLayout.LayoutParams)object;
        object = gh_12;
        textView = context;
        imageViewArray = cTInboxListViewFragment;
        object3 = cTInboxMessage;
        gh_12 = new gh_1(context, cTInboxListViewFragment, cTInboxMessage, (LinearLayout.LayoutParams)object4, n3);
        cTCarouselViewPager.setAdapter(gh_12);
        n8 = arrayList.size();
        textView = eh_12.s;
        n7 = textView.getChildCount();
        if (n7 > 0) {
            textView.removeAllViews();
        }
        imageViewArray = new ImageView[n8];
        CTInboxBaseMessageViewHolder.B(imageViewArray, n8, context, (LinearLayout)textView);
        object = imageViewArray[0];
        textView = context.getResources();
        int n10 = R$drawable.ct_selected_dot;
        object4 = WK2.a;
        textView = textView.getDrawable(n10, null);
        object.setImageDrawable((Drawable)textView);
        textView = cTInboxListViewFragment.getActivity().getApplicationContext();
        object = new Object((Context)textView, imageViewArray);
        cTCarouselViewPager.addOnPageChangeListener((ViewPager$h)object);
        object = new Object(n4, cTInboxMessage2, (CTInboxListViewFragment)object2, cTCarouselViewPager);
        relativeLayout.setOnClickListener(object);
        eh_12.A(cTInboxMessage2, n4);
    }
}

