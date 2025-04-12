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
 * Renamed from cI
 */
public class ci_1
extends d {
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        String string2;
        object2 = new ArrayList();
        int n3 = R$layout.inapp_header;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        this.k = layoutInflater;
        int n4 = R$id.header_frame_layout;
        layoutInflater = (FrameLayout)layoutInflater.findViewById(n4);
        n4 = R$id.header_relative_layout;
        layoutInflater = (RelativeLayout)layoutInflater.findViewById(n4);
        n4 = Color.parseColor((String)this.e.c);
        layoutInflater.setBackgroundColor(n4);
        n4 = R$id.header_linear_layout_1;
        object = (LinearLayout)layoutInflater.findViewById(n4);
        n3 = R$id.header_linear_layout_2;
        Object object3 = (LinearLayout)layoutInflater.findViewById(n3);
        int n7 = R$id.header_linear_layout_3;
        layoutInflater = (LinearLayout)layoutInflater.findViewById(n7);
        n7 = R$id.header_button_1;
        Button button = (Button)layoutInflater.findViewById(n7);
        ((ArrayList)object2).add(button);
        int n8 = R$id.header_button_2;
        layoutInflater = (Button)layoutInflater.findViewById(n8);
        ((ArrayList)object2).add(layoutInflater);
        n8 = R$id.header_icon;
        object = (ImageView)object.findViewById(n8);
        Object object4 = this.e.y;
        n8 = (int)(((ArrayList)object4).isEmpty() ? 1 : 0);
        int n10 = 8;
        if (n8 == 0) {
            object4 = this.i;
            string2 = ((CTInAppNotificationMedia)this.e.y.get((int)0)).d;
            if ((object4 = ((ol0_1)object4).b(string2)) != null) {
                object.setImageBitmap((Bitmap)object4);
            } else {
                object.setVisibility(n10);
            }
        } else {
            object.setVisibility(n10);
        }
        n4 = R$id.header_title;
        object = (TextView)object3.findViewById(n4);
        object4 = this.e.E;
        object.setText((CharSequence)object4);
        object4 = this.e.F;
        n8 = Color.parseColor((String)object4);
        object.setTextColor(n8);
        n4 = R$id.header_message;
        object = (TextView)object3.findViewById(n4);
        object3 = this.e.z;
        object.setText((CharSequence)object3);
        object3 = this.e.A;
        n3 = Color.parseColor((String)object3);
        object.setTextColor(n3);
        object = this.e.e;
        if (object != null && (n3 = (int)(((ArrayList)object).isEmpty() ? 1 : 0)) == 0) {
            object3 = null;
            for (n3 = 0; n3 < (n8 = ((ArrayList)object).size()); ++n3) {
                n8 = 2;
                if (n3 >= n8) continue;
                object4 = (CTInAppNotificationButton)((ArrayList)object).get(n3);
                string2 = (Button)((ArrayList)object2).get(n3);
                this.Ua((Button)string2, (CTInAppNotificationButton)object4, n3);
            }
        }
        object = this.e;
        n4 = ((CTInAppNotification)object).d;
        int n14 = 1;
        if (n4 == n14) {
            layoutInflater.setVisibility(n10);
            n3 = -1;
            object = new LinearLayout.LayoutParams(0, n3, 2.0f);
            button.setLayoutParams((ViewGroup.LayoutParams)object);
            n14 = 0;
            object2 = null;
            object = new LinearLayout.LayoutParams(0, n3, 0.0f);
            layoutInflater.setLayoutParams((ViewGroup.LayoutParams)object);
        }
        layoutInflater = this.k;
        object = new cI$a(this);
        layoutInflater.setOnTouchListener((View.OnTouchListener)object);
        return this.k;
    }
}

