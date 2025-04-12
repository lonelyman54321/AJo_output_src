/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.R$id;
import com.clevertap.android.sdk.R$layout;

/*
 * Renamed from YH
 */
public class yh_1
extends uh_0 {
    public final ViewGroup Ua(View view) {
        int n3 = R$id.inapp_html_header_frame_layout;
        return (ViewGroup)view.findViewById(n3);
    }

    public final View Va(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int n3 = R$layout.inapp_html_header;
        return layoutInflater.inflate(n3, viewGroup, false);
    }
}

