/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  org.json.JSONObject
 */
package com.clevertap.android.sdk.inapp;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.b;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationMedia;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

final class InAppController$NotificationPrepareRunnable
implements Runnable {
    public final WeakReference a;
    public final JSONObject b;
    public final boolean c;
    public final /* synthetic */ InAppController d;

    public InAppController$NotificationPrepareRunnable(InAppController weakReference, InAppController inAppController, JSONObject jSONObject) {
        boolean bl2;
        this.d = weakReference;
        this.c = bl2 = qb3_2.b;
        this.a = weakReference = new WeakReference<InAppController>(inAppController);
        this.b = jSONObject;
    }

    public final void run() {
        Object object;
        Object object2 = new CTInAppNotification();
        Object object3 = this.b;
        boolean bl2 = this.c;
        ((CTInAppNotification)object2).e((JSONObject)object3, bl2);
        object3 = ((CTInAppNotification)object2).j;
        Object object4 = this.d;
        if (object3 != null) {
            object3 = ((InAppController)object4).l;
            object4 = ((InAppController)object4).c.a;
            object4 = new StringBuilder("Unable to parse inapp notification ");
            object2 = ((CTInAppNotification)object2).j;
            ((StringBuilder)object4).append((String)object2);
            object2 = ((StringBuilder)object4).toString();
            object3.getClass();
            com.clevertap.android.sdk.b.f((String)object2);
            return;
        }
        Object object5 = ((InAppController)object4).h;
        Object object6 = ((kd3_0)object5).e;
        object5 = ((kd3_0)object5).d;
        object3 = new Pair(object6, object5);
        object5 = ei_1.CTInAppTypeCustomCodeTemplate;
        object6 = ((CTInAppNotification)object2).q;
        int n3 = object5.equals(object6);
        object6 = "templateName";
        Object object7 = null;
        xj3_0 xj3_02 = ((InAppController)object4).i;
        object4 = ((InAppController)object4).m;
        if (n3 != 0) {
            int n4;
            Object object8;
            ArrayList arrayList;
            Object object9;
            object5 = ((CTInAppNotification)object2).O;
            if (object5 != null) {
                object = ((CustomTemplateInAppData)object5).a;
                object9 = "templatesManager";
                Intrinsics.checkNotNullParameter(xj3_02, (String)object9);
                arrayList = new ArrayList();
                Intrinsics.checkNotNullParameter(xj3_02, (String)object9);
                Intrinsics.checkNotNullParameter(arrayList, "filesList");
                object9 = ((CustomTemplateInAppData)object5).a;
                if (object9 != null) {
                    xj3_02.getClass();
                    Intrinsics.checkNotNullParameter(object9, (String)object6);
                    object8 = xj3_02.b;
                    object9 = (eg0)object8.get(object9);
                    if (object9 != null && (object5 = ((CustomTemplateInAppData)object5).e) != null) {
                        throw null;
                    }
                }
            } else {
                arrayList = Collections.emptyList();
                boolean bl3 = false;
                object = null;
            }
            object5 = null;
            for (n3 = 0; n3 < (n4 = arrayList.size()); ++n3) {
                int n7;
                object9 = (String)arrayList.get(n3);
                object8 = ((ol0_1)object4).e((String)object9);
                if (object8 != null && (n7 = ((byte[])object8).length) > 0) {
                    object8 = new Pair;
                    ie0_0 ie0_02 = ie0_0.FILES;
                    object8(object9, (Object)ie0_02);
                    object9 = wl0_1.g;
                    wl0$a_0.a((Pair)object8, (Pair)object3);
                    continue;
                }
                ((CTInAppNotification)object2).j = object3 = "Error processing the custom code in-app template: file download failed.";
                break;
            }
        } else {
            boolean bl4;
            object3 = ((CTInAppNotification)object2).y.iterator();
            while ((n3 = object3.hasNext()) != 0) {
                object5 = (CTInAppNotificationMedia)object3.next();
                bl4 = ((CTInAppNotificationMedia)object5).c();
                if (bl4) {
                    object5 = ((CTInAppNotificationMedia)object5).d;
                    if ((object5 = (Object)((ol0_1)object4).f((String)object5)) != null && (n3 = ((Object)object5).length) != 0) continue;
                    ((CTInAppNotification)object2).j = object3 = "Error processing GIF";
                    break;
                }
                bl4 = ((CTInAppNotificationMedia)object5).e();
                if (bl4) {
                    object5 = ((CTInAppNotificationMedia)object5).d;
                    object4.getClass();
                    Intrinsics.checkNotNullParameter(object5, "url");
                    Object object10 = ie0_0.IMAGE;
                    object = new Pair(object5, object10);
                    object5 = new pl0_2((ol0_1)object4);
                    jf1_1 jf1_12 = ((ol0_1)object4).c;
                    object10 = ql0_2.c;
                    if ((object5 = (Bitmap)((ol0_1)object4).d((Pair)object, jf1_12, (Function1)object5, (Function1)object10)) != null) continue;
                    ((CTInAppNotification)object2).j = object5 = "Error processing image as bitmap was NULL";
                    continue;
                }
                bl4 = ((CTInAppNotificationMedia)object5).f();
                if (!bl4 && (n3 = (int)(((CTInAppNotificationMedia)object5).b() ? 1 : 0)) == 0 || (n3 = (int)(((CTInAppNotification)object2).J ? 1 : 0)) != 0) continue;
                ((CTInAppNotification)object2).j = object5 = "InApp Video/Audio is not supported";
            }
            bl4 = false;
            object = null;
        }
        if ((object3 = (InAppController)this.a.get()) != null) {
            if (object != null) {
                xj3_02.getClass();
                Intrinsics.checkNotNullParameter(object, (String)object6);
                object7 = object4 = xj3_02.b.get(object);
                object7 = (eg0)object4;
            }
            InAppController.c((InAppController)object3, (CTInAppNotification)object2, object7);
        }
    }
}

