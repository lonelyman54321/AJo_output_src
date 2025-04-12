/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.Color
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
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
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.d;
import java.util.ArrayList;

/*
 * Renamed from bI
 */
public class bi_1
extends d {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        String string2;
        object2 = new ArrayList();
        int n3 = R$layout.inapp_footer;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        this.k = layoutInflater;
        int n4 = R$id.footer_frame_layout;
        layoutInflater = (FrameLayout)layoutInflater.findViewById(n4);
        n3 = -1;
        object = new FrameLayout.LayoutParams(n3, n3);
        n4 = R$id.footer_relative_layout;
        layoutInflater = (RelativeLayout)layoutInflater.findViewById(n4);
        n4 = Color.parseColor((String)this.e.c);
        layoutInflater.setBackgroundColor(n4);
        n4 = R$id.footer_linear_layout_1;
        object = (LinearLayout)layoutInflater.findViewById(n4);
        int n7 = R$id.footer_linear_layout_2;
        Object object3 = (LinearLayout)layoutInflater.findViewById(n7);
        int n8 = R$id.footer_linear_layout_3;
        layoutInflater = (LinearLayout)layoutInflater.findViewById(n8);
        n8 = R$id.footer_button_1;
        Button button = (Button)layoutInflater.findViewById(n8);
        ((ArrayList)object2).add(button);
        int n10 = R$id.footer_button_2;
        layoutInflater = (Button)layoutInflater.findViewById(n10);
        ((ArrayList)object2).add(layoutInflater);
        n10 = R$id.footer_icon;
        object = (ImageView)object.findViewById(n10);
        Object object4 = this.e.y;
        n10 = (int)(((ArrayList)object4).isEmpty() ? 1 : 0);
        int n14 = 8;
        if (n10 == 0) {
            object4 = this.i;
            string2 = ((CTInAppNotificationMedia)this.e.y.get((int)0)).d;
            if ((object4 = ((ol0_1)object4).b(string2)) != null) {
                object.setImageBitmap((Bitmap)object4);
            } else {
                object.setVisibility(n14);
            }
        } else {
            object.setVisibility(n14);
        }
        n4 = R$id.footer_title;
        object = (TextView)object3.findViewById(n4);
        object4 = this.e.E;
        object.setText((CharSequence)object4);
        object4 = this.e.F;
        n10 = Color.parseColor((String)object4);
        object.setTextColor(n10);
        n4 = R$id.footer_message;
        object = (TextView)object3.findViewById(n4);
        object3 = this.e.z;
        object.setText((CharSequence)object3);
        object3 = this.e.A;
        n7 = Color.parseColor((String)object3);
        object.setTextColor(n7);
        object = this.e.e;
        if (object != null && (n7 = (int)(((ArrayList)object).isEmpty() ? 1 : 0)) == 0) {
            object3 = null;
            for (n7 = 0; n7 < (n10 = ((ArrayList)object).size()); ++n7) {
                n10 = 2;
                if (n7 >= n10) continue;
                object4 = (CTInAppNotificationButton)((ArrayList)object).get(n7);
                string2 = (Button)((ArrayList)object2).get(n7);
                this.Ua((Button)string2, (CTInAppNotificationButton)object4, n7);
            }
        }
        object = this.e;
        n4 = ((CTInAppNotification)object).d;
        int n15 = 1;
        if (n4 == n15) {
            layoutInflater.setVisibility(n14);
            object = new LinearLayout.LayoutParams(0, n3, 2.0f);
            button.setLayoutParams((ViewGroup.LayoutParams)object);
            n15 = 0;
            object2 = null;
            object = new LinearLayout.LayoutParams(0, n3, 0.0f);
            layoutInflater.setLayoutParams((ViewGroup.LayoutParams)object);
        }
        layoutInflater = this.k;
        object = new bI$a(this);
        layoutInflater.setOnTouchListener((View.OnTouchListener)object);
        return this.k;
    }
}

