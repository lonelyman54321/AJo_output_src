/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.EnhancedIntentService;
import com.google.firebase.messaging.WithinAppServiceBinder$IntentHandler;

class EnhancedIntentService$1
implements WithinAppServiceBinder$IntentHandler {
    final /* synthetic */ EnhancedIntentService this$0;

    public EnhancedIntentService$1(EnhancedIntentService enhancedIntentService) {
        this.this$0 = enhancedIntentService;
    }

    public Task handle(Intent intent) {
        return EnhancedIntentService.access$000(this.this$0, intent);
    }
}

