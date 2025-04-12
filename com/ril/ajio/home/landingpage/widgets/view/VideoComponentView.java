/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Message
 *  android.text.TextUtils
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.RelativeLayout$LayoutParams
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.ril.ajio.home.landingpage.widgets.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import com.ril.ajio.analytics.handler.AnalyticsGAEventHandler;
import com.ril.ajio.services.data.Home.NewPageDetails;
import io.reactivex.Scheduler;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

public class VideoComponentView
extends FrameLayout
implements View.OnClickListener {
    public static final /* synthetic */ int h;
    public ImageView a;
    public ImageView b;
    public r82_0 c;
    public q60_0 d;
    public String e;
    public final o60_0 f;
    public final o60_0 g;

    public VideoComponentView(Context context, AttributeSet object) {
        super(context, object);
        super((Object)this, 1);
        this.f = object;
        super(this);
        this.g = object;
        this.b(context);
    }

    public VideoComponentView(Context context, AttributeSet object, int n3) {
        super(context, object, n3);
        super((Object)this, 1);
        this.f = object;
        super(this);
        this.g = object;
        this.b(context);
    }

    public static void a(VideoComponentView object, Bitmap object2) {
        boolean bl2;
        String string2;
        String string3 = ((VideoComponentView)((Object)object)).b.getTag().toString();
        int n3 = string3.equalsIgnoreCase(string2 = ((VideoComponentView)((Object)object)).e);
        if (n3 != 0) {
            string3 = ((VideoComponentView)((Object)object)).b;
            string3.setImageBitmap((Bitmap)object2);
        } else {
            object2 = ((VideoComponentView)((Object)object)).b;
            n3 = R$drawable.component_placeholder;
            object2.setImageResource(n3);
        }
        object2 = ((VideoComponentView)((Object)object)).d;
        if (object2 != null && !(bl2 = ((q60_0)object2).isDisposed())) {
            object = ((VideoComponentView)((Object)object)).d;
            object.getClass();
            gr0_2.dispose((AtomicReference)object);
        }
    }

    private void setLayoutParams(String string2) {
        String string3 = "nativeVideo320x124";
        int n3 = string3.equals(string2);
        if (n3 != 0) {
            n3 = hv3_0.F();
            float f5 = 0.3875f;
            float f6 = (float)n3 * f5;
            int n4 = (int)f6;
            ImageView imageView = this.b;
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams)imageView.getLayoutParams();
            layoutParams.height = n4;
            layoutParams.width = n3;
            imageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        }
    }

    public final void b(Context context) {
        ImageView imageView;
        context = LayoutInflater.from((Context)context);
        int n3 = R$layout.component_view_video;
        context = context.inflate(n3, (ViewGroup)this, true);
        n3 = R$id.component_view_imv_video;
        this.b = imageView = (ImageView)context.findViewById(n3);
        n3 = R$id.component_view_btn_play;
        context = (ImageView)context.findViewById(n3);
        this.a = context;
        this.b.setOnClickListener((View.OnClickListener)this);
        this.a.setOnClickListener((View.OnClickListener)this);
        this.setLayoutParams(null);
    }

    public final void onClick(View object) {
        Object object2 = this.c;
        if (object2 != null && (object2 = object.getTag()) != null) {
            object2 = this.c;
            object = object.getTag().toString();
            object2.m((String)object);
        }
    }

    public void setData(NewPageDetails object) {
        Object object2;
        if (object == null) {
            return;
        }
        Object object3 = ((NewPageDetails)object).getMobileCatAppUrl();
        this.e = object3;
        boolean bl2 = TextUtils.isEmpty((CharSequence)object3);
        if (bl2) {
            object3 = "https://player.vimeo.com/external/154692051.sd.mp4?s=6af5231576a81e3cc114d4a8a9590eec5f99e056&profile_id=112";
            this.e = object3;
        }
        if (!(bl2 = ((NewPageDetails)object).isEcommerceEventPushed())) {
            int n3;
            object3 = AnalyticsManager.getInstance().getGa();
            object2 = this.e;
            ((GoogleAnalyticsEvents)object3).trackLandingPageCustomDimension((String)object2);
            object3 = this.e;
            int n4 = ((NewPageDetails)object).getComponentPosition();
            int n7 = ((NewPageDetails)object).getBannerPosition();
            String string2 = "home landing screen";
            Message message = new Message();
            message.what = n3 = 1003;
            JSONObject jSONObject = new JSONObject();
            String string3 = "bannerImpression";
            jSONObject.put(string3, object3);
            object3 = "componentPosition";
            jSONObject.put((String)object3, n4);
            object3 = "bannerPosition";
            jSONObject.put((String)object3, n7);
            object3 = "screenName";
            jSONObject.put((String)object3, (Object)string2);
            object3 = "screenType";
            try {
                jSONObject.put((String)object3, (Object)string2);
            }
            catch (JSONException jSONException) {
                yn3_0.a((Exception)((Object)jSONException));
            }
            message.obj = jSONObject;
            object3 = AnalyticsGAEventHandler.Companion.getInstance();
            object3.sendMessage(message);
            bl2 = true;
            ((NewPageDetails)object).setEcommerceEventPushed(bl2);
        }
        object = this.b;
        object3 = this.e;
        object.setTag(object3);
        object = this.a;
        object3 = this.e;
        object.setTag(object3);
        object = this.e;
        object3 = new cb3_1(this, (String)object);
        object = new o53_0((Callable)object3);
        object3 = qt2_2.c;
        object = ((g53_0)object).h((Scheduler)object3);
        object3 = ti_2.a();
        object = ((g53_0)object).e((Scheduler)object3);
        object3 = this.f;
        object2 = this.g;
        this.d = object = ((g53_0)object).f((o60_0)object3, (o60_0)object2);
    }

    public void setOnComponentClickListener(r82_0 r82_02) {
        this.c = r82_02;
    }
}

