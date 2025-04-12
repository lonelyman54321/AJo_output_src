/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View$OnClickListener
 */
package com.facebook.share.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.FacebookButtonBase;
import com.facebook.FacebookSdk;
import com.facebook.share.model.ShareContent;
import com.facebook.share.widget.ShareButtonBase$a;
import kotlin.jvm.internal.Intrinsics;

public abstract class ShareButtonBase
extends FacebookButtonBase {
    public static final /* synthetic */ int m;
    public ShareContent j;
    public int k;
    public boolean l;

    public ShareButtonBase(Context context, AttributeSet attributeSet, int n3, String string2, String string3) {
        super(context, attributeSet, n3, string2, string3);
        context = null;
        this.k = 0;
        this.l = false;
        int n4 = this.isInEditMode();
        if (n4 != 0) {
            n4 = 0;
            attributeSet = null;
        } else {
            n4 = this.getDefaultRequestCode();
        }
        this.k = n4;
        this.setEnabled(false);
        this.l = false;
    }

    public void a(Context context, AttributeSet attributeSet, int n3, int n4) {
        super.a(context, attributeSet, n3, n4);
        context = this.getShareOnClickListener();
        this.setInternalOnClickListener((View.OnClickListener)context);
    }

    public bk_1 getCallbackManager() {
        return null;
    }

    public abstract g13_0 getDialog();

    public int getRequestCode() {
        return this.k;
    }

    public ShareContent getShareContent() {
        return this.j;
    }

    public View.OnClickListener getShareOnClickListener() {
        ShareButtonBase$a shareButtonBase$a = new ShareButtonBase$a(this);
        return shareButtonBase$a;
    }

    public void setEnabled(boolean bl2) {
        super.setEnabled(bl2);
        this.l = true;
    }

    public void setRequestCode(int n3) {
        int n4 = FacebookSdk.l;
        if (n3 >= n4 && n3 < (n4 += 100)) {
            String string2 = Gj0.b(n3, "Request code ", " cannot be within the range reserved by the Facebook SDK.");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(string2);
            throw illegalArgumentException;
        }
        this.k = n3;
    }

    public void setShareContent(ShareContent iterator) {
        block3: {
            boolean bl2;
            block4: {
                block2: {
                    boolean bl3;
                    this.j = iterator;
                    bl2 = this.l;
                    if (bl2) break block3;
                    iterator = this.getDialog();
                    ShareContent shareContent = this.getShareContent();
                    iterator.getClass();
                    Object object = qi0_0.f;
                    String string2 = "mode";
                    Intrinsics.checkNotNullParameter(object, string2);
                    object = ((qi0_0)((Object)iterator)).c;
                    if (object == null) {
                        ((qi0_0)((Object)iterator)).c = object = ((g13_0)((Object)iterator)).c();
                    }
                    iterator = ((qi0_0)((Object)iterator)).c;
                    object = "null cannot be cast to non-null type kotlin.collections.List<com.facebook.internal.FacebookDialogBase.ModeHandler<CONTENT of com.facebook.internal.FacebookDialogBase, RESULT of com.facebook.internal.FacebookDialogBase>>";
                    Intrinsics.checkNotNull(iterator, (String)object);
                    iterator = iterator.iterator();
                    do {
                        bl3 = iterator.hasNext();
                        string2 = null;
                        if (!bl3) break block2;
                    } while (!(bl3 = ((qI0$a)(object = (qI0$a)iterator.next())).a(shareContent, false)));
                    bl2 = true;
                    break block4;
                }
                bl2 = false;
                iterator = null;
            }
            this.setEnabled(bl2);
            this.l = false;
        }
    }
}

