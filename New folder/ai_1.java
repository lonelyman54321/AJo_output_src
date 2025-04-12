/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.R$layout;
import com.clevertap.android.sdk.customviews.CloseImageView;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.b;
import java.util.ArrayList;

/*
 * Renamed from aI
 */
public class ai_1
extends b {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        int n3;
        object2 = new ArrayList();
        int n4 = R$layout.inapp_cover;
        layoutInflater = layoutInflater.inflate(n4, object, false);
        int n7 = R$id.inapp_cover_frame_layout;
        object = (FrameLayout)layoutInflater.findViewById(n7);
        n4 = R$id.cover_relative_layout;
        Object object3 = (RelativeLayout)object.findViewById(n4);
        int n8 = Color.parseColor((String)this.e.c);
        object3.setBackgroundColor(n8);
        n8 = R$id.cover_linear_layout;
        LinearLayout linearLayout = (LinearLayout)object3.findViewById(n8);
        int n10 = R$id.cover_button1;
        Object object4 = (Button)linearLayout.findViewById(n10);
        ((ArrayList)object2).add(object4);
        int n14 = R$id.cover_button2;
        linearLayout = (Button)linearLayout.findViewById(n14);
        ((ArrayList)object2).add(linearLayout);
        n14 = R$id.backgroundImage;
        Object object5 = (ImageView)object3.findViewById(n14);
        Object object6 = this.e;
        int n15 = this.d;
        object6 = ((CTInAppNotification)object6).c(n15);
        if (object6 != null) {
            ol0_1 ol0_12 = this.i;
            object6 = ((CTInAppNotificationMedia)object6).d;
            if ((object6 = ol0_12.b((String)object6)) != null) {
                object5.setImageBitmap((Bitmap)object6);
                object6 = 0;
                object5.setTag(object6);
            }
        }
        n14 = R$id.cover_title;
        object5 = (TextView)object3.findViewById(n14);
        object6 = this.e.E;
        object5.setText((CharSequence)object6);
        object6 = this.e.F;
        int n16 = Color.parseColor((String)object6);
        object5.setTextColor(n16);
        n14 = R$id.cover_message;
        object3 = (TextView)object3.findViewById(n14);
        object5 = this.e.z;
        object3.setText((CharSequence)object5);
        object5 = this.e.A;
        n14 = Color.parseColor((String)object5);
        object3.setTextColor(n14);
        object3 = this.e.e;
        n14 = ((ArrayList)object3).size();
        n16 = 8;
        n15 = 2;
        int n17 = 1;
        if (n14 == n17) {
            n3 = this.d;
            if (n3 == n15) {
                object4.setVisibility(n16);
            } else if (n3 == n17) {
                n3 = 4;
                object4.setVisibility(n3);
            }
            object2 = (CTInAppNotificationButton)((ArrayList)object3).get(0);
            this.cb((Button)linearLayout, (CTInAppNotificationButton)object2, 0);
        } else {
            n8 = (int)(((ArrayList)object3).isEmpty() ? 1 : 0);
            if (n8 == 0) {
                linearLayout = null;
                for (n8 = 0; n8 < (n10 = ((ArrayList)object3).size()); ++n8) {
                    if (n8 >= n15) continue;
                    object4 = (CTInAppNotificationButton)((ArrayList)object3).get(n8);
                    object5 = (Button)((ArrayList)object2).get(n8);
                    this.cb((Button)object5, (CTInAppNotificationButton)object4, n8);
                }
            }
        }
        object = (CloseImageView)object.findViewById(199272);
        object2 = new ai$a_0(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object2 = this.e;
        n3 = (int)(((CTInAppNotification)object2).n ? 1 : 0);
        if (n3 == 0) {
            object.setVisibility(n16);
        } else {
            object.setVisibility(0);
        }
        return layoutInflater;
    }
}

