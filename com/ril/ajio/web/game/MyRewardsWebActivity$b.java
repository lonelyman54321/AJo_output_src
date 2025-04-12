/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package com.ril.ajio.web.game;

import android.content.Context;
import android.net.Uri;
import com.ril.ajio.web.game.MyRewardsWebActivity;

public final class MyRewardsWebActivity$b
implements s13_0 {
    public final /* synthetic */ MyRewardsWebActivity a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;

    public MyRewardsWebActivity$b(MyRewardsWebActivity myRewardsWebActivity, String string2, String string3) {
        this.a = myRewardsWebActivity;
        this.b = string2;
        this.c = string3;
    }

    public final void a() {
        MyRewardsWebActivity myRewardsWebActivity = this.a;
        boolean bl2 = myRewardsWebActivity.isFinishing();
        if (!bl2) {
            CharSequence charSequence = new StringBuilder();
            String string2 = this.b;
            charSequence.append(string2);
            charSequence.append("\n");
            String string3 = this.c;
            charSequence.append(string3);
            charSequence = charSequence.toString();
            string3 = null;
            String string4 = "AJIO - Share with your friends";
            d23_0.f((Context)myRewardsWebActivity, (String)charSequence, string2, null, string4);
        }
    }

    public final void b(Uri uri) {
        Object object = yn3_0.a;
        Object object2 = new Object[]{};
        String string2 = "success image uri gamification";
        ((yn3$a)object).a(string2, (Object[])object2);
        object = this.a;
        boolean bl2 = object.isFinishing();
        if (!bl2) {
            object2 = new StringBuilder();
            string2 = this.b;
            ((StringBuilder)object2).append(string2);
            ((StringBuilder)object2).append("\n");
            String string3 = this.c;
            ((StringBuilder)object2).append(string3);
            object2 = ((StringBuilder)object2).toString();
            string3 = "AJIO - Share with your friends";
            d23_0.f((Context)object, (String)object2, string2, uri, string3);
        }
    }
}

