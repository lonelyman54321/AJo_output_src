/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package com.facebook.share.widget;

import android.view.View;
import com.facebook.share.model.ShareContent;
import com.facebook.share.widget.ShareButtonBase;

public final class ShareButtonBase$a
implements View.OnClickListener {
    public final /* synthetic */ ShareButtonBase a;

    public ShareButtonBase$a(ShareButtonBase shareButtonBase) {
        this.a = shareButtonBase;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void onClick(View var1_1) {
        var2_4 /* !! */  = this.a;
        var3_5 = td0.b(this);
        if (var3_5 != 0) {
            return;
        }
        var3_5 = ShareButtonBase.m;
        {
            catch (Throwable var1_3) {
                td0.a(this, var1_3);
                return;
            }
        }
        var2_4 /* !! */ .getClass();
        var3_5 = (int)td0.b((Object)var2_4 /* !! */ );
        if (var3_5 != 0) ** GOTO lbl24
        var4_6 = var2_4 /* !! */ .c;
        if (var4_6 == null) ** GOTO lbl24
        try {
            var4_6.onClick((View)var1_1);
            ** GOTO lbl24
        }
        catch (Throwable var1_2) {
            td0.a((Object)var2_4 /* !! */ , var1_2);
lbl24:
            // 4 sources

            var1_1 = var2_4 /* !! */ .getDialog();
        }
        var2_4 /* !! */  = var2_4 /* !! */ .getShareContent();
        var1_1.d((ShareContent)var2_4 /* !! */ );
    }
}

