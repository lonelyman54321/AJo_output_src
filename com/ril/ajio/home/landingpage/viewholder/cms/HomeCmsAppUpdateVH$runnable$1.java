/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
package com.ril.ajio.home.landingpage.viewholder.cms;

import android.widget.TextView;
import com.ril.ajio.home.landingpage.viewholder.cms.HomeCmsAppUpdateVH;

public final class HomeCmsAppUpdateVH$runnable$1
implements Runnable {
    public int a;
    public final /* synthetic */ HomeCmsAppUpdateVH b;

    public HomeCmsAppUpdateVH$runnable$1(HomeCmsAppUpdateVH homeCmsAppUpdateVH) {
        this.b = homeCmsAppUpdateVH;
    }

    public final void run() {
        TextView textView;
        int n3 = this.a;
        int n4 = 1;
        this.a = n3 += n4;
        int n7 = 3;
        HomeCmsAppUpdateVH homeCmsAppUpdateVH = this.b;
        if (n3 != n4) {
            n4 = 2;
            if (n3 != n4) {
                if (n3 == n7) {
                    textView = homeCmsAppUpdateVH.b;
                    String string2 = homeCmsAppUpdateVH.j;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string2);
                    stringBuilder.append("...");
                    string2 = stringBuilder.toString();
                    textView.setText((CharSequence)string2);
                }
            } else {
                textView = homeCmsAppUpdateVH.b;
                String string3 = homeCmsAppUpdateVH.j;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append("..");
                string3 = stringBuilder.toString();
                textView.setText((CharSequence)string3);
            }
        } else {
            textView = homeCmsAppUpdateVH.b;
            String string4 = homeCmsAppUpdateVH.j;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string4);
            stringBuilder.append(".");
            string4 = stringBuilder.toString();
            textView.setText((CharSequence)string4);
        }
        n3 = this.a;
        if (n3 == n7) {
            n3 = 0;
            textView = null;
            this.a = 0;
        }
        homeCmsAppUpdateVH.k.postDelayed((Runnable)this, 500L);
    }
}

