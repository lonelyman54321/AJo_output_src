/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 */
package com.clevertap.android.pushtemplates;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.clevertap.android.pushtemplates.PushTemplateReceiver;
import com.clevertap.android.pushtemplates.PushTemplateReceiver$b;
import java.util.concurrent.Callable;

public final class PushTemplateReceiver$a
implements Callable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ Intent b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ PushTemplateReceiver d;

    public PushTemplateReceiver$a(Context context, Intent intent, Bundle bundle, PushTemplateReceiver pushTemplateReceiver) {
        this.d = pushTemplateReceiver;
        this.a = context;
        this.b = intent;
        this.c = bundle;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object call() {
        Throwable throwable2;
        block10: {
            Bundle bundle;
            Context context;
            Intent intent;
            PushTemplateReceiver pushTemplateReceiver;
            block7: {
                block8: {
                    block9: {
                        pushTemplateReceiver = this.d;
                        try {
                            int n3 = pushTemplateReceiver.z;
                            intent = this.b;
                            context = this.a;
                            if (n3 != 0) {
                                xz3_0.c(context);
                                xz3_0.b(context, intent);
                                return null;
                            }
                            vj3_2 vj3_22 = pushTemplateReceiver.h;
                            if (vj3_22 == null) return null;
                            int[] nArray = PushTemplateReceiver$b.a;
                            n3 = vj3_22.ordinal();
                            n3 = nArray[n3];
                            int n4 = 1;
                            bundle = this.c;
                            if (n3 == n4) break block7;
                            n4 = 2;
                            if (n3 == n4) break block8;
                            n4 = 3;
                            if (n3 == n4) break block9;
                            n4 = 4;
                            if (n3 != n4) {
                                int n7 = 5;
                                if (n3 != n7) {
                                    return null;
                                }
                                PushTemplateReceiver.e(pushTemplateReceiver, context, bundle);
                                return null;
                            }
                        }
                        catch (Throwable throwable2) {
                            break block10;
                        }
                        PushTemplateReceiver.d(context, intent, bundle, pushTemplateReceiver);
                        return null;
                    }
                    PushTemplateReceiver.c(pushTemplateReceiver, context, bundle);
                    return null;
                }
                PushTemplateReceiver.b(pushTemplateReceiver, context, bundle);
                return null;
            }
            PushTemplateReceiver.a(context, intent, bundle, pushTemplateReceiver);
            return null;
        }
        throwable2.getLocalizedMessage();
        ak2_1.b();
        return null;
    }
}

