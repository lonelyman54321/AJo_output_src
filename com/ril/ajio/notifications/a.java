/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package com.ril.ajio.notifications;

import android.graphics.Bitmap;
import com.ril.ajio.notifications.AjioPushMessageListener;
import java.util.HashMap;

public final class a
implements rd1_2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ AjioPushMessageListener e;

    public a(AjioPushMessageListener ajioPushMessageListener, int n3, int n4, String string2, String string3) {
        this.e = ajioPushMessageListener;
        this.a = n3;
        this.b = n4;
        this.c = string2;
        this.d = string3;
    }

    public final void a() {
        Object object = this.e;
        Object object2 = object.f;
        Object object3 = this.a;
        Object object4 = 1;
        ((HashMap)object2).put(object3, object4);
        object2 = object.a;
        int n3 = this.b;
        object.d(n3, null, (String)object2);
        object2 = new StringBuilder("Notification Image Failed ");
        object3 = this.c;
        ((StringBuilder)object2).append((String)object3);
        object4 = " ";
        ((StringBuilder)object2).append((String)object4);
        String string2 = this.d;
        ((StringBuilder)object2).append(string2);
        object2 = ((StringBuilder)object2).toString();
        object = new Exception((String)object2);
        yn3_0.a((Exception)object);
        object = "ajio-imagehost.s3.amazonaws.com";
        boolean bl2 = string2.contains((CharSequence)object);
        if (bl2) {
            object2 = UX.c("Ajio AWS ", (String)object3, (String)object4, string2);
            object = new Exception((String)object2);
            yn3_0.a((Exception)object);
        }
    }

    public final void b(Bitmap object) {
        int n3 = 1;
        AjioPushMessageListener ajioPushMessageListener = this.e;
        int n4 = this.a;
        if (n4 != 0) {
            if (n4 == n3) {
                ajioPushMessageListener.h = object;
            }
        } else {
            ajioPushMessageListener.g = object;
        }
        object = ajioPushMessageListener.f;
        Integer n7 = n4;
        Object object2 = n3;
        ((HashMap)object).put(n7, object2);
        object = ajioPushMessageListener.g;
        object2 = ajioPushMessageListener.a;
        n4 = this.b;
        ajioPushMessageListener.d(n4, (Bitmap)object, (String)object2);
    }
}

