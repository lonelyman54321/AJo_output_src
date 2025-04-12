/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.net.Uri
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 *  android.widget.MediaController
 *  android.widget.MediaController$MediaPlayerControl
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 */
package com.ril.ajio.home.landingpage.activity;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioVideoView;
import com.ril.ajio.customviews.widgets.CustomMediaController;
import com.ril.ajio.home.landingpage.activity.CustomVideoPlayerActivity$a;

public class CustomVideoPlayerActivity
extends AppCompatActivity {
    public static final /* synthetic */ int s0;
    public RelativeLayout X;
    public AjioVideoView Y;
    public String Z = "";
    public FrameLayout k0;
    public CustomMediaController p0;
    public int q0 = 0;
    public final CustomVideoPlayerActivity$a r0;

    public CustomVideoPlayerActivity() {
        CustomVideoPlayerActivity$a customVideoPlayerActivity$a;
        this.r0 = customVideoPlayerActivity$a = new CustomVideoPlayerActivity$a(this);
    }

    public final void onBackPressed() {
        super.onBackPressed();
        int n3 = R$anim.slide_in_top;
        int n4 = R$anim.slide_out_bottom;
        this.overridePendingTransition(n3, n4);
        this.finish();
    }

    public final void onCreate(Bundle object) {
        Object object2;
        boolean bl2;
        super.onCreate((Bundle)object);
        int n3 = R$layout.fenster_video_component;
        this.setContentView(n3);
        n3 = R$id.video_view;
        object = (AjioVideoView)this.findViewById(n3);
        this.Y = object;
        n3 = R$id.video_layout;
        object = (RelativeLayout)this.findViewById(n3);
        this.X = object;
        n3 = R$id.progress_frame;
        object = (FrameLayout)this.findViewById(n3);
        this.k0 = object;
        object = this.getIntent();
        Object object3 = "VIDEO_URL";
        object = object.getStringExtra(object3);
        this.Z = object;
        if (object == null || (n3 = (int)(object.isEmpty() ? 1 : 0)) != 0) {
            object = "https://player.vimeo.com/external/154692051.sd.mp4?s=6af5231576a81e3cc114d4a8a9590eec5f99e056&profile_id=112";
            this.Z = object;
        }
        object = new CustomMediaController((Context)this);
        this.p0 = object;
        object = Uri.parse((String)this.Z);
        object3 = this.p0.getParent();
        if (object3 != null && (bl2 = (object3 = this.p0.getParent()) instanceof ViewGroup)) {
            object3 = (ViewGroup)this.p0.getParent();
            object2 = this.p0;
            object3.removeView((View)object2);
        }
        object3 = new RelativeLayout.LayoutParams(-1, -2);
        object3.addRule(12);
        object2 = this.X;
        CustomMediaController customMediaController = this.p0;
        object2.addView((View)customMediaController, (ViewGroup.LayoutParams)object3);
        this.p0.setVisibility(4);
        object3 = this.Y;
        object2 = this.p0;
        object3.setMediaController((MediaController)object2);
        object3 = this.p0;
        object2 = this.Y;
        object3.setMediaPlayer((MediaController.MediaPlayerControl)object2);
        this.Y.setVideoURI((Uri)object);
        this.Y.setOnClickListener(null);
        object = this.Y;
        object3 = new ng0_0(this);
        object.setOnPreparedListener((MediaPlayer.OnPreparedListener)object3);
        this.Y.requestFocus();
        this.Y.start();
        n3 = R$id.fvcIvClose;
        object = this.findViewById(n3);
        object3 = this.r0;
        object.setOnClickListener((View.OnClickListener)object3);
    }

    public final void onRestoreInstanceState(Bundle bundle) {
        int n3;
        super.onRestoreInstanceState(bundle);
        this.q0 = n3 = bundle.getInt("VIDEO_POS", 0);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AjioVideoView ajioVideoView = this.Y;
        if (ajioVideoView != null) {
            String string2 = "VIDEO_POS";
            int n3 = ajioVideoView.getCurrentPosition();
            bundle.putInt(string2, n3);
        }
    }
}

